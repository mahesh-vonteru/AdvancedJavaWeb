package com.learning.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory2 {
    public static Connection produceConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbcpractice",
                "postgres",
                "postgres");

    }
}
