package com.inc.reader.v3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	public void read(String fileName) {
		FileReader fReader = null;
		try {
			//FileReader 
			fReader = new FileReader(fileName);
			BufferedReader bReader = new BufferedReader(fReader);
			String input = bReader.readLine();
			System.out.println(input);
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());		
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	  
	}
}
