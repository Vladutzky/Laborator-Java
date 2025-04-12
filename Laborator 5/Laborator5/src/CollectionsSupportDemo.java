import java.util.*;

public class CollectionsSupportDemo {

    public static void main(String[] args) {
        // 1. ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana"); // duplicate allowed

        System.out.println("ArrayList contents:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 2. LinkedList used as a queue
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nLinkedList as Queue:");
        System.out.println("Head: " + numbers.peek());
        numbers.poll();
        System.out.println("After poll: " + numbers);

        // 3. HashSet
        Set<String> animals = new HashSet<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cat"); // duplicate ignored
        animals.add("Elephant");

        System.out.println("\nHashSet (no duplicates):");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // 4. TreeSet
        Set<Integer> scores = new TreeSet<>();
        scores.add(50);
        scores.add(90);
        scores.add(30);

        System.out.println("\nTreeSet (sorted):");
        for (Integer score : scores) {
            System.out.println(score);
        }

        // 5. HashMap
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Ana");
        students.put(2, "Ion");
        students.put(3, "Maria");

        System.out.println("\nHashMap contents:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 6. TreeMap
        Map<String, String> capitals = new TreeMap<>();
        capitals.put("RO", "Bucharest");
        capitals.put("FR", "Paris");
        capitals.put("DE", "Berlin");

        System.out.println("\nTreeMap (sorted by keys):");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}