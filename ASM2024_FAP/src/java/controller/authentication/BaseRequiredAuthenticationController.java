/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller.authentication;

import entity.Account;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name="BaseRequiredAuthenticationController", urlPatterns={"/baserequiredauthenticationcontroller"})
public abstract class BaseRequiredAuthenticationController extends HttpServlet {
    
    private Account getAuthenticatedAccount(HttpServletRequest req)
    {
      Account account = (Account) req.getSession().getAttribute("account");
      return account;
    }
    
    protected abstract void doPost(HttpServletRequest req, HttpServletResponse resp, Account account)
            throws ServletException, IOException; 
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Account account = getAuthenticatedAccount(req);
        if(account!=null)
        {
            doPost(req, resp, account);
        }
        else
        {
            resp.getWriter().println("access denied!");
        }
    
    }

    protected abstract void doGet(HttpServletRequest req, HttpServletResponse resp, Account account)
            throws ServletException, IOException; 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Account account = getAuthenticatedAccount(req);
        if(account!=null)
        {
            doGet(req, resp, account);
        }
        else
        {
            resp.getWriter().println("access denied!");
        }
    }
}
