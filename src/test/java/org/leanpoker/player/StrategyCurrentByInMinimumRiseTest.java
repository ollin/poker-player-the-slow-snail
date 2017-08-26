package org.leanpoker.player;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class StrategyCurrentByInMinimumRiseTest {

    @Test
    public void
    should_return120() throws Exception {
        // given
        Tournament tournament = new Tournament();
        tournament.setCurrent_buy_in(100);
        tournament.setMinimum_raise(20);

        StrategyCurrentByInMinimumRise sut = new StrategyCurrentByInMinimumRise();

        // when
        int result = sut.nextBed(tournament);

        // then
        Assert.assertThat(result, CoreMatchers.is(120));
    }


}
