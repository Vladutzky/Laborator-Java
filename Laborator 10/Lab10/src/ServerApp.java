import java.io.*;
import java.net.*;
import java.util.*;

class LoggerThread extends Thread {
    private final List<String> messages;

    public LoggerThread(List<String> messages) {
        this.messages = messages;
    }

    public void run() {
        try {
            while (true) {
                synchronized (messages) {
                    while (messages.isEmpty()) messages.wait();
                    String msg = messages.remove(0);
                    System.out.println("LOG: " + msg);
                }
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Logger thread interrupted");
        }
    }
}

class Processor implements Runnable {
    private final List<String> messages;

    public Processor(List<String> messages) {
        this.messages = messages;
    }

    public void run() {
        try {
            while (true) {
                synchronized (messages) {
                    while (messages.isEmpty()) messages.wait();
                    String msg = messages.remove(0).toUpperCase();
                    System.out.println("Processed: " + msg);
                }
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Processor thread interrupted");
        }
    }
}

public class ServerApp {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("Server is listening port 1234...");
        Socket s = ss.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        List<String> sharedMessages = new ArrayList<>();

        LoggerThread logger = new LoggerThread(sharedMessages);
        Thread processor = new Thread(new Processor(sharedMessages));
        logger.start();
        processor.start();

        String linie;
        while (!(linie = in.readLine()).equalsIgnoreCase("STOP")) {
            synchronized (sharedMessages) {
                sharedMessages.add(linie);
                sharedMessages.notifyAll();
            }

            out.write("Message received\n");
            out.flush();

            if (linie.equalsIgnoreCase("INTERRUPT")) {
                logger.interrupt();
                processor.interrupt();
                break;
            }
        }

        s.close();
        ss.close();
        System.out.println("Server stop");
    }
}
