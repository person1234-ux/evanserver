/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.event;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class FoodEAting implements Listener {
	Random rn = new Random();
	@EventHandler
	public void carroneating(PlayerItemConsumeEvent event){
		final ItemStack items =  event.getItem();
		System.out.println(items.getItemMeta().getLocalizedName());
		Player player = event.getPlayer();
		final int randomnumber = rn.nextInt(2);
		if (items.getItemMeta().getLocalizedName().equals("CUSTOM_CARROT")) {
			if (randomnumber == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20*60*5, 3));
			}			else {
				Bukkit.broadcastMessage(player.getName() + " was unlucky and got nausea from the golden carrot");
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 20*30,3,true, false));
			}


		}
		}
	@EventHandler public void Godpotatoeating(PlayerItemConsumeEvent event)	{
		final ItemStack item = event.getItem();
		Player player = event.getPlayer();
		if (item.getItemMeta().getLocalizedName().equals("GOD_POTATO")){
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 12000, 3));
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION , 12000, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 12000, 2));
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 12000,2));
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 12000,2));


		}
	}

	@EventHandler public void consumingKfc(PlayerItemConsumeEvent event){
		final ItemStack item = event.getItem();
		Player player = event.getPlayer();
		if (item.getItemMeta().getLocalizedName().equals("KFC")){
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20*60,1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20*60*5, 1));
			player.sendMessage("Oh boy I'm mc lovin' it");
		}
	}

	@EventHandler(ignoreCancelled = true) public void consumesoup(PlayerItemConsumeEvent event){
		final ItemStack item = event.getItem();
		Player player = event.getPlayer();
		if (item.getItemMeta().getLocalizedName().equals("SPECIAL_SOUP")){
			final int randomnumber = rn.nextInt(4);
			switch (randomnumber) {
				case 0: player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20 * 5 *60, 1, true)); break;
				case 1: player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 5 *60, 1,false)); break;
				case 2: player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20 * 5 *60, 1, true)); break;
				case 3: player.sendMessage("you got unlucky" +player.getName() +" no potion effect given"); break;
			}


		}

	}

}

