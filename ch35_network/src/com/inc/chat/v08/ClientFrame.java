package com.inc.chat.v08;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientFrame extends JFrame{
	
	JButton enterBtn;
	JTextArea textArea;
	JTextField msgField;
	String nickName;
	
	Socket socket;
	ObjectInputStream ois;
	ObjectOutputStream oos;	
	
	Thread receiver;
	
	private ClientFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		initSocket();
		initComponent();
		initEvent();
		setVisible(true);
	}

	private void initReceiver() {
		receiver = new Thread() {
			@Override
			public void run() {
				while(true) {
					try {
						Message message = (Message)ois.readObject();
						if(message.getType() == Message.EXIT) {
							oos.close();
							ois.close();
							socket.close();
							return;
						}else if(message.getType() == Message.START) {
							textArea.append(
									message.getNickName()+"님이 입장하셨습니다\n");
							scrollDown();
						}
						textArea.append(message.getNickName() + " : "
														+ message.getMsg()+"\n");
						scrollDown();
					} catch (IOException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
		};
		receiver.start();
	}
	private void scrollDown() {
		textArea.setCaretPosition(
				textArea.getDocument().getLength());
	}
	
	private void initSocket() {
		socket = new Socket();
	}
	private void initStream() {
		try {
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void initEvent() {
		enterBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {
				if(enterBtn.getText().equals("입장하기")) {
					while((nickName = 
								JOptionPane.showInputDialog("닉네임")).equals("")){}
					enterBtn.setText("종료하기");
					msgField.setEditable(true);
					try {
						socket.connect(
								new InetSocketAddress("192.168.0.10",5001));
						textArea.append("서버에 접속되었습니다.\n");
						initStream();
						initReceiver();
						Message message = 
								new Message(nickName, null, Message.START);
						oos.writeObject(message);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(
								getContentPane(), 
								"서버장애입니다.\n계속되면 관리자에게 문의해 주세요");
						System.exit(0);
					}
				}else {
					Message message = new Message(null, null, Message.EXIT);
					try {
						oos.writeObject(message);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					System.exit(0);
				}
			}
			
		});
		msgField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					try {
						oos.writeObject(
								new Message(nickName, 
														msgField.getText(), 
														Message.SEND));
						msgField.setText("");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
			
		});
	}

	private void initComponent() {
		enterBtn = new JButton("입장하기");
		textArea = new JTextArea();
		textArea.setEditable(false);
		msgField = new JTextField();
		msgField.setEditable(false);
		add(enterBtn, BorderLayout.NORTH);
		add(new JScrollPane(textArea));
		add(msgField, BorderLayout.SOUTH);
	}

	public static void main(String[] args) throws IOException {
		new ClientFrame();
	}

}
