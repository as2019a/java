package com.inc.chat.v03;

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
		
		socket.connect(new InetSocketAddress("192.168.0.10", 5001));
		
		DataOutputStream dos = 
				new DataOutputStream(socket.getOutputStream());
		while(true) {
			System.out.println("메세지를 입력해 주세요(종료:XX)");
			String msg = scanner.nextLine();
			if("XX".equals(msg)) {
				break;
			}
			dos.writeUTF("LYS"+msg);
			dos.flush();
		}
		
		socket.close();
	}

}
