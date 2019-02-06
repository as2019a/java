

package com.inc.member;

public class BuildingEx03Test {
	
	public static  void main(String[] args) {
		BuildingEx03 seok = new BuildingEx03();
		seok.name = "석천빌딩";
		seok.year = 20;
		seok.getInfo();
		
		BuildingEx03 Home = new BuildingEx03();
		Home.name = "우성아파트";
		Home.year = 34;
		//Home.floor = 10;
		Home.getInfo();
	}
		
	 }
