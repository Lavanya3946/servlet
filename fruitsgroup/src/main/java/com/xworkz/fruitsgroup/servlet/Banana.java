package com.xworkz.fruitsgroup.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/banana", loadOnStartup = 1)
public class Banana extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String farmername = req.getParameter("fname");
        String pricestr = req.getParameter("pname");
        String quantitystr = req.getParameter("qname");
        double price = Double.parseDouble(pricestr);
        int quantity = Integer.parseInt(quantitystr);

        double totalcost = price * quantity;
        PrintWriter printWriter = resp.getWriter();
        printWriter.println(" Banana details sent succesfully..");
        printWriter.println("The total cost of banana:" + totalcost);

        System.out.println("Farmer Name:" + farmername);
        System.out.println("Price:" + price);
        System.out.println("Quantity:" + quantity);
        System.out.println("Total cost:" + totalcost);
    }
}
