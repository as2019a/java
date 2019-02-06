package com.inc.chat.v01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientFrame {

	public static void main(String[] args) throws IOException {
		//소켓통신
		Socket socket = new Socket();
		
		socket.connect(new InetSocketAddress( "192.168.0.10", 5001)); //ipconfig - 192.168.0.10

	}

}
