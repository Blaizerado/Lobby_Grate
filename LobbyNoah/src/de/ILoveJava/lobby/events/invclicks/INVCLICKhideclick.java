package de.ILoveJava.lobby.events.invclicks;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.ILoveJava.lobby.API.Hide;

public class INVCLICKhideclick implements Listener {
	
	@EventHandler
	public void onHide(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getTitle().equalsIgnoreCase("§6SPIELER VERSTECKEN")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aAlle Spieler anzeigen")) {
				Hide.anzeigen(p);
				p.closeInventory();
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5Nur VIPS/ Teammitglieder anzeigen")) {
				Hide.nurVips(p);
				p.closeInventory();
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cAlle Spieler verstecken")) {
				Hide.verstecken(p);
				p.closeInventory();
			}
		}
	}

}
