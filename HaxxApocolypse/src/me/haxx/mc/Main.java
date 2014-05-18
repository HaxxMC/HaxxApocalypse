package me.haxx.mc;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private static Plugin plugin;

	public static Plugin getPlugin() {
		return plugin;
	}

	public void onEnable(){
		getServer().getWorld("world").setTicksPerMonsterSpawns(200);
		getServer().getPluginManager().registerEvents(new Chat(), this);
	}
	
	public void onDisable(){}
	
}
