package de.ILoveJava.lobby.API;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;

public class Kits {
	
	public static void join(Player p) {
		p.getInventory().setItem(0, Items.createItem(Material.NETHER_STAR, 0, "§bTeleporter", 1));
		p.getInventory().setItem(1, Items.createItem(Material.BLAZE_ROD, 0, "§6Spieler verstecken", 1));
		
		p.getInventory().setItem(4, Items.createItem(Material.BARRIER, 0, "§cKein Gadget ausgewählt", 1));
		
		p.getInventory().setItem(7, Items.getSkull("§dFreunde", p.getName()));
		
		p.getInventory().setItem(8, Items.createItem(Material.CHEST, 0, "§cExtras", 1));
	}
	public static void PvP(Player p) {
		p.getInventory().clear();
		p.getInventory().setItem(0, Items.createItemWithEnchItemFlag(Material.IRON_SWORD, 0, "§6Schwert", 1, Enchantment.DURABILITY, 99999, ItemFlag.HIDE_ENCHANTS));
		p.getInventory().setItem(1, Items.createItem(Material.GOLDEN_APPLE, 0, "§6Goldapfel", 1));
		p.getInventory().setItem(8, Items.createItemWithEnchItemFlag(Material.FISHING_ROD, 0, "§6Angel", 1, Enchantment.DURABILITY, 99999, ItemFlag.HIDE_ENCHANTS));
		p.getInventory().setHelmet(Items.createItemWithEnchItemFlag(Material.IRON_HELMET, 0, "§6Helm", 1, Enchantment.DURABILITY, 9999, ItemFlag.HIDE_ENCHANTS));
		p.getInventory().setChestplate(Items.createItemWithEnchItemFlag(Material.IRON_CHESTPLATE, 0, "§6Brustplatte", 1, Enchantment.DURABILITY, 9999, ItemFlag.HIDE_ENCHANTS));
		p.getInventory().setLeggings(Items.createItemWithEnchItemFlag(Material.IRON_LEGGINGS, 0, "§6Hose", 1, Enchantment.DURABILITY, 9999, ItemFlag.HIDE_ENCHANTS));
		p.getInventory().setBoots(Items.createItemWithEnchItemFlag(Material.IRON_BOOTS, 0, "§6Schuhe", 1, Enchantment.DURABILITY, 9999, ItemFlag.HIDE_ENCHANTS));
		
	}
	public static void particlegun(Player p) {
		p.getInventory().setItem(4, Items.createItem(Material.IRON_HOE, 0, "§bParticle§f-§6Gun", 1));
	}
	public static void withergun(Player p) {
		p.getInventory().setItem(4, Items.createItem(Material.GOLD_HOE, 0, "§8Wither§f-§6Gun", 1));
	}
	public static void endergun(Player p) {
		p.getInventory().setItem(4, Items.createItem(Material.DIAMOND_HOE, 0, "§5Ender§f-§6Gun", 1));
	}
}
