package ex41.util;

import java.io.*;
import java.util.*;

public class FileProcessing {
    static List<String> namesList = new ArrayList<>();
    static public void readFilesNames() throws IOException {

        String inputFile = "/Users/melissacabrera/Desktop/exercise41_input.txt";

        FileReader reader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(reader);
        while ((inputFile = bufferedReader.readLine()) != null) {
            namesList.add(inputFile);
        }
        reader.close();
    }

    static public void sortNames() {
        Collections.sort(namesList);
    }

    static public void outputFiles() throws IOException {
        String outputFile = "exercise41_output.txt";

        FileWriter writer = new FileWriter(outputFile);
        PrintWriter output = new PrintWriter(writer);

        for(String name : namesList) {
            output.println(name);
        }
        output.flush();
        output.close();
        writer.close();
    }
}

