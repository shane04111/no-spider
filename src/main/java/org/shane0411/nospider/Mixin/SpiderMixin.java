package org.shane0411.nospider.Mixin;

import net.minecraft.block.BlockState;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SpiderEntity.class)
public class SpiderMixin {
    /**
     * @author
     * @reason
     */
    @Overwrite
    protected SoundEvent getDeathSound() {
        return null;
    }

    /**
     * @author
     * @reason
     */
    @Overwrite
    protected SoundEvent getAmbientSound() {
        return null;
    }

    /**
     * @author
     * @reason
     */
    @Overwrite
    protected SoundEvent getHurtSound(DamageSource source) {
        return null;
    }

    /**
     * @author
     * @reason
     */
    @Overwrite
    protected void playStepSound(BlockPos pos, BlockState state) {
    }

    /**
     * @author
     * @reason
     */
    @Overwrite
    protected void initDataTracker() {  }

    /**
     * @author
     * @reason
     */
    @Overwrite
    public static DefaultAttributeContainer.Builder createSpiderAttributes() {
        return null;
    }

    /**
     * @author
     * @reason
     */
    @Overwrite
    public boolean canHaveStatusEffect(StatusEffectInstance effect) {
        return false;
    }
}
