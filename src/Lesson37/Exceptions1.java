package Lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        readFile(); // stack trace - трассировка стека

    }

    private static void readFile() {
    }
//        File file = new File("test");
//
//        try {
//            Scanner scanner = new Scanner(file);
//
//            System.out.println("после Scanner'а");
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл не найден");
//        }
//        System.out.println("После блока try catch");
//    }

    public void reeadFile() throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner = new Scanner(file);

    }
}
