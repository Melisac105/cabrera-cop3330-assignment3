package ex45.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

    public static String readFileContent(String path) throws FileNotFoundException {
        //create file with given path
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        StringBuilder content = new StringBuilder();

        while (scanner.hasNextLine()) {
            //add all file information in content
            content.append(scanner.nextLine());
        }
        return content.toString();
    }

    public static void writeFile(String path, String fileContent) throws IOException {
        //create file with given path
        FileWriter fileWriter = new FileWriter(path);
        //write output file
        fileWriter.write(fileContent);
        //close writer function
        fileWriter.close();
    }

}
