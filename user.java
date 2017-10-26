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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Suyash
 */
@WebServlet(urlPatterns = {"/user"})
public class user extends HttpServlet {

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
            try
            {
                 Class.forName("com.mysql.jdbc.Driver");
                    
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JSDB","root","root");
                    
                    Statement smt=con.createStatement();
                    ResultSet rs=smt.executeQuery("select *from JRecord1");
                    out.println("        <style>\n" +
"ul {\n" +
"    list-style-type: none;\n" +
"    margin: 0;\n" +
"    padding: 0;\n" +
"    overflow: hidden;\n" +
"    background-color: #333;\n" +
"    box-shadow: 0px 2px 6px grey;\n" +
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
                            "</style>\n"+
"}");
                    out.println(" <div style=\"background-color: whitesmoke;height: 200px;\">\n" +
"            \n" +
"<ul>\n" +
"  <li><a href=\"#home\">Home</a></li>\n" +
"  <li><a href=\"#contact\">About</a></li>\n" +
"  <li style=\"float:right\"><a class=\"active\" href=\"Login_page.jsp\">Log In</a></li>\n" +
"</ul>\n" +
"\n" +
"            \n" +
"            <h1 style=\"text-align: center;font-family: Lucida Handwriting;letter-spacing: 1.5px;text-decoration: underline;text-shadow: 10px 10px 3px grey;\">Jaiswal Plastics</h1>\n" +
"            \n" +
"            <h4 style=\"text-align:center;font-family: Lucida Handwriting;font-style: oblique;text-decoration: underline;\">\"The best YOU get\"</h4>\n" +
"        </div>");
                    while(rs.next())
                    {
                        
                        out.println("TimeStamp  :   "+rs.getTimestamp(1)+"<br>");
                        out.println("User    :   "+rs.getString(2)+"<br>");
                        out.println("TIN No  :   "+rs.getString(3)+"<br>");
                        out.println("W.E.F.  :   "+rs.getString(4)+"<br>");
                        out.println("Phone No.  :   "+rs.getLong(5)+"<br>");
                        out.println("Booking No.   :   "+rs.getLong(6)+"<br>");
                        out.println("Mobile No.   :   "+rs.getLong(7)+"<br>");
                        out.println("Serial No.   :   "+rs.getLong(8)+"<br>");
                        out.println("To M/S   :   "+rs.getString(9)+"<br>");
                        out.println("Date of Invoice  :   "+rs.getString(10)+"<br>");
                        out.println("Total Amount  :   "+rs.getDouble(11)+"<br>");
                        out.println("In words  :   "+rs.getString(12)+"<br>");
                        
                    }
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
