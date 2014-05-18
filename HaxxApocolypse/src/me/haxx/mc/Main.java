package me.haxx.mc;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private static Plugin plugin;

	public static Plugin getPlugin() {
		return plugin;
	}

	public static void registerEvents(org.bukkit.plugin.Plugin plugin,
			Listener... listeners) {
		for (Listener listener : listeners) {
			Bukkit.getServer().getPluginManager()
					.registerEvents(listener, plugin);
		}
	}
	
	public void onEnable(){
		Bukkit.getServer().getWorld("world").setTicksPerMonsterSpawns(200);
		registerEvents(this, new Chat());
	}
	
	public void onDisable(){}
	
}
