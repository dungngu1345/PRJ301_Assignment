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
import entity.Subject;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.jsp.PageContext;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ScoreController extends BaseRequiredAuthenticationController {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException {
        StudentDBContext stuDB = new StudentDBContext();
        GradeDBContext gDB = new GradeDBContext();
        
        String studentId = req.getParameter("studentId");
        String subjectId = req.getParameter("subjectId");
        
        ArrayList<Student> students = stuDB.list();
        ArrayList<Subject> subjects = stuDB.getListSubject();
        ArrayList<Grade> grades = gDB.getGradebyStudent(Integer.parseInt(studentId), Integer.parseInt(subjectId));

        try{
            int total = Integer.parseInt(grades.get(0).getScore());
            if(total > 5){
                req.setAttribute("average", "PASS");
            }else{
                req.setAttribute("average", "NOT PASS");
            }
        }catch(Exception e){
            req.setAttribute("average", "STUDING");
        }
        
        req.setAttribute("grades", grades);
        req.setAttribute("subjects", subjects);
        req.setAttribute("students", students);
        req.setAttribute("studentId", studentId);
        req.setAttribute("subjectId", subjectId);
        req.getRequestDispatcher("View/Score/ViewScoreStudent.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException {
        StudentDBContext stuDB = new StudentDBContext();
        ArrayList<Student> students = stuDB.list();
        ArrayList<Subject> subjects = stuDB.getListSubject();

        req.setAttribute("subjects", subjects);
        req.setAttribute("students", students);
        req.getRequestDispatcher("View/Score/ViewScoreStudent.jsp").forward(req, resp);
    }
}
