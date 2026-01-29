package classes;
import movieclasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Admindashboard implements ActionListener{
	JFrame Frame6;
	private ImageIcon Homeicon6, bg6;
	private JLabel background6, pageName6,mflbl,aolbl,uolbl,adminlbl;
	private JButton profilebtn,adashbackbtn,exit6,popbtn,adabtn,nmbtn,upcbtn;
	private JButton udabtn,addubtn,rubtn,rreqbtn,nbtn,umbtn,mbtn;
	private JPanel userdashpanel,userdashpanel2,userdashpanel3,userdashpanel4;
	
	public Admindashboard()
	{
		
		Frame6 = new JFrame("MOVIEFLIX");
		
		//LOGO
		Homeicon6 = new ImageIcon("images/logo.png");
		
		//PROJECT NAME
		pageName6 = new JLabel("MOVIEFLIX");
		pageName6.setBounds(15,18,400,30);
		pageName6.setForeground(new Color(255,0,0));
		pageName6.setFont(new Font("serif",Font.PLAIN,35));
		
		
		//PROJECT NAME
		adminlbl = new JLabel("ADMIN PANEL");
		adminlbl.setBounds(550,18,400,40);
		adminlbl.setForeground(new Color(255,0,0));
		adminlbl.setFont(new Font("serif",Font.PLAIN,30));
		
		
		
		//REQUEST BUTTON
		profilebtn = new JButton(Adminlogin.aprofile);
		profilebtn.setBounds(1250,18,70,34);
		profilebtn.setForeground(new Color(211,211,211));
		profilebtn.setFont(new Font("serif",Font.PLAIN,20));
		profilebtn.setBorder(BorderFactory.createEmptyBorder());
		profilebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		profilebtn.setContentAreaFilled(false);
		profilebtn.setFocusPainted(false);

		
		
		
		
		//ADMIN OPERATIONS
		aolbl = new JLabel("Admin Operations");
		aolbl.setBounds(150,150,400,34);
		aolbl.setForeground(new Color(255,0,0));
		aolbl.setFont(new Font("serif",Font.PLAIN,30));
		
		//ADMIN DETAILS BUTTON
		adabtn = new JButton("Admin Details");
		adabtn.setBounds(150,230,200,34);
		adabtn.setForeground(new Color(211,211,211));
		adabtn.setFont(new Font("serif",Font.PLAIN,25));
		adabtn.setBackground(new Color(37,37,37));
		//adabtn.setBorder(BorderFactory.createEmptyBorder());
		adabtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//adabtn.setContentAreaFilled(false);
		adabtn.setFocusPainted(false);
		adabtn.addActionListener(this);
		
		
		//ADD ADMIN BUTTON
		nmbtn = new JButton("Add Admin");
		nmbtn.setBounds(150,280,200,34);
		nmbtn.setForeground(new Color(211,211,211));
		nmbtn.setFont(new Font("serif",Font.PLAIN,25));
		nmbtn.setBackground(new Color(37,37,37));
		//nmbtn.setBorder(BorderFactory.createEmptyBorder());
		nmbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//nmbtn.setContentAreaFilled(false);
		nmbtn.setFocusPainted(false);
		nmbtn.addActionListener(this);
		
		
		//REMOVE ADMIN BUTTON
		upcbtn = new JButton("Remove Admin");
		upcbtn.setBounds(150,330,200,34);
		upcbtn.setForeground(new Color(211,211,211));
		upcbtn.setBackground(new Color(37,37,37));
		upcbtn.setFont(new Font("serif",Font.PLAIN,25));
		//upcbtn.setBorder(BorderFactory.createEmptyBorder());
		upcbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//upcbtn.setContentAreaFilled(false);
		upcbtn.setFocusPainted(false);
		upcbtn.addActionListener(this);
		
		
		
		//USER OPERATIONS
		uolbl = new JLabel("User Operations");
		uolbl.setBounds(570,150,400,34);
		uolbl.setForeground(new Color(255,0,0));
		uolbl.setFont(new Font("serif",Font.PLAIN,30));
		
		//USER DETAILS BUTTON
		udabtn = new JButton("User Details");
		udabtn.setBounds(570,230,200,34);
		udabtn.setForeground(new Color(211,211,211));
		udabtn.setBackground(new Color(37,37,37));
		udabtn.setFont(new Font("serif",Font.PLAIN,25));
		//udabtn.setBorder(BorderFactory.createEmptyBorder());
		udabtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//udabtn.setContentAreaFilled(false);
		udabtn.setFocusPainted(false);
		udabtn.addActionListener(this);
		
		
		//ADD USER BUTTON
		addubtn = new JButton("Add User");
		addubtn.setBounds(570,280,200,34);
		addubtn.setForeground(new Color(211,211,211));
		addubtn.setBackground(new Color(37,37,37));
		addubtn.setFont(new Font("serif",Font.PLAIN,25));
		//addubtn.setBorder(BorderFactory.createEmptyBorder());
		addubtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//addubtn.setContentAreaFilled(false);
		addubtn.setFocusPainted(false);
		addubtn.addActionListener(this);
		
		
		//REMOVE USER BUTTON
		rubtn = new JButton("Remove User");
		rubtn.setBounds(570,330,200,34);
		rubtn.setForeground(new Color(211,211,211));
		rubtn.setBackground(new Color(37,37,37));
		rubtn.setFont(new Font("serif",Font.PLAIN,25));
		//rubtn.setBorder(BorderFactory.createEmptyBorder());
		rubtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//rubtn.setContentAreaFilled(false);
		rubtn.setFocusPainted(false);
		rubtn.addActionListener(this);
		
		
		//MOVIEFLIX OPERATIONS
		mflbl = new JLabel("Movieflix Operations");
		mflbl.setBounds(970,150,400,34);
		mflbl.setForeground(new Color(255,0,0));
		mflbl.setFont(new Font("serif",Font.PLAIN,30));
		
		//Receive request BUTTON
		rreqbtn = new JButton("Rec. Requests");
		rreqbtn.setBounds(990,230,200,34);
		rreqbtn.setForeground(new Color(211,211,211));
		rreqbtn.setBackground(new Color(37,37,37));
		rreqbtn.setFont(new Font("serif",Font.PLAIN,25));
		rreqbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		rreqbtn.setFocusPainted(false);
		rreqbtn.addActionListener(this);
		
		
		
		//Notice update BUTTON
		nbtn = new JButton("Notice");
		nbtn.setBounds(990,280,200,34);
		nbtn.setForeground(new Color(211,211,211));
		nbtn.setBackground(new Color(37,37,37));
		nbtn.setFont(new Font("serif",Font.PLAIN,25));
		nbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		nbtn.setFocusPainted(false);
		nbtn.addActionListener(this);
		
		
		//Upcoming BUTTON
		umbtn = new JButton("Upcoming");
		umbtn.setBounds(990,330,200,34);
		umbtn.setForeground(new Color(211,211,211));
		umbtn.setBackground(new Color(37,37,37));
		umbtn.setFont(new Font("serif",Font.PLAIN,25));
		umbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		umbtn.setFocusPainted(false);
		umbtn.addActionListener(this);
		
		
		//Mail BUTTON
		mbtn = new JButton("Mail");
		mbtn.setBounds(990,380,200,34);
		mbtn.setBackground(new Color(37,37,37));
		mbtn.setForeground(new Color(211,211,211));
		mbtn.setFont(new Font("serif",Font.PLAIN,25));
		mbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mbtn.setFocusPainted(false);
		mbtn.addActionListener(this);
		
		
		
		
		//BACK BUTTON
		adashbackbtn = new JButton("BACK");
		adashbackbtn.setBounds(03,700,100,30);
		adashbackbtn.setForeground(new Color(255,255,255));
		adashbackbtn.setBackground(new Color(0,0,0));
		adashbackbtn.setFocusPainted(false);
		adashbackbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		adashbackbtn.addActionListener(this);
		
		
		//EXIT BUTTON
		exit6 = new JButton("EXIT");
		exit6.setBounds(1250,700,100,30);
		exit6.setForeground(new Color(255,255,255));
		exit6.setBackground(new Color(0,0,0));
		exit6.setFocusPainted(false);
		exit6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit6.addActionListener(this);
		
		
		//PANEL
		userdashpanel = new JPanel();
        userdashpanel.setBounds(500,80,350,620);
        userdashpanel.setBackground(new Color(37,37,37,210));
		
		//PANEL 2
		userdashpanel2 = new JPanel();
        userdashpanel2.setBounds(80,80,350,620);
        userdashpanel2.setBackground(new Color(37,37,37,210));
		
		//PANEL 3
		userdashpanel3 = new JPanel();
        userdashpanel3.setBounds(920,80,350,620);
        userdashpanel3.setBackground(new Color(37,37,37,210));
		
		//PANEL 4
		userdashpanel4 = new JPanel();
        userdashpanel4.setBounds(0,0,1366,70);
        userdashpanel4.setBackground(new Color(37,37,37,210));
		
		
		
		
		//BACKGROUND IMAGE
		bg6 = new ImageIcon("images/userbg.jpg");
		background6 = new JLabel();
		background6.setIcon(bg6);
		background6.setBounds(0,0,1366,768);
		
		//ADDING COMPONENTS
		Frame6.add(adminlbl);
		Frame6.add(profilebtn);
		Frame6.add(aolbl);
		Frame6.add(adabtn);
		Frame6.add(nmbtn);
		Frame6.add(upcbtn);
		Frame6.add(uolbl);
		Frame6.add(udabtn);
		Frame6.add(addubtn);
		Frame6.add(rubtn);
		Frame6.add(mflbl);
		Frame6.add(rreqbtn);
		Frame6.add(nbtn);
		Frame6.add(umbtn);
		Frame6.add(mbtn);
		Frame6.add(adashbackbtn);
		Frame6.add(exit6);
		Frame6.add(pageName6);
		Frame6.add(userdashpanel);
		Frame6.add(userdashpanel2);
		Frame6.add(userdashpanel3);
		Frame6.add(userdashpanel4);

		Frame6.add(background6);
		
		
		
	
		Frame6.setIconImage(Homeicon6.getImage());
		Frame6.setSize(1366,768);
		Frame6.setLayout(null);
		Frame6.setLocationRelativeTo(null);
		Frame6.setResizable(false);
		Frame6.setDefaultCloseOperation(Frame6.EXIT_ON_CLOSE);
		Frame6.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==adashbackbtn)
		{
			new Adminlogin();
			Frame6.setVisible(false);
		}
		else if(e.getSource()==nmbtn)
		{
			new Addadmin();
			Frame6.setVisible(false);
		}
		else if(e.getSource()==upcbtn)
		{
			new Removeadmin();
			Frame6.setVisible(false);
		}
		else if(e.getSource()==adabtn)
		{
			new Admindetails();
			Frame6.setVisible(false);
		}
		else if(e.getSource()==addubtn)
		{
			new Adduser();
			Frame6.setVisible(false);
		}
		else if(e.getSource()==rubtn)
		{
			new Removeuser();
			Frame6.setVisible(false);
		}
		else if(e.getSource()==udabtn)
		{
			new Userdetails();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==rreqbtn)
		{
			new Receivedreq();
			Frame6.setVisible(false);
		}
		else if(e.getSource()==nbtn)
		{
			new Adnotice();
			Frame6.setVisible(false);
		}
		else if(e.getSource()==umbtn)
		{
			new Adupcoming();
			Frame6.setVisible(false);
		}
		else if(e.getSource()==mbtn)
		{
			new Mail();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==exit6)
		{
			System.exit(0);
		}
	}
	
	
}