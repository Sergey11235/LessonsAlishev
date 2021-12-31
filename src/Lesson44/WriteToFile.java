package Lesson44;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");
        PrintWriter pw = new PrintWriter(file);

    pw.println("Lesson48.Test row 1");
    pw.println("Lesson48.Test row 2");

    pw.close();

    }
}
