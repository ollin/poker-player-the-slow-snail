package org.leanpoker.player;

public class FoldingIfMyBedIsBigger implements Folding{

    private final int biggerThen;

    public FoldingIfMyBedIsBigger(int biggerThen) {
        this.biggerThen = biggerThen;
    }


    @Override
    public boolean fold(Tournament tournament) {
        return tournament.myself().bet > biggerThen;
    }
}
