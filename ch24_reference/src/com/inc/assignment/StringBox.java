package com.inc.assignment;

import javax.swing.text.html.ParagraphView;

public class StringBox {
	private String[] strings;
	public int newSize;
	public int size;
	private int index;
	private String[] stringsCopy;
	private String[] string;

	public StringBox() {
		strings = new String[10];
		this.size = 10;
	}

	public StringBox(int size) {
		strings = new String[size];
		this.size = size;
	}

	// 파라미터로 들어온 문자열을 가장 마지막 번지에 저장
	// 단, 공간이 부족하면 자동으로 사이즈 1증가
	public void add(String str) {
		/*for (int i = 0; i < strings.length; i++) {
			if (strings[i] == null) {
				strings[i] = str;
				return;
			}
		}*/
		if(index < size) {
			string[index] = str;
			index++;
		}else {
			String[] stringsCopy = strings;
			strings = new String[stringsCopy.length + 1];
			for(int i = 0; i < stringsCopy.length; i++) {
				strings[i] = stringsCopy[i];
			}
			 newSize++;
			 strings[strings.length - 1] = str;
		}

	}

	// 파라미터로 들어온 인덱스에 해당하는 값을 리턴
	public String get(int index) {
		// 예외처리 - ArrayIndexOutOfBoundsException
		return strings[index];
	}

	// 파라미터로 들어온 index에 해당하는 번지를 null로 변경
	public void remove(int index) {
		strings[index] = null;
	}

	// strings에 모든 인덱스를 null로 변경
	public void removeAll() {
		for (int i = 0; i < strings.length; i++) {
			strings[i] = null;
		}
	}

	// 해당인덱스에 값을 파라미터로 들어온 문자열로 변경
	public void update(int index, String str) {
		strings[index] = str;
	}

}
