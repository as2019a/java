package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx1 {
	public static void main(String[] args) {
		//열차에 호차라는 개념이 추가되었다.
		//조건
		//1호차의 1열에는 스포츠스타 ex)박태환
		//1호차의 2열에는 가수 ex)윤종신
		//1호차의 3열에는 배우 ex)원빈
		//2호차의 1열에는 포유류 ex)고양이
		//2호차의 2열에는 어류 ex)고등어
		//2호차의 3열에는 조류 ex)독수리
		//2호차의 4열에는 파충류 ex)거북이
		//가 타고있다.
		//호차는 총2개, 열은 3 또는 4개, 알파벳은 4개(A~D)
		
		//위 조건을 만족하는 seats라는 3차원배열을
		//만들고 호차, 열, 알파벳을 차례대로 입력하면
		//해당 좌석에 앉아있는 객체의 이름을 출력하시오.
		//ex) 2, 3, A -> 독수리
		
		
		String[][][] seats = {
				{
					{"박태환","김연아","김지연","김은정"},
					{"윤종신","윤아","아이린","NS윤지"},
					{"원빈","강동원","현빈","이지현"}
				},
				
				{
					{"고양이","강아지","오리너구리","들개"},
					{"고등어","골뱅이","통쏠치","복어"},
					{"독수리","타조","공작","칼새"},
					{"거북이","악어거북","늑대거북","자라"}
				}
		};

		Scanner scanner = new Scanner(System.in);
		System.out.println("호차를 입력해주세요");
		int h = scanner.nextInt();
		
		System.out.println("열을 입력해주세요");
		int line = scanner.nextInt();
		scanner = new Scanner(System.in);
		
		System.out.println("좌석을 입력해주세요");
		char alphabet = scanner.nextLine().charAt(0);
		System.out.printf("해당 좌석에는 %s님이 앉아 계십니다",seats[h-1][line-1][alphabet-65]);
		

		
	}
	
}
