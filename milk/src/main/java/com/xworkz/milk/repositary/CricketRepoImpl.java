package com.xworkz.milk.repositary;

import com.xworkz.milk.dto.CricketTournamentFormDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CricketRepoImpl implements CricketRepo {

    @Override
    public void save(CricketTournamentFormDto dto) {
        System.out.println("should save in DB:"+dto);
        System.out.println("saved in CricketRepoImpl..!");
        Connection connection=null;
        String url="jdbc:mysql://localhost:3306/market";
        String userName="root";
        String password="root";
        String insertTeam="insert into cricket_table values(0,'"+dto.getTournamentName()+"','"+dto.getOrganizerName()+"','"+dto.getLocation()+"',"+dto.getStartDate()+","+dto.getEndDate()+","+dto.getTotalTeams()+","+dto.getContactNumber()+",'"+dto.getEmail()+"')";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(url,userName,password);
            Statement statement=connection.createStatement();
           int row= statement.executeUpdate( insertTeam);
            System.out.println("No of rows inserted:"+row);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
