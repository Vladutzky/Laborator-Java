public class MyThread extends Thread {
    private String simbol;

    public MyThread(String simbol) {
        this.simbol = simbol;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(simbol);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.out.println(simbol + " interrupted");
            }
        }
    }

    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        a.start();
        b.start();
    }
}
