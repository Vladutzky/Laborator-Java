import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ex6 {
    static abstract class Shape {
        abstract double getArea();
    }
    static class Rectangle extends Shape {
        double width;
        double height;
        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        double getArea() {
            return width * height;
        }
    }
    interface Colorable {
        String getColor();
    }
    static class Circle extends Shape implements Colorable {
        double radius;
        Circle(double radius) {
            this.radius = radius;
        }
        double getArea() {
            return Math.PI * radius * radius;
        }
        public String getColor() {
            return "blue";
        }
    }
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5, 4));
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(2, 8));
        shapes.add(new Circle(1.5));
        for (Shape s : shapes) {
            System.out.print("Area: " + s.getArea());
            if (s instanceof Colorable) {
                System.out.print(", Color: " + ((Colorable)s).getColor());
            }
            System.out.println();
        }
        shapes.sort(new Comparator<Shape>() {
            public int compare(Shape s1, Shape s2) {
                return Double.compare(s1.getArea(), s2.getArea());
            }
        });
        System.out.println("Sorted shapes:");
        for (Shape s : shapes) {
            System.out.print("Area: " + s.getArea());
            if (s instanceof Colorable) {
                System.out.print(", Color: " + ((Colorable)s).getColor());
            }
            System.out.println();
        }
    }
}
