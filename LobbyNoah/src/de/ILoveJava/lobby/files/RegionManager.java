package de.ILoveJava.lobby.files;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.bukkit.block.Block;
import org.bukkit.configuration.file.YamlConfiguration;

import de.ILoveJava.lobby.Main;

public class RegionManager {

	public static File file = new File(Main.getPlugin().getDataFolder().getPath(), "Regions.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
	public static void save() {
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void addRegion(String region, UUID owner, int x1, int x2, int z1, int z2) {
		cfg.set(region+".owner", owner.toString());
		cfg.set(region+".x1", x1);
		cfg.set(region+".x2", x1);
		cfg.set(region+".z1", x1);
		cfg.set(region+".z2", x1);
		save();
		
	}
	
	public static UUID getRegionOwner(Block b) {
		for(String name : cfg.getConfigurationSection("").getKeys(false)) {
			int x1 = cfg.getInt(name+".x1");
			int x2 = cfg.getInt(name+".x2");
			int z1 = cfg.getInt(name+".z1");
			int z2 = cfg.getInt(name+".z2");
			
			if(((x1 <= b.getX() && x2 >= b.getX()) || (x1 >= b.getX() && x2 <= b.getX()) && (z1 <= b.getZ() && z2 >= b.getZ()) || ((z1 >= b.getX() && z2 <= b.getX())))) {
				String uuid = cfg.getString(name+".owner");
				return UUID.fromString(uuid);
			}
			
		}
		return null;
	}
	
	
	
}
