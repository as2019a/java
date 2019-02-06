package com.inc.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BuffedInputStreamEx1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("memo.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			String str = "";
			while(bis.available() > 0) {
				str += (char)bis.read();
			}
			System.out.println(str);
			bis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
