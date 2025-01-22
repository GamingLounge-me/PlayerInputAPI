package me.gaminglounge.playerinputapi;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.bukkit.entity.Player;

import io.papermc.paper.event.player.AsyncChatEvent;

public class InputManager {
    private Map<Player, Consumer<AsyncChatEvent>> chatInputMap;

    public InputManager() {
        chatInputMap = new HashMap<>();
    }

    public void captureChatInputPlayer(Player p, Consumer<AsyncChatEvent> e) {
        chatInputMap.put(p, e);
    }

    public void unsetChatInputPlayer(Player p) {
        chatInputMap.remove(p);
    }

    public Consumer<AsyncChatEvent> getChatInputEvent(Player p) {
        return chatInputMap.get(p);
    }
    
    public boolean chatInputHasPlayer(Player p) {
        return chatInputMap.containsKey(p);
    }

}
