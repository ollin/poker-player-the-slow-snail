package org.leanpoker.player;

import java.util.Arrays;
import java.util.List;

public class FoldingAnd implements Folding{

    private final List<Folding> foldings;

    public FoldingAnd(Folding ... foldings) {
        this.foldings = Arrays.asList(foldings);
    }

    @Override
    public boolean fold(Tournament tournament) {
        return foldings.stream().allMatch(folding -> folding.fold(tournament));
    }
}
