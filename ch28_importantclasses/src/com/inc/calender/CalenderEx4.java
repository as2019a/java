package com.inc.calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderEx4 {

	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		System.out.println(c1.after(c2));
		System.out.println(c1.before(c2));
		
		c1.set(2018,  8, 7);
		//Calendar가 가지고 있는 날짜 데이터를 Date클래스로 변환
		Date d1 = c1.getTime();
		System.out.println(d1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("G  yyyy-MM-dd W a hh:mm:ss S E요일 z Z");
		String now = sdf.format(d1);
		System.out.println(now);
		
	}
}
