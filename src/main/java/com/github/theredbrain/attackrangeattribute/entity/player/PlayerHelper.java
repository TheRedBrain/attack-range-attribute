package com.github.theredbrain.attackrangeattribute.entity.player;

import com.github.theredbrain.attackrangeattribute.AttackRangeAttribute;
import com.google.common.collect.HashMultimap;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.registry.entry.RegistryEntry;

public class PlayerHelper {

	public static HashMultimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> getNaturalAttributeModifiers() {
		HashMultimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> hashMultimap = HashMultimap.create();
		hashMultimap.put(AttackRangeAttribute.ATTACK_RANGE, new EntityAttributeModifier(AttackRangeAttribute.identifier("natural_player_attack_range_modifier"), AttackRangeAttribute.SERVER_CONFIG.natural_player_attack_range, EntityAttributeModifier.Operation.ADD_VALUE));
		return hashMultimap;
	}
}
