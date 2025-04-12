public class ex5 {
    public static void main(String[] args) {
        String str = "Hello World";
        String strModified = str.toLowerCase();
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + strModified);
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb.toString());
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World");
        System.out.println("StringBuffer: " + sbuf.toString());
    }
}
