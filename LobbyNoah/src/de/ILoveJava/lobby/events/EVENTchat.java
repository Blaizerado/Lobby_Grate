package de.ILoveJava.lobby.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.Sounds;

public class EVENTchat implements Listener {
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		if(p.hasPermission("lobby.premium") || p.hasPermission("lobby.team") || p.hasPermission("lobby.chat")) {
			e.setCancelled(false);
		} else {
			e.setCancelled(true);
			p.sendMessage(Main.Prefix+"§cDu benötigst einen§6 Rang§c um etwas zuschreiben!");
			Sounds.woodClick(p);
		}
		
	}

}
