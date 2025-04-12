public class ex3 {
    public static final class ImmutablePoint {
        private final double x;
        private final double y;
        public ImmutablePoint(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
    }
    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(3.0, 4.0);
        System.out.println("x: " + point.getX() + " y: " + point.getY());
    }
}
