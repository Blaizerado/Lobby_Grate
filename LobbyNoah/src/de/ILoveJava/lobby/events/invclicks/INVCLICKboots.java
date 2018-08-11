package de.ILoveJava.lobby.events.invclicks;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.Invs;
import de.ILoveJava.lobby.API.Listen;
import de.ILoveJava.lobby.API.Sounds;
import de.ILoveJava.lobby.files.Playerdata;

public class INVCLICKboots implements Listener {
	
	@EventHandler
	public void onBoot(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equalsIgnoreCase("§9Boots")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cKeine Boots")) {
				Listen.red.remove(p.getName());
				Listen.blue.remove(p.getName());
				Listen.portal.remove(p.getName());
				p.sendMessage(Main.Prefix+"§7Du trägst nun keine Boots mehr!");
				Sounds.levelUpSound(p, 3, 3);
				p.getInventory().setBoots(null);
				p.closeInventory();
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Feuer")) {
				if(Playerdata.hasBoot(p, "BOOTfeuer") || p.hasPermission("lobby.premium")) {
					Listen.red.add(p.getName());
					Listen.blue.remove(p.getName());
					Listen.portal.remove(p.getName());
					ItemStack red = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta rmeta = (LeatherArmorMeta) red.getItemMeta();
					rmeta.setColor(Color.ORANGE);
					rmeta.setDisplayName("§6Feuer");
					red.setItemMeta(rmeta);
					p.sendMessage(Main.Prefix+"§7Du trägst nun die§6§l Feuer§r§7-Boots!");
					Sounds.levelUpSound(p, 3, 3);
					p.getInventory().setBoots(red);
					p.closeInventory();
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt diese Boots nicht!");
					Sounds.noPermSound(p);
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Wasser")) {
				if(Playerdata.hasBoot(p, "BOOTwasser") || p.hasPermission("lobby.premium")) {
					Listen.blue.add(p.getName());
					Listen.red.remove(p.getName());
					Listen.portal.remove(p.getName());
					
					ItemStack blue = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bmeta = (LeatherArmorMeta) blue.getItemMeta();
					bmeta.setColor(Color.BLUE);
					bmeta.setDisplayName("§9Wasser");
					blue.setItemMeta(bmeta);
					p.sendMessage(Main.Prefix+"§7Du trägst nun die§9§l Wasser§r§7-Boots!");
					Sounds.levelUpSound(p, 3, 3);
					p.getInventory().setBoots(blue);
					p.closeInventory();
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt diese Boots nicht!");
					Sounds.noPermSound(p);
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5Portal")) {
				if(Playerdata.hasBoot(p, "BOOTportal") || p.hasPermission("lobby.premium")) {
					ItemStack portal = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta pmeta = (LeatherArmorMeta) portal.getItemMeta();
					pmeta.setColor(Color.PURPLE);
					pmeta.setDisplayName("§5Portal");
					portal.setItemMeta(pmeta);
					Listen.portal.add(p.getName());
					Listen.red.remove(p.getName());
					Listen.blue.remove(p.getName());
					p.sendMessage(Main.Prefix+"§7Du trägst nun die§5§l Portal§r§7-Boots!");
					Sounds.levelUpSound(p, 3, 3);
					p.getInventory().setBoots(portal);
					p.closeInventory();
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt diese Boots nicht!");
					Sounds.noPermSound(p);
				}
			} else if(e.getCurrentItem().getType() == Material.SKULL_ITEM) {
				Invs.Extras(p);
			}
		}
	}

}
