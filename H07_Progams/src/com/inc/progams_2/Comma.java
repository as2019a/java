package com.inc.progams_2;

import java.text.DecimalFormat;

public class Comma {

	public static void main(String[] args) {
		double money = 2795390;
    
    DecimalFormat dc = new DecimalFormat("###,###,###,###");   
    String ch = dc.format(money);
     
    System.out.println("작업전 : " + money);
    System.out.println("작업후 : " + ch);

	}

}
