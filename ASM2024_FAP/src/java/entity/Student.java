/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Student {
    private String id;
    private String name;
    private int phonenumber;
    private String StudentGroup;
    private ArrayList<Student> StudentList = new ArrayList<>();

    public Student() {
    }

    public Student(String id, String name, int phonenumber, String StudentGroup) {
        this.id = id;
        this.name = name;
        this.phonenumber = phonenumber;
        this.StudentGroup = StudentGroup;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getStudentGroup() {
        return StudentGroup;
    }

    public void setStudentGroup(String StudentGroup) {
        this.StudentGroup = StudentGroup;
    }

    public ArrayList<Student> getStudentList() {
        return StudentList;
    }

    public void setStudentList(ArrayList<Student> StudentList) {
        this.StudentList = StudentList;
    }
    
}
