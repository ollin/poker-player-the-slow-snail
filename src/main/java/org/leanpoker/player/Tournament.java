package org.leanpoker.player;

import java.util.List;

public class Tournament {

    private int round;
    private int pot;
    private List<PlayerState> players;

    public Tournament() {
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public List<PlayerState> getPlayers() {
        return players;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public void setPlayers(List<PlayerState> players) {
        this.players = players;
    }
}
