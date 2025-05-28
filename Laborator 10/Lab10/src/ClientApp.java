import java.io.*;
import java.net.*;

public class ClientApp {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 1234);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader tastatura = new BufferedReader(new InputStreamReader(System.in));

        String linie;
        System.out.println("Msg(Stop):");

        while (true) {
            System.out.print("Send: ");
            linie = tastatura.readLine();
            out.write(linie);
            out.newLine();
            out.flush();

            if (linie.equalsIgnoreCase("STOP")) break;

            System.out.println("Response: " + in.readLine());
        }

        s.close();
    }
}
