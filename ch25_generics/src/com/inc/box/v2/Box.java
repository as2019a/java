package com.inc.box.v2;

import com.inc.person.v1.Person;

public class Box {
	private Object[] elements;
	
	public Box(int size) {
		try {
			elements = new Object[size];
		}catch(NegativeArraySizeException e) {
			System.out.println("잘못된 사이즈 입니다.");
			elements = new String[10];
		}
	}
	
	public void add(Object element) {
		for(int i = 0; i < elements.length; i++) {
			if(elements[i] == null) {
				elements[i] = element;
			}
		}
	}
	
	public Object get(int index) {
		//예외처리 - 예외가 발생했을 경우 null 리턴
		try {
			return elements[index];
		}catch(ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}
}
