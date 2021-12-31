import java.util.Scanner;

public class ConvertDollarToEuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите сумму в долларах: ");
        System.out.println("В евро это будет: " + scanner.nextDouble()*0.85);
    }
}
