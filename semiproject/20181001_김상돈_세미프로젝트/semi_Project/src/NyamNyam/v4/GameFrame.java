   package NyamNyam.v4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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
import javax.swing.JLabel;
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
	ImageIcon scoreImage;
	ImageIcon farbackgroundImage;
	ImageIcon nearbackgroundImage;
	ImageIcon guageBg;
	ImageIcon guageBar;
	
	JPanel scorePanel;
	
	JLabel scoreLabel;
	
	Point playerPoint = new Point(50, 300);
	
	Timer t;
	Timer t1;
	Timer t2;
	Timer t3;
	
	List<Point> points = new Vector<>();
	
	boolean keyPressing = false;
	
	int score;
	int farbackground_x = 0;
	int nearbackground_x = 0;
	int guageBar_x = 412;
	int score_x = 590;
	
	private GameFrame() {
		setTitle("Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200,150,1280,800);
		initComponent();
		initEvent();
		setVisible(true);
		setResizable(false);
		setTimer();
		setPoints();
		movefarBackground();
		movenearBackground();
		while(true) {
			if(guageBar_x <= 0) {
				t1.stop();
				t2.stop();
				t3.stop();
				break;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
		}
	}
	
	
	private void movenearBackground() {
		t3 = new Timer(20, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				nearbackground_x -= 8;
				if(nearbackground_x == -320) {
					nearbackground_x = 0;
				}
			}
		});
		t3.start();
	}


	private void movefarBackground() {
		t2 = new Timer(80 , new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				farbackground_x -= 2;
				if(farbackground_x==-1280) {
					farbackground_x = 0;
				}
				guageBar_x -= 1;
			}
		});
		t2.start();
		
	}


	private void setPoints() {
		t1 = new Timer(50, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				points.add(new Point(1300,(int)(Math.random()*550)+100));
				
			}
		});
		t1.start();
	}


	private void setTimer() {
		t = new Timer(20, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(guageBar_x <= 0) {
					points.removeAll(points);
					t.stop();
				}
				if(!keyPressing) {
					if(playerPoint.y > 545) {playerPoint.y = playerPoint.y; }
					else {playerPoint.y += 8;}
				}else if(keyPressing){
					if(playerPoint.y < 20) {playerPoint.y = playerPoint.y; }
					else {playerPoint.y -= 12;} 
				}
				gamePanel.repaint();
				synchronized(points) {
					for(Iterator<Point> i = points.iterator();i.hasNext();) {
						Point p = i.next();
						p.x -= 10;
						
						if(isCrashed(p)) {
							i.remove();
							score += 1000;
							switch(score) {
								case 1000 : score_x = 580; break;
								case 10000 : score_x = 570; break;
								case 100000 : score_x = 560; break;
								case 1000000 : score_x = 550; break;
							}
						}
						
						if(p.x < 0) {
							i.remove();
						}
					}
				}
				
			}

			
			
		});
		t.start();
		
	}

	private boolean isCrashed(Point p) {
		if(Math.sqrt(Math.pow((p.x-36)-(playerPoint.x+120), 2)+(Math.pow((p.y-36)-(playerPoint.y+60), 2))) < 100){
			return true;
		}
		return false;
	}
	
	private void initEvent() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					keyPressing = true;
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					keyPressing = false;
				}
			}
			
		});
	}


	private void initComponent() {
		playerImage = new ImageIcon("src/images/player.png");
		coinImage = new ImageIcon("src/images/Enemy_1_pumkin.png");
		scoreImage = new ImageIcon("src/images/score.png");
		farbackgroundImage = new ImageIcon("src/images/farbackground.png");
		nearbackgroundImage = new ImageIcon("src/images/nearbackground.png");
		guageBg = new ImageIcon("src/images/GuageBG.png");
		guageBar = new ImageIcon("src/images/GuageBar.png");

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
		/*scorePanel = new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				g.drawImage(scoreImage.getImage(), 0, 0, this);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Rosewood Std",Font.PLAIN,35));
				g.drawString(""+score, 90,55);
				setOpaque(false);
			}
			
		};*/
		gamePanel = new JPanel() {

			@Override
			public void paint(Graphics g) {
				super.paint(g);
				
				g.drawImage(farbackgroundImage.getImage(), farbackground_x, 0, this);
				g.drawImage(farbackgroundImage.getImage(), farbackground_x+farbackgroundImage.getIconWidth(), 0, this);
				g.drawImage(nearbackgroundImage.getImage(),nearbackground_x,350,this);
				g.drawImage(nearbackgroundImage.getImage(),nearbackground_x+nearbackgroundImage.getIconWidth(),350,this);
				g.drawImage(scoreImage.getImage(), 500, 10, this);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Verdana",Font.PLAIN,35));
				g.drawString(score+"", score_x,65);
				g.drawImage(guageBg.getImage(),400, 700,this);
				g.drawImage(guageBar.getImage(), 445, 716,guageBar_x,17, this);
				g.drawImage(playerImage.getImage(), playerPoint.x, playerPoint.y, this);
				synchronized(points) {
					for(Point p : points) {
						g.drawImage(coinImage.getImage(), p.x-36,p.y-36, this);
					}
				}
			}
			
		};
		gamePanel.setLayout(null);
		//gamePanel.add(scorePanel);
		
		/*scorePanel.setBounds(500,10,205,72);
		scorePanel.setBackground(Color.black);
		scorePanel.repaint();
		
		scoreLabel = new JLabel("0");
		scoreLabel.setFont(new Font("Rosewood Std",Font.PLAIN,30));
		scoreLabel.setForeground(Color.WHITE);
		scorePanel.add(scoreLabel);*/
		
		add(gamePanel);
	}


	public static void main(String[] args) {
		new GameFrame();
	}
	 
}
