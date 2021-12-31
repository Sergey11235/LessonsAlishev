package Lesson8;

import java.util.Scanner;

public class DoWhile {
/*    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введи 5"); // дублирует код
        int value = scanner.nextInt(); //дублирует код
        while(value!=5) {
            System.out.println("Введи 5"); // дублирует код
            value = scanner.nextInt(); // дублирует код
        }
        System.out.println("вы ввели 5");
    }*/

    // Та же самая программа только без дублей

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Введи 5");
            value = scanner.nextInt();
        } while(value!=5);

        System.out.println("Вы ввели 5");

    }

}

