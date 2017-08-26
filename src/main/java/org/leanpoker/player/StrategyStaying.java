package org.leanpoker.player;

public class StrategyStaying implements Strategy {
    @Override
    public int nextBed(Tournament tournament) {
        if (new HandEval(tournament.myCards()).getHandValue() < 15) {
            return 0;
        }
        return 0;
    }
}
