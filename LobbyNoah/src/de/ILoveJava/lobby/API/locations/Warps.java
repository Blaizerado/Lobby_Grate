package de.ILoveJava.lobby.API.locations;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;

import de.ILoveJava.lobby.Main;

public class Warps {
	
	public static File file = new File(Main.getPlugin().getDataFolder().getPath(), "Warps.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
	public static void setWarp(int Warp, Location loc) {
		cfg.set(Warp+".X", Double.valueOf(loc.getX()));
		cfg.set(Warp+".Y", Double.valueOf(loc.getY()));
		cfg.set(Warp+".Z", Double.valueOf(loc.getZ()));
		cfg.set(Warp+".YAW", Float.valueOf(loc.getYaw()));
		cfg.set(Warp+".PITCH", Float.valueOf(loc.getPitch()));
		cfg.set(Warp+".WORLD", loc.getWorld().getName());
		
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Location getWarp(int Warp) {
		Location loc = new Location(Bukkit.getWorld(cfg.getString(Warp+".WORLD")), cfg.getDouble(Warp+".X"), cfg.getDouble(Warp+".Y"), cfg.getDouble(Warp+".Z"));
		loc.setYaw((float)cfg.getDouble(Warp+".YAW"));
		loc.setPitch((float)cfg.getDouble(Warp+".PITCH"));
		return loc;
		
	}
	
}
