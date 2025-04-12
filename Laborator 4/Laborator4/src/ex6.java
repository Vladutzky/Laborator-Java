import java.util.ArrayList;
import java.util.List;
public class ex6 {
    static class Owner {
        String name;
        public Owner(String name) {
            this.name = name;
        }
    }
    static class House {
        Address address;
        Owner owner;
        public House(Address address, Owner owner) {
            this.address = new Address(address);
            this.owner = owner;
        }
    }
    public static final class Address {
        private final String city;
        private final String street;
        public Address(String city, String street) {
            this.city = city;
            this.street = street;
        }
        public Address(Address other) {
            this.city = other.city;
            this.street = other.street;
        }
        public String getCity() {
            return city;
        }
        public String getStreet() {
            return street;
        }
        public String toString() {
            return city + ", " + street;
        }
    }
    public record Student(String name, int group, double grade) {}
    public static void main(String[] args) {
        Address address = new Address("New York", "5th Avenue");
        Owner owner = new Owner("Michael");
        House house = new House(address, owner);
        Student s1 = new Student("Alice", 101, 9.5);
        Student s2 = new Student("Bob", 102, 8.0);
        Student s3 = new Student("Charlie", 101, 7.5);
        StringBuilder report = new StringBuilder();
        report.append("House Information:\n");
        report.append("Address: ").append(house.address.toString()).append("\n");
        report.append("Owner: ").append(house.owner.name).append("\n\n");
        report.append("Student Information:\n");
        report.append(s1.toString()).append("\n");
        report.append(s2.toString()).append("\n");
        report.append(s3.toString()).append("\n");
        System.out.println(report.toString());
    }
}
