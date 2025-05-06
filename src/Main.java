public class Main{
    public static void main(String[] args) throws Exception {
        //w main
        //tablica kilku pokoi (obieekty room)
        //wypisz pokoje z cena ponizej 200zl(petla i instrukcja warunkowa)
        //przetworz dane teksotwe np wypisz numery pokoi jako tekst wielkimi literami

        //utworzenie nowego pokoju
        System.out.println("\nCzęść na 3\n");

        Room[] rooms = {
                new Room("1",1,100),
                new Room("2",2,200),
                new Room("1a",2),
                new Room("1c",3, 200),
                new Room("3a",4, 250),
                new Room("4b",4, 300),
                new Room("5",4, 300),
                new Room("6",4, 300),
        };
        System.out.println("Pokoje z ceną poniżej 200zł:");
        for (Room room : rooms) {
            if (room.getPricePerNight() < 200) {
                System.out.println(room);
            }
        }
        System.out.println();

        System.out.println("Po zamianie malych liter na duze:");
        for (Room room : rooms) {
            System.out.println("Room: " +
                    "roomNumber= " + room.getRoomNumber().toUpperCase() +
                    ", beds= " + room.getBeds() +
                    ", pricePerNight= " + room.getPricePerNight() + " zł/noc");
        }
        System.out.println();

        System.out.println("\nCzęść na 4\n");
        Hotel hotel = new Hotel();

        hotel.addRoom(new Room("2a",2,60));
        hotel.addRoom(new Room("3b",2,60));
        hotel.addRoom(new Room("4",3,100));
        hotel.addRoom(new Room("5",3,100));
        hotel.addRoom(new Room("6",4,120));
        hotel.addRoom("3",5);

        System.out.println("Pokoje z 3 lozkami:");
        hotel.findByBeds(3);
        System.out.println();

        hotel.removeRoom("6");
        hotel.removeRoom("3b");
        System.out.println("Po usunieciu pokoi:");
        hotel.printRooms();
        System.out.println();

        hotel.saveRoomsToFile("rooms.txt");
    }
}