package net.okamiz.thelongstory.event;

import net.fabricmc.fabric.api.event.world.WorldTickCallback;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ModEvent implements WorldTickCallback {


    @Override
    public void tick(World world) {
        if(!world.isClient() && world.getPlayers() instanceof PlayerEntity player){

            if(player.isTouchingWater()) {//&& player.getWorld().getBiome(player.getBlockPos()) == ModBiomes.SNOW_FOREST){
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON));
            }
        }
    }
}
