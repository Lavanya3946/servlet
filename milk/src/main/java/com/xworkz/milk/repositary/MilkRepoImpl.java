package com.xworkz.milk.repositary;

import com.xworkz.milk.dto.MilkFormDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MilkRepoImpl implements MilkRepo {

    private   String DB_URL = "jdbc:mysql://localhost:3306/market";
    private  String DB_USERNAME = "root";
    private  String DB_PASSWORD = "root";

    @SneakyThrows
    @Override
    public void save(MilkFormDto milkFormDto) {
        System.out.println("should save milkDto to DB " + milkFormDto);
        System.out.println("saved in MilkRepoImpl..");

        String insertMilk = "INSERT INTO milk_table (milk_brand, milk_type, milk_quantity, milk_total) VALUES ('"
                + milkFormDto.getBrand() + "', '"
                + milkFormDto.getType() + "', "
                + milkFormDto.getQuantity() + ", "
                + milkFormDto.getTotal() + ")";

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement()) {

            int rowsInserted = statement.executeUpdate(insertMilk);
            System.out.println("Rows after inserted: " + rowsInserted);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @SneakyThrows
    @Override
    public List<MilkFormDto> getAll() {
        System.out.println("running getAll in MilkRepoImpl..");
        String query = "SELECT * FROM milk_table";
        Class.forName("com.mysql.cj.jdbc.Driver");

        List<MilkFormDto> milkDtoList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("milk_id");
                String brand = resultSet.getString("milk_brand");
                String type = resultSet.getString("milk_type");
                int quantity = resultSet.getInt("milk_quantity");
                double total = resultSet.getDouble("milk_total");

                MilkFormDto milkFormDto = new MilkFormDto(brand, type, quantity, total);
                milkFormDto.setId(id);
                milkDtoList.add(milkFormDto);
            }
            System.out.println("Total rows: " + milkDtoList.size());
            return milkDtoList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
