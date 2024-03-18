/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller.lecturer;

import controller.authentication.BaseRequiredAuthenticationController;
import dal.GradeDBContext;
import dal.LessionDBContext;
import entity.Account;
import entity.Grade;
import entity.Lession;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ScoreController extends BaseRequiredAuthenticationController {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException {
        String studentidString = req.getParameter("sid");
        int studentid = Integer.parseInt(studentidString);
        int subjectid = 0;
        if (req.getParameter("subid") != null) {
            subjectid = Integer.parseInt(req.getParameter("subid"));
        }
        GradeDBContext gra = new GradeDBContext();
        ArrayList<Grade> gras = gra.getGradebyStudent(studentid);
        req.setAttribute("score", gras);
        req.getRequestDispatcher("View/Score/ViewScoreStudent.jsp").forward(req, resp);
    }

}   
