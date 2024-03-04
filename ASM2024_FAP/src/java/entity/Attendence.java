/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Attendence {
    private int id;
    private String Sesid;
    private String studentid;
    private boolean ispresent;
    private String Description;
    private Date Datetime;

    public Attendence() {
    }

    public Attendence(int id, String Sesid, String studentid, boolean ispresent, String Description, Date Datetime) {
        this.id = id;
        this.Sesid = Sesid;
        this.studentid = studentid;
        this.ispresent = ispresent;
        this.Description = Description;
        this.Datetime = Datetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSesid() {
        return Sesid;
    }

    public void setSesid(String Sesid) {
        this.Sesid = Sesid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public boolean isIspresent() {
        return ispresent;
    }

    public void setIspresent(boolean ispresent) {
        this.ispresent = ispresent;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Date getDatetime() {
        return Datetime;
    }

    public void setDatetime(Date Datetime) {
        this.Datetime = Datetime;
    }
    
}
