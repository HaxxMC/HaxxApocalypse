package me.haxx.mc;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

@SuppressWarnings("unused")
public class Zombie implements Listener{

	@EventHandler
	public void onHit(EntityDamageByEntityEvent e){
		Entity a = e.getDamager();
		Entity t = e.getEntity();
		Location l = a.getLocation();
		
		int x = l.getBlockX();
		int z = l.getBlockZ();
		
		if(a instanceof org.bukkit.entity.Zombie && t instanceof Player){
			if(x>999 && x<2000 || z>999 && z<2000){
				e.setDamage(e.getDamage() + 1);
			}
			if(x>1999 && x<3000 || z>1999 && z<3000){
				e.setDamage(e.getDamage() + 2);
			}
			if(x>2999 && x<4000 || z>2999 && z<4000){
				e.setDamage(e.getDamage() + 3);
			}
			if(x>3999 && x<5000 || z>3999 && z<5000){
				e.setDamage(e.getDamage() + 4);
			}
			if(x>4999 && x<6000 || z>4999 && z<6000){
				e.setDamage(e.getDamage() + 5);
			}
			if(x>5999 || z>5999){
				e.setDamage(e.getDamage() + 6);
			}
			else{}
		}
	}
}
