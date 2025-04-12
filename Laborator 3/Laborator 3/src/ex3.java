public class ex3 {
    static abstract class Animal {
        abstract void makeSound();
    }
    static class Dog extends Animal {
        void makeSound() {
            System.out.println("Woof!");
        }
    }
    static class Cat extends Animal {
        void makeSound() {
            System.out.println("Meow!");
        }
    }
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() };
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
