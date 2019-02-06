package com.inc.bluemarble;

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
		serverSocket.bind(new InetSocketAddress("192.168.0.13", 5001));
		System.out.println("Server Running at 192.168.0.13:5001");
		List<ObjectOutputStream> oosList = new ArrayList<>();

		while (true) {
			Socket socket = serverSocket.accept();
			System.out.println("Link with Client : " + socket.getRemoteSocketAddress());

			new Thread() {
				private void sendToAll(Message message) throws IOException {
					for (ObjectOutputStream oos : oosList) {
						oos.writeObject(message);
					}
				}

				@Override
				public void run() {
					ObjectInputStream ois;
					ObjectOutputStream os;
					try {
						os = new ObjectOutputStream(socket.getOutputStream());
						ois = new ObjectInputStream(socket.getInputStream());
						oosList.add(os);
						while (true) {
							Message message = (Message) ois.readObject();
							if (message.getType() == Message.EXIT) {
								System.out.println("logout Client :" + socket.getRemoteSocketAddress());
								// 종료를 하려는 클라이언트
								os.writeObject(message);
								ois.close();
								socket.close();

								// 남아있는 클라이언트
								oosList.remove(os);
								message.setMsg("님이 나가셨습니다.");
								message.setType(Message.SEND);
								sendToAll(message);
								return;
							}
							sendToAll(message);
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
