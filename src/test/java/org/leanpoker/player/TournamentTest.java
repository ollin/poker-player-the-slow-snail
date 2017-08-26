package org.leanpoker.player;

import com.google.gson.Gson;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;


public class TournamentTest {

    @Test
    public void
    should_get_rounds() throws Exception {
        // given
        String json = "{\n" +
                "  \"players\": [\n" +
                "    {\n" +
                "      \"name\": \"Player 1\",\n" +
                "      \"stack\": 1000,\n" +
                "      \"status\": \"active\",\n" +
                "      \"bet\": 0,\n" +
                "      \"hole_cards\": [],\n" +
                "      \"version\": \"Version name 1\",\n" +
                "      \"id\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Player 2\",\n" +
                "      \"stack\": 1000,\n" +
                "      \"status\": \"active\",\n" +
                "      \"bet\": 0,\n" +
                "      \"hole_cards\": [],\n" +
                "      \"version\": \"Version name 2\",\n" +
                "      \"id\": 1\n" +
                "    }\n" +
                "  ],\n" +
                "  \"tournament_id\": \"550d1d68cd7bd10003000003\",\n" +
                "  \"game_id\": \"550da1cb2d909006e90004b1\",\n" +
                "  \"round\": 1,\n" +
                "  \"bet_index\": 0,\n" +
                "  \"small_blind\": 10,\n" +
                "  \"orbits\": 0,\n" +
                "  \"dealer\": 0,\n" +
                "  \"community_cards\": [],\n" +
                "  \"current_buy_in\": 0,\n" +
                "  \"pot\": 100\n" +
                "}\n";

        // when
        Tournament tournament = new Gson().fromJson(json, Tournament.class);

        // then
        assertThat(tournament.getRound(), is(1));
        assertThat(tournament.getPlayers(), notNullValue());
        assertThat(tournament.getPot(), is(100));


    }

}
