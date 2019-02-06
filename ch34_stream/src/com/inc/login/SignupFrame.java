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

public class SignupFrame extends JFrame {
	JLabel idLabel, pwdLabel, pwdCheckLabel, nameLabel;
	JTextField idField, nameField;
	JPasswordField pwdField, pwdCheckField;
	JButton signupBtn, resetBtn;
	
	private SignupFrame() throws FileNotFoundException, IOException {
		setTitle("Signup");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 200, 200);
		setLayout(new GridLayout(5, 2));
		initComponent();
		initEvent();
		initUsers();
		setVisible(true);
	}

	private void initUsers() throws FileNotFoundException, IOException {
		File users = new File("users.inc");
		if(!users.exists()) {
			List<User> userList = new ArrayList<>();
			ObjectOutputStream oos 
					= new ObjectOutputStream(new FileOutputStream(users));
			oos.writeObject(userList);
		}
	}

	private void initEvent() {
		resetBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//클릭시 모든필드를 삭제
				idField.setText("");
				pwdField.setText("");
				pwdCheckField.setText("");
				nameField.setText("");
				idField.requestFocus();
			}
		});
		signupBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//패스워드와 패스워드확인이 일치하지 않을 시 경고창 띄우기
				String pwd = new String(pwdField.getPassword());
				String pwdCheck = new String(pwdCheckField.getPassword());
				if(!pwd.equals(pwdCheck)) {
					JOptionPane.showMessageDialog(
							getContentPane(), "비밀번호가 일치하지 않습니다");
				}
				
				//아이디 중복여부 검사
				try {
					ObjectInputStream ois = 
						new ObjectInputStream(new FileInputStream("users.inc"));
					List<User> userList = (List<User>) ois.readObject();
					for(User user : userList) {
						if(user.getId().equals(idField.getText())) {
							JOptionPane.showMessageDialog(
									getContentPane(), "중복된 아이디 입니다.");
							return;
						}
					}
					User user = new User();
					user.setId(idField.getText());
					user.setPassword(new String(pwdField.getPassword()));
					user.setName(nameField.getText());
					userList.add(user);
					
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.inc"));
					oos.writeObject(userList);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	private void initComponent() {
		idLabel = new JLabel("ID");
		pwdLabel = new JLabel("Pwd");
		pwdCheckLabel = new JLabel("PwdCheck");
		nameLabel = new JLabel("Name");
		
		idField = new JTextField();
		nameField = new JTextField();
		pwdField = new JPasswordField();
		pwdCheckField = new JPasswordField();
		
		signupBtn = new JButton("회원가입");
		resetBtn = new JButton("다시입력");
		
		add(idLabel);
		add(idField);
		add(pwdLabel);
		add(pwdField);
		add(pwdCheckLabel);
		add(pwdCheckField);
		add(nameLabel);
		add(nameField);
		add(signupBtn);
		add(resetBtn);
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		new SignupFrame();
	}

}

