package clasa;

public class Car extends Vehicle implements Fuel {


    private static final int MAX_SPEED = 240;
    

    private String brand;
    private String model;
    private int year;
    private double fuelLevel;

    private static int totalCars = 0;

    // Constructors
    public Car() {
        this("Unknown", "Unknown", 2000, 0);
    }

    public Car(String brand, String model, int year, double fuelLevel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelLevel = fuelLevel;
        totalCars++;  // Increment car count
    }

    public Car(Car another) {
        this.brand = another.brand;
        this.model = another.model;
        this.year = another.year;
        this.fuelLevel = another.fuelLevel;
    }

    // Getters/Setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getFuelLevel() { return fuelLevel; }
    public void setFuelLevel(double fuelLevel) { this.fuelLevel = fuelLevel; }

    public static int getTotalCars() {
        return totalCars;
    }

    // Implementing abstract and interface methods
    @Override
    public void start() {
        System.out.println(brand + " " + model + " is starting.");
    }

    @Override
    public void refuel(int amount) {
        this.fuelLevel += amount;
        System.out.println("Refueled " + amount + " liters. Current fuel level: " + fuelLevel);
    }

    // Overloaded Methods
    public void accelerate() {
        System.out.println("Accelerating...");
    }

    public void accelerate(int speed) {
        if (speed > MAX_SPEED) {
            System.out.println("Speed limit exceeded");
        } else {
            System.out.println("Accelerating to " + speed + " km/h");
        }
    }

    // Inner Class
    class Engine {
        private int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public void displayInfo() {
            System.out.println("Engine Horsepower: " + horsepower);
        }
    }

    // Exception handling example
    public void drive(int distance) {
        try {
            if (fuelLevel <= 0) {
                throw new Exception("Fuel is empty");
            }
            System.out.println("Driving " + distance + " km");
            fuelLevel -= distance * 0.1; // Example fuel consumption
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Generic method example
    public <T> void showData(T data) {
        System.out.println("Data: " + data);
    }

    // Static block
    static {
        System.out.println("Car class loaded");
    }

    // Main method (entry point)
    public static void main(String[] args) {
        // Creating Objects
        Car car1 = new Car("Toyota", "Corolla", 2021, 50);
        Car car2 = new Car("BMW", "M3", 2023, 60);

        // Using Methods
        car1.start();
        car2.accelerate(200);
        car1.refuel(20);

        // Exception Handling Test
        car1.drive(600);

        // Static Method Call
        System.out.println("Total Cars: " + Car.getTotalCars());

        // Inner Class Usage
        Car.Engine engine = car1.new Engine(300);
        engine.displayInfo();

        // Generic Method Call
        car2.showData("This is a test string");
        car2.showData(12345);
    }
}
