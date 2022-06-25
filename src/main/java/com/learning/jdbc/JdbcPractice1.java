package com.learning.jdbc;
import java.sql.*;
public class JdbcPractice1 {
    public static void main(String[] args) throws SQLException
    {
      Employe emjdbc  = new Employe(8,"radha","accounts",20000,"eadhap@gmail.com","kavali"
      ,"9490224578");
        String query = "INSERT INTO jdbc.employe VALUES (?,?,?,?,?,?,?)";
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcpractice",
                "postgres", "postgres");
        System.out.println(conn);
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setInt(1,emjdbc.getId());
        pst.setString(2,emjdbc.getName());
        pst.setString(3,emjdbc.getDepartment());
        pst.setDouble(4,emjdbc.getSalary());
        pst.setString(5,emjdbc.getEmail());
        pst.setString(6,emjdbc.getAddress());
        pst.setString(7,emjdbc.getPhonenomber());
        int x = pst.executeUpdate();
        System.out.println(x+"row updated");

        //String userdata = "";
        pst.close();
        conn.close();
    }


}
