package org.leanpoker.player;

import java.util.HashMap;
import java.util.List;

public class Hand {

    private final List<Card> cards;
    private final HashMap<Integer, Integer> ranks;

    public Hand(List<Card> cards) {
        this.cards = cards;
        this.ranks = convertToRanks(cards);
    }

    private static HashMap<Integer, Integer> convertToRanks(List<Card> cards) {
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

        return pairs;
    }
}
