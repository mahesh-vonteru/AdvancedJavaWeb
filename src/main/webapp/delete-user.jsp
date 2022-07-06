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
<body>
<div>
    <p>Please enter bellow details to delete a student.</p>
    <label>Name*: </label><input type="text" name="studentName" id="studentName" >
    <input type="button" onclick="deleteUser()" value="Delete student">
</div>
<script>
    function deleteUser(){
        let studentName = document.getElementById('studentName').value;
        //
    }
</script>
</body>
</html>
