package ex43.util;

import java.util.Scanner;

public class UsrInput {

    static public String readUsrInput(String question) {
        Scanner input = new Scanner(System.in);

        System.out.print(question);
        return input.nextLine();
    }
}
