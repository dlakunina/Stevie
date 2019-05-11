package com.javacore.steve.db;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class HtmlHandler implements HttpHandler {
    public static final String HTML_FORMAT = "^/pages/(([a-zA-Z]+\\.)(html))$";

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String path = httpExchange.getRequestURI().getPath();

        byte[] fileBytes = ("<html>\n" +
                "<head>\n" +
                "    <link rel = \"stylesheet\" type = \"text/css\" href=\"/css/main.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div> Hello the path is:" + path + "</div>\n" +
                "    <div> Criminal Profile for {{criminalName}}</div>\n" +
                "    <div>Number of Crimes: {{numberOfCrimes}}</div>\n" +
                "    <div>Current time </div>\n" +
                "\n" +
                "</body>\n" +
                "</html>" +
                ""
        ).getBytes();

        httpExchange.getResponseHeaders().put("Content-Type", Arrays.asList("text/html"));
        httpExchange.sendResponseHeaders(200, 0);
        OutputStream os = httpExchange.getResponseBody();
        if (fileBytes != null) {
            os.write(fileBytes);
        }
        os.close();
    }

}
