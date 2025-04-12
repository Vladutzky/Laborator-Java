public class ex4 {
    interface Shape {
        double getArea();
        double getPerimeter();
    }
    static class Circle implements Shape {
        double radius;
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
    static class Rectangle implements Shape {
        double width;
        double height;
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
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(3), new Rectangle(4, 5) };
        for (Shape s : shapes) {
            System.out.println("Area: " + s.getArea() + ", Perimeter: " + s.getPerimeter());
        }
    }
}
