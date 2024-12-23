package com.xworkz.fruitsgroup.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/apple", loadOnStartup = 1)
public class Apple extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String Type = req.getParameter("type");
        String GrownIn = req.getParameter("grownIn");
        String Imported = req.getParameter("imported");
        String Color = req.getParameter("color");
        String pricePerKg = req.getParameter("price");
        System.out.println("Type:" + Type);
        System.out.println("GrownIn:" + GrownIn);
        System.out.println("Imported:" + Imported);
        System.out.println("Color:" + Color);
        System.out.println("PricePerKg:" + pricePerKg);


        PrintWriter printWriter = resp.getWriter();
        printWriter.println(" Apple details sent succesfully..");
    }
}
