package com.learning.jdbc;

import java.sql.*;
@SuppressWarnings("SqlNoDataSourceInspection")
public class JdbcPractice1 {
    public static void main(String[] args) throws SQLException {
      Connection conn = null;
      PreparedStatement pst = null;
      try {
        Employe emjdbc  = new Employe(
                8,
                "radha",
                "accounts",
                20000,"eadhap@gmail.com",
                "kavali",
                "9490224578");
        String query = "INSERT INTO jdbc.employe VALUES (?,?,?,?,?,?,?)";

        conn = ConnectionFactory.produceConnection();

        System.out.println(conn);
        pst = conn.prepareStatement(query);
        pst.setInt(1,emjdbc.getId());
        pst.setString(2,emjdbc.getName());
        pst.setString(3,emjdbc.getDepartment());
        pst.setDouble(4,emjdbc.getSalary());
        pst.setString(5,emjdbc.getEmail());
        pst.setString(6,emjdbc.getAddress());
        pst.setString(7,emjdbc.getPhonenomber());
        int x = pst.executeUpdate();
        System.out.println(x+"row updated");

        /*
        1. Register Driver
        2. Acquire connection
        3. Prepare statement
        4. execute statement
        5. Process results
        6. Close connection / statement
         */
      } catch (SQLException e) {
        throw new RuntimeException(e);
      } finally {
        if(conn != null)
          conn.close();

        if(pst != null)
          pst.close();
      }
    }


}
