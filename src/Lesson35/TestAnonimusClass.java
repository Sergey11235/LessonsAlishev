package Lesson35;

interface AbleToEat {
    public void eat();
}

//class Animal implements AbleToEat {
//    @Override
//    public void eat() {
//        System.out.println("");
//    }
//}
//class Animal {
//    public void eat() {
//        System.out.println("Animal is eating");
//    }
//}

//class OtherAnimal extends Animal {
//    public void eat() {
//        System.out.println("Other animal are eating");
//    }
//}

public class TestAnonimusClass {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };

        ableToEat.eat();

/*        Animal animal = new Animal();
        animal.eat();

//        OtherAnimal otherAnimal = new OtherAnimal();
//        otherAnimal.eat();
        Animal animal2 = new Animal() {
            public void eat() {
                System.out.println("Other animal are eating");
            }
        };*/
//        animal2.eat();
    }
}
