package ex41.util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessingTest {

    @Test
    void readFilesNames() {
    }

    @Test
    char sortNames(List<String> names) {

        names.add("Johnson, Bob");
        names.add("Lincoln, Abraham");
        names.add("Jones, Christopher");


        assertEquals("Johnson, Bob\nJones, Christopher\nLincoln, Abraham", sortNames(names));
        return 0;
    }

    @Test
    void outputFiles() {
    }
}