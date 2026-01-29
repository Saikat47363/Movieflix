package movieclasses;
import classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.nio.file.*;
import java.io.*;


public class M11clickpop implements ActionListener
{
	JFrame Framem1;
	private ImageIcon Homeiconm1, bgm1;
	private JLabel backgroundm1, pageNamem1,movielbl,imdblbl,releaselbl,genrelbl;
	private JTextField m1searchf,moviename,imdb, release,genre;
	private JButton m1searchlbl,m1moviebtn,m1seriesbtn,m1reqbtn,m1backbtn,exitm1,s,m1popbtn,m1,m1lbl,m2,m2lbl,addlistbtn;
	private JPanel m1panel,m1panel3;
	
	public M11clickpop()
	{
		
		Framem1 = new JFrame();
		
		//LOGO
		Homeiconm1 = new ImageIcon("images/logo.png");
		
		//PROJECT NAME
		pageNamem1 = new JLabel("MOVIEFLIX");
		pageNamem1.setBounds(15,18,400,30);
		pageNamem1.setForeground(new Color(255,0,0));
		pageNamem1.setFont(new Font("serif",Font.PLAIN,35));
		
		
		//SEARCH BUTTON
		m1searchlbl = new JButton("Search");
		m1searchlbl.setBounds(340,18,80,34);
		m1searchlbl.setForeground(new Color(211,211,211));
		m1searchlbl.setFont(new Font("serif",Font.PLAIN,25));
		m1searchlbl.setBorder(BorderFactory.createEmptyBorder());
		m1searchlbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m1searchlbl.setContentAreaFilled(false);
		m1searchlbl.setFocusPainted(false);
		
		
		//SEARCH FIELD
		m1searchf = new JTextField();
		m1searchf.setBounds(430,18,300,34);
		m1searchf.setForeground(new Color(255,255,255));
		m1searchf.setBackground(new Color(211,211,211));
		m1searchf.setBorder(BorderFactory.createEmptyBorder());
		m1searchf.setFont(new Font("serif",Font.PLAIN,18));
		
		s = new JButton("0");
		s.setBounds(740,18,34,34);
		s.setForeground(new Color(0,0,0));
		s.setBackground(new Color(211,211,211));
		s.setCursor(new Cursor(Cursor.HAND_CURSOR));
		s.addActionListener(this);
		Framem1.add(s);
		
		//MOVIE BUTTON
		m1moviebtn = new JButton("Movies");
		m1moviebtn.setBounds(850,18,75,34);
		m1moviebtn.setForeground(new Color(211,211,211));
		m1moviebtn.setFont(new Font("serif",Font.PLAIN,20));
		m1moviebtn.setBorder(BorderFactory.createEmptyBorder());
		m1moviebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m1moviebtn.setContentAreaFilled(false);
		m1moviebtn.setFocusPainted(false);
		m1moviebtn.addActionListener(this);

		
		//TV SERIES BUTTON
		m1seriesbtn = new JButton("TV Shows");
		m1seriesbtn.setBounds(935,18,90,34);
		m1seriesbtn.setForeground(new Color(211,211,211));
		m1seriesbtn.setFont(new Font("serif",Font.PLAIN,20));
		m1seriesbtn.setBorder(BorderFactory.createEmptyBorder());
		m1seriesbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m1seriesbtn.setContentAreaFilled(false);
		m1seriesbtn.setFocusPainted(false);
		m1seriesbtn.addActionListener(this);

		
		//NEW AND POPULAR BUTTON
		m1popbtn = new JButton("Popular");
		m1popbtn.setBounds(1030,18,90,34);
		m1popbtn.setForeground(new Color(211,211,211));
		m1popbtn.setFont(new Font("serif",Font.PLAIN,20));
		m1popbtn.setBorder(BorderFactory.createEmptyBorder());
		m1popbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m1popbtn.setContentAreaFilled(false);
		m1popbtn.setFocusPainted(false);
		m1popbtn.addActionListener(this);
		
		
		//REQUEST BUTTON
		m1reqbtn = new JButton("Request");
		m1reqbtn.setBounds(1110,18,100,34);
		m1reqbtn.setForeground(new Color(211,211,211));
		m1reqbtn.setFont(new Font("serif",Font.PLAIN,20));
		m1reqbtn.setBorder(BorderFactory.createEmptyBorder());
		m1reqbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m1reqbtn.setContentAreaFilled(false);
		m1reqbtn.setFocusPainted(false);
		m1reqbtn.addActionListener(this);
		

		
		
		//MOVIE 1
		m1 = new JButton();
        m1.setIcon(new ImageIcon("images/tsr230.jpg"));
        m1.setBounds(350, 150, 230, 355);
        m1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        m1lbl = new JButton("The Shawshank Redemption");
        m1lbl.setBounds(370, 520, 200, 35);
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
		
		moviename = new JTextField("The Shawshank Redemption");
		moviename.setBounds(770,180,300,34);
		moviename.setForeground(new Color(211,211,211));
		moviename.setBackground(new Color(37,37,37));
		moviename.setBorder(BorderFactory.createEmptyBorder());
		moviename.setFont(new Font("serif",Font.PLAIN,25));
		
		
		imdblbl = new JLabel("Ratings");
		imdblbl.setBounds(650,230,100,34);
		imdblbl.setForeground(new Color(211,211,211));
		imdblbl.setFont(new Font("serif",Font.PLAIN,25));
		
		imdb = new JTextField("9.3 star");
		imdb.setBounds(770,230,300,34);
		imdb.setForeground(new Color(211,211,211));
		imdb.setBackground(new Color(37,37,37));
		imdb.setBorder(BorderFactory.createEmptyBorder());
		imdb.setFont(new Font("serif",Font.PLAIN,23));
		
		releaselbl = new JLabel("Year");
		releaselbl.setBounds(650,280,100,34);
		releaselbl.setForeground(new Color(211,211,211));
		releaselbl.setFont(new Font("serif",Font.PLAIN,25));
		
		release = new JTextField("1994");
		release.setBounds(770,280,300,34);
		release.setForeground(new Color(211,211,211));
		release.setBackground(new Color(37,37,37));
		release.setBorder(BorderFactory.createEmptyBorder());
		release.setFont(new Font("serif",Font.PLAIN,23));
		
		genrelbl = new JLabel("Genre");
		genrelbl.setBounds(650,330,100,34);
		genrelbl.setForeground(new Color(211,211,211));
		genrelbl.setFont(new Font("serif",Font.PLAIN,25));
		
		genre = new JTextField("Drama");
		genre.setBounds(770,330,300,34);
		genre.setForeground(new Color(211,211,211));
		genre.setBackground(new Color(37,37,37));
		genre.setBorder(BorderFactory.createEmptyBorder());
		genre.setFont(new Font("serif",Font.PLAIN,23));
		
		
		//DOWNLOAD BUTTON
		addlistbtn = new JButton("Download");
		addlistbtn.setBounds(770,450,200,40);
		addlistbtn.setForeground(new Color(255,255,255));
		addlistbtn.setBackground(new Color(255,0,0));
		addlistbtn.setFont(new Font("serif",Font.PLAIN,23));
		addlistbtn.setFocusPainted(false);
		addlistbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		addlistbtn.addActionListener(this);
		
		//BACK BUTTON
		m1backbtn = new JButton("BACK");
		m1backbtn.setBounds(03,700,100,30);
		m1backbtn.setForeground(new Color(255,255,255));
		m1backbtn.setBackground(new Color(0,0,0));
		m1backbtn.setFocusPainted(false);
		m1backbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		m1backbtn.addActionListener(this);
		
		
		//EXIT BUTTON
		exitm1 = new JButton("EXIT");
		exitm1.setBounds(1250,700,100,30);
		exitm1.setForeground(new Color(255,255,255));
		exitm1.setBackground(new Color(0,0,0));
		exitm1.setFocusPainted(false);
		exitm1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exitm1.addActionListener(this);
		
		
		//PANEL
		m1panel = new JPanel();
        m1panel.setBounds(145,80,1060,620);
        m1panel.setBackground(new Color(37,37,37,210));
		//PANEL 3
		m1panel3 = new JPanel();
        m1panel3.setBounds(0,0,1366,70);
        m1panel3.setBackground(new Color(37,37,37,210));
		
		
		
		//BACKGROUND IMAGE
		bgm1 = new ImageIcon("images/userbg.jpg");
		backgroundm1 = new JLabel();
		backgroundm1.setIcon(bgm1);
		backgroundm1.setBounds(0,0,1366,768);
		
		//ADDING COMPONENTS
		Framem1.add(m1searchlbl);
		Framem1.add(m1moviebtn);
		Framem1.add(m1searchf);
		Framem1.add(m1seriesbtn);
		Framem1.add(m1reqbtn);
		Framem1.add(m1popbtn);
		Framem1.add(m1);
		Framem1.add(m1lbl);
		Framem1.add(movielbl);
		Framem1.add(moviename);
		Framem1.add(imdblbl);
		Framem1.add(imdb);
		Framem1.add(releaselbl);
		Framem1.add(release);
		Framem1.add(genrelbl);
		Framem1.add(genre);
		Framem1.add(addlistbtn);
		Framem1.add(m1backbtn);
		Framem1.add(exitm1);
		Framem1.add(pageNamem1);
		Framem1.add(m1panel);
		Framem1.add(m1panel3);
		Framem1.add(backgroundm1);
		
		
		
	
		Framem1.setIconImage(Homeiconm1.getImage());
		Framem1.setSize(1366,768);
		Framem1.setLayout(null);
		Framem1.setLocationRelativeTo(null);
		Framem1.setResizable(false);
		Framem1.setDefaultCloseOperation(Framem1.EXIT_ON_CLOSE);
		Framem1.setVisible(true);
	}



public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==m1backbtn)
		{
			new Populardashboard();
			Framem1.setVisible(false);
		}
		else if(e.getSource()==m1moviebtn)
		{
			new Moviedashboard();
			Framem1.setVisible(false);
		}
		else if(e.getSource()==m1seriesbtn)
		{
			new Seriesdashboard();
			Framem1.setVisible(false);
		}
		else if(e.getSource()==m1popbtn)
		{
			new Populardashboard();
			Framem1.setVisible(false);
		}
		else if(e.getSource()==m1reqbtn)
		{
			new Request();
			Framem1.setVisible(false);
		}
		else if(e.getSource()==s)
		{
			String x = m1searchf.getText().toLowerCase();
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
				Framem1.setVisible(false);
			}
			
			else if(x.equals(x2))
			{
				new M2click();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(x3))
			{
				new M3click();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(x4))
			{
				new M4click();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(x5))
			{
				new M5click();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(x6))
			{
				new M6click();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(x7))
			{
				new M7click();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(x8))
			{
				new M8click();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(x9))
			{
				new M9click();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(x10))
			{
				new M10click();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(y1))
			{
				new M1clickmovie();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(y2))
			{
				new M2clickmovie();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(y3))
			{
				new M3clickmovie();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(y4))
			{
				new M4clickmovie();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(y5))
			{
				new M5clickmovie();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(y6))
			{
				new M6clickmovie();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(y7))
			{
				new M7clickmovie();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(y8))
			{
				new M8clickmovie();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(y9))
			{
				new M9clickmovie();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(y10))
			{
				new M10clickmovie();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(y11))
			{
				new M11clickmovie();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(y12))
			{
				new M12clickmovie();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(z1))
			{
				new M1clickseries();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(z2))
			{
				new M2clickseries();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(z3))
			{
				new M3clickseries();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(z4))
			{
				new M4clickseries();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(z5))
			{
				new M5clickseries();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(z6))
			{
				new M6clickseries();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(z7))
			{
				new M7clickseries();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(z8))
			{
				new M8clickseries();
				Framem1.setVisible(false);
			}
			else if(x.equals(z9))
			{
				new M9clickseries();
				Framem1.setVisible(false);
			}
			else if(x.equals(z10))
			{
				new M10clickseries();
				Framem1.setVisible(false);
			}
			else if(x.equals(z11))
			{
				new M11clickseries();
				Framem1.setVisible(false);
			}
			else if(x.equals(z12))
			{
				new M12clickseries();
				Framem1.setVisible(false);
			}
			else if(x.equals(p1))
			{
				new M1clickpop();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(p2))
			{
				new M2clickpop();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(p3))
			{
				new M3clickpop();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(p4))
			{
				new M4clickpop();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(p5))
			{
				new M5clickpop();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(p6))
			{
				new M6clickpop();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(p7))
			{
				new M7clickpop();
				Framem1.setVisible(false);
			}
			
			else if(x.equals(p8))
			{
				new M8clickpop();
				Framem1.setVisible(false);
			}
			else if(x.equals(p9))
			{
				new M9clickpop();
				Framem1.setVisible(false);
			}
			else if(x.equals(p10))
			{
				new M10clickpop();
				Framem1.setVisible(false);
			}
			else if(x.equals(p11))
			{
				new M11clickpop();
				Framem1.setVisible(false);
			}
			else if(x.equals(p12))
			{
				new M12clickpop();
				Framem1.setVisible(false);
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
		else if(e.getSource()==addlistbtn)
		{
			try{
				
				File dfile = new File("downloads\\The Shawshank Redemption.mp4");
				
				if(!dfile.exists())
				{
					dfile.createNewFile();
				}
				
			}
			
			catch(IOException iox){
				iox.printStackTrace();
				}
				
			showMessageDialog(null, "Download completed.", "Downloaded!", 1);
			
		}


		
		else if(e.getSource()==exitm1)
		{
			System.exit(0);
		}
		
	}
}