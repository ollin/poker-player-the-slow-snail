package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Date;
import java.util.Map;

public class Player {

    static final String VERSION = new Date().toString();

    public int betRequest(Tournament tournament) {

        if (new StrategyFoldIfRankSmallerThen(10).fold(tournament)) {
            return 0;
        }

        return new StrategyCurrentByInMinimumRise().nextBed(tournament);
    }

    public void showdown(JsonElement game) {
    }
}
