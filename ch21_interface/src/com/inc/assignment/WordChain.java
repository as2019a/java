package com.inc.assignment;

import java.util.Scanner;

public class WordChain {
	//1.게임을 실행
	//2.사용자로부터 입력을 받아 WordChainEngine을 사용해서 저장, 적절성 확인, 중복검사 진행
	//3.결과를 출력
	public static final Scanner scanner = new Scanner(System.in);
	final String player1 = "player1";
	final String player2 = "player2";
	IWordChainEngine engine = new WordChainEngineMock();
	String startWord = "레모나";
	String takeWord;
	int turn = 1;
	boolean playerSwitch;
	
	void gameInfo() {
		System.out.println("끝말잇기 게임");
		System.out.println("20턴이면 종료됩니다.");
		System.out.println("단어는 3글자로 입력해 주세요.");
		System.out.printf("시작 단어 : %s\n", startWord);
	}
	
	void takeWord() {
		if(playerSwitch == false) {
			System.out.printf("%s님 단어를 입력하세요.\n",player1);
			takeWord = scanner.nextLine();
			engine.correct(takeWord, startWord, turn);
			turn++;
			playerSwitch = true;
		}else {
			System.out.printf("%s님 단어를 입력하세요.\n",player2);
			takeWord = scanner.nextLine();
			engine.correct(takeWord, startWord, turn);
			turn++;
			playerSwitch = false;
		}
		
	}
	
	public void run() {
		gameInfo();
		takeWord();
	}
	
	
}
