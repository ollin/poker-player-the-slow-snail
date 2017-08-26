package org.leanpoker.player;

import java.util.List;

public class PlayerState {

    private String name;
    private List<Card> hole_cards;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getHole_cards() {
        return hole_cards;
    }

    public void setHole_cards(List<Card> hole_cards) {
        this.hole_cards = hole_cards;
    }

    public boolean hasName(String givenName) {
        return this.name.endsWith(givenName);
    }
}
