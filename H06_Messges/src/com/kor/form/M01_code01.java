package com.kor.form;

import java.util.Scanner;

public class M01_code01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Main(메인)
		System.out.println("영화관 예절");
		
					System.out.println("1. 스포일러 하지마라");
					System.out.println("2. 다리 주체하지 마라");
					System.out.println("3. 핸드폰을 꺼라");
					System.out.println("4. 영화관은 식당이 아니다");
					System.out.println("5. 지방방송 꺼라");
					System.out.println("6. 자세를 반듯하게 하라");
					System.out.println("7. 들락날락 하지마라");
					System.out.println("8. 영화관은 숙박업소가 아니다");
					
		//영화관 예절 8개를 int[][] 배열 코드를 사용하여 1~8 숫자를 입력하면 해당 예절을 System에서
		//문구 띄울수 있는 프로그램코드를 짜서 입력하여 개발하시오(고급 컨텐츠 과제/아이디어 창출 제안			
					int [][] moive = {{"1","2","3","4","5","6","7,"8"}
							+ {"스포일러 하지마라","다리 주체하지 마라","핸드폰을 꺼라",
						       "영화관은 식당이 아니다","지방방송 꺼라","자세를 반듯하게 하라"
						       "들락날락 하지마라","영화관은 숙박업소가 아니다"}};
						       
					}
		
	      }
   }
