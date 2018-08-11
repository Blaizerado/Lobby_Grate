package de.ILoveJava.lobby.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class EVENTjumppads implements Listener {
	
	@EventHandler
	public void onJumppads(PlayerMoveEvent e) {
		Player p = e.getPlayer();
	    if ((p.getLocation().getBlock().getType() == Material.WOOD_PLATE)) {
	    	Vector v = p.getLocation().getDirection().multiply(3.5D).setY(0.7D);
	    	p.setVelocity(v);
	    	p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 3.0F, 1.0F);
	    	p.getVelocity();
	    }
	}
}
