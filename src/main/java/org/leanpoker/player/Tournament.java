package org.leanpoker.player;

import java.util.List;

public class Tournament {

    private int round;
    private int pot;
    private int minimum_raise;
    private int current_buy_in;
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

    public int getMinimum_raise() {
        return minimum_raise;
    }

    public void setMinimum_raise(int minimum_raise) {
        this.minimum_raise = minimum_raise;
    }


    public int getCurrent_buy_in() {
        return current_buy_in;
    }

    public void setCurrent_buy_in(int current_buy_in) {
        this.current_buy_in = current_buy_in;
    }
}
