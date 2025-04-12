public class ex2 {
    public static double parseAndDivide(String a, String b) {
        return Integer.parseInt(a) / Integer.parseInt(b);
    }
    public static void main(String[] args) {
        try {
            System.out.println(parseAndDivide("10", "0"));
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        try {
            System.out.println(parseAndDivide("ten", "2"));
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
