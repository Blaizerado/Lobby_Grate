package de.ILoveJava.lobby.API;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import net.minecraft.server.v1_8_R3.IChatBaseComponent.ChatSerializer;

public class ActionBar {

	public static void sendActionbarAtAll(String msg) {
		IChatBaseComponent amsg = ChatSerializer.a("{\"text\": \"\"}").a(msg);

		PacketPlayOutChat atitle = new PacketPlayOutChat(amsg, (byte) 2);

		for (Player p : Bukkit.getOnlinePlayers()) {
			CraftPlayer pl = (CraftPlayer) p;

			pl.getHandle().playerConnection.sendPacket(atitle);
		}
	}
	public static void sendActionbarAtPlayer(Player p, String msg) {
		IChatBaseComponent amsg = ChatSerializer.a("{\"text\": \"\"}").a(msg);
		PacketPlayOutChat atitle = new PacketPlayOutChat(amsg, (byte) 2);
		CraftPlayer pl = (CraftPlayer) p;
		pl.getHandle().playerConnection.sendPacket(atitle);
	}
	
}
