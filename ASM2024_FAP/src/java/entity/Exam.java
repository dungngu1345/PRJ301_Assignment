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
public class Exam {
    private String id;
    private int Aid;
    private Date BeginDate;
    private Date EndDate;

    public Exam() {
    }

    public Exam(String id, int Aid, Date BeginDate, Date EndDate) {
        this.id = id;
        this.Aid = Aid;
        this.BeginDate = BeginDate;
        this.EndDate = EndDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAid() {
        return Aid;
    }

    public void setAid(int Aid) {
        this.Aid = Aid;
    }

    public Date getBeginDate() {
        return BeginDate;
    }

    public void setBeginDate(Date BeginDate) {
        this.BeginDate = BeginDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }
    
}
