package com.xworkz.milk.servlet;

import com.xworkz.milk.dto.MilkFormDto;
import com.xworkz.milk.impl.MilkServiceImpl;
import com.xworkz.milk.service.MilkService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/MilkService" ,loadOnStartup = 1)
public class MilkServlet extends HttpServlet {

    Map<String, Double> map = new HashMap<>();

    @Override
    public void init() {
        System.out.println("init the milk servlet..");
        map.put("special", 56.0);
        map.put("ordinary", 54.0);
        map.put("goodlife", 67.0);
        map.put("goodlife_lite", 68.0);
        map.put("family", 56.0);
        map.put("buffalo", 70.0);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String brand=req.getParameter("brand");
        String type=req.getParameter("type");
        int convertedQuantity=Integer.parseInt(req.getParameter("quantity"));

        double priceResult=map.get(type);
        double total=priceResult*convertedQuantity;


        MilkFormDto milkFormDto=new MilkFormDto(brand,type,convertedQuantity,total);
        MilkService milkService=new MilkServiceImpl();
       boolean res= milkService.service(milkFormDto);




         String message="<u>Order Details:</u><br>" +
                 "Brand: " + milkFormDto.getBrand() + "<br>" +
                 "Type: " + milkFormDto.getType() + "<br>" +
                 "Quantity: " + milkFormDto.getQuantity() + "<br>" +
                 "Total Cost: " + milkFormDto.getTotal() + "<br>" ;
        if(res==true){
            req.setAttribute("message",message);

        }
        else {
            req.setAttribute("message","not saved");
        }


        String order="<div style='text-align:center;'><span style ='color:red;'text-align='center'>Ordered Succesfully...!</span></div>";

         req.setAttribute("order",order);
        req.getRequestDispatcher("MilkForm.jsp").forward(req,resp);
    }
}
