<%-- 
    Document   : ViewRecord
    Created on : 2 Jul, 2016, 10:37:14 PM
    Author     : Suyash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Record Page</title>
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


                        </style>
                        <script>
                           /* function validInput()
                            {
                                 var x = document.forms["Form1"]["pending"].value;
                                 var y = document.forms["Form1"]["date"].value;
                                 if((x==null||x=="")&&(y==null||y==""))
                                     alert("Fill any one of them");
                                 return false;
                            }*/
                            </script>
    </head>
    <body>
        <div style="background-color: whitesmoke;height: 200px;">
            
        <ul>
            <li><a href="UserHome.jsp">Home</a></li>
            <li><a href="#contact">About</a></li>
            <li><a href="EnterRecord.jsp">Enter Records</a></li>
            <li><a class="active" href="ViewRecord.jsp">View Records</a></li>
            <li style="float:right"><a href="Login_page.jsp">Log Out</a></li>
        </ul>
             <h1 style="text-align: center;font-family: Lucida Handwriting;letter-spacing: 1.5px;text-decoration: underline;text-shadow: 10px 10px 3px grey;">Jaiswal Plastics</h1>
             
         </div>
        <div style="background-color: lightblue;height: 400px;padding-top: 20px;padding-bottom: 30px;">
            <center>
                <h3 style="font-family: Lucida Handwriting;font-style: oblique;text-decoration:underline;text-shadow: 10px 10px 3px grey;">Search Records</h3>
         <fieldset style="border: 2px solid black; width: 500px;height: 250px;border-radius: 5px;padding:25px;box-shadow: 5px 5px 4px grey;">   
             <form action="view" >
            View Record by Pending :<input type="text" name="pending" value="" /><br>
               
            <br>
                                    OR
                                    <br>
                                    <br>
                                    View by Date    :<input type="text" name="date" value="" /><br>
                                    <br>                  
                                    <br>
                                    <input type="submit" value="Search" />
        </form>
         </fieldset>
            </center>
        </div>
        <div style="background-color:white;padding-top: 30px;">
            <footer style="font-family: Lucida Handwriting;"><marquee behaviour="alternate" style="background-color: #333;color: white;">@JSPlastics.com</marquee></footer>
        </div>
        
    </body>
</html>
