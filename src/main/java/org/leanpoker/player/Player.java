package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Date;

public class Player {

    static final String VERSION = new Date().toString();

    public int betRequest(Tournament tournament) {

        if (new FoldingOr(
                new FoldingIfRankSmallerThen(11),
                new FoldingAnd(
                        new FoldingIfRankSmallerThen(20),
                        //new FoldingIfMinRiseIsBiggerThan(100),
                        new FoldingIfMyBedIsBigger(700))
                ).fold(tournament)){
            return 0;
        }

        int shouldPlay = new StrategyCurrentByInMinimumRise().nextBed(tournament);
        System.out.println("shouldPlay - " + shouldPlay);

        System.out.println("we are playing: " + 100);

        return 100;
    }

    public void showdown(JsonElement game) {
    }
}
