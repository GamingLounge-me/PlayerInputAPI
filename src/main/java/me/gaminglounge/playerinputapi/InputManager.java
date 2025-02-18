package me.gaminglounge.playerinputapi;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;

import me.gaminglounge.playerinputapi.interfaced.PlayerChatEvent;

public class InputManager {
    private Map<Player, PlayerChatEvent> chatInputMap;

    public InputManager() {
        chatInputMap = new HashMap<>();
    }

    public void captureChatInputPlayer(Player p, PlayerChatEvent e) {
        chatInputMap.put(p, e);
    }

    public void unsetChatInputPlayer(Player p) {
        chatInputMap.remove(p);
    }

    public PlayerChatEvent getChatInputEvent(Player p) {
        return chatInputMap.get(p);
    }

    public boolean chatInputHasPlayer(Player p) {
        return chatInputMap.containsKey(p);
    }

}
