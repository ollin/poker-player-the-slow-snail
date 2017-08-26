package org.leanpoker.player;

import java.util.Collection;
import java.util.HashMap;
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

    public boolean isPair() {
        HashMap<Integer, Integer> pairs = new HashMap<>();

        for (Card card : cards) {
            int rank = card.getRank();

            if (pairs.containsKey(rank)) {
                int value = pairs.get(rank);
                pairs.put(rank, value + 1);
            }
            else {
                pairs.put(rank, 1);
            }
        }

        return pairs.values().stream().filter(i -> i > 1).count() > 0;
    }

    public boolean isThree() {
        HashMap<Integer, Integer> pairs = new HashMap<>();

        for (Card card : cards) {
            int rank = card.getRank();

            if (pairs.containsKey(rank)) {
                int value = pairs.get(rank);
                pairs.put(rank, value + 1);
            }
            else {
                pairs.put(rank, 1);
            }
        }

        return pairs.values().stream().filter(i -> i > 2).count() > 0;
    }
}
