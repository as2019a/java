package com.inc.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx4 {

	public static void main(String[] args) {
		List<String> seats = new ArrayList<>();
		seats.add("박태환");
		seats.add("김연아");
		seats.add("손연재");
		
		//리스트의 내용을 복사
		List<String> seatCopy = new ArrayList<>(seats);
		//리스트의 주소를 복사
		List<String> seatCopy2 = seats;
		
		
		seats.set(0,  null);
		System.out.println(seats.get(0));
		System.out.println(seatCopy.get(0));
		System.out.println(seatCopy2.get(0));
	}

}
