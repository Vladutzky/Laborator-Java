import java.util.Scanner;
public class ex1 {
    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        try {
            System.out.print("Enter an integer: ");
            result = Integer.parseInt(scanner.nextLine());
            System.out.println("You entered: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input.");
        } finally {
            System.out.println("readInteger() execution completed.");
        }
        return result;
    }
    public static void main(String[] args) {
        readInteger();
    }
}
