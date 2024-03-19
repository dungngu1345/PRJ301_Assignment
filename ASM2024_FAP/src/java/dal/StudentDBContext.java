/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import entity.Student;
import entity.Subject;
import jakarta.servlet.jsp.jstl.sql.Result;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tomcat.dbcp.dbcp2.PoolingConnection;

/**
 *
 * @author sonnt
 */
public class StudentDBContext extends DBContext<Student> {
    
    public ArrayList<Subject> getListSubject(){
        ArrayList<Subject> subjects = new ArrayList<>();
        String sql = """
                     select subid, suname from [Subject]
                     """;
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Subject s = new Subject();
                s.setId(rs.getString("subid"));
                s.setName(rs.getString("suname"));
                subjects.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return subjects;
    }
    
    public ArrayList<Student> getByLession(int lid) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            String sql = "SELECT s.sid FROM Student s INNER JOIN Enrollment e ON s.[sid] = e.[sid]\n"
                    + "	INNER JOIN StudentGroup g ON g.gid = e.gid\n"
                    + "	INNER JOIN Lession les ON les.gid = g.gid\n"
                    + "WHERE les.leid = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, lid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("sid"));
                students.add(s);
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    @Override
    public ArrayList<Student> list() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            String sql = """
                                 select s.[sid], s.sname from Student s
                                 """;
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("sid"));
                s.setName(rs.getString("sname"));
                students.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    @Override
    public void insert(Student entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Student entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Student entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        StudentDBContext sDB = new StudentDBContext();
        ArrayList<Student> s = sDB.list();
        System.out.println(s.size());
    }
}
