package com.inc.reference;

public class ReferenceEx1 {

	public static void main(String[] args) {
		int p = 0;
		String r = "hello";
		
		//값 복사
		int pCopy = p;
		
		//주소 복사
		String rCopy = r;
		
		//값이 같은지 비교
		System.out.println(p == pCopy);
		
		//주소가 같은지 비교
		System.out.println(r == rCopy);
		
		//값 변경
		pCopy = 3;
		
		//주소 변경
		rCopy = "hi"; //객체를 문자로 표현
		
		System.out.println(p == pCopy);
		System.out.println(r == rCopy);
			
	}

}
