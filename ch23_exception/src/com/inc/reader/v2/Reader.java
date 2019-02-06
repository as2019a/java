package com.inc.reader.v2;

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
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		BufferedReader bReader = new BufferedReader(fReader);
		
		try {
		String input = bReader.readLine();
		System.out.println(input);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	  
	}
}
