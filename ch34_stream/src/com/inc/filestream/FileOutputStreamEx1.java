package com.inc.filestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream(
																new File("memo.txt"));
		String str = "apple banana coconut durian";
		byte[] strToByte = str.getBytes();
		for(byte b : strToByte) {
			fos.write(b);
		}
	}

}








