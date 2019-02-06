package com.inc.assignment;

import java.util.ArrayList;
import java.util.List;

public class AssignmentEx1 {

	public static void main(String[] args) {
		//1.Student클래스를 분석하시오
		//2.철수(59, 76, 34), 민수(45,67, 86), 영희(65, 56, 44)라는 student를 생성하시오
		//3.철수, 민수, 영희를 firstClass라는 ArrayList에 저장하시오
		//firstClass에 존재하는 학생들의 이름 및 점수를 출력하시오.
		//출력 예시)
		//학생이름 : 철수
		//국어	수학		영어
		//59		76		34
		//...
		
		List<Student> firstClass = new ArrayList<>();
		Student s1 = new Student("철수", 59, 76, 34);		
		Student s2 = new Student("민수", 45, 67, 86);		
		Student s3 = new Student("영희", 65, 56, 44);
		
		firstClass.add(s1);
		firstClass.add(s2);
		firstClass.add(s3);
		
		for(Student s : firstClass) {
			System.out.println("학생이름 : " + s.getName());
			System.out.println("국어\t수학\t 영어");
			System.out.print(s.getScores().get("kor")+"\t"); 
			System.out.print(s.getScores().get("math")+"\t"); 
			System.out.print(s.getScores().get("eng")+"\n");
			/*for(int i : s.getScores().values()) {
				System.out.println(i+"\t");
			}
			System.out.println();*/
			
 		}
		
		
		
		
		
	}

}
