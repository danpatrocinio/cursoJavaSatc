package main;

import java.io.IOException;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

@SuppressWarnings("restriction")
public class ServidorHttp {

	public static void main(String[] args) throws IllegalArgumentException, IOException {

		HttpServer server = HttpServerFactory.create("http://localhost:9090/");
		
		server.start();
	}

}
