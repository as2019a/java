package com.inc.jpanel.v2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelFrame extends JFrame{
	
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu editMenu;
	
	//west
	private JPanel westPanel;
	private JButton redBtn;
	private JButton blueBtn;
	private JButton greenBtn;
	private JButton yellowBtn;
	
	//center
	private JPanel centerPanel;
	
	//south
	private JPanel southPanel;
	private JTextArea textArea;
	private JTextField textField;
	private JButton sendBtn;
	
	
	
	private PanelFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		initComponent();
		setVisible(true);
	}

	private void initComponent() {
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		add(menuBar, BorderLayout.NORTH);
		
		initWest();
		
		centerPanel = new JPanel();
		centerPanel.setBackground(Color.BLACK);
		add(centerPanel);
		
		initSouth();
		
		initEvent();
	}
	
	private void initEvent() {
		//1.색버튼 클릭시 centerPanel의 색을 똑같이 변경
		//2.field에서 타이핑 후 엔터를 치거나 send버튼 누를시
		//  내용이 textArea에 추가되고 field의 내용은 삭제(채팅)
		//3.menuItem 적당한것으로 추가 후 이벤트 부여
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
		yellowBtn.addMouseListener(mouseAdapter);
		
		sendBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.append(textField.getText()+"\n");
				textField.setText("");
			}
		});
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '\n') {
					textArea.append(textField.getText()+"\n");
					textField.setText("");
				}
			}
		});
	}
	
	private void initWest() {
		westPanel = new JPanel(new GridLayout(2, 2));
		redBtn = new JButton();
		blueBtn = new JButton();
		greenBtn = new JButton();
		yellowBtn = new JButton();
		redBtn.setBackground(Color.RED);
		blueBtn.setBackground(Color.BLUE);
		greenBtn.setBackground(Color.GREEN);
		yellowBtn.setBackground(Color.YELLOW);
		
		westPanel.add(redBtn);
		westPanel.add(blueBtn);
		westPanel.add(greenBtn);
		westPanel.add(yellowBtn);
		
		add(westPanel, BorderLayout.WEST);
	}
	
	private void initSouth() {
		southPanel = new JPanel();
		southPanel.setLayout(new BorderLayout());
		southPanel.setPreferredSize(new Dimension(500, 200));
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		
		JScrollPane scrollPane = 
				new JScrollPane(textArea, 
						JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
						JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		textField = new JTextField();
		sendBtn = new JButton("Send");
		southPanel.add(scrollPane);
		southPanel.add(sendBtn, BorderLayout.EAST);
		southPanel.add(textField, BorderLayout.SOUTH);
		add(southPanel, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new PanelFrame();

	}

}
