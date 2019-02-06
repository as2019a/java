package com.inc.msn;

public class msn_08 {

	public static void main(String[] args) {
		String [] english = {"A","B","C","D","E"};
		String [] room = {"거실","방"};
		
		koreasMembers(english);
		koreasMembers(room);
		
		
	}
		public static void koreasMembers(String[] members) {
			for(String number : members) {
				System.out.println("korea "+number);
			}
		}

}
