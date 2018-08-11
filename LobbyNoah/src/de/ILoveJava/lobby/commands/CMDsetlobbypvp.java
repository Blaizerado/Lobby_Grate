package de.ILoveJava.lobby.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.Actions;
import de.ILoveJava.lobby.API.Sounds;
import de.ILoveJava.lobby.API.locations.LobbyPvP;

public class CMDsetlobbypvp implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		
		if(command.getName().equalsIgnoreCase("setlobbypvp")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(p.hasPermission("lobby.admin")) {
					if(args.length == 0) {
						LobbyPvP.setLobbyPvP(p.getLocation());
						Sounds.levelUpSound(p, 3, 3);
						p.sendMessage(Main.Prefix+"§7Du hast die Warp§e LobbyPvP§7 gesetzt!");
						
					} else Actions.verwendung(p, "setspawn");
				} else Actions.NoPerms(p);
			} else sender.sendMessage(Main.console);
		}
		
		
		return false;
	}
	
	

}