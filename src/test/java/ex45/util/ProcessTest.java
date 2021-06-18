package ex45.util;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ProcessTest {

    static String FILES_PATH = new File("src/main/java/ex45/files").getAbsolutePath();

    @Test
    void process() throws IOException {
        String fileName = "test_result";

        // https://www.programmersought.com/article/43055551487/
        System.setIn(new ByteArrayInputStream(fileName.getBytes()));

        Process.process();

        File resultFile = new File(FILES_PATH + "/" + fileName + ".txt");
        assertTrue(resultFile.exists() && resultFile.isFile());

        resultFile.delete();
    }
}