package com.inc.login;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.inc.objectio.User;

public class SigninFrame extends JFrame {
	JLabel idLabel, pwdLabel;
	JTextField idField;
	JPasswordField pwdField;
	JButton signinBtn, resetBtn;
	
	private SigninFrame() throws FileNotFoundException, IOException {
		setTitle("Signin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 200, 200);
		setLayout(new GridLayout(3, 2));
		initComponent();
		initEvent();
		setVisible(true);
	}

	

	private void initEvent() {
		resetBtn.addMouseListener( new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//클릭시 모든필드를 삭제
				idField.setText("");
				pwdField.setText("");
				//커서를 idField에 넣어줌
				idField.requestFocus();
			}
		});
		signinBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String id = idField.getText();
				if(id.equals("")) {
					JOptionPane.showMessageDialog(getContentPane(), "아이디를 입력해 주세요");
				}
				//유효성 검사
				String password = new String(pwdField.getPassword());
				if(password.length() < 5 || password.length() > 10) {
					JOptionPane.showMessageDialog(getContentPane(), "패스워드는 5글자 이상 10글자  이하입니다.");
				}
			}
		});
	}

	private void initComponent() {
		idLabel = new JLabel("ID");
		pwdLabel = new JLabel("Pwd");
		
		idField = new JTextField();
		pwdField = new JPasswordField();
		
		signinBtn = new JButton("로그인");
		resetBtn = new JButton("다시입력");
		
		add(idLabel);
		add(idField);
		add(pwdLabel);
		add(pwdField);
		add(signinBtn);
		add(resetBtn);
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		new SigninFrame();
	}

}

