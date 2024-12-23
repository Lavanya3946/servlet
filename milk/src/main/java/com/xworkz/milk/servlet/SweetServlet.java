package com.xworkz.milk.servlet;

import com.xworkz.milk.dto.SweetFormDto;
import com.xworkz.milk.impl.MilkServiceImpl;
import com.xworkz.milk.impl.SweetServiceImpl;
import com.xworkz.milk.service.MilkService;
import com.xworkz.milk.service.SweetService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/Sweet", loadOnStartup = 1)
public class SweetServlet extends HttpServlet {

    private SweetService sweetService = new SweetServiceImpl();

    Map<String, Integer> map = new HashMap<>();

    @Override
    public void init() throws ServletException {
        System.out.println("init in the sweet servlet..");

        map.put("Laddu", 300);
        map.put("Barfi", 350);
        map.put("Jalebi", 250);
        map.put("Jamun", 190);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String ShopName = req.getParameter("shopName");
        String sweetName = req.getParameter("sweetName");
        boolean isSpecial = req.getParameter("isSpecial")!=null&& req.getParameter("isSpecial").equals("on");
        int quantity = Integer.parseInt(req.getParameter("quantity"));



        double normalPrice = map.get(sweetName);
        double addPrice = normalPrice * quantity;
        if (isSpecial) {
            addPrice += 30 * quantity;
        }
        SweetFormDto sweetFormDto = new SweetFormDto(ShopName, sweetName, isSpecial, quantity, addPrice);
        req.setAttribute("sweetOrder", sweetFormDto);

        sweetService.Service(sweetFormDto);
        String message="Shop Name:"+sweetFormDto.getShopName()+ "<br>"+
               " Sweet Name:"+sweetFormDto.getSweetName()+ "<br>"+
                "Special:"+sweetFormDto.isSpecial()+ "<br>"+
                "Quantity:"+sweetFormDto.getQuantity()+"<br>"+
                "Total Cost:"+ sweetFormDto.getTotalPrice()+"<br>"+
               "<span style='color:red;'>Ordered  Sweet Successfully....!</span>";

        req.setAttribute("message",message);
        req.getRequestDispatcher("SweetForm.jsp").forward(req, resp);

    }
}
