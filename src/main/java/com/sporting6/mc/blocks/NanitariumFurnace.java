package com.sporting6.mc.blocks;

import java.util.stream.Stream;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class NanitariumFurnace extends Block {
	
	private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	
	private static final VoxelShape SHAPE_N = 
			Stream.of(
			Block.makeCuboidShape(2, 0, 2, 3, 1, 3),
			Block.makeCuboidShape(3, 0, 2, 4, 3, 3),
			Block.makeCuboidShape(13, 0, 11, 14, 1, 12),
			Block.makeCuboidShape(12, 0, 11, 13, 3, 12),
			Block.makeCuboidShape(2, 0, 11, 3, 1, 12),
			Block.makeCuboidShape(3, 0, 11, 4, 3, 12),
			Block.makeCuboidShape(13, 0, 2, 14, 1, 3),
			Block.makeCuboidShape(12, 0, 2, 13, 3, 3),
			Block.makeCuboidShape(3, 3, 2, 13, 10, 12),
			Block.makeCuboidShape(2, 10, 1, 14, 11, 13),
			Block.makeCuboidShape(3, 11, 2, 13, 12, 12),
			Block.makeCuboidShape(7, 11, 11, 9, 15, 14)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	private static final VoxelShape SHAPE_S = 
			Stream.of(
			Block.makeCuboidShape(2, 0, 13, 3, 1, 14),
			Block.makeCuboidShape(3, 0, 13, 4, 3, 14),
			Block.makeCuboidShape(13, 0, 4, 14, 1, 5),
			Block.makeCuboidShape(12, 0, 4, 13, 3, 5),
			Block.makeCuboidShape(2, 0, 4, 3, 1, 5),
			Block.makeCuboidShape(3, 0, 4, 4, 3, 5),
			Block.makeCuboidShape(13, 0, 13, 14, 1, 14),
			Block.makeCuboidShape(12, 0, 13, 13, 3, 14),
			Block.makeCuboidShape(3, 3, 4, 13, 10, 14),
			Block.makeCuboidShape(2, 10, 3, 14, 11, 15),
			Block.makeCuboidShape(3, 11, 4, 13, 12, 14),
			Block.makeCuboidShape(7, 11, 2, 9, 15, 5)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	private static final VoxelShape SHAPE_W = 
			Stream.of(
			Block.makeCuboidShape(2, 0, 2, 3, 1, 3),
			Block.makeCuboidShape(2, 0, 3, 3, 3, 4),
			Block.makeCuboidShape(11, 0, 13, 12, 1, 14),
			Block.makeCuboidShape(11, 0, 12, 12, 3, 13),
			Block.makeCuboidShape(11, 0, 2, 12, 1, 3),
			Block.makeCuboidShape(11, 0, 3, 12, 3, 4),
			Block.makeCuboidShape(2, 0, 13, 3, 1, 14),
			Block.makeCuboidShape(2, 0, 12, 3, 3, 13),
			Block.makeCuboidShape(2, 3, 3, 12, 10, 13),
			Block.makeCuboidShape(1, 10, 2, 13, 11, 14),
			Block.makeCuboidShape(2, 11, 3, 12, 12, 13),
			Block.makeCuboidShape(11, 11, 7, 14, 15, 9)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	private static final VoxelShape SHAPE_E = 
			Stream.of(
			Block.makeCuboidShape(13, 0, 2, 14, 1, 3),
			Block.makeCuboidShape(13, 0, 3, 14, 3, 4),
			Block.makeCuboidShape(4, 0, 13, 5, 1, 14),
			Block.makeCuboidShape(4, 0, 12, 5, 3, 13),
			Block.makeCuboidShape(4, 0, 2, 5, 1, 3),
			Block.makeCuboidShape(4, 0, 3, 5, 3, 4),
			Block.makeCuboidShape(13, 0, 13, 14, 1, 14),
			Block.makeCuboidShape(13, 0, 12, 14, 3, 13),
			Block.makeCuboidShape(4, 3, 3, 14, 10, 13),
			Block.makeCuboidShape(3, 10, 2, 15, 11, 14),
			Block.makeCuboidShape(4, 11, 3, 14, 12, 13),
			Block.makeCuboidShape(2, 11, 7, 5, 15, 9)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	
	public NanitariumFurnace() {
		super(AbstractBlock.Properties.create(Material.ANVIL)
				.hardnessAndResistance(4.0f,15.0f)
				.sound(SoundType.ANVIL)
				.harvestLevel(2)
				.harvestTool(ToolType.PICKAXE)
				.setRequiresTool());
				
	}
	
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
	}
	
	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.with(FACING, rot.rotate(state.get(FACING)));
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public BlockState mirror(BlockState state, Mirror mirriorIn) {
		return state.rotate(mirriorIn.toRotation(state.get(FACING)));
	}
	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext conext) {
		switch (state.get(FACING)){
			case NORTH:
				return SHAPE_N;
			case SOUTH:
				return SHAPE_S;
			case WEST:
				return SHAPE_W;
			case EAST:
				return SHAPE_E;
			default:
				return SHAPE_N;
		}
	}
	
	@Override
	public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 0.6f;
	}
}
