package com.xworkz.milk.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/SecondServlet", loadOnStartup = 1)
public class SecondServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String tournamentName = (String) req.getAttribute("tournamentName");
        req.setAttribute("tournamentNameProcessed", tournamentName + " Tournament");

        req.getRequestDispatcher("/TournamentResult.jsp").forward(req, resp);
    }
}


