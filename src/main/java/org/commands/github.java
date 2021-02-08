/*
 * Copyright (c) 2021. This is open source only requirment is that you give me credit
 */

package org.commands;

import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;
import sun.java2d.pipe.SpanShapeRenderer;

import java.util.concurrent.TimeUnit;

public class github extends SimpleCommand {
	public github() {
		super("github");
		setUsage("/github");
		setPermission(null);
		setName("github");
		setCooldown(20, TimeUnit.SECONDS);
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		player.sendMessage("The github is https://github.com/person1234-ux/evanserver");

	}
}
