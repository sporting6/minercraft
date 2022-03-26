package com.dargonboi.mrc.common.block;

import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.common.block.entity.PoweredChestBlockEntity;
import com.dargonboi.mrc.common.container.PoweredChestContainer;
import com.dargonboi.mrc.core.init.ModTileEntitys;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;

public class PoweredChestBlock extends HorizontalDirectionalBlock implements EntityBlock {

	private static final Map<Direction, VoxelShape> SHAPES = new EnumMap<>(Direction.class);

	public PoweredChestBlock(Properties properties) {
		super(properties);
		registerDefaultState(defaultBlockState().setValue(FACING, Direction.NORTH));
		runCalculation(SHAPE.orElse(Shapes.block()));
	}

	private static final Optional<VoxelShape> SHAPE = Stream
			.of(Block.box(1, 10, 1, 15, 14, 15), Block.box(7, 8, 0, 9, 12, 1),
					Block.box(0.999999999999997, 0, 1, 15, 10, 15))
			.reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR));

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		return SHAPES.get(state.getValue(FACING));
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return ModTileEntitys.POWERED_CHEST.get().create(pos, state);
	}

	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand,
			BlockHitResult result) {
		if (!level.isClientSide && level.getBlockEntity(pos) instanceof final PoweredChestBlockEntity chest) {
			MenuProvider pageOne = new SimpleMenuProvider(PoweredChestContainer.getServerContainer(chest, pos),
					PoweredChestBlockEntity.TITLE);
			NetworkHooks.openGui((ServerPlayer) player, pageOne, pos);
		}

		return InteractionResult.SUCCESS;
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	protected void runCalculation(VoxelShape shape) {
		for (Direction direction : Direction.values())
			SHAPES.put(direction, MinerCraft.calculateShapes(direction, shape));
	}

}