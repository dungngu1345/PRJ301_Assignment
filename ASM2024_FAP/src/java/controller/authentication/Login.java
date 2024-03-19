/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller.authentication;

import dal.AccountDBContext;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class Login extends HttpServlet {
   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("View/Authentication/Login.jsp").forward(request, response);
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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        AccountDBContext db = new AccountDBContext();
        Account account = db.getByUsernamePassword(username, password);

        if (account != null) {
            if (account.getLid() == null) {
                String stu = account.getSid();
                request.setAttribute("stu", stu);
            }
            if (account.getSid()== null) {
                String lec = account.getSid();
                request.setAttribute("lec", lec);
            }
            HttpSession session = request.getSession();
            session.setAttribute("account", account);
            
            Cookie c_user = new Cookie("username", username);
            Cookie c_pass = new Cookie("password", password);
            c_user.setMaxAge(3600*2);
            c_pass.setMaxAge(3600*2);
            response.addCookie(c_pass);
            response.addCookie(c_user);
            
            response.sendRedirect("View/Menu.jsp");

        } else {
            request.setAttribute("error", "You input incorrect usermane or password");
            request.getRequestDispatcher("View/Authentication/Login.jsp").forward(request, response);
        }

    }
    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
