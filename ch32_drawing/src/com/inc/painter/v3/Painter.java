package com.inc.painter.v3;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Painter extends JFrame{
	JPanel canvas;
	
	Point p1 = new Point(-10, -10);
	Point p2 = new Point(-10, -10);
	
	JPanel northPanel;
	
	JButton redBtn;
	JButton blueBtn;
	JButton greenBtn;
	JButton blackBtn;
	
	JButton eraseBtn;
	JComboBox<Integer> strokeBox;
	
	
	Color c = Color.BLACK;
	int stroke = 3;
	
	
	private Painter() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		initComponent();
		initEvent();
		setVisible(true);
	}

	private void initEvent() {
		canvas.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				p2 = e.getPoint();
			}
			
		});
		
		canvas.addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				p1 = p2;
				p2 = e.getPoint();
				canvas.print(canvas.getGraphics());
			}
			
		});
		
		MouseAdapter ma = new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				c = e.getComponent().getBackground();
			}
		};
		
		redBtn.addMouseListener(ma);
		blueBtn.addMouseListener(ma);
		greenBtn.addMouseListener(ma);
		blackBtn.addMouseListener(ma);
		
		eraseBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {
				canvas.getGraphics().clearRect(
						0, 0, canvas.getWidth(), canvas.getHeight());
			}
			
		});
	
		strokeBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					stroke = (Integer)e.getItem();
				}
			}
		});
	}

	private void initComponent() {
		canvas = new JPanel() {
			@Override
			public void print(Graphics g) {
				Graphics2D g2 = (Graphics2D)g;
				g2.setStroke(new BasicStroke(stroke));
				g.setColor(c);
				g.drawLine(p1.x, p1.y, p2.x, p2.y);
			}
		};
		add(canvas);
		
		redBtn = new JButton();
		redBtn.setBackground(Color.RED);
		blueBtn = new JButton();
		blueBtn.setBackground(Color.BLUE);
		greenBtn = new JButton();
		greenBtn.setBackground(Color.GREEN);
		blackBtn = new JButton();
		blackBtn.setBackground(Color.BLACK);
		
		
		northPanel = new JPanel(new GridLayout(2, 3, 3, 3));
		northPanel.setPreferredSize(new Dimension(0, 50));
		
		eraseBtn = new JButton("지우기");
		northPanel.add(eraseBtn);
		
		northPanel.add(redBtn);
		northPanel.add(blueBtn);
		
		Vector<Integer> strokes = new Vector<>();
		strokes.add(1);
		strokes.add(2);
		strokes.add(3);
		strokes.add(4);
		strokes.add(5);
		strokeBox = new JComboBox<>(strokes);
		strokeBox.setSelectedItem(3);
		northPanel.add(strokeBox);
		
		northPanel.add(greenBtn);
		northPanel.add(blackBtn);
		
		add(northPanel, BorderLayout.NORTH);
		
		
		
	}

	public static void main(String[] args) {
		new Painter();
	}

}