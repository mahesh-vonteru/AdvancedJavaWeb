package com.learning.jdbc;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection produceConnection() throws SQLException {
        DriverManager.registerDriver(new Driver());
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbcpractice",
                "postgres",
                "postgres");

    }

    private ConnectionFactory(){

    }
}
