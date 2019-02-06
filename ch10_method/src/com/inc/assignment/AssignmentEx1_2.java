package com.inc.assignment;

import java.util.Scanner;

import javax.swing.Spring;

public class AssignmentEx1_2 {
	
	//과제 : AssignmentEx1.java를 리펙토링하시오.
	//1.3가지의 기능 중 어떤기능을 새로만들 메소드로 옮길것인가를 결정하시오.
	//2.새로운 메소드 ramenMachine이라는 메소드를 선언하시오.(파라미터, 리턴자료형 결정)
	//3.1에서 결정한 기능을 옮기시오.
	//4.프로그램이 잘 동작하는지 테스트하시오.(리펙토링 전, 후 기능이 동일 해야함)
	
	//hint1 : ramenMachine은 기능2를 담당하는 것이 적절하다.
	//hint2 : ramenMachine은 파라미터로 int를 받고 String을 리턴하는게 적절하다.

	public static void main(String[] args) {
		//역할1
		Scanner scanner = new Scanner(System.in);
		System.out.println("돈을 넣어주세요");
		int money = scanner.nextInt();
		
		//역할2
		String result = ramenMachine(money);
		
		//역할3
		System.out.println(ramenMachine(money));
		scanner.close();
	}
	
	public static String ramenMachine(int money) {
		String result = "";
		if(money == 1000) {
			System.out.println("라면을 조리중입니다.");
			result = "맛있는 라면";
			
		}else{
			System.out.println("자판기 : 돈이 정확하지 않습니다.");
			result = money+"";
		}
		return result;
	}
	
}
