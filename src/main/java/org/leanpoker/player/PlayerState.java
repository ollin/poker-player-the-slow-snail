package org.leanpoker.player;

import java.util.List;

public class PlayerState {

    public String name;
    public List<Card> hole_cards;

    public boolean hasName(String givenName) {
        return this.name.endsWith(givenName);
    }
}
