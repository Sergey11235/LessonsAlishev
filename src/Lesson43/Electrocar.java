package Lesson43;

public class Electrocar {
    public static Object Battary;
    private int id;

    // вложенный нестатический класс
    private class Motor {
       public void startMotor() {
           System.out.println("Motor" + id + " is starting");
       }
    }

    // статический вложенный класс
    public static class Battary {
        public void charge() {
            System.out.println("Battery is charging");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }
    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        class SomeClass {
            public void someClass() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObject = new SomeClass();
//        test(someObject);
        System.out.println("Electrocar " + id + " is starting");
    }
}
