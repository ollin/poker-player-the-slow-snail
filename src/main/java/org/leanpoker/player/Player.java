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
                        new FoldingIfMyBedIsBigger(600))
                ).fold(tournament)){
            return 0;
        }

        return new StrategyCurrentByInMinimumRise().nextBed(tournament);
    }

    public void showdown(JsonElement game) {
    }
}
