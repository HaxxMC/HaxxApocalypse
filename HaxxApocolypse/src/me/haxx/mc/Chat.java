package me.haxx.mc;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

//Testing

public class Chat implements Listener {
	@EventHandler
	public void formatChat(AsyncPlayerChatEvent event) {
		event.setFormat(
				"�3"
				+ event.getPlayer().getName()
				+ "�f: "
				+ event.getMessage());

		if (event.getPlayer().hasPermission("haxx.color")) {
			event.getMessage().replaceAll("&", "�");
		}
	}
}