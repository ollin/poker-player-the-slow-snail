package org.leanpoker.player;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class HandTest {

    @Test
    public void
    should_be_is_pair() throws Exception {
        // given
        Card a = new Card();
        a.rank = "8";

        Card b = new Card();
        b.rank = "8";

        Hand sut = new Hand(Arrays.asList(a, b));

        // when
        boolean result = sut.isTwo();

        // then
        assertThat(result, is(true));
    }

    @Test
    public void
    should_be_is_twotwo() throws Exception {
        // given
        Card a = new Card();
        a.rank = "8";

        Card b = new Card();
        b.rank = "8";

        Card c = new Card();
        c.rank = "9";

        Card d = new Card();
        d.rank = "9";

        Hand sut = new Hand(Arrays.asList(a, b, c, d));

        // when
        boolean result = sut.isTwoTwo();

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

        Hand sut = new Hand(Arrays.asList(a, b, c));

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

        Hand sut = new Hand(Arrays.asList(a, b, c));

        // when
        boolean result = sut.isThree();

        // then
        assertThat(result, is(false));
    }


}
