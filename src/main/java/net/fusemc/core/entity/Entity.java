package net.fusemc.core.entity;

import net.fusemc.core.world.WorldAPI;
import org.bukkit.entity.AbstractArrow;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;
import org.bukkit.event.weather.WeatherChangeEvent;

public class Entity implements Listener {

    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event){
        if(!EntityAPI.isCreatureSpawn()) event.setCancelled(true);
    }

    @EventHandler
    public void onBreakDoor(EntityBreakDoorEvent event){
        if(!EntityAPI.isBreakDoor()) event.setCancelled(true);
    }

    @EventHandler
    public void onChangeblock(EntityChangeBlockEvent event){
        if(!EntityAPI.isChangeblock()) event.setCancelled(true);
    }

    @EventHandler
    public void creeperPower(CreeperPowerEvent event){
        if(!EntityAPI.isCreeperPower()) event.setCancelled(true);
    }

    @EventHandler
    public void onDamageByBlock(EntityDamageByBlockEvent event){
        if(!EntityAPI.isDamageByBlock()) event.setCancelled(true);
    }

    @EventHandler
    public void onDamageByEntity(EntityDamageByEntityEvent event){
        if(!EntityAPI.isDamageByEntity()) event.setCancelled(true);
    }

    @EventHandler
    public void onDamage(EntityDamageEvent event){
        if(!EntityAPI.isDamage()) event.setCancelled(true);
    }

    @EventHandler
    public void onDrop(EntityDropItemEvent event){
        if(!EntityAPI.isDropItem()) event.setCancelled(true);
    }

    @EventHandler
    public void onExplode(EntityExplodeEvent event){
        if(!EntityAPI.isExplode()) event.setCancelled(true);
    }

    @EventHandler
    public void onPickup(EntityPickupItemEvent event){
        if(!EntityAPI.isPickup()) event.setCancelled(true);
    }

    @EventHandler
    public void onPostioneffect(EntityPotionEffectEvent event){
        if(!EntityAPI.isPostionEffect()) event.setCancelled(true);
    }
}
