package com.learning.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBService {



        public List<Student> getStudentsDetails () throws SQLException {
            Connection conn = ConnectionFactory2.produceConnection();
            List<Student> students = new ArrayList<>();
            // Goto Database
            // Get all students into resultset
            // iterate resultset with while loop
            // put values into each student object
            // add that student object to list
            String query = "SELECT *FROM jdbc.student;";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String stname = rs.getString(1);
                String stpassword = rs.getString(2);
                int stmarks = rs.getInt(3);
                String stcollege = rs.getString(4);
                students.add(new Student(stname, stpassword, stmarks, stcollege));
            }
            return students;
        }


}
