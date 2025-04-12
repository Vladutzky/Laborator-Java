public class Room {
    double width;
    double length;

    public Room(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Room(Room room){
        this.length = room.length;
        this.width = room.width;
    }

    @Override
    public String toString() {
        return "Room{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
