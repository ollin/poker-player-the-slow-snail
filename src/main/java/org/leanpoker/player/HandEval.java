package org.leanpoker.player;

import java.util.List;

/**
 * Created by lukasgin on 26/08/2017.
 */
public class HandEval {

    private final List<Card> cards;

    public HandEval(List<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        int result = cards.stream().mapToInt(card -> card.getRank()).sum();
        if (pair()) {
            result += 20;
        }
        return result;
    }

    public boolean pair() {
        return cards.get(0).getRank() == cards.get(1).getRank();
    }
}
