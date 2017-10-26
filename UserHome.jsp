<%-- 
    Document   : UserHome
    Created on : 2 Jul, 2016, 5:41:13 PM
    Author     : Suyash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users Homepage</title>
         <style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
    box-shadow: 0px 2px 6px grey;
    
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
h3
{
    font-family:Lucida Handwriting;
    text-align: center;
    text-decoration: none;
    cursor: pointer;
        
}
h3:hover
{
    font-size: 24px;
    text-decoration:underline;
    transition-duration: .5s;
    transition-delay: .1s
}
</style>
    </head>
    <body>
        <div style="background-color: whitesmoke;height: 200px;">
            
        <ul>
            <li><a class="active" href="UserHome.jsp">Home</a></li>
            <li><a href="#contact">About</a></li>
             <li><a href="EnterRecord.jsp">Enter Records</a></li>
            <li><a href="ViewRecord.jsp">View Records</a></li>
            <li style="float:right"><a href="Login_page.jsp">Log Out</a></li>
        </ul>
             <h1  style="text-align: center;font-family: Lucida Handwriting;letter-spacing: 1.5px;text-decoration: underline;text-shadow: 10px 10px 3px grey;">Welcome
                 <%
                     Cookie[] c1=request.getCookies();
                     for(int i=0;i<c1.length;i++)
                     {
                         if(c1[i].getName().toString().equals("mycookie"))
                             out.println(c1[i].getValue().toString());
                     }
                  %>
             </h1>
         </div>
        <div style="background-color: lightblue;height: 300px;padding-top: 70px;padding-bottom: 30px;">
            
            <h3><a href="EnterRecord.jsp">Enter Records in Jaiswal Plastics</a></h3>
            <h3><a href="ViewRecord.jsp">View Records of Jaiswal Plastics</a></h3>
            
            
            
        </div>
    </body>
</html>
