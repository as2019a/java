package com.inc.assignment;

public class ChallengeEx2 {
	public static void main(String[] args) {
		//도전2 : 아래와 같은 형태의 별을 출력해 보세요.
		//조건 : 한개의 for문만 이용
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		boolean check = true;
		for(int i = 0; i > -1;) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i == 4) {
				check = false;
			}
			
			if(check) {
				i++;
			}else {
				i--;
			}
				
		}
		
		
	}
}
