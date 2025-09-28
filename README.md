# Attack Range Attribute

A small API that adds the "attackrangeattribute:generic.attack_range" entity attribute. On its own this mod doesn't change gameplay.

## Vanilla Minecraft has the "entity_interaction_range" attribute. Why is an "attack_range" attribute necessary?

The entity_interaction_range attribute controls both the range of attacks and the range of right-click interactions (e.g. trading with villagers). This works fine in vanilla, since the entity_interaction_range doesn't change in normal gameplay.

However, in scenarios where different weapons are designed to have different attack ranges, the right-click interactions with entities get inconsistent and in extreme cases, when the attack range is 0, impossible.

## API

Casting a "LivingEntity" to the "AttackRangeUsingEntity" interface gives access to all relevant methods.