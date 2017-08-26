package org.leanpoker.player;

public class StrategyStaying implements Strategy {
    @Override
    public int nextBed(Tournament tournament) {
        if (new HandEval(tournament.myCards()).getHandValue() < 15) {
            return Integer.min(300, new StrategyCurrentByInMinimumRise().nextBed(tournament));
        }
        else if(new HandEval(tournament.myCards()).getHandValue() < 20) {
            return Integer.min(400, new StrategyCurrentByInMinimumRise().nextBed(tournament));
        }
        return new StrategyCurrentByInMinimumRise().nextBed(tournament);
    }
}
