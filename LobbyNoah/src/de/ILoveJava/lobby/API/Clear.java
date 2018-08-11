package de.ILoveJava.lobby.API;

import org.bukkit.entity.Player;

public class Clear {
	
	public static void ArmorClear(Player p) {
		p.getInventory().setHelmet(null);
		p.getInventory().setChestplate(null);
		p.getInventory().setLeggings(null);
		p.getInventory().setBoots(null);
	}
	public static void invClear(Player p) {
		p.getInventory().clear();
	}
	public static void AllClear(Player p) {
		p.getInventory().clear();
		p.getInventory().setHelmet(null);
		p.getInventory().setChestplate(null);
		p.getInventory().setLeggings(null);
		p.getInventory().setBoots(null);
	}
}
