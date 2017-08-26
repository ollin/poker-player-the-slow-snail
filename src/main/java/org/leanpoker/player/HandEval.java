package org.leanpoker.player;

/**
 * Created by lukasgin on 26/08/2017.
 */
public class HandEval {

    private int handValue = 0;

    public int function(Card a, Card b) {
        this.handValue = a.getRank() + b.getRank();

        return this.handValue;
    }
}
