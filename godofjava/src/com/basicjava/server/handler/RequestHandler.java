package com.basicjava.server.handler;

import java.net.Socket;

import com.basicjava.server.manager.RequestManager;
import com.basicjava.server.manager.ResponseManager;

public class RequestHandler extends Thread{
	
	Socket socket = null;
	public RequestHandler (Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		RequestManager request = new RequestManager(socket);
		ResponseManager response = new ResponseManager(socket, request.readRequest());
		response.writeResponse();
	}
	
}
