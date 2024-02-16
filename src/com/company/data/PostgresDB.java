package com.company.data;

import com.company.data.interfaces.IDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgresDB implements IDB {

    @Override
    public Connection getConnection() {
        String connectionUrl = "jdbc:postgresql://localhost:5432/testdb";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "0000");
            return con;
        } catch (Exception e) {
            System.out.println("Failed to connect to postgres: " + e.getMessage());
            return null;
        }
    }
}
