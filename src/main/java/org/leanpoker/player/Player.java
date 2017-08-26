package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Date;
import java.util.Map;

public class Player {

    static final String VERSION = new Date().toString();

    // get tournament .players []
    // get my player (filter by name) or by not empty .hole_cards
    // get my hole cards
    //     "hole_cards": [                         // The cards of the player. This is only visible for your own player
    //    {
    //        "rank": "6",                    // Rank of the card. Possible values are numbers 2-10 and J,Q,K,A
    //        "suit": "hearts"                // Suit of the card. Possible values are: clubs,spades,hearts,diamonds
    //    },
    //    {
    //        "rank": "K",
    //        "suit": "spades"
    //    }
    // ]
    public int betRequest(Tournament tournament) {
        return new Tournament().minimum_rise();
    }

    public void showdown(JsonElement game) {
    }
}
