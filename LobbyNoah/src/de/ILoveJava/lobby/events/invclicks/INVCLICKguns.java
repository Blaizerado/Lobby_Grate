package de.ILoveJava.lobby.events.invclicks;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.ILoveJava.lobby.API.Actions;
import de.ILoveJava.lobby.API.Invs;
import de.ILoveJava.lobby.API.Kits;

public class INVCLICKguns implements Listener {
	
	@EventHandler
	public void onLobbyMiniGames(InventoryClickEvent e) {
		if(e.getInventory().getTitle().equalsIgnoreCase("§6GUNS")) {
			e.setCancelled(true);
			Player p = (Player) e.getWhoClicked();
			if(e.getCurrentItem().getType() == Material.IRON_HOE) {
				Kits.particlegun(p);
				p.closeInventory();
			} else if(e.getCurrentItem().getType() == Material.GOLD_HOE) {
				if(p.hasPermission("lobby.team") || p.hasPermission("lobby.premium")) {
					Kits.withergun(p);
					p.closeInventory();
				} else Actions.NoPerms(p);
			} else if(e.getCurrentItem().getType() == Material.DIAMOND_HOE) {
				if(p.hasPermission("lobby.team") || p.hasPermission("lobby.premium")) {
					Kits.endergun(p);
					p.closeInventory();
				} else Actions.NoPerms(p);
			} else if(e.getCurrentItem().getType() == Material.BARRIER) {
				p.closeInventory();
				Kits.join(p);
			} else if(e.getCurrentItem().getType() == Material.SKULL_ITEM) {
				Invs.Extras(p);
			}
		}
	}

}
