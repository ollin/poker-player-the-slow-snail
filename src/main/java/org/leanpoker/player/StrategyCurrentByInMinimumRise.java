package org.leanpoker.player;

public class StrategyCurrentByInMinimumRise implements Strategy {

    @Override
    public int nextBed(Tournament tournament) {
        //players[in_action][bet]
        int nextBed =  tournament.getCurrent_buy_in()
                + tournament.getMinimum_raise();

        System.out.println("tournament.getCurrent_buy_in() - " + tournament.getCurrent_buy_in());
        System.out.println("tournament.sumOfPlayersBet() - " + tournament.sumOfPlayersBet());
        System.out.println("tournament.getMinimum_raise() - " + tournament.getMinimum_raise());

        //int nextBed = 100;

        return  nextBed;
    }
}
