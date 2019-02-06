package com.inc.stirng;

public class StringEx7 {

	public static void main(String[] args) {
		String phomember = "010-6401-5113";
		String[] numbers = phomember.split("-");
		for(String number : numbers) {
			System.out.println(number);
		}
		
		String email = "apple@apple.com";
		String [] strArr = email.split("@",2);
		String id = strArr[0];
		System.out.println(id);
		/*String domain = strArr[1];
		System.out.println(domain);*/
		
		String date = "2018/09/07"; //2018-09-07
		String replaceDate = date.replace('/', '-');
		System.out.println(replaceDate);
		
		String replacedDate2 = date.replace("/",""); //20180907
		System.out.println(replacedDate2);
		
		//실습 : 180907 출력 replace + substring 사용
		System.out.println(date.replace("/", "").substring(2));
		
	}
}