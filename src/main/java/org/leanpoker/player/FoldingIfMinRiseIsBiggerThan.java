package org.leanpoker.player;

public class FoldingIfMinRiseIsBiggerThan implements Folding {

    private final int rise;

    public FoldingIfMinRiseIsBiggerThan(int rise) {
        this.rise = rise;
    }

    @Override
    public boolean fold(Tournament tournament) {
        return tournament.getMinimum_raise() > rise;
    }
}
