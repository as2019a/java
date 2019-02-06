package com.inc.assignment;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AssignmentEx2 {

	public static void main(String[] args) {
		//밑의 freshmen은 1학년을 저장하고 있는 맵이다
		//key - 반이름(firstClass, secondClass ...)
		//value - 학생리스트
		Map<String, List<Student>> freshmen = new LinkedHashMap<>();
		
		//1.freshMen이라는 맵에 1반부터 3반까지 적절한 데이터를 저장하시오
		//2.1학년의 모든 학생의 이름과 점수를 출력하는 반복문을 작성하시오
		//출력 예시)
		//반이름 : firstClass
		//학생이름 : 철수
		//국어	수학	영어
		//59	76	34
		//...
		
		List<Student> firstClass = new ArrayList<>();
		Student f1 = new Student("철수", 59, 76, 34);		
		Student f2 = new Student("민수", 45, 67, 86);		
		Student f3 = new Student("영희", 65, 56, 44);
		
		firstClass.add(f1);
		firstClass.add(f2);
		firstClass.add(f3);
		
		List<Student> secedClass = new ArrayList<>();
		Student s1 = new Student("이지혜", 100, 85, 60);
		Student s2 = new Student("박혜나", 95, 65, 90);
		Student s3 = new Student("박소연", 70, 85, 60);
		
		secedClass.add(s1);
		secedClass.add(s2);
		secedClass.add(s3);
		
		List<Student> thirdClass = new ArrayList<>();
		Student t1 = new Student("주은영", 80, 55, 100);
		Student t2 = new Student("배지현", 100, 90, 75);
		Student t3 = new Student("이지영", 69, 75, 93);
		
		thirdClass.add(t1);
		thirdClass.add(t2);
		thirdClass.add(t3);
		
		freshmen.put("firstClass",firstClass);
		freshmen.put("firstClass",secedClass);
		freshmen.put("firstClass",thirdClass);
		
		for(String key : freshmen.keySet()) {
			System.out.println("반이름 : "+ key);
			for(Student s : freshmen.get(key)) {
				System.out.println("학생이름 : " + s.getName());
				System.out.println("국어  수학  영어");
				System.out.print(s.getScores().get("kor")+"\t"); 
				System.out.print(s.getScores().get("math")+"\t"); 
				System.out.print(s.getScores().get("eng")+"\n");
		}
		}
		
	}

}
