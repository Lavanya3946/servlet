package com.xworkz.milk.servlet;

import com.xworkz.milk.dto.MilkFormDto;
import com.xworkz.milk.impl.MilkServiceImpl;
import com.xworkz.milk.service.MilkService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/MilkService", loadOnStartup = 1)
public class MilkServlet extends HttpServlet {
    private MilkService milkService = new MilkServiceImpl();
    private Map<String, Double> map = new HashMap<>();

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
        String brand = req.getParameter("brand");
        String type = req.getParameter("type");
        int convertedQuantity = Integer.parseInt(req.getParameter("quantity"));

        double priceResult = map.get(type);
        double total = priceResult * convertedQuantity;

        MilkFormDto milkFormDto = new MilkFormDto(brand, type, convertedQuantity, total);
        boolean res = milkService.service(milkFormDto);

        String message = "<u>Order Details:</u><br>" +
                "Brand: " + milkFormDto.getBrand() + "<br>" +
                "Type: " + milkFormDto.getType() + "<br>" +
                "Quantity: " + milkFormDto.getQuantity() + "<br>" +
                "Total Cost: " + milkFormDto.getTotal() + "<br>";
        if (res) {
            req.setAttribute("message", message);
        } else {
            req.setAttribute("message", "Not saved");
        }

        String order = "<div style='text-align:center;'><span style='color:red;'>Ordered Successfully...!</span></div>";
        req.setAttribute("order", order);

        req.getRequestDispatcher("MilkForm.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<MilkFormDto> milkRecords = this.milkService.getAll();
        req.setAttribute("milkRecords", milkRecords);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("MilkResult.jsp");
        requestDispatcher.forward(req, resp);
    }
}
