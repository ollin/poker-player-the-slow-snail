package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Date;

public class Player {

    static final String VERSION = new Date().toString();

    public int betRequest(Tournament tournament) {

        // if rank <= 100 max_bet 100

        if (new FoldingIfRankSmallerThen(10).fold(tournament)){
            return 0;
        }

        int ourBed = new StrategyValue(100).nextBed(tournament);

        System.out.println("we are playing: " + ourBed);

        return ourBed;
    }

    public void showdown(JsonElement game) {
    }
}
