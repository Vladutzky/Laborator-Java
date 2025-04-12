public class House {
    String address;
    Owner owner;
    Room room;

    public House(String address, Owner owner, Room room) {
        this.address = address;
        this.owner = new Owner(owner);
        this.room = room;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", owner=" + owner +
                ", room=" + room +
                '}';
    }
}
