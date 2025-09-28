package com.github.theredbrain.attackrangeattribute.mixin.entity;

import com.github.theredbrain.attackrangeattribute.AttackRangeAttribute;
import com.github.theredbrain.attackrangeattribute.entity.AttackRangeUsingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity implements AttackRangeUsingEntity {

	@Shadow
	public abstract double getAttributeValue(RegistryEntry<EntityAttribute> attribute);

	public LivingEntityMixin(EntityType<?> type, World world) {
		super(type, world);
	}

	@Inject(method = "createLivingAttributes", at = @At("RETURN"))
	private static void attackrangeattribute$createLivingAttributes(CallbackInfoReturnable<DefaultAttributeContainer.Builder> cir) {
		cir.getReturnValue()
				.add(AttackRangeAttribute.ATTACK_RANGE)
		;
	}

	@Override
	public double attackrangeattribute$getAttackRange() {
		return this.getAttributeValue(AttackRangeAttribute.ATTACK_RANGE);
	}

}
