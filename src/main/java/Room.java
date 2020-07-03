package main.java;

import java.util.ArrayList;

public class Room {
    int floor ;
    int room ;
    String description ;
    String capacity ;
    ArrayList<TimeSlot> reservation;

    public Room(int floor, int room, String description, String capacity, ArrayList<TimeSlot> reservation){
        this.floor = floor;
        this.room  = room;
        this.description = description;
        this.capacity = capacity;
        this.reservation = reservation;
    }

    public String toString (){
        return String.valueOf(this.floor) + " " + String.valueOf(this.room) + " " + this.description + " " + this.capacity + this.reservation;
    }
}


