package com.learning.model;

import com.learning.jdbc.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBService {

        public List<Student> getStudentsDetails () throws SQLException {
            Connection conn = ConnectionFactory.produceConnection();
            List<Student> students = new ArrayList<>();
            // Goto Database
            // Get all students into resultset
            // iterate resultset with while loop
            // put values into each student object
            // add that student object to list
            String query = "SELECT * FROM jdbc.student;";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String stname = rs.getString("name");
                String stpassword = rs.getString(2);
                int stmarks = rs.getInt(3);
                String stcollege = rs.getString(4);
                students.add(new Student(stname, stpassword, stmarks, stcollege));
            }
            return students;

        }

   }
