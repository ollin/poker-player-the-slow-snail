package org.leanpoker.player;

public class StrategyFoldIfRankSmallerThen implements Strategy{

    private final int min;

    public StrategyFoldIfRankSmallerThen(int min) {
        this.min = min;
    }

    public boolean fold(Tournament tournament) {
        return new HandEval(tournament.myCards()).getHandValue() < min;
    }

    @Override
    public int nextBed(Tournament tournament) {
        return 0;
    }
}
