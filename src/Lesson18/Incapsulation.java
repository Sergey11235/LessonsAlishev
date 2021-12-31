package Lesson18;

public class Incapsulation {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-2);
        System.out.println("Выводим значеие в main методе: " + person1.getName());
        System.out.println("Выводим значеие в main методе: " + person1.getAge());

    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты не ввел имя!");
        } else {
            name = userName;
        }
    }
    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if(userAge < 0) {
            System.out.println("Возраст должен быть положительным!");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    int calculateYearsToRetirement() {
        int years = 65-age;
        return years;
    }

    void speak() {
    for(int i = 0; i < 3; i++) {
        System.out.println("Меня зовут " + name + ", мне "+ age+" лет");
        }
    }
    void sayHallo() {
        System.out.println("Привет!");
    }
}
