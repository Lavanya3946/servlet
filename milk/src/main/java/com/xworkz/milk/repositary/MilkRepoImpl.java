package com.xworkz.milk.repositary;

import com.xworkz.milk.dto.MilkFormDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MilkRepoImpl implements MilkRepo {
    @Override
    public void save(MilkFormDto milkFormDto) {
        System.out.println("should save milkDto to DB"+milkFormDto);
        System.out.println("saved in MilkRepoImpl..");
        Connection connection=null;
        String url="jdbc:mysql://localhost:3306/market";
        String password="root";
        String userName="root";
        String insertMilk="insert into milk_table values(0,'"+milkFormDto.getBrand()+"','"+milkFormDto.getType()+"',"+milkFormDto.getQuantity()+","+milkFormDto.getTotal()+")";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(url,userName,password);
            Statement statement=connection.createStatement();
             int row=statement.executeUpdate(insertMilk);
            System.out.println("Rows after inserted:"+row);
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
