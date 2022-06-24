package com.learning.jdbc;
import java.sql.*;
public class JdbcPractice1 {
    public static void main(String[] args) throws SQLException
    {
        String query = "INSERT INTO jdbc.employe VALUES (7,'rajesh','development', 50000, 'rajesh.v@gmail.com', " +
                "'kavali', '8466999055')";
        String query1 =  " SELECT * FROM jdbc.employe";
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcpractice",
                "postgres", "postgres");
        System.out.println(conn);
        Statement st = conn.createStatement();
        int x = st.executeUpdate(query);
        System.out.println(x+"row updated");
        ResultSet rs = st.executeQuery(query1);
        String userdata = "";
        while(rs.next())
        {
            userdata = rs.getInt(1) + "     " + rs.getString(2) + "   " + rs.getString(3)
                    + "   " + rs.getDouble(4) + "    " + rs.getString(5) + "     " + rs.getString(6) +
                    "   " + rs.getString(7);
            System.out.println(userdata);
        }
        st.close();
        conn.close();
    }


}
