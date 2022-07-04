<%--
  Created by IntelliJ IDEA.
  User: Mahesh
  Date: 7/1/2022
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <c:forEach items="${student}" var="s">
    ${s}<br>
   </c:forEach>
</body>
</html>
