/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Suyash
 */
@WebServlet(urlPatterns = {"/Date"})
public class Date extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            String x="";
        
          Cookie[] c1=request.getCookies();
                     for(int i=0;i<c1.length;i++)
                     {
                         if(c1[i].getName().toString().equals("myvalue"))
                             x=c1[i].getValue().toString();   
                       }
                     try
                     {
                         Class.forName("com.mysql.jdbc.Driver");
                    
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JSDB","root","root");
                    
                    Statement smt=con.createStatement();
                    ResultSet rs=smt.executeQuery("select *from JRecord1 where Date_Of_Invoice='"+x+"'");
                    boolean b=rs.next();
                    out.println("<style>\n" +
"ul {\n" +
"    list-style-type: none;\n" +
"    margin: 0;\n" +
"    padding: 0;\n" +
"    overflow: hidden;\n" +
"    background-color: #333;\n" +
"    box-shadow: 0px 2px 6px grey;\n"+
"    \n" +
"}\n" +
"\n" +
"li {\n" +
"    float: left;\n" +
"}\n" +
"\n" +
"li a {\n" +
"    display: block;\n" +
"    color: white;\n" +
"    text-align: center;\n" +
"    padding: 14px 16px;\n" +
"    text-decoration: none;\n" +
"}\n" +
"\n" +
"li a:hover:not(.active) {\n" +
"    background-color: #111;\n" +
"}\n" +
"\n" +
".active {\n" +
"    background-color: lightblue;\n" +
"}\n" +
"table,th,td\n" +
"{\n" +
"    border: 2px double black;\n" +
"}\n" +
"th\n" +
"{\n" +
"    padding: 10px;\n" +
"}\n" +
"#div1\n" +
"{\n" +
"    border:3px solid black;border-radius: 5px;box-shadow: 10px 10px 3px grey;width: 600px;padding: 25px;margin-top: 10px;margin-bottom: 20px;\n" +
"}\n" +
"#div1:focus\n" +
"{\n" +
"    border:5px solid #333;border-radius: 7px;box-shadow: 12px 12px 5px grey;padding: 30px;\n" +
"}\n" +
"#div1:hover\n" +
"{\n" +
"    border:5px solid #333;border-radius: 7px;box-shadow: 12px 12px 5px grey;padding: 30px;cursor: pointer;\n" +
"}\n" +
"input[type=text]\n" +
"{\n" +
"    border:2px solid black;\n" +
"    border-radius: 3px;\n" +
"}\n" +
"input[type=text]:focus\n" +
"{\n" +
"    border:3px solid #333;\n" +
"    padding: 5px;\n" +
"     transition-duration: .4s;\n" +
"    box-shadow: 8px 10px 2px grey;\n" +
"}\n" +
"input[type=text]:hover\n" +
"{\n" +
"    border:3px solid #333;\n" +
"    padding: 5px;\n" +
"     transition-duration: .4s;\n" +
"    box-shadow: 8px 10px 2px grey;\n" +
"}\n" +
"input[type=submit]\n" +
"{\n" +
"     border:3px solid black;\n" +
"     text-decoration:none;\n" +
"     cursor: pointer;\n" +
"     padding:4px;\n" +
"}\n" +
"input[type=submit]:focus\n" +
"{\n" +
"    border:3px solid #333;\n" +
"    padding: 6px;\n" +
"    text-decoration: underline;\n" +
"     box-shadow: 8px 10px 2px grey;\n" +
"    border-radius: 5px;\n" +
"    transition-duration: .4s;\n" +
"}\n" +
"input[type=submit]:hover\n" +
"{\n" +
"    border:3px solid #333;\n" +
"    padding: 6px;\n" +
"    text-decoration: underline;\n" +
"     box-shadow: 8px 10px 2px grey;\n" +
"    border-radius: 5px;\n" +
"    transition-duration: .4s;\n" +
"}\n" +
"                  \n" +
"                  </style>");
                    out.println(" <div style=\"background-color: whitesmoke;height: 200px;\">\n" +
"            \n" +
"        <ul>\n" +
"            <li><a href=\"UserHome.jsp\">Home</a></li>\n" +
"            <li><a href=\"#contact\">About</a></li>\n" +
"            <li><a href=\"EnterRecord.jsp\">Enter Records</a></li>\n" +
"            <li><a class=\"active\"href=\"ViewRecord.jsp\">View Records</a></li>\n" +
"            <li style=\"float:right\"><a href=\"EditRecord.jsp\">Edit Records</a></li>\n" +
"            <li style=\"float:right\"><a href=\"Login_page.jsp\">Log Out</a></li>\n" +
"        </ul>\n" +
"             <h1 style=\"text-align: center;font-family: Lucida Handwriting;letter-spacing: 1.5px;text-decoration: underline;text-shadow: 10px 10px 3px grey;\">Jaiswal Plastics</h1>\n" +
"             \n" +
"         </div>");
                    if(b==true){
                        out.println("<div style=\"background-color: lightblue;padding-top:10px;padding-bottom: 30px;height: 1000px;\">\n" +
"            <h3 style=\"text-align:center;font-family: Lucida Handwriting;font-style: oblique;text-decoration: underline;text-shadow: 10px 10px 10px grey;\">Record View</h3>\n" +
"           <fieldset style=\"background-color: lightblue;padding-top:10px;padding-bottom: 30px;height: 800px;border: 2px solid #111;\">\n" +
"            <form action=\"ViewRecord.jsp\">\n" +
"                <center>\n" +
"                <div id=\"div1\">\n" +
"                TIN No. :   <input type=\"text\" name=\"tin\" value=\""+rs.getString(3)+"\" readonly/>\n" +
"                    W.E.F   :   <input type=\"text\" name=\"wef\" value=\""+rs.getString(4)+"\" readonly/><br>\n" +
"                <br>Phone   :   <input type=\"text\" name=\"phone\" value=\""+rs.getLong(5)+"\" readonly/>\n" +
"                    Booking No. :   <input type=\"text\" name=\"bno\" value=\""+rs.getLong(6)+"\" readonly /><br>\n" +
"                \n" +
"                <br>Mobile  :   <input type=\"text\" name=\"mnum\" value=\""+rs.getLong(7)+"\" readonly />\n" +
"                    Serial No   :   <input type=\"text\" name=\"sno\" value=\""+rs.getLong(8)+"\" readonly /><br>\n" +
"                </div>\n" +
"                    \n" +
"                \n" +
"                    <div id=\"div1\">\n" +
"                To, M/S <input type=\"text\" name=\"name\" value=\""+rs.getString(9)+"\" readonly />\n" +
"                Date of Invoice    :   <input type=\"text\" name=\"doi\" value=\""+rs.getString(10)+"\" readonly />\n" +
"                    </div>\n" +
"                \n" +
"                <table>\n" +
"                    <tr>\n" +
"                        <th>S.No</th>\n" +
"                        <th>Description of Goods</th>\n" +
"                        <th>Bags</th>\n" +
"                        <th>Quantity(/kg)</th>\n" +
"                        <th>Rates(/kg)</th>\n" +
"                        <th>Amount</th>\n" +
"                    </tr>\n" +
"                    <tr></tr>\n" +
"                    <tr>\n" +
"                        <th>Loads :</th>\n" +
"                        <th>Total :</th>\n" +
"                        <th>Bags :</th>\n" +
"                        <th>Quantity(/kg) :</th>\n" +
"                        <th>Rates(/kg) :</th>\n" +
"                        <th>Amount  :</th>\n" +
"                    </tr>\n" +
"                    </tr>\n" +
"                </table>\n" +
"                </center>\n" +
"                <h5 style=\"text-align: right;\">Amount of tax charged @ 4% vat and 11% Service tax.</h5>\n" +
"                <h5 style=\"text-align: right;\">Total Amount of Invoice  :   <input type=\"text\" name=\"toi\" value=\""+rs.getDouble(11)+"\" readonly /></h56>\n" +
"                \n" +
"                \n" +
"                \n" +
"                <h5>In words    :   <input type=\"text\" name=\"inW\" value=\""+rs.getString(12)+"\" readonly /></h5>\n" +
"                \n" +
"                <center><input type=\"submit\" value=\"Back\" /></center>\n" +
"            </form>\n" +
"           </fieldset>\n" +
"            \n" +
"        </div");
                    
                    }
                    else
                        response.sendRedirect("ViewRecord.jsp");
                    
                    
                     }
                     catch(ClassNotFoundException | SQLException ee)
                     {
                         out.println(ee);
                     }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
