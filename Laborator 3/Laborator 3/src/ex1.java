public class ex1 {
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double multiply(double a, double b, double c) {
        return a * b * c;
    }
    public static int multiply(int[] values) {
        int prod = 1;
        for (int v : values) {
            prod *= v;
        }
        return prod;
    }
    public static void main(String[] args) {
        System.out.println(multiply(3, 4));
        System.out.println(multiply(2.5, 3.0, 4.0));
        System.out.println(multiply(new int[]{2, 3, 4, 5}));
    }
}
