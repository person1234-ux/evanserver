/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class troll_random extends SimpleCommand {
	public troll_random() {
		super("troll_random");
		setCooldown(10, TimeUnit.MINUTES);
		setMinArguments(1);
	}



	@Override
	protected void onCommand() {
		checkConsole();
		if(Bukkit.getPlayer(args[0]) !=null){
			Player playerthatwearetrolling = Bukkit.getPlayer(args[0]);
			playerthatwearetrolling.sendMessage("get ready to be trolled");
			Random rn = new Random();
			final int randomint = rn.nextInt(5);
			switch (randomint){
				case 0:
					playerthatwearetrolling.getInventory().addItem(new ItemStack(Material.DIRT, 100));
					break;
				case 1: playerthatwearetrolling.kickPlayer("get trolled");
					break;
				case 2: playerthatwearetrolling.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20*30, 2));
					break;
				case 3: playerthatwearetrolling.sendMessage("you lucky nothing happened");

					break;
				case 4: playerthatwearetrolling.sendMessage("uh oh your inventory is going to get whipped randomly");
					break;
			}
		} else{
			Player player = getPlayer();
			player.sendMessage("that player is not currently online");
		}

	}
}
