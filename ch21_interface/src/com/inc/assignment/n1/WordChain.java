package com.inc.assignment.n1;

import java.util.Scanner;

public class WordChain {
	//1.게임을 실행
	//2.사용자로부터 입력을 받아 WordChainEngine을 사용해서 저장, 적절성 확인, 중복검사 진행
	//3.결과를 출력
	
	private int turn = 0;
	private static final Scanner scanner = new Scanner(System.in);
	private IWordChainEngine engine = new WordChainEngine();
	
	public void run() {
		while(true) {
			System.out.println("다음 단어를 입력해 주세요");
			String word = scanner.nextLine();
			if(word.length() == 0) {
				continue;
			}
			int status = engine.check(word, turn);
			printResult(status);
		}
	}
	
	private void printResult(int status) {
		switch(status) {
			case 0 : turn++; break;
			case 1 : System.out.println("중복된 단어입니다."); break;
			case 2 : System.out.println(
           	"마지막 단어의 끝 글자와 입력한 단어의 첫글자가 일치하지 않습니다. ");
		}
	}
}










