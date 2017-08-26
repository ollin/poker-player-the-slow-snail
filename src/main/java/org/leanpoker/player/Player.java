package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Date;

public class Player {

    static final String VERSION = new Date().toString();

    public int betRequest(Tournament tournament) {

        if (new FoldingIfRankSmallerThen(10).fold(tournament) ||
                new FoldingAnd(
                        new FoldingIfRankSmallerThen(20),
                        new Folding() {
                            @Override
                            public boolean fold(Tournament tournament) {
                                return tournament.myself().bet > 485;
                            }
                        }).fold(tournament)
                ){
            return 0;
        }

        int result = new StrategyCurrentByInMinimumRise().nextBed(tournament);
        if (result < 0) {
            System.out.println("Found result lower 0: " + result);
            return 0;
        } else {
            return result;
        }
    }

    public void showdown(JsonElement game) {
    }
}
