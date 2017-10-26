/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
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
@WebServlet(urlPatterns = {"/entry"})
public class entry extends HttpServlet {
    private String user;

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
            
            
                String tin=request.getParameter("tin");
                String wef=request.getParameter("wef");
                long phone=Long.parseLong(request.getParameter("phone"));
                long bno=Long.parseLong(request.getParameter("bno"));
                long mnum=Long.parseLong(request.getParameter("mnum"));
                long sno=Long.parseLong(request.getParameter("sno"));
                
                String name=request.getParameter("name");
                String doi=request.getParameter("doi");
                
                double toi=Double.parseDouble(request.getParameter("toi"));
                
                String inW=request.getParameter("inW");
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JSDB","root","root");
                    
                    Statement smt=con.createStatement();
                    long time = System.currentTimeMillis();
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(time);
                    Cookie[] c1=request.getCookies();
                    String x="";
                     for(int i=0;i<c1.length;i++)
                     {
                         if(c1[i].getName().toString().equals("mycookie"))
                            x= c1[i].getValue().toString();
                     }
                    
                    smt.executeUpdate("insert into Jrecord1 values('"+timestamp+"','"+x+"','"+tin+"','"+wef+"','"+phone+"','"+bno+"','"+mnum+"','"+sno+"','"+name+"','"+doi+"','"+toi+"','"+inW+"')");
                    /*RequestDispatcher rd;
                    rd = request.getRequestDispathcher("EnterRecord.jsp");
                    rd.include(request,response);*/
                    response.sendRedirect("EnterRecord.jsp");
                    out.println("Record Entry Successful.");
                
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
