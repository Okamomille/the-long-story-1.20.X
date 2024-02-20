package net.okamiz.thelongstory.entity.custom;

import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import net.okamiz.thelongstory.entity.ai.AmethystGolemAttackGoal;
import net.okamiz.thelongstory.entity.ai.TrepasseurAttackGoal;

public class AmethystGolemEntity extends HostileEntity {

    private PlayerEntity player;

    private Boolean setAttacking;

    private static final TrackedData<Boolean> ATTACKING =
            DataTracker.registerData(AmethystGolemEntity.class, TrackedDataHandlerRegistry.BOOLEAN);


    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState attackAnimationState = new AnimationState();
    public int idleAnimationCooldown = 0;
    public int attackAnimationCooldown = 0;


    public AmethystGolemEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }


    private void setupAnimationStates() {
        if (this.idleAnimationCooldown <= 0) {
            this.idleAnimationCooldown = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationCooldown;
        }

        if(this.isAttacking() && attackAnimationCooldown <= 0) {
            attackAnimationCooldown = 15;
            attackAnimationState.start(this.age);
        } else {
            --this.attackAnimationCooldown;
        }

        //if(!this.isAttacking()) {
        //    attackAnimationState.stop();
        //}
    }

    @Override
    protected void updateLimbs(float posDelta) {
        float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta * 6.0f, 1.0f) : 0.0f;
        this.limbAnimator.updateLimbs(f, 0.2f);
    }

    @Override
    public void tick() {
        super.tick();
        if(this.getWorld().isClient()) {
            setupAnimationStates();
        }
    }



    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.targetSelector.add(1, new RevengeGoal(this));
        this.targetSelector.add(2, new ActiveTargetGoal<PlayerEntity>(this, PlayerEntity.class, false));
        this.goalSelector.add(2, new AmethystGolemAttackGoal(this, 1.2D, false));

        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1D));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
        this.goalSelector.add(6, new LookAroundGoal(this));


    }

    @Override
    public boolean isUndead() {
        return false;
    }

    public static DefaultAttributeContainer.Builder createAmethystGolemAttributes(){
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 40.0f)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 50.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 32f)
                .add(EntityAttributes.GENERIC_ARMOR, 2.2f);
    }



    public void setAttacking(boolean attacking) {
        this.dataTracker.set(ATTACKING, attacking);
    }

    @Override
    public boolean isAttacking() {
        return this.dataTracker.get(ATTACKING);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(ATTACKING, false);
    }


    @Override
    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return 4.25F;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_HUSK_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_HUSK_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_HUSK_DEATH;
    }
}