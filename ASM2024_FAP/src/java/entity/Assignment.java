/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Assignment {
    private int id;
    private String Subid;
    private int Weight; 
    private String Name;

    public Assignment() {
    }

    public Assignment(int id, String Subid, int Weight, String Name) {
        this.id = id;
        this.Subid = Subid;
        this.Weight = Weight;
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubid() {
        return Subid;
    }

    public void setSubid(String Subid) {
        this.Subid = Subid;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
}
