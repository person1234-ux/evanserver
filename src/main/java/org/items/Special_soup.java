/*
 * Copyright (c) 2021. This is open source and provided by person
 */

package org.items;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.main.evanserver;

import java.util.ArrayList;

public class Special_soup implements Listener {

	private ItemStack item = new ItemStack(Material.BEETROOT_SOUP);
	private ItemMeta meta = item.getItemMeta();
	private NamespacedKey soupKey = new NamespacedKey(evanserver.getInstance(),"soup_key");

	/**
	 * adds a custom soup
	 */
	public void soup(){
		ArrayList<String> lores = new ArrayList<>();
		lores.add("Special soup");
		meta.setLocalizedName("SPECIAL_SOUP");
		meta.setDisplayName("SPECIAL_SOUP");
		meta.setLore(lores);
		item.setItemMeta(meta);
		ShapedRecipe r = new ShapedRecipe(soupKey, item);
		r.shape("$$$","$#$","$$$");
		r.setIngredient('#',Material.BEETROOT_SOUP);
		r.setIngredient('$', Material.IRON_INGOT);
		Bukkit.addRecipe(r);
	}

}
