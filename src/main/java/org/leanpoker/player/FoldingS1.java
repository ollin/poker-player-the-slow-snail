package org.leanpoker.player;

public class FoldingS1 implements Folding{
    @Override
    public boolean fold(Tournament tournament) {
        return new FoldingOr(
                new FoldingIfRankSmallerThen(10),
                new FoldingAnd(
                        new FoldingIfRankSmallerThen(20),
                        //new FoldingIfMinRiseIsBiggerThan(100),
                        new FoldingIfMyBedIsBigger(700))
        ).fold(tournament);
    }
}
