package net.okamiz.thelongstory.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.mob.WitchEntity;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.okamiz.thelongstory.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SoulContainerItem extends Item {
    public SoulContainerItem(Settings settings) {
        super(settings);
    }



    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        if(!user.getWorld().isClient()) {

            if(entity instanceof WitchEntity && entity.getHealth() <= 15){
                entity.kill();
                user.playSound(SoundEvents.ENTITY_ALLAY_DEATH, SoundCategory.MASTER, 1f, 0.5f);
                user.playSound(SoundEvents.ENTITY_DONKEY_DEATH, SoundCategory.MASTER, 0.5f, 0.3f);
                user.playSound(SoundEvents.ITEM_TRIDENT_RIPTIDE_2, SoundCategory.MASTER, 0.5f, 0.2f);

                user.setStackInHand(hand, new ItemStack(ModItems.SOUL_CONTAINER_REGENERATION));

                return ActionResult.SUCCESS;
            }

            if(entity instanceof BlazeEntity && entity.getHealth() <= 15){
                entity.kill();
                user.playSound(SoundEvents.ENTITY_ALLAY_DEATH, SoundCategory.MASTER, 1f, 0.5f);
                user.playSound(SoundEvents.ENTITY_DONKEY_DEATH, SoundCategory.MASTER, 0.5f, 0.3f);
                user.playSound(SoundEvents.ITEM_TRIDENT_RIPTIDE_2, SoundCategory.MASTER, 0.5f, 0.2f);

                user.setStackInHand(hand, new ItemStack(ModItems.SOUL_CONTAINER_FIRE_RESISTANCE));

                return ActionResult.SUCCESS;
            }

            if(entity instanceof RabbitEntity && entity.getHealth() <= 15){
                entity.kill();
                user.playSound(SoundEvents.ENTITY_ALLAY_DEATH, SoundCategory.MASTER, 1f, 0.5f);
                user.playSound(SoundEvents.ENTITY_DONKEY_DEATH, SoundCategory.MASTER, 0.5f, 0.3f);
                user.playSound(SoundEvents.ITEM_TRIDENT_RIPTIDE_2, SoundCategory.MASTER, 0.5f, 0.2f);

                user.setStackInHand(hand, new ItemStack(ModItems.SOUL_CONTAINER_JUMP_BOOST));

                return ActionResult.SUCCESS;
            }

            if(entity instanceof BatEntity && entity.getHealth() <= 15){
                entity.kill();
                user.playSound(SoundEvents.ENTITY_ALLAY_DEATH, SoundCategory.MASTER, 1f, 0.5f);
                user.playSound(SoundEvents.ENTITY_DONKEY_DEATH, SoundCategory.MASTER, 0.5f, 0.3f);
                user.playSound(SoundEvents.ITEM_TRIDENT_RIPTIDE_2, SoundCategory.MASTER, 0.5f, 0.2f);

                user.setStackInHand(hand, new ItemStack(ModItems.SOUL_CONTAINER_NIGHT_VISION));

                return ActionResult.SUCCESS;
            }

            if(entity instanceof DolphinEntity && entity.getHealth() <= 15){
                entity.kill();
                user.playSound(SoundEvents.ENTITY_ALLAY_DEATH, SoundCategory.MASTER, 1f, 0.5f);
                user.playSound(SoundEvents.ENTITY_DONKEY_DEATH, SoundCategory.MASTER, 0.5f, 0.3f);
                user.playSound(SoundEvents.ITEM_TRIDENT_RIPTIDE_2, SoundCategory.MASTER, 0.5f, 0.2f);

                user.setStackInHand(hand, new ItemStack(ModItems.SOUL_CONTAINER_DOLPHIN_GRACE));

                return ActionResult.SUCCESS;
            }

            if(entity instanceof IronGolemEntity && entity.getHealth() <= 15){
                entity.kill();
                user.playSound(SoundEvents.ENTITY_ALLAY_DEATH, SoundCategory.MASTER, 1f, 0.5f);
                user.playSound(SoundEvents.ENTITY_DONKEY_DEATH, SoundCategory.MASTER, 0.5f, 0.3f);
                user.playSound(SoundEvents.ITEM_TRIDENT_RIPTIDE_2, SoundCategory.MASTER, 0.5f, 0.2f);

                user.setStackInHand(hand, new ItemStack(ModItems.SOUL_CONTAINER_RESISTANCE));

                return ActionResult.SUCCESS;
            }

            if(entity instanceof WitherSkeletonEntity && entity.getHealth() <= 15){
                entity.kill();
                user.playSound(SoundEvents.ENTITY_ALLAY_DEATH, SoundCategory.MASTER, 1f, 0.5f);
                user.playSound(SoundEvents.ENTITY_DONKEY_DEATH, SoundCategory.MASTER, 0.5f, 0.3f);
                user.playSound(SoundEvents.ITEM_TRIDENT_RIPTIDE_2, SoundCategory.MASTER, 0.5f, 0.2f);

                user.setStackInHand(hand, new ItemStack(ModItems.SOUL_CONTAINER_HASTE));

                return ActionResult.SUCCESS;
            }

            if(entity instanceof VillagerEntity && entity.getHealth() <= 15){
                entity.kill();
                user.playSound(SoundEvents.ENTITY_ALLAY_DEATH, SoundCategory.MASTER, 1f, 0.5f);
                user.playSound(SoundEvents.ENTITY_DONKEY_DEATH, SoundCategory.MASTER, 0.5f, 0.3f);
                user.playSound(SoundEvents.ITEM_TRIDENT_RIPTIDE_2, SoundCategory.MASTER, 0.5f, 0.2f);

                user.setStackInHand(hand, new ItemStack(ModItems.SOUL_CONTAINER_SATURATION));

                return ActionResult.SUCCESS;
            }

            if(entity instanceof ChickenEntity && entity.getHealth() <= 15){
                entity.kill();
                user.playSound(SoundEvents.ENTITY_ALLAY_DEATH, SoundCategory.MASTER, 1f, 0.5f);
                user.playSound(SoundEvents.ENTITY_DONKEY_DEATH, SoundCategory.MASTER, 0.5f, 0.3f);
                user.playSound(SoundEvents.ITEM_TRIDENT_RIPTIDE_2, SoundCategory.MASTER, 0.5f, 0.2f);

                user.setStackInHand(hand, new ItemStack(ModItems.SOUL_CONTAINER_SLOW_FALLING));

                return ActionResult.SUCCESS;
            }



        }

        return ActionResult.FAIL;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.thelongstory.soul_container"));
        }else{
            tooltip.add(Text.translatable("tooltip.thelongstory.press_shift_info"));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
