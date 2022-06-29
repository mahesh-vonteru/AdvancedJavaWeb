package com.learning.model;

import java.sql.SQLException;
import java.util.List;

public class Trail {
    public static void main(String[] args) throws SQLException {
        DBService ex = new DBService();
       List<Student> st  =  ex.getStudentsDetails();
        System.out.println(st.toString());
    }
}
