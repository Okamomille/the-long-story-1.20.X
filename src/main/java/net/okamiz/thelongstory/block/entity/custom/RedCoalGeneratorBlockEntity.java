package net.okamiz.thelongstory.block.entity.custom;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.okamiz.thelongstory.block.ModBlocks;
import net.okamiz.thelongstory.block.custom.RedCoalGeneratorBlock;
import net.okamiz.thelongstory.block.entity.ImplementedInventory;
import net.okamiz.thelongstory.block.entity.ModBlockEntities;
import net.okamiz.thelongstory.item.ModItems;
import net.okamiz.thelongstory.recipe.MaterialProcessingRecipe;
import net.okamiz.thelongstory.screen.RedCoalGeneratorScreenHandler;
import net.okamiz.thelongstory.util.EnergyUtil;
import org.jetbrains.annotations.Nullable;
import team.reborn.energy.api.base.SimpleEnergyStorage;

import java.util.Optional;

public class RedCoalGeneratorBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {

    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(1, ItemStack.EMPTY);

    private static final int INPUT_SLOT = 0;

    private int burnTime;

    public RedCoalGeneratorBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.RED_COAL_GENERATOR_BLOCK_ENTITY, pos, state);
    }

    public final SimpleEnergyStorage energyStorage = new SimpleEnergyStorage(64000, 200, 200){
        @Override
        protected void onFinalCommit() {
            markDirty();
            getWorld().updateListeners(pos, getCachedState(), getCachedState(), 3);
        }
    };





    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction side) {
        Direction localDir = this.getWorld().getBlockState(pos).get(RedCoalGeneratorBlock.FACING);

        if(side == Direction.DOWN){
            return false;
        }

        if(side == Direction.UP){
            return slot == INPUT_SLOT;
        }

        return switch(localDir){
            default -> //NORTH
                    side.getOpposite() == Direction.NORTH && slot == INPUT_SLOT ||
                            side.getOpposite() == Direction.WEST && slot == INPUT_SLOT;
            case EAST ->
                    side.rotateYClockwise() == Direction.NORTH && slot == INPUT_SLOT ||
                            side.rotateYClockwise() == Direction.WEST && slot == INPUT_SLOT;
            case SOUTH ->
                    side == Direction.NORTH && slot == INPUT_SLOT ||
                            side == Direction.WEST && slot == INPUT_SLOT;
            case WEST ->
                    side.rotateYCounterclockwise() == Direction.NORTH && slot == INPUT_SLOT ||
                            side.rotateYCounterclockwise() == Direction.WEST && slot == INPUT_SLOT;

        };
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {
        return false;
    }



    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Red Coal Generator");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new RedCoalGeneratorScreenHandler(syncId, playerInventory, this);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("red_coal_generator.burntime", burnTime);
        nbt.putLong("red_coal_generator.energy", energyStorage.amount);

    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        burnTime = nbt.getInt("red_coal_generator.burntime");
        energyStorage.amount = nbt.getLong("red_coal_generator.energy");
        super.readNbt(nbt);
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if(!world.isClient()) {

            if (hasEnergyItemInEnergySlot(INPUT_SLOT) && burnTime==0) {
                burnTime = FuelRegistry.INSTANCE.get(getItems().get(INPUT_SLOT).getItem());
                removeStack(INPUT_SLOT, 1);
            } else if (burnTime > 0 && !(energyStorage.amount >= energyStorage.capacity)) {
                addEnergy();
                --burnTime;
            }

            EnergyUtil.distributeEnergy(world, pos, energyStorage, 200);
            markDirty();
        }
    }

    private void addEnergy() {
        try(Transaction transaction = Transaction.openOuter()){
            energyStorage.insert(10, transaction);
            transaction.commit();
        }
    }

    private boolean hasEnergyItemInEnergySlot(int inputSlot) {
        Item item = this.getStack(inputSlot).getItem();
        return item == ModItems.RED_COAL || item == ModBlocks.RED_COAL_BLOCK.asItem();
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return createNbt();
    }

}

