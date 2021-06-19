/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Melissa Cabrera

Exercise 44 - Product Search

Pulling data from a file into a complex data structure makes parsing much simpler. Many programming languages support
the JSON format, a popular way of representing data.

Create a program that takes a product name as input and retrieves the current price and quantity for that product.
The product data is in a data file in the JSON format and looks like this:

Print out the product name, price, and quantity if the product is found.
If no product matches the search, state that no product was found and start over.


Constraints
- The file is in the JSON format. Use a JSON parser to pull the values out of the file.
- If no record is found, prompt again.
 */

package ex44;

import ex44.util.Process;
import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        Process.process();
    }

}
