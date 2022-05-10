package fileExamples;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean bool = file.createNewFile();
            System.out.println(bool);
            String text = FileManager.readFile(file);
            System.out.println(text);
            FileManager.writeFile(file, "something new...", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
