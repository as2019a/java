package com.inc.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {

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
		
		Set<String> member = new HashSet<>();
		member.add("태연");
		member.add("서현");
		member.add("소연");
		member.add("효연");
		member.add("윤아");
		member.add("수지");
		
		//차집합
		//멤버가 되지 못한 연습생들 [수영, 김도연, 최유정]
		//trainee.removeAll(member); 
		
		//연습생 기간 없이 멤버가 된 사람 [수지]
		//member.removeAll(trainee); 
		
		//교집합
		//연습생이면서 멤버가 된 사람들 [서현, 효연, 윤아, 소연 ,태연]
		//member.retainAll(trainee);
		
		//합집합
		//[서현, 수지, 수영, 효연, 윤아, 김도연, 최유정, 소연, 태연]
		member.addAll(trainee);
		
	  System.out.println(member);
	}

}
