package com.inc.chat.v02;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerFrame {

	public static void main(String[] args) throws IOException {
		//서버소켓
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.10", 5001));
		List<Socket> socketList = new ArrayList<>();
		while(true) {
		Socket socket = serverSocket.accept();
		socketList.add(socket);
		System.out.println("Link with client : " + socket.getRemoteSocketAddress());
		}

	}

}
