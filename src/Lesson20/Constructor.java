package Lesson20;

public class Constructor {
    public static void main(String[] args) {
        Human human1 = new Human("Bob");
    }
}

class Human {
    private String name;
    private int age;

    public Human() {
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Human(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Human(String name, int age) {
        System.out.println("Привет из третьего консруктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}