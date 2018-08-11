package de.ILoveJava.lobby.events;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.vexsoftware.votifier.model.Vote;
import com.vexsoftware.votifier.model.VotifierEvent;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.files.ConfigManager;
import de.ILoveJava.lobby.files.Playerdata;

public class EVENTvote implements Listener {
	
	@SuppressWarnings("null")
	@EventHandler
	public void onVote(VotifierEvent e) {
		Vote v = e.getVote();
		Player p = Bukkit.getPlayer(v.getUsername());
		Player voter = Bukkit.getPlayerExact(v.getUsername());
		
		if((voter != null) || (voter.isOnline())) {
			Playerdata.addVotes(voter, ConfigManager.getConfigFileConfiguration().getInt("Options.VoteRewardCoins"));
			for(Player all : Bukkit.getOnlinePlayers()) {
				all.sendMessage(Main.pr2+"§7Der Spieler§e "+voter.getName()+"§7 hat für uns gevotet!\n§7Seine Belohnung§8:§e "+ConfigManager.getConfigFileConfiguration().getInt("Options.VoteRewardCoins")+"§6 Coins");
				all.playSound(p.getLocation(), Sound.LEVEL_UP, 5.0F, 5.0F);
			}
		}
	}

}
