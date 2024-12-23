package com.xworkz.fruitsgroup.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/send", loadOnStartup = 1)
public class Celebrity extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Celebrity in service..");

        String name = req.getParameter("cname");
        String famousFor = req.getParameter("famousfor");
        System.out.println("Name:" + name);
        System.out.println("FamousFor:" + famousFor);

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Celebrity details send successfully!!");


    }
}
