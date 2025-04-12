public class ex4 {
    public record Student(String name, int group, double grade) {}
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 9.5);
        Student s2 = new Student("Bob", 102, 8.0);
        Student s3 = new Student("Alice", 101, 9.5);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1.name());
    }
}
