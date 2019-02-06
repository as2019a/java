package com.inc.file;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		File memo = new File("src/com/inc/file/text.txt");
		File memo2 = new File("src/com/inc/file/text2.txt");
		
		File jdk = new File(
				"c:/increpas/java/util","jdk-8u181-windows-x64.exe");
		
		//exist
		System.out.println(memo.exists());
		System.out.println(memo2.exists());
		System.out.println(jdk.exists());
		
		//절대경로
		System.out.println(memo.getAbsolutePath()); 
		System.out.println(memo2.getAbsolutePath());
		
		//폴더
		File inc = new File("src/com/inc");
		System.out.println(inc.exists());
		System.out.println(inc.isDirectory());
		System.out.println(inc.isFile());
		
	}

}







