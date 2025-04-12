public class ex1 {
    static class Room {
        double width;
        double length;
        public Room(double width, double length) {
            this.width = width;
            this.length = length;
        }
        public Room(Room r) {
            this.width = r.width;
            this.length = r.length;
        }
    }
    static class Owner {
        String name;
        public Owner(String name) {
            this.name = name;
        }
    }
    static class House {
        String address;
        Room diningRoom;
        Owner owner;
        public House(String address, Room diningRoom, Owner owner) {
            this.address = address;
            this.diningRoom = new Room(diningRoom);
            this.owner = owner;
        }
    }
    public static void main(String[] args) {
        Room room = new Room(5.0, 4.0);
        Owner owner = new Owner("John");
        House house = new House("123 Main St", room, owner);
        room.width = 10.0;
        owner.name = "Mike";
        System.out.println("House diningRoom width: " + house.diningRoom.width);
        System.out.println("House owner name: " + house.owner.name);
    }
}
