package de.ILoveJava.lobby.API;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class Sounds {
	
	public static Sound playSound(Player p, Sound sound, int amout, int volume) {
		p.playSound(p.getLocation(), sound, amout, volume);
		return sound;
		
		
	}
	public static Sound noPermSound(Player p) {
		p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
		return null;
		
	}
	public static Sound errorSound(Player p) {
		p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);
		return null;
		
	}
	public static Sound levelUpSound(Player p, int amout, int volume) {
		p.playSound(p.getLocation(), Sound.LEVEL_UP, amout, volume);
		return null;
		
	}
	public static Sound woodClick(Player p) {
		p.playSound(p.getLocation(), Sound.WOOD_CLICK, 1, 1);
		return null;
		
	}
	public static Sound openInv(Player p) {
		p.playSound(p.getLocation(), Sound.CHEST_OPEN, 10, 10);
		return null;
	}
	public static Sound egg(Player p) {
		Sounds.playSound(p, Sound.CHICKEN_EGG_POP, 1, 1);
		return null;
	}

}
