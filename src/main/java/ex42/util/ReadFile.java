package ex42.util;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ReadFile {

    static public ArrayList<Map<String, String>> readFilesNames() throws IOException {

        ArrayList<Map<String, String>> fileList = new ArrayList<>();
        Map<String, String> infoPerEmployee = new HashMap<>();

        //takes file path
        String inputFilePath = new File("src/main/java/ex42/files/exercise42_input.txt").getAbsolutePath();
        File inputFile = new File(inputFilePath);

        //reads file
        Scanner reader = new Scanner(inputFile);

        //reads each line of the file
        while (reader.hasNextLine()) {

            //reads each character in current line
            Scanner readLine = new Scanner(reader.nextLine());

            //split the words when find a coma
            readLine.useDelimiter(",");

            //read each character of a line until next line
            while(readLine.hasNextLine()) {

                //add info of each line into a map
                infoPerEmployee.put("lastName", readLine.next());
                infoPerEmployee.put("firstName", readLine.next());
                infoPerEmployee.put("salary", readLine.next());
            }
            fileList.add(infoPerEmployee);
        }
        return fileList;
    }
}
