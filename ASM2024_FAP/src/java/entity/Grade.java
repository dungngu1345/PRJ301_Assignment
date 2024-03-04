/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Grade {
    private int id;
    private String Eid;
    private String Sid;
    private int Score;

    public Grade() {
    }

    public Grade(int id, String Eid, String Sid, int Score) {
        this.id = id;
        this.Eid = Eid;
        this.Sid = Sid;
        this.Score = Score;
    }
    
}
