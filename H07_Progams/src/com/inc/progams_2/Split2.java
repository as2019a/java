package com.inc.progams_2;

public class Split2 {

	public static void main(String[] args) {
		String str1 = "phone;;name;id;pwd";
    String word1 = str1.split(";")[0];
    String word2 = str1.split(";")[1];
    String word3 = str1.split(";")[2];
     
    System.out.println("첫번째 단어:" + word1);
    System.out.println("두번째 단어:" + word2);
    System.out.println("세번째 단어:" + word3);

	}

}
