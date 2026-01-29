package classes;
import movieclasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Welcome implements ActionListener{
	
	JFrame Frame;
	private JLabel pageName, background, description, description1, description2;
	private JButton start, exit,con;
	private ImageIcon bg, Homeicon;
	
	
	public Welcome()
	{
		
		Frame = new JFrame("MOVIEFLIX");
		Homeicon = new ImageIcon("images/logo.png");
		bg = new ImageIcon("images/welcomeBG.jpg");
		
		
		pageName = new JLabel("MOVIEFLIX");
		pageName.setBounds(40,30,400,30);
		pageName.setForeground(new Color(255,0,0));
		pageName.setFont(new Font("serif",Font.PLAIN,35));
		
		
		
		description = new JLabel("UNLIMITED MOVIES, TV SHOWS AND MORE");
		description.setBounds(270,270,850,40);
		description.setForeground(new Color(255,255,255));
		description.setFont(new Font("Segoe UI",Font.PLAIN,40));
		
		
		description1 = new JLabel("WATCH ANYWHERE , CANCEL ANYTIME");
		description1.setBounds(310,350,800,50);
		description1.setForeground(new Color(255,255,255));
		description1.setFont(new Font("Segoe UI",Font.PLAIN,40));
		
		
		description2 = new JLabel("Ready to browse your favourite movie?");
		description2.setBounds(445,450,600,40);
		description2.setForeground(new Color(255,255,255));
		description2.setFont(new Font("serif",Font.PLAIN,30));
		
		
		
		
		start = new JButton("GET STARTED    >");
		start.setCursor(new Cursor(Cursor.HAND_CURSOR));
		start.setBounds(500,515,350,60);
		start.setForeground(new Color(255,255,255));
		start.setBackground(new Color(255,0,0));
		start.setFont(new Font("serif",Font.PLAIN,25));
		start.setFocusPainted(false);
		start.setBorder(BorderFactory.createEmptyBorder());
		start.addActionListener(this);
		
		
		//ADMIN BUTTON
        con = new JButton("*Contribution*");
        con.setBounds(3,690,130,19);
        con.setForeground(new Color(255,255,255));
        con.setFont(new Font("serif",Font.PLAIN,18));
        con.setFocusPainted(false);
        con.setContentAreaFilled(false);
        con.setCursor(new Cursor(Cursor.HAND_CURSOR));
        con.setBorder(BorderFactory.createEmptyBorder());
		con.addActionListener(this);
		
		
		
		//EXIT BUTTON
		exit = new JButton("Exit");
		exit.setBounds(1250,700,100,30);
		exit.setForeground(new Color(255,255,255));
		exit.setBackground(new Color(0,0,0));
		exit.setFocusPainted(false);
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.addActionListener(this);
		
		
		
		
		
		background = new JLabel();
		background.setIcon(bg);
		background.setBounds(0,0,1366,768);
		
		
		
		
		Frame.add(pageName);
		Frame.add(description);
		Frame.add(description1);
		Frame.add(description2);
		Frame.add(con);
		Frame.add(start);
		Frame.add(exit);
		Frame.add(background);
		
		
		
		Frame.setIconImage(Homeicon.getImage());
		Frame.setSize(1366,768);
		Frame.setLayout(null);
		Frame.setLocationRelativeTo(null);
		Frame.setResizable(false);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setVisible(true);
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==start)
		{
			new Login();
			Frame.setVisible(false);
		}
		else if(e.getSource()==con)
		{
			new Contribution();
			Frame.setVisible(false);
		}
		else if(e.getSource()==exit)
		{
			System.exit(0);
		}
	}
	
}