package com.xworkz.milk.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/FirstServlet", loadOnStartup = 1)
public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String tournamentName = req.getParameter("tournamentName");
        req.setAttribute("tournamentName", tournamentName);


        req.getRequestDispatcher("/SecondServlet").forward(req, resp);
    }
}
