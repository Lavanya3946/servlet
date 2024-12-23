package com.xworkz.milk.servlet;



import com.xworkz.milk.dto.CricketTournamentFormDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/TournamentService", loadOnStartup = 1)
public class CricketTournamentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tournamentName = req.getParameter("tournamentName");
        String organizerName = req.getParameter("organizerName");
        String location = req.getParameter("location");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        int totalTeams = Integer.parseInt(req.getParameter("totalTeams"));
        String contactNumber = req.getParameter("contactNumber");
        String email = req.getParameter("email");

        CricketTournamentFormDto tournamentFormDto = new CricketTournamentFormDto(tournamentName, organizerName, location, startDate, endDate, totalTeams, contactNumber, email);
        req.setAttribute("tournamentOrder", tournamentFormDto);

        String message = "<h2>Cricket Tournament Form Details</h2>" +
                "<p>Tournament Name: " + tournamentFormDto.getTournamentName() + "</p>" +
                "<p>Organizer Name: " + tournamentFormDto.getOrganizerName() + "</p>" +
                "<p>Location: " + tournamentFormDto.getLocation() + "</p>" +
                "<p>Start Date: " + tournamentFormDto.getStartDate() + "</p>" +
                "<p>End Date: " + tournamentFormDto.getEndDate() + "</p>" +
                "<p>Total Teams: " + tournamentFormDto.getTotalTeams() + "</p>" +
                "<p>Contact Number: " + tournamentFormDto.getContactNumber() + "</p>" +
                "<p>Email: " + tournamentFormDto.getEmail() + "</p>" +
                "<h3 style='color:green;'>Booked Successfully....!</h3>";
        req.setAttribute("message", message);

        req.getRequestDispatcher("CricketTournamentForm.jsp").forward(req, resp);
    }
}
