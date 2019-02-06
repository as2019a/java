package com.inc.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TreeMap {

	public static void main(String[] args) {
		Map<String, String> singers = new HashMap<>();
		singers.put("kim", "김범수");
		singers.put("lee", "이효리");
		singers.put("yoon", "윤종신");
		
		Map treeSingers = new LinkedHashMap<>(singers);
		System.out.println(treeSingers);
	}

}
