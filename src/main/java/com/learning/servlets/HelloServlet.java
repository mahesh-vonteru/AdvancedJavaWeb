package com.learning.servlets;

import com.learning.model.DBService;
import com.learning.model.Student;

import java.io.*;
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
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>PRINTING FROM SERVLET - GET METHOD </h1>");
        out.println("<table><tr>");
        try {
            List<Student> students = service.getStudentsDetails();
            for (Student student: students) {
                out.println("<h1>PRINTING FROM SERVLET - GET METHOD </h1>");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        out.println("</body></html>");



    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>PRINTING FROM SERVLET - POST METHOD </h1>");
        out.println("</body></html>");
    }
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        System.out.println("Came to servlet do get method");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>PRINTING FROM SERVLET - GET METHOD </h1>");
        out.println("</body></html>");

    }

    @Override
    public void destroy() {
    }
}