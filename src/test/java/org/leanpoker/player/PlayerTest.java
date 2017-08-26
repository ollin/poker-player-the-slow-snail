package org.leanpoker.player;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.leanpoker.player.Player.betRequest;


public class PlayerTest {

    @Test
    public void
    should_return_number() throws Exception {
        // given


        // when
        int bed = betRequest(null);

        // then
        assertTrue(bed > 0);
    }

}
