package ex46.util;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ProcessTest {

    @Test
    void process() throws FileNotFoundException {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        HashMap<String, Integer> expectedData = new HashMap<>();
        expectedData.put("badger", 7);
        expectedData.put("mushroom", 2);
        expectedData.put("snake", 1);

        Process.process();

        String consoleOutput = outContent.toString();
        String[] lines = consoleOutput.trim().split("\n");

        System.setOut(originalOut);

        for (String line : lines) {
            String[] data = line.trim().replaceAll("\s+", "").split(":");

            String name = data[0];
            int n = data[1].length();

            assertEquals(expectedData.get(name), n);
        }
    }
}