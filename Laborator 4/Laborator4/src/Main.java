////import java.util.Objects;
////
//record numeRecord(int var, double var2){}
//class Om{
//    int varsta;
//    numeRecord rcd;
//    public Om(int varsta) {
//        this.varsta = varsta;
//        rcd =  new numeRecord(2,3);
//    }
//    public int fct(){
//        return rcd.var();
//    }
//
//}
//final class Person {
//    private final String name;
//    private final Om om;
//    private int age;
//
//    public Person(String name, int age, Om om) {
//        this.name = name;
//        this.age = age;
//        this.om = new Om(om.varsta);
//
//    }
////
////
////    @Override
////    public String toString() {
////        return "Person{name='" + name + "', age=" + age + "}";
////    }
////
////
////    @Override
////    public boolean equals(Object o) {
////        if (this == o) return true;
////        if (!(o instanceof Person)) return false;
////        Person person = (Person) o;
////        return age == person.age && Objects.equals(name, person.name);
////    }
////
////
////    @Override
////    public int hashCode() {
////        return Objects.hash(name, age);
////    }
////}
//record Ceva(int x, float y){}
//class altaClasa{}
//final class WASF{
//    final private int nr;
//    final altaClasa cls;
//    final Ceva cv;
//    public WASF(int nr, altaClasa cls) {
//        this.nr = nr;
//        this.cls = new altaClasa();
//        this.cv = new Ceva(2,3);
//    }
//    public int val(){
//        return cv.x();
//    }
//}

public class Main {
    public static void main(String[] args) {
        String s = "abc";
        String a = new String("abc");
        System.out.print(a.equals(s));
    } }
