package com.inc.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx1 {

	public static void main(String[] args) {
		File file = new File("src/com/inc/file/text.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			int i = 0;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}





