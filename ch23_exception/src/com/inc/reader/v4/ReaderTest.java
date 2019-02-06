package com.inc.reader.v4;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderTest {

	public static void main(String[] args) {
		Reader reader = new Reader();
		try {
		reader.read("memo1.txt");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
