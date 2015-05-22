package com.basicjava.server;

import java.net.ServerSocket;
import java.net.Socket;

import com.basicjava.server.handler.RequestHandler;

public class SimpleWebServer {

	public static void main(String[] args) {
		SimpleWebServer server = new SimpleWebServer();
		int port = 9000;
		server.run(port);
	}
	
	public void run(int port) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
			while(true) {
				Socket socket = server.accept();
				RequestHandler handler = new RequestHandler(socket);
				handler.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(server!=null) {
				try{
					server.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}
}