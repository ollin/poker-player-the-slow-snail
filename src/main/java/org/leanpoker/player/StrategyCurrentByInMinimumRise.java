package org.leanpoker.player;

public class StrategyCurrentByInMinimumRise implements Strategy {

    @Override
    public int nextBed(Tournament tournament) {
        return tournament.getCurrent_buy_in() + tournament.getMinimum_raise();
    }
}
