/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Lectuer {
    private String id;
    private String name;
    private int Phonenumber;
    private String Subject;

    public Lectuer() {
    }

    public Lectuer(String id, String name, int Phonenumber, String Subject) {
        this.id = id;
        this.name = name;
        this.Phonenumber = Phonenumber;
        this.Subject = Subject;
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
        return Phonenumber;
    }

    public void setPhonenumber(int Phonenumber) {
        this.Phonenumber = Phonenumber;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }
    
}
