package org.leanpoker.player;

public class FoldingAnd implements Folding{

    private final Folding foldingA;
    private final Folding foldingb;

    public FoldingAnd(Folding foldingA, Folding foldingb) {
        this.foldingA = foldingA;
        this.foldingb = foldingb;
    }


    @Override
    public boolean fold(Tournament tournament) {
        return foldingA.fold(tournament) && foldingb.fold(tournament);
    }
}
