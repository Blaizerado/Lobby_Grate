package de.ILoveJava.lobby.events.shop;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class SHOPdamage implements Listener {
	
	@EventHandler
	public void onDamage(EntityDamageEvent e) {
		if(e.getEntityType() == EntityType.VILLAGER) {
			e.setCancelled(true);
		}
	}

}
