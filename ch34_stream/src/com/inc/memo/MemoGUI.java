package com.inc.memo;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemoGUI extends JFrame{
	
	JPanel nortPanel;	
	JButton saveBtn, IoadBtn;
	JTextField fileNameField;
	JTextArea textArea;
	
	private MemoGUI() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		initComponent();
		initEvent();
		setVisible(true);
	}
		
	private void initEvent() {
		saveBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				try {
					FileWriter fw = new FileWriter("memo/"+fileNameField.getText()+".txt");
				  BufferedWriter bw = new BufferedWriter(fw);
				  bw.write(textArea.getText());
				  bw.close();
				  //JOptionPane사용해서 "저장완료"표시해주기
				  JOptionPane.showMessageDialog(getContentPane(), "저장완료");
				  
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		IoadBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				try {
					FileReader fr = new FileReader("memo/"+fileNameField.getText()+".txt");
					BufferedReader br = new BufferedReader(fr);
					textArea.setText("");
					String line = "";
					while((line = br.readLine()) != null) {
						textArea.append(line);
					}
					JOptionPane.showMessageDialog(getParent(), "파일을 성공적으로 불러왔습니다");
				} catch (FileNotFoundException e1) {
				//"존재하지 않는 파일 이름입니다"다이얼로그 띄우기
				  JOptionPane.showMessageDialog(getParent(), "존재하지 않는 파일 이름입니다");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	private void initComponent() {
		nortPanel = new JPanel();
		saveBtn = new JButton("저장");
		IoadBtn = new JButton("열기");
		fileNameField = new JTextField(10);
		textArea = new JTextArea();
		
		nortPanel.add(fileNameField);
		nortPanel.add(saveBtn);
		nortPanel.add(IoadBtn);
		add(nortPanel, BorderLayout.NORTH);
		
		textArea = new JTextArea();
		add(textArea);
		
	}

	public static void main(String[] args) {
		new MemoGUI();

	}

}
