package net.fusemc.core.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.event.world.PortalCreateEvent;

public class World implements Listener {

    @EventHandler
    public void onWeatherChange(WeatherChangeEvent event){
        if(!WorldAPI.isWeatherChange()) event.setCancelled(true);
    }

    @EventHandler
    public void onThunderChange(ThunderChangeEvent event){
        if(!WorldAPI.isThunder()) event.setCancelled(true);
    }

    @EventHandler
    public void onLightningStrike(WeatherChangeEvent event){
        if(!WorldAPI.isLightningStrike()) event.setCancelled(true);
    }

    @EventHandler
    public void onPortalCreate(PortalCreateEvent event){
        if(!WorldAPI.isPortalCreate()) event.setCancelled(true);
    }

}
