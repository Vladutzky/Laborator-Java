//class Messenger {
//    // Metodă de bază
//    public void sendMessage(String message) {
//        System.out.println("Sending message: " + message);
//    }
//
//    // Overload 1: cu destinatar
//    public void sendMessage(String message, String recipient) {
//        System.out.println("Sending message: " + message + " to " + recipient);
//    }
//
//    // Overload 2: repetă mesajul de un anumit număr de ori
//    public void sendMessage(String message, int times) {
//        for (int i = 0; i < times; i++) {
//            System.out.println("Sending message: " + message);
//        }
//    }
//}
//
//// Subclasa: ColoredMessenger
//class ColoredMessenger extends Messenger {
//    // Suprascrierea metodei sendMessage pentru a afișa un mesaj colorat
//    @Override
//    public void sendMessage(String message) {
//        System.out.println("Sending colored message: " + message);
//    }
//    public void sendMessage(double x){
//        System.out.println(x);
//    }
//}
//
//// Clasa principală
//public class Main {
//    public static void main(String[] args) {
//        // Instanță de bază
//        Messenger normalMessenger = new Messenger();
//        // Instanță de subclasă
//        Messenger coloredMessenger = new ColoredMessenger();
//
//        // Apeluri folosind instanța de tip Messenger
//        System.out.println("Normal Messenger:");
//        normalMessenger.sendMessage("Hello World");
//        normalMessenger.sendMessage("Hello World", "Alice");
//        normalMessenger.sendMessage("Hello World", 3);
//
//        // Apeluri folosind instanța de tip ColoredMessenger
//        System.out.println("\nColored Messenger:");
//        coloredMessenger.sendMessage("Hello World");  // Apel override
//        coloredMessenger.sendMessage("Hello World", "Bob"); // Apel overload (metoda neschimbată)
//        coloredMessenger.sendMessage("Hello World", 2);  // Apel overload (metoda neschimbată)
//    }
//}
//class Unu{
//    int x;
//
//    Unu(int x){
//        x = 2;
//    }
//    public int returneaza(){
//        return 2;
//    }
//}
//class Doi extends Unu{
//    int x;
//    Doi(){
//        super(2);
//        x = super.returneaza();
//    }
//    @Override
//    public int returneaza() {
//        return 5;
//    }
//    public int returneazaBaza(){
//        int x  = super.returneaza();
//        return x;
//    }


class A {
    int dată_membră_non_statică = 1;
    static int dată_membră_statică = 1000;
    void metoda1() {
        System.out.println("Metoda non-statică 1 din clasa A!");
    }
    static void metoda2() {
        System.out.println("Metoda statică 2 din clasa A!");
    }
}
class B extends A {
    int dată_membră_non_statică = 2;
    static int dată_membră_statică = 2000;
    void metoda1() {
        System.out.println("Metoda non-statică 1 din clasa B!");
    }
    static void metoda2() {
        System.out.println("Metoda statică 2 din clasa B!");
    }
}


    public class Main {
        public static void main(String[] args) {
                    A ob = new B(); //polimorfism
            System.out.println("Data membră non-statică = " + ob.dată_membră_non_statică);
                    System.out.println("Data membră statică = " + ob.dată_membră_statică);
                    ob.metoda1();
                    ob.metoda2();

    }

//downcasting bun!!
//Inginer p = null;
//if(b instanceof Inginer)
//        p = (Inginer)b;

    }



//        A ob = new B(); //polimorfism
//            System.out.println("Data membră non-statică = " + ob.dată_membră_non_statică);
//                    System.out.println("Data membră statică = " + ob.dată_membră_non_statică);
//                    ob.metoda1();
//                    ob.metoda2();
//
//    }