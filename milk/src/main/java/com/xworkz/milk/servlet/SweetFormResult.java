package com.xworkz.milk.servlet;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/sweet" , loadOnStartup = 1)
public class SweetFormResult extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String shopName = req.getParameter("shop_name" );
        String sweetName = req.getParameter("sweet_name");
        String special =  req.getParameter("order_type");
        String normal =   req.getParameter("order_type");
        String quantity =  req.getParameter("quantity");
        String message = "Order Confirmation Shop Name: " + shopName +
                " Sweet Name:" + sweetName + " Type :" + special +" " +
                " Quantity : " + quantity + "Ordered Successfully! ";
        RequestDispatcher dispatcher = req.getRequestDispatcher("SweetForm.jsp");

        req.setAttribute("message",message);

        dispatcher.forward(req,resp);


}
}