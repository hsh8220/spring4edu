package com.basicjava.server.manager;

import java.io.PrintStream;
import java.net.Socket;

import com.basicjava.server.dto.RequestDTO;

public class ResponseManager {
	
	Socket socket = null;
	RequestDTO dto = null;
	public ResponseManager (Socket socket, RequestDTO dto) {
		this.socket = socket;
		this.dto = dto;
	}
	
	public void writeResponse() {
		try {
			PrintStream response = new PrintStream(socket.getOutputStream());
			response.println("HTTP/1.1 200 OK");
			response.println("Coontent-type: text/html");
			response.println();
			response.print("It is working");
			response.flush();
			response.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
