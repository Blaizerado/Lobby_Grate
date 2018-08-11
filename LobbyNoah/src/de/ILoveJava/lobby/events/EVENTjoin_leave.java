package de.ILoveJava.lobby.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.Clear;
import de.ILoveJava.lobby.API.Kits;
import de.ILoveJava.lobby.API.Listen;
import de.ILoveJava.lobby.API.ScoreboardAPI;
import de.ILoveJava.lobby.API.Sounds;
import de.ILoveJava.lobby.API.locations.Spawn;
import de.ILoveJava.lobby.files.Playerdata;

public class EVENTjoin_leave implements Listener {
	
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if(!Playerdata.exists(p)) {
			Playerdata.addPlayer(p);
		} else {
			Playerdata.addCoins(p, 1);
			Playerdata.removeCoins(p, 1);
		}
		e.setJoinMessage(null);
		p.setLevel(0);
		Clear.AllClear(p);
		p.setAllowFlight(false);
		p.setFlying(false);
		p.sendMessage("                                ");
		p.sendMessage("                                ");
		p.sendMessage("                                ");
		p.sendMessage("                                ");
		p.sendMessage("                                ");
		p.sendMessage("                                ");
		p.sendMessage("                                ");
		p.sendMessage("                                ");
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> p.teleport(Spawn.getSpawn()), 21);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> p.sendTitle(Main.scorets, "§4Web§8 »§e /web§4 Ts³§8 »§e /ts§4 Vote§8 »§e /vote"), 23);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> Kits.join(p), 22);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> Sounds.levelUpSound(p, 1, 1), 23);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> Playerdata.addName(p), 40);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> ScoreboardAPI.setScoreboardIngame(p), 24);
		
		for(Player all : Bukkit.getOnlinePlayers()) {
			Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> ScoreboardAPI.setScoreboardIngame(all), 24);
		}
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				long jetzt = System.currentTimeMillis();
				if(Listen.belohnung.containsKey(p.getName())) {
					long be = ((Long)Listen.belohnung.get(p.getName())).longValue();
					int rest = (int)(be + 86400000L - jetzt);
					if (rest > 0) {
		                return;
		              } else {
		            	  Listen.belohnung.remove(p.getName());
		            	  Listen.belohnung.put(p.getName(), Long.valueOf(jetzt));
		      			p.sendMessage(Main.Prefix+"§7Für dein tägliches Login bekommst du§e 15§6 Coins§7!");
		      			Sounds.levelUpSound(p, 3, 3);
		      			p.closeInventory();
		      			Playerdata.addCoins(p, 15);
		      			ScoreboardAPI.setScoreboardIngame(p);
		              }
				} else {
					Listen.belohnung.put(p.getName(), Long.valueOf(jetzt));
					p.sendMessage(Main.Prefix+"§7Für dein tägliches Login bekommst du§e 15§6 Coins§7!");
					Sounds.levelUpSound(p, 3, 3);
					p.closeInventory();
					Playerdata.addCoins(p, 15);
					ScoreboardAPI.setScoreboardIngame(p);
				}
				
			}
		}, 24);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		e.setQuitMessage(null);
		Player p = e.getPlayer();
		if(Listen.pvp.contains(p.getName())) {
			Listen.pvp.remove(p.getName());
		}
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				ScoreboardAPI.setScoreboardIngame(p);
			}
			
		}, 20);	
	}
}
