package classes;
import movieclasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;


import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class Upcoming implements ActionListener{
	
	JFrame Frame;
	
	private JLabel  background,pageName,lbl;
	private JButton backbtn, exitbtn,searchlbl,moviebtn,seriesbtn,reqbtn,popbtn,s;
	private JTextField searchf;
	private ImageIcon Homeicon, bg;
	private JPanel panel1,panel2;
	
	private DefaultTableModel model;
	private JTable table;
	private JScrollPane scroll;
	private String[] column = { "Movie Name", "Genre", "Release Year"};
    private String[] rows = new String[4];
	
	
	public Upcoming()
	{
		
		Frame = new JFrame("MOVIEFLIX");
		
		
		
		//LOGO
		Homeicon = new ImageIcon("images/logo.png");
		
		//PROJECT NAME
		pageName = new JLabel("MOVIEFLIX");
		pageName.setBounds(15,18,400,30);
		pageName.setForeground(new Color(255,0,0));
		pageName.setFont(new Font("serif",Font.PLAIN,35));
		
		
		//PROJECT NAME
		lbl = new JLabel("UPCOMING");
		lbl.setBounds(570,90,400,40);
		lbl.setForeground(new Color(255,255,255));
		lbl.setFont(new Font("serif",Font.PLAIN,28));
		
		
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
		
		s = new JButton("0");
		s.setBounds(740,18,34,34);
		s.setForeground(new Color(0,0,0));
		s.setBackground(new Color(211,211,211));
		s.setCursor(new Cursor(Cursor.HAND_CURSOR));
		s.addActionListener(this);
		Frame.add(s);
		
		
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
		
		
		
		
		table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setBackground(new Color(220,220,220));
		table.setFont(new Font("arial",Font.PLAIN,20));
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setEnabled(false);
        table.getColumnModel().getColumn(0).setPreferredWidth(300);
        table.getColumnModel().getColumn(1).setPreferredWidth(300);
        table.getColumnModel().getColumn(2).setPreferredWidth(250);

        scroll = new JScrollPane(table);
        scroll.setBounds(320, 150, 680, 450);
		scroll.getViewport().setBackground(new Color(195,195,195));
        Frame.add(scroll);
		
		 String file = "data\\user\\upcoming_movies.txt";

        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
			{
                totalLines++;
			}
            reader.close();

            for (int i = 0; i < totalLines; i++)
			{
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 5);
                if (x.equals("Movie"))
				{
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12); // Movie Name 
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(7); // Genre
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(14); // Release Year
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
			ex.printStackTrace();
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		//*****************************************************
		
		
		//BACK BUTTON
		backbtn = new JButton("Back");
		backbtn.setBounds(03,700,100,30);
		backbtn.setForeground(new Color(255,255,255));
		backbtn.setBackground(new Color(0,0,0));
		backbtn.setFocusPainted(false);
		backbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		backbtn.addActionListener(this);
		
		
		
		//EXIT BUTTON
		exitbtn = new JButton("Exit");
		exitbtn.setBounds(1250,700,100,30);
		exitbtn.setForeground(new Color(255,255,255));
		exitbtn.setBackground(new Color(0,0,0));
		exitbtn.setFocusPainted(false);
		exitbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exitbtn.addActionListener(this);
		
		
		
		
		//PANEL 1
		panel1 = new JPanel();
        panel1.setBounds(0,0,1366,70);
        panel1.setBackground(new Color(37,37,37,210));
		//PANEL
		panel2 = new JPanel();
        panel2.setBounds(145,80,1060,620);
        panel2.setBackground(new Color(37,37,37,210));
		
		//BACKGROUND IMAGE
		bg = new ImageIcon("images/welcomeBG.jpg");
		background = new JLabel();
		background.setIcon(bg);
		background.setBounds(0,0,1366,768);
		
		
		//ADDING COMPONENTS
		Frame.add(pageName);
		Frame.add(searchlbl);
		Frame.add(lbl);
		Frame.add(searchf);
		Frame.add(seriesbtn);
		Frame.add(moviebtn);
		Frame.add(reqbtn);
		Frame.add(popbtn);
		Frame.add(backbtn);
		Frame.add(exitbtn);
		Frame.add(panel1);
		Frame.add(panel2);
		Frame.add(background);
		
		
		
		Frame.setIconImage(Homeicon.getImage());
		Frame.setSize(1366,768);
		Frame.setLayout(null);
		Frame.setLocationRelativeTo(null);
		Frame.setResizable(false);
		Frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		Frame.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==backbtn)
		{
			new Userdashboard();
			Frame.setVisible(false);
			
		}
		else if(e.getSource()==moviebtn)
		{
			new Moviedashboard();
			Frame.setVisible(false);
		}
		else if(e.getSource()==seriesbtn)
		{
			new Seriesdashboard();
			Frame.setVisible(false);
		}
		else if(e.getSource()==popbtn)
		{
			new Populardashboard();
			Frame.setVisible(false);
		}
		else if(e.getSource()==reqbtn)
		{
			new Request();
			Frame.setVisible(false);
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
				Frame.setVisible(false);
			}
			
			else if(x.equals(x2))
			{
				new M2click();
				Frame.setVisible(false);
			}
			
			else if(x.equals(x3))
			{
				new M3click();
				Frame.setVisible(false);
			}
			
			else if(x.equals(x4))
			{
				new M4click();
				Frame.setVisible(false);
			}
			
			else if(x.equals(x5))
			{
				new M5click();
				Frame.setVisible(false);
			}
			
			else if(x.equals(x6))
			{
				new M6click();
				Frame.setVisible(false);
			}
			
			else if(x.equals(x7))
			{
				new M7click();
				Frame.setVisible(false);
			}
			
			else if(x.equals(x8))
			{
				new M8click();
				Frame.setVisible(false);
			}
			
			else if(x.equals(x9))
			{
				new M9click();
				Frame.setVisible(false);
			}
			
			else if(x.equals(x10))
			{
				new M10click();
				Frame.setVisible(false);
			}
			
			else if(x.equals(y1))
			{
				new M1clickmovie();
				Frame.setVisible(false);
			}
			
			else if(x.equals(y2))
			{
				new M2clickmovie();
				Frame.setVisible(false);
			}
			
			else if(x.equals(y3))
			{
				new M3clickmovie();
				Frame.setVisible(false);
			}
			
			else if(x.equals(y4))
			{
				new M4clickmovie();
				Frame.setVisible(false);
			}
			
			else if(x.equals(y5))
			{
				new M5clickmovie();
				Frame.setVisible(false);
			}
			
			else if(x.equals(y6))
			{
				new M6clickmovie();
				Frame.setVisible(false);
			}
			
			else if(x.equals(y7))
			{
				new M7clickmovie();
				Frame.setVisible(false);
			}
			
			else if(x.equals(y8))
			{
				new M8clickmovie();
				Frame.setVisible(false);
			}
			
			else if(x.equals(y9))
			{
				new M9clickmovie();
				Frame.setVisible(false);
			}
			
			else if(x.equals(y10))
			{
				new M10clickmovie();
				Frame.setVisible(false);
			}
			
			else if(x.equals(y11))
			{
				new M11clickmovie();
				Frame.setVisible(false);
			}
			
			else if(x.equals(y12))
			{
				new M12clickmovie();
				Frame.setVisible(false);
			}
			
			else if(x.equals(z1))
			{
				new M1clickseries();
				Frame.setVisible(false);
			}
			
			else if(x.equals(z2))
			{
				new M2clickseries();
				Frame.setVisible(false);
			}
			
			else if(x.equals(z3))
			{
				new M3clickseries();
				Frame.setVisible(false);
			}
			
			else if(x.equals(z4))
			{
				new M4clickseries();
				Frame.setVisible(false);
			}
			
			else if(x.equals(z5))
			{
				new M5clickseries();
				Frame.setVisible(false);
			}
			
			else if(x.equals(z6))
			{
				new M6clickseries();
				Frame.setVisible(false);
			}
			
			else if(x.equals(z7))
			{
				new M7clickseries();
				Frame.setVisible(false);
			}
			
			else if(x.equals(z8))
			{
				new M8clickseries();
				Frame.setVisible(false);
			}
			else if(x.equals(z9))
			{
				new M9clickseries();
				Frame.setVisible(false);
			}
			else if(x.equals(z10))
			{
				new M10clickseries();
				Frame.setVisible(false);
			}
			else if(x.equals(z11))
			{
				new M11clickseries();
				Frame.setVisible(false);
			}
			else if(x.equals(z12))
			{
				new M12clickseries();
				Frame.setVisible(false);
			}
			else if(x.equals(p1))
			{
				new M1clickpop();
				Frame.setVisible(false);
			}
			
			else if(x.equals(p2))
			{
				new M2clickpop();
				Frame.setVisible(false);
			}
			
			else if(x.equals(p3))
			{
				new M3clickpop();
				Frame.setVisible(false);
			}
			
			else if(x.equals(p4))
			{
				new M4clickpop();
				Frame.setVisible(false);
			}
			
			else if(x.equals(p5))
			{
				new M5clickpop();
				Frame.setVisible(false);
			}
			
			else if(x.equals(p6))
			{
				new M6clickpop();
				Frame.setVisible(false);
			}
			
			else if(x.equals(p7))
			{
				new M7clickpop();
				Frame.setVisible(false);
			}
			
			else if(x.equals(p8))
			{
				new M8clickpop();
				Frame.setVisible(false);
			}
			else if(x.equals(p9))
			{
				new M9clickpop();
				Frame.setVisible(false);
			}
			else if(x.equals(p10))
			{
				new M10clickpop();
				Frame.setVisible(false);
			}
			else if(x.equals(p11))
			{
				new M11clickpop();
				Frame.setVisible(false);
			}
			else if(x.equals(p12))
			{
				new M12clickpop();
				Frame.setVisible(false);
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
		
		else if(e.getSource()==exitbtn)
		{
			System.exit(0);
		}
		
	}
	
	
}