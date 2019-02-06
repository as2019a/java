package com.inc.system;

public class SystemEx4 {

	public static void main(String[] args) {
		System.out.println("운영체제:" + System.getProperty("os.name"));
		System.out.println("사용자명:" + System.getProperty("user.name"));
		System.out.println("홈폴더:" + System.getProperty("user.home"));
		
		for(Object obj : System.getProperties().keySet()) {
			String key = (String)obj;
			System.out.println(key + " : " + System.getProperty(key));
		}
	}
}
