package classes;

import movieclasses.*;
import javax.swing.*;
import java.awt.*;


public class Contentclick
{
	JFrame Frame6;
	private ImageIcon Homeicon6, bg6;
	private JLabel background6, pageName6,movielbl,imdblbl,releaselbl,genrelbl;
	private JTextField searchf,moviename,imdb, release,genre;
	private JButton searchlbl,moviebtn,seriesbtn,reqbtn,profilebtn,udashbackbtn,exit6,popbtn,listbtn,nmbtn,upcbtn,m1,m1lbl,m2,m2lbl,addlistbtn;
	private JPanel userdashpanel,userdashpanel2,userdashpanel3;
	
	public Contentclick()
	{
		
		Frame6 = new JFrame();
		
		//LOGO
		Homeicon6 = new ImageIcon("images/logo.png");
		
		//PROJECT NAME
		pageName6 = new JLabel("MOVIEFLIX");
		pageName6.setBounds(15,18,400,30);
		pageName6.setForeground(new Color(255,0,0));
		pageName6.setFont(new Font("serif",Font.PLAIN,35));
		
		
		//*********************************COLOR PROBLEM SOLVE BAKI RAATE SOLVE KORBO************************************
		//SEARCH BUTTON
		searchlbl = new JButton("Search");
		searchlbl.setBounds(340,18,80,34);
		searchlbl.setForeground(new Color(211,211,211));
		searchlbl.setFont(new Font("serif",Font.PLAIN,25));
		searchlbl.setBorder(BorderFactory.createEmptyBorder());
		searchlbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
		searchlbl.setContentAreaFilled(false);
		searchlbl.setFocusPainted(false);
		
		
		
		
		//SEARCH FIELD
		searchf = new JTextField();
		searchf.setBounds(430,18,300,34);
		searchf.setForeground(new Color(255,255,255));
		searchf.setBackground(new Color(211,211,211));
		searchf.setBorder(BorderFactory.createEmptyBorder());
		searchf.setFont(new Font("serif",Font.PLAIN,18));
		
		//***************************************************************************************
		
		//MOVIE BUTTON
		moviebtn = new JButton("Movies");
		moviebtn.setBounds(850,18,75,34);
		moviebtn.setForeground(new Color(211,211,211));
		moviebtn.setFont(new Font("serif",Font.PLAIN,20));
		moviebtn.setBorder(BorderFactory.createEmptyBorder());
		moviebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		moviebtn.setContentAreaFilled(false);
		moviebtn.setFocusPainted(false);

		
		
		
		//TV SERIES BUTTON
		seriesbtn = new JButton("TV Shows");
		seriesbtn.setBounds(935,18,90,34);
		seriesbtn.setForeground(new Color(211,211,211));
		seriesbtn.setFont(new Font("serif",Font.PLAIN,20));
		seriesbtn.setBorder(BorderFactory.createEmptyBorder());
		seriesbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		seriesbtn.setContentAreaFilled(false);
		seriesbtn.setFocusPainted(false);

		
		//NEW AND POPULAR BUTTON
		popbtn = new JButton("Popular");
		popbtn.setBounds(1030,18,90,34);
		popbtn.setForeground(new Color(211,211,211));
		popbtn.setFont(new Font("serif",Font.PLAIN,20));
		popbtn.setBorder(BorderFactory.createEmptyBorder());
		popbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		popbtn.setContentAreaFilled(false);
		popbtn.setFocusPainted(false);
		
		
		//REQUEST BUTTON
		reqbtn = new JButton("Request");
		reqbtn.setBounds(1110,18,100,34);
		reqbtn.setForeground(new Color(211,211,211));
		reqbtn.setFont(new Font("serif",Font.PLAIN,20));
		reqbtn.setBorder(BorderFactory.createEmptyBorder());
		reqbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		reqbtn.setContentAreaFilled(false);
		reqbtn.setFocusPainted(false);
		
		
		
		
		//REQUEST BUTTON
		profilebtn = new JButton("Profile");
		profilebtn.setBounds(1250,18,70,34);
		profilebtn.setForeground(new Color(211,211,211));
		profilebtn.setFont(new Font("serif",Font.PLAIN,20));
		profilebtn.setBorder(BorderFactory.createEmptyBorder());
		profilebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		profilebtn.setContentAreaFilled(false);
		profilebtn.setFocusPainted(false);

		
		
		//MY LIST BUTTON
		listbtn = new JButton("My List");
		listbtn.setBounds(70,150,80,34);
		listbtn.setForeground(new Color(211,211,211));
		listbtn.setFont(new Font("serif",Font.PLAIN,23));
		listbtn.setBorder(BorderFactory.createEmptyBorder());
		listbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		listbtn.setContentAreaFilled(false);
		listbtn.setFocusPainted(false);
		
		
		
		
		//NEW MOVIES BUTTON
		nmbtn = new JButton("New Movies");
		nmbtn.setBounds(70,200,120,34);
		nmbtn.setForeground(new Color(211,211,211));
		nmbtn.setFont(new Font("serif",Font.PLAIN,23));
		nmbtn.setBorder(BorderFactory.createEmptyBorder());
		nmbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		nmbtn.setContentAreaFilled(false);
		nmbtn.setFocusPainted(false);
		
		
		//UPCOMMING MOVIES BUTTON
		upcbtn = new JButton("Upcomming");
		upcbtn.setBounds(70,250,120,34);
		upcbtn.setForeground(new Color(211,211,211));
		upcbtn.setFont(new Font("serif",Font.PLAIN,23));
		upcbtn.setBorder(BorderFactory.createEmptyBorder());
		upcbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		upcbtn.setContentAreaFilled(false);
		upcbtn.setFocusPainted(false);
		
		
		//MOVIE 1
		m1 = new JButton();
        m1.setIcon(new ImageIcon("images/ne.jpg"));
        m1.setBounds(350, 150, 250, 370);
        m1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        m1lbl = new JButton("Spiderman-nwh");
        m1lbl.setBounds(400, 610, 200, 35);
        m1lbl.setFont(new Font("serif", Font.PLAIN, 23));
		m1lbl.setForeground(new Color(211,211,211));
        m1lbl.setFocusPainted(false);
        m1lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        m1lbl.setContentAreaFilled(false);
		m1lbl.setBorder(BorderFactory.createEmptyBorder());
		
		
		movielbl = new JLabel("Name");
		movielbl.setBounds(650,180,80,34);
		movielbl.setForeground(new Color(211,211,211));
		movielbl.setFont(new Font("serif",Font.PLAIN,25));
		
		moviename = new JTextField("spiderman:nwh");
		moviename.setBounds(770,180,300,34);
		moviename.setForeground(new Color(211,211,211));
		moviename.setBackground(new Color(37,37,37));
		moviename.setBorder(BorderFactory.createEmptyBorder());
		moviename.setFont(new Font("serif",Font.PLAIN,25));
		
		
		imdblbl = new JLabel("Ratings");
		imdblbl.setBounds(650,230,100,34);
		imdblbl.setForeground(new Color(211,211,211));
		imdblbl.setFont(new Font("serif",Font.PLAIN,25));
		
		imdb = new JTextField("8.0 star");
		imdb.setBounds(770,230,300,34);
		imdb.setForeground(new Color(211,211,211));
		imdb.setBackground(new Color(37,37,37));
		imdb.setBorder(BorderFactory.createEmptyBorder());
		imdb.setFont(new Font("serif",Font.PLAIN,23));
		
		releaselbl = new JLabel("Year");
		releaselbl.setBounds(650,280,100,34);
		releaselbl.setForeground(new Color(211,211,211));
		releaselbl.setFont(new Font("serif",Font.PLAIN,25));
		
		release = new JTextField("2019");
		release.setBounds(770,280,300,34);
		release.setForeground(new Color(211,211,211));
		release.setBackground(new Color(37,37,37));
		release.setBorder(BorderFactory.createEmptyBorder());
		release.setFont(new Font("serif",Font.PLAIN,23));
		
		genrelbl = new JLabel("Genre");
		genrelbl.setBounds(650,330,100,34);
		genrelbl.setForeground(new Color(211,211,211));
		genrelbl.setFont(new Font("serif",Font.PLAIN,25));
		
		genre = new JTextField("Action");
		genre.setBounds(770,330,300,34);
		genre.setForeground(new Color(211,211,211));
		genre.setBackground(new Color(37,37,37));
		genre.setBorder(BorderFactory.createEmptyBorder());
		genre.setFont(new Font("serif",Font.PLAIN,23));
		
		
		//ADD LIST BUTTON
		addlistbtn = new JButton("Add List");
		addlistbtn.setBounds(770,350,200,40);
		addlistbtn.setForeground(new Color(255,255,255));
		addlistbtn.setBackground(new Color(0,0,255));
		addlistbtn.setFocusPainted(false);
		addlistbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		
		
		
		//BACK BUTTON
		udashbackbtn = new JButton("BACK");
		udashbackbtn.setBounds(03,700,100,30);
		udashbackbtn.setForeground(new Color(255,255,255));
		udashbackbtn.setBackground(new Color(0,0,0));
		udashbackbtn.setFocusPainted(false);
		udashbackbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		//EXIT BUTTON
		exit6 = new JButton("EXIT");
		exit6.setBounds(1250,700,100,30);
		exit6.setForeground(new Color(255,255,255));
		exit6.setBackground(new Color(0,0,0));
		exit6.setFocusPainted(false);
		exit6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		//PANEL
		userdashpanel = new JPanel();
        userdashpanel.setBounds(265,80,1060,620);
        userdashpanel.setBackground(new Color(37,37,37,210));
		
		//PANEL 2
		userdashpanel2 = new JPanel();
        userdashpanel2.setBounds(20,80,220,620);
        userdashpanel2.setBackground(new Color(37,37,37,210));
		
		//PANEL 3
		userdashpanel3 = new JPanel();
        userdashpanel3.setBounds(0,0,1366,70);
        userdashpanel3.setBackground(new Color(37,37,37,210));
		
		
		
		//BACKGROUND IMAGE
		bg6 = new ImageIcon("images/userbg.jpg");
		background6 = new JLabel();
		background6.setIcon(bg6);
		background6.setBounds(0,0,1366,768);
		
		//ADDING COMPONENTS
		Frame6.add(searchlbl);
		Frame6.add(moviebtn);
		Frame6.add(searchf);
		Frame6.add(seriesbtn);
		Frame6.add(reqbtn);
		Frame6.add(profilebtn);
		Frame6.add(popbtn);
		Frame6.add(listbtn);
		Frame6.add(nmbtn);
		Frame6.add(upcbtn);
		Frame6.add(m1);
		Frame6.add(m1lbl);
		Frame6.add(movielbl);
		Frame6.add(moviename);
		Frame6.add(imdblbl);
		Frame6.add(imdb);
		
		Frame6.add(releaselbl);
		Frame6.add(release);
		
		Frame6.add(genrelbl);
		Frame6.add(genre);
		
		Frame6.add(addlistbtn);
		
		
		Frame6.add(udashbackbtn);
		Frame6.add(exit6);
		Frame6.add(pageName6);
		Frame6.add(userdashpanel);
		Frame6.add(userdashpanel2);
		Frame6.add(userdashpanel3);
		Frame6.add(background6);
		
		
		
	
		Frame6.setIconImage(Homeicon6.getImage());
		Frame6.setSize(1366,768);
		Frame6.setLayout(null);
		Frame6.setLocationRelativeTo(null);
		Frame6.setResizable(false);
		Frame6.setDefaultCloseOperation(Frame6.EXIT_ON_CLOSE);
		Frame6.setVisible(true);
	}
}