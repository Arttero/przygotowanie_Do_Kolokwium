import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //w main
        //tablica kilku pokoi (obieekty room)
        //wypisz pokoje z cena ponizej 200zl(petla i instrukcja warunkowa)
        //przetworz dane teksotwe np wypisz numery pokoi jako tekst wielkimi literami

        //utworzenie nowego pokoju
        System.out.println("\nCzęść na 3\n");

        Room[] rooms = {
                new Room("Jeden",2),
                new Room("Dwa",3, 200),
                new Room("3",4, 250),
                new Room("4",4, 300),
                new Room("5",4, 300),
                new Room("6",4, 300),
        };
        for (Room room : rooms) {
            if (room.getPricePerNight() < 200) {
                System.out.println(room);
            }
        }
        for (Room room : rooms) {
            System.out.println(room.getRoomNumber().toUpperCase());
        }

        System.out.println("\nCzęść na 4\n");

        Hotel hotel = new Hotel();

        hotel.loadRoomsFromFile("rooms.txt");

        hotel.addRoom(new Room("2",2,60));
        hotel.addRoom(new Room("3",2,60));
        hotel.addRoom(new Room("4",3,100));
        hotel.addRoom(new Room("5",3,100));
        hotel.addRoom(new Room("6",4,120));
        hotel.addRoom("3",5);

        System.out.println("Pokoje z 3 lozkami:");
        hotel.findByBeds(3);

        System.out.println("Po usunieciu pokoi:");

        System.out.println();
        hotel.removeRoom("6");
        hotel.removeRoom("3");


        hotel.saveRoomsToFile("rooms.txt");
    }
}