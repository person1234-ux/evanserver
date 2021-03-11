/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

public class custom_el implements Listener {
	private Plugin plugin = Bukkit.getPluginManager().getPlugin("Craftable_eletra");
	private NamespacedKey elkey = new NamespacedKey(plugin, "el_key");
	private ItemStack el = new ItemStack(Material.ELYTRA);
	public void customitem(){
		ShapedRecipe r = new ShapedRecipe(elkey, el);
		r.shape(" !@","!@%","!@#");
		r.setIngredient('!',Material.FEATHER);
		r.setIngredient('@', Material.PAPER);
		r.setIngredient('#', Material.STRING);
		r.setIngredient('%', Material.EMERALD);
		Bukkit.addRecipe(r);


	}
}
