package org.leanpoker.player;

// hopufully we will never get to this stategy
// almost all Turnament."community_cards":[], are reveled and we need to say if we stay raise  or fold
// lets do this: read comunicycards cards and we need to check what we have on hand and decide
// we can use external api
public class StrategyEndGame implements Strategy {

    @Override
    public int nextBed(Tournament tournament) {
        return tournament.getCurrent_buy_in() + tournament.getMinimum_raise();
    }
}
