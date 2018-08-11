package de.ILoveJava.lobby.API;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.ILoveJava.lobby.Main;

public class Actions {
	
	public static void NoPerms(Player p) {
		p.sendMessage(Main.keinerechte);
		Sounds.noPermSound(p);
	}
	public static void verwendung(Player p, String msg) {
		p.sendMessage(Main.verwendung+"/"+msg);
		Sounds.woodClick(p);
	}
	public static void offline(Player p){
		p.sendMessage(Main.off);
		Sounds.woodClick(p);
	}
	public static void nichtGekauftKopf(Player p, InventoryClickEvent e) {
		p.sendMessage(Main.Prefix+"§cDu hast dir den Kopf§e "+e.getCurrentItem().getItemMeta().getDisplayName()+"§c noch nicht gekauft!");
		Sounds.woodClick(p);
		p.closeInventory();
	}
	public static void KopfTragen(Player p, String name, String owner, InventoryClickEvent e) {
		p.sendMessage(Main.Prefix+"§7Du hast den "+e.getCurrentItem().getItemMeta().getDisplayName()+"§7-Kopf angezogen!");
		p.getInventory().setHelmet(Items.getSkull(name, owner));
		Sounds.levelUpSound(p, 3, 3);
		p.closeInventory();
	}

}
