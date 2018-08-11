package de.ILoveJava.lobby.API;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.files.Playerdata;
import net.md_5.bungee.api.ChatColor;

public class ScoreboardAPI {
	
	public static void setScoreboardIngame(Player p) {
		
		
		ScoreboardManager sm = Bukkit.getScoreboardManager();
    	final Scoreboard board = sm.getNewScoreboard();
    	final Objective o = board.registerNewObjective("test", "dummy");
    	
    	Team Coins = board.registerNewTeam("Coins");
    	Coins.setPrefix(""+Playerdata.getCoins(p));
    	Coins.setSuffix("");
    	Coins.addEntry(ChatColor.AQUA.toString());
    	
    	Team Online = board.registerNewTeam("Online");
    	Online.setPrefix(""+Bukkit.getOnlinePlayers().size());
    	Online.setSuffix("");
    	Online.addEntry(ChatColor.BLACK.toString());
    	
    	o.setDisplaySlot(DisplaySlot.SIDEBAR);
    	o.setDisplayName("§6§l"+p.getName());
    	
    	o.getScore(" ").setScore(13);
    	o.getScore("§7Teamspeak§8:").setScore(12);
    	o.getScore("§8➥ "+Main.scorets).setScore(11);
    	o.getScore("  ").setScore(10);
    	o.getScore("§7Deine Coins§8:").setScore(9);
    	o.getScore("§8➥§e "+ChatColor.AQUA.toString()).setScore(8);
    	o.getScore("   ").setScore(7);
    	o.getScore("§7Online§8:").setScore(6);
    	o.getScore("§8➥§a "+ChatColor.BLACK.toString()+"§7/§c100").setScore(5);
    	o.getScore("    ").setScore(4);	
    	o.getScore("§7Webside§8:").setScore(3);
    	o.getScore("§8➥§b "+Main.web).setScore(2);
    	o.getScore("     ").setScore(1);
    	p.setScoreboard(board);
    	
    	
    }
	
	
	public static void update() {
		new BukkitRunnable() {
			
			@Override
			public void run() {
				for(Player p : Bukkit.getOnlinePlayers()) {
					Scoreboard board = p.getScoreboard();
					board.getTeam("Coins").setPrefix(""+Playerdata.getCoins(p));
					board.getTeam("Online").setPrefix(""+Bukkit.getOnlinePlayers().size());
				}
			}
		}.runTaskTimer(Main.getInstance(), 0, 75L);
	}
	
}
