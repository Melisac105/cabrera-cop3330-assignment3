package ex43.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files {

    static void createFolder(String path) {
        File dir = new File(path);

        if (!dir.exists()) {
            dir.mkdir();
        }
    }

    static void writeHtmlFile(String html, String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(html);
        fileWriter.close();
    }

}
