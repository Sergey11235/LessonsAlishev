package Lesson39;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excaption3 {
    public static void main(String[] args) {
        // Checked Exception (Compile time exception) - исключ. случ в раб прогр.
        // Unchecked Exception (Runtime exception) - ошибка в раб. программы

/*        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("dafs");
        }*/

/* 1.       int a = 1 / 0;*/

/* 2.      String name = null;
        name.length();*/

        int[] arr = new int[2];
        System.out.println(arr[2]);

    }
}
