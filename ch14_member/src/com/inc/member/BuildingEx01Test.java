

package com.inc.member;

public class BuildingEx01Test {
	
	public static  void main(String[] args) {
		BuildingEx01 seok = new BuildingEx01();
		seok.floor = 8;
		seok.name = "석천빌딩";
		seok.year = 20;
		seok.getInfo();
		
		BuildingEx01 Home = new BuildingEx01();
		Home.floor = 15;
		Home.name = "우성아파트";
		Home.year = 34;
		Home.getInfo();
	}
		
	 }
