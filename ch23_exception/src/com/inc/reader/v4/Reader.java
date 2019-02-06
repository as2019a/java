package com.inc.reader.v4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	public void read(String fileName) throws FileNotFoundException, IOException {
		FileReader fReader = null;
		fReader = new FileReader(fileName);
		BufferedReader bReader = new BufferedReader(fReader);
		String input = bReader.readLine();
		System.out.println(input);
		
	}
}
