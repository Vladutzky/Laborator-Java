public class ex2 {
    static class Vehicle {
        String brand;
        int year;
        Vehicle(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }
        void displayInfo() {
            System.out.println("Vehicle: " + brand + " (" + year + ")");
        }
    }
    static class Car extends Vehicle {
        int numberOfDoors;
        Car(String brand, int year, int numberOfDoors) {
            super(brand, year);
            this.numberOfDoors = numberOfDoors;
        }
        @Override
        void displayInfo() {
            System.out.println("Car: " + brand + " (" + year + "), Doors: " + numberOfDoors);
        }
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Toyota", 2015);
        Car c = new Car("Honda", 2018, 4);
        v.displayInfo();
        c.displayInfo();
    }
}
