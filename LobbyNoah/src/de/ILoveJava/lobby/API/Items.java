package de.ILoveJava.lobby.API;

import java.util.Arrays;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.PotionEffectType;

public class Items {
	
	public static ItemStack createItemdefault(Material material, int subid, int anzahl) {
	    ItemStack item = new ItemStack(material, anzahl, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    item.setItemMeta(meta);
	    return item;
	  }
	
	public static ItemStack createItem(Material material, int subid, String displayname, int anzahl) {
	    ItemStack item = new ItemStack(material, 1, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    item.setAmount(anzahl);
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createItemWithLore1(Material material, int subid, String displayname,int anzahl, String lore) {
	    ItemStack item = new ItemStack(material, anzahl, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    meta.setLore(Arrays.asList(new String[] {lore}));
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createItemWithLore2(Material material, int subid, String displayname, int anzahl, String lore, String lore2) {
	    ItemStack item = new ItemStack(material, anzahl, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    meta.setLore(Arrays.asList(new String[] {lore, lore2}));
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createItemWithLore3(Material material, int subid, String displayname,int anzahl, String lore, String lore2, String lore3) {
	    ItemStack item = new ItemStack(material, anzahl, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    meta.setLore(Arrays.asList(new String[] {lore, lore2, lore3}));
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createItemWithLore4(Material material, int subid, String displayname,int anzahl, String lore, String lore2, String lore3, String lore4) {
	    ItemStack item = new ItemStack(material, anzahl, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    meta.setLore(Arrays.asList(new String[] {lore, lore2, lore3, lore4}));
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createItemWithLore5(Material material, int subid, String displayname,int anzahl, String lore, String lore2, String lore3, String lore4, String lore5) {
	    ItemStack item = new ItemStack(material, anzahl, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    meta.setLore(Arrays.asList(new String[] {lore, lore2, lore3, lore4, lore5}));
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createItemWithLore6(Material material, int subid, String displayname,int anzahl, String lore, String lore2, String lore3, String lore4, String lore5, String lore6) {
	    ItemStack item = new ItemStack(material, anzahl, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    meta.setLore(Arrays.asList(new String[] {lore, lore2, lore3, lore4, lore5, lore6}));
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createItemWithLore7(Material material, int subid, String displayname,int anzahl, String lore, String lore2, String lore3, String lore4, String lore5, String lore6, String lore7) {
	    ItemStack item = new ItemStack(material, anzahl, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    meta.setLore(Arrays.asList(new String[] {lore, lore2, lore3, lore4, lore5, lore6, lore7}));
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createItemWithLore8(Material material, int subid, String displayname,int anzahl, String lore, String lore2, String lore3, String lore4, String lore5, String lore6, String lore7, String lore8) {
	    ItemStack item = new ItemStack(material, anzahl, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    meta.setLore(Arrays.asList(new String[] {lore, lore2, lore3, lore4, lore5, lore6, lore7, lore8}));
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createItemWithLore9(Material material, int subid, String displayname,int anzahl, String lore, String lore2, String lore3, String lore4, String lore5, String lore6, String lore7, String lore8, String lore9) {
	    ItemStack item = new ItemStack(material, anzahl, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    meta.setLore(Arrays.asList(new String[] {lore, lore2, lore3, lore4, lore5, lore6, lore7, lore8, lore9}));
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createItemWithLore(Material material, int subid, String displayname, String lore, String lore2, String lore3, String lore4, String lore5) {
	    ItemStack item = new ItemStack(material, 1, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    meta.setLore(Arrays.asList(new String[] { lore, lore2, lore3, lore4, lore5}));
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack getSkull(String displayname, String owner) {
	    ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());
	    SkullMeta meta = (SkullMeta) skull.getItemMeta();
	    meta.setDisplayName(displayname);
	    meta.setOwner(owner);
	    skull.setItemMeta(meta);
	    
	    return skull;
	  }
	public static ItemStack getSkullWithLore(String displayname, String owner, String lore) {
	    ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());
	    SkullMeta meta = (SkullMeta) skull.getItemMeta();
	    meta.setDisplayName(displayname);
	    meta.setOwner(owner);
	    meta.setLore(Arrays.asList(new String[] {lore}));
	    skull.setItemMeta(meta);
	    
	    return skull;
	  }
	public static ItemStack createItemWithEnch(Material material, int subid, String displayname, int anzahl, Enchantment ench, int level) {
	    ItemStack item = new ItemStack(material, 1, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    item.setAmount(anzahl);
	    meta.addEnchant(ench, level, true);
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createItemWithLoreEnch2(Material material, int subid, String displayname, int anzahl, Enchantment ench, int level, Enchantment ench2, int level2, String lore) {
	    ItemStack item = new ItemStack(material, 1, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    item.setAmount(anzahl);
	    meta.addEnchant(ench, level, true);
	    meta.addEnchant(ench2, level2, true);
	    meta.setLore(Arrays.asList(new String[] {lore}));
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createItemWithLoreEnch3(Material material, int subid, String displayname, int anzahl, Enchantment ench, int level, Enchantment ench2, int level2, Enchantment ench3, int level3, String lore) {
	    ItemStack item = new ItemStack(material, 1, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    item.setAmount(anzahl);
	    meta.addEnchant(ench, level, true);
	    meta.addEnchant(ench2, level2, true);
	    meta.addEnchant(ench3, level3, true);
	    meta.setLore(Arrays.asList(new String[] {lore}));
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createItemWithLoreEnch4(Material material, int subid, String displayname, int anzahl, Enchantment ench, int level, Enchantment ench2, int level2, Enchantment ench3, int level3, Enchantment ench4, int level4, String lore) {
	    ItemStack item = new ItemStack(material, 1, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    item.setAmount(anzahl);
	    meta.addEnchant(ench, level, true);
	    meta.addEnchant(ench2, level2, true);
	    meta.addEnchant(ench3, level3, true);
	    meta.addEnchant(ench4, level4, true);
	    meta.setLore(Arrays.asList(new String[] {lore}));
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack getSkullBack() {
		ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());
	    SkullMeta meta = (SkullMeta) skull.getItemMeta();
	    meta.setDisplayName("§7§lZurück");
	    meta.setOwner("MHF_ArrowLeft");
	    skull.setItemMeta(meta);
		return skull;
		
	}
	public static ItemStack getSkullVorward() {
		ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());
	    SkullMeta meta = (SkullMeta) skull.getItemMeta();
	    meta.setDisplayName("§7§lNächste Seite");
	    meta.setOwner("MHF_ArrowRight");
	    skull.setItemMeta(meta);
		return skull;
		
	}
	@SuppressWarnings("deprecation")
	public static ItemStack createPotion(String displayname, int id, int subid, int anzahl, PotionEffectType effect) {
		ItemStack i = new ItemStack(Material.POTION, 1, (short) subid);
		PotionMeta im = (PotionMeta) i.getItemMeta();
		im.setDisplayName(displayname);
		im.setMainEffect(effect);
		i.setTypeId(id);
		i.setItemMeta(im);
		return i;
		
	}
	public static ItemStack createPotionWithLore(String displayname, int anzahl, PotionEffectType effect, String lore) {
		ItemStack i = new ItemStack(Material.POTION, 1);
		PotionMeta im = (PotionMeta) i.getItemMeta();
		im.setDisplayName(displayname);
		im.setMainEffect(effect);
		im.setLore(Arrays.asList(new String[] {lore}));
		i.setItemMeta(im);
		return i;
		
	}
	public static ItemStack createItemWithDurability(Material material, int subid, String displayname, int anzahl, int durability) {
	    ItemStack item = new ItemStack(material, 1, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    item.setAmount(anzahl);
	    item.setItemMeta(meta);
	    item.setDurability((short) durability);
	    return item;
	  }
	public static ItemStack createItemWithDurabilityEnch(Material material, int subid, String displayname, int anzahl, int durability, Enchantment ench, int level) {
	    ItemStack item = new ItemStack(material, 1, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    item.setAmount(anzahl);
	    meta.addEnchant(ench, level, true);
	    item.setItemMeta(meta);
	    item.setDurability((short) durability);
	    return item;
	  }
	public static ItemStack createItemWithEnchItemFlag(Material material, int subid, String displayname, int anzahl, Enchantment ench, int level, ItemFlag itemlfag) {
		ItemStack item = new ItemStack(material, 1, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    item.setAmount(anzahl);
	    meta.addEnchant(ench, level, true);
	    meta.addItemFlags(itemlfag);
	    item.setItemMeta(meta);
		return item;
		
	}
	public static ItemStack createItemWithLoreEnch(Material material, int subid, String displayname,int anzahl, String lore, Enchantment ench, int level) {
	    ItemStack item = new ItemStack(material, anzahl, (short)subid);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(displayname);
	    meta.setLore(Arrays.asList(new String[] {lore}));
	    meta.addEnchant(ench, level, true);
	    item.setItemMeta(meta);
	    return item;
	  }
	public static ItemStack createLeatherArmor(Material leatherPiece, String displayname, int anzahl, Color color) {
        ItemStack item = new ItemStack(leatherPiece, anzahl);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setDisplayName(displayname);
        meta.setColor(color);
        item.setItemMeta(meta);
        return item;
    }
	public static ItemStack createLeatherArmorWithLore(Material leatherPiece, String displayname, int anzahl, Color color, String lore) {
        ItemStack item = new ItemStack(leatherPiece, anzahl);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setDisplayName(displayname);
        meta.setColor(color);
        meta.setLore(Arrays.asList(new String[] {lore}));
        item.setItemMeta(meta);
        return item;
    }

	public static ItemStack createItemUnbreakable(Material material, int subid, String displayname, int anzahl) {
		
		ItemStack i = new ItemStack(material, anzahl, (short) subid);
		ItemMeta im = i.getItemMeta();
		im.setDisplayName(displayname);
		im.spigot().setUnbreakable(true);
		i.setItemMeta(im);
		return i;
		
	}
	
	public static ItemStack getComingSoon() {
		ItemStack i = new ItemStack(Material.BARRIER, 1);
		ItemMeta im = i.getItemMeta();
		im.setDisplayName("§cComing Soon");
		i.setItemMeta(im);
		return i;
	}
}
