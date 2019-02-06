package com.inc.button;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class Client extends JFrame{
	JButton[][] buttons;
	JButton myBtn;
	Color c;
	Socket socket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Thread receiver;
	
	private Client() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setLayout(new GridLayout(5, 5, 10, 10));
		initSocket();
		initComponent();
		initReceiver();
		setVisible(true);
	}

	private void initReceiver() {
		receiver = new Thread(()->{
			while(true) {
				try {
					Click click = (Click)ois.readObject();
					JButton button = buttons[click.row][click.column];
					button.setBackground(click.getColor());
					for(MouseListener ml : button.getMouseListeners()) {
						button.removeMouseListener(ml);
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}); 
		receiver.start();
	}

	private void initComponent() {
		c = JColorChooser.showDialog(
				getContentPane(), "set color", Color.BLACK);
		buttons = new JButton[5][5];
		for(int i = 0; i < buttons.length;i++) {
			for(int j = 0; j < buttons[i].length; j++) {
				final int k = i;
				final int q = j;
				JButton btn = new JButton();
				btn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseReleased(MouseEvent e) {
						//Click클래스로부터 객체하나 생성
						Click click = new Click(k, q, c);
						//서버로 객체 전송
						try {
							oos.writeObject(click);
							oos.reset();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						
					}
				});
				buttons[i][j] = btn;
				add(btn);
			}
		}
	}

	private void initSocket() {
		socket = new Socket();
		try {
			socket.connect(new InetSocketAddress("192.168.0.10", 5001));
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Client();
	}
}








