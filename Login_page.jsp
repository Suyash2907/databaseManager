<%-- 
    Document   : Login_page
    Created on : 1 Jul, 2016, 9:15:33 PM
    Author     : Suyash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
      <style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
    box-shadow: 0px 2px 8px black;
    
    width: 100%;
    top: 0px;
    
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #111;
}

.active {
    background-color: lightblue;
}
input[type=text]
{
    border:2px solid black;
    border-radius: 3px;
}
input[type=text]:focus
{
    border:3px solid #333;
    padding: 5px;
     transition-duration: .4s;
    box-shadow: 8px 10px 2px grey;
}
input[type=text]:hover
{
    border:3px solid #333;
    padding: 5px;
     transition-duration: .4s;
    box-shadow: 8px 10px 2px grey;
}
input[type=password]
{
     border:2px solid black;
    border-radius: 3px;
}
input[type=password]:focus
{
    border:3px solid #333;
    padding: 5px;
     transition-duration: .4s;
    box-shadow: 8px 10px 2px grey;
}
input[type=password]:hover
{
    border:3px solid #333;
    padding: 5px;
    transition-duration: .4s;
    box-shadow: 8px 10px 2px grey;
}
input[type=submit]
{
     border:3px solid black;
     text-decoration:none;
     cursor: pointer;
     padding:4px;
}
input[type=submit]:focus
{
    border:3px solid #333;
    padding: 6px;
    text-decoration: underline;
     box-shadow: 8px 10px 2px grey;
    border-radius: 5px;
    transition-duration: .4s;
}
input[type=submit]:hover
{
    border:3px solid #333;
    padding: 6px;
    text-decoration: underline;
     box-shadow: 8px 10px 2px grey;
    border-radius: 5px;
    transition-duration: .4s;
}
select
{
    border:2px solid black;border-radius: 5px;padding: 8px 10px;
}
select:focus
{
    transition-duration: .4s;
    padding:10px 12px;
    border:3px solid #333;
    box-shadow: 8px 10px 2px grey;
    z-index: 1;
}
select:hover
{
    transition-duration: .4s;
    padding:10px 12px;
    border:3px solid #333;
    box-shadow: 8px 10px 2px grey;
    z-index: 1;
}

#div1
{
    border:3px solid black;border-radius: 5px;box-shadow: 10px 10px 3px grey;width: 500px;padding: 25px;margin-top: 10px;margin-bottom: 20px;
}
#div1:focus
{
    border:5px solid #333;border-radius: 7px;box-shadow: 12px 12px 5px grey;padding: 30px;transition-timing-function: ease-in-out;
   
}
#div1:hover
{
    border:5px solid #333;border-radius: 7px;box-shadow: 12px 12px 5px grey;padding: 30px;
}
</style>
<script>
    function validForm()
    {
        var x = document.forms["LoginForm"]["id"].value;
        var y = document.forms["LoginForm"]["pass"].value;
        var z = document.forms["LoginForm"]["d"].value;
    if (x == null || x == "" || y == null || y == "" || z == null || z == "") {
        alert("All fields must be filled out");
        return false;
    }
    }
</script> 

    </head>
    <body>
        
            <div>            
<ul>
  <li><a href="#home">Home</a></li>
  <li><a href="#contact">About</a></li>
  <li style="float:right"><a class="active" href="Login_page.jsp">Log In</a></li>
</ul>
            </div>
<div style="background-color: whitesmoke;height: 200px;">
    <br><br><br>
            <h1 style="text-align: center;font-family: Lucida Handwriting;letter-spacing: 1.5px;text-decoration: underline;text-shadow: 10px 10px 3px grey;">Jaiswal Plastics</h1>
            
            <h4 style="text-align:center;font-family: Lucida Handwriting;font-style: oblique;text-decoration: underline;">"The best YOU get"</h4>
        </div>
        <div style="background-color: lightblue; height: 300px;padding-top: 70px;padding-bottom: 30px;">
    <center>     
        <h2 style="font-family: Lucida Handwriting;text-shadow: 5px 5px 2px grey;">Sign In</h2>
        <div id="div1">
            <form action="ValidLogin" method="post" name="LoginForm" onsubmit="return validForm()" method="post">
                Login Id    :   <input type="text" name="id" value="" /><br>
                <br> Password   :   <input type="password" name="pass" value="" /><br>
                <br> Select user    :   
                    <select name="d" >
                        <option value="null">--select--</option>
                        <option value="1">Admin</option>
                        <option value="2">User 1</option>
                        <option value="3">User 2</option>
                    </select>
                <br><br><input type="submit" value="LoginIn"/>
            </form>
        </div>
    </center>
        </div>
        <div style="background-color:white;padding-top: 30px;">
            <footer style="font-family: Lucida Handwriting;"><marquee behaviour="alternate" style="background-color: #333;color: white;">@JSPlastics.com</marquee></footer>
        </div>
    </body>
</html>
