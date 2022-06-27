package com.learning.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    static Connection produceConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbcpractice",
                "postgres",
                "postgres");
    }
}
