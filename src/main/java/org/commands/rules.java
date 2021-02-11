/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;
import org.items.rules_book;
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
		rules_book rulesBook = new rules_book();

		rulesBook.get_rules_book(player);
		player.sendMessage(ChatColor.RED +"Please read the rules.");
		player.sendMessage(ChatColor.RED +"Staff members get the final say on all punishments.");


	

	}
}
