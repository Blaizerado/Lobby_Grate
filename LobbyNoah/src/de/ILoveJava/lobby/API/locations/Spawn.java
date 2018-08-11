package de.ILoveJava.lobby.API.locations;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;

import de.ILoveJava.lobby.Main;


public class Spawn {
	
	public static File file = new File(Main.getPlugin().getDataFolder().getPath()+"/Teleports/Spawn.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
	public static void saveSpawn() {
	    try {
	      cfg.save(file);
	    }
	    catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	  
	  public static void setSpawn(Location loc) {
	    cfg.set("Spawn.x", Double.valueOf(loc.getX()));
	    cfg.set("Spawn.y", Double.valueOf(loc.getY()));
	    cfg.set("Spawn.z", Double.valueOf(loc.getZ()));
	    cfg.set("Spawn.yaw", Float.valueOf(loc.getYaw()));
	    cfg.set("Spawn.pitch", Float.valueOf(loc.getPitch()));
	    cfg.set("Spawn.world", loc.getWorld().getName());
	    saveSpawn();
	  }
	  
	  public static Location getSpawn() {
	    Location loc = new Location(Bukkit.getWorld(cfg.getString("Spawn.world")), cfg.getDouble("Spawn.x"), cfg.getDouble("Spawn.y"), cfg.getDouble("Spawn.z"));
	    loc.setYaw((float)cfg.getDouble("Spawn.yaw"));
	    loc.setPitch((float)cfg.getDouble("Spawn.pitch"));
	    return loc;
	  }

}
