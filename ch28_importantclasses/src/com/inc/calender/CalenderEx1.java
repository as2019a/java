package com.inc.calender;

import java.util.Calendar;

public class CalenderEx1 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getInstance());
		System.out.println(c.get(Calendar.YEAR) + "년");
		System.out.println(c.get(Calendar.MONDAY) + "월"); //월
		System.out.println(c.get(Calendar.DATE) + "일"); //일
		System.out.println(c.get(Calendar.HOUR) + "시"); //시
		System.out.println(c.get(Calendar.MINUTE) + "분"); //분
		System.out.println(c.get(Calendar.SECOND) + "초"); //초
		System.out.println(c.get(Calendar.MILLISECOND) + "밀리초"); //밀리초
		
		//요일 1-일요일, 7-토요일
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
	}

}
