package com.inc.chat.v04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientFrame {

	public static void main(String[] args) throws IOException {
		//소켓통신
		Socket socket = new Socket();
		Scanner scanner = new Scanner(System.in);	
		
		socket.connect(new InetSocketAddress("192.168.0.10",5001));
		
		//서버로부터 응답을 받아 화면에 출력할 스레드
		new Thread() {
			@Override
			public void run() {
				DataInputStream dis;
				try {
					dis = new DataInputStream(socket.getInputStream());
					while(true) {
						System.out.println(dis.readUTF());
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}.start();
		
		DataOutputStream dos = 
				new DataOutputStream(socket.getOutputStream());
		while(true) {
			System.out.println("메세지를 입력해 주세요(종료:XX)");
			String msg = scanner.nextLine();
			if("XX".equals(msg)) {
				break;
			}
			dos.writeUTF("강사:"+msg);
			dos.flush();
		}
		
		socket.close();
	}

}
