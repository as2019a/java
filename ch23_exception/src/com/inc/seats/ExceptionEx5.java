package com.inc.seats;

import java.util.Scanner;

public class ExceptionEx5 {
	public static void main(String[] args) {
		String[] seats = {"박태환","김연아","손연재","윤성빈"};
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("좌석을 입력해주세요(A~O)");
			char alphabet = scanner.nextLine().charAt(0);
			/*if(alphabet < 'A' || alphabet > 'D') {
				System.out.println("잘못된 좌석입니다 : " + alphabet);
				continue;
			}*/
			//기본적으로 uncheck예외는 개발자가 처리하지 않으면 프로그램이 종료되고 
			//JVM이 처리한다.(기본처리방식->에러코드가 사용자에게 노출)
			try {
				//try안쪽에는 예외가 발생 가능한 코드
				System.out.println(seats[alphabet-65] + "님 입니다.");
			}catch(ArrayIndexOutOfBoundsException e) {
				//catch안쪽에는 예외 처리 코드
				//개발자가 디버깅을 위해서 에러내용을 확인 할 때
				e.printStackTrace();
				//개발자는 예외가 발생 앴을 때를 대비해서 예외처리 코드를 작성해 준다.
				System.out.println("----------------------------------");
				//System.out.println("잘못된 좌석입니다 : " + alphabet);
				System.out.println(e.getMessage());
				System.out.println("-----------------------------------");
				System.out.println("잘못된 배열인덱스에 접근했습니다 : "+e.getMessage());
			}
			//개발자가 예외를 처리하게 되면 프로그램이 종료되지 않습니다. 
		}
		
	}
}
