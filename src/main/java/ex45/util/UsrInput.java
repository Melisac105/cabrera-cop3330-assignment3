package ex45.util;

import java.util.Scanner;

public class UsrInput {

    static public String getFileName() {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the file name? ");
        String fileName = input.nextLine();

        return fileName;
    }

}
