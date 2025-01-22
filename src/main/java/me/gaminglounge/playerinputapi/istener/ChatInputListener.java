package me.gaminglounge.playerinputapi.istener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import io.papermc.paper.event.player.AsyncChatEvent;
import me.gaminglounge.playerinputapi.PlayerInputAPI;

public class ChatInputListener implements Listener {
    
    @EventHandler
    public void oncChat(AsyncChatEvent e) {
        if (PlayerInputAPI.INSTANCE.manager.chatInputHasPlayer(e.getPlayer())) {
            PlayerInputAPI.INSTANCE.manager.getChatInputEvent(e.getPlayer()).accept(e);
            PlayerInputAPI.INSTANCE.manager.unsetChatInputPlayer(e.getPlayer());
        }
    }

}
