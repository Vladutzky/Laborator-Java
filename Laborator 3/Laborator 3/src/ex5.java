public class ex5 {
    static class Printer {
        void print(String s) {
            System.out.println(s);
        }
        void print(int number) {
            System.out.println(number);
        }
    }
    static class ColorPrinter extends Printer {
        @Override
        void print(String s) {
            System.out.println("Printing in red: " + s);
        }
    }
    public static void main(String[] args) {
        Printer p = new Printer();
        ColorPrinter cp = new ColorPrinter();
        p.print("Test string");
        p.print(100);
        cp.print("Test string in color");
    }
}
