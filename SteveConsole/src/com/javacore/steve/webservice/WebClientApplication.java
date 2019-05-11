package com.javacore.steve.webservice;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public enum WebClientApplication {
    INSTANCE;

    public static final int PORT = 6703;
    public static final String APP_NAME = "Web Client Service";

    public void start() throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 10);
        server.createContext("/pages/", new HtmlHandler());
        server.createContext("/css/", new CssHandler());
        server.start();
        String message = String.format("");
    }
}
