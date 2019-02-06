/*package com.inc.components;

import java.awt.*;

import javax.swing.event.MenuEvent;

public class MenuBar2 extends Frame{
	

		private MenuBar mb;

		//1. 메뉴바 생성
		public MenuBar2() {
    super();
		
		Menu mufile = new Menu("파일");
		Menu mucolor = new Menu("색상");
		Menu mnunew = new Menu("새파일");
		Menu mnusave = new Menu("저장");
		Menu mnuopen = new Menu("열기");
		Menu mnuexit = new Menu("종료");
		
		mufile.add(mnunew);
		mufile.add(mnusave);
		mufile.add(mnuopen);
		mufile.addSeparator();
		mufile.add(mnuexit);
		
		Menu mnuforecolor=new Menu("글자색");
		mucolor.add(mnuforecolor);
		
		CheckboxMenuItem mnublack = new CheckboxMenuItem("검정색", true);
		CheckboxMenuItem mnured = new CheckboxMenuItem("빨간색");
		CheckboxMenuItem mnublue = new CheckboxMenuItem("파란색");
		
		
		setMenuBar(mb);
		
		setSize(300,300);
		setVisible(true);
		
		}

		public static void main(String[] args) {
			new MenuBar2();
		}
}
*/