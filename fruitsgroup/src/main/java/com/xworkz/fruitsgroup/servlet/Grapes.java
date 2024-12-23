package com.xworkz.fruitsgroup.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/grapes", loadOnStartup = 1)
public class Grapes extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("This is garpes  deatils..");

        String shopName = req.getParameter("name");
        String ownerName = req.getParameter("oname");
        String shopRent = req.getParameter("rent");
        String gstNo = req.getParameter("gst");
        String shopAddress = req.getParameter("address");
        String shopOpenTime = req.getParameter("otime");
        String shopCloseTime = req.getParameter("ctime");
        String worker1 = req.getParameter("wname1");
        String worker2 = req.getParameter("wname2");
        String worker3 = req.getParameter("wname3");
        String worker4 = req.getParameter("wname4");
        String worker5 = req.getParameter("wname5");


        System.out.println("Shop Name:" + shopName);
        System.out.println("Owner Name:" + ownerName);
        System.out.println("Shop Rent:" + shopRent);
        System.out.println("Shop Gst No:" + gstNo);
        System.out.println("Shop Address:" + shopAddress);
        System.out.println("Shop Open Time:" + shopOpenTime);
        System.out.println("shop Close Time:" + shopCloseTime);
        System.out.println("Worker 1  name:" + worker1);
        System.out.println("Worker 2  name:" + worker2);
        System.out.println("Worker 3  name:" + worker3);
        System.out.println("Worker 4  name:" + worker4);
        System.out.println("Worker 5  name:" + worker5);


        PrintWriter printWriter = resp.getWriter();
        printWriter.println("  Details of Grapes ..");
        printWriter.println("Shop Name:" + shopName);
        printWriter.println("Owner  Name:" + ownerName);
        printWriter.println("Shop Rent:" + shopRent);
        printWriter.println("Shop Gst No:" + gstNo);
        printWriter.println("Shop Address:" + shopAddress);
        printWriter.println("Shop open Time:" + shopOpenTime);
        printWriter.println("Shop close Time:" + shopCloseTime);
        printWriter.println("Worker 1 name:" + worker1);
        printWriter.println("Worker 2 name:" + worker2);
        printWriter.println("Worker 3 name:" + worker3);
        printWriter.println("Worker 4 name:" + worker4);
        printWriter.println("Worker 5 name:" + worker5);

    }
}
