package net.okamiz.thelongstory.block.custom.leaves_blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.okamiz.thelongstory.particles.ModParticles;

public class EgroricLeavesBlock extends LeavesBlock {
    public EgroricLeavesBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(10) != 0) {
            return;
        }
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        if (EgroricLeavesBlock.isFaceFullSquare(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
            return;
        }
        ParticleUtil.spawnParticle(world, pos, random, ModParticles.EGRORIC_LEAVES_PARTICLE);
    }
}
