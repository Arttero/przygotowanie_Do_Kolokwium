public class Room {


    //pola roomnumber, beds, pricepernight

    //konstruktor i metody dostepowe get/set, przeciazony konstruktor z domyslna cena
    //metoda tostring do prezentacji danych pokoju

    String roomNumber;
    int beds;
    int pricePerNight;

    public Room(String roomNumber, int beds, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Room(String roomNumber, int beds) {
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.pricePerNight = 150;
    }

    @Override
    public String toString() {
        return "Room: " +
                "roomNumber= " + roomNumber +
                ", beds= " + beds +
                ", pricePerNight= " + pricePerNight + " zł/noc";
    }
}
