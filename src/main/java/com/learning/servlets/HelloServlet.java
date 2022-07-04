package com.learning.servlets;

import com.learning.model.DBService;
import com.learning.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    @Override
    public void init() {
        message = "Hello World!";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        DBService service = new DBService();
        List<Student> students = null;
        try {
            students = service.getStudentsDetails();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.setAttribute("student",students);
        RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
        rd.forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        DBService service = new DBService();
        String name = request.getParameter("Studentname");
        String password = request.getParameter("Password");
        int marks = Integer.parseInt(request.getParameter("Studentmarks"));
        String college = request.getParameter("Studentcollege");
        try {
            service.insertDetails(name,password,marks,college);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        PrintWriter out = response.getWriter();
        out.println("<html><body><b>SUCCESS FULLY SUBMITTED </b></body></html>");
        response.sendRedirect("success.jsp");

    }
}
