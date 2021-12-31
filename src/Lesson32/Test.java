package Lesson32;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark(); // ошибка!
//        Dog dog = new Dog();
//        //Upcasting - восходящее преоразование
//        Animal animal = dog;
//
//        // Downcasting - низходящее преобразование
//        Dog dog2 = (Dog) animal;
//        dog2.bark();
    }
}
