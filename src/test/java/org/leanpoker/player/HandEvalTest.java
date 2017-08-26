package org.leanpoker.player;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class HandEvalTest {

    @Test
    public void
    should_be_pair() throws Exception {
        // given
        Card a = new Card();
        a.rank = "8";

        Card b = new Card();
        b.rank = "8";

        HandEval sut = new HandEval(Arrays.asList(a, b));

        // when
        boolean result = sut.pair();

        // then
        assertThat(result, is(true));
    }

    @Test
    public void
    should_be_is_pair() throws Exception {
        // given
        Card a = new Card();
        a.rank = "8";

        Card b = new Card();
        b.rank = "8";

        HandEval sut = new HandEval(Arrays.asList(a, b));

        // when
        boolean result = sut.isPair();

        // then
        assertThat(result, is(true));
    }

    @Test
    public void
    should_be_is_three() throws Exception {
        // given
        Card a = new Card();
        a.rank = "8";

        Card b = new Card();
        b.rank = "8";

        Card c = new Card();
        c.rank = "8";

        HandEval sut = new HandEval(Arrays.asList(a, b, c));

        // when
        boolean result = sut.isThree();

        // then
        assertThat(result, is(true));
    }

    @Test
    public void
    should_not_be_is_three() throws Exception {
        // given
        Card a = new Card();
        a.rank = "8";

        Card b = new Card();
        b.rank = "8";

        Card c = new Card();
        c.rank = "9";

        HandEval sut = new HandEval(Arrays.asList(a, b, c));

        // when
        boolean result = sut.isThree();

        // then
        assertThat(result, is(false));
    }

}
