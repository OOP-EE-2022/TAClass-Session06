package fileExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static String readFile(File file) {
        StringBuilder text = new StringBuilder("");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                text.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return text.toString();
    }

    public static void writeFile(File file, String text, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            fileWriter.write(text + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

