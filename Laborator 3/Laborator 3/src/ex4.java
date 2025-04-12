public class ex4 {
    interface Insurable {
        double getInsuranceCost();
    }
    static abstract class Vehicle {
        abstract void drive();
    }
    static class Motorcycle extends Vehicle implements Insurable {
        String brand;
        int engineCapacity;
        Motorcycle(String brand, int engineCapacity) {
            this.brand = brand;
            this.engineCapacity = engineCapacity;
        }
        public void drive() {
            System.out.println("Motorcycle " + brand + " is driving");
        }
        public double getInsuranceCost() {
            return engineCapacity * 1.5;
        }
    }
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle("Yamaha", 600);
        m.drive();
        System.out.println(m.getInsuranceCost());
    }
}
