package com.dargonboi.krasyrum.block.entity.custom;


import com.dargonboi.krasyrum.block.entity.ModBlockEntities;
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

public class ForgeBlock extends BaseEntityBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public static final BooleanProperty IS_USED = BooleanProperty.create("is_used");


    private static final Map<Direction, VoxelShape> SHAPES = new EnumMap<>(Direction.class);

    public static final VoxelShape SHAPE = Stream.of(
            Block.box(5, 0, -2, 14, 8, 0),
            Block.box(5, 8, 15, 14, 12, 17),
            Block.box(5, 12, 0, 14, 14, 2),
            Block.box(5, 12, 14, 14, 14, 16),
            Block.box(5, 14, 1, 14, 16, 4),
            Block.box(5, 16, 11, 14, 18, 13),
            Block.box(5, 17, 5, 14, 19, 11),
            Block.box(4, 18, 6, 8, 19, 10),
            Block.box(4, 16, 7, 8, 18, 9),
            Block.box(5, 16, 3, 14, 18, 5),
            Block.box(5, 14, 12, 14, 16, 15),
            Block.box(5, 8, -1, 14, 12, 1),
            Block.box(5, 0, 16, 14, 8, 18),
            Block.box(1, 1, 10, 3, 5, 12),
            Block.box(2, 0, 12, 4, 5, 14),
            Block.box(3, 0, 14, 5, 5, 16),
            Block.box(0, 2, 8, 2, 5, 10),
            Block.box(0, 2, 6, 2, 5, 8),
            Block.box(1, 1, 4, 3, 5, 6),
            Block.box(2, 0, 2, 4, 5, 4),
            Block.box(3, 0, 0, 5, 5, 2),
            Block.box(4, 0, 2, 11, 3, 4),
            Block.box(4, 0, 4, 11, 3, 6),
            Block.box(4, 0, 6, 11, 3, 8),
            Block.box(4, 0, 8, 11, 3, 10),
            Block.box(4, 0, 10, 11, 3, 12),
            Block.box(4, 0, 12, 11, 3, 14),
            Block.box(5, 0, 0, 9, 3, 2),
            Block.box(5, 0, 14, 9, 3, 16),
            Block.box(6, 0, 17, 14, 19, 20),
            Block.box(14, 0, 16, 17, 19, 20),
            Block.box(6, 12, -1, 8, 19, 0),
            Block.box(6, 14, 0, 8, 19, 1),
            Block.box(15, 9, 1, 17, 19, 15),
            Block.box(15, 7, 0, 17, 19, 1),
            Block.box(15, 7, 15, 17, 19, 16),
            Block.box(14, 0, -4, 17, 19, 0),
            Block.box(6, 0, -4, 14, 19, -1),
            Block.box(15, 7, 15, 17, 19, 16),
            Block.box(6, 16, 1, 8, 19, 5),
            Block.box(6, 14, 15, 8, 19, 16),
            Block.box(6, 12, 16, 8, 19, 17),
            Block.box(6, 16, 11, 8, 19, 15),
            Block.box(4, 19, -6, 19, 22, 22),
            Block.box(6, 22, -4, 17, 24, 20),
            Block.box(7, 24, -3, 16, 26, 19),
            Block.box(8, 26, 2, 15, 29, 14),
            Block.box(8, 29, 3, 15, 32, 13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public ForgeBlock(Properties properties) {
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
            if(entity instanceof ForgeBlockEntity) {
                NetworkHooks.openGui(((ServerPlayer)pPlayer), (ForgeBlockEntity)entity, pPos);
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
            if (blockEntity instanceof ForgeBlockEntity) {
                ((ForgeBlockEntity) blockEntity).drops();
            }
        }
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }


    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ForgeBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, ModBlockEntities.FORGE_BLOCK_ENTITY.get(),
                ForgeBlockEntity::tick);
    }

}
