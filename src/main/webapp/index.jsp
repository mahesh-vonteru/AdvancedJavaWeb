<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World! " %>
</h1>
<h2>Welcome to java learning </h2>
<br/>
<form action="hello-servlet" method="get">
    <input type="submit" value="get">
</form>
<form action="hello-servlet" method="post">
    <input type="submit" value="post">
</form>
</body>
</html>