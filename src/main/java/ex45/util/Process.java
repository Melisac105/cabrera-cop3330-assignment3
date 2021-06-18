package ex45.util;

import java.io.File;
import java.io.IOException;

public class Process {

    public static void process() throws IOException {
        String filesPath = new File("src/main/java/ex45/files").getAbsolutePath();
        String inputFilePath = filesPath + "/exercise45_input.txt";

        String inputFileContent = Files.readFileContent(inputFilePath);
        String outputFileContent = inputFileContent.replaceAll("utilize", "use");

        String fileName = UsrInput.getFileName();
        String outputFilePath = filesPath + "/" + fileName + ".txt";
        Files.writeFile(outputFilePath, outputFileContent);
    }

}
