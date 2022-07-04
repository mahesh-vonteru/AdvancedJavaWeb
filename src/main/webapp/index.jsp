<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
<style>
    input[type=submit]
    {
        background-color: green;
        color: white;
        padding: 10px 15px;
        margin: 4px 4px 4px 4px;
        cursor: pointer;
        margin-bottom: 20px;
    }
    form
    {
        width: 50em;
        max-width: 100%;
        margin:auto;
    }
    button:hover
    {
        background-color: #4CAF50;
        color: white;
    }

</style>
</head>
<body style="background-color: silver">
<h2 style="border:orange;border-width:5px;border-style:solid;border-radius: 50px;text-align: center; background-color: teal;color: white ">
    <%= "Enter Student Details and Get Student Details " %></h2>
<br/>
<marquee style="color: whitesmoke" > MSR Degree college Student Details</marquee>
<form action="hello-servlet" method="post"
      style="border: red; border-style: outset; border-width: 5px;
      background-color: aqua; border-radius: 40px 40px 40px 40px " >
    <br/>
    Name    :<input type="text" name="Studentname"
                    style ="border-style: dotted; margin-bottom:10px;margin-left: 20px; width: 30%"   /><br/><br/>
    Password:<input type="password" name="Password"
                    style ="border-style: dotted;margin-bottom:10px; width: 30%"/><br/><br/>
    Marks   :<input type="text" name="Studentmarks"
                    style ="border-style: dotted;margin-bottom:10px;margin-left: 18px; width: 30%"/><br/><br/>
    College :<input type="text" name="Studentcollege"
                    style ="border-style: dotted;margin-bottom:10px;margin-left: 10px; width: 30%"/><br/><br/>

   <input type="button" value="SUBMIT DETAILS"
          style="margin-left: 100px;
          border-color: #4CAF50;
          color: red; padding: 16px 32px; text-align: center; transition-duration: 0.4s;" >
                                                                                                                                                                                                                                                                                                                    </form>
<br/><br/>
<form action="hello-servlet" method="get"
      style="border: red; border-style: outset; border-width: 5px; background-color: coral ">
    <input type="submit" value="GET ALL DETAILS" style="margin-left: 100px;margin-top: 20px;">
</form>
</body>
</html>