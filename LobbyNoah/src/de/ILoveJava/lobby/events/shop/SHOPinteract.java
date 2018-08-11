package de.ILoveJava.lobby.events.shop;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import de.ILoveJava.lobby.API.Invs;
import de.ILoveJava.lobby.API.Sounds;

public class SHOPinteract implements Listener {

	@EventHandler
	public void onInteract(PlayerInteractEntityEvent e) {
		Player p = e.getPlayer();
		if(e.getRightClicked() instanceof Villager) {
			e.setCancelled(true);
			Invs.Shop(p);
			Sounds.playSound(p, Sound.CHICKEN_EGG_POP, 1, 1);
		}
		
	}
	
}
