/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.event;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.main.evanserver;
import org.mineacademy.fo.Common;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class AXE implements Listener {
	/**
	 * stores the player uuid
	 */
	Set<UUID> pl = new HashSet<>();

	@EventHandler
	public void customaxe(EntityDamageByEntityEvent event) {
		if (event.getDamager() instanceof Player) {
			Player player = (Player) event.getDamager();
			 if (!player.getInventory().getItemInMainHand().hasItemMeta()){
			 	return;
			 }



				try {


					if (player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().equals("LIGHTNING_AXE")) {
						if(player.getName().equals("DougPhantom9")){
							player.sendMessage("person has chosen to disable your lighting axe to mess with you");

						} else {
							pl.add(player.getUniqueId());


							event.getEntity().getWorld().strikeLightning(event.getEntity().getLocation());// fixed the summon lighting with an axe
							event.getEntity().getWorld().getBlockAt(event.getEntity().getLocation()).setType(Material.AIR);
							player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 30, 1, false, false));
						}



					}

				} catch (NullPointerException e) {
					e.printStackTrace();


				}
			}
		}



	@EventHandler //this cancels the damage that the player takes when the using the axe
	public void preventdamage(EntityDamageEvent event){


		if (pl.contains(event.getEntity().getUniqueId())){


			if(event.getCause().equals(EntityDamageEvent.DamageCause.LIGHTNING) ||event.getCause().equals(EntityDamageEvent.DamageCause.FIRE)){
				event.setCancelled(true);
			}

			try {
				new BukkitRunnable() {

					@Override
					public void run() {
						if(pl.contains(event.getEntity().getUniqueId())){
							pl.remove(event.getEntity().getUniqueId());
						}
					}
				}.runTaskLater(evanserver.getInstance(), 5*20);
			}catch (NoClassDefFoundError error){
				Common.log("error");

			}

		}
	}

}
