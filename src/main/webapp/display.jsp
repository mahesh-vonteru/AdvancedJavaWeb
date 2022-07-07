<%@ page import="com.learning.model.DBService" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: Mahesh
  Date: 7/1/2022
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://pepalatech.in" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-image: url('./images/175640.jpg')">
<h2 style="border:orange;
           border-width:5px;
           border-style:solid;
           border-radius: 50px;
           text-align: center;
           background-color: lightsteelblue;
           color: red ">STUDENT DETAILS FROM DATABASE</h2>
<table style="border: 1px solid black; width: 60%; margin-left: 250px; ">
    <tr style="border: 1px solid black;">
        <th style="background-color: darkgrey; color: red">Student Name</th>
        <th style="background-color: darkgrey; color: red">Student Password</th>
        <th style="background-color: darkgrey; color: red">Student Marks</th>
        <th style="background-color: darkgrey; color: red">Student college</th>
        <th style="background-color: darkgrey; color: red">Actions</th>
    </tr>
    <c:forEach var="s" items="${student}">
        <tr style="border: 1px solid black; width: revert">
            <td style="border: 1px solid black;
           border-radius: 5px;
           background-color: silver;
           text-align: center;
           padding: 6px 6px 6px 6px;">${s.name}</td>
            <td style="border: 1px solid black; border-radius: 5px;  background-color: silver; text-align: center;">${s.password}</td>
            <td style="border: 1px solid black; border-radius: 5px;  background-color: silver; text-align: center;">${s.marks}</td>
            <td style="border: 1px solid black; border-radius: 5px; background-color: silver; text-align: center;">${s.college}</td>
            <td style="border: 1px solid black; border-radius: 5px; background-color: silver; text-align: center;">
                <input type="button" value="update" onclick="updateStudent(this)" student-name="${s.name}" student-password="${s.password}" >
                <input type="button" value="delete">
            </td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
