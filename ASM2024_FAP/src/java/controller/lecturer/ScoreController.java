/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller.lecturer;

import controller.authentication.BaseRequiredAuthenticationController;
import dal.GradeDBContext;
import dal.StudentDBContext;
import entity.Account;
import entity.Grade;
import entity.Student;
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
        // Lấy sid từ request
        String studentidString = req.getParameter("sid");
        int studentid = Integer.parseInt(studentidString);
        GradeDBContext db = new GradeDBContext();
        ArrayList<Grade> grades = db.getGradebyStudent(studentid);
        req.setAttribute("grades", grades);
        req.getRequestDispatcher("View/Score/ViewScoreStudent.jsp").forward(req, resp);
    }
}
   
