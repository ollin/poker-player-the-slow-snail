package org.leanpoker.player;

public class FoldingOr implements Folding{

    private final Folding foldingA;
    private final Folding foldingB;

    public FoldingOr(Folding foldingA, Folding foldingB) {
        this.foldingA = foldingA;
        this.foldingB = foldingB;
    }

    @Override
    public boolean fold(Tournament tournament) {
        return foldingA.fold(tournament) || foldingB.fold(tournament);
    }
}
