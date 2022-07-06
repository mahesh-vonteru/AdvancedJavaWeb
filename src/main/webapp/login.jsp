<%--
  Created by IntelliJ IDEA.
  User: Mahesh
  Date: 7/5/2022
  Time: 11:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-image: url('./images/4893706.webp'); margin: 0; padding: 0; font-family:sans-serif;
       background-attachment: fixed; background-size: 100%;">
<form action="studentController" method="post"
      style="width: 700px; padding: 20px; position: absolute;
      border: 1px solid black;margin-left: 400px; top: 10%; background-image: url('./images/classroom.jpg');">
    Name :<input type="text" name="Studentname"
                 style="border-style: dotted; margin-bottom:10px;margin-left: 20px; width: 30%;color: white"/><br/><br/>
    Password:<input type="password" name="Password"
                    style="border-style: dotted;margin-bottom:10px; width: 30%"/><br/><br/>
    Marks :<input type="text" name="Studentmarks"
                  style="border-style: dotted;margin-bottom:10px;margin-left: 18px; width: 30%"/><br/><br/>
    College :<input type="text" name="Studentcollege"
                    style="border-style: dotted;margin-bottom:10px;margin-left: 10px; width: 30%"/><br/><br/>
    <input type="submit" value="Insert Student  Details" style="padding: 10px 20px;text-align: center;
           cursor: pointer;font-size: 15px;  margin: 5px 3px;display: inline-block; background-color: #4CAF50;border-radius: 12px;">
</form>
<form action="studentController" method="get" style="width: 800px; padding: 30px; position: absolute; top: 70%; left: 50%;transform: translate(-50%,-50%);
       border: 1px solid black; background-image: url('./images/color.jpg');background-size: 50%;">
    <input type="submit" value="Get Student Details" style="padding: 10px 20px;text-align: center;
           cursor: pointer;font-size: 15px;  margin: 5px 3px;display: inline-block; background-color:  #008CBA;border-radius: 12px;">
</form>
<form action="studentController" method="put" style="width: 500px; padding: 30px; position: absolute; top: 70%; left: 50%;
   transform: translate(-30%,-50%);
    border: 1px solid black; background-image: url('./images/color.jpg');background-size: 50%;">
    <input type="submit" value="Update Student  Details" style="padding: 10px 20px;text-align: center;
           cursor: pointer;font-size: 15px;  margin: 5px 3px;display: inline-block; background-color: #e7e7e7;border-radius: 12px;">
</form>
<form action="delete-user.jsp" style="width:300px; padding: 30px; position: absolute; top: 70%; left: 50%;
   transform: translate(25%,-50%);
    border: 1px solid black; background-image: url('./images/color.jpg');background-size: 50%;">
    <input type="submit" value="Delete Student Details" style="padding: 10px 20px;text-align: center;
           cursor: pointer;font-size: 15px;  margin: 5px 3px;display: inline-block; background-color: #f44336; border-radius: 12px;">
</form>

</body>
</html>
