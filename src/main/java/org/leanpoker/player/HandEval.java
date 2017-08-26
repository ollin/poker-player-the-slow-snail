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
        return cards.stream().mapToInt(card -> card.getRank()).sum();
    }
}
