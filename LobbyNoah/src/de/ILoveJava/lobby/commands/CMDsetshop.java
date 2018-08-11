package de.ILoveJava.lobby.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.API.Actions;
import de.ILoveJava.lobby.API.CraftEntitys;
import de.ILoveJava.lobby.API.Sounds;

public class CMDsetshop implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		if(command.getName().equalsIgnoreCase("setshop")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(p.hasPermission("lobby.admin")) {
					if(args.length == 0) {
						Villager v = (Villager) p.getWorld().spawnEntity(p.getLocation(), EntityType.VILLAGER);
						v.setCustomName("§e§lSHOP");
						v.setCustomNameVisible(true);
						CraftEntitys.freezeEntity(v);
						p.sendMessage(Main.Prefix+"§7Du hast den§e§l Shop§7 erstellt!");
						Sounds.levelUpSound(p, 3, 3);
					} else Actions.verwendung(p, "setshop");
				} else Actions.NoPerms(p);
			} else sender.sendMessage(Main.console);
		}
		return false;
	}
}
