package com.inc.block;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.10", 5001));
		System.out.println("Server running at localhost:5001");
		List<ObjectOutputStream> oosList = new ArrayList<>();
		while(true) {
			Socket socket = serverSocket.accept();
			System.out.println("Link with client : " + socket.getRemoteSocketAddress());
			new Thread(()->{
				try {
					ObjectOutputStream oos = 
							new ObjectOutputStream(socket.getOutputStream());
					ObjectInputStream ois =
							new ObjectInputStream(socket.getInputStream());
					oosList.add(oos);
					while(true) {
						Block block = (Block)ois.readObject();
						for(ObjectOutputStream os : oosList) {
							os.writeObject(block);
							os.reset();
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				
			}).start();
		}
	}
	
	public static void a() {}
 
}










