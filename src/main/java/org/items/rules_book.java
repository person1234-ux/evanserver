/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;



public class rules_book implements Listener {
	private ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
	private BookMeta meta = (BookMeta)  book.getItemMeta();
	public void get_rules_book(Player pLayer){
		//todo make the rule book look better.S
		meta.addPage("No stealing\nNo Griefing property or players\nDo not be toxic or bully others\nNo potty words\nNo inappropriate builds\nNo cheating or using mods outside of client like lunar or bad lion\nNo duplicating items\nAll damaged property must be replaced");
		meta.addPage("Shops must be fairly priced and no stealing or taking items without paying.\nDo not make lag farms or builds intended to cause major lag.\nNo hogging, hoarding or intentionally killing animals to prevent others from obtaining them.");
		meta.setAuthor("Person1");
		meta.setDisplayName("rules");
		meta.setTitle("Rules");
		meta.addEnchant(Enchantment.VANISHING_CURSE, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		book.setItemMeta(meta);

		pLayer.getInventory().setItemInMainHand(book);

	}
}
