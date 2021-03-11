/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;



import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

public class fly extends SimpleCommand {
	public fly() {
		super("fly");
		setPermission("evanserver.fly");
		setDescription("enables / disables fly for the player");
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		if(!player.hasPermission("evanserver.fly")){
			player.sendMessage(ChatColor.RED +"You don't have the permissions to do that");
		} else {
			if(player.getAllowFlight()){
				player.sendMessage(ChatColor.GREEN + "fly has been disabled");
				player.setAllowFlight(false);
			} else{
				player.sendMessage(ChatColor.GREEN +"fly has been enabled");
				player.setAllowFlight(true);
			}
		}

	}
}
