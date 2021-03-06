package com.inc.indiveproject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class HKEwebs extends JFrame {
	
	/*
	 * HKE Homepage 구성
	 * 메뉴바 적용(대신 일부 아이템 변경)
	 * 
	 */
	
	// 타이틀(제이레이블)
	JPanel HKEJPanel; // 타이틀과 홈페이지에 기반이 되는 패널
	
	JLabel HKEJLabel;
	
	// Homepage 링크 부분
	JMenuBar HJMenuBar;
	
	JMenu AboutUs, Businessarea, Introductionofitem, Jobhunting, Servicecenter;
	// Homepage 메뉴-보조메뉴
	JMenuItem greetings, vision, Organizationchart, Partners, waytocome;
	JMenuItem DomesticBranch;
	JMenuItem MIC, Amp, audio, speaker;
	JMenuItem Careers, consultation, Notice, referenceRoom, gallery;
	
	// 제작진행중
	// West
	
	
	// Center
	
	
	// East
	
	
	// South
	
	
	// 메뉴부분
	//JPanel memubers;
	
	JMenuBar menuBar;
	
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	// fileMenu
	JMenuItem newItem;
	JMenuItem openItem;
	JMenuItem saveItem;
	JMenuItem saveAsItem;
	
	// editMenu
	JMenuItem calculatorItem;
	JMenuItem colorItem;
	
	// helpMenu
	JMenuItem webItem;
	JMenuItem careersItem;

	private javax.swing.JMenuBar menuBar1;

	private void initMenu() {
		menuBar = new JMenuBar();

		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		// 사이즈 조정
		Dimension d50 = new Dimension(50, 20);
		fileMenu.setPreferredSize(d50);
		editMenu.setPreferredSize(d50);
		helpMenu.setPreferredSize(d50);

		// 단축키 추가(메뉴)
		fileMenu.setMnemonic(KeyEvent.VK_F);
		editMenu.setMnemonic(KeyEvent.VK_E);
		helpMenu.setMnemonic(KeyEvent.VK_H);

		// file menu
		newItem = new JMenuItem("New");
		openItem = new JMenuItem("Open");
		saveItem = new JMenuItem("Save");
		saveAsItem = new JMenuItem("Save As...");

		// edit menu
		calculatorItem = new JMenuItem("Calculator");
		colorItem = new JMenuItem("Color");

		// help menu
		//webItem = new JMenuItem("Web");
		careersItem = new JMenuItem("Careers");

		// 단축키 추가(메뉴아이템)
		newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
		saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
		saveAsItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));

		calculatorItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_MASK));
		colorItem.setMnemonic(KeyEvent.VK_C);

		//webItem.setMnemonic(KeyEvent.VK_W);
		careersItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
		
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator();
		fileMenu.add(saveItem);
		fileMenu.add(saveAsItem);

		editMenu.add(calculatorItem);
		editMenu.add(colorItem);
		// 메뉴에 메뉴 집어넣기(서브메뉴)
		editMenu.add(helpMenu);

		//helpMenu.add(webItem);
		helpMenu.add(careersItem);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		// menuBar.add(helpMenu);

		add(menuBar, BorderLayout.NORTH);
	}
	
	HKEwebs() {
		setTitle("HKE Home page");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 900, 1100);
		setResizable(true);
		setLayout(new BorderLayout());
		initMenu();
		initHKEMenu();
		//initSocket();
		initComponent();
		initEvent();
		//initUsers();
		//initReceiver();
		setVisible(true);
	}
	
	private void initHKEMenu() {
		JMenuBar HJMenuBar = new JMenuBar();
		JMenu AboutUs = new JMenu("회사소개");
		JMenuItem greetings = new JMenuItem("인사말");
		JMenuItem vision = new JMenuItem("비전");
		JMenuItem Organizationchart = new JMenuItem("조직도");
		JMenuItem Partners = new JMenuItem("협력사");
		JMenuItem waytocome = new JMenuItem("오시는길");
		
		JMenu Businessarea = new JMenu("사업영역");
		JMenuItem DomesticBranch = new JMenuItem("국내지부");
		
		JMenu Introductionofitem = new JMenu("제품소개");
		JMenuItem MIC = new JMenuItem("마이크");
		JMenuItem Amp = new JMenuItem("엠프");
		JMenuItem audio = new JMenuItem("오디오");
		JMenuItem speaker = new JMenuItem("스피커");
			
		JMenu Jobhunting = new JMenu("공채채용");
		JMenuItem Careers = new JMenuItem("채용안내");
		
		JMenu Servicecenter = new JMenu("고객센터");
		JMenuItem consultation = new JMenuItem("1:1상담");
		JMenuItem Notice = new JMenuItem("공지사항");
		JMenuItem referenceRoom = new JMenuItem("자료실");
		JMenuItem gallery = new JMenuItem("갤러리");
		
		add(HJMenuBar);
		
		HJMenuBar.add(AboutUs);
		AboutUs.add(greetings);
		AboutUs.add(vision);
		AboutUs.add(Organizationchart);
		AboutUs.add(Partners);
		AboutUs.add(waytocome);
		
		HJMenuBar.add(Businessarea);
		Businessarea.add(DomesticBranch);
		
		HJMenuBar.add(Introductionofitem);
		Introductionofitem.add(MIC);
		Introductionofitem.add(Amp);
		Introductionofitem.add(audio);
		Introductionofitem.add(speaker);
		
		HJMenuBar.add(Jobhunting);
		Jobhunting.add(Careers);
		
		HJMenuBar.add(Servicecenter);
		Servicecenter.add(consultation);
		Servicecenter.add(Notice);
		Servicecenter.add(referenceRoom);
		Servicecenter.add(gallery);
		
		
		
		
	}

	private void initEvent() {
		
		
	}

	private void initComponent() {
		
		
	}

	public static void main(String[] args) {
		new HKEwebs();

	}

}
