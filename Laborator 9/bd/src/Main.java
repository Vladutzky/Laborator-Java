public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        // Create table if not exists
        service.createTable();

        // Insert students
        service.insert("Ana", 9.5);
        service.insert("Ion", 8.7);

        // Show all
        System.out.println("All students:");
        service.getAll().forEach(System.out::println);

        // Update grade
        service.updateGrade(1, 10.0);

        // Show after update
        System.out.println("After update:");
        service.getAll().forEach(System.out::println);

        // Delete Ion (id = 2)
        service.delete(2);

        // Final state
        System.out.println("After deletion:");
        service.getAll().forEach(System.out::println);
    }
}
