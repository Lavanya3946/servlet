package com.xworkz.milk.repositary;

import com.xworkz.milk.dto.MuseumTicketFormDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MuseumRepoImpl implements MuseumRepo{

    @Override
    public void save(MuseumTicketFormDto museumTicketFormDto) {
        System.out.println("should save museumDto to DB" +museumTicketFormDto);
        System.out.println("Saved in MuseumRepoImpl");
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/market";
        String password = "root";
        String userName = "root";
        String insertTicket="insert into museum_table values(0,'"+museumTicketFormDto.getCustomerName()+"',"+museumTicketFormDto.getTotalChildMembers()+","+museumTicketFormDto.getTotalChildMembers()+","+museumTicketFormDto.getMobileNo()+",'"+museumTicketFormDto.getEmail()+"')";
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

}

