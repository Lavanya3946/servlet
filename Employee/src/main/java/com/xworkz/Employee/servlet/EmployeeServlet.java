package com.xworkz.Employee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/employee", loadOnStartup = 1)
public class EmployeeServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Service method..");

        String Name = req.getParameter("ename");
        String Email = req.getParameter("eemail");
        String id = req.getParameter("Id");
        String Address = req.getParameter("address");

        System.out.println("Name:" + Name);
        System.out.println("Email:" + Email);
        System.out.println("Id:" + id);
        System.out.println("Address:" + Address);


//        PrintWriter printWriter=resp.getWriter();
//        printWriter.println("Employee form submiteed ");

        resp.setContentType("text/html");

        String htmlResponse = "<html" +
                "<head>" +
                "<title>Employee Form</title>" +
                "</head>" +
                "<body>" +
                "<p style='color:green;'>" +
                "Name:" + Name + "<br>" +
                "Email:<u>" + Email + "</u><br>" +
                "Id:" + id + "<br>" +
                "Address:" + Address +
                "</p>" +
                "</body>" +
                "</html>";

        resp.getWriter().write(htmlResponse);
    }
}
