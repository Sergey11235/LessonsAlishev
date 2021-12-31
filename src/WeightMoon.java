import java.util.Scanner;

public class WeightMoon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ведите ваш вес в килогараммах: ");
        double x = s.nextDouble();
        System.out.println("Ваш вес на Луне равен: " + x * 0.1734);

    }
    }

