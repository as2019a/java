package com.inc.chat.v05;

import java.awt.BorderLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
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
	DataInputStream dis;
	DataOutputStream dos;
	
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
					  String msg = dis.readUTF();
					  textArea.append(msg+"\n");
					  textArea.setCaretPosition(textArea.getDocument().getLength());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
		};
		receiver.start();
	}

	private void initSocket() {
		socket = new Socket();
	}
	private void initStream() {
		try {
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
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
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(
								getContentPane(), 
								"서버장애입니다.\n계속되면 관리자에게 문의해 주세요");
						System.exit(0);
					}
					
					
				}else {
					System.exit(0);
				}
			}
			
		});
		msgField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					try {
						dos.writeUTF(nickName + " : " + msgField.getText());
						dos.flush();
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
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.getVerticalScrollBar().addAdjustmentListener(
				new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				e.getAdjustable().setValue(e.getAdjustable().getMaximum());
			}
		});
		add(scrollPane);
		add(msgField, BorderLayout.SOUTH);
	}

	public static void main(String[] args) throws IOException {
		new ClientFrame();
	}

}
