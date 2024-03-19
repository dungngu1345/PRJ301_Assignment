/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import entity.Grade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class GradeDBContext extends DBContext<Grade>{
    public ArrayList<Grade> getGradebyStudent(int studentId, int subjectId) {
        ArrayList<Grade> grades = new ArrayList<>();
        try {
            String sql = """
                         select g.[sid], g.score, a.wight, a.[name], s.suname from Grade g
                         join Exam e on e.eid = g.eid
                         join Assignment a on a.aid = e.aid
                         join [Subject] s on s.subid = a.subid
                         where g.[sid] = ? and s.subid = ?
                         """;
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, studentId);
            stm.setInt(2, subjectId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Grade s = new Grade();
                s.setScore(rs.getString("score"));
                s.setWeight(rs.getString("wight"));
                s.setName(rs.getString("name"));
                s.setSubjectName(rs.getString("suname"));
                grades.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return grades;
    }
    @Override
    public ArrayList<Grade> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Grade entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Grade entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Grade entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Grade get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        GradeDBContext gDB = new GradeDBContext();
        ArrayList<Grade> g = gDB.getGradebyStudent(1, 1);
        System.out.println(g.size());
    }
}
