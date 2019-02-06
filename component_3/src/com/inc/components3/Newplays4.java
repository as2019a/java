package com.inc.components3;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.*;

public abstract class Newplays4 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);		
		System.out.println("지금은 " + hourOfDay + "시 " + minute + "분입니다.");
		
		if(hourOfDay > 4 && hourOfDay < 12) 
			System.out.println("Good Morning");
		else if(hourOfDay >= 12 && hourOfDay < 18) 
			System.out.println("Good Afternoon");
		else if(hourOfDay >= 18 && hourOfDay < 22) 
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");			
	}
}