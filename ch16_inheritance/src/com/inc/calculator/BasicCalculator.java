package com.inc.calculator;

public class BasicCalculator {
	double memory1;
	double memory2;
	
	double sum() {
		return memory1 + memory2;
	}
	
	double sub() {
		return memory1 - memory2;
	}
	
	void SetMemory(int memory1, int memory2) {
		this.memory1 = memory1;
		this.memory2 = memory2;
	}
}
