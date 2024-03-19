/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.lecturer;

import controller.authentication.BaseRequiredAuthenticationController;
import dal.LessionDBContext;
import entity.Account;
import entity.Attendence;
import entity.Lession;
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
public class AttendanceTaking extends BaseRequiredAuthenticationController {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException {
        int leid = Integer.parseInt(req.getParameter("lessionId"));
        LessionDBContext db = new LessionDBContext();
        ArrayList<Student> students = db.getStudentsByLession(leid);
        ArrayList<Attendence> atts = new ArrayList<>();
        Lession lession = new Lession();
        lession.setId(leid);
        for (Student student : students) {
            Attendence a = new Attendence();
            a.setLession(lession);
            a.setStudent(student);
            a.setDescription(req.getParameter("description" + student.getId()));
            a.setPresent(req.getParameter("present" + student.getId()).equals("yes"));
            atts.add(a);
        }
        db.getAttendenceby(leid, atts);
        resp.sendRedirect("att?lessionId=" + leid);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException {
        int lessionId = Integer.parseInt(req.getParameter("lessionId"));
        LessionDBContext db = new LessionDBContext();
        ArrayList<Attendence> atts = db.getAttendencesByLession(lessionId);
        
        req.setAttribute("lessionId", lessionId);
        req.setAttribute("atts", atts);
        req.getRequestDispatcher("View/Attendence/Attendence.jsp").forward(req, resp);
    }
}
