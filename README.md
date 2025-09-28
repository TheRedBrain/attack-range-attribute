# Attack Range Attribute

A small API that adds a dedicated entity attribute for attack range.

## Vanilla Minecraft has the "entity_interaction_range_range" attribute. Why is a "attack_range" attribute necessary?

The entity_interaction_range attribute controls both the range of attacks and the range of right-click interactions (e.g. trading with villagers). This works fine in vanilla, since the entity_interaction_range doesn't change in normal gameplay.

However, in scenarios where different weapons are designed to have different attack ranges, the right-click interactions with entities gets inconsistent and in extreme cases, when the attack_range is 0, impossible.