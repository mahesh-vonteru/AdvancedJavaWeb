package com.learning.model;

import com.learning.jdbc.ConnectionFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBService {

    public List<Student> getStudentsDetails() throws SQLException {
        ConnectionFactory.produceConnection();
        List<Student> students = new ArrayList<>();
        // Goto Database
        // Get all students into resultset
        // iterate resultset with while loop
        // put values into each student object
        // add that student object to list
        return students;
    }
}
