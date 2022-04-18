package com.learningspring.ll.learningspring.data;

import javax.persistence.*;

@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ROOM_ID")
    private long id;

    @Column(name="NAME")
    private String name;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", room_Number='" + roomNumber + '\'' +
                ", bedInfo='" + bedInfo + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoom_Number(String room_Number) {
        this.roomNumber = room_Number;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }

    @Column(name="ROOM_NUMBER")
    private String roomNumber;

    @Column(name="BED_INFO")
    private String bedInfo;

}
