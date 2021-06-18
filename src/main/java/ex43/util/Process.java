package ex43.util;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Process {
    public static String FILES_PATH = "src/main/java/ex43/files";

    public static void process(Map<String, String> websiteData) throws IOException {
        String name = websiteData.get("name");
        String author = websiteData.get("author");
        boolean createJsFolder = websiteData.get("wantJavascriptFolder").equals("y");
        boolean createCssFolder = websiteData.get("wantCSSFolder").equals("y");

        String htmlFileContent = Html.generateHtml(name, author);

        String basePath = new File(FILES_PATH).getAbsolutePath();
        String websitePath = basePath +  "/" + name;
        String htmlFilePath = websitePath + "/index.html";
        String jsPath = websitePath + "/" + "js";
        String cssPath = websitePath + "/" + "css";

        Files.createFolder(websitePath);
        System.out.println("Created ./" + name);

        Files.writeHtmlFile(htmlFileContent, htmlFilePath);

        if (createJsFolder) {
            Files.createFolder(jsPath);
            System.out.println("Created ./" + name + "/js/");
        }

        if (createCssFolder) {
            Files.createFolder(cssPath);
            System.out.println("Created ./" + name + "/css/");
        }


    }

}
