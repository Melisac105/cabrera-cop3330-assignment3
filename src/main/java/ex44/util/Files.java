package ex44.util;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {

    public static String getFileContent() throws FileNotFoundException {
        File inputFile = new File("src/main/java/ex44/files/excercise44_input.json");
        Scanner reader = new Scanner(inputFile);
        StringBuilder json = new StringBuilder();

        //read all file lines
        while (reader.hasNextLine()) {
            //add in json string
            json.append(reader.nextLine());
        }
        return json.toString();
    }

    public static Products parseJson(String json) {
        //convert products information into json representation
        return new Gson().fromJson(json, Products.class);
    }

}
