package com.inc.calender;

import java.util.Calendar;

public class CalenderEx2 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, -3);
		System.out.println(c);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		//실습 : 두달 후의 오늘이 무슨요일인지 출력하시오.
		Calendar b = Calendar.getInstance();
		b.add(Calendar.MONTH, 2);
		switch(b.get(Calendar.DAY_OF_WEEK)) {
		case 1 : System.out.println("일요일"); break;
		case 2 : System.out.println("월요일"); break;
		case 3 : System.out.println("화요일"); break;
		case 4 : System.out.println("수요일"); break;
		case 5 : System.out.println("목요일"); break;
		case 6 : System.out.println("금요일"); break;
		case 7 : System.out.println("토요일"); break;
		}
		
		//실습 : 0001년 1월 1일의 요일을 구하시오.
		Calendar a = Calendar.getInstance();
		a.add(Calendar.YEAR, -2017);
		a.add(Calendar.MONTH, -8);
		a.add(Calendar.DATE, -6);
		
		//System.out.println(a.get(Calendar.YEAR));
		switch(a.get(Calendar.DAY_OF_WEEK)) {
		case 1 : System.out.println("일요일"); break;
		case 2 : System.out.println("월요일"); break;
		case 3 : System.out.println("화요일"); break;
		case 4 : System.out.println("수요일"); break;
		case 5 : System.out.println("목요일"); break;
		case 6 : System.out.println("금요일"); break;
		case 7 : System.out.println("토요일"); break;
		}
		
		
 	      System.out.println(a.get(Calendar.YEAR));
 	      System.out.println(a.get(Calendar.MONTH));
 	      System.out.println(a.get(Calendar.DATE));
	}
}
