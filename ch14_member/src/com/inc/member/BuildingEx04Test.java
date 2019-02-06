

package com.inc.member;

public class BuildingEx04Test {
	
	public static  void main(String[] args) {
		BuildingEx04 seok = new BuildingEx04();
		seok.name = "석천빌딩";
		seok.year = 20;
		seok.getInfo();
		
		BuildingEx04 Home = new BuildingEx04();
		Home.name = "우성아파트";
		Home.year = 34;
		//Home.floor = 10;
		Home.getInfo();
		
		Home.floor = 100;
		seok.getInfo();
		Home.getInfo();
		
		System.out.println(BuildingEx04.floor);
		System.out.println(Math.PI);
		BuildingEx04.floor = 0;
		System.out.println(seok.floor);
		System.out.println(Home.floor);
		System.out.println(Math.random());
		
		//Math math = new Math();
	}
		
	 }
