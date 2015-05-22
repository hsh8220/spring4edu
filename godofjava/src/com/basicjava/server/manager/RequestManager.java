package com.basicjava.server.manager;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.Socket;

import com.basicjava.server.dto.RequestDTO;

public class RequestManager {
	
	Socket socket = null;
	private final int BUFFER_SIZE = 2048;
	public RequestManager (Socket socket) {
		this.socket = socket;
	}
	public RequestDTO readRequest() {
		RequestDTO dto = new RequestDTO();
		try {
			InputStream request = new BufferedInputStream(socket.getInputStream());
			byte[] receivedBytes = new byte[BUFFER_SIZE];
			request.read(receivedBytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
}
