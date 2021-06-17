/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Melissa Cabrera

Exercise 42 - Parsing a Data File
Sometimes data comes in as a structured format that you have to break down and turn into records so you can process them. CSV, or comma-separated values, is a common standard for doing this.

Construct a program that reads in the following data file (you will need to create this data file yourself; name it `exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500
Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.

Example Output
Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500

Constraints
Write your own code to parse the data. Don't use a CSV parser.
 */

package ex42;

import ex42.util.PrintFile;
import ex42.util.ReadFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class App {

    static ArrayList<Map<String, String>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        list = ReadFile.readFilesNames();

        PrintFile.printTable(list);
    }
}
