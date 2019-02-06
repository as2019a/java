package com.inc.stirng;

public class StringEx2 {

	public static void main(String[] args) {
		System.out.println(login1("kim", "1111"));
		System.out.println(login1("kim", "2222"));
		System.out.println(login1("kim", null));
		System.out.println("-------------------------");
		System.out.println(login2("kim", "1111"));
		System.out.println(login2("kim", "2222"));
		System.out.println(login2("kim", null));
	}
	
	private static boolean login1(String id, String password) {
		if(id == null || password == null) {
			return false;
		}
		if(id.equals("kim") && password.equals("1111")) {
			return true;
		}
		return false;
	}
	
	private static boolean login2(String id, String password) {
		if("kim".equals(id) && "1111".equals(password)) {
			return true;
		}
		return false;
	}
 }
