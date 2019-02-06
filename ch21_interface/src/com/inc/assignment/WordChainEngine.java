package com.inc.assignment;

import java.util.Scanner;

public class WordChainEngine implements IWordChainEngine{
	//1.입력한 단어를 저장
	//2.입력한 단어의 적절성 체크(입력받은 단어의 첫 단어 == 이전단어의 끝단어)
	//3.입력한 단어가 중복된 단어인지 체크
	
	//1.입력한 단어 저장
	String[] words = new String[20];
	char [] halls = new char [2];

	//2.적절성체크
	void correct() {
		
	}
	
	void saveArrays() {
		for(int i = 0; i < words.length; i++) {
			
		}
	}
   int size = words.length;
  
 void wins() {
	 for(int i=0; i<size; i++){
		 System.out.print("단어를 입력하세요. ");
	 }
	 for(int i=0; i<size; i++){
	    
		  System.out.println("단어: " +words[i]);
	 }
}
	
	//3.중복단어체크
  //중복검사
 void sameCheck(String word) {
	 for(int i = 0; i <= 20;i++) {
			if(words[i] == word) {
				i--;
				break;
			}
		}
 }

	@Override
	public boolean correct(String word, String startWord, int turn) {
		if(startWord == word) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean sameCheck(String word, String startWord) {
		halls[0] = startWord.charAt(2);
		halls[1] = word.charAt(0);
		if(halls[0] == halls[1]) {
			return true; 
		}else {
			return false;
		}
	}

	@Override
	public void saveWord() {
		for(int i = 0; i < words.length; i++) {
			words[i] = new String[words];
		}
	}
}