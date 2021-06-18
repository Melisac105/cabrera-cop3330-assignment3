package ex46.util;

import java.io.File;
import java.io.FileNotFoundException;
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

}
