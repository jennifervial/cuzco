package main.java;

import java.util.ArrayList;

public class Reservation {
    TimeSlot dateReservation;
    int numberGuests;


    public Reservation(TimeSlot dateReservation, int numberGuests){
        this.dateReservation = dateReservation;
        this.numberGuests    = numberGuests;
    }
}
