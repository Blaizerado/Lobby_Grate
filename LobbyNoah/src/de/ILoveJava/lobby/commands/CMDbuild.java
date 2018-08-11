package de.ILoveJava.lobby.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.ActionBar;
import de.ILoveJava.lobby.API.Actions;
import de.ILoveJava.lobby.API.Kits;
import de.ILoveJava.lobby.API.Listen;
import de.ILoveJava.lobby.API.Sounds;

public class CMDbuild implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		
		if(command.getName().equalsIgnoreCase("build")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(p.hasPermission("lobby.admin")) {
					if(args.length == 0) {
						if(!Listen.build.contains(p.getName())) {
							Listen.build.add(p.getName());
							p.sendMessage(Main.Prefix+"§7Du hast den Buildmodus§a aktiviert§7!");
							p.setGameMode(GameMode.CREATIVE);
							Sounds.levelUpSound(p, 3, 3);
							p.getInventory().clear();
							ActionBar.sendActionbarAtPlayer(p, "§eBuildmodus§a aktiviert§e!");
							
						} else {
							Listen.build.remove(p.getName());
							p.sendMessage(Main.Prefix+"§7Du hast den Buildmodus§c deaktiviert§7!");
							ActionBar.sendActionbarAtPlayer(p, "§eBuildmodus§c deaktiviert§e!");
							Sounds.woodClick(p);
							p.setGameMode(GameMode.SURVIVAL);
							p.getInventory().clear();
							Kits.join(p);
						}
					} else if(args.length == 1) {
						Player t = Bukkit.getPlayer(args[0]);
						if(t !=null) {
							if(!Listen.build.contains(t.getName())) {
								Listen.build.add(t.getName());
								t.sendMessage(Main.Prefix+"§7Dein§e Buildmodus§7 wurde§a aktiviert§7!");
								ActionBar.sendActionbarAtPlayer(p, "§eBuildmodus§a aktiviert§e!");
								p.sendMessage(Main.Prefix+"§7Du hast den§6 Buildmodus§7 für§e "+t.getName()+"§a aktiviert§7!");
								t.getInventory().clear();
								t.setGameMode(GameMode.CREATIVE);
								Sounds.levelUpSound(p, 3, 3);
								Sounds.levelUpSound(t, 3, 3);
							} else {
								Listen.build.remove(t.getName());
								t.sendMessage(Main.Prefix+"§7Dein§e Buildmodus§7 wurde§c deaktiviert§7!");
								ActionBar.sendActionbarAtPlayer(p, "§eBuildmodus§c deaktiviert§e!");
								p.sendMessage(Main.Prefix+"§7Du hast den§6 Buildmodus§7 für§e "+t.getName()+"§c deaktiviert§7!");
								t.getInventory().clear();
								t.setGameMode(GameMode.SURVIVAL);
								Kits.join(t);
								Sounds.woodClick(p);
								Sounds.woodClick(t);
								
							}
						} else Actions.offline(p);
					} else Actions.verwendung(p, "build§8 <§eSpieler§8>");
				} else Actions.NoPerms(p);
			} else sender.sendMessage(Main.console);
		}
		
		return false;
	}
	

}
