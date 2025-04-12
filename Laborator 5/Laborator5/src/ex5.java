import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ex5 {
    static class Student implements Comparable<Student> {
        String name;
        double grade;
        public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }
        public int compareTo(Student other) {
            return Double.compare(this.grade, other.grade);
        }
        public String toString() {
            return "Student{name='" + name + "', grade=" + grade + "}";
        }
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 9.0));
        students.add(new Student("Bob", 7.5));
        students.add(new Student("Charlie", 8.5));
        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
