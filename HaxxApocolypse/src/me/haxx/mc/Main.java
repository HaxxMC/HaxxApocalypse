package me.haxx.mc;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private static Plugin plugin;

	public static Plugin getPlugin() {
		return plugin;
	}

	public void onEnable(){
		Bukkit.getServer().getWorld("world").setTicksPerMonsterSpawns(200);
		Bukkit.getServer().getPluginManager().registerEvents(new Chat(), this);
	}
	
	public void onDisable(){}
	
}
