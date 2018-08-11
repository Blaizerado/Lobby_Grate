package de.ILoveJava.lobby.events;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.FishHook;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.entity.Rabbit;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Squid;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.Kits;
import de.ILoveJava.lobby.API.Listen;
import de.ILoveJava.lobby.API.Sounds;
import de.ILoveJava.lobby.API.locations.Spawn;


public class EVENTblock implements Listener {
	
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		World world = p.getWorld();
		p.setFallDistance(-99999);
		p.getWorld().setThundering(false);
		p.getWorld().setTime(5000);
		p.getWorld().setDifficulty(Difficulty.PEACEFUL);
		world.setStorm(false);
		world.getLivingEntities().clear();
		for(Entity entity : p.getWorld().getEntities()) {
			if(entity instanceof Sheep) {
				entity.remove();
			} else if(entity instanceof Chicken) {
				entity.remove();
			} else if(entity instanceof Rabbit) {
				entity.remove();
			} else if(entity instanceof Pig) {
				entity.remove();
			} else if(entity instanceof Cow) {
				entity.remove();
			} else if(entity instanceof Rabbit) {
				entity.remove();
			} else if(entity instanceof Squid) {
				entity.remove();
			} else if(entity instanceof Horse) {
				entity.remove();
			}
		}
	}
	@EventHandler 
	public void onBreak(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		if(Listen.build.contains(p.getName())) {
			e.setCancelled(false);
		} else {
			e.setCancelled(true);
		}
	}
	@EventHandler 
	public void onBreak(BlockBreakEvent e) {
		e.setCancelled(true);
		Player p = e.getPlayer();
		if(Listen.build.contains(p.getName())) {
			e.setCancelled(false);
		} else {
			e.setCancelled(true);
		}
	}
	@EventHandler 
	public void onPick(PlayerPickupItemEvent e) {
		Player p = e.getPlayer();
		if(!Listen.build.contains(p.getName())) {
			e.setCancelled(true);
		}
		
	}
	@EventHandler
	public void onDrop(PlayerDropItemEvent e) {
		Player p = e.getPlayer();
		if(!Listen.build.contains(p.getName())) {
			e.setCancelled(true);
		}
	}
	@EventHandler
	public void invClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(!Listen.build.contains(p.getName())) {
			e.setCancelled(true);
		}
	}
	@EventHandler 
	public void onFood(FoodLevelChangeEvent e) {
		e.setCancelled(true);
		Player p = (Player) e.getEntity();
		if(e.getFoodLevel() != 20) {
			p.setFoodLevel(20);
		}
	}
	@EventHandler
	public void onDeath(EntityDeathEvent e) {
		e.setDroppedExp(0);
		e.getDrops().clear();
	}
	  @EventHandler
	  public void onDamage(EntityDamageByEntityEvent e) {
		  if(e.getEntity() instanceof Player && e.getDamager() instanceof Player || e.getDamager() instanceof FishHook) {
			  Player target = (Player)e.getEntity();
			  Player killer = (Player) e.getDamager();
			  if(Listen.pvp.contains(target) && Listen.pvp.contains(killer)){
				  
			  } else {
				  e.setCancelled(true);  
			  }
		  } else {
			  e.setCancelled(true);
		  }
	  }
	
	@EventHandler
	public void onExplode(EntityExplodeEvent e) {
		e.setCancelled(true);
	}
	@EventHandler 
	public void onPlayerDeath(PlayerDeathEvent e) {
		Player p = e.getEntity();
		e.setDeathMessage(null);
		e.getDrops().clear();
		e.setDroppedExp(0);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> p.spigot().respawn(), 19);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> p.teleport(Spawn.getSpawn()), 20);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> p.getInventory().clear(), 21);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> Kits.join(p), 22);
		
		if(p.getKiller() instanceof Player && p.getKiller() !=null) {
			p.sendMessage(Main.Prefix+"§7Du wurdest von§e "+p.getKiller().getName()+"§c getötet§7!");
			Sounds.woodClick(p);
			p.getKiller().sendMessage(Main.Prefix+"§7Du hast§e "+p.getName()+"§a getötet§7!");
			Sounds.levelUpSound(p.getKiller(), 3, 3);
			Listen.pvp.remove(p);
		}
	}
	
	

}
