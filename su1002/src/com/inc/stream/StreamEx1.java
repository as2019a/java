package com.inc.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamEx1 {

	public static void main(String[] args) throws IOException {
		String msg = new Scanner(System.in).nextLine();
		FileOutputStream fos = new FileOutputStream("test.txt");
		byte[] strToByte = msg.getBytes();
		for(byte b : strToByte) {
			fos.write(b);
		}
		fos.close();
	}

}
