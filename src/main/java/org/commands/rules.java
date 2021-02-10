/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class rules extends SimpleCommand {
	public rules() {
		super("rules");
		setPermission(null);
		setUsage("/rules");
		setName("rules");
		setCooldown(15, TimeUnit.SECONDS);

	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		player.sendMessage(ChatColor.RED +"Rules to be released soon.");
		player.sendMessage(ChatColor.RED + "Please don't cure in chat or advertise.");
		player.sendMessage(ChatColor.RED +"Please respect other player including what they have worked on for the smp");
		player.sendMessage(ChatColor.RED +"Staff members get the final say on all punishments.");
	

	}
}
