package com.inc.example;

public final class LogicalEx1 {

	public static void main(String[] args) {
		//논리 연산자 (->)
		//&&(and) : 좌항과 우항이 true이면 true, 하나라도 false이면 false
		//||(or) : 좌항과 우항중 하나라도 true이면 true
		//! : 오른쪽에 true이면 fasle, false이면 true
		
		boolean and1=true&&true;
		boolean and2=false&&true;
		boolean and3=true&&false;
		boolean and4=false&&false;
		System.out.println(and1);
		System.out.println(and2);
		System.out.println(and3);
		System.out.println(and4);
		
		System.out.println("-----------------");
		
		boolean or1=true||true;
		boolean or2=false||true;
		boolean or3=true||false;
		boolean or4=false||false;
		System.out.println(or1);
		System.out.println(or2);
		System.out.println(or3);
		System.out.println(or4);
		
		System.out.println(true&&true&&false);
		System.out.println(false||false||true);
		
		System.out.println("-----------------");
		System.out.println(!true);
		System.out.println(!false);
		
		//실습 : 결과를 예측해 보세요 
		System.out.println(true&&true&&!true&&true);
		System.out.println(false||false||!false||true);
		
		//&&와 ||가 섞여있다면? &&먼저 계산후 || 계산
		System.out.println(false||false&&true||false);
		
		//실습 : 출력을 예측해 보세요
		System.out.println(true&&(!true||true)&&true||(false||!false)&&false); //true 
		

	}

}
