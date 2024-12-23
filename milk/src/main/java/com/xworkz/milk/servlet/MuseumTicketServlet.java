package com.xworkz.milk.servlet;

import com.xworkz.milk.dto.MuseumTicketFormDto;
import com.xworkz.milk.impl.MuseumServiceImpl;
import com.xworkz.milk.service.MuseumService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/TicketService", loadOnStartup = 1)
public class MuseumTicketServlet extends HttpServlet {
    private MuseumService museumService=new MuseumServiceImpl();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerName = req.getParameter("customerName");
        int totalAdultMembers = Integer.parseInt(req.getParameter("totalAdultMembers"));
        int totalChildMembers = Integer.parseInt(req.getParameter("totalChildMembers"));
        String mobileNo = req.getParameter("mobileNo");
        String email = req.getParameter("email");
        String invalid="name starts with upper case and email should contains @gmail.com";

        MuseumTicketFormDto ticketFormDto = new MuseumTicketFormDto(customerName, totalAdultMembers, totalChildMembers, mobileNo, email);
        req.setAttribute("ticketOrder", ticketFormDto);
        museumService.service(ticketFormDto);
        String message = "<h1>Museum Ticket Preview</h1>\n" +
                "<span style='color:blue;'>" +
                " <h4>Customer Name:" + ticketFormDto.getCustomerName() + "<br>" +
                " Total Adult Members:" + ticketFormDto.getTotalAdultMembers() + "<br>" +
                " Total Child Members:" + ticketFormDto.getTotalChildMembers() + "<br>" +
                " Mobile No:" + ticketFormDto.getMobileNo() + "<br> " +
                " Email:" + ticketFormDto.getEmail() + "</h4></span>";
        String order = "<h3><span style ='color:red;'> Ticket Booked Successfully....!</span></h3>";
        req.setAttribute("order", order);
      if(Character.isUpperCase(customerName.charAt(0))&&email.contains("@gmail.com")) {
          req.setAttribute("message", message);
      }
      else{
          req.setAttribute("message", invalid);

      }
        req.getRequestDispatcher("MuseumForm.jsp").forward(req, resp);
    }
}



