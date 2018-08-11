package de.ILoveJava.lobby.events;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;

public class EVENTsounds implements Listener {
	
	  @EventHandler
	  public void onHeldItem(PlayerItemHeldEvent e) {
	    Player p = e.getPlayer();
	    p.playSound(p.getLocation(), Sound.NOTE_STICKS, 3.0F, 2.0F);
	  }
	  
}