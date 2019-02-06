package com.inc.map;

import java.util.Map;
import java.util.HashMap;

public class HashMapEx5 {

	public static void main(String[] args) {
	
		Map<String, Object> yoon = new HashMap<>();
		yoon.put("name", "윤성빈");
		yoon.put("age", 25);
		yoon.put("job", "스켈레톤 국가대표");
		
		for(String key : yoon.keySet()) {
			System.out.println(key);
		}
		
		for(Object obj : yoon.values()) {
			System.out.println(obj);
		}
	
	}
}

