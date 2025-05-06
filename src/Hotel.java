import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

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
                if (room.getRoomNumber().equals(roomNumber)) {
                    rooms.remove(room);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    //dodatkowe
    public void printRooms() {
        if (rooms.isEmpty()) {
            System.out.println("Brak pokoi w hotelu.");
        } else {
            for (Room room : rooms) {
                System.out.println(room);
            }
        }
    }


    public void addRoom(String roomNumber, int beds) {
        this.rooms.add(new Room(roomNumber, beds));
    }

    public void saveRoomsToFile(String fileName) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            for (Room room : rooms) {
                fileWriter.write(room.toString());
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

//    public void loadRoomsFromFile(String fileName) throws IOException {
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
//            while (bufferedReader.readLine() != null) {
//                String roomNumber = bufferedReader.readLine();
//                int beds = Integer.parseInt(bufferedReader.readLine());
//                int pricePerNight = Integer.parseInt(bufferedReader.readLine());
//                addRoom(roomNumber, beds);
//            }
//            bufferedReader.close();
//        } catch (IOException e) {
//            System.out.println("Błąd: " + e.getMessage());
//        }
//    }
}
