package org.leanpoker.player;

public class FoldingAnd implements Folding{

    private final Folding foldingA;
    private final Folding foldingB;

    public FoldingAnd(Folding foldingA, Folding foldingB) {
        this.foldingA = foldingA;
        this.foldingB = foldingB;
    }


    @Override
    public boolean fold(Tournament tournament) {
        return foldingA.fold(tournament) && foldingB.fold(tournament);
    }
}
