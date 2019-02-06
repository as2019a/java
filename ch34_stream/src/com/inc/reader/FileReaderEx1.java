package com.inc.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("today.txt");
		int i = 0;
		while((i = fr.read()) != -1) {
			System.out.print((char)i);
		}
		

	}

}
