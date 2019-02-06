package com.inc.joinframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.inc.jcomp.jbutton.ComboBoxFrame;
import com.inc.jcomp.jtext.TextFieldFrame;

public class joinFrame extends JFrame {

	// increpas join
	// 회원구분 : 교육생, 웹회원
	// 아이디 :
	// 비밀번호 : *****
	// 비밀번호확인 : *****
	// 이름 :
	// 생년월일 :
	// 이메일 : -----@-----
	/*
	 * gmail.com yahoo.com naver.com hanmail.net nate.com hotmail.com
	 */
	// 연락처 :
	/*
	 * 010 011 018 017 016 02
	 */

	private JLabel MembershipLabel;
	JRadioButton Studentrbtn;
	JRadioButton memberrbtn;

	private JLabel idLabel;
	private JTextField idField;
	private JLabel ideLabel;

	private JLabel passwordLabel;
	private JTextField passwordField;
	private JLabel passwordsLabel;

	private JLabel confirmpasswordLabel;
	private JTextField confirmpasswordField;
	// private JLabel confirmpasswordsLabel;

	private JLabel nameLabel;

	private JLabel dateofbirthLabel;
	private JTextField dateofbirthField;
	private JLabel dateLabel;
	JRadioButton manbtn;
	JRadioButton womanbtn;

	private JLabel emailLabel;
	private JTextField email1Field;
	private JLabel emailwhelkLabel;
	private JTextField email2Field;
	JComboBox<String> emailBox;
	
	private JLabel contact;
	JComboBox<String> contacts1Box;
	private JLabel contactbar1;
	private JTextField contacts1Field;
	private JLabel contactbar2;
	private JTextField contacts2Field;
	
	private joinFrame() {
		setTitle("Increpas Join");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		setLayout(new FlowLayout());
		initComponent();
		setVisible(true);
	}

	private void initComponent() {
				MembershipLabel = new JLabel("회원구분");
				Studentrbtn = new JRadioButton("교육생");
				memberrbtn = new JRadioButton("웹회원");
				add(MembershipLabel);
				add(Studentrbtn);
				add(memberrbtn);
				
				ButtonGroup btnGroup = new ButtonGroup();
				btnGroup.add(Studentrbtn); //btnGroup
				btnGroup.add(memberrbtn);

				Studentrbtn.setSelected(true);

				idLabel = new JLabel("아이디");
				idField = new JTextField(10);
				ideLabel = new JLabel("* 4~20자의 범위에서 영문자와 숫자만 가능합니다.");
				add(idLabel);
				add(idField);
				add(ideLabel);
				
				passwordLabel = new JLabel("비밀번호");
				passwordField = new JPasswordField(10);
				passwordsLabel = new JLabel("* 문자와 숫자,특수문자 조합6~12자리입력, 특수문자는('@#$%!)만 가능");
				add(passwordLabel);
				add(passwordField);
				add(passwordsLabel);
				
				confirmpasswordLabel = new JLabel("비밀번호확인");
				confirmpasswordField = new JPasswordField(10);
				add(confirmpasswordLabel);
				add(confirmpasswordField);
				
				nameLabel = new JLabel("이름");
				JTextField nameField = new JTextField(7);
				add(nameLabel);
				add(nameField);
				
				dateofbirthLabel = new JLabel("생년월일");
				JTextField dateofbirthField = new JTextField(7);
				dateLabel = new JLabel("예: 1990-12-01");
				manbtn = new JRadioButton("남자");
				womanbtn = new JRadioButton("여자");
				add(dateofbirthLabel);
				add(dateofbirthField);
				add(dateLabel);
				add(manbtn);
				add(womanbtn);
				
				ButtonGroup btnGroup1 = new ButtonGroup();
				btnGroup1.add(manbtn); //btnGroup1
				btnGroup1.add(womanbtn);

				manbtn.setSelected(true);
				
				emailLabel = new JLabel("이메일");
				JTextField email1Field = new JTextField(7);
				emailwhelkLabel = new JLabel("@");
				JTextField email2Field = new JTextField(7);
				String[] emails = {"email 선택","gmail.com","yahoo.com","naver.com","hanmail.net","nate.com","hotmail.com","직접입력"};
				emailBox = new JComboBox<>(emails);
				
				//email2Field ActionListener
				/*email2Field.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						//액션 리스너 재정의
						if("입력해 주세요".equals(email2Field.getText())) {
							email2Field.setText("");
						}
						if("".equals(email2Field.getText())) {
							email2Field.setForeground(Color.GRAY);
							email2Field.setText("입력해 주세요");
						}
						
					}
				}*/
				
				add(emailLabel);
				add(email1Field);
				add(emailwhelkLabel);
				add(email2Field);
			      add(emailBox);
				
			      //연락처(소스코드는 위에것을 활용, 액션코드는 적용X)
			      contact = new JLabel("연락처");
			      String[] contacts1 = {"010","011","018","017","016","02"};
			      contacts1Box = new JComboBox<>(contacts1);
			      contactbar1 = new JLabel("-");
			      JTextField contacts1Field = new JTextField(7);
			      contactbar2 = new JLabel("-");
			      JTextField contacts2Field = new JTextField(7);
			      
			      add(contact);
			      add(contacts1Box);
			      add(contactbar1);
			      add(contacts1Field);
			      add(contactbar2);
			      add(contacts2Field);
			      
			     //버튼(가입완료, 취소)
			      JButton signedupbtn1 = new JButton();
			      signedupbtn1.setText("가입완료"); 
			      signedupbtn1.setForeground(Color.white);
			      signedupbtn1.setBackground(new Color(0, 206, 209));
			      JButton cancelbtn2 = new JButton();
			      cancelbtn2.setText("취소"); 
			      cancelbtn2.setForeground(Color.white);
			      cancelbtn2.setBackground(Color.LIGHT_GRAY);
			     
			      add(signedupbtn1);
			      add(cancelbtn2);
			}

	public static void main(String[] args) {
		new joinFrame();

	}

}
