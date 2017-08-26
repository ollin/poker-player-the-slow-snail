package org.leanpoker.player;

public class StrategyCurrentByInMinimumRise implements Strategy {

    @Override
    public int nextBed(Tournament tournament) {
        //players[in_action][bet]
        return tournament.getCurrent_buy_in()
                - tournament.sumOfPlayersBet()
                + tournament.getMinimum_raise();
    }
}
