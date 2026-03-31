package com.github.theredbrain.attackrangeattribute;

import com.github.theredbrain.attackrangeattribute.config.ServerConfig;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AttackRangeAttribute implements ModInitializer {
	public static final String MOD_ID = "attackrangeattribute";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ServerConfig SERVER_CONFIG;

	public static RegistryEntry<EntityAttribute> ATTACK_RANGE;

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Attack Range Attribute!");
		SERVER_CONFIG = ConfigApiJava.registerAndLoadConfig(ServerConfig::new);
	}

	public static Identifier identifier(String path) {
		return Identifier.of(MOD_ID, path);
	}

}