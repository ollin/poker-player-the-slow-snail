package org.leanpoker.player;

/**
 * Created by lukasgin on 26/08/2017.
 */
public class HandEval {

    private final Card a;
    private final Card b;

    public HandEval(Card a, Card b) {
        this.a = a;
        this.b = b;
    }

    private int handValue = 0;

    // @TODO ollin eval hand
    public int getHandValue() {
        this.handValue = this.a.getRank() + this.b.getRank();

        return this.handValue;
    }
}
