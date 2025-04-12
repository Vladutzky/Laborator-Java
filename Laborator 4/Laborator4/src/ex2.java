public class ex2 {
    static class Person {
        String name;
        int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && (name != null ? name.equals(person.name) : person.name == null);
        }
        public int hashCode() {
            int result = (name != null ? name.hashCode() : 0);
            result = 31 * result + age;
            return result;
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("John", 30);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());
        System.out.println(p1);
        System.out.println(p2);
    }
}
