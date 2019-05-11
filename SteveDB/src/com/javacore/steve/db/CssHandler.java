package com.javacore.steve.db;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class CssHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String path = httpExchange.getRequestURI().getPath();

        byte[] fileBytes = ("body {         background-color: darkseagreen;    }").getBytes();

        httpExchange.getResponseHeaders().put("Content-Type", Arrays.asList("text/css"));
        httpExchange.sendResponseHeaders(200, 0);
        OutputStream os = httpExchange.getResponseBody();
        if (fileBytes != null) {
            os.write(fileBytes);
        }
        os.close();
    }

}
