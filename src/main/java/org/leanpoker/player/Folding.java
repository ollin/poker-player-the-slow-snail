package org.leanpoker.player;

public interface Folding {

    boolean fold(Tournament tournament);

    static Folding or(Folding a, Folding b) {
        return new FoldingOr(a, b);
    }

    static Folding and(Folding a, Folding b) {
        return new FoldingAnd(a, b);
    }
}
