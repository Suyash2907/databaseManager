/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Suyash
 */
@WebServlet(urlPatterns = {"/read"})
public class read extends HttpServlet {

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
            String a=request.getParameter("A");
            long b=Long.parseLong(request.getParameter("B"));
            long c=Long.parseLong(request.getParameter("C"));
            long d=Long.parseLong(request.getParameter("D"));
            double e=Double.parseDouble(request.getParameter("E"));
            //int j=Integer.parseInt(request.getParameter("J"));
            
            out.println("<table>"
                    + "<tr>"+
                    "<th>S.No</th>"+
                    "<th>Description of Goods</th>"+
                    "<th>Bags</th>"+
                    "<th>Quantity</th>"+
                    "<th>Rates</th>"+
                    "<th>Amount</th>"+
                    "</tr>"+
            
            
             
                "<tr>"+
                         "<td>1</td>"+
                        "<td>"+a+"</td>"+
                        "<td>"+b+"</td>"+
                        "<td>"+c+"</td>"+
                        "<td>"+d+"</td>"+
                        "<td>"+e+"</td>"+
                        "</tr>"+
                
          
            "</table>");
                
                
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