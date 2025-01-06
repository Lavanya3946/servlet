package com.xworkz.milk.repositary;

import com.xworkz.milk.dto.SweetFormDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SweetRepoImpl implements SweetRepo {
    private String DB_URL = "jdbc:mysql://localhost:3306/market";
    private String DB_USERNAME = "root";
    private String DB_PASSWORD = "root";

    @SneakyThrows
    @Override
    public void save(SweetFormDto sweetFormDto) {
        System.out.println("should save milkDto to DB" + sweetFormDto);
        System.out.println("saved in SweetRepoImpl..");

        String insertSweet = "INSERT INTO sweet_table (sweet_shopname, sweet_name, is_special, sweet_quantity, sweet_totalprice) VALUES ('"
                + sweetFormDto.getShopName() + "', '"
                + sweetFormDto.getSweetName() + "', "
                + sweetFormDto.isSpecial() + ", "
                + sweetFormDto.getQuantity() + ", "
                + sweetFormDto.getTotalPrice() + ")";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement()) {
            int rowsInserted = statement.executeUpdate(insertSweet);
            System.out.println("Rows after inserted: " + rowsInserted);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @SneakyThrows
    @Override
    public List<SweetFormDto> getAll() {
        System.out.println("running getAll in SweetRepoImpl..");
        String query = "SELECT * FROM sweet_table";
        Class.forName("com.mysql.cj.jdbc.Driver");

        List<SweetFormDto> sweetDtoList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("sweet_id");
                String shopName = resultSet.getString("sweet_shopname");
                String name = resultSet.getString("sweet_name");
                boolean isSpecial = resultSet.getBoolean("is_special");
                int quantity = resultSet.getInt("sweet_quantity");
                double total = resultSet.getDouble("sweet_totalprice");

                SweetFormDto sweetFormDto = new SweetFormDto(id, shopName, name, isSpecial, quantity, total);
                sweetDtoList.add(sweetFormDto);
            }
            System.out.println("Total rows: " + sweetDtoList.size());
            return sweetDtoList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
