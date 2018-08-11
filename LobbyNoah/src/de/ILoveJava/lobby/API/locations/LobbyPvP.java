package de.ILoveJava.lobby.API.locations;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;

import de.ILoveJava.lobby.Main;

public class LobbyPvP {

	public static File file = new File(Main.getPlugin().getDataFolder().getPath()+"/Teleports/LobbyPvP.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
	public static void saveLobbyPvP() {
	    try {
	      cfg.save(file);
	    }
	    catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	  
	  public static void setLobbyPvP(Location loc) {
	    cfg.set("LobbyPvP.x", Double.valueOf(loc.getX()));
	    cfg.set("LobbyPvP.y", Double.valueOf(loc.getY()));
	    cfg.set("LobbyPvP.z", Double.valueOf(loc.getZ()));
	    cfg.set("LobbyPvP.yaw", Float.valueOf(loc.getYaw()));
	    cfg.set("LobbyPvP.pitch", Float.valueOf(loc.getPitch()));
	    cfg.set("LobbyPvP.world", loc.getWorld().getName());
	    saveLobbyPvP();
	  }
	  
	  public static Location getLobbyPvP() {
	    Location loc = new Location(Bukkit.getWorld(cfg.getString("LobbyPvP.world")), cfg.getDouble("LobbyPvP.x"), cfg.getDouble("LobbyPvP.y"), cfg.getDouble("LobbyPvP.z"));
	    loc.setYaw((float)cfg.getDouble("LobbyPvP.yaw"));
	    loc.setPitch((float)cfg.getDouble("LobbyPvP.pitch"));
	    return loc;
	  }
	
}
