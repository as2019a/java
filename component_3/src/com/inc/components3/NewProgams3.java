package com.inc.components3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NewProgams3 {
	public static void main(String[] args){
		System.out.println("--- 텍스트 파일 샘플은 c:\\windows\\system.ini로 하였음.---\n");
		BufferedReader br = null;
		char b[] = new char[50];
		try {
			br = new BufferedReader(new FileReader("c:\\windows\\system.ini"),b.length);
			int numRead = 1; // 첫번째 while문 반복을 위한 값
			while (numRead > 0) {
				numRead = br.read(b, 0, b.length);
				if (numRead > 0) {
					String str = new String(b, 0, numRead); // 문자 배열로 문자열 객체 생성
					System.out.print(str.toUpperCase()); // 대문자 변환 후 출력
				}
			}
			if (br != null)
				br.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}
}
