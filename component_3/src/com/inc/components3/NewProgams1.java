package com.inc.components3;

import java.util.Scanner;

public class NewProgams1 {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in).useDelimiter("\\s|-"); // 공백 문자나 '-'을 구분자로 사용
		System.out.println("-을 포함한 주민번호를 입력하시오.");
		System.out.println("주민번호 앞 자리는" + a.next() + "입니다.");
		a.next(); // 뒷자리는 건너뜀
	}
}
