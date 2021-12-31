package Lesson42;

public class Test {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println(string1.equals(string2));
//        int x = 1;
//        int y = 1;
//        System.out.println(x == y);

/*        //  animal1        ->         {1}
          //  animal2        ->         {1}

        Animal animal1 = new Animal(1);
        Animal animal2 = animal1; // new Animal(1);
        System.out.println(animal1 == animal2);*/

//        Object object = new Object();
//        object.equals();


    }
}

class Animal {
    private int id;
    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
