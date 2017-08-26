package org.leanpoker.player;

import org.junit.Test;

import static org.junit.Assert.*;


public class PlayerTest {

    @Test
    public void
    should_return_number() throws Exception {
        // given
        Tournament tournament = new Tournament();

        tournament.setRound(3);

        // when
        int bed = new Player().betRequest(tournament);

        // then
        assertTrue(bed > 0);
    }

    @Test
    public void
    should_() throws Exception {
        // given

        // when

        // then
    }

}
