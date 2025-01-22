package me.gaminglounge.playerinputapi;  
 
import org.bukkit.plugin.PluginManager; 
import org.bukkit.plugin.java.JavaPlugin;

import me.gaminglounge.playerinputapi.istener.ChatInputListener; 
 
public final class PlayerInputAPI extends JavaPlugin { 
 
    public static PlayerInputAPI INSTANCE; 
    public InputManager manager;
 
    @Override
    public void onLoad() {
        INSTANCE = this; 
        manager = new InputManager();
    }

    @Override
    public void onEnable() {
        this.listener();
    }

    @Override
    public void onDisable() {
        
    }

    public void listener() {
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new ChatInputListener(), this);
    } 
} 
