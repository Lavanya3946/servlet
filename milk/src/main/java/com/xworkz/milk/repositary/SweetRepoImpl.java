package com.xworkz.milk.repositary;

import com.xworkz.milk.dto.SweetFormDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SweetRepoImpl implements SweetRepo {
    @Override
    public void save(SweetFormDto sweetFormDto) {
        System.out.println("should save milkDto to DB" + sweetFormDto);
        System.out.println("saved in SweetRepoImpl..");
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/market";
        String password = "root";
        String userName = "root";
        String insertSweet = "insert into sweet_table values(0,'" + sweetFormDto.getShopName() + "','" + sweetFormDto.getSweetName() + "'," + sweetFormDto.isSpecial() + "," + sweetFormDto.getQuantity() + "," + sweetFormDto.getTotalPrice() + ")";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(insertSweet);
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

