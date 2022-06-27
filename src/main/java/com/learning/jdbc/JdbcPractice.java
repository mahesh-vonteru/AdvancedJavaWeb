package com.learning.jdbc;

import java.sql.*;
import java.util.List;

@SuppressWarnings("ALL")
public class JdbcPractice {
    public static void main(String[] args) throws SQLException {
        String query = "SELECT * FROM jdbc.employe WHERE name = ?";
        query = query + " OR 1==1";
        String userdata = "";
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbcpractice",
                "postgres",
                "postgres");
        System.out.println(conn);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        rs.next();
        System.out.println("ID "+"  "+" NAME "+"   "+" DEPARTMENT "+"   "+"SALARY "+"     "+
                             "   EMAIL ID  "+"     "+"        LOCATION "+"  "+"PHONE NUMBER ");
        System.out.println("-------------------------------------------------------------------------------------------");
       userdata = rs.getInt(1) + "     " + rs.getString(2) + "   " + rs.getString(3)
                    + "   " + rs.getDouble(4) + "    " + rs.getString(5) + "     " + rs.getString(6) +
                    "   " + rs.getString(7);
        System.out.println(userdata);
        rs.next();
        userdata = rs.getInt(1)+"     "+rs.getString(2)+"    "+rs.getString(3)
                +"  "+rs.getDouble(4)+"    "+rs.getString(5)+"      "+rs.getString(6)+
                "   "+rs.getString(7);
        System.out.println(userdata);
        rs.next();
        userdata = rs.getInt(1)+"     "+rs.getString(2)+"      "+rs.getString(3)
                +"    "+rs.getDouble(4)+"    "+rs.getString(5)+"             "+rs.getString(6)+
                "  "+rs.getString(7);
        System.out.println(userdata);
        rs.next();
        userdata = rs.getInt(1)+"     "+rs.getString(2)+"      "+rs.getString(3)
                +"     "+rs.getDouble(4)+"    "+rs.getString(5)+"            "+rs.getString(6)+
                "  "+rs.getString(7);
        System.out.println(userdata);
        rs.next();
        userdata = rs.getInt(1)+"     "+rs.getString(2)+"    "+rs.getString(3)
                +"   "+rs.getDouble(4)+"    "+rs.getString(5)+"            "+rs.getString(6)+
                "  "+rs.getString(7);
        System.out.println(userdata);
        st.close();
        conn.close();

    }
}
