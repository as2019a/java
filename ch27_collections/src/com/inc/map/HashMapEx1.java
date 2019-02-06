package com.inc.map;

import java.util.HashMap;
import java.util.Map;

import com.inc.list.Person;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Person> members = new HashMap<>();
		System.out.println(members.isEmpty());
		System.out.println(members.size());
		
	
		members.put("kim", new Person("철수", 10));
		members.put("lee", new Person("민수", 11));
		members.put("son", new Person("손연재", 20));
		members.put("kim", new Person("영희", 12));
		
		members.get("kim");
		System.out.println(members.get("kim").getName());
		
		Person minsu = members.get("lee");
		System.out.println(minsu.getAge());
	}
}
