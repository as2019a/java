package com.inc.memo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MemoReader {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String title = "";
		File file = null;
		while(true) {
			System.out.println("제목을 입력해 주세요");
			title = scanner.nextLine();
			file = new File(title+".txt");
			if(file.exists()) {
				break;
			}
			System.out.println("존재하지 않는 파일입니다. 다시 입력해 주세요. ");
		}
		
		FileReader fis = new FileReader(file);
		BufferedReader br = new BufferedReader(fis);
		String line = "";
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
	}

}
