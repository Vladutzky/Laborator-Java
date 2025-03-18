package ex1;

public class Operators {

    public static void main(String[] args) {
        int a = 20;
        int b = 11;

        // arithmetic
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("a++ = " + (a++));
        System.out.println("++a = " + (++a));
        System.out.println("a-- = " + (a--));
        System.out.println("--a = " + (--a));

        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // bit-wise
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + ~a);
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));
        System.out.println("a >>> 2 = " + (a >>> 2)); // unsigned shift right (adds a 0 to the leftmost position)

        // logical
        boolean x = true;
        boolean y = false;

        System.out.println("x && y = " + (x && y));
        System.out.println("x & y = " + (x & y));
        System.out.println("x || y = " + (x || y));
        System.out.println("x | y = " + (x | y));
        System.out.println("!x = " + !x);


        // String concatenation
        String s1 = "Hello,";
        String s2 = "World";
        System.out.println("s1 + s2 = " + s1 + s2);

        // instanceof
        Object object = "Hello, World!";
        if (object instanceof String) {
            System.out.println("object is a String");
        }

    }
}