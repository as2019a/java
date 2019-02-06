package com.inc.assignment;

import java.util.HashMap;
import java.util.Map;

public class Student {
	//이름 
	private String name;
	//성적 kor-국어, math-수학, eng-영어
	private Map<String, Integer> scores = new HashMap<>();
	public Student(String name, int kor, int math, int eng) {
		this.name = name;
		scores.put("kor", kor);
		scores.put("math", math);
		scores.put("eng", eng);
	}
	
	public String getName() {
		return name;
	}
	public Map<String, Integer> getScores() {
		return scores;
	}
	
	
}
