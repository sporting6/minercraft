package com.dargonboi.krasyrum.block.entity.custom;


import com.dargonboi.krasyrum.block.entity.ModBlockEntities;
import com.dargonboi.krasyrum.item.ModIngots;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
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

public class StrainerBlock extends BaseEntityBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public static final BooleanProperty IS_USED = BooleanProperty.create("is_used");


    private static final Map<Direction, VoxelShape> SHAPES = new EnumMap<>(Direction.class);

    public static final VoxelShape SHAPE = Stream.of(
            Block.box(4, 0, 4, 12, 8, 5),
            Block.box(4, 0, 11, 12, 8, 12),
            Block.box(4, 0, 5, 5, 8, 11),
            Block.box(11, 0, 5, 12, 8, 11),
            Block.box(5, 0, 5, 11, 1, 11),
            Block.box(12, 0, 12, 14, 12, 14),
            Block.box(2, 0, 12, 4, 12, 14),
            Block.box(2, 0, 2, 4, 12, 4),
            Block.box(12, 0, 2, 14, 12, 4),
            Block.box(2, 10, 4, 4, 12, 12),
            Block.box(12, 10, 4, 14, 12, 12),
            Block.box(4, 10, 12, 12, 12, 14),
            Block.box(4, 10, 2, 12, 12, 4),
            Block.box(5, 11, 4, 6, 11, 12),
            Block.box(7, 11, 4, 8, 11, 12),
            Block.box(9, 11, 4, 10, 11, 12),
            Block.box(11, 11, 4, 12, 11, 12),
            Block.box(4, 11, 10, 12, 11, 11),
            Block.box(4, 11, 8, 12, 11, 9),
            Block.box(4, 11, 6, 12, 11, 7),
            Block.box(4, 11, 4, 12, 11, 5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public StrainerBlock(Properties properties) {
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
            if(entity instanceof StrainerBlockEntity) {
                NetworkHooks.openGui(((ServerPlayer)pPlayer), (StrainerBlockEntity)entity, pPos);
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
            if (blockEntity instanceof StrainerBlockEntity) {
                ((StrainerBlockEntity) blockEntity).drops();
            }
        }
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }


    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new StrainerBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, ModBlockEntities.STRAINER_BLOCK_ENTITY.get(),
                StrainerBlockEntity::tick);
    }

}
