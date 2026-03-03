package com.example;

import com.sun.net.httpserver.HttpServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.OutputStream;
import java.net.InetSocketAddress;

public class DemoApp {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(DemoApp.class);

    public static final String STARTUP_MESSAGE =
            "Demo App Started Successfully";

    public static String getStartupMessage() {
        return STARTUP_MESSAGE;
    }

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/", exchange -> {
            String response = getStartupMessage();
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });

        server.setExecutor(null);
        server.start();

        LOGGER.info("HTTP Server started on port 8080");
    }
}
