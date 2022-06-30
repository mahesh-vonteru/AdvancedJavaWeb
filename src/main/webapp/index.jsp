<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "PRINT STUDENT DETAILS FROM DATA BASE " %>
</h1>
<h2>Welcome to java learning </h2>
<br/>

<form action="hello-servlet" method="post">
    Name    :<input type="text" name="Studentname"/><br/><br/>
    Password:<input type="password" name="Password"/><br/><br/>
    Marks   :<input type="text" name="Studentmarks"/><br/><br/>
    College :<input type="text" name="Studentcollege"/><br/><br/>
    <br/><br/>
    <input type="submit" value="SUBMIT DETAILS">
</form>
<form action="hello-servlet" method="get">
    <input type="submit" value="GET ALL DETAILS">
</form>
</body>
</html>