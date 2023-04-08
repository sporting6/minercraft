package com.dargonboi.krasyrum.block;

import com.dargonboi.krasyrum.Krasyrum;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class FungusGroupBlock extends HorizontalDirectionalBlock {

    protected FungusGroupBlock(Properties pProperties) {
        super(pProperties);
    }


    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if(player.getMainHandItem() != ItemStack.EMPTY){
            return InteractionResult.PASS;
        }

        level.setBlock(pos, Blocks.AIR.defaultBlockState(), 2);
        RandomSource randomSource = RandomSource.create();

        player.getInventory().add(new ItemStack(Krasyrum.BLOCKMAP.get("dark_fungus").get(), randomSource.nextInt(3)+1));
        return InteractionResult.SUCCESS;
    }


    private static final VoxelShape SHAPE_N =
            Stream.of(
                    Block.box(9, 6, 3, 12, 7, 6),
                    Block.box(10, 0, 4, 11, 5, 5),
                    Block.box(8, 5, 2, 13, 6, 7),
                    Block.box(3, 8, 6, 9, 9, 14),
                    Block.box(3, 9, 7, 9, 10, 13),
                    Block.box(9, 8, 7, 10, 9, 13),
                    Block.box(4, 0, 9, 5, 2, 10),
                    Block.box(5, 0, 8, 6, 1, 9),
                    Block.box(4, 10, 10, 6, 11, 12),
                    Block.box(6, 10, 11, 7, 11, 12),
                    Block.box(6, 10, 11, 7, 11, 12),
                    Block.box(7, 0, 11, 8, 1, 12),
                    Block.box(4, 6, 13, 5, 7, 14),
                    Block.box(5, 6, 6, 6, 7, 7),
                    Block.box(3, 7, 6, 9, 8, 7),
                    Block.box(3, 7, 13, 7, 8, 14),
                    Block.box(8, 7, 13, 9, 8, 14),
                    Block.box(2, 7, 7, 3, 8, 10),
                    Block.box(2, 7, 11, 3, 8, 13),
                    Block.box(9, 7, 11, 10, 8, 13),
                    Block.box(9, 7, 8, 10, 8, 10),
                    Block.box(2, 8, 7, 3, 9, 13),
                    Block.box(5, 0, 9, 7, 8, 11)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.box(10, 6, 9, 13, 7, 12),
            Block.box(11, 0, 10, 12, 5, 11),
            Block.box(9, 5, 8, 14, 6, 13),
            Block.box(2, 8, 3, 10, 9, 9),
            Block.box(3, 9, 3, 9, 10, 9),
            Block.box(3, 8, 9, 9, 9, 10),
            Block.box(6, 0, 4, 7, 2, 5),
            Block.box(7, 0, 5, 8, 1, 6),
            Block.box(4, 10, 4, 6, 11, 6),
            Block.box(4, 10, 6, 5, 11, 7),
            Block.box(4, 10, 6, 5, 11, 7),
            Block.box(4, 0, 7, 5, 1, 8),
            Block.box(2, 6, 4, 3, 7, 5),
            Block.box(9, 6, 5, 10, 7, 6),
            Block.box(9, 7, 3, 10, 8, 9),
            Block.box(2, 7, 3, 3, 8, 7),
            Block.box(2, 7, 8, 3, 8, 9),
            Block.box(6, 7, 2, 9, 8, 3),
            Block.box(3, 7, 2, 5, 8, 3),
            Block.box(3, 7, 9, 5, 8, 10),
            Block.box(6, 7, 9, 8, 8, 10),
            Block.box(3, 8, 2, 9, 9, 3),
            Block.box(5, 0, 5, 7, 8, 7)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
                    Block.box(4, 6, 10, 7, 7, 13),
                    Block.box(5, 0, 11, 6, 5, 12),
                    Block.box(3, 5, 9, 8, 6, 14),
                    Block.box(7, 8, 2, 13, 9, 10),
                    Block.box(7, 9, 3, 13, 10, 9),
                    Block.box(6, 8, 3, 7, 9, 9),
                    Block.box(11, 0, 6, 12, 2, 7),
                    Block.box(10, 0, 7, 11, 1, 8),
                    Block.box(10, 10, 4, 12, 11, 6),
                    Block.box(9, 10, 4, 10, 11, 5),
                    Block.box(9, 10, 4, 10, 11, 5),
                    Block.box(8, 0, 4, 9, 1, 5),
                    Block.box(11, 6, 2, 12, 7, 3),
                    Block.box(10, 6, 9, 11, 7, 10),
                    Block.box(7, 7, 9, 13, 8, 10),
                    Block.box(9, 7, 2, 13, 8, 3),
                    Block.box(7, 7, 2, 8, 8, 3),
                    Block.box(13, 7, 6, 14, 8, 9),
                    Block.box(13, 7, 3, 14, 8, 5),
                    Block.box(6, 7, 3, 7, 8, 5),
                    Block.box(6, 7, 6, 7, 8, 8),
                    Block.box(13, 8, 3, 14, 9, 9),
                    Block.box(9, 0, 5, 11, 8, 7)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
                    Block.box(3, 6, 4, 6, 7, 7),
                    Block.box(4, 0, 5, 5, 5, 6),
                    Block.box(2, 5, 3, 7, 6, 8),
                    Block.box(6, 8, 7, 14, 9, 13),
                    Block.box(7, 9, 7, 13, 10, 13),
                    Block.box(7, 8, 6, 13, 9, 7),
                    Block.box(9, 0, 11, 10, 2, 12),
                    Block.box(8, 0, 10, 9, 1, 11),
                    Block.box(10, 10, 10, 12, 11, 12),
                    Block.box(11, 10, 9, 12, 11, 10),
                    Block.box(11, 10, 9, 12, 11, 10),
                    Block.box(11, 0, 8, 12, 1, 9),
                    Block.box(13, 6, 11, 14, 7, 12),
                    Block.box(6, 6, 10, 7, 7, 11),
                    Block.box(6, 7, 7, 7, 8, 13),
                    Block.box(13, 7, 9, 14, 8, 13),
                    Block.box(13, 7, 7, 14, 8, 8),
                    Block.box(7, 7, 13, 10, 8, 14),
                    Block.box(11, 7, 13, 13, 8, 14),
                    Block.box(11, 7, 6, 13, 8, 7),
                    Block.box(8, 7, 6, 10, 8, 7),
                    Block.box(7, 8, 13, 13, 9, 14),
                    Block.box(9, 0, 9, 11, 8, 11)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        Direction direction = state.getValue(FACING);
        switch (direction) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_E;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
