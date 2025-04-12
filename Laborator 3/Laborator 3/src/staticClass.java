//class A {
//    int dată_membră_non_statică = 1;
//    static int dată_membră_statică = 1000;
//    void metoda1() {
//        System.out.println("Metoda non-statică 1 din clasa A!");
//    }
//    static void metoda2() {
//        System.out.println("Metoda statică 2 din clasa A!");
//    }
//}
//class B extends A {
//    int dată_membră_non_statică = 2;
//    static int dată_membră_statică = 2000;
//    void metoda1() {
//        System.out.println("Metoda non-statică 1 din clasa B!");
//    }
//    static void metoda2() {
//        System.out.println("Metoda statică 2 din clasa B!");
//    }
//}
//public class staticClass {
//    A ob = new B(); //polimorfism
//    System.out.println("Data membră non-statică = " + ob.dată_membră_non_statică);
//    System.out.println("Data membră statică = " + ob.dată_membră_non_statică);
//    ob.metoda1();
//    ob.metoda2();
//}
//
