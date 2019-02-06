package com.inc.digginggame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TestFrame extends JFrame {
	private static final String mainFrame =  "MainFrame";
  private static final String gameFrame = "GameFrame";    
  private static final String CARD_JRADIOBUTTON = "Card JRadioButton";

  private TestFrame()
  {
  	setTitle("Digging Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(900, 100, 500, 500);
		setResizable(false);
    //setLocationRelativeTo(null);

    // This JPanel is the base for CardLayout for other JPanels.
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new CardLayout());

    /* Here we be making objects of the Window Series classes
     * so that, each one of them can be added to the JPanel 
     * having CardLayout. 
     */
    //MainFrame mainF = new MainFrame();
    //mainPanel.add(mainF, mainFrame);
    DigGame1 gameF = new DigGame1();
    mainPanel.add(gameF, gameFrame);
    //Window3 win3 = new Window3();
    //contentPane.add(win3, CARD_JRADIOBUTTON);

    /* We need two JButtons to go to the next Card
     * or come back to the previous Card, as and when
     * desired by the User.
     */
    JPanel buttonPanel = new JPanel(); 
    final JButton previousButton = new JButton("PREVIOUS");
    previousButton.setBackground(Color.BLACK);
    previousButton.setForeground(Color.WHITE);
    final JButton nextButton = new JButton("NEXT");
    nextButton.setBackground(Color.RED);
    nextButton.setForeground(Color.WHITE);
    buttonPanel.add(previousButton);
    buttonPanel.add(nextButton);

    /* Adding the ActionListeners to the JButton,
     * so that the user can see the next Card or
     * come back to the previous Card, as desired.
     */
    previousButton.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
            cardLayout.previous(mainPanel);
        }
    });
    nextButton.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
            cardLayout.next(mainPanel);   
        }
    });

    // Adding the contentPane (JPanel) and buttonPanel to JFrame.
    add(mainPanel, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.PAGE_END);

    setVisible(true);
  }

  public static void main(String... args)
  {
    SwingUtilities.invokeLater(new Runnable()
    {
        public void run()
        {
            new TestFrame();
        }
    });
  }
} 

