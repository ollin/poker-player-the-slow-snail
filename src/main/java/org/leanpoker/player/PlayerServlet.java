package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class PlayerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("Java player is running");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("action").equals("bet_request")) {

            String gameState = req.getParameter("game_state");

            System.out.println("bet_request");
            System.out.println(gameState);

            int bet = new Player().betRequest(new Gson().fromJson(gameState, Tournament.class));
            if (bet < 0) {
                System.out.println("Found result lower 0: " + bet);
                bet = 0;
            }

            resp.getWriter().print(bet);
        }
        if (req.getParameter("action").equals("showdown")) {
            String gameState = req.getParameter("game_state");

            System.out.println("showdown");
            System.out.println(gameState);

            new Player().showdown(new JsonParser().parse(gameState));
        }
        if (req.getParameter("action").equals("version")) {
            resp.getWriter().print(Player.VERSION);
        }
    }
}
