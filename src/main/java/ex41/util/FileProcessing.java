package ex41.util;

import java.io.*;
import java.util.*;

public class FileProcessing {
    static List<String> namesList = new ArrayList<>();
    static int numberOfNames = 0;

    static public void readFilesNames() throws IOException {

        String inputFile = "/Users/melissacabrera/IdeaProjects/cabrera-cop3330-assignment3/src/main/java/ex41/files/exercise41_input.txt";

        //read file
        FileReader reader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(reader);

        //read all lines in the file
        while ((inputFile = bufferedReader.readLine()) != null) {
            namesList.add(inputFile);
            numberOfNames+=1;
        }
        reader.close();
    }

    static public void sortNames() {
        //sort names alphabetically
        Collections.sort(namesList);
    }


    static public void outputFiles() throws IOException {
        String outputFile = "exercise41_output.txt";

        //create new file writer
        FileWriter writer = new FileWriter(outputFile);

        //create new print writer
        PrintWriter output = new PrintWriter(writer);

        output.printf("Total of %d names\n", numberOfNames);
        output.println("-----------------");

        //print sorted names
        for(String name : namesList) {
            output.println(name);
        }

        //flush the stream
        output.flush();
        //close print writer
        output.close();

        //close file writer
        writer.close();
    }
}

