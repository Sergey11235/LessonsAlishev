package Lesson7;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String string = s.nextLine();
        System.out.println("Вы ввели " + string);
    }
}


/*    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите какое-нибудь число");
        int x = s.nextInt(); //метод nextLine() читает с клавиатуры одну строчку чего-либо
        System.out.println("Вы ввели число " + x);
    }
}*/
