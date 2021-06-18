package ex43.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HtmlTest {

    @Test
    void generateHtml() {
        String name = "mywebsite";
        String author = "Melissa Cabrera";

        String generatedHtml = Html.generateHtml(name, author);
        String expectedHtml = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>mywebsite</title>\n" +
                "        <meta name=\"author\" content=\"Melissa Cabrera\" />\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h1>Hello world!</h1>\n" +
                "    </body>\n" +
                "</html>\n";

        assertEquals(expectedHtml, generatedHtml);
    }
}