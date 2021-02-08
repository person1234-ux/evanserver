/*
 * Copyright (c) 2021. This is open source only requirment is that you give me credit
 */

package org.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.util.ArrayList;

public class about_book implements Listener {
	private ItemStack items = new ItemStack(Material.WRITTEN_BOOK);
	 private BookMeta meta = (BookMeta) items.getItemMeta();
	public void givebook(Player player){
		meta.setAuthor("Person1");
		meta.setTitle("Welcome");
		meta.addPage("To be completed soon");
		meta.setDisplayName("Welcome");
		ArrayList<String> lore = new ArrayList<>();
		meta.setLore(lore);
		meta.addEnchant(Enchantment.VANISHING_CURSE, 1,true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

	items.setItemMeta(meta);

		player.getInventory().setItemInMainHand(items);

	}
}
