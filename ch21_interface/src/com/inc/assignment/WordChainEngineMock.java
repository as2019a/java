package com.inc.assignment;

public class WordChainEngineMock implements IWordChainEngine {

	@Override
	public boolean correct(String word, String startWord, int turn) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean sameCheck(String word, String startWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void saveWord() {
		// TODO Auto-generated method stub
		
	}
	//가짜 WordChainEngine클래스
}
