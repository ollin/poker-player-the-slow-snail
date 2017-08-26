package org.leanpoker.player;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

public class HandRankTest {

    @Test
    public void
    should_a_be_max() throws Exception {
        // given
        HandRank a = new HandRank(1);
        HandRank b = new HandRank(0);

        // when
        HandRank result = a.max(b);

        // then
        assertThat(result, sameInstance(a));
    }

    @Test
    public void
    should_b_be_max() throws Exception {
        // given
        HandRank a = new HandRank(1);
        HandRank b = new HandRank(2);

        // when
        HandRank result = a.max(b);

        // then
        assertThat(result, sameInstance(b));
    }

}
