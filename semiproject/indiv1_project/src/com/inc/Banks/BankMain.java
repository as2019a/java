package com.inc.Banks;

public class BankMain {

	public static void main(String[] args) {
		
		Bank bk1 = new Bank("여의도");
		Bank.interest = 0.2f;
		bk1.getInfo();
		
		System.out.println("-------------------------");
		
		Bank bk2 =new Bank("영등포");
		Bank.interest = 1.2f;
		bk2.getInfo();
		

	}

}
