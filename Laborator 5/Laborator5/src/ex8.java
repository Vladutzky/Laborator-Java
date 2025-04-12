import java.util.HashMap;
import java.util.Map;
public class ex8 {
    static class Student {
        int id;
        String name;
        double grade;
        public Student(int id, String name, double grade) {
            this.id = id;
            this.name = name;
            this.grade = grade;
        }
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "', grade=" + grade + "}";
        }
    }
    public static void main(String[] args) {
        HashMap<Integer, Student> students = new HashMap<>();
        students.put(1, new Student(1, "Alice", 9.0));
        students.put(2, new Student(2, "Bob", 8.5));
        students.put(3, new Student(3, "Charlie", 7.0));
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        Student s = students.get(2);
        s.grade = 9.5;
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
