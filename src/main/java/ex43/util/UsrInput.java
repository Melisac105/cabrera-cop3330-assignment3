package ex43.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsrInput {

    static  public Map<String, String> getWebsiteData() {
        Scanner input = new Scanner(System.in);
        Map<String, String> data = new HashMap<>();

        System.out.print("Site name: ");
        String name = input.nextLine();
        System.out.print("Author: ");
        String author = input.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        String wantJavascriptFolder = input.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        String wantCSSFolder = input.nextLine();

        if (wantJavascriptFolder.length() == 0) {
            wantJavascriptFolder = "n";
        }

        if (wantCSSFolder.length() == 0) {
            wantCSSFolder = "n";
        }

        data.put("name", name);
        data.put("author", author);
        data.put("wantJavascriptFolder", wantJavascriptFolder);
        data.put("wantCSSFolder", wantCSSFolder);

        return data;
    }
}
