package ex44.util;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class FilesTest {

    @Test
    void getFileContent() throws FileNotFoundException {
        String json = Files.getFileContent();
        String file = """
                {
                  "products": [
                    {
                      "name": "Widget",
                      "price": 25.00,
                      "quantity": 5
                    },
                    {
                      "name": "Thing",
                      "price": 15.00,
                      "quantity": 5
                    },
                    {
                      "name": "Doodad",
                      "price": 5.00,
                      "quantity": 10
                    }
                  ]
                }
                """.replaceAll("\n+", "");

        assertEquals(file, json);
    }

    @Test
    void parseJson() {
        String json = """
                {
                    "products": [
                        {
                            "name": "Name 1",
                            "price": 25.0,
                            "quantity": 10
                        }, 
                        {
                            "name": "Name 2",
                            "price": 45.0,
                            "quantity": 5
                        }
                    ]
                }
                """;

        Products products = Files.parseJson(json);

        assertEquals(2, products.getProducts().size());
        assertEquals("Name 1", products.getProducts().get(0).name);
        assertEquals(5, products.getProducts().get(1).quantity);
    }
}