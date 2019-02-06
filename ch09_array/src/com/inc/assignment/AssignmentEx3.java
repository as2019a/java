package com.inc.assignment;

public class AssignmentEx3 {
	
	public static void main(String[] args) {
		//Assignment2에서 만든 반복문 중
			//일반 for문의 경우에는 다음과 같이
			//호차, 열, 알파벳 까지 함께 출력하도록
			//기능을 업그레이드 하시오.
			//ex) ...
			//    2호차 1열 A석 : 고양이
			//    2호차 2열 B석 : 강아지
			//    ...
		
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
		for(int i = 0; i < seats.length; i++) {
			for(int j = 0; j < seats[i].length; j++) {
				for(int k = 0; k < seats[i][j].length; k++) {
					System.out.printf("%d호차 %d열 %c석 : %s\n", i+1, j+1, k+65, seats[i][j][k]);
				}
				System.out.println();
		
		
			}
		}
	}
}
