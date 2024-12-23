package com.xworkz.serverpage.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/ornament",loadOnStartup = 1)
public class OrnamentServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dopost in running in OrnamentServlet..");


        String name=req.getParameter("name");
        String grams=req.getParameter("grams");
        String per=req.getParameter("per");
        String gst=req.getParameter("gst");
        String rate=req.getParameter("rate");



        RequestDispatcher requestDispatcher= req.getRequestDispatcher("OrnamentResult.jsp");
        req.setAttribute("name",name);
        req.setAttribute("grams",grams);
        req.setAttribute("per",per);
        req.setAttribute("gst",gst);
        req.setAttribute("rate",rate);

        requestDispatcher.forward(req,resp);



    }
}
