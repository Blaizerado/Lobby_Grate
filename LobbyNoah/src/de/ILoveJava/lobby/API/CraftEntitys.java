package de.ILoveJava.lobby.API;

import java.util.HashSet;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftBat;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftCaveSpider;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftChicken;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftCow;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftCreeper;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEnderman;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftHorse;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPig;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftRabbit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftSheep;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftSkeleton;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftSpider;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftSquid;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftVillager;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftWitch;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftZombie;
import org.bukkit.entity.Bat;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.entity.Rabbit;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Zombie;

import net.minecraft.server.v1_8_R3.NBTTagCompound;

public class CraftEntitys {

	public static void freezeEntity(org.bukkit.entity.Entity entityToFreeze) {
	    net.minecraft.server.v1_8_R3.Entity entity = ((CraftEntity)entityToFreeze).getHandle();
	    NBTTagCompound tagCompound = new NBTTagCompound();
	    entity.c(tagCompound);
	    tagCompound.setByte("NoAI", (byte)1);
	    entity.f(tagCompound);
	    
	}
	
	public static void control(Player p) {
		Location loc = p.getTargetBlock((HashSet<Material>) null, 99).getLocation();
		for(Entity en : p.getWorld().getNearbyEntities(loc, 80, 80, 80)) {
			if(en instanceof Cow) {
				((CraftCow)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof Pig) {
				((CraftPig)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof Sheep) {
				((CraftSheep)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			} 
			if(en instanceof Rabbit) {
				((CraftRabbit)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof Horse) {
				((CraftHorse)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof Zombie) {
				((CraftZombie)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof Skeleton) {
				((CraftSkeleton)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof Creeper) {
				((CraftCreeper)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof Witch) {
				((CraftWitch)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof Enderman) {
				((CraftEnderman)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof Villager) {
				((CraftVillager)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof Squid) {
				((CraftSquid)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof Bat) {
				((CraftBat)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof Chicken) {
				((CraftChicken)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof Spider) {
				((CraftSpider)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
			if(en instanceof CaveSpider) {
				((CraftCaveSpider)en).getHandle().getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), 1.5);
			}
		}
	}
	
}
