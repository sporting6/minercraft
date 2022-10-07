package com.dargonboi.krasyrum.block.entity.custom;

import com.dargonboi.krasyrum.block.entity.ModBlockEntities;
import com.dargonboi.krasyrum.recipe.ForgeRecipe;
import com.dargonboi.krasyrum.screen.ForgeMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Optional;

public class ForgeBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(2){
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 1000;
    private int targetIndex = 0;
    private int pointerPos = 0;
    private int maxPointerPos = 1400;
    private int pointerDir = 0;
    private int pointerSpeed = 0;
    private int gearScore = 0;
    private CompoundTag score = new CompoundTag();

//    private int[] pointerSpeeds = {}

    //Make Function To find pixel to generate pointer


    public ForgeBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.FORGE_BLOCK_ENTITY.get(), pos, state);
        this.data = new ContainerData() {
            public int get(int index) {
                switch (index) {
                    case 0: return ForgeBlockEntity.this.progress;
                    case 1: return ForgeBlockEntity.this.maxProgress;
                    case 2: return ForgeBlockEntity.this.targetIndex;
                    case 3: return ForgeBlockEntity.this.pointerPos;
                    case 4: return ForgeBlockEntity.this.maxPointerPos;
                    case 5: return ForgeBlockEntity.this.pointerDir;
                    case 6: return ForgeBlockEntity.this.pointerSpeed;
                    case 7: return ForgeBlockEntity.this.gearScore;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                    case 0: ForgeBlockEntity.this.progress = value; break;
                    case 1: ForgeBlockEntity.this.maxProgress = value; break;
                    case 2: ForgeBlockEntity.this.targetIndex = value; break;
                    case 3: ForgeBlockEntity.this.pointerPos = value; break;
                    case 4: ForgeBlockEntity.this.maxPointerPos = value; break;
                    case 5: ForgeBlockEntity.this.pointerDir = value; break;
                    case 6: ForgeBlockEntity.this.pointerSpeed = value; break;
                    case 7: ForgeBlockEntity.this.gearScore = value; break;
                }
            }
            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return new TextComponent("Forge");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inv, Player player) {
        return new ForgeMenu(id, inv, this, this.data);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps()  {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        tag.putInt("forge.progress", progress);
//        tag.putInt("forge.target_index", targetIndex);

        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("forge.progress");
//        targetIndex = nbt.getInt("forge.target_index");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    void pointerTick(int dir, ForgeBlockEntity entity){
        int speed = 100 * entity.pointerSpeed;
        int maxPointerPos = entity.maxPointerPos - speed;

        if(entity.pointerPos == maxPointerPos){
            entity.pointerPos++;
        }

        if(dir == 0){
            entity.pointerPos++;
        }
        else if(dir == 1){
            entity.pointerPos--;
        }
        else System.out.println("Non 0-1 Pointer Direction");
    }

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, ForgeBlockEntity pBlockEntity) {
        if(hasRecipe(pBlockEntity)) {
            pBlockEntity.progress++;
            setChanged(pLevel, pPos, pState);
            if(pBlockEntity.progress > pBlockEntity.maxProgress) {
                craftItem(pBlockEntity);
            }
            pBlockEntity.pointerTick(pBlockEntity.pointerDir, pBlockEntity);

        } else {
            pBlockEntity.resetProgress();
            setChanged(pLevel, pPos, pState);
        }
    }

    private static boolean hasRecipe(ForgeBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<ForgeRecipe> match = level.getRecipeManager()
                .getRecipeFor(ForgeRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getResultItem())  ;
    }



    private static void craftItem(ForgeBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<ForgeRecipe> match = level.getRecipeManager()
                .getRecipeFor(ForgeRecipe.Type.INSTANCE, inventory, level);

        if(match.isPresent()) {
            entity.itemHandler.extractItem(0,1, false);
            entity.itemHandler.extractItem(1,1, false);
            entity.itemHandler.extractItem(2,1, false);
            entity.itemHandler.extractItem(3,1, false);
            entity.itemHandler.extractItem(4,1, false);
            entity.itemHandler.extractItem(5,1, false);
            entity.itemHandler.extractItem(6,1, false);
            entity.itemHandler.extractItem(7,1, false);
            entity.itemHandler.extractItem(8,1, false);

            System.out.println(entity.gearScore);


            entity.score.putInt("krasyrum.score", entity.gearScore);
            entity.itemHandler.setStackInSlot(9, new ItemStack(match.get().getResultItem().getItem(),
                    entity.itemHandler.getStackInSlot(9).getCount() + 1, entity.score));

            entity.resetProgress();
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }
    private void resetScore() {
        this.gearScore = 0;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output) {
        return inventory.getItem(9).getItem() == output.getItem() || inventory.getItem(9).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
        return inventory.getItem(9).getMaxStackSize() > inventory.getItem(9).getCount();
    }

}
