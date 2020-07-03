package main.java;

import main.java.Repository.DataRoomsRepository;
import main.java.UseCase.ImportRoomsUseCase;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        DisplayRooms displayRooms = new DisplayRooms(new ImportRoomsUseCase(new DataRoomsRepository()));
        displayRooms.displayRooms();



        try ( Scanner scanner = new Scanner( System.in ) ) {

            System.out.print("Combien de places : ");
            int a = scanner.nextInt();

            System.out.print("Date d'arrivée : ");
            String b = scanner.next();

            System.out.print("Date de départ : ");
            String c = scanner.next();


            System.out.printf("La somme de %d et de vaut", a, b, c);
        }
    }

}




