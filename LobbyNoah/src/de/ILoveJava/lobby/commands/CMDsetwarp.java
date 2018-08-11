package de.ILoveJava.lobby.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.Actions;
import de.ILoveJava.lobby.API.Sounds;
import de.ILoveJava.lobby.API.locations.Warps;

public class CMDsetwarp implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		if(command.getName().equalsIgnoreCase("setwarp")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(p.hasPermission("lobby.admin")) {
					if(args.length == 1) {
						try {
							int warp = Integer.parseInt(args[0]);
							Warps.setWarp(warp, p.getLocation());
							p.sendMessage(Main.Prefix+"§7Du hast die Warp§e "+warp+"§7 erstellt!");
							Sounds.levelUpSound(p, 3, 3);
						} catch (NumberFormatException e) {
							p.sendMessage(Main.Prefix+"§cBitte gebe eine Zahl ein!");
							Sounds.woodClick(p);
						}
					} else Actions.verwendung(p, "setwarp §8<§e1-5§8>");
				} else Actions.NoPerms(p);
			} else sender.sendMessage(Main.console);
		}	
		return false;
	}
}
