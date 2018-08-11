package de.ILoveJava.lobby.events.shop;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.ILoveJava.lobby.API.Invs;

public class SHOPclick implements Listener {
	
	@EventHandler
	public void onMainClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getTitle().equalsIgnoreCase("§eSHOP")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getType() == Material.SKULL_ITEM) {
				Invs.KöpfeKaufen(p);
			} else if(e.getCurrentItem().getType() == Material.LEATHER_BOOTS) {
				Invs.BootsKaufen(p);
			} else if(e.getCurrentItem().getType() == Material.COMMAND) {
				Invs.Ränge(p);
			} 
		}
	}

}
