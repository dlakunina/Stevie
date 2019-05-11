package com.javacore.steve.db;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class DBServer {
    public void start() throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(22222), 10);
        server.createContext("/pages/", new HtmlHandler());
        server.createContext("/css/", new CssHandler());
        server.start();
        String message = String.format("");
    }
}
