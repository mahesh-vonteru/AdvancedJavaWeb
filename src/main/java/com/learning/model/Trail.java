package com.learning.model;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Trail {
    public static void main(String[] args) throws SQLException {
        DBService ex = new DBService();
        List<Student> st = ex.getStudentsDetails();
        System.out.println(st.toString());
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE NAME OF DELETE NAME IN DATA BASE");
        String name = scan.nextLine();
        ex.deleteRecord(name);
    }

}
