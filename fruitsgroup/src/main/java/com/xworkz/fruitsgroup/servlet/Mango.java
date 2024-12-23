package com.xworkz.fruitsgroup.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/mango", loadOnStartup = 1)
public class Mango extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Details of Employee and Company ");


        String Ename = req.getParameter("ename");
        String Email = req.getParameter("email");
        String Address = req.getParameter("eaddress");
        String Age = req.getParameter("age");
        String Dob = req.getParameter("dob");
        String Marital = req.getParameter("mstatus");
        String Salary = req.getParameter("salary");
        String Education = req.getParameter("education");
        String Role = req.getParameter("role");
        String Id = req.getParameter("id");
        String experience = req.getParameter("exp");
        String teamLeaderName = req.getParameter("team");
        String noOfTeam = req.getParameter("no");
        String emp1 = req.getParameter("tname1");
        String emp2 = req.getParameter("tname2");
        String emp3 = req.getParameter("tname3");
        String emp4 = req.getParameter("tname4");
        String emp5 = req.getParameter("tname5");
        String emp6 = req.getParameter("tname6");
        String emp7 = req.getParameter("tname7");

        String companyName = req.getParameter("cname");
        String address = req.getParameter("caddress");
        String yearOfCompany = req.getParameter("year");
        String Ceo = req.getParameter("ceo");
        String managerName = req.getParameter("manager");
        String noOfBranches = req.getParameter("branch");
        String noOfWorkers = req.getParameter("workers");

        System.out.println("Employee Name:" + Ename);
        System.out.println("Employee email:" + Email);
        System.out.println("Employee Address:" + Address);
        System.out.println("Employee Age" + Age);
        System.out.println(" Employee Dob" + Dob);
        System.out.println("Marital status:" + Marital);
        System.out.println("Salary:" + Salary);
        System.out.println("Education" + Education);
        System.out.println("Role" + Role);
        System.out.println("Id:" + Id);
        System.out.println("Experience:" + experience);
        System.out.println("Team Leader Name:" + teamLeaderName);
        System.out.println("No Of Teams members:" + noOfTeam);
        System.out.println("Team employee 1 name:" + emp1);
        System.out.println("Team employee 2 name:" + emp2);
        System.out.println("Team employee 3 name:" + emp3);
        System.out.println("Team employee 4 name:" + emp4);
        System.out.println("Team employee 5 name:" + emp5);
        System.out.println("Team employee 6 name:" + emp6);
        System.out.println("Team employee 7 name:" + emp7);


        System.out.println("Company Name:" + companyName);
        System.out.println("Company Address:" + address);
        System.out.println("Year of company:" + yearOfCompany);
        System.out.println("Ceo of comapny:" + Ceo);
        System.out.println("Manager name:" + managerName);
        System.out.println("No Of Branches:" + noOfBranches);
        System.out.println("No Of Workers:" + noOfWorkers);


        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Employee and company details sent succesfully..");

        printWriter.println("Employee details..");
        printWriter.println("Employee name:" + Ename);
        printWriter.println("Emmployee email:" + Email);
        printWriter.println("Employee address:" + Address);
        printWriter.println("Employee Age:" + Age);
        printWriter.println("Employee Dob:" + Dob);
        printWriter.println("Marital status:" + Marital);
        printWriter.println("Salary:" + Salary);
        printWriter.println("Education" + Education);
        printWriter.println("Role:" + Role);
        printWriter.println("Employee id:" + Id);
        printWriter.println("Employee experience:" + experience);
        printWriter.println("Team Leader Name:" + teamLeaderName);
        printWriter.println("No Of team Members:" + noOfTeam);
        printWriter.println("Team employee name 1:" + emp1);
        printWriter.println("Team employee name 2:" + emp2);
        printWriter.println("Team employee name 3:" + emp3);
        printWriter.println("Team employee name 4:" + emp4);
        printWriter.println("Team employee name 5:" + emp5);
        printWriter.println("Team employee name 6:" + emp6);
        printWriter.println("Team employee name 7:" + emp7);


        printWriter.println("Employee Working Details...");
        printWriter.println("Company Name:" + companyName);
        printWriter.println("Company Address:" + address);
        printWriter.println("Year of company:" + yearOfCompany);
        printWriter.println(" Ceo of company:" + Ceo);
        printWriter.println("Manager name:" + managerName);
        printWriter.println("No Of branches:" + noOfBranches);
        printWriter.println("No of Workers:" + noOfWorkers);


    }
}
