package com.dargonboi.krasyrum.block;

import com.dargonboi.krasyrum.Krasyrum;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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


public class FungusBlock extends HorizontalDirectionalBlock {

    protected FungusBlock(Properties pProperties) {
        super(pProperties);
    }


    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if(player.getMainHandItem() != ItemStack.EMPTY){
            return InteractionResult.PASS;
        }

        level.destroyBlock(pos, false);

        player.getInventory().add(new ItemStack(Krasyrum.BLOCKMAP.get("dark_fungus").get(), 1));
        return InteractionResult.SUCCESS;
    }


    private static final VoxelShape SHAPE_N = Shapes.join(Block.box(9, 6, 6, 14, 7, 11), Block.box(11, 0, 8, 12, 6, 9), BooleanOp.OR);
    private static final VoxelShape SHAPE_W = Shapes.join(Block.box(8, 0, 5, 9, 6, 5), Block.box(6, 6, 2, 11, 7, 7), BooleanOp.OR);
    private static final VoxelShape SHAPE_E = Shapes.join(Block.box(5, 6, 9, 10, 7, 14), Block.box(7, 0, 11, 8, 6, 12), BooleanOp.OR);
    private static final VoxelShape SHAPE_S = Shapes.join(Block.box(2, 6, 5, 7, 7, 10), Block.box(4, 0, 7, 5, 6, 8),BooleanOp.OR);

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
