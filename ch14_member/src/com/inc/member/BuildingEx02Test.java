

package com.inc.member;

public class BuildingEx02Test {
	
	public static  void main(String[] args) {
		BuildingEx02 seok = new BuildingEx02();
		seok.name = "석천빌딩";
		seok.year = 20;
		seok.getInfo();
		
		BuildingEx02 Home = new BuildingEx02();
		Home.name = "우성아파트";
		Home.year = 34;
		Home.floor = 10;
		Home.getInfo();
	}
		
	 }
