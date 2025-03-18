import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(a);
        System.out.print(b);
        System.out.printf("Hello %d!", a);


        int[] integers = new int[6];
        integers[2] = 5;
        for (int i = 0; i< integers.length; i++){
            System.out.println(integers[i]);}

        ArrayList<Integer> NR = new ArrayList<>() ;
        for (int i = 0; i< NR.size(); i++){
            System.out.println(NR.get(i));}
        System.out.println(' ');
        NR.add(2);
        NR.add(5);
        for (int i = 0; i< NR.size(); i++){
            System.out.print(NR.get(i));}
        System.out.println(' ');
        NR.add(1,8);



        for (int i = 0; i< NR.size(); i++){
            System.out.print(NR.get(i));}
        System.out.println(' ');







    }
}