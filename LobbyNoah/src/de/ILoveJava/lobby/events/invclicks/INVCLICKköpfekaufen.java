package de.ILoveJava.lobby.events.invclicks;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.Invs;
import de.ILoveJava.lobby.API.ScoreboardAPI;
import de.ILoveJava.lobby.API.Sounds;
import de.ILoveJava.lobby.files.Playerdata;

public class INVCLICKk�pfekaufen implements Listener {
	
	@EventHandler
	public void onK�pfeKaufen(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getTitle().equalsIgnoreCase("§bKöpfe Kaufen")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7§lZurück")) {
				Invs.Shop(p);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Alpaka")) {
				if(!p.hasPermission("lobby.kopfe.alpaka") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 399) {
						Playerdata.removeCoins(p, 400);
						Playerdata.addHead(p, "SKULLalpaka");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Höhlenspinne")) {
				if(!p.hasPermission("lobby.kopfe.hohlenspinne") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 299) {
						Playerdata.removeCoins(p, 300);
						Playerdata.addHead(p, "SKULLholenspinne");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Huhn")) {
				if(!p.hasPermission("lobby.kopfe.huhn") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 299) {
						Playerdata.removeCoins(p, 300);
						Playerdata.addHead(p, "SKULLhuhn");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Kuh")) {
				if(!p.hasPermission("lobby.kopfe.kuh") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 299) {
						Playerdata.removeCoins(p, 300);
						Playerdata.addHead(p, "SKULLkuh");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Pilzku")) {
				if(!p.hasPermission("lobby.kopfe.pilzku") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 299) {
						Playerdata.removeCoins(p, 300);
						Playerdata.addHead(p, "SKULLpilzkuh");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Schwein")) {
				if(!p.hasPermission("lobby.kopfe.schwein") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 299) {
						Playerdata.removeCoins(p, 300);
						Playerdata.addHead(p, "SKULLschwein");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Schaf")) {
				if(!p.hasPermission("lobby.kopfe.schaf") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 299) {
						Playerdata.removeCoins(p, 300);
						Playerdata.addHead(p, "SKULLschaf");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Tintenfisch")) {
				if(!p.hasPermission("lobby.kopfe.tintenfisch") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 299) {
						Playerdata.removeCoins(p, 300);
						Playerdata.addHead(p, "SKULLtintenfisch");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Kaktus")) {
				if(!p.hasPermission("lobby.kopfe.kaktus") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 299) {
						Playerdata.removeCoins(p, 300);
						Playerdata.addHead(p, "SKULLkaktus");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Melone")) {
				if(!p.hasPermission("lobby.kopfe.melone") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 299) {
						Playerdata.removeCoins(p, 300);
						Playerdata.addHead(p, "SKULLmelone");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Kürbis")) {
				if(!p.hasPermission("lobby.kopfe.kurbis") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 299) {
						Playerdata.removeCoins(p, 300);
						Playerdata.addHead(p, "SKULLkurbis");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§cTNT")) {
				if(!p.hasPermission("lobby.kopfe.tnt") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 299) {
						Playerdata.removeCoins(p, 300);
						Playerdata.addHead(p, "SKULLtnt");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Holz")) {
				if(!p.hasPermission("lobby.kopfe.holz") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 299) {
						Playerdata.removeCoins(p, 300);
						Playerdata.addHead(p, "SKULLholz");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§4TNT")) {
				if(!p.hasPermission("lobby.kopfe.tnt2") || p.hasPermission("lobby.premium")) {
					if(Playerdata.getCoins(p) > 299) {
						Playerdata.removeCoins(p, 300);
						Playerdata.addHead(p, "SKULLtnt2");
						p.sendMessage(Main.Prefix+"§7Du hast dir den Kopf "+e.getCurrentItem().getItemMeta().getDisplayName()+"§a erhalten§7!");
						Sounds.levelUpSound(p, 3, 3);
						p.closeInventory();
					} else {
						p.sendMessage(Main.Prefix+"§cDu besitzt nicht genügend§6 Coins§c!");
						Sounds.noPermSound(p);
					}
				} else {
					p.sendMessage(Main.Prefix+"§cDu besitzt den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c!");
					Sounds.noPermSound(p);
					p.closeInventory();
				}
			}
			ScoreboardAPI.setScoreboardIngame(p);
		}
	}

}
