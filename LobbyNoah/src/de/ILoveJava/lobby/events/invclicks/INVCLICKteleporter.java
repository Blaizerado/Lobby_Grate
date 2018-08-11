package de.ILoveJava.lobby.events.invclicks;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.ILoveJava.lobby.API.locations.LobbyPvP;
import de.ILoveJava.lobby.API.locations.Spawn;
import de.ILoveJava.lobby.API.locations.Warps;
import de.ILoveJava.lobby.files.ConfigManager;

public class INVCLICKteleporter implements Listener {
	
	@EventHandler
	public void onTeleporter(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getTitle().contains("TELEPORTER")) {
			e.setCancelled(true);
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', ConfigManager.getWarp1Name()))) {
				p.teleport(Warps.getWarp(1));
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', ConfigManager.getWarp2Name()))) {
				p.teleport(Warps.getWarp(2));
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', ConfigManager.getWarp3Name()))) {
				p.teleport(Warps.getWarp(3));
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', ConfigManager.getWarp4Name()))) {
				p.teleport(Warps.getWarp(4));
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', ConfigManager.getWarp5Name()))) {
				p.teleport(Warps.getWarp(5));
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', ConfigManager.getSpawnName()))) {
				p.teleport(Spawn.getSpawn());
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
			} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', ConfigManager.getName("LobbyPvP")))) {
				p.teleport(LobbyPvP.getLobbyPvP());
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
			}
		}
	}

}
