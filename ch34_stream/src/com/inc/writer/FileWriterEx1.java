package com.inc.writer;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {

	public static void main(String[] args) throws IOException {
		String cities = "서울 부산 대구 부산";
		
		FileWriter fos = new FileWriter("cities.txt");
		fos.write(cities);
		fos.close();

	}

}
