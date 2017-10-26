<%-- 
    Document   : EnterRecord
    Created on : 2 Jul, 2016, 6:06:43 PM
    Author     : Suyash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entry Page</title>
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
table{
    border: 2px double black;
    width: 20px;
}
th,td
{
    border: 2px double black;
}

#div1
{
    border:3px solid black;border-radius: 5px;box-shadow: 10px 10px 3px grey;width: 600px;padding: 25px;margin-top: 10px;margin-bottom: 20px;
}
#div1:focus
{
    border:5px solid #333;border-radius: 7px;box-shadow: 12px 12px 5px grey;padding: 30px;
}
#div1:hover
{
    border:5px solid #333;border-radius: 7px;box-shadow: 12px 12px 5px grey;padding: 30px;
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
                  

    </head>
    <body>
         <div style="background-color: whitesmoke;height: 200px;">
            
        <ul>
            <li><a href="UserHome.jsp">Home</a></li>
            <li><a href="#contact">About</a></li>
            <li><a class="active" href="EnterRecord.jsp">Enter Records</a></li>
            <li><a href="ViewRecord.jsp">View Records</a></li>
            <li style="float:right"><a href="Login_page.jsp">Log Out</a></li>
        </ul>       
             
             <h1 style="text-align: center;font-family: Lucida Handwriting;letter-spacing: 1.5px;text-decoration: underline;text-shadow: 10px 10px 3px grey;">Jaiswal Plastics</h1>
             
         </div>
        <div style="background-color: lightblue; height: 300px;padding-top:10px;padding-bottom: 30px;height: 100%;">
            <h3 style="background-color: lightblue; height: 300px;padding-top:10px;padding-bottom: 30px;height: 100%;border: 2px solid #111;box-shadow: 0px 2px 6px grey;">
               <form action="entry" name="F1">
                <center>
                <div id="div1">
                TIN No. :   <input type="text" name="tin" value="" required/>
                W.E.F   :   <input type="text" name="wef" value="" required /><br>
                <br>Phone   :   <input type="text" name="phone" value="" required/>
                    Booking No. :   <input type="text" name="bno" value="" required /><br>
                
                <br>Mobile  :   <input type="text" name="mnum" value="" required />
                    Serial No   :   <input type="text" name="sno" value="" required/><br>
                </div>
                    
                
                    <div id="div1">
                To, M/S <input type="text" name="name" value="" required/>
                Date of Issue   :   <input type="text" name="doi" value="" required/>
                    </div>
                    <fieldset id="div1"> 
                        
                        <form action="read">
                            <table>
                               <tr>
                        
                        <th>Description of Goods</th>
                        <th>Bags</th>
                        <th>Quantity(/kg)</th>
                        <th>Rates(/kg)</th>
                        <th>Amount</th>
                    </tr> 
                    <tr>
                        <td><input type="text" name="A" value="" /></td>
                        <td><input type="number" name="B" value="" /></td>
                        <td><input type="number" name="C" value="" /></td>
                        <td><input type="number" name="D" value="" /></td>
                        <td><input type="number" name="E" value="" /></td>
                    </tr>
                    <br><br>
                    First Entry<input type="radio" name="J" value="0" />
                    Following Entry<input type="radio" name="J" value="<%  myFunction(); %>" /><br><br>
                    <%!  int myFunction(){
                        int i=0;
                        return i++;
                    } %>
                    
                            </table>
                            <input type="submit" value="ENTER" />
                            
                            
                        </form>
                        <br><br>
                       
                        <%@include file="read" %>
                    
                    </fieldset>
                    
                    
                </center>
                <h5 style="text-align: right;">Amount of tax charged @ 4% vat and 11% Service tax.</h5>
                <h5 style="text-align: right;">Total Amount of Invoice  :   <input type="text" name="toi" value=""/></h56>
                      
                
                <h5>In words    :   <input type="text" name="inW" value="" /></h5>
                
                <center><input type="submit" value="Save Record" />
                    <input type="submit" value="Back" /></center>
            </form>
           </fieldset>
            
        </div>
        <div style="background-color:white;padding-top: 30px;">
            <footer style="font-family: Lucida Handwriting;"><marquee behaviour="alternate" style="background-color: #333;color: white;">@JSPlastics.com</marquee></footer>
        </div>
    </body>
</html>
