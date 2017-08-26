package org.leanpoker.player;

public class StrategyValue implements Strategy{

    private final int value;

    public StrategyValue(int value) {
        this.value = value;
    }

    @Override
    public int nextBed(Tournament tournament) {
        return value;
    }
}
