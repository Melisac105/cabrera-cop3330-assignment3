package ex45.util;

import java.io.File;
import java.io.IOException;

public class Process {

    public static void process() throws IOException {
        //create general file path
        String filesPath = new File("src/main/java/ex45/files").getAbsolutePath();
        //create input file path
        String inputFilePath = filesPath + "/exercise45_input.txt";


        String inputFileContent = Files.readFileContent(inputFilePath);
        //modify output file ==> change utilize for use
        String outputFileContent = inputFileContent.replaceAll("utilize", "use");

        String fileName = UsrInput.getFileName();
        //create output file path
        String outputFilePath = filesPath + "/" + fileName + ".txt";
        //call writeFile function to modify output file
        Files.writeFile(outputFilePath, outputFileContent);
    }

}
