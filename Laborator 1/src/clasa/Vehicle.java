package clasa;

public abstract class Vehicle {
    // Abstract Method (to be implemented in subclass)
    public abstract void start();

    // Concrete Method (can be inherited)
    public void stop() {
        System.out.println("Vehicle stopped");
    }
}
