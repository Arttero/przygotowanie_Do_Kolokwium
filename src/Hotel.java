import java.io.*;
import java.util.ArrayList;

public class Hotel {
    ArrayList<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void findByBeds(int beds) {
        for (Room room : rooms) {
            if (room.getBeds() == beds) {
                System.out.println(room);
            }
        }
    }
    public void removeRoom(String roomNumber) throws Exception {
        try {
            for (Room room : rooms) {
                if (room.getRoomNumber() == roomNumber) {
                    rooms.remove(room);
                }
            }
        } catch (Exception e) {
            System.out.println("Niepoprawne room nie istnieje!");
        }
    }

    public void addRoom(String roomNumber, int beds) {
        this.rooms.add(new Room(roomNumber, beds));
    }

    public void saveRoomsToFile(String fileName) throws IOException {
        // nie pamietam
    }

    public void loadRoomsFromFile(String fileName) throws IOException {
        // nie pamietam
    }
}
