package ex43.util;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProcessTest {
    static String FILES_PATH = new File("src/main/java/ex43/files").getAbsolutePath();
    static String[] FOLDERS = new String[4];

    private String generateRandomFolderName() {
        return "mywebsite" + new Date().getTime();
    }

    private boolean verifyFolders(String name, boolean js, boolean css) {
        String websitePath = FILES_PATH + "/" + name;

        File websiteFolder = new File(websitePath);
        File cssFolder = new File(websitePath + "/css");
        File jsFolder = new File(websitePath + "/js");

        if (css && !cssFolder.exists() && !cssFolder.isDirectory()) {
            return  false;
        }

        if (js && !jsFolder.exists() && !jsFolder.isDirectory()) {
            return  false;
        }

        return  websiteFolder.exists() && websiteFolder.isDirectory();
    }


    static boolean deleteDirectory(File directoryToBeDeleted) {
        File[] allContents = directoryToBeDeleted.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        return directoryToBeDeleted.delete();
    }

    @AfterAll
    static void afterAll() {
        for (String name : FOLDERS) {
            File websiteFolder = new File(FILES_PATH + "/" + name);
            deleteDirectory(websiteFolder);
        }
    }

    @Test
    void process() throws IOException {
        Map<String, String> data = new HashMap<>();

        FOLDERS[0] = this.generateRandomFolderName();
        data.put("name", FOLDERS[0]);
        data.put("author", "Melissa Cabrera");
        data.put("wantJavascriptFolder", "y");
        data.put("wantCSSFolder", "y");
        Process.process(data);
        assertTrue(verifyFolders(data.get("name"), true, true));

        FOLDERS[1] = this.generateRandomFolderName();
        data.put("name", FOLDERS[1]);
        data.put("wantCSSFolder", "y");
        data.put("wantJavascriptFolder", "n");
        Process.process(data);
        assertTrue(verifyFolders(data.get("name"), false, true));

        FOLDERS[2] = this.generateRandomFolderName();
        data.put("name", FOLDERS[2]);
        data.put("wantCSSFolder", "n");
        data.put("wantJavascriptFolder", "y");
        Process.process(data);
        assertTrue(verifyFolders(data.get("name"), true, false));

        FOLDERS[3] = this.generateRandomFolderName();
        data.put("name", FOLDERS[3]);
        data.put("wantCSSFolder", "n");
        data.put("wantJavascriptFolder", "n");
        Process.process(data);
        assertTrue(verifyFolders(data.get("name"), false, false));
    }
}