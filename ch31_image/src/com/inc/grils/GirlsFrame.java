package com.inc.grils;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;

public class GirlsFrame extends JFrame{
	
	private List<Member> members = new ArrayList<>(); 
	
	private JPanel southPanel;
	
	private JLabel imageLabel;
	private JLabel answerLabel;
	private JTextField answerField;
	private JButton answerBtn;
	
	private int random;
	
	private GirlsFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 700);
		setResizable(false);
		setMembers();
		initComponent();
		initEvent();
		setVisible(true);
	}

	private void initEvent() {
		answerBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {
				String predictName = answerField.getText();
				String anwerName = members.get(random).getName();
				if(predictName.equals(anwerName)) {
					JOptionPane.showMessageDialog(getContentPane(), "맞았습니다");
					random = (int)(Math.random() * 6);
					imageLabel.setIcon(members.get(random).getImage());
					answerField.setText(" ");
					return;
				}
				
				JOptionPane.showMessageDialog(getContentPane(), "틀렸습니다.");
			
			}

			
			
			
		});
		
	}

	private void setMembers() {
		members.add(new Member("유리", new ImageIcon("src/com/inc/images/yuri.png")));
		members.add(new Member("효연", new ImageIcon("src/com/inc/images/hyoyeon.png")));
		members.add(new Member("제시카", new ImageIcon("src/com/inc/images/jessica.png")));
		members.add(new Member("써니", new ImageIcon("src/com/inc/images/sunny.png")));
		members.add(new Member("태연", new ImageIcon("src/com/inc/images/taeyeon.png")));
		members.add(new Member("윤아", new ImageIcon("src/com/inc/images/yunah.png")));
		
	}

	private void initComponent() {
		random = (int)(Math.random() * 6);
		
		imageLabel = new JLabel(members.get(random).getImage());
		add(imageLabel);
		
		answerLabel = new JLabel("정답");
		answerBtn = new JButton("입력");
		answerField = new JTextField(6);
		
		southPanel = new JPanel();
		southPanel.add(answerLabel);
		southPanel.add(answerField);
		southPanel.add(answerBtn);
		add(southPanel, BorderLayout.SOUTH);
		
	}

	public static void main(String[] args) {
		new GirlsFrame();
	}

}






