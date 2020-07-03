package main.java.Repository;

import main.java.RoomRepository;
import main.java.Room;
import main.java.TimeSlot;

import java.util.ArrayList;

public class DataRoomsRepository implements RoomRepository {
    Room room1 = new Room(1, 101,	"1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible",	"2 guests", new ArrayList<TimeSlot>());
    Room room2 = new Room(1,	102,	"2 queen size beds - A/C - Wi-Fi - private bathroom - wheelchair accessible", "4 guests", new ArrayList<TimeSlot>());
    Room room3 = new Room(1,	103,	"3 single beds - A/C - Wi-Fi - private bathroom - wheelchair accessible","3 guests", new ArrayList<TimeSlot>());
    Room room4 = new Room(2,	201,	"1 king size bed - A/C - Wi-Fi - private bathroom",	"2 guests", new ArrayList<TimeSlot>());
    Room room5 = new Room(2,	202, "1 queen size bed - Wi-Fi - private bathroom",	"2 guests", new ArrayList<TimeSlot>());
    Room room6 = new Room(2,	203, "1 king size bed + 3 single beds - A/C - Wi-Fi - private bathroom",	"5 guests", new ArrayList<TimeSlot>());
    Room room7 = new Room(2,	204,	"1 single bed - Wi-Fi - shared bathroom",	"1 guest", new ArrayList<TimeSlot>());
    Room room8 = new Room(2,	205,	"2 single beds - A/C - Wi-Fi - shared bathroom",	"2 guests", new ArrayList<TimeSlot>());
    Room room9 = new Room(3,	301,	"1 queen size bed - A/C - private bathroom",	"2 guests", new ArrayList<TimeSlot>());
    Room room10 = new Room(3,	302,	"2 single beds - A/C - private bathroom",	"2 guests", new ArrayList<TimeSlot>());
    Room room11 = new Room(3,	303,	"3 single beds - A/C - shared bathroom",	"3 guests", new ArrayList<TimeSlot>());
    Room room12 = new Room(3,	304,	"2 single beds - shared bathroom",	"2 guests", new ArrayList<TimeSlot>());



    public ArrayList<Room> getRooms() {
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        rooms.add(room6);
        rooms.add(room7);
        rooms.add(room8);
        rooms.add(room9);
        rooms.add(room10);
        rooms.add(room11);
        rooms.add(room12);
        return rooms;
    }
}

