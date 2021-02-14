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
import org.bukkit.inventory.meta.ItemMeta;
import org.main.evanserver;

import java.util.ArrayList;
import java.util.List;


public class kfc implements Listener {
	private ItemStack kutuckyfriedchicken = new ItemStack(Material.COOKED_CHICKEN);
	private ItemMeta meta = kutuckyfriedchicken.getItemMeta();
	private NamespacedKey kuntuckyfriedchickenkey = new NamespacedKey(evanserver.getInstance(), "kfk_key");
	public void kfc_chicken(){
		meta.setDisplayName("KFC");
		ArrayList<String> lore = new ArrayList<>();
		lore.add("Finger Lickin’ Good");
		meta.setLore(lore);
		meta.setLocalizedName("KFC");
		kutuckyfriedchicken.setItemMeta(meta);
		ShapedRecipe r = new ShapedRecipe(kuntuckyfriedchickenkey, kutuckyfriedchicken);
		r.shape("%%%","%$%","%%%");
		r.setIngredient('$',Material.CHICKEN);
		r.setIngredient('%',Material.FLINT);
		Bukkit.addRecipe(r);



	}
}
