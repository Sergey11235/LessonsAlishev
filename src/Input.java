import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите какое-нибудь число");
        int i = x.nextInt();
        System.out.println("Вы ввели " + i);

    }
}
