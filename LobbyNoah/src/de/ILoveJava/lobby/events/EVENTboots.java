package de.ILoveJava.lobby.events;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import de.ILoveJava.lobby.API.Listen;

public class EVENTboots implements Listener {
	@EventHandler
	public void onBoots(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if(Listen.red.contains(p.getName())) {
			p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
		} else if(Listen.blue.contains(p.getName())) {
			p.getWorld().playEffect(p.getLocation(), Effect.WATERDRIP, 3);
		} else if(Listen.portal.contains(p.getName())) {
			p.getWorld().playEffect(p.getLocation(), Effect.PORTAL, 1, 1);
		}
	}

}
