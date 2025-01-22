package me.gaminglounge.playerinputapi;

import java.util.function.Consumer;

import org.bukkit.entity.Player;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;

public class UseNextChatInput {
    private Player p;
    private Component m;
    private Consumer<AsyncChatEvent> e;

    public UseNextChatInput(Player p) {
        this.p = p;
    }

    public UseNextChatInput sendMessage(Component message) {
        this.m = message;
        return this;
    }

    public UseNextChatInput setChatEvent(Consumer<AsyncChatEvent> event) {
        this.e = event;
        return this;
    }

    public void capture() {
        p.sendMessage(m);
        PlayerInputAPI.INSTANCE.manager.captureChatInputPlayer(p, e);
    }

}
