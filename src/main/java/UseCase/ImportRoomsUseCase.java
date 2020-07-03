package main.java.UseCase;

import main.java.PortDisplay;
import main.java.RoomRepository;
import main.java.Room;

import java.util.ArrayList;

public class ImportRoomsUseCase implements PortDisplay {
    public RoomRepository portRepository;

    public ImportRoomsUseCase(RoomRepository portRepository) {
        this.portRepository = portRepository;
    }

    public ArrayList<Room> getRooms(){
        return portRepository.getRooms();
    }
}
