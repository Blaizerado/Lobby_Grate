package de.ILoveJava.lobby.events.pvp;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;

import com.mewin.WGRegionEvents.events.RegionEnterEvent;
import com.mewin.WGRegionEvents.events.RegionLeaveEvent;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.Clear;
import de.ILoveJava.lobby.API.Kits;
import de.ILoveJava.lobby.API.Listen;
import de.ILoveJava.lobby.API.Sounds;
import de.ILoveJava.lobby.files.ConfigManager;

public class PVPjoin_leave implements Listener {
	
	@EventHandler
	public void onPvPJoin(RegionEnterEvent e) {
		Player p = e.getPlayer();
		if(e.getRegion().getId().equalsIgnoreCase(ConfigManager.getConfigFileConfiguration().getString("Options.PvPZone"))) {
			Listen.pvp.add(p);
			p.sendMessage(Main.Prefix+"§7Du hast die§e PvPZone§a betreten§7!");
			Kits.PvP(p);
			Sounds.levelUpSound(p, 3, 3);
			Listen.red.remove(p.getName());
			Listen.blue.remove(p.getName());
			Listen.portal.remove(p.getName());
		}
	}
	
	@EventHandler
	public void onPvPLeave(RegionLeaveEvent e) {
		Player p = e.getPlayer();
		if(e.getRegion().getId().equalsIgnoreCase(ConfigManager.getConfigFileConfiguration().getString("Options.PvPZone"))) {
			Clear.AllClear(p);
			Listen.pvp.remove(p);
			p.sendMessage(Main.Prefix+"§7Du hast die§e PvPZone§c verlassen§7!");
			Kits.join(p);
			Sounds.woodClick(p);
			for(PotionEffect effect : p.getActivePotionEffects()){
			    p.removePotionEffect(effect.getType());
			}
		}
	}
	

}
