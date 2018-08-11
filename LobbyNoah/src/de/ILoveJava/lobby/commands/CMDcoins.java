package de.ILoveJava.lobby.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.ScoreboardAPI;
import de.ILoveJava.lobby.API.Sounds;
import de.ILoveJava.lobby.files.Playerdata;

public class CMDcoins implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		
		if(command.getName().equalsIgnoreCase("coin") || command.getName().equalsIgnoreCase("coins")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(p.hasPermission("lobby.admin")) {
					if(args.length == 3) {
						Player t = Bukkit.getPlayer(args[1]);
						if(t !=null) {
							if(Playerdata.getCoins(t) > 1000000) {
								p.sendMessage(Main.Prefix+"§cDie maximal Coins sind:§e 1.000.000");
								Sounds.woodClick(p);
							} else {
								
								int number = Integer.parseInt(args[2]);
								if(number > 1000000) {
									
									p.sendMessage(Main.Prefix+"§cDie maximal Coins sind:§e 1.000.000");
									Sounds.woodClick(p);
								} else {
									if(args[0].equalsIgnoreCase("add")) {
										Playerdata.addCoins(t, number);
										p.sendMessage(Main.Prefix+"§7Du hast§e "+t.getName()+"§b "+number+"§7 Coins§a hinzugefügt§7!");
										Sounds.levelUpSound(p, 3, 3);
									} else if(args[0].equalsIgnoreCase("remove")) {
										p.sendMessage(Main.Prefix+"§7Du hast§e "+t.getName()+"§b "+number+"§7 Coins§c entzogen§7!");
										Sounds.levelUpSound(p, 3, 3);
										Playerdata.removeCoins(t, number);
									}  else if(args[0].equalsIgnoreCase("set")) {
										Playerdata.setCoins(t, number);
										p.sendMessage(Main.Prefix+"§7Du hast die Coins von§e "+t.getName()+"§7 auf§b "+number+"§6 gesetzt§7!");
										Sounds.levelUpSound(p, 3, 3);
									} else {
										p.sendMessage(Main.verwendung+"/coins§8 <§eadd§3 /§e remove§3 /§e set§8> <§eSpieler§8>§8 <§eZahl§8> ");
										Sounds.woodClick(p);
									}
								}
							}
							ScoreboardAPI.setScoreboardIngame(t);
							ScoreboardAPI.setScoreboardIngame(p);
						} else {
							p.sendMessage(Main.off);
							Sounds.woodClick(p);
						}
					} else {
						p.sendMessage(Main.verwendung+"/coins§8 <§eadd§3 /§e remove§3 /§e set§8> <§eSpieler§8>§8 <§eZahl§8> ");
						Sounds.woodClick(p);
					}
				} else {
					p.sendMessage(Main.keinerechte);
					Sounds.noPermSound(p);
				}
				
			} else sender.sendMessage(Main.console);
		}
		
		return false;
	}
}
