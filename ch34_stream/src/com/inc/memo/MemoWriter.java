package com.inc.memo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemoWriter {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String title = "";
		while(true) {
			System.out.println("제목을 입력해주세요");
			title = scanner.nextLine();
			if(new File(title+".txt").exists() == false) {
				break;
			}
			System.out.println("이미 존재하는 파일 입니다");
		}
		
		System.out.println("내용을 입력해주세요");
		String content = scanner.nextLine();
		
		/*File file = new File(title+".txt");
		FileOutputStream fos = new FileOutputStream(file);
		for(Byte b : content.getBytes()) {
			fos.write(b);
		}*/
		
		FileWriter fw = new FileWriter("file");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();

	}

}
