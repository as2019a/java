package com.inc.block;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Client extends JFrame{
	List<Block> blockList = new ArrayList<>();
	Socket socket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Thread receiver;
	Block block;
	JPanel canvas;
	Timer timer;
	boolean isPressing;
	
	private Client() {
		setTitle("Block");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		initSocket();
		initComponent();
		initEvent();
		initReceiver();
		setVisible(true);
	}

	private void initReceiver() {
		/*receiver = new Thread(new Runnable() {
			@Override
			public void run() {
				코드
				
			}
		});*/
		//람다식
		//파라미터로 인터페이스를 구현한 익명클래스를 집어넣어야 할 때
		//그 인터페이스가 추상메서드가 단 하나라면 람다식을 쓸수 있다
		receiver = new Thread(()->{
			while(true) {
				try {
					Block readBlock = (Block)ois.readObject();
					boolean isExist = false;
					for(Block block : blockList) {
						if(block.getId().equals(readBlock.getId())) {
							block.p = readBlock.p;
							isExist = true;
							break;
						}
					}
					if(!isExist) {
						blockList.add(readBlock);
					}
					canvas.repaint();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		receiver.start();
	}

	private void initEvent() {
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(isPressing) {
					return;
				}
				isPressing = true;
				timer = new Timer(10, new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e2) {
						switch(e.getKeyCode()) {
							case KeyEvent.VK_LEFT : block.p.x -= 10; break;
							case KeyEvent.VK_RIGHT : block.p.x += 10; break;
							case KeyEvent.VK_UP : block.p.y -= 10; break;
							case KeyEvent.VK_DOWN : block.p.y += 10; break;
						}
						try {
							oos.writeObject(block);
							oos.reset();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				});
				timer.start();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				timer.stop();
				isPressing = false;
			}
			
			
		});
		
		
	}

	private void initComponent() {
		String id = JOptionPane.showInputDialog("아이디");
		/*int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);*/
		Color c = JColorChooser.showDialog(
								getContentPane(), "choose color", Color.BLACK);
		block = new Block(id, c);
		int x = (int)(Math.random() * 450);
		int y = (int)(Math.random() * 450);
		block.p = new Point(x,y);
		blockList.add(block);
		canvas = new JPanel() {
			public void paint(Graphics g) {
				super.paint(g);
				for(Block block : blockList) {
					g.setColor(block.getC());
					g.fill3DRect(block.p.x-15, block.p.y-15, 30, 30, true);
				}
			};
		};
		add(canvas);
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












