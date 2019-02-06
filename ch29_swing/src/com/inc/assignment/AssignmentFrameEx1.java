package com.inc.assignment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class AssignmentFrameEx1 extends JFrame{
	//1.버튼을 3개 추가하시오.
	//2.버튼의 글씨색을 빨강, 파랑, 초록으로 변경하시오.
	//3.버튼을 눌렀을때 해당 버튼의 글씨색으로 프레임의 색을 변경하시오.
	
	private JPanel centerPanel;
	
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu editMenu;
	
	private JButton redBtn;
	private JButton blueBtn;
	private JButton greenBtn;
	private JButton blackBtn;

	private Container westPanel;
	
	/*private JPanel onePanel;
	private JPanel twoPanel;
	private JPanel thirdPanel;
	private JPanel forPanel;*/
	
	private AssignmentFrameEx1() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setLayout(new BorderLayout());
		initComponent();
		//initEvent();
		setVisible(true);
	}
	

	private void initComponent() {
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		add(menuBar, BorderLayout.NORTH);
		
		kBtn();

	}
	private void kBtn () {
		centerPanel = new JPanel();
		centerPanel.setBackground(Color.WHITE);
		centerPanel.setLayout(new FlowLayout());
		add(centerPanel);
		

		JButton redBtn = new JButton();
		redBtn.setText("레드"); 
		redBtn.setForeground(Color.white);
		redBtn.setBackground(Color.RED);
		JButton blueBtn = new JButton();
		blueBtn.setText("블루"); 
		blueBtn.setForeground(Color.white);
		blueBtn.setBackground(Color.BLUE);
		JButton greenBtn = new JButton();
		greenBtn.setText("그린"); 
		greenBtn.setForeground(Color.white);
		greenBtn.setBackground(Color.GREEN);
		JButton blackBtn = new JButton();
		blackBtn.setText("블랙"); 
		blackBtn.setForeground(Color.white);
		blackBtn.setBackground(Color.BLACK);
		
		centerPanel.add(redBtn);
		centerPanel.add(blueBtn);
		centerPanel.add(greenBtn);
		centerPanel.add(blackBtn);
		
		add(centerPanel, BorderLayout.CENTER);
		
		MouseAdapter mouseAdapter = new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				JButton btn = (JButton)e.getComponent();
				centerPanel.setBackground(btn.getBackground());
			}
		};
		
		redBtn.addMouseListener(mouseAdapter);
		blueBtn.addMouseListener(mouseAdapter);
		greenBtn.addMouseListener(mouseAdapter);
		blackBtn.addMouseListener(mouseAdapter);
		
	}

	/*private void initWest1() {
		
		
	}*/


	public static void main(String[] args) {
		new AssignmentFrameEx1();

	}

}
