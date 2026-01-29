package classes;
import movieclasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;



public class Userdashboard implements ActionListener{
	JFrame Frame6;
	private ImageIcon Homeicon6, bg6;
	private JLabel background6, pageName6;
	private JTextField searchf;
	private JButton searchlbl,moviebtn,seriesbtn,reqbtn,profilebtn,udashbackbtn,out,exit6,popbtn,listbtn,nmbtn,upcbtn,s;
	private JButton m1,m1lbl,m2,m2lbl,m3,m3lbl,m4,m4lbl,m5,m5lbl,m6,m6lbl,m7,m7lbl,m8,m8lbl,m9,m9lbl,m10,m10lbl;
	private JPanel userdashpanel,userdashpanel2;
	
	public Userdashboard()
	{
		
		Frame6 = new JFrame("MOVIEFLIX");
		
		//LOGO
		Homeicon6 = new ImageIcon("images/logo.png");
		
		//PROJECT NAME
		pageName6 = new JLabel("MOVIEFLIX");
		pageName6.setBounds(15,18,400,30);
		pageName6.setForeground(new Color(255,0,0));
		pageName6.setFont(new Font("serif",Font.PLAIN,35));
		
		
		//SEARCH BUTTON
		searchlbl = new JButton("Search");
		searchlbl.setBounds(350,18,80,34);
		searchlbl.setForeground(new Color(211,211,211));
		searchlbl.setFont(new Font("serif",Font.PLAIN,25));
		searchlbl.setBorder(BorderFactory.createEmptyBorder());
		searchlbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
		searchlbl.setContentAreaFilled(false);
		searchlbl.setFocusPainted(false);
		
		
		
		
		//SEARCH FIELD
		searchf = new JTextField();
		searchf.setBounds(430,18,300,34);
		searchf.setForeground(new Color(0,0,0));
		searchf.setBackground(new Color(211,211,211));
		searchf.setBorder(BorderFactory.createEmptyBorder());
		searchf.setFont(new Font("serif",Font.PLAIN,18));
		
		s = new JButton("Search");
		s.setBounds(740,18,100,34);
		s.setForeground(new Color(0,0,0));
		s.setBackground(new Color(211,211,211));
		s.setCursor(new Cursor(Cursor.HAND_CURSOR));
		s.addActionListener(this);
		Frame6.add(s);
		
		
		//MOVIE BUTTON
		moviebtn = new JButton("Movies");
		moviebtn.setBounds(850,18,75,34);
		moviebtn.setForeground(new Color(211,211,211));
		moviebtn.setFont(new Font("serif",Font.PLAIN,20));
		moviebtn.setBorder(BorderFactory.createEmptyBorder());
		moviebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		moviebtn.setContentAreaFilled(false);
		moviebtn.setFocusPainted(false);
		moviebtn.addActionListener(this);

		
		
		
		//TV SERIES BUTTON
		seriesbtn = new JButton("TV Shows");
		seriesbtn.setBounds(935,18,90,34);
		seriesbtn.setForeground(new Color(211,211,211));
		seriesbtn.setFont(new Font("serif",Font.PLAIN,20));
		seriesbtn.setBorder(BorderFactory.createEmptyBorder());
		seriesbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		seriesbtn.setContentAreaFilled(false);
		seriesbtn.setFocusPainted(false);
		seriesbtn.addActionListener(this);

		
		//NEW AND POPULAR BUTTON
		popbtn = new JButton("Popular");
		popbtn.setBounds(1030,18,90,34);
		popbtn.setForeground(new Color(211,211,211));
		popbtn.setFont(new Font("serif",Font.PLAIN,20));
		popbtn.setBorder(BorderFactory.createEmptyBorder());
		popbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		popbtn.setContentAreaFilled(false);
		popbtn.setFocusPainted(false);
		popbtn.addActionListener(this);
		
		
		//REQUEST BUTTON
		reqbtn = new JButton("Request");
		reqbtn.setBounds(1110,18,100,34);
		reqbtn.setForeground(new Color(211,211,211));
		reqbtn.setFont(new Font("serif",Font.PLAIN,20));
		reqbtn.setBorder(BorderFactory.createEmptyBorder());
		reqbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		reqbtn.setContentAreaFilled(false);
		reqbtn.setFocusPainted(false);
		reqbtn.addActionListener(this);
		
		
		
		
		//REQUEST BUTTON
		profilebtn = new JButton(Login.uprofile);
		profilebtn.setBounds(1250,18,70,34);
		profilebtn.setForeground(new Color(211,211,211));
		profilebtn.setFont(new Font("serif",Font.PLAIN,20));
		profilebtn.setBorder(BorderFactory.createEmptyBorder());
		profilebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		profilebtn.setContentAreaFilled(false);
		profilebtn.setFocusPainted(false);

		
		
		//MY LIST BUTTON
		listbtn = new JButton("Notice");
		listbtn.setBounds(40,150,70,34);
		listbtn.setForeground(new Color(211,211,211));
		listbtn.setFont(new Font("serif",Font.PLAIN,23));
		listbtn.setBorder(BorderFactory.createEmptyBorder());
		listbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		listbtn.setContentAreaFilled(false);
		listbtn.setFocusPainted(false);
		listbtn.addActionListener(this);
		
		
		
		
		//NEW MOVIES BUTTON
		nmbtn = new JButton("Upcomming");
		nmbtn.setBounds(40,200,120,34);
		nmbtn.setForeground(new Color(211,211,211));
		nmbtn.setFont(new Font("serif",Font.PLAIN,23));
		nmbtn.setBorder(BorderFactory.createEmptyBorder());
		nmbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		nmbtn.setContentAreaFilled(false);
		nmbtn.setFocusPainted(false);
		nmbtn.addActionListener(this);
		
		
		//UPCOMMING MOVIES BUTTON
		upcbtn = new JButton("Need Help?");
		upcbtn.setBounds(40,250,111,34);
		upcbtn.setForeground(new Color(211,211,211));
		upcbtn.setFont(new Font("serif",Font.PLAIN,23));
		upcbtn.setBorder(BorderFactory.createEmptyBorder());
		upcbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		upcbtn.setContentAreaFilled(false);
		upcbtn.setFocusPainted(false);
		upcbtn.addActionListener(this);
		
		
		//Sign out BUTTON
		out = new JButton("Sign Out");
		out.setBounds(40,300,90,34);
		out.setForeground(new Color(211,211,211));
		out.setFont(new Font("serif",Font.PLAIN,23));
		out.setBorder(BorderFactory.createEmptyBorder());
		out.setCursor(new Cursor(Cursor.HAND_CURSOR));
		out.setContentAreaFilled(false);
		out.setFocusPainted(false);
		out.addActionListener(this);
		
		
		//MOVIE 1
		m1 = new JButton();
        m1.setIcon(new ImageIcon("images/fg170.jpg"));
        m1.setBounds(280, 90, 170, 255);
        m1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m1.addActionListener(this);
        m1lbl = new JButton("Forrest Gump");
        m1lbl.setBounds(260, 345, 200, 35);
        m1lbl.setFont(new Font("serif", Font.PLAIN, 23));
		m1lbl.setForeground(new Color(211,211,211));
        m1lbl.setFocusPainted(false);
        m1lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        m1lbl.setContentAreaFilled(false);
		m1lbl.setBorder(BorderFactory.createEmptyBorder());
		m1lbl.addActionListener(this);
		
		
		
		
		//MOVIE 2
		m2 = new JButton();
        m2.setIcon(new ImageIcon("images/ed170.jpg"));
        m2.setBounds(500, 90, 170, 255);
        m2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m2.addActionListener(this);
        m2lbl = new JButton("Evil Dead");
        m2lbl.setBounds(480, 345, 200, 35);
        m2lbl.setFont(new Font("serif", Font.PLAIN, 23));
		m2lbl.setForeground(new Color(211,211,211));
        m2lbl.setFocusPainted(false);
        m2lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        m2lbl.setContentAreaFilled(false);
		m2lbl.setBorder(BorderFactory.createEmptyBorder());
		m2lbl.addActionListener(this);
		
		
		//MOVIE 3
		m3 = new JButton();
        m3.setIcon(new ImageIcon("images/sp170.jpg"));
        m3.setBounds(720,90, 170, 255);
        m3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m3.addActionListener(this);
        m3lbl = new JButton("Spiderman-nwh");
        m3lbl.setBounds(700, 345, 200, 35);
        m3lbl.setFont(new Font("serif", Font.PLAIN, 23));
		m3lbl.setForeground(new Color(211,211,211));
		m3lbl.setContentAreaFilled(false);
        m3lbl.setFocusPainted(false);
        m3lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        m3lbl.setBorder(BorderFactory.createEmptyBorder());
		m3lbl.addActionListener(this);
		
		
		
		//MOVIE 4
		m4 = new JButton();
        m4.setIcon(new ImageIcon("images/bb170-255.jpg"));
        m4.setBounds(940, 90, 170, 255);
        m4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m4.addActionListener(this);
        m4lbl = new JButton("Breaking Bad");
        m4lbl.setBounds(920, 345, 200, 35);
        m4lbl.setFont(new Font("serif", Font.PLAIN, 23));
		m4lbl.setForeground(new Color(211,211,211));
        m4lbl.setFocusPainted(false);
        m4lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        m4lbl.setContentAreaFilled(false);
		m4lbl.setBorder(BorderFactory.createEmptyBorder());
		m4lbl.addActionListener(this);
		
		
		//MOVIE 5
		m5 = new JButton();
        m5.setIcon(new ImageIcon("images/mh170.jpg"));
        m5.setBounds(1160,90, 170, 255);
        m5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m5.addActionListener(this);

        m5lbl = new JButton("Money Heist");
        m5lbl.setBounds(1140, 345, 200, 35);
        m5lbl.setFont(new Font("serif", Font.PLAIN, 23));
		m5lbl.setForeground(new Color(211,211,211));
		m5lbl.setContentAreaFilled(false);
        m5lbl.setFocusPainted(false);
        m5lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        m5lbl.setBorder(BorderFactory.createEmptyBorder());
		m5lbl.addActionListener(this);
		
		
		//MOVIE 6
		m6 = new JButton();
        m6.setIcon(new ImageIcon("images/sg170.jpg"));
        m6.setBounds(280, 400, 170, 255);
        m6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m6.addActionListener(this);
        m6lbl = new JButton("Squid Game");
        m6lbl.setBounds(260, 660, 200, 35);
        m6lbl.setFont(new Font("serif", Font.PLAIN, 23));
		m6lbl.setForeground(new Color(211,211,211));
		m6lbl.setContentAreaFilled(false);
        m6lbl.setFocusPainted(false);
        m6lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        m6lbl.setBorder(BorderFactory.createEmptyBorder());
		m6lbl.addActionListener(this);
		
		
		
		//MOVIE 7
		m7 = new JButton();
        m7.setIcon(new ImageIcon("images/tgf170.jpg"));
        m7.setBounds(500, 400, 170, 255);
        m7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m7.addActionListener(this);
        m7lbl = new JButton("The Godfather");
        m7lbl.setBounds(480, 660, 200, 35);
        m7lbl.setFont(new Font("serif", Font.PLAIN, 23));
		m7lbl.setForeground(new Color(211,211,211));
		m7lbl.setContentAreaFilled(false);
        m7lbl.setFocusPainted(false);
        m7lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        m7lbl.setBorder(BorderFactory.createEmptyBorder());
		m7lbl.addActionListener(this);
		
		
		
		//MOVIE 8
		m8 = new JButton();
        m8.setIcon(new ImageIcon("images/tlk170.jpg"));
        m8.setBounds(720, 400, 170, 255);
        m8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m8.addActionListener(this);
        m8lbl = new JButton("The Lion King");
        m8lbl.setBounds(700, 660, 200, 35);
        m8lbl.setFont(new Font("serif", Font.PLAIN, 23));
		m8lbl.setForeground(new Color(211,211,211));
		m8lbl.setContentAreaFilled(false);
        m8lbl.setFocusPainted(false);
        m8lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        m8lbl.setBorder(BorderFactory.createEmptyBorder());
		m8lbl.addActionListener(this);
		
		
		
		//MOVIE 9
		m9 = new JButton();
        m9.setIcon(new ImageIcon("images/tp170.jpg"));
        m9.setBounds(940, 400, 170, 255);
        m9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m9.addActionListener(this);
        m9lbl = new JButton("The Painist");
        m9lbl.setBounds(940, 660, 200, 35);
        m9lbl.setFont(new Font("serif", Font.PLAIN, 23));
		m9lbl.setForeground(new Color(211,211,211));
		m9lbl.setContentAreaFilled(false);
        m9lbl.setFocusPainted(false);
        m9lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        m9lbl.setBorder(BorderFactory.createEmptyBorder());
		m9lbl.addActionListener(this);
		
		
		
		//MOVIE 10
		m10 = new JButton();
        m10.setIcon(new ImageIcon("images/aend170.jpg"));
        m10.setBounds(1160, 400, 170, 255);
        m10.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m10.addActionListener(this);
        m10lbl = new JButton("Avenger-Endgame");
        m10lbl.setBounds(1140, 660, 200, 35);
        m10lbl.setFont(new Font("serif", Font.PLAIN, 23));
		m10lbl.setForeground(new Color(211,211,211));
		m10lbl.setContentAreaFilled(false);
        m10lbl.setFocusPainted(false);
        m10lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        m10lbl.setBorder(BorderFactory.createEmptyBorder());
		m10lbl.addActionListener(this);
		
		
		
		
		//BACK BUTTON
		udashbackbtn = new JButton("BACK");
		udashbackbtn.setBounds(03,700,100,30);
		udashbackbtn.setForeground(new Color(255,255,255));
		udashbackbtn.setBackground(new Color(0,0,0));
		udashbackbtn.setFocusPainted(false);
		udashbackbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		udashbackbtn.addActionListener(this);
		
		
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
        userdashpanel.setBounds(240,70,1102,630);
        userdashpanel.setBackground(new Color(37,37,37,210));
		
		//PANEL 2
		userdashpanel2 = new JPanel();
        userdashpanel2.setBounds(10,70,220,630);
        userdashpanel2.setBackground(new Color(37,37,37,210));
		
		
		
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
		Frame6.add(out);
		Frame6.add(m1);
		Frame6.add(m1lbl);
		Frame6.add(m2);
		Frame6.add(m2lbl);
		Frame6.add(m3);
		Frame6.add(m3lbl);
		Frame6.add(m4);
		Frame6.add(m4lbl);
		Frame6.add(m5);
		Frame6.add(m5lbl);
		Frame6.add(m6);
		Frame6.add(m6lbl);
		Frame6.add(m7);
		Frame6.add(m7lbl);
		Frame6.add(m8);
		Frame6.add(m8lbl);
		Frame6.add(m9);
		Frame6.add(m9lbl);
		Frame6.add(m10);
		Frame6.add(m10lbl);
		Frame6.add(udashbackbtn);
		Frame6.add(exit6);
		Frame6.add(pageName6);
		Frame6.add(userdashpanel);
		Frame6.add(userdashpanel2);
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
		
		if(e.getSource()==udashbackbtn)
		{
			new Login();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==m1 || e.getSource()==m1lbl)
		{
			new M1click();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==m2 || e.getSource()==m2lbl)
		{
			new M2click();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==m3 || e.getSource()==m3lbl)
		{
			new M3click();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==m4 || e.getSource()==m4lbl)
		{
			new M4click();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==m5 || e.getSource()==m5lbl)
		{
			new M5click();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==m6 || e.getSource()==m6lbl)
		{
			new M6click();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==m7 || e.getSource()==m7lbl)
		{
			new M7click();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==m8 || e.getSource()==m8lbl)
		{
			new M8click();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==m9 || e.getSource()==m9lbl)
		{
			new M9click();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==m10 || e.getSource()==m10lbl)
		{
			new M10click();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==moviebtn)
		{
			new Moviedashboard();
			Frame6.setVisible(false);
		}
		else if(e.getSource()==seriesbtn)
		{
			new Seriesdashboard();
			Frame6.setVisible(false);
		}
		else if(e.getSource()==popbtn)
		{
			new Populardashboard();
			Frame6.setVisible(false);
		}
		else if(e.getSource()==reqbtn)
		{
			new Request();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==listbtn)
		{
			new Notice();
			Frame6.setVisible(false);
		}
		else if(e.getSource()==nmbtn)
		{
			
			new Upcoming();
			Frame6.setVisible(false);
			
		}
		else if(e.getSource()==upcbtn)
		{
			new Needhelp();
			Frame6.setVisible(false);
		}

		else if(e.getSource()==out)
		{
			new Login();
			Frame6.setVisible(false);
		}
		
		else if(e.getSource()==s)
		{
			String x = searchf.getText().toLowerCase();
			String x1= "forrest gump";
			String x2= "evil dead";
			String x3= "spiderman nwh";
			String x4= "breaking bad";
			String x5= "money heist";
			String x6= "squid game";
			String x7= "the godfather";
			String x8= "the lion king";
			String x9= "the painist";
			String x10= "avenger endgame";
			String y1= "old boy";
			String y2= "3 idiots";
			String y3= "argentina 1985";
			String y4= "triangle of sadness";
			String y5= "the fault in our stars";
			String y6= "a beautiful mind";
			String y7= "parasite";
			String y8= "psycho";
			String y9= "joker";
			String y10= "the beast";
			String y11= "1971";
			String y12= "the conjuring";
			String z1= "wednwssday";
			String z2= "game of thrones";
			String z3= "hide and seek";
			String z4= "first love";
			String z5= "hign school";
			String z6= "the watcher";
			String z7= "friends";
			String z8= "peaky blinders";
			String z9= "dexter";
			String z10= "kota factory";
			String z11= "hannibbal";
			String z12= "all of us are dead";
			
			
			
			String p1= "schinndlers list";
			String p2= "interstellar";
			String p3= "goodfellas";
			String p4= "the green mile";
			String p5= "life is beautiful";
			String p6= "chernobyl";
			String p7= "sherlock";
			String p8= "gladiator";
			String p9= "madmen";
			String p10= "12 angry men";
			String p11= "the shawshank redemption";
			String p12= "daredevil";
			if(x.equals(x1))
			{
				new M1click();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(x2))
			{
				new M2click();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(x3))
			{
				new M3click();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(x4))
			{
				new M4click();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(x5))
			{
				new M5click();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(x6))
			{
				new M6click();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(x7))
			{
				new M7click();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(x8))
			{
				new M8click();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(x9))
			{
				new M9click();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(x10))
			{
				new M10click();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(y1))
			{
				new M1clickmovie();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(y2))
			{
				new M2clickmovie();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(y3))
			{
				new M3clickmovie();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(y4))
			{
				new M4clickmovie();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(y5))
			{
				new M5clickmovie();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(y6))
			{
				new M6clickmovie();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(y7))
			{
				new M7clickmovie();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(y8))
			{
				new M8clickmovie();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(y9))
			{
				new M9clickmovie();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(y10))
			{
				new M10clickmovie();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(y11))
			{
				new M11clickmovie();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(y12))
			{
				new M12clickmovie();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(z1))
			{
				new M1clickseries();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(z2))
			{
				new M2clickseries();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(z3))
			{
				new M3clickseries();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(z4))
			{
				new M4clickseries();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(z5))
			{
				new M5clickseries();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(z6))
			{
				new M6clickseries();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(z7))
			{
				new M7clickseries();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(z8))
			{
				new M8clickseries();
				Frame6.setVisible(false);
			}
			else if(x.equals(z9))
			{
				new M9clickseries();
				Frame6.setVisible(false);
			}
			else if(x.equals(z10))
			{
				new M10clickseries();
				Frame6.setVisible(false);
			}
			else if(x.equals(z11))
			{
				new M11clickseries();
				Frame6.setVisible(false);
			}
			else if(x.equals(z12))
			{
				new M12clickseries();
				Frame6.setVisible(false);
			}
			else if(x.equals(p1))
			{
				new M1clickpop();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(p2))
			{
				new M2clickpop();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(p3))
			{
				new M3clickpop();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(p4))
			{
				new M4clickpop();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(p5))
			{
				new M5clickpop();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(p6))
			{
				new M6clickpop();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(p7))
			{
				new M7clickpop();
				Frame6.setVisible(false);
			}
			
			else if(x.equals(p8))
			{
				new M8clickpop();
				Frame6.setVisible(false);
			}
			else if(x.equals(p9))
			{
				new M9clickpop();
				Frame6.setVisible(false);
			}
			else if(x.equals(p10))
			{
				new M10clickpop();
				Frame6.setVisible(false);
			}
			else if(x.equals(p11))
			{
				new M11clickpop();
				Frame6.setVisible(false);
			}
			else if(x.equals(p12))
			{
				new M12clickpop();
				Frame6.setVisible(false);
			}
			else if(x.isEmpty()==true)
			{
				showMessageDialog(null, "Please fill up fields and try again.", "Error!", JOptionPane.WARNING_MESSAGE);
			}
			else 
			{
				showMessageDialog(null, "Content Not Found", "Error!", JOptionPane.WARNING_MESSAGE);

			}
			
			
		} 

		
		else if(e.getSource()==exit6)
		{
			System.exit(0);
		}
		
	}
}