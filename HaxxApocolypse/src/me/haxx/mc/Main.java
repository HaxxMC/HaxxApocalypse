package me.haxx.mc;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public void onEnable(){
		Bukkit.getServer().getWorld("world").setTicksPerMonsterSpawns(200);
	}
	public void onDisable(){}
	
}
