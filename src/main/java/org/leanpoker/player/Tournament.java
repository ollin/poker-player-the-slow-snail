package org.leanpoker.player;

import java.util.Collections;
import java.util.List;

public class Tournament {

    private static final String MY_NAME = "the slow snail";

    private int round;
    private int pot;
    private int minimum_raise;
    private int current_buy_in;
    private List<PlayerState> players;

    public Tournament() {
    }

    int sumOfPlayersBet() {
        int result = 0;
        for (PlayerState player : players) {
            result += player.bet;
        }
        return result;
    }

    List<Card> myCards() {
        for (PlayerState player : players) {
            if (player.hasName(MY_NAME)) {
                return player.hole_cards;
            }
        }

        return Collections.emptyList();
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

    public PlayerState myself() {
        for (PlayerState player : players) {
            if (player.hasName(MY_NAME)) {
                return player;
            }
        }

        throw new IllegalStateException("we are not part of the game");
    }
}
