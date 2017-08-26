package org.leanpoker.player;

public class FoldingIfRankSmallerThen implements Folding {

    private final int min;

    public FoldingIfRankSmallerThen(int min) {
        this.min = min;
    }

    public boolean fold(Tournament tournament) {
        return new HandEval(tournament.myCards()).getHandValue() < min;
    }
}
