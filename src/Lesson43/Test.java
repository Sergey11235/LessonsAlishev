package Lesson43;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        Electrocar.Battary = new Electrocar.Battary();
    }
}
