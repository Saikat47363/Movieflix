package classes;

import movieclasses.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.*;
import java.nio.file.*;

public class Adminlogin implements ActionListener{
	JFrame Frame3;
	
	private ImageIcon Homeicon3, bg3;
	private JPanel adlgnpanel;
	private JLabel pageName3, adsgnlabel, adulabel, adplabel, background3;
	private JTextField adutf;
	private JPasswordField adpf;
	private JButton adsgninbtn, adbackbtn, exit3, userbtn;
	protected static String aprofile;
	

	public Adminlogin()
	{
		Frame3 = new JFrame("MOVIEFLIX");
		
		
		
		//LOGO
		Homeicon3 = new ImageIcon("images/logo.png");
		
		
		//PROJECT NAME
		pageName3 = new JLabel("MOVIEFLIX");
		pageName3.setBounds(40,30,400,30);
		pageName3.setForeground(new Color(255,0,0));
		pageName3.setFont(new Font("serif",Font.PLAIN,35));
		
		
		
		
		//SIGN IN 
		adsgnlabel = new JLabel("Sign In");
		adsgnlabel.setBounds(530,120,200,48);
		adsgnlabel.setForeground(new Color(255,255,255));
		adsgnlabel.setFont(new Font("serif",Font.PLAIN,40));
		
		
		
		//USER NAME
		adulabel = new JLabel("Username");
		adulabel.setBounds(530,205,200,30);
		adulabel.setForeground(new Color(211,211,211));
		adulabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//ADMIN USER TEXT FIELD
		adutf = new JTextField();
		adutf.setBounds(530,245,300,40);
		adutf.setForeground(new Color(0,0,0));
		adutf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//PASSWORD
		adplabel = new JLabel("Password");
		adplabel.setBounds(530,295,200,25);
		adplabel.setForeground(new Color(211,211,211));
		adplabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//PASS FIELD
		adpf = new JPasswordField();
		adpf.setBounds(530,335,300,40);
		adpf.setForeground(new Color(0,0,0));
		adpf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//SIGN IN BUTTON
		adsgninbtn = new JButton("Sign In");
		adsgninbtn.setBounds(530,440,300,40);
		adsgninbtn.setForeground(new Color(255,255,255));
		adsgninbtn.setBackground(new Color(255,0,0));
		adsgninbtn.setFont(new Font("serif",Font.PLAIN,20));
		adsgninbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		adsgninbtn.setFocusPainted(false);
		adsgninbtn.addActionListener(this);
		
		
		
		
		
		//BACK BUTTON
		adbackbtn = new JButton("BACK");
		adbackbtn.setBounds(1250,5,100,30);
		adbackbtn.setForeground(new Color(255,255,255));
		adbackbtn.setBackground(new Color(0,0,0));
		adbackbtn.setFocusPainted(false);
		adbackbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		adbackbtn.addActionListener(this);
		
		
		//EXIT BUTTON
		exit3 = new JButton("EXIT");
		exit3.setBounds(1250,700,100,30);
		exit3.setForeground(new Color(255,255,255));
		exit3.setBackground(new Color(0,0,0));
		exit3.setFocusPainted(false);
		exit3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit3.addActionListener(this);
		
		
		
		//USER BUTTON
        userbtn = new JButton("*USER*");
        userbtn.setBounds(1,690,120,19);
        userbtn.setForeground(new Color(255,255,255));
        userbtn.setFont(new Font("serif",Font.PLAIN,15));
        userbtn.setFocusPainted(false);
        userbtn.setContentAreaFilled(false);
        userbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        userbtn.setBorder(BorderFactory.createEmptyBorder());
		userbtn.addActionListener(this);
        
		
		
		
		//PANEL
		adlgnpanel  = new JPanel();
        adlgnpanel.setBounds(480,50,400,630);
        adlgnpanel.setBackground(new Color(0,0,0,170));
        
		
		
		
		//BACKGROUND IMAGE
		bg3 = new ImageIcon("images/loginpageBG.jpg");
		background3 = new JLabel();
		background3.setIcon(bg3);
		background3.setBounds(0,0,1366,768);
		
	
		
		
		//ADDING COMPONENTS 
		Frame3.add(pageName3);
		Frame3.add(adsgnlabel);
		Frame3.add(adulabel);
		Frame3.add(adutf);
		Frame3.add(adplabel);
		Frame3.add(adpf);
		Frame3.add(adsgninbtn);
		Frame3.add(adbackbtn);
		Frame3.add(exit3);
		Frame3.add(userbtn);
		Frame3.add(adlgnpanel);
		Frame3.add(background3);
		
		
		
		
		
		
		Frame3.setIconImage(Homeicon3.getImage());
		Frame3.setSize(1366,768);
		Frame3.setLayout(null);
		Frame3.setLocationRelativeTo(null);
		Frame3.setResizable(false);
		Frame3.setDefaultCloseOperation(Frame3.EXIT_ON_CLOSE);
		Frame3.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
		
		
		
		if(e.getSource()==adsgninbtn)
		{
			
			String aname = adutf.getText().toLowerCase();
			String apass = adpf.getText();
			
			aprofile = aname;
			
			
			if(aname.isEmpty()==true || apass.isEmpty()==true)
			{
				showMessageDialog(null, "Please fill in all of the fields and try again.", "Error!", JOptionPane.WARNING_MESSAGE);
			}
			
			else{
				
				try{
					
					String usernames = "Username: "+aname;
					String passwords = "Password: "+apass;
					BufferedReader br = new BufferedReader(new FileReader("data\\admin\\admin_login.txt"));
					
					
					int flag = 0;
					int totallines = 0;
					while(br.readLine()!=null)
					{
						totallines++;
					}
					
					br.close();
					
					for(int i = 0; i < totallines; i++)
					{
						
						String line = Files.readAllLines(Paths.get("data\\admin\\admin_login.txt")).get(i);
						if(line.equals(usernames))
						{
							
							String line1 = Files.readAllLines(Paths.get("data\\admin\\admin_login.txt")).get((i + 1));
							
							if(line1.equals(passwords))
							{
								Frame3.setVisible(false);
								new Admindashboard();
								flag = 1;
							}
							
							}
						
						}
					
					if(flag==0)
					{
						showMessageDialog(null, "Invalid User Name or Password!", "Warning!", JOptionPane.WARNING_MESSAGE);
					}
					
				}
				
				catch(IOException iox)
				{
					showMessageDialog(null, "Admin Database not found!", "Not Found!", 2);
				}
				
				
				
				
			}
			
		}
		
		
		else if(e.getSource()==adbackbtn)
		{
			new Login();
			Frame3.setVisible(false);
		}
		else if(e.getSource()==exit3)
		{
			System.exit(0);
		}
		else if(e.getSource()==userbtn)
		{
			new Login();
			Frame3.setVisible(false);
		}
	}
}