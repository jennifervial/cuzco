package main.java;


public class DisplayRooms {
    private PortDisplay portDisplay;

    public DisplayRooms(PortDisplay portDisplay) {
        this.portDisplay = portDisplay;
    }

    public void displayRooms() {

        for (int i = 0; i < portDisplay.getRooms().size(); i++) {
            System.out.println(portDisplay.getRooms().get(i).toString());


        }
    }
}

