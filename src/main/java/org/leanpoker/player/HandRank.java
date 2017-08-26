package org.leanpoker.player;

public class HandRank {

    private final int first;

    public HandRank(int first) {
        this.first = first;
    }

    public HandRank max(HandRank other) {
        if (this.first >= other.first) {
            return this;
        } else {
            return other;
        }
    }
}
