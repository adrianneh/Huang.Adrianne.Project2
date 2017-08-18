/**
 * File: processDatabase.java
 * Author: Adrianne Huang
 * Date: August 2017
 * Description: Processes requests to display information from the members table.
 */
package viewlayer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import transferobjects.Member;
import businesslayer.MemberBusinessLogic;
import java.util.logging.Level;
import java.util.logging.Logger;

public class processDatabase extends HttpServlet {

    /**
     * Processes request to display member list information in a HTML table.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");

        ArrayList<Member> listMembers = null;
        MemberBusinessLogic logic = new MemberBusinessLogic();

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Member List</title>");
            out.println("<h1>Member List</h1>");
            out.println("</head>");
            out.println("<body>");

            Class.forName("com.mysql.jdbc.Driver");
            listMembers = logic.getAllMembers();

            //for (int i = 1; i <= 9; i++){
            out.println("<table border=1>");
            out.println("<tr>" + "<th>MemberID</th>" + "<th>isAdmin</th>"
                    + "<th>Alias</th>" + "<th>First Name</th>"
                    + "<th>Last Name</th>" + "<th>Email</th>"
                    + "<th>Username</th>" + "<th>Password</th>"
                    + "<th>Salt</th>" + "</tr>");
            out.println();

            for (Member m : listMembers) {
                out.println("<tr><td>" + m.getMemberId() + "</td>");
                out.println("<td>" + m.isAdmin() + "</td>");
                out.println("<td>" + m.getAlias() + "</td>");
                out.println("<td>" + m.getFirstName() + "</td>");
                out.println("<td>" + m.getLastName() + "</td>");
                out.println("<td>" + m.getEmail() + "</td>");
                out.println("<td>" + m.getUserName() + "</td>");
                out.println("<td>" + m.getPassword() + "</td>");
                out.println("<td>" + m.getSalt() + "</td></tr>");
                out.println();
            }

            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(processDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(processDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
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
