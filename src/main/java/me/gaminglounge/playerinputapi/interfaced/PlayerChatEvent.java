package me.gaminglounge.playerinputapi.interfaced;

import org.bukkit.entity.Player;

public interface PlayerChatEvent {
    public void onMessage(Player p, String message);
}
