package de.ILoveJava.lobby.events.invclicks;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.Invs;
import de.ILoveJava.lobby.API.ScoreboardAPI;
import de.ILoveJava.lobby.API.Sounds;
import de.ILoveJava.lobby.files.Playerdata;

public class INVCLICKbootskaufen implements Listener {
	
	@EventHandler
	public void onBoots(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getTitle().equalsIgnoreCase("§9Boots Kaufen"))  {
			e.setCancelled(true);
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Wasser")) {
				if(!Playerdata.hasBoot(p, "BOOTwasser") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 499) {
						Playerdata.removeCoins(p, 500);
						Playerdata.addBoot(p, "BOOTwasser");
						p.sendMessage(Main.Prefix+"§7Du hast die Boots "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt bereits die Boots§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Feuer")) {
				if(!Playerdata.hasBoot(p, "BOOTfeuer") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 749) {
						Playerdata.removeCoins(p, 750);
						Playerdata.addBoot(p, "BOOTfeuer");
						p.sendMessage(Main.Prefix+"§7Du hast die Boots "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt bereits die Boots§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5Portal")) {
				if(!Playerdata.hasBoot(p, "BOOTportal") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 349) {
						Playerdata.removeCoins(p, 350);
						Playerdata.addBoot(p, "BOOTportal");
						p.sendMessage(Main.Prefix+"§7Du hast die Boots "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt bereits die Boots§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getType() == Material.SKULL_ITEM) {
				Invs.Shop(p);
			}
			ScoreboardAPI.setScoreboardIngame(p);
			
		}
	}
	
}
