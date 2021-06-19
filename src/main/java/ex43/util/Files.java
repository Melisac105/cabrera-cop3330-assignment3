package ex43.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files {

    static void createFolder(String path) {
        //create new directory
        File dir = new File(path);

        if (!dir.exists()) {
            dir.mkdir();
        }
    }

    static void writeHtmlFile(String html, String path) throws IOException {
        //create file with given path
        FileWriter fileWriter = new FileWriter(path);
        //write html file
        fileWriter.write(html);
        //close writer file
        fileWriter.close();
    }

}
