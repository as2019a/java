package com.inc.chat.v07;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerFrame {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.10", 5001));
		System.out.println("Server running at 192.168.0.10:5001");
		List<ObjectOutputStream> oosList = new ArrayList<>();
		
		while(true) {
			Socket socket = serverSocket.accept();
			System.out.println(
					"Link with client : " + socket.getRemoteSocketAddress());
			new Thread() {
				@Override
				public void run() {
					ObjectInputStream ois;
					ObjectOutputStream os;
					try {
						os = new ObjectOutputStream(socket.getOutputStream());
						ois = new ObjectInputStream(socket.getInputStream());
						oosList.add(os);
						while(true) {
							//System.out.println(dis.readUTF());
							Message message = (Message)ois.readObject();
							if(message.getType() == Message.EXIT) {
								oosList.remove(os);
								os.writeObject(message);
								ois.close();
								socket.close();
								return;
							}
							for(ObjectOutputStream oos : oosList) {
								oos.writeObject(message);
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					
				}
			}.start();
			
		}
		
	}

}





