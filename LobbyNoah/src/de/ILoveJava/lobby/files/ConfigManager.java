package de.ILoveJava.lobby.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import de.ILoveJava.lobby.Main;


public class ConfigManager {
	
	public static File getConfigFile() {
		return new File(Main.getPlugin().getDataFolder().getPath(), "config.yml");
	}
	
	public static FileConfiguration getConfigFileConfiguration() {
		return YamlConfiguration.loadConfiguration(getConfigFile());
	}
	
	
	public static void setStandartConfig() {
		if(!getConfigFile().exists()) {
			FileConfiguration cfg = getConfigFileConfiguration();
			cfg.options().copyDefaults(true);
			cfg.set("Messages.NoPerms", "&cLeider hast du &4KEINE&c Berechtigung!");
			cfg.set("Messages.Aliases", "&cVerwendung&8|&e ");
			cfg.set("Options.VoteRewardCoins", 100);
			cfg.set("Options.PvPZone", "PvPZone");
			
			cfg.set("Broadcast.ActionBar.1", "&fBesuche doch mal unsere &eWebside&f &f(&6/web&f) ");
			cfg.set("Broadcast.ActionBar.2", "&fBesuche doch mal unseren &eTeamspeak&f &f(&6/ts&f) ");
			cfg.set("Broadcast.ActionBar.3", "&fBesuche doch mal unseren &9Discord-Server&f &f(&6/Discord&f) ");
			cfg.set("Broadcast.ActionBar.4", "&fUnser&0 You&cTube&f Kanal&8:&e ReloadedGen");
			cfg.set("Broadcast.ActionBar.5", "&fDu brauchst Hilfe, gebe einfach&e /support&f ein! ");
			
			
			cfg.set("Teleporter.Spawn.Name", "&5Spawn");
			cfg.set("Teleporter.Spawn.Material", "NETHER_STAR");
			cfg.set("Teleporter.Spawn.InventorySlot", 22);
			cfg.set("Teleporter.Spawn.TimerInTicks", 19);
			
			cfg.set("Teleporter.LobbyPvP.Name", "&aLobbyPvP");
			cfg.set("Teleporter.LobbyPvP.Material", "IRON_SWORD");
			cfg.set("Teleporter.LobbyPvP.InventorySlot", 8);
			cfg.set("Teleporter.LobbyPvP.TimerInTicks", 21);
			
			
			cfg.set("Teleporter.Warp1.Name", "&aExample1");
			cfg.set("Teleporter.Warp1.Material", "WORKBENCH");
			cfg.set("Teleporter.Warp1.InventorySlot", 19);
			cfg.set("Teleporter.Warp1.TimerInTicks", 15);
			
			cfg.set("Teleporter.Warp2.Name", "&cExample2");
			cfg.set("Teleporter.Warp2.Material", "DIAMOND_SWORD");
			cfg.set("Teleporter.Warp2.InventorySlot", 21);
			cfg.set("Teleporter.Warp2.TimerInTicks", 17);
			
			cfg.set("Teleporter.Warp3.Name", "&6Example3");
			cfg.set("Teleporter.Warp3.Material", "DIAMOND_PICKAXE");
			cfg.set("Teleporter.Warp3.InventorySlot", 4);
			cfg.set("Teleporter.Warp3.TimerInTicks", 19);
			
			cfg.set("Teleporter.Warp4.Name", "&bExample4");
			cfg.set("Teleporter.Warp4.Material", "CHEST");
			cfg.set("Teleporter.Warp4.InventorySlot", 40);
			cfg.set("Teleporter.Warp4.TimerInTicks", 19);
			
			cfg.set("Teleporter.Warp5.Name", "&eExample5");
			cfg.set("Teleporter.Warp5.Material", "BOW");
			cfg.set("Teleporter.Warp5.InventorySlot", 25);
			cfg.set("Teleporter.Warp5.TimerInTicks", 21);
			
			
			try {
				cfg.save(getConfigFile());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} 
	}
	public static void setDebugConfig() {
			FileConfiguration cfg = getConfigFileConfiguration();
			cfg.options().copyDefaults(true);
			cfg.set("Messages.NoPerms", "&cLeider hast du &4KEINE&c Berechtigung!");
			cfg.set("Messages.Aliases", "&cVerwendung&8|&e ");
			cfg.set("Options.VoteRewardCoins", 100);
			cfg.set("Options.PvPZone", "PvPZone");
			cfg.set("Broadcast.ActionBar.1", "&fBesuche doch mal unsere &eWebside&f &f(&6/web&f) ");
			cfg.set("Broadcast.ActionBar.2", "&fBesuche doch mal unseren &eTeamspeak&f &f(&6/ts&f) ");
			cfg.set("Broadcast.ActionBar.3", "&fBesuche doch mal unseren &9Discord-Server&f &f(&6/Discord&f) ");
			cfg.set("Broadcast.ActionBar.4", "&fUnser&0 You&cTube&f Kanal&8:&e ReloadedGen");
			cfg.set("Broadcast.ActionBar.5", "&fDu brauchst Hilfe, gebe einfach&e /support&f ein! ");
			
			
			cfg.set("Teleporter.Spawn.Name", "&5Spawn");
			cfg.set("Teleporter.Spawn.Material", "NETHER_STAR");
			cfg.set("Teleporter.Spawn.InventorySlot", 22);
			cfg.set("Teleporter.Spawn.TimerInTicks", 19);
			
			cfg.set("Teleporter.LobbyPvP.Name", "&aLobbyPvP");
			cfg.set("Teleporter.LobbyPvP.Material", "IRON_SWORD");
			cfg.set("Teleporter.LobbyPvP.InventorySlot", 8);
			cfg.set("Teleporter.LobbyPvP.TimerInTicks", 21);
			
			
			cfg.set("Teleporter.Warp1.Name", "&aExample1");
			cfg.set("Teleporter.Warp1.Material", "WORKBENCH");
			cfg.set("Teleporter.Warp1.InventorySlot", 19);
			cfg.set("Teleporter.Warp1.TimerInTicks", 15);
			
			cfg.set("Teleporter.Warp2.Name", "&cExample2");
			cfg.set("Teleporter.Warp2.Material", "DIAMOND_SWORD");
			cfg.set("Teleporter.Warp2.InventorySlot", 21);
			cfg.set("Teleporter.Warp2.TimerInTicks", 17);
			
			cfg.set("Teleporter.Warp3.Name", "&6Example3");
			cfg.set("Teleporter.Warp3.Material", "DIAMOND_PICKAXE");
			cfg.set("Teleporter.Warp3.InventorySlot", 4);
			cfg.set("Teleporter.Warp3.TimerInTicks", 19);
			
			cfg.set("Teleporter.Warp4.Name", "&bExample4");
			cfg.set("Teleporter.Warp4.Material", "CHEST");
			cfg.set("Teleporter.Warp4.InventorySlot", 40);
			cfg.set("Teleporter.Warp4.TimerInTicks", 19);
			
			cfg.set("Teleporter.Warp5.Name", "&eExample5");
			cfg.set("Teleporter.Warp5.Material", "BOW");
			cfg.set("Teleporter.Warp5.InventorySlot", 25);
			cfg.set("Teleporter.Warp5.TimerInTicks", 21);
			
			
			try {
				cfg.save(getConfigFile());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		
	}

	public static void readConfig() {
		FileConfiguration cfg = getConfigFileConfiguration();
		Main.keinerechte = Main.Prefix+ChatColor.translateAlternateColorCodes('&', cfg.getString("Messages.NoPerms"));
		Main.verwendung = Main.Prefix+ChatColor.translateAlternateColorCodes('&', cfg.getString("Messages.Aliases"));
		
	}
	
	public static void setNextEvent(int day, int month, int year) {
		FileConfiguration cfg = getConfigFileConfiguration();
		cfg.set("Options.NextEvent", day+"."+month+"."+year);
		
		try {
			cfg.save(getConfigFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static String getBroadcastActionBar(String name) {
		return ChatColor.translateAlternateColorCodes('&', getConfigFileConfiguration().getString("Broadcast.ActionBar."+name));
	}
	
	public static int getInventorySlot(String Warp) {
		return getConfigFileConfiguration().getInt("Teleporter."+Warp+".InventorySlot");
	}
	
	public static int getTimerInTicks(String Warp) {
		return getConfigFileConfiguration().getInt("Teleporter."+Warp+".TimerInTicks");
	}
	
	public static String getSpawnName() {
		return getConfigFileConfiguration().getString("Teleporter.Spawn.Name");
	}
	public static Material getMarerial(String Warp) {
		return Material.valueOf(getConfigFileConfiguration().getString("Teleporter."+Warp+".Material"));
	}
	public static String getWarp1Name() {
		return getConfigFileConfiguration().getString("Teleporter.Warp1.Name");
	}
	public static String getWarp2Name() {
		return getConfigFileConfiguration().getString("Teleporter.Warp2.Name");
	}
	public static String getWarp3Name() {
		return getConfigFileConfiguration().getString("Teleporter.Warp3.Name");
	}
	public static String getWarp4Name() {
		return getConfigFileConfiguration().getString("Teleporter.Warp4.Name");
	}
	public static String getWarp5Name() {
		return getConfigFileConfiguration().getString("Teleporter.Warp5.Name");
	}
	
	public static String getName(String Warp) {
		return getConfigFileConfiguration().getString("Teleporter."+Warp+".Name");
	}
	
}
