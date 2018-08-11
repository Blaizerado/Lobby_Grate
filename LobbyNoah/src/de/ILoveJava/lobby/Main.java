package de.ILoveJava.lobby;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.ILoveJava.lobby.API.ActionBar;
import de.ILoveJava.lobby.API.Listen;
import de.ILoveJava.lobby.API.ScoreboardAPI;
import de.ILoveJava.lobby.commands.CMDbuild;
import de.ILoveJava.lobby.commands.CMDcoins;
import de.ILoveJava.lobby.commands.CMDmoney;
import de.ILoveJava.lobby.commands.CMDsetlobbypvp;
import de.ILoveJava.lobby.commands.CMDsetshop;
import de.ILoveJava.lobby.commands.CMDsetspawn;
import de.ILoveJava.lobby.commands.CMDsetwarp;
import de.ILoveJava.lobby.events.EVENTblock;
import de.ILoveJava.lobby.events.EVENTboots;
import de.ILoveJava.lobby.events.EVENTchat;
import de.ILoveJava.lobby.events.EVENTinteract;
import de.ILoveJava.lobby.events.EVENTjoin_leave;
import de.ILoveJava.lobby.events.EVENTjumppads;
import de.ILoveJava.lobby.events.EVENTsounds;
import de.ILoveJava.lobby.events.invclicks.INVCLICKboots;
import de.ILoveJava.lobby.events.invclicks.INVCLICKbootskaufen;
import de.ILoveJava.lobby.events.invclicks.INVCLICKextras;
import de.ILoveJava.lobby.events.invclicks.INVCLICKguns;
import de.ILoveJava.lobby.events.invclicks.INVCLICKhideclick;
import de.ILoveJava.lobby.events.invclicks.INVCLICKr�nge;
import de.ILoveJava.lobby.events.invclicks.INVCLICKteleporter;
import de.ILoveJava.lobby.events.pvp.PVPjoin_leave;
import de.ILoveJava.lobby.events.shop.SHOPclick;
import de.ILoveJava.lobby.events.shop.SHOPdamage;
import de.ILoveJava.lobby.events.shop.SHOPinteract;
import de.ILoveJava.lobby.files.ConfigManager;
import de.ilovejava.coins.Coins;

public class Main extends JavaPlugin {
	
	public static String Prefix = "§6Lobby §7» ";
	public static String pr = "§8» ";
	public static String pr2 = "§7[§a✘§7] ";
	public static String pr3 = "§7» ";
	public static String keinerechte;
	public static String verwendung;
	public static String scorets = "§bReloadedGen§8.§bnet";
	public static String ts = "ReloadedGen.net";
	public static String web = "ReloadedGen.net";
	public static String error = Prefix+"§cUps... Etwas ist schief gelaufen!";
	public static String pex = "lobby.";
	public static String off = Prefix+"§cDieser Spieler ist nicht online!";
	public static String console = "Du musst ein Spieler sein!";
	public static String premi = Prefix+"§cDieses feature ist nur für§6 Premium§r§c Spieler!";
	
	
	
	int automsg = 1;
	
	public static Coins coin;
	public static Main plugin;
	public static Main instance;
	
	
	
	
	@Override
	
	public void onEnable() {
		plugin = this;
		coin = Coins.coins;
		ScoreboardAPI.update();
		//Lobby
		Bukkit.getConsoleSender().sendMessage(Main.Prefix+"§fLade Config");
		ConfigManager.setStandartConfig();
		ConfigManager.readConfig();
		Bukkit.getConsoleSender().sendMessage(Main.Prefix+"§fConfig geladen");
		
		Listen.pvp = new ArrayList<>();
		
		this.getCommand("build").setExecutor(new CMDbuild());
		this.getCommand("coins").setExecutor(new CMDcoins());
		this.getCommand("money").setExecutor(new CMDmoney());
		this.getCommand("setwarp").setExecutor(new CMDsetwarp());
		this.getCommand("setspawn").setExecutor(new CMDsetspawn());
		this.getCommand("setshop").setExecutor(new CMDsetshop());
		this.getCommand("setlobbypvp").setExecutor(new CMDsetlobbypvp());
		
		
		
		PluginManager pm = Bukkit.getPluginManager();
		
		//EVENTS
		pm.registerEvents(new EVENTblock(), this);
		pm.registerEvents(new EVENTchat(), this);
		pm.registerEvents(new EVENTjoin_leave(), this);
		pm.registerEvents(new EVENTinteract(), this);
		pm.registerEvents(new EVENTboots(), this);
		pm.registerEvents(new EVENTsounds(), this);
		pm.registerEvents(new EVENTjumppads(), this);
		
		//INVCLICKS
		pm.registerEvents(new INVCLICKboots(), this);
		pm.registerEvents(new INVCLICKhideclick(), this);
		pm.registerEvents(new INVCLICKteleporter(), this);
		pm.registerEvents(new INVCLICKextras(), this);
		pm.registerEvents(new INVCLICKguns(), this);
		pm.registerEvents(new INVCLICKguns(), this);
		pm.registerEvents(new INVCLICKbootskaufen(), this);
		pm.registerEvents(new INVCLICKbootskaufen(), this);
		pm.registerEvents(new INVCLICKr�nge(), this);
		
		//SHOP
		pm.registerEvents(new SHOPinteract(), this);
		pm.registerEvents(new SHOPclick(), this);
		pm.registerEvents(new SHOPdamage(), this);
		
		
		pm.registerEvents(new PVPjoin_leave(), this);
		autoMSG();
		Bukkit.getConsoleSender().sendMessage(Main.Prefix+"§aAktiviert");
	}
	public static Main getPlugin() {
		return plugin;
		
	}
	
	public static Main getInstance() {
	    return instance;
	}
	
	private void autoMSG() {
	    Bukkit.getScheduler().runTaskTimerAsynchronously(this, new Runnable() {
	      public void run() {
	        switch (Main.this.automsg) {
	        case 1: 
	          ActionBar.sendActionbarAtAll(ConfigManager.getBroadcastActionBar("1"));
	          break;
	        case 2: 
	        	ActionBar.sendActionbarAtAll(ConfigManager.getBroadcastActionBar("2"));
	          break;
	        case 3: 
	        	ActionBar.sendActionbarAtAll(ConfigManager.getBroadcastActionBar("3"));
	          break;
	        case 4: 
	        	ActionBar.sendActionbarAtAll(ConfigManager.getBroadcastActionBar("4"));
	          break;
	        case 5: 
	        	ActionBar.sendActionbarAtAll(ConfigManager.getBroadcastActionBar("5"));
	          break;
	        default: 
	        	ActionBar.sendActionbarAtAll(ConfigManager.getBroadcastActionBar("1"));
	          Main.this.automsg = 1;
	        }
	        Main.this.automsg += 1;
	      }
	    }, 100L, 100L);
	}
}
