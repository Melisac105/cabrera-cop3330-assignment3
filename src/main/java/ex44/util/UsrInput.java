package ex44.util;

import java.util.Scanner;

public class UsrInput {

    static public String getProductName() {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the product name? ");
        String productName = input.nextLine();

        return productName;
    }

}
