package Lesson10;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 0 :
                System.out.println("Ты родился");
                break;
            case 7 :
                System.out.println("Ты пошел в школу");
                break;
            case 18 :
                System.out.println("Ты закончил школу");
                break;
            default :
                System.out.println("Ни одно из условий не подходит");
        }
    }
}
// Начиная с 7-ой Java вместо int-овой переменной можно использовать String-овую