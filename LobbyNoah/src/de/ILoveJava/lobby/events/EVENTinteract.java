package de.ILoveJava.lobby.events;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.WitherSkull;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.Invs;
import de.ILoveJava.lobby.API.Listen;
import de.ILoveJava.lobby.API.Sounds;

public class EVENTinteract implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			Player p = e.getPlayer();
			if(p.getItemInHand().getType() == Material.COMPASS) {
				Invs.Teleporter(p);
				Sounds.playSound(p, Sound.HORSE_ARMOR, 1, 1);
			} else if(p.getItemInHand().getType() == Material.BLAZE_ROD) {
				Invs.Hide(p);
				Sounds.playSound(p, Sound.CHICKEN_EGG_POP, 1, 1);
			} else if(p.getItemInHand().getType() == Material.NETHER_STAR) {
				Invs.Teleporter(p);
				Sounds.playSound(p, Sound.HORSE_ARMOR, 1, 1);
			} else if(p.getItemInHand().getType() == Material.CHEST) {
				Invs.Extras(p);
				Sounds.openInv(p);
			} else if(p.getItemInHand().getType() == Material.IRON_HOE) {
				if(!Listen.particle.contains(p.getName())) {
					p.launchProjectile(Snowball.class);
					Sounds.woodClick(p);
					Listen.particle.add(p.getName());
					Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
						
						@Override
						public void run() {
							Listen.particle.remove(p.getName());
							
						}
					}, 2*20);
				} 
			} else if(p.getItemInHand().getType() == Material.GOLD_HOE) {
				if(!Listen.wither.contains(p.getName())) {
					p.launchProjectile(WitherSkull.class);
					Sounds.playSound(p, Sound.WITHER_SHOOT, 1, 1);
					Listen.wither.add(p.getName());
					Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
						
						@Override
						public void run() {
							Listen.wither.remove(p.getName());
							
						}
					}, 2*20);
				} 
			} else if(p.getItemInHand().getType() == Material.DIAMOND_HOE) {
				if(!Listen.ender.contains(p.getName())) {
					p.launchProjectile(EnderPearl.class);
					Sounds.playSound(p, Sound.WITHER_SHOOT, 1, 1);
					Listen.ender.add(p.getName());
					Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
						
						@Override
						public void run() {
							Listen.ender.remove(p.getName());
							
						}
					}, 2*20);
				} 
			}
		}
	}
	@EventHandler
	public void onColorGun(ProjectileHitEvent e) {
		if(e.getEntity() instanceof Snowball) {
			Location loc = e.getEntity().getLocation();
		    loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 1);
		    loc.getWorld().playEffect(loc, Effect.SMOKE, 1);
		    for (Player all : Bukkit.getOnlinePlayers()) {
		    	all.playSound(loc, Sound.BAT_HURT, 1.0F, 0.5F);
		   }
		} else if(e.getEntity() instanceof EnderPearl) {
			Location loc = e.getEntity().getLocation();
			loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 1);
		    loc.getWorld().playEffect(loc, Effect.SMOKE, 1);
		}
	}

}
