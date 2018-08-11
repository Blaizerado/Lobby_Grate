package de.ILoveJava.lobby.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.Actions;
import de.ILoveJava.lobby.API.Sounds;
import de.ILoveJava.lobby.files.Playerdata;

public class CMDmoney implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		if(command.getName().equalsIgnoreCase("money")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(args.length == 0) {
					p.sendMessage(Main.Prefix+"§7Deine §6Coins§8:§e "+Playerdata.getCoins(p));
					Sounds.levelUpSound(p, 3, 3);
				} else if(args.length == 1) {
					Player t = Bukkit.getPlayer(args[0]);
					if(t !=null) {
						p.sendMessage(Main.Prefix+"§7Die §6Coins§7 von§b "+args[0]+"§8:§e "+Playerdata.getCoins(t));
						Sounds.levelUpSound(p, 3, 3);
					} else Actions.offline(p);
				} else Actions.verwendung(p, "money§8 <§eSpieler§8>");
				
			} else sender.sendMessage(Main.console);
		}
		
		return false;
	}
	

}
