package ex42.util;

import java.util.ArrayList;
import java.util.Map;

public class PrintFile {

    static public void printTable(ArrayList<Map<String, String>> fileList) {

        System.out.print("Last\t\tFirst\t\tSalary\n");
        System.out.println("--------------------------------");

        for (Map<String, String> stringStringMap : fileList) {
            System.out.printf(
                    "%s\t%s\t\t%s\t\n",
                    stringStringMap.get("lastName"),
                    stringStringMap.get("firstName"),
                    stringStringMap.get("salary")
            );
        }
    }
}
