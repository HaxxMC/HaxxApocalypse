package me.haxx.mc;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Zombie implements Listener{

	@EventHandler
	public void onHit(EntityDamageByEntityEvent e){
		Location l = e.getDamager().getLocation();
		
		double dmg = e.getDamage();
		int x = l.getBlockX();
		int z = l.getBlockZ();
		
		if(e.getEntity().getType().equals(EntityType.PLAYER) && e.getDamager().getType().equals(EntityType.ZOMBIE)){
			if(x>999 && x<2000 || z>999 && z<2000){
				e.setDamage(dmg + 1);
			}
			if(x>1999 && x<3000 || z>1999 && z<3000){
				e.setDamage(dmg + 2);
			}
			if(x>2999 && x<4000 || z>2999 && z<4000){
				e.setDamage(dmg + 3);
			}
			if(x>3999 && x<5000 || z>3999 && z<5000){
				e.setDamage(dmg + 4);
			}
			if(x>4999 && x<6000 || z>4999 && z<6000){
				e.setDamage(dmg + 5);
			}
			if(x>5999 || z>5999){
				e.setDamage(dmg + 6);
			}
			
			else{}
		}
	}
}
