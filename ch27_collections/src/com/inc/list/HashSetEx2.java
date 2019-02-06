package com.inc.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		Set<String> trainee = new HashSet<>();
		
		trainee.add("태연");
		trainee.add("서현");
		trainee.add("소연");
		trainee.add("수영");
		trainee.add("효연");
		trainee.add("윤아");
		trainee.add("김도연");
		trainee.add("최유정");
		
		//foreach가 나오기 전
		Iterator<String> it = trainee.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //꺼내오는 작업
		}
		System.out.println("-------------------");
		for(Iterator<String> it2 = trainee.iterator();it2.hasNext();) {
			System.out.println(it2.next());
		}
		System.out.println("-------------------");
		for(String name : trainee) {
			System.out.println(name);
		}
		
		
	}

}
