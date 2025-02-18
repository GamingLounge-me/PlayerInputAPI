package me.gaminglounge.playerinputapi.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import io.papermc.paper.event.player.AsyncChatEvent;
import me.gaminglounge.playerinputapi.PlayerInputAPI;
import me.gaminglounge.playerinputapi.interfaced.PlayerChatEvent;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;

public class ChatInputListener implements Listener {

    @EventHandler
    public void onChat(AsyncChatEvent e) {

        Player p = e.getPlayer();
        PlayerChatEvent playerChatEvent = PlayerInputAPI.INSTANCE.manager.getChatInputEvent(p);
        if (playerChatEvent != null) {
            PlayerInputAPI.INSTANCE.manager.unsetChatInputPlayer(p);
            e.setCancelled(true);
            playerChatEvent.onMessage(p, PlainTextComponentSerializer.plainText().serialize(e.originalMessage()));
        }
    }

}
