package classes;

import movieclasses.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.*;
import java.nio.file.*;


public class Login implements ActionListener{
	
	JFrame Frame1;
	private ImageIcon Homeicon1, bg1;
	private JPanel lgnpanel;
	private JLabel pageName1, sgnlabel, ulabel, plabel, background1, nmovieflix;
	private JTextField utf;
	private JPasswordField pf;
	private JButton sgninbtn, sgnupbtn, forgetbtn, backbtn, adminbtn, exit1;
	private JCheckBox rememberme;
	
	protected static String uprofile;
	
	

	public Login()
	{
		
		
		Frame1 = new JFrame("MOVIEFLIX");
		
		//LOGO
		Homeicon1 = new ImageIcon("images/logo.png");
		Frame1.setIconImage(Homeicon1.getImage());
		
		
		//PROJECT NAME
		pageName1 = new JLabel("MOVIEFLIX");
		pageName1.setBounds(40,30,400,30);
		pageName1.setForeground(new Color(255,0,0));
		pageName1.setFont(new Font("serif",Font.PLAIN,35));
		
		
		
		
		//SIGN IN
		sgnlabel = new JLabel("Sign In");
		sgnlabel.setBounds(530,120,200,48);
		sgnlabel.setForeground(new Color(255,255,255));
		sgnlabel.setFont(new Font("serif",Font.PLAIN,40));
		
		
		
		//USER NAME
		ulabel = new JLabel("Username");
		ulabel.setBounds(530,205,200,30);
		ulabel.setForeground(new Color(211,211,211));
		ulabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//USER TEXT FIELD
		utf = new JTextField();
		utf.setBounds(530,245,300,40);
		utf.setForeground(new Color(0,0,0));
		utf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//PASSWORD
		plabel = new JLabel("Password");
		plabel.setBounds(530,295,200,25);
		plabel.setForeground(new Color(211,211,211));
		plabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//PASS FIELD
		pf = new JPasswordField();
		pf.setBounds(530,335,300,40);
		pf.setForeground(new Color(0,0,0));
		pf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//SIGN IN BUTTON
		sgninbtn = new JButton("Sign In");
		sgninbtn.setBounds(530,440,300,40);
		sgninbtn.setForeground(new Color(255,255,255));
		sgninbtn.setBackground(new Color(255,0,0));
		sgninbtn.setFont(new Font("serif",Font.PLAIN,20));
		sgninbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		sgninbtn.setFocusPainted(false);
		sgninbtn.addActionListener(this);
		
		
		
		//FORGET BUTTON
		forgetbtn = new JButton("Forgot Password?");
		forgetbtn.setBounds(680,490,170,24);
		forgetbtn.setForeground(new Color(211,211,211));
		forgetbtn.setFont(new Font("serif",Font.PLAIN,18));
		forgetbtn.setFocusPainted(false);
		forgetbtn.setContentAreaFilled(false);
		forgetbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		forgetbtn.setBorder(BorderFactory.createEmptyBorder());
		forgetbtn.addActionListener(this);
		
		
		
		
		
		//CHECK BOX
		rememberme = new JCheckBox("Remember me");
		rememberme.setBounds(530,490,130,22);
		rememberme.setForeground(new Color(211,211,211));
		rememberme.setFont(new Font("serif",Font.PLAIN,18));
		rememberme.setFocusPainted(false);
		rememberme.setContentAreaFilled(false);
		rememberme.setBorder(BorderFactory.createEmptyBorder());
		
		
		
		//LAST LABEL
		nmovieflix = new JLabel("New to Movieflix?");
		nmovieflix.setBounds(530,560,160,25);
		nmovieflix.setForeground(new Color(211,211,211));
		nmovieflix.setFont(new Font("serif",Font.PLAIN,18));
		
		
		
		//SIGN UP BUTTON
		sgnupbtn = new JButton("Sign up now");
		sgnupbtn.setBounds(670,560,105,25);
		sgnupbtn.setForeground(new Color(255,255,255));
		sgnupbtn.setFont(new Font("serif",Font.PLAIN,20));
		sgnupbtn.setFocusPainted(false);
		sgnupbtn.setContentAreaFilled(false);
		sgnupbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		sgnupbtn.setBorder(BorderFactory.createEmptyBorder());
		sgnupbtn.addActionListener(this);
		
		
		
		//BACK BUTTON
		backbtn = new JButton("BACK");
		backbtn.setBounds(1250,5,100,30);
		backbtn.setFocusPainted(false);
		backbtn.setForeground(new Color(255,255,255));
		backbtn.setBackground(new Color(0,0,0));
		backbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		backbtn.addActionListener(this);
		
		
		
		//EXIT BUTTON
		exit1 = new JButton("Exit");
		exit1.setBounds(1250,700,100,30);
		exit1.setForeground(new Color(255,255,255));
		exit1.setBackground(new Color(0,0,0));
		exit1.setFocusPainted(false);
		exit1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit1.addActionListener(this);
		
		
		
		//ADMIN BUTTON
        adminbtn = new JButton("*ADMIN*");
        adminbtn.setBounds(1,690,120,19);
        adminbtn.setForeground(new Color(255,255,255));
        adminbtn.setFont(new Font("serif",Font.PLAIN,15));
        adminbtn.setFocusPainted(false);
        adminbtn.setContentAreaFilled(false);
        adminbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        adminbtn.setBorder(BorderFactory.createEmptyBorder());
		adminbtn.addActionListener(this);
		
		
		
		//PANEL
		lgnpanel  = new JPanel();
        lgnpanel.setBounds(480,50,400,630);
        lgnpanel.setBackground(new Color(0,0,0,170));
        
		
		
		
		//BACKGROUND IMAGE
		bg1 = new ImageIcon("images/loginpageBG.jpg");
		background1 = new JLabel();
		background1.setIcon(bg1);
		background1.setBounds(0,0,1366,768);
		
		
		
		//adding
		Frame1.add(pageName1);
		Frame1.add(sgnlabel);
		Frame1.add(ulabel);
		Frame1.add(utf);
		Frame1.add(plabel);
		Frame1.add(pf);
		Frame1.add(sgninbtn);
		Frame1.add(forgetbtn);
		Frame1.add(rememberme);
		Frame1.add(nmovieflix);
		Frame1.add(sgnupbtn);
		Frame1.add(backbtn);
		Frame1.add(adminbtn);
		Frame1.add(lgnpanel);
		Frame1.add(exit1);
		Frame1.add(background1);
		
		
		
		
		
		Frame1.setIconImage(Homeicon1.getImage());
		Frame1.setSize(1366,768);
		Frame1.setLayout(null);
		Frame1.setLocationRelativeTo(null);
		Frame1.setResizable(false);
		Frame1.setDefaultCloseOperation(Frame1.EXIT_ON_CLOSE);
		Frame1.setVisible(true);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
		if(e.getSource()==sgninbtn)
		{
			String uname = utf.getText().toLowerCase();
			String upass = pf.getText();
			
			//For showing the name on Dashboard
			uprofile=uname;
			
			if(uname.isEmpty()==true || upass.isEmpty()==true)
			{
				showMessageDialog(null, "Please fill in all of the fields and try again.", "Error!", JOptionPane.WARNING_MESSAGE);
			}
			
			else{
				
				try{
					
					String usernames = "Username: "+uname;
					String passwords = "Password: "+upass;
					BufferedReader br = new BufferedReader(new FileReader("data\\user\\user_login.txt"));
					
					int flag = 0;
					int totallines = 0;
					while(br.readLine()!=null)
					{
						totallines++;
					}
					
						br.close();
					
					for(int i = 0; i < totallines; i++)
					{
						String line = Files.readAllLines(Paths.get("data\\user\\user_login.txt")).get(i);
						if(line.equals(usernames))
						{
							String line1 = Files.readAllLines(Paths.get("data\\user\\user_login.txt")).get((i + 1));
							
							if(line1.equals(passwords))
							{
								Frame1.setVisible(false);
								new Userdashboard();
								flag = 1;
							}
							
						}
						
					}
					
					if(flag==0)
					{
						showMessageDialog(null, "Invalid User Name or Password!", "Warning!", JOptionPane.WARNING_MESSAGE);
					}
					
				}
				
				catch(Exception iox)
				{
					showMessageDialog(null, "User Database not found!", "Not Found!", 2);
				}
				
				
			}
			
		}
		
		
		else if(e.getSource()==backbtn)
		{
			new Welcome();
			Frame1.setVisible(false);
		}
		else if(e.getSource()==exit1)
		{
			System.exit(0);
		}
		else if(e.getSource()==sgnupbtn)
		{
			new Signup();
			Frame1.setVisible(false);
		}
		else if(e.getSource()==forgetbtn)
		{
			new Forget();
			Frame1.setVisible(false);
		}
		else if(e.getSource()==adminbtn)
		{
			new Adminlogin();
			Frame1.setVisible(false);
		}
	}
	
	
}