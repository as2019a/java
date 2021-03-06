package com.inc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set<Integer> lottoNumbers = new HashSet<>();
		lottoNumbers.add(30);
		lottoNumbers.add(15);
		lottoNumbers.add(45);
		lottoNumbers.add(27);
		lottoNumbers.add(30);
		
		Iterator<Integer> iterator = lottoNumbers.iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		
		for(int number : lottoNumbers) {
			System.out.println(number);
		}
	}

}






