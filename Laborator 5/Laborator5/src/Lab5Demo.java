// ------------------------ EXCEPTIONS DEMO ------------------------
import java.sql.SQLException;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

class ExceptionExamples {

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            return scanner.nextInt();
        } catch (InputMismatchException | InterruptedException e) {
            System.out.println("Not a valid integer.");
            return -1;
        } finally {
            System.out.println("Attempted to read integer.");
        }
    }

    public static int parseAndDivide(String a, String b) {
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            return x / y;
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e.getMessage());
            return 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            return 0;
        }
    }

    public static void validateGrade(int grade) throws InvalidGradeException {
        if (grade < 1 || grade > 10) {
            throw new InvalidGradeException("Grade must be between 1 and 10.");
        }
        System.out.println("Grade is valid.");
    }
}

// ------------------------ INTERFACES DEMO ------------------------

interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String toString() {
        return name + " (grade: " + grade + ")";
    }

    public int compareTo(Student other) {
        return Double.compare(other.grade, this.grade); // descending
    }
}

// Simulated database service with interface
interface DatabaseActions {
    void connect() throws IllegalStateException;
    void executeQuery(String query) throws SQLException;
}

class FakeDatabase implements DatabaseActions {
    private boolean isDown;

    public FakeDatabase(boolean isDown) {
        this.isDown = isDown;
    }

    public void connect() {
        if (isDown) {
            throw new IllegalStateException("Database server is offline.");
        }
        System.out.println("Connected to database.");
    }

    public void executeQuery(String query) throws SQLException {
        if (query == null || query.isEmpty()) {
            throw new SQLException("Query is invalid.");
        }
        System.out.println("Executing query: " + query);
    }
}

// ------------------------ MAIN CLASS ------------------------

public class Lab5Demo {
    public static void main(String[] args) {
        // Exception 1: try-catch-finally
        int number = ExceptionExamples.readInteger();

        // Exception 2: multi-catch
        ExceptionExamples.parseAndDivide("10", "0");
        ExceptionExamples.parseAndDivide("abc", "2");

        // Exception 3: custom exception + propagation
        try {
            ExceptionExamples.validateGrade(11);
        } catch (InvalidGradeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        // Interface 1: Shape example
        Shape[] shapes = { new Circle(3), new Rectangle(4, 5) };
        for (Shape s : shapes) {
            System.out.println("Area: " + s.getArea() + ", Perimeter: " + s.getPerimeter());
        }

        // Interface 2: Comparable example
        java.util.List<Student> students = new java.util.ArrayList<>();
        students.add(new Student("Ana", 9.2));
        students.add(new Student("Ion", 8.7));
        students.add(new Student("Maria", 9.5));
        java.util.Collections.sort(students);
        students.sort(Comparator.comparingDouble(Student::getGrade));
        System.out.println("Sorted students:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Interface 3: Exception + Interface
        DatabaseActions db = new FakeDatabase(true);
        try {
            db.connect();
        } catch (IllegalStateException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }

        db = new FakeDatabase(false);
        try {
            db.connect();
            db.executeQuery(""); // will throw SQLException
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}