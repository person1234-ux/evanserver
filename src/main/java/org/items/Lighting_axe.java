/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver)
 */

package org.items;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.main.evanserver;

import java.util.ArrayList;

public class Lighting_axe implements Listener {
	 Plugin plugin = evanserver.getPlugin(evanserver.class);
	private ItemStack items = new ItemStack(Material.DIAMOND_AXE);
	private ItemMeta meta = items.getItemMeta();
	private final NamespacedKey itemskey = new NamespacedKey(plugin, "items_key");

	public void axe(){
		ArrayList<String> lore = new ArrayList<>();
		lore.add("Lightning Axe");
		meta.setLore(lore);
		meta.setDisplayName("Lightning");
		meta.setLocalizedName("LIGHTNING_AXE");

		items.setItemMeta(meta);
		ShapedRecipe r = new ShapedRecipe(itemskey, items);
		r.shape("%%%","%#%","%%%");
		r.setIngredient('#',Material.DIAMOND_AXE);
		r.setIngredient('%',Material.DIAMOND);
		Bukkit.addRecipe(r);

	}

	public void getItem(Player player){
		ArrayList<String> lore = new ArrayList<>();
		lore.add("Lightning Axe");
		meta.setLore(lore);
		meta.setDisplayName("Lightning");
		meta.setLocalizedName("LIGHTNING_AXE");
		items.setItemMeta(meta);
		player.getInventory().addItem(items);



	}

}
