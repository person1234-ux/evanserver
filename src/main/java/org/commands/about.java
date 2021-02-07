/*
 * Copyright (c) 2021. This is open source only requirment is that you give me credit
 */

package org.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.mineacademy.fo.command.SimpleCommand;

public class about extends SimpleCommand {
	private ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
	private BookMeta meta = (BookMeta) book.getItemMeta();
	public about() {
		super("about");
		setPermission(null);
		setDescription("About the evanmcgaming server");
	}

	@Override
	protected void onCommand() {
		if (sender instanceof Player){
			Player player = getPlayer();
			player.sendMessage(ChatColor.AQUA +"This server is the unofficial evanmcgaming server");
			player.sendMessage(ChatColor.AQUA+ "The server recipes will be releases soon");
			meta.setTitle("About");
			meta.setDisplayName("About");
			meta.addPage("To be release soon");
			meta.addEnchant(Enchantment.VANISHING_CURSE, 1, true);
			book.setItemMeta(meta);
			player.getInventory().addItem(book);



		} else {
			System.out.println("This command can only be used by the player");
		}

	}
}
