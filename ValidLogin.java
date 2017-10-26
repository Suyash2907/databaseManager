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
@WebServlet(urlPatterns = {"/ValidLogin"})
public class ValidLogin extends HttpServlet {

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
            
                String LogId=request.getParameter("id");
                String pass=request.getParameter("pass");
                String d=request.getParameter("d");
                try
                {
                    
                    
                    if(LogId.equals("Admin123"))
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                    
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JSDB","root","root");
                    
                    Statement smt=con.createStatement();
                       ResultSet rs=smt.executeQuery("select *from StaffInfo where UserName='"+LogId+"' and Password='"+pass+"'");
                       boolean b;
                       b=rs.next();
                       String u=rs.getString(2);
                       Cookie c=new Cookie("mycookie",u);
                       response.addCookie(c);
                       
                       if(b==true)
                           response.sendRedirect("AdminHome.jsp");
                       else
                           response.sendRedirect("Login_page.jsp");
                       
                    }
                    else
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                    
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JSDB","root","root");
                    
                    Statement smt=con.createStatement();
                        ResultSet rt=smt.executeQuery("select *from StaffInfo where UserName='"+LogId+"'and Password='"+pass+"'");
                        boolean b=rt.next();
                        String u=rt.getString(2);
                       Cookie c=new Cookie("mycookie",u);
                       response.addCookie(c);
                        if(b==true)
                            response.sendRedirect("UserHome.jsp");
                        else
                            response.sendRedirect("Login_page.jsp");
                       
                    }
                    
                    
                }
                catch(ClassNotFoundException | SQLException ee)
                {
                    response.sendRedirect("Login_page.jsp");
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
