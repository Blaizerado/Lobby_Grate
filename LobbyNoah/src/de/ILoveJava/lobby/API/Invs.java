package de.ILoveJava.lobby.API;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import de.ILoveJava.lobby.Main;
import de.ILoveJava.lobby.files.ConfigManager;

public class Invs {
	
	public static void Teleporter(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9*5, "§bTELEPORTER");
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(ConfigManager.getInventorySlot("Spawn"), Items.createItemWithEnchItemFlag(ConfigManager.getMarerial("Spawn"), 0, ChatColor.translateAlternateColorCodes('&', ConfigManager.getSpawnName()), 1, Enchantment.ARROW_DAMAGE, 1, ItemFlag.HIDE_ENCHANTS)), ConfigManager.getTimerInTicks("Spawn"));
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1), ConfigManager.getTimerInTicks("Spawn"));
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(ConfigManager.getInventorySlot("Warp1"), Items.createItemWithEnchItemFlag(ConfigManager.getMarerial("Warp1"), 0, ChatColor.translateAlternateColorCodes('&', ConfigManager.getWarp1Name()), 1, Enchantment.ARROW_DAMAGE, 1, ItemFlag.HIDE_ENCHANTS)), ConfigManager.getTimerInTicks("Warp1"));
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1), ConfigManager.getTimerInTicks("Warp1"));
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(ConfigManager.getInventorySlot("Warp2"), Items.createItemWithEnchItemFlag(ConfigManager.getMarerial("Warp2"), 0, ChatColor.translateAlternateColorCodes('&', ConfigManager.getWarp2Name()), 1, Enchantment.ARROW_DAMAGE, 1, ItemFlag.HIDE_ENCHANTS)), ConfigManager.getTimerInTicks("Warp2"));
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1), ConfigManager.getTimerInTicks("Warp2"));
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(ConfigManager.getInventorySlot("Warp3"), Items.createItemWithEnchItemFlag(ConfigManager.getMarerial("Warp3"), 0, ChatColor.translateAlternateColorCodes('&', ConfigManager.getWarp3Name()), 1, Enchantment.ARROW_DAMAGE, 1, ItemFlag.HIDE_ENCHANTS)), ConfigManager.getTimerInTicks("Warp3"));
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1), ConfigManager.getTimerInTicks("Warp3"));
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(ConfigManager.getInventorySlot("Warp4"), Items.createItemWithEnchItemFlag(ConfigManager.getMarerial("Warp4"), 0, ChatColor.translateAlternateColorCodes('&', ConfigManager.getWarp4Name()), 1, Enchantment.LUCK, 1, ItemFlag.HIDE_ENCHANTS)), ConfigManager.getTimerInTicks("Warp4"));
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1), ConfigManager.getTimerInTicks("Warp4"));
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(ConfigManager.getInventorySlot("Warp5"), Items.createItemWithEnchItemFlag(ConfigManager.getMarerial("Warp5"), 0, ChatColor.translateAlternateColorCodes('&', ConfigManager.getWarp5Name()), 1, Enchantment.ARROW_DAMAGE, 1, ItemFlag.HIDE_ENCHANTS)), ConfigManager.getTimerInTicks("Warp5"));
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1), ConfigManager.getTimerInTicks("Warp5"));
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(ConfigManager.getInventorySlot("LobbyPvP"), Items.createItemWithEnchItemFlag(ConfigManager.getMarerial("LobbyPvP"), 0, ChatColor.translateAlternateColorCodes('&', ConfigManager.getName("LobbyPvP")), 1, Enchantment.ARROW_DAMAGE, 1, ItemFlag.HIDE_ENCHANTS)), ConfigManager.getTimerInTicks("LobbyPvP"));
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1), ConfigManager.getTimerInTicks("LobbyPvP"));
		
		p.openInventory(inv);
	}
	public static void Extras(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9*3, "§cEXTRAS");
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 1; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
				
			}
		}, 10);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 2; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 15);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 3; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 20);
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(10, Items.createLeatherArmor(Material.LEATHER_BOOTS, "§9Boots", 1, Color.BLUE)), 26);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(13 ,Items.getSkull("§bKöpfe", "MHF_Cow")), 27);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(16 ,Items.createItem(Material.GOLD_HOE, 0, "§6Guns", 1)), 28);
		
		p.openInventory(inv);
	}
	public static void Boots(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9*3, "§9BOOTS");
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 9 * 1; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 10);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 2; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 15);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 3; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 20);
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(10, Items.createLeatherArmor(Material.LEATHER_BOOTS, "§9Wasser", 1, Color.BLUE)), 26);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(13, Items.createLeatherArmor(Material.LEATHER_BOOTS, "§6Feuer", 1, Color.ORANGE)), 27);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(16 ,Items.createLeatherArmor(Material.LEATHER_BOOTS, "§5Portal", 1, Color.PURPLE)), 28);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(26, Items.createItem(Material.BARRIER, 0, "§cKeine Boots", 1)), 29);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(18 ,Items.getSkullBack()), 30);
		
		p.openInventory(inv);
	}
	public static void Köpfe(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9*4, "§bKÖPFE");
		
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 1; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 10);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 2; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 15);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 3; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 20);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 4; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 25);
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				inv.setItem(10, Items.getSkull("§fAlpaka", "AlpakaPo"));
				inv.setItem(11, Items.getSkull("§aHöhlenspinne", "MHF_CaveSpider"));
				inv.setItem(12, Items.getSkull("§fHuhn", "MHF_Chicken"));
				inv.setItem(13, Items.getSkull("§fKuh", "MHF_Cow"));
				inv.setItem(14, Items.getSkull("§cPilzkuh", "MHF_MushroomCow"));
				inv.setItem(15, Items.getSkull("§dSchwein", "MHF_Pig"));
				inv.setItem(16, Items.getSkull("§fSchaf", "MHF_Sheep"));
			}
		}, 30);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				inv.setItem(19, Items.getSkull("§9Tintenfisch", "MHF_Squid"));
				inv.setItem(20, Items.getSkull("§2Kaktus", "MHF_Cactus"));
				inv.setItem(21, Items.getSkull("§aMelone", "MHF_Melon"));
				inv.setItem(22, Items.getSkull("§6Kürbis", "MHF_Pumpkin"));
				inv.setItem(23, Items.getSkull("§cTNT", "MHF_TNT"));
				inv.setItem(24, Items.getSkull("§aHolz", "MHF_OakLog"));
				inv.setItem(25, Items.getSkull("§4TNT", "MHF_TNT2"));
			}
		}, 35);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(27, Items.getSkullBack()), 30);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(35, Items.createItem(Material.BARRIER, 0, "§cKein Kopf", 1)), 32);
		
		p.openInventory(inv);
	}
	public static void Hide(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9*3, "§6SPIELER VERSTECKEN");
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 1; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 10);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 2; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 15);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 3; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 20);
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(10, Items.createItem(Material.STAINED_CLAY, 5, "§aAlle Spieler anzeigen", 1)), 25);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(13, Items.createItem(Material.STAINED_CLAY, 10, "§5Nur VIPS/ Teammitglieder anzeigen", 1)), 26);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(16, Items.createItem(Material.STAINED_CLAY, 14, "§cAlle Spieler verstecken", 1)), 27);
		
		p.openInventory(inv);
	}
	
	
	public static void Guns(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9*3, "§6GUNS");
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 1; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 10);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 2; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 15);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 9 * 3; i++) {
					ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
					ItemMeta m = s.getItemMeta();
					m.setDisplayName(" ");
					s.setItemMeta(m);
					inv.setItem(i, s);
				}
				Sounds.egg(p);
			}
		}, 20);
		
		
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(10, Items.createItem(Material.IRON_HOE, 0, "§bParticle§f-§6Gun", 1)), 25);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(13, Items.createItem(Material.GOLD_HOE, 0, "§8Wither§f-§6Gun", 1)), 26);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(16, Items.createItem(Material.DIAMOND_HOE, 0, "§5Ender§f-§6Gun", 1)), 27);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(18, Items.getSkullBack()), 28);
		Bukkit.getScheduler().runTaskLater(Main.getPlugin(Main.class), () -> inv.setItem(26, Items.createItem(Material.BARRIER, 0, "§cKeine Gun", 1)), 29);
		
		
		p.openInventory(inv);
	}
	
	
	public static void Shop(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9*3, "§eSHOP");
		
		for (int i = 0; i < 9 * 3; i++) {
			ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
			ItemMeta m = s.getItemMeta();
			m.setDisplayName(" ");
			s.setItemMeta(m);
			inv.setItem(i, s);
		}
		inv.setItem(10, Items.getSkull("§bKöpfe", "AlpakaPo"));
		inv.setItem(13, Items.createLeatherArmor(Material.LEATHER_BOOTS, "§9Boots", 1, Color.BLUE));
		inv.setItem(16, Items.createItem(Material.COMMAND, 0, "§eRänge", 1));
		
		p.openInventory(inv);
	}
	
	
	public static void KöpfeKaufen(Player p) {
		
		Inventory inv = Bukkit.createInventory(null, 9*4, "§bKöpfe Kaufen");
		
		for (int i = 0; i < 9 * 4; i++) {
			ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
			ItemMeta m = s.getItemMeta();
			m.setDisplayName(" ");
			s.setItemMeta(m);
			inv.setItem(i, s);
		}
		inv.setItem(10, Items.getSkullWithLore("§fAlpaka", "AlpakaPo", Main.pr3+"400§6 Coins "));
		inv.setItem(11, Items.getSkullWithLore("§aHöhlenspinne", "MHF_CaveSpider", Main.pr3+"300§6 Coins "));
		inv.setItem(12, Items.getSkullWithLore("§fHuhn", "MHF_Chicken", Main.pr3+"300§6 Coins "));
		inv.setItem(13, Items.getSkullWithLore("§fKuh", "MHF_Cow", Main.pr3+"300§6 Coins "));
		inv.setItem(14, Items.getSkullWithLore("§cPilzkuh", "MHF_MushroomCow", Main.pr3+"300§6 Coins "));
		inv.setItem(15, Items.getSkullWithLore("§dSchwein", "MHF_Pig", Main.pr3+"300§6 Coins "));
		inv.setItem(16, Items.getSkullWithLore("§fSchaf", "MHF_Sheep", Main.pr3+"300§6 Coins "));
		inv.setItem(19, Items.getSkullWithLore("§9Tintenfisch", "MHF_Squid", Main.pr3+"300§6 Coins "));
		inv.setItem(20, Items.getSkullWithLore("§2Kaktus", "MHF_Cactus", Main.pr3+"300§6 Coins "));
		inv.setItem(21, Items.getSkullWithLore("§aMelone", "MHF_Melon", Main.pr3+"300§6 Coins "));
		inv.setItem(22, Items.getSkullWithLore("§6Kürbis", "MHF_Pumpkin", Main.pr3+"300§6 Coins "));
		inv.setItem(23, Items.getSkullWithLore("§cTNT", "MHF_TNT", Main.pr3+"300§6 Coins "));
		inv.setItem(24, Items.getSkullWithLore("§aHolz", "MHF_OakLog", Main.pr3+"300§6 Coins "));
		inv.setItem(25, Items.getSkullWithLore("§4TNT", "MHF_TNT2", Main.pr3+"300§6 Coins "));
		inv.setItem(27, Items.getSkullBack());
		p.openInventory(inv);
		
	}
	
	
	public static void BootsKaufen(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9*3, "§9Boots Kaufen");
		for (int i = 0; i < 9 * 3; i++) {
			ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
			ItemMeta m = s.getItemMeta();
			m.setDisplayName(" ");
			s.setItemMeta(m);
			inv.setItem(i, s);
		}
		inv.setItem(10, Items.createLeatherArmorWithLore(Material.LEATHER_BOOTS, "§9Wasser", 1, Color.BLUE, Main.pr3+"§e500§6 Coins"));
		inv.setItem(13, Items.createLeatherArmorWithLore(Material.LEATHER_BOOTS, "§6Feuer", 1, Color.ORANGE, Main.pr3+"§e750§6 Coins"));
		inv.setItem(16, Items.createLeatherArmorWithLore(Material.LEATHER_BOOTS, "§5Portal", 1, Color.PURPLE, Main.pr3+"§e350§6 Coins"));
		inv.setItem(18, Items.getSkullBack());
		p.openInventory(inv);
	}
	public static void Ränge(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9*3, "§eRÄNGE");
		for (int i = 0; i < 9 * 3; i++) {
			ItemStack s = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
			ItemMeta m = s.getItemMeta();
			m.setDisplayName(" ");
			s.setItemMeta(m);
			inv.setItem(i, s);
		}		
		
		ItemStack Ultimativ = new ItemStack(Material.GOLDEN_APPLE, 1);
	    ItemMeta UltimativMeta = Ultimativ.getItemMeta();
	    UltimativMeta.setDisplayName("§6Ultimativ");
	    UltimativMeta.setLore(Arrays.asList(new String[] {"§7Kosten§8:", Main.pr3+"§e10,- €", "§aVorteile§8:", "§7-§e EggDrop§8 (10% Chance ein Monsterei vom Monster zu bekommen)", "§7-§e /itemname§8 (Benne Items)", "§7-§e /wb§8 (Werkbank öffnen)", "§7-§e /near§8 (Schaue welche Spieler sich in deiner Nähe befinden)", "§7-§e /heal§8 (Heile dich alle 10 Minuten)", ""}));
	    Ultimativ.setItemMeta(UltimativMeta);
		
	    ItemStack Legendary = new ItemStack(Material.DIAMOND, 1);
	    ItemMeta LegendaryMeta = Legendary.getItemMeta();
	    LegendaryMeta.setDisplayName("§9Legendary");
	    LegendaryMeta.setLore(Arrays.asList(new String[] {"§7Kosten§8:", Main.pr3+"§e15,- €", "§aVorteile§8:", "§7-§e Mehr Platz im Rucksack §8(§e/backpack§8)", "§7-§e /instantsmelt §8(Alle Erze im Inventar schmelzen nur jede 5 Minuten)", ""}));
	    Legendary.setItemMeta(LegendaryMeta);
	    
	    ItemStack Premiumplus = new ItemStack(Material.GOLDEN_APPLE, 1, (short) 1);
	    ItemMeta PremiumplusMeta = Premiumplus.getItemMeta();
	    PremiumplusMeta.setDisplayName("§6Premium§e+");
	    PremiumplusMeta.setLore(Arrays.asList(new String[] {"§7Anforderungen§8:", "§7-§b 75 Abos", "§7-§b 2 Videos pro Monat", "§7-§b 2000 Kanalaufrufe", "§7-§b 25 Views pro Video", "§aVorteile§8:", "§7-§e EnderHoock", "§7-§e 20 Coins monatlich", "§7-§e SILENT Lobby", "§7-§e /tptoggle §8(TP-Anfragen werden blockiert)", "§7-§e /start §8(Starte eine Minigamerunde)", "§7-§e /nick §8(Bekomme einen falschen Name)", ""}));
	    Premiumplus.setItemMeta(PremiumplusMeta);
	    
	    ItemStack Youtuber = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());
	    SkullMeta YoutuberMeta = (SkullMeta) Youtuber.getItemMeta();
	    YoutuberMeta.setOwner("MHF_YouTube");
	    YoutuberMeta.setDisplayName("§5Youtuber");
	    YoutuberMeta.setLore(Arrays.asList(new String[] {"§7Anforderungen§8:", "§7-§b 150 Abos", "§7-§b 4 Videos pro Monat", "§7-§b 5000 Kanalaufrufe", "§7-§b 40 Views pro Video", "§aVorteile§8:", "§7-§e Alle Hooks", "§7-§e 50 Coins monatlich", "§7-§e Zugang zu BETA Modien", "§7-§e Maps Forcen §8(Es wird zu 100% die ausgewählte Map gespielt)", "§7-§e Kompletter Coinshop freigeschaltet §8(Lobby)", ""}));
	    Youtuber.setItemMeta(YoutuberMeta);
	    
		inv.setItem(10, Items.createItemWithLore6(Material.APPLE, 0, "§dSuper", 1, "§7Kosten§8:", Main.pr3+"§e6,- €", "§aVorteile§8:", "§7-§e /ec§8 (Zugriff auf deine Mobile Endertruhe)", "§7-§e /stack§8 (Stacke deine Sachen)", "§7-§e /repair§8 (Repariere dein Inventar jede 5 Minuten)"));
		inv.setItem(11, Ultimativ);
		
		inv.setItem(13, Legendary);
		
		inv.setItem(15, Premiumplus);
		inv.setItem(16, Youtuber);
		inv.setItem(18, Items.getSkullBack());
		p.openInventory(inv);
	}

}