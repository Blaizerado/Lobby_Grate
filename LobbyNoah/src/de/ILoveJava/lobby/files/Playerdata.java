package de.ILoveJava.lobby.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.uuidfetcher;

public class Playerdata {
	
	public static File file = new File(Main.getPlugin().getDataFolder().getPath(), "Playerdata.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);

	public static void save() {
		try {
			cfg.save(file);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public static void addPlayer(Player p) {
		addName(p);
		cfg.set(p.getUniqueId().toString()+".BOOTwasser", false);
		cfg.set(p.getUniqueId().toString()+".BOOTfeuer", false);
		cfg.set(p.getUniqueId().toString()+".BOOTportal", false);
		
		cfg.set(p.getUniqueId().toString()+".SKULLalpaka", false);
		cfg.set(p.getUniqueId().toString()+".SKULLholenspinne", false);
		cfg.set(p.getUniqueId().toString()+".SKULLhuhn", false);
		cfg.set(p.getUniqueId().toString()+".SKULLkuh", false);
		cfg.set(p.getUniqueId().toString()+".SKULLpilzkuh", false);
		cfg.set(p.getUniqueId().toString()+".SKULLschwein", false);
		cfg.set(p.getUniqueId().toString()+".SKULLschaf", false);
		cfg.set(p.getUniqueId().toString()+".SKULLtintenfisch", false);
		cfg.set(p.getUniqueId().toString()+".SKULLkaktus", false);
		cfg.set(p.getUniqueId().toString()+".SKULLmelone", false);
		cfg.set(p.getUniqueId().toString()+".SKULLkurbis", false);
		cfg.set(p.getUniqueId().toString()+".SKULLtnt", false);
		cfg.set(p.getUniqueId().toString()+".SKULLholz", false);
		cfg.set(p.getUniqueId().toString()+".SKULLtnt2", false);
		
		
		
		save();
	}
	
	public static boolean exists(Player p) {
		if(!(cfg.getString(p.getUniqueId().toString()+".Name") == null)) {
			return true;
		}
		return false;
	}
	
	public static void addVotes(Player p, int Votes) {
		addName(p);
		cfg.set(p.getUniqueId().toString()+".Votes", getVotes(p) + Votes);
		save();
	}
	public static void removeVotes(Player p, int Votes) {
		addName(p);
		cfg.set(p.getUniqueId().toString()+".Votes", getVotes(p) - Votes);
		save();
	}
	public static void setVotes(Player p, int Votes) {
		addName(p);
		cfg.set(p.getUniqueId().toString()+".Votes", Votes);
		save();
	}
	public static int getVotes(Player p) {
		addName(p);
		int votes = cfg.getInt(p.getUniqueId().toString()+".Votes");
		return votes;
		
	}
	public static void addName(Player p) {
		cfg.set(p.getUniqueId().toString()+".Name", p.getName());
		save();
	}
	
	public static int getCoins(Player p) {
		addName(p);
		int coins = cfg.getInt(p.getUniqueId().toString()+".Coins");
		return coins;
	}
	
	
	@SuppressWarnings("static-access")
	public static void addCoins(Player p, int Coins) {
		if(Main.coin.api.CoinsExist(uuidfetcher.getUUID(p.getName()).toString())) {
			Main.coin.api.setCoins(uuidfetcher.getUUID(p.getName()).toString(), 2, Coins);
		}else {Main.coin.api.createCoins(uuidfetcher.getUUID(p.getName()).toString());}
	}
	
	public static void setCoins(Player p, int Coins) {
		addName(p);
		cfg.set(p.getUniqueId().toString()+".Coins", Coins);
		save();
	}
	
	public static void removeCoins(Player p, int Coins) {
		addName(p);
		cfg.set(p.getUniqueId().toString()+".Coins", getCoins(p) - Coins);
		save();
	}
	
	public static int getKills(Player p) {
		addName(p);
		int kills = cfg.getInt(p.getUniqueId().toString()+".Kills");
		return kills;
	}
	public static void addKills(Player p, int Kills) {
		addName(p);
		cfg.set(p.getUniqueId().toString()+".Kills", getKills(p) + Kills);
		save();
	}
	public static void removeKills(Player p, int Kills) {
		addName(p);
		cfg.set(p.getUniqueId().toString()+".Kills", getKills(p) - Kills);
		save();
	}
	public static void setKills(Player p, int Kills) {
		addName(p);
		cfg.set(p.getUniqueId().toString()+".Kills", Kills);
		save();
		
	}
	
	
	
	public static int getTode(Player p) {
		addName(p);
		int Tode = cfg.getInt(p.getUniqueId().toString()+".Tode");
		return Tode;
	}
	public static void addTode(Player p, int Tode) {
		addName(p);
		cfg.set(p.getUniqueId().toString()+".Tode", getTode(p) + Tode);
		save();
	}
	public static void removeTode(Player p, int Tode) {
		addName(p);
		cfg.set(p.getUniqueId().toString()+".Tode", getTode(p) - Tode);
		save();
	}
	public static void setTode(Player p, int Tode) {
		addName(p);
		cfg.set(p.getUniqueId().toString()+".Tode", Tode);
		save();
	}
	
	public static void addBoot(Player p, String boot) {
		cfg.set(p.getUniqueId().toString().toString()+"."+boot, true);
		save();
	}
	
	public static void removeBoot(Player p, String boot) {
		cfg.set(p.getUniqueId().toString().toString()+"."+boot, false);
		save();
	}
	
	public static boolean hasBoot(Player p, String boot) {
		return cfg.getBoolean(p.getUniqueId().toString()+"."+boot);
	}
	
	public static void addHead(Player p, String head) {
		cfg.set(p.getUniqueId().toString().toString()+"."+head, true);
		save();
	}
	
	public static void removeHead(Player p, String head) {
		cfg.set(p.getUniqueId().toString().toString()+"."+head, false);
		save();
	}
	
	public static boolean hasHead(Player p, String head) {
		return cfg.getBoolean(p.getUniqueId().toString()+"."+head);
	}
	
}
