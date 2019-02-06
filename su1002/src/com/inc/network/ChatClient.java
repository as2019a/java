package com.inc.network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ChatClient {
	
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket();
		socket.connect(new InetSocketAddress("localhost", 5001));
		System.out.println("Link with Server");
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF("안녕하세요");
		dos.close();
	}

}
