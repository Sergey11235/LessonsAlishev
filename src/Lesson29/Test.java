package Lesson29;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);
//        Animal animal = new Dog();
//        animal.eat();
//        Animal animal = new Animal();
//        Dog dog = new Dog();
//
//        animal.eat();
//        dog.eat();
//        Dog dog = new Dog();
//        dog.eat();
//        dog.bark();
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
