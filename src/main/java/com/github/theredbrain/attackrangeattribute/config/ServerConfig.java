package com.github.theredbrain.attackrangeattribute.config;

import com.github.theredbrain.attackrangeattribute.AttackRangeAttribute;
import me.fzzyhmstrs.fzzy_config.config.Config;

public class ServerConfig extends Config {

	public ServerConfig() {
		super(AttackRangeAttribute.identifier("server"));
	}

	public float natural_player_attack_range = 3.0F;
}
