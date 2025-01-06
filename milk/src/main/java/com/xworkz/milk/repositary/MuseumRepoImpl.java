package com.xworkz.milk.repositary;

import com.xworkz.milk.dto.MuseumTicketFormDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MuseumRepoImpl implements MuseumRepo {
    private String DB_URL = "jdbc:mysql://localhost:3306/market";
    private String DB_USERNAME = "root";
    private String DB_PASSWORD = "root";

    @Override
    public void save(MuseumTicketFormDto museumTicketFormDto) {
        System.out.println("should save museumDto to DB" + museumTicketFormDto);
        System.out.println("Saved in MuseumRepoImpl");
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/market";
        String password = "root";
        String userName = "root";
        String insertTicket = "insert into museum_table values(0,'" + museumTicketFormDto.getCustomerName() + "'," + museumTicketFormDto.getTotalChildMembers() + "," + museumTicketFormDto.getTotalChildMembers() + "," + museumTicketFormDto.getMobileNo() + ",'" + museumTicketFormDto.getEmail() + "')";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(insertTicket);
            System.out.println("Rows after inserted:" + row);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @SneakyThrows
    @Override
    public List<MuseumTicketFormDto> getAll() {
        System.out.println("running getAll in MuseumRepoImpl..");
        String query = "SELECT * FROM museum_table";
        Class.forName("com.mysql.cj.jdbc.Driver");

        List<MuseumTicketFormDto> museumDtoList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("museum_id");
                String name = resultSet.getString("museum_customer_name");
                int totalMembers = resultSet.getInt("totaladultmembers");
                int totalChild = resultSet.getInt("totalChildMembers");
                long mobileNo = resultSet.getLong("mobileNo");
                String email = resultSet.getString("email");

                MuseumTicketFormDto museumTicketFormDto=new MuseumTicketFormDto(name,totalMembers,totalChild,mobileNo,email);
                museumTicketFormDto.setId(id);
                museumDtoList.add(museumTicketFormDto);

            }
            System.out.println("Total rows: " + museumDtoList.size());
            return museumDtoList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

