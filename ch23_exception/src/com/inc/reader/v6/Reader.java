package com.inc.reader.v6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	public void read(String fileName){
		FileReader fReader = null;
		BufferedReader bReader = null;
		try {
			fReader = new FileReader(fileName);
			bReader = new BufferedReader(fReader);
			String input = bReader.readLine();
			System.out.println(input);
		}catch(FileNotFoundException e) {
			System.out.println("존재하지 않는 파일 이름입니다.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
			System.out.println("시스템오류입니다.");
		}finally {
			try {
				if(fReader != null) {
					fReader.close();
				}
				if(bReader != null) {
					bReader.close();
				}
			}catch(IOException e){
				System.out.println(e.getMessage());
				System.out.println("시스템오류입니다.");
			}
		}
	}
}
			