package com.learning.model;

import com.learning.jdbc.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBService {
        String name,password,college;
        int marks;

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
            conn.close();
            pst.close();
            return students;

        }
        public void  insertDetails(String name,String password,int marks,String college) throws SQLException
        {
            this.name = name;
            this.password = password;
            this.marks = marks;
            this.college = college;
            Connection conn = null;
            try {
                conn = ConnectionFactory.produceConnection();
            } catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
            try {
                String query = "INSERT INTO jdbc.student(name, passward, marks, college) VALUES (?, ?, ?, ?);";
                PreparedStatement pst = conn.prepareStatement(query);
                pst = conn.prepareStatement(query);
                pst.setString(1, name);
                pst.setString(2, password);
                pst.setInt(3, marks);
                pst.setString(4, college);
                pst.executeUpdate();
                conn.close();
                pst.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

   }
