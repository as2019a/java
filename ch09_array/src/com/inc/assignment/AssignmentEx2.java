package com.inc.assignment;

public class AssignmentEx2 {
	public static void main(String[] args) {
		//Assignment1에서 만든 seats라는 배열에 담긴
		//모든 승객을 차례대로 출력하는 3중 for문을 만드시오.
		//ex) 박태환
		//    김연아
		//조건 : 일반 for문버전, 개선된 for문버전 두가지로 만드시오.
	
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
					System.out.printf("%s\n",seats[i][j][k]);
				}
				System.out.println();
			}
			
		System.out.println("-----------------------");
		//for(String[][] i : j) {}
		//for(String[][] j : k) {}
		//for(String[][] name : j) {}
		}
		
	}
}
