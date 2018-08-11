package de.ILoveJava.lobby.API;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class Hide {
	
	public static void verstecken(Player p) {
		for(Player all : Bukkit.getOnlinePlayers()) {
			p.hidePlayer(all);
		}
		p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1.0F, 2.0F);
	    p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20, 999999));
	}
	public static void nurVips(Player p) {
		for(Player all : Bukkit.getOnlinePlayers()) {
			if(!all.hasPermission("lobby.admin") ||!all.hasPermission("lobby.premium") || !all.hasPermission("lobby.team")) {
				p.hidePlayer(all);
			}
		}
		p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1.0F, 2.0F);
	    p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20, 999999));
	    
	    
	}
	public static void anzeigen(Player p) {
	    for (Player all : Bukkit.getOnlinePlayers()) {
	      p.showPlayer(all);
	    }
	    p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1.0F, 2.0F);
	    p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20, 999999));
	  }
	}
