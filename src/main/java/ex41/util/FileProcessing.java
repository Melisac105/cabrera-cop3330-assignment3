package ex41.util;

import java.io.*;
import java.util.*;

public class FileProcessing {
    static List<String> namesList = new ArrayList<>();
    static int numberOfNames = 0;

    static public void readFilesNames() throws IOException {

        String inputFile = "/Users/melissacabrera/IdeaProjects/cabrera-cop3330-assignment3/src/main/java/ex41/inoutfiles/exercise41_input.txt";

        //read file
        FileReader reader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(reader);
        while ((inputFile = bufferedReader.readLine()) != null) {
            namesList.add(inputFile);
            numberOfNames+=1;
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

        output.printf("Total of %d names\n", numberOfNames);
        output.println("-----------------");

        for(String name : namesList) {
            output.println(name);
        }
        output.flush();
        output.close();
        writer.close();
    }
}

