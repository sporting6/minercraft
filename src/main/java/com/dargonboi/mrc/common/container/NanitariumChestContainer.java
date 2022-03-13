package com.dargonboi.mrc.common.container;

import com.dargonboi.mrc.common.block.entity.NanitariumChestBlockEntity;
import com.dargonboi.mrc.core.init.ModBlocks;
import com.dargonboi.mrc.core.init.ModContainers;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuConstructor;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;

public class NanitariumChestContainer extends AbstractContainerMenu {

	private final ContainerLevelAccess containerAccess;

	// Client Constructor
	public NanitariumChestContainer(int id, Inventory playerInv) {
		this(id, playerInv, new ItemStackHandler(104), BlockPos.ZERO);
	}

	// Server Constructor
	public NanitariumChestContainer(int id, Inventory playerInv, IItemHandler slots, BlockPos pos) {
		super(ModContainers.NANITARIUM_CHEST.get(), id);
		this.containerAccess = ContainerLevelAccess.create(playerInv.player.level, pos);

		final int slotSizePlus2 = 18, startX = 8, startY = 176, hotbarY = 234, inventoryY = 18, invStartX = 43;

		for (int row = 0; row < 8; row++) {
			for (int column = 0; column < 13; column++) {
				addSlot(new SlotItemHandler(slots, row * 13 + column, startX + column * slotSizePlus2,
						inventoryY + row * slotSizePlus2));
			}
		}

		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 9; column++) {
				addSlot(new Slot(playerInv, 9 + row * 9 + column, invStartX + column * slotSizePlus2,
						startY + row * slotSizePlus2));
			}
		}

		for (int column = 0; column < 9; column++) {
			addSlot(new Slot(playerInv, column, invStartX + column * slotSizePlus2, hotbarY));
		}
	}

	@Override
	public ItemStack quickMoveStack(Player player, int index) {
		var retStack = ItemStack.EMPTY;
		final Slot slot = getSlot(index);
		if (slot.hasItem()) {
			final ItemStack item = slot.getItem();
			retStack = item.copy();
			if (index < 104) {
				if (!moveItemStackTo(item, 104, this.slots.size(), true))
					return ItemStack.EMPTY;
			} else if (!moveItemStackTo(item, 0, 104, true))
				return ItemStack.EMPTY;

			if (item.isEmpty())
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();

		}

		return retStack;
	}

	@Override
	public boolean stillValid(Player player) {
		return stillValid(containerAccess, player, ModBlocks.NANITARIUM_CHEST.get());
	}

	public static MenuConstructor getServerContainer(NanitariumChestBlockEntity chest, BlockPos pos) {
		return (id, playerInv, player) -> new NanitariumChestContainer(id, playerInv, chest.inventory, pos);
	}

}
