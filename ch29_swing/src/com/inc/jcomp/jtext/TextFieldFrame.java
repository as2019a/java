package com.inc.jcomp.jtext;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {
	private JTextField textField1;
	private JTextField textField2;
	
	private JTextField idField;
	private JTextField passwordField;
	private JTextField nameField;
	private JTextField emailField;
	private JRadioButton maleRadioBtn;
	private JRadioButton femaleRadioBtn;
	private JCheckBox movieCheckBox;
	private JCheckBox bookCheckBox;	
	
	private JLabel idLabel;
	private JLabel passwordLabel;
	
	private JLabel nameLabel;
	private JLabel emailLabel;
	private JLabel genderLabel;
	private JLabel hobbyLabel;
	
	private TextFieldFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,300,500,500);
		setLayout(new FlowLayout());
		initComponent();
		setVisible(true);
	}
	
	private void initComponent() {
		textField1 = new JTextField(10);
		add(textField1);
		textField2 = new JTextField("입력해 주세요", 10);
		textField2.setForeground(Color.GRAY);
		add(textField2);
		textField2.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) {
				if("입력해 주세요".equals(textField2.getText())) {
					textField2.setText("");
					textField2.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if("".equals(textField2.getText())) {
					textField2.setForeground(Color.GRAY);
					textField2.setText("입력해 주세요");
				}
			}
			
		});
	
		idLabel = new JLabel("ID");
		passwordLabel = new JLabel("Password");
		
		idField = new JTextField(7);
		passwordField = new JPasswordField(7);
		
		add(idLabel);
		add(idField);
		add(passwordLabel);
		add(passwordField);
		
		//이름, 이메일, 성별, 취미 갯수는 자유
		nameLabel = new JLabel("이름");
		emailLabel = new JLabel("이메일");
		genderLabel = new JLabel("성별");
		hobbyLabel = new JLabel("취미");
		
		nameField = new JTextField(7);
		emailField = new JTextField(7);
		maleRadioBtn = new JRadioButton("남성");
		femaleRadioBtn = new JRadioButton("여성", true);
		movieCheckBox = new JCheckBox("영화");
		bookCheckBox = new JCheckBox("독서");
		add(nameLabel);
		add(nameField);
		add(emailLabel);
		add(emailField);
		add(genderLabel);
		add(maleRadioBtn);
		add(femaleRadioBtn);
		add(hobbyLabel);
		add(movieCheckBox);
		add(bookCheckBox);
		
	}
	
	public static void main(String[] args) {
		new TextFieldFrame();
	}
	
}
