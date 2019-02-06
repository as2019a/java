package com.inc.reader.v5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Reader reader = new Reader();	
		reader.read("memo1.java");
	}
}
