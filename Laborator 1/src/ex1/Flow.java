package ex1;

public class Flow {

    public static void main(String[] args) {
        //if-else if-else

        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("a is equal to b");
        }

        // for loop
        for (int i = 0; i < 3; i++) {
            System.out.println("for loop, i = " + i);
        }

        // enhanced for loop
        for (int i : new int[] {1, 2, 3}) {
            System.out.println("enhanced for loop, i = " + i);
        }




        int[] integers = new int[]{1, 2, 3, 4};

        for (int i : integers) {
            if ( i == 2) {
                continue;
            } else if ( i == 3) {
                System.out.println("enhanced for loop, breaking, i = " + i);
                break;
            }
            System.out.println("enhanced for loop, i = " + i);
        }

        // while loop
        int i = 0;
        while (i < 3) {
            System.out.println("while loop, i = " + i);
            i++;
        }

        // do while loop
        i = 0;
        do {
            System.out.println("do while loop, i = " + i);
            i++;
        } while (i < 3);

        // switch
        i = 1;
        switch (i) {
            case 1:
                System.out.println("switch - i is 1");
                break;
            case 2:
                System.out.println("switch - i is 2");
                break;
            default:
                System.out.println("switch - i is neither 1 nor 2");
        }

        String myString = "test";
        switch (myString) {
            case "test":
                System.out.println("switch - myString is test");
                break;
            case "not test":
                System.out.println("switch - myString is not test");
                break;
            default:
                System.out.println("switch - myString is something else");
        }


        ;
    }
}
