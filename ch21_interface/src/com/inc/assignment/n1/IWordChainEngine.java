package com.inc.assignment.n1;

public interface IWordChainEngine {
	//0->성공, 1->중복, 2->부적절
	int check(String word, int turn);
}
