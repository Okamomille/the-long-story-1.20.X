package net.okamiz.thelongstory.util;

import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import team.reborn.energy.api.EnergyStorage;
import team.reborn.energy.api.EnergyStorageUtil;

public class EnergyUtil {

    public static void distributeEnergy(World world, BlockPos pos, EnergyStorage energyFrom, long amount) {
        Direction.stream().forEach(direction -> {
            BlockPos newPos = new BlockPos(pos.getX(), pos.getY(), pos.getZ()).add(direction.getVector());
            EnergyStorage energyTo = EnergyStorage.SIDED.find(world, newPos, null);
            if (energyFrom!=null && energyTo !=null) {
                try(Transaction transaction = Transaction.openOuter()){
                    EnergyStorageUtil.move(energyFrom, energyTo, amount, transaction);
                    transaction.commit();
                }
            }
        });

    }
}
