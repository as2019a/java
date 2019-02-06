package NyamNyam.v1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
	
	Point playerPoint = new Point(0, 300);
	
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
	}
	
	
	private void setTimer() {
		t = new Timer(20, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(playerPoint.y != 450) {
					playerPoint.y += 3;
					gamePanel.repaint();
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
