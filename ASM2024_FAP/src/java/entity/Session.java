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
public class Session {
    private String id;
    private String Gid;
    private String Lid;
    private String RoomId;
    private int Tid;
    private Date date;

    public Session() {
    }

    public Session(String id, String Gid, String Lid, String RoomId, int Tid, Date date) {
        this.id = id;
        this.Gid = Gid;
        this.Lid = Lid;
        this.RoomId = RoomId;
        this.Tid = Tid;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGid() {
        return Gid;
    }

    public void setGid(String Gid) {
        this.Gid = Gid;
    }

    public String getLid() {
        return Lid;
    }

    public void setLid(String Lid) {
        this.Lid = Lid;
    }

    public String getRoomId() {
        return RoomId;
    }

    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public int getTid() {
        return Tid;
    }

    public void setTid(int Tid) {
        this.Tid = Tid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
