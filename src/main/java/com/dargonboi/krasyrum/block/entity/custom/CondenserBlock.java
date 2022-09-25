package com.dargonboi.krasyrum.block.entity.custom;


import com.dargonboi.krasyrum.block.entity.ModBlockEntities;
import com.dargonboi.krasyrum.block.entity.custom.CondenserBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.Nullable;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Stream;

public class CondenserBlock extends BaseEntityBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty IS_USED = BooleanProperty.create("is_used");
    private static final Map<Direction, VoxelShape> SHAPES = new EnumMap<>(Direction.class);

    public static final VoxelShape SHAPE = Stream.of(Block.box(0, 0, 0, 16, 1, 16), Block.box(3, 1, 3, 13, 2, 13), Block.box(2, 2, 2, 14, 3, 14), Block.box(3, 3, 3, 13, 4, 13), Block.box(2, 4, 2, 14, 5, 14), Block.box(2, 8, 2, 14, 9, 14), Block.box(3, 7, 3, 13, 8, 13), Block.box(2, 6, 2, 14, 7, 14), Block.box(3, 5, 3, 13, 6, 13), Block.box(3, 9, 3, 13, 10, 13), Block.box(2, 10, 2, 14, 11, 14), Block.box(3, 11, 3, 13, 12, 13), Block.box(2, 12, 2, 14, 13, 14), Block.box(3, 13, 3, 13, 14, 13), Block.box(2, 14, 2, 14, 15, 14), Block.box(2, 15, 2, 4, 17, 14), Block.box(12, 15, 2, 14, 17, 14), Block.box(4, 15, 12, 12, 17, 14), Block.box(4, 15, 11, 11, 16, 12), Block.box(4, 15, 4, 5, 16, 11),Block.box(5, 15, 4, 12, 16, 5), Block.box(11, 15, 5, 12, 16, 12), Block.box(4, 15, 2, 12, 17, 4)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public CondenserBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState().setValue(FACING, Direction.NORTH).setValue(IS_USED, false));
        runCalculation(SHAPE);
    }


    @Override
    public VoxelShape getShape(BlockState State, BlockGetter Level, BlockPos Pos, CollisionContext Context) {
        return SHAPES.get(State.getValue(FACING));
    }

    /* FACING */

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }
    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }
    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING, IS_USED);
    }
    public static VoxelShape calculateShapes(Direction to, VoxelShape shape){
        final VoxelShape[] buffer = {shape, Shapes.empty()};

        final int times = (to.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4) % 4;
        for (int i = 0; i < times; i++) {
            buffer[0].forAllBoxes((minX, minY, minZ, maxX, maxY,
                                   maxZ) -> buffer[1] = Shapes.or(buffer[1], Shapes.create(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
            buffer[0] = buffer[1];
            buffer[1] = Shapes.empty();
        }

        return buffer[0];
    }

    /* BLOCK ENTITY */

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }


    protected void runCalculation(VoxelShape shape) {
        for (final Direction direction : Direction.values()) {
            SHAPES.put(direction, calculateShapes(direction, shape));
        }
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pLevel.isClientSide()) {
            BlockEntity entity = pLevel.getBlockEntity(pPos);
            if(entity instanceof CondenserBlockEntity) {
                NetworkHooks.openGui(((ServerPlayer)pPlayer), (CondenserBlockEntity)entity, pPos);
            } else {
                throw new IllegalStateException("Our Container provider is missing!");
            }
        }

        return InteractionResult.sidedSuccess(pLevel.isClientSide());
    }
    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (pState.getBlock() != pNewState.getBlock()) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if (blockEntity instanceof CondenserBlockEntity) {
                ((CondenserBlockEntity) blockEntity).drops();
            }
        }
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }


    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CondenserBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, ModBlockEntities.CONDENSER_BLOCK_ENTITY.get(),
                CondenserBlockEntity::tick);
    }

}
