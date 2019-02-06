package com.inc.assignment;

public interface IWordChainEngine {
	boolean correct(String word, String startWord, int turn);
	boolean sameCheck(String word, String stratWord);
	void saveWord();
}
