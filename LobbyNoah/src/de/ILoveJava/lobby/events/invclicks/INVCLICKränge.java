package de.ILoveJava.lobby.events.invclicks;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.ILoveJava.lobby.API.Invs;

public class INVCLICKränge implements Listener {
	
	@EventHandler
	public void onRänge(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equalsIgnoreCase("§eRÄNGE")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getItemMeta().getDisplayName().toLowerCase().contains("zurück")) {
				Invs.Shop(p);
			}
		}
	}

}
