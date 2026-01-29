package classes;
import movieclasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.nio.file.*;

public class Addadmin implements ActionListener{
	
	JFrame Frame;
	
	private JTextField atf;
	private JPasswordField apf;
	private JLabel alabel, aplabel,background,pageName,adminlbl,lbl;
	private JButton ad, backbtn, exitbtn;
	private ImageIcon Homeicon, bg;
	private JPanel panel1,panel2;
	public Addadmin()
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
		adminlbl = new JLabel("ADMIN PANEL");
		adminlbl.setBounds(550,18,400,40);
		adminlbl.setForeground(new Color(255,0,0));
		adminlbl.setFont(new Font("serif",Font.PLAIN,30));
		
		//ADD ADMIN LABEL
		lbl = new JLabel("ADD ADMIN");
		lbl.setBounds(540,160,500,40);
		lbl.setForeground(new Color(255,255,255));
		lbl.setFont(new Font("serif",Font.PLAIN,35));
		
		//username label
		alabel = new JLabel("Username");
		alabel.setBounds(520, 240, 250, 35);
		alabel.setForeground(new Color(211,211,211));
		alabel.setFont(new Font("serif",Font.PLAIN,25));
		
		//Username Textfield
		atf = new JTextField();
		atf.setBounds(520, 280, 300, 35);
		atf.setForeground(new Color(0,0,0));
		atf.setFont(new Font("serif",Font.PLAIN,20));

		
		//pass label
		aplabel = new JLabel("Password");
		aplabel.setBounds(520,330,250,35);
		aplabel.setForeground(new Color(211,211,211));
		aplabel.setFont(new Font("serif",Font.PLAIN,25));
		
		
		//pass field
		apf = new JPasswordField();
		apf.setBounds(520, 370,300,35);
		apf.setForeground(new Color(0,0,0));
		apf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		ad = new JButton("Add Admin");
		ad.setBounds(520, 510, 300, 35);
		ad.setForeground(new Color(255,255,255));
		ad.setBackground(new Color(0,90,156));
		ad.setFont(new Font("serif",Font.PLAIN,20));
		ad.setFocusPainted(false);
		ad.setCursor(new Cursor(Cursor.HAND_CURSOR));
		ad.addActionListener(this);
		
		
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
		//panel 2
		panel2  = new JPanel();
        panel2.setBounds(420,130,500,530);
        panel2.setBackground(new Color(37,37,37,210));
		
		//BACKGROUND IMAGE
		bg = new ImageIcon("images/userbg.jpg");
		background = new JLabel();
		background.setIcon(bg);
		background.setBounds(0,0,1366,768);
		
		
		//ADDING COMPONENTS
		Frame.add(pageName);
		Frame.add(adminlbl);
		Frame.add(lbl);
		Frame.add(alabel);
		Frame.add(aplabel);
		Frame.add(atf);
		Frame.add(apf);
		Frame.add(ad);
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
		String aname = atf.getText().toLowerCase();
		String apass = apf.getText();
		
		if(e.getSource()==ad)
		{
			if(aname.isEmpty()==true || apass.isEmpty()==true)
			{
				showMessageDialog(null, "Please fill in all of the fields and try again.", "Error!", JOptionPane.WARNING_MESSAGE);
			}
			
			else{
				
				int flag=1;
				
				try{
					
					String usernames = "Username: "+aname;
					
					BufferedReader br = new BufferedReader(new FileReader("data\\admin\\admin_login.txt"));
					
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
							
							flag = 0;
							
						}
					}
					
					}
					
				catch(IOException iox){
					iox.printStackTrace();
				}
				
				
				if(flag==1)
				{
					try{
						
						
						File ufile = new File("data\\admin\\admin_login.txt");
					
					if(!ufile.exists())
					{
						ufile.createNewFile();
					}
					
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(ufile, true)));
						
						pw.println("Username: "+aname);
						pw.println("Password: "+apass);
						pw.println("================================");
						pw.close();
						
						
					}
					
					
				catch(IOException iox){
					
				iox.printStackTrace();
				
				}
				
				showMessageDialog(null, "Successfully added Admin.", "Success!", 1);
				
				
				}
				
				else{
					showMessageDialog(null, "Admin username not available, Try again.", "Not available!", 2);
				}
				
			}
			
			
		}
		
		else if(e.getSource()==backbtn)
		{
			new Admindashboard();
			Frame.setVisible(false);
			
		}
		
		else if(e.getSource()==exitbtn)
		{
			System.exit(0);
		}
		
	}
	
	
}