package ex45.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

    public static String readFileContent(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        String content = "";

        while (scanner.hasNextLine()) {
            content += scanner.nextLine();
        }

        return content;
    }

    public static void writeFile(String path, String fileContent) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(fileContent);
        fileWriter.close();
    }

}
