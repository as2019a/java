package com.inc.calender;

import java.util.Calendar;

public class CalenderEx3 {

	public static void main(String[] args) {
		Calendar worldCup  = Calendar.getInstance();
		worldCup.set(Calendar.YEAR, 2002);
		worldCup.set(Calendar.MONTH, 4);
		worldCup.set(Calendar.DATE, 31);
		System.out.println(worldCup.get(Calendar.DAY_OF_WEEK));
		
		Calendar startDay = Calendar.getInstance();
		startDay.set(2018, 7, 17, 9, 30, 0); // -1
		System.out.println(startDay.get(Calendar.DAY_OF_WEEK));
		
	}
}
