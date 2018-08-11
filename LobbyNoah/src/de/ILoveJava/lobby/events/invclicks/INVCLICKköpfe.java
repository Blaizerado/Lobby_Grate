package de.ILoveJava.lobby.events.invclicks;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.Actions;
import de.ILoveJava.lobby.API.Clear;
import de.ILoveJava.lobby.API.Invs;
import de.ILoveJava.lobby.API.Sounds;
import de.ILoveJava.lobby.files.Playerdata;

public class INVCLICKköpfe implements Listener {
	
	@EventHandler
	public void onKöpfe(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getTitle().equalsIgnoreCase("§bKÖPFE")) {
			if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Alpaka")) {
				if(Playerdata.hasHead(p, "SKULLalpaka") || p.hasPermission("lobby.premium")) {
					Actions.KopfTragen(p, "§fAlpaka", "AlpakaPo", e);
				} else Actions.nichtGekauftKopf(p, e);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Höhlenspinne")) {
				if(Playerdata.hasHead(p, "SKULLholenspinne") || p.hasPermission("lobby.premium")) {
					Actions.KopfTragen(p, "§aHöhlenspinne", "MHF_CaveSpider", e);
				} else Actions.nichtGekauftKopf(p, e);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Huhn")) {
				if(Playerdata.hasHead(p, "SKULLhuhn") || p.hasPermission("lobby.premium")) {
					Actions.KopfTragen(p, "§fHuhn", "MHF_Chicken", e);
				} else Actions.nichtGekauftKopf(p, e);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Kuh")) {
				if(Playerdata.hasHead(p, "SKULLkuh") || p.hasPermission("lobby.premium")) {
					Actions.KopfTragen(p, "§fKuh", "MHF_Cow", e);
				} else Actions.nichtGekauftKopf(p, e);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Pilzkuh")) {
				if(Playerdata.hasHead(p, "SKULLpilzkuh") || p.hasPermission("lobby.premium")) {
					Actions.KopfTragen(p, "§cPilzkuh", "MHF_MushroomCow", e);
				} else Actions.nichtGekauftKopf(p, e);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Schwein")) {
				if(Playerdata.hasHead(p, "SKULLschwein") || p.hasPermission("lobby.premium")) {
					Actions.KopfTragen(p, "§dSchwein", "MHF_Pig", e);
				} else Actions.nichtGekauftKopf(p, e);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Schaf")) {
				if(Playerdata.hasHead(p, "SKULLschaf") || p.hasPermission("lobby.premium")) {
					Actions.KopfTragen(p, "§fSchaf", "MHF_Sheep", e);
				} else Actions.nichtGekauftKopf(p, e);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Tintenfisch")) {
				if(Playerdata.hasHead(p, "SKULLtintenfisch") || p.hasPermission("lobby.premium")) {
					Actions.KopfTragen(p, "§9Tintenfisch", "MHF_Squid", e);
				} else Actions.nichtGekauftKopf(p, e);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Kaktus")) {
				if(Playerdata.hasHead(p, "SKULLkaktus") || p.hasPermission("lobby.premium")) {
					Actions.KopfTragen(p, "§2Kaktus", "MHF_Cactus", e);
				} else Actions.nichtGekauftKopf(p, e);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Melone")) {
				if(Playerdata.hasHead(p, "SKULLmelone") || p.hasPermission("lobby.premium")) {
					Actions.KopfTragen(p, "§aMelone", "MHF_Melon", e);
				} else Actions.nichtGekauftKopf(p, e);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§cTNT")) {
				if(Playerdata.hasHead(p, "SKULLtnt") || p.hasPermission("lobby.premium")) {
					Actions.KopfTragen(p, "§cTNT", "MHF_TNT", e);
				} else Actions.nichtGekauftKopf(p, e);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Holz")) {
				if(Playerdata.hasHead(p, "SKULLholz") || p.hasPermission("lobby.premium")) {
					Actions.KopfTragen(p, "§aHolz", "MHF_OakLog", e);
				} else Actions.nichtGekauftKopf(p, e);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§4TNT")) {
				if(Playerdata.hasHead(p, "SKULLtnt2") || p.hasPermission("lobby.premium")) {
					Actions.KopfTragen(p, "§4TNT", "MHF_TNT2", e);
				} else Actions.nichtGekauftKopf(p, e);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Zurück")) {
				Invs.Extras(p);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Kein Kopf")) {
				if(p.getInventory().getHelmet() == null) {
					p.sendMessage(Main.Prefix+"§cDu trägst keinen Kopf!");
					Sounds.woodClick(p);
					p.closeInventory();
				} else {
					p.sendMessage(Main.Prefix+"§7Du trägst nun keinen Kopf mehr!");
					Clear.ArmorClear(p);
					Sounds.levelUpSound(p, 3, 3);
					p.closeInventory();
				}
			}
		}
	}

}
