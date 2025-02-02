package net.okamiz.thelongstory.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.function.Supplier;

public class CustomSaplingBlock extends SaplingBlock {
    private final Supplier<Block> ground;

    public CustomSaplingBlock(SaplingGenerator generator, Settings settings, Supplier<Block> ground) {
        super(generator, settings);
        this.ground = ground;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ground.get());
    }
}
