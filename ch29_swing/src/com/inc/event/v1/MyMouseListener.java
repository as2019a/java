package com.inc.event.v1;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {

	ClickEventFrame f;
	
	public MyMouseListener(ClickEventFrame f) {
		this.f = f;
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		f.getContentPane().setBackground(Color.RED);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		f.getContentPane().setBackground(Color.BLUE);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스 들어옴");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스 나감");
		
	}
	
}
