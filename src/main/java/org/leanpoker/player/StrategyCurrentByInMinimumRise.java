package org.leanpoker.player;

public class StrategyCurrentByInMinimumRise {

    public int nextBed(Tournament tournament) {
        return tournament.getCurrent_buy_in() + tournament.getMinimum_raise();
    }
}
