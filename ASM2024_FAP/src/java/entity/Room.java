/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Room {
    private String id;
    private int Roomnumber;
    private String Building;

    public Room() {
    }

    public Room(String id, int Roomnumber, String Building) {
        this.id = id;
        this.Roomnumber = Roomnumber;
        this.Building = Building;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRoomnumber() {
        return Roomnumber;
    }

    public void setRoomnumber(int Roomnumber) {
        this.Roomnumber = Roomnumber;
    }

    public String getBuilding() {
        return Building;
    }

    public void setBuilding(String Building) {
        this.Building = Building;
    }
    
}
