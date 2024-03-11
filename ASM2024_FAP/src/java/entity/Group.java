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
    private String Subid;
    private String PIC;

    public Group() {
    }

    public Group(String id, String GName, String Subid, String PIC) {
        this.id = id;
        this.GName = GName;
        this.Subid = Subid;
        this.PIC = PIC;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGName() {
        return GName;
    }

    public void setGName(String GName) {
        this.GName = GName;
    }

    public String getSubid() {
        return Subid;
    }

    public void setSubid(String Subid) {
        this.Subid = Subid;
    }

    public String getPIC() {
        return PIC;
    }

    public void setPIC(String PIC) {
        this.PIC = PIC;
    }
    
}
