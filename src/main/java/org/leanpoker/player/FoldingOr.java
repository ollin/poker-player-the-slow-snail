package org.leanpoker.player;

import java.util.Arrays;
import java.util.List;

public class FoldingOr implements Folding{

    private final List<Folding> foldings;

    public FoldingOr(Folding ... foldings) {
        this.foldings = Arrays.asList(foldings);
    }

    @Override
    public boolean fold(Tournament tournament) {
        return foldings.stream().anyMatch(folding -> folding.fold(tournament));
    }
}
