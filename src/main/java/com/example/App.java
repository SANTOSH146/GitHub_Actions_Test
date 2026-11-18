package com.example;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class App {

    public static void main(String[] args) throws Exception {

        HttpServer server =
            HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/", exchange -> {

            String response = "Heyy Hi this is Santosh a enthusiastic devops engineer who lobve to build things end to end i love debugging things because that where i learn a lot. Thank you listening see you again";

            exchange.sendResponseHeaders(200, response.length());

            try (var output = exchange.getResponseBody()) {
                output.write(response.getBytes());
            }
        });

        server.start();

        System.out.println("Server started on port 8080");
    }
}