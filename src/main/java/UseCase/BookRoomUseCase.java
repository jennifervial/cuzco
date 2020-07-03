package main.java.UseCase;

import main.java.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class BookRoomUseCase implements PortReservation {
    public RoomRepository roomRepository;

    public BookRoomUseCase(RoomRepository roomRepository) {
        this.roomRepository = roomRepository ;
    }

    private void convertReservation(int numberGuests, String dateArrivee, String dateSortie) {
        try {
            Reservation reservation = new Reservation(new TimeSlot(new SimpleDateFormat("dd/MM/yyyy").parse(dateArrivee), new SimpleDateFormat("dd/MM/yyyy").parse(dateSortie)), numberGuests);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void getReservation(int numberGuests, String dateArrivee, String dateSortie){
       ArrayList<Room> rooms = roomRepository.getRooms();

    }
}
