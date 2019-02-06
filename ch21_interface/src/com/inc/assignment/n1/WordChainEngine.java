package com.inc.assignment.n1;

public class WordChainEngine implements IWordChainEngine {
	String[] words = new String[100];
	
	@Override
	public int check(String word, int turn) {
		//turn이 0일때는 무조건 0을 리턴
		if(turn == 0) {
			words[turn] = word;
			return 0;
		}
		
		//이전 단어들과 중복여부
		for(int i = 0; i < turn; i++) {
			if(words[i].equals(word)) {
				return 1;
			}
		}
		
		//끝글자와 첫글자의 일치여부
		char start = word.charAt(0);
		String latest = words[turn-1];
		char end = latest.charAt(latest.length()-1);
		if(start != end) {
			return 2;
		}
		
		words[turn] = word;
		
		return 0;
	}
	//1.입력한 단어를 저장
	//2.입력한 단어의 적절성 체크(입력받은 단어의 첫 단어 == 이전단어의 끝단어)
	//3.입력한 단어가 중복된 단어인지 체크
}
