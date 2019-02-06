package com.inc.box.v3;

import com.inc.person.v1.Person;

public class Box<E> {
	private Object[] elements;
	
	public Box(int size) {
		try {
			//배열 생성시 타입을 generic으로 할 수 없음.
			elements = new Object[size];
		}catch(NegativeArraySizeException e) {
			System.out.println("잘못된 사이즈 입니다.");
			elements = new Object[10];
		}
	}
	
	public void add(E element) {
		for(int i = 0; i < elements.length; i++) {
			if(elements[i] == null) {
				elements[i] = element;
				return;
			}
		}
	}
	
	public Object get(int index) {
		//예외처리 - 예외가 발생했을 경우 null 리턴
		try {
			return (E)elements[index];
		}catch(ArrayIndexOutOfBoundsException e) {
			return null;
		}	
		
	}
	
	public int size() {
		return elements.length;
	}
}
