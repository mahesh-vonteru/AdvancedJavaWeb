<%--
  Created by IntelliJ IDEA.
  User: vish
  Date: 06/07/22
  Time: 9:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Student</title>

</head>
<body style="background-image: url(./images/student.jpg);background-repeat: no-repeat;background-size: 100%">
<form action="hello-servlet" method="get" style="width: 350px; padding: 20px; position: absolute;
 border: 1px solid black;margin-left: 400px; top: 40%; border-radius: 15px;background-image: url('./images/4893706.webp')">
    <div>
        <p style="color: whitesmoke; text-align: center">Please enter Student Name.....</p>
        <label style="color: #e7e7e7;">Name*: </label><input type="text" name="studentName" id="studentName">
        <input type="submit" value="Delete student" style=" border-radius: 1px;
  background-color: #f4511e;
  box-shadow: 0 5px #999;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 12px;
  padding: 10px;
  width: 100px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;">
    </div>
</form>
</body>
</html>
