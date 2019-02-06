package NyamNyam.v2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameFrame extends JFrame{
	
	JMenuBar menuBar;
	
	JMenu setMenu;
	JMenuItem loginItem;
	JMenuItem exitItem;
	
	JMenu helpMenu;
	JMenuItem createrItem;
	
	JPanel gamePanel;
	
	ImageIcon playerImage;
	ImageIcon coinImage;
	
	Point playerPoint = new Point(50, 300);
	
	Timer t;
	
	List<Point> points = new Vector<>();
	
	private GameFrame() {
		setTitle("Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200,150,1200,700);
		initComponent();
		initEvent();
		setVisible(true);
		setResizable(false);
		setTimer();
		while(true) {
			points.add(new Point(1200,(int)(Math.random()*650)));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	private void setTimer() {
		t = new Timer(20, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(playerPoint.y != 450) {
					playerPoint.y += 3;
					gamePanel.repaint();
				}
				
				synchronized(points) {
					for(Iterator<Point> i = points.iterator();i.hasNext();) {
						Point p = i.next();
						p.x -= 10;
						if(p.x < 0) {
							i.remove();
						}
					}
				}
				
			}
			
		});
		t.start();
		
	}


	private void initEvent() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					t.stop();
					gamePanel.repaint();
					playerPoint.y -= 15;
					
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					t.restart();
				}
			}
			
		});
	}


	private void initComponent() {
		playerImage = new ImageIcon("src/images/player.png");
		coinImage = new ImageIcon("src/images/coin.png");
		menuBar = new JMenuBar();
		setMenu = new JMenu("설정");
		loginItem = new JMenuItem("로그인");
		exitItem = new JMenuItem("종료");
		helpMenu = new JMenu("정보");
		createrItem = new JMenuItem("제작자");
		
		setMenu.add(loginItem);
		setMenu.add(exitItem);
		helpMenu.add(createrItem);
		
		menuBar.add(setMenu);
		menuBar.add(helpMenu);
		
		
		add(menuBar,BorderLayout.NORTH);
		
		gamePanel = new JPanel() {

			@Override
			public void paint(Graphics g) {
				super.paint(g);
				g.drawImage(playerImage.getImage(), playerPoint.x, playerPoint.y, this);
				
				for(Point p : points) {
					g.drawImage(coinImage.getImage(), p.x,p.y, this);
				}
			}
			
		};
		gamePanel.setBackground(Color.WHITE);
		
		add(gamePanel);
	}


	public static void main(String[] args) {
		new GameFrame();
	}
	 
}
