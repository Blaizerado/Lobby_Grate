package de.ILoveJava.lobby.events.invclicks;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.ILoveJava.lobby.API.Invs;

public class INVCLICKextras implements Listener {
	
	@EventHandler
	public void onExtras(InventoryClickEvent e) {
		if(e.getInventory().getTitle().equalsIgnoreCase("§cEXTRAS")) {
			e.setCancelled(true);
			Player p = (Player) e.getWhoClicked();
			if(e.getCurrentItem().getType() == Material.LEATHER_BOOTS) {
				Invs.Boots(p);
			} else if(e.getCurrentItem().getType() == Material.SKULL_ITEM) {
				Invs.Köpfe(p);
			} else if(e.getCurrentItem().getType() == Material.GOLD_HOE) {
				Invs.Guns(p);
			}
		}
	}

}
