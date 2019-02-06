package com.inc.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		//실습 
		//1. Person을 저장할 수 있는 Persons라는 이름의 ArrayList를 선언하시오.
		//2. 사람이름에 해당하는 Person인스턴스를 생성하시오.
		//3. Persons에 생성한 세 사람을 추가하시오.
		//4. 모든 사람의 나이를 0으로 변경하시오.
		//5. 모든 사람의 이름과 나이를 출력하시오.
		//ex) 이름 : 철수, 나이 : 0 x 3
		
		List<Person> persons = new ArrayList<>();
		Person p1 = new Person(null, 0);
		p1.setName("이영섭");
		p1.setAge(29);
		Person p2 = new Person(null, 0);
		p2.setName("서지혜");
		p2.setAge(29);
		Person p3 = new Person(null, 0);
		p3.setName("김소미");
		p3.setAge(30);
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		for (int i = 0; i < persons.size(); i++) {
			persons.get(i).setAge(0);
		}
		
		/*for (Person p : persons) {
			p.setAge(0);
		}*/
		
		for (Person p : persons) {
			System.out.printf("이름 : %s, 나이 : %d\n", p.getName(), p.getAge());
		}
		


	}

}
