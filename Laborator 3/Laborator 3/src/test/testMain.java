//// superclass
//package test;
//class A {
//    void method() {
//        // a method of class A
//        System.out.println("Method A");
//    }
//}
//
//// subclass of class A
//class B extends A {
//    void method() {
//        // class B method
//        System.out.println("Method B");
//    }
//}
//
//// subclass of class B
//class C extends B {
//    void method() {
//        // class C method
//        System.out.println("Method C");
//    }
//}
//
//public class testMain {
//
//    public static void main(String[] args) {
//        A objA = new A();
//        B objB = new B();
//        C objC = new C();
//
//        obj.method(); // invoke the method() of class A
//        obj.method(); // invoke the method() of class B
//        obj.method(); // invoke the method() of class C
//    }
//}