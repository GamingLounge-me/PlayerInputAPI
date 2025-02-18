package me.gaminglounge.playerinputapi;

import org.bukkit.entity.Player;

import me.gaminglounge.playerinputapi.interfaced.PlayerChatEvent;
import net.kyori.adventure.text.Component;

public class UseNextChatInput {
    private Player p;
    private Component m;
    private PlayerChatEvent e;

    public UseNextChatInput(Player p) {
        this.p = p;
    }

    public UseNextChatInput sendMessage(Component message) {
        this.m = message;
        return this;
    }

    public UseNextChatInput setChatEvent(PlayerChatEvent event) {
        this.e = event;
        return this;
    }

    public void capture() {
        p.sendMessage(m);
        PlayerInputAPI.INSTANCE.manager.captureChatInputPlayer(p, e);
    }

}
