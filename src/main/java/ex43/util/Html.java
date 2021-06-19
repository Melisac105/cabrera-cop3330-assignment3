package ex43.util;

public class Html {

    public static String generateHtml(String name, String author) {
        //html format
        return """
                <!DOCTYPE html>
                <html>
                    <head>
                        <title>%s</title>
                        <meta name="author" content="%s" />
                    </head>
                    <body>
                        <h1>Hello world!</h1>
                    </body>
                </html>
                """.formatted(name, author);
    }

}
