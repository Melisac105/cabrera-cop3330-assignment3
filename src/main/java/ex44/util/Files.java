package ex44.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {

    public static String getFileContent() throws FileNotFoundException {
        File inputFile = new File("src/main/java/ex44/files/excercise44_input.json");
        Scanner reader = new Scanner(inputFile);
        String json = "";

        while (reader.hasNextLine()) {
            json += reader.nextLine();
        }

        return json;
    }

}
