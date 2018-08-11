package de.ILoveJava.lobby.events.invclicks;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.ILoveJava.lobby.API.Invs;

public class INVCLICKr�nge implements Listener {
	
	@EventHandler
	public void onR�nge(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equalsIgnoreCase("�eR�NGE")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getItemMeta().getDisplayName().toLowerCase().contains("zur�ck")) {
				Invs.Shop(p);
			}
		}
	}

}
