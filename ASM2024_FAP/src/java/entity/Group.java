/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Group {
    private int id;
    private String GName;
    private int Subid;
    private int PIC;

    public Group(int id, String GName, int Subid, int PIC) {
        this.id = id;
        this.GName = GName;
        this.Subid = Subid;
        this.PIC = PIC;
    }

    public Group() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGName() {
        return GName;
    }

    public void setGName(String GName) {
        this.GName = GName;
    }

    public int getSubid() {
        return Subid;
    }

    public void setSubid(int Subid) {
        this.Subid = Subid;
    }

    public int getPIC() {
        return PIC;
    }

    public void setPIC(int PIC) {
        this.PIC = PIC;
    }


}
