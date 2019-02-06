package com.inc.chat.v04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerFrame {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.10", 5001));
		System.out.println("Server running at 192.168.0.10 : 5001");
		List<Socket> socketList = new ArrayList<>();
		while(true) {
			Socket socket = serverSocket.accept();
			socketList.add(socket);
			System.out.println(
					"Link with client : " + socket.getRemoteSocketAddress());
			new Thread() {
				@Override
				public void run() {
					DataInputStream dis;
					try {
						dis = new DataInputStream(socket.getInputStream());
						while(true) {
							//System.out.println(dis.readUTF());
							String msg = dis.readUTF();
							for(Socket s : socketList) {
								DataOutputStream dos = 
										new DataOutputStream(s.getOutputStream());
								dos.writeUTF(msg);
								dos.flush();
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			}.start();
			
		}
		
	}

}





