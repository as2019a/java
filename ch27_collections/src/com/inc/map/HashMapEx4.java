package com.inc.map;

import java.util.Map;
import java.util.HashMap;

public class HashMapEx4 {

	public static void main(String[] args) {
	
		Map<String, Object> yoon = new HashMap<>();
		yoon.put("name", "윤성빈");
		yoon.put("age", 25);
		yoon.put("job", "스켈레톤 국가대표");
		
		System.out.println(yoon);
		
		//김연아에 대한 데이터를 저장하는 HashMap을 선언하고 적절한 데이터를 저장해보세요.
		Map<String, Object> kim = new HashMap<>();
		kim.put("name", "김연아");
		kim.put("age", 29);
		kim.put("job", "전 피겨선수");
		
		System.out.println(kim);
		System.out.println(kim.get("name"));
		
	
	}
}

