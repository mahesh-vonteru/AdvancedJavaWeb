package com.learning.servlets;

import com.learning.jdbc.ConnectionFactory;
import com.learning.model.ConnectionFactory2;
import com.learning.model.DBService;
import com.learning.model.Student;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    @Override
    public void init() {
        message = "Hello World!";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        DBService service = new DBService();
        response.setContentType("text/html");
        System.out.println("Came to servlet do get method");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<table border=1 width=15% height=15%>");
        out.println("<h4>PRINTING STUDENT DETAILS - GET METHOD </h4>");
        out.println("<tr><th>ST NAME</th><th>ST PASS</th><th>ST MARKS</th><th>ST COLL</th></tr>");
        try {
            List<Student> students = service.getStudentsDetails();
            for (Student student : students) {
                out.println("<tr><td>" + student.getName() + "</td><td>" + student.getPassword() + "</td><td>"
                        + student.getMarks() + "</td><td>" + student.getCollege() + "</td></tr>");

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        out.println("</table>");
        out.println("</body></html>");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Connection conn = null;
        try {
            conn = ConnectionFactory.produceConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String name = request.getParameter("Studentname");
        String password = request.getParameter("Password");
        int marks = Integer.parseInt(request.getParameter("Studentmarks"));
        String college = request.getParameter("Studentcollege");
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
