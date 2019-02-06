package com.inc.assignment;

public class StringBoxTest {

	public static void main(String[] args) {
		StringBox box = new StringBox(5);
		box.add("1");
		box.add("2");
		box.remove(1);
		box.add("3");
		box.update(2, "three");
		box.add("4");
		box.add("5");
		box.add("6");
		box.add("7");
		box.add("8");
		box.add("9");
		box.add("10");
		box.add("11");
		
		for(int i = 0; i < box.newSize; i++) {
			System.out.println(box.get(i));
		}
	}

}
