package com.xworkz.milk.repositary;

import com.xworkz.milk.dto.CricketTournamentFormDto;
import com.xworkz.milk.dto.MilkFormDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CricketRepoImpl implements CricketRepo {
    private String DB_URL = "jdbc:mysql://localhost:3306/market";
    private String DB_USERNAME = "root";
    private String DB_PASSWORD = "root";

    @SneakyThrows
    @Override
    public void save(CricketTournamentFormDto dto) {
        System.out.println("should save in DB:" + dto);
        System.out.println("saved in CricketRepoImpl..!");

        String insertTeam = "insert into cricket_table values(0,'" + dto.getTournamentName() + "','" + dto.getOrganizerName() + "','" + dto.getLocation() + "','" + dto.getStartDate() + "','" + dto.getEndDate() + "'," + dto.getTotalTeams() + "," + dto.getContactNumber() + ",'" + dto.getEmail() + "')";

        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement()) {

            int row = statement.executeUpdate(insertTeam);
            System.out.println("No of rows inserted:" + row);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @SneakyThrows
    @Override
    public List<CricketTournamentFormDto> getAll() {
        System.out.println("running getAll in CricketRepoImpl..");
        String query = "SELECT * FROM cricket_table";
        Class.forName("com.mysql.cj.jdbc.Driver");
        List<CricketTournamentFormDto> cricketDtoList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("cricket_id");
                String name = resultSet.getString("tournamentName");
                String organizer = resultSet.getString("organizerName");
                String location = resultSet.getString("location");
                String startDate = resultSet.getString("startDate");
                String endDate = resultSet.getString("endDate");
                int totalTeams = resultSet.getInt("totalTeams");
                long contact = resultSet.getLong("contactNumber");
                String email = resultSet.getString("email");

                CricketTournamentFormDto cricketTournamentFormDto = new CricketTournamentFormDto(id, name, organizer, location, startDate, endDate, totalTeams, contact, email);
                cricketDtoList.add(cricketTournamentFormDto);
            }
            System.out.println("Total rows: " + cricketDtoList.size());
            return cricketDtoList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}




