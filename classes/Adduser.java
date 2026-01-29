package classes;
import movieclasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.nio.file.*;

public class Adduser implements ActionListener{
	JFrame Frame2;
	private JLabel pageName2, sgnuplabel, fstnamelabel, unamelabel, maillabel,genderlabel,adminlbl,passlabel, background2;
	private JPanel sgnuppanel,panel3;
	private JTextField fstnametf, unametf, mailtf;
	private JRadioButton male,female, other;
	private JPasswordField passf;
	private ImageIcon bg2,Homeicon2;
	private JButton continuebtn,backbtn2,exit2;
	private ButtonGroup gen;
	private File userfile;
	
	public Adduser()
	{
		Frame2 = new JFrame("MOVIEFLIX");
		
		//LOGO
		Homeicon2 = new ImageIcon("images/logo.png");
		Frame2.setIconImage(Homeicon2.getImage());
		
		
		
		//PROJECT NAME
		pageName2 = new JLabel("MOVIEFLIX");
		pageName2.setBounds(15,18,400,30);
		pageName2.setForeground(new Color(255,0,0));
		pageName2.setFont(new Font("serif",Font.PLAIN,35));
		
		//PROJECT NAME
		adminlbl = new JLabel("ADMIN PANEL");
		adminlbl.setBounds(550,18,400,40);
		adminlbl.setForeground(new Color(255,0,0));
		adminlbl.setFont(new Font("serif",Font.PLAIN,30));
		
		
		
		//SIGN IN 
		sgnuplabel = new JLabel("ADD USER");
		sgnuplabel.setBounds(545,90,300,40);
		sgnuplabel.setForeground(new Color(255,255,255));
		sgnuplabel.setFont(new Font("serif",Font.PLAIN,35));
		
		
		
		//NAME
		fstnamelabel = new JLabel("Name");
		fstnamelabel.setBounds(505,165,200,30);
		fstnamelabel.setForeground(new Color(211,211,211));
		fstnamelabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//NAME TEXT FIELD
		fstnametf = new JTextField();
		fstnametf.setBounds(505,195,300,35);
		fstnametf.setForeground(new Color(0,0,0));
		fstnametf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//USER NAME
		unamelabel = new JLabel("Username");
		unamelabel.setBounds(505,255,200,30);
		unamelabel.setForeground(new Color(211,211,211));
		unamelabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//USER NAME TEXT FIELD
		unametf = new JTextField();
		unametf.setBounds(505,285,300,35);
		unametf.setForeground(new Color(0,0,0));
		unametf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//MAIL
		maillabel = new JLabel("Email Address");
		maillabel.setBounds(505,345,200,30);
		maillabel.setForeground(new Color(211,211,211));
		maillabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//MAIL TEXT FIELD
		mailtf = new JTextField();
		mailtf.setBounds(505,375,300,35);
		mailtf.setForeground(new Color(0,0,0));
		mailtf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//GENDER LABEL
		genderlabel = new JLabel("Gender");
		genderlabel.setBounds(505,435,200,30);
		genderlabel.setForeground(new Color(211,211,211));
		genderlabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		gen = new ButtonGroup();
		
		//MALE
		male = new JRadioButton("Male");
		male.setBounds(505,465,80,22);
		male.setForeground(new Color(211,211,211));
		male.setFont(new Font("serif",Font.PLAIN,17));
		male.setFocusPainted(false);//FOCUS THAKE NA CLICK KORLE
        male.setBorderPainted(false);
        male.setContentAreaFilled(false);
		gen.add(male);
		
		
		
		//FEMALE
		female = new JRadioButton("Female");
		female.setBounds(585,465,100,22);
		female.setForeground(new Color(211,211,211));
		female.setFont(new Font("serif",Font.PLAIN,17));
		female.setFocusPainted(false);//FOCUS THAKE NA CLICK KORLE
        female.setBorderPainted(false);
        female.setContentAreaFilled(false);
		gen.add(female);
		
		
		
		//OTHER
		other = new JRadioButton("Other");
		other.setBounds(685,465,100,22);
		other.setForeground(new Color(211,211,211));
		other.setFont(new Font("serif",Font.PLAIN,17));
		other.setFocusPainted(false);//FOCUS THAKE NA CLICK KORLE
        other.setBorderPainted(false);
        other.setContentAreaFilled(false);
		gen.add(other);
		
		
		
		//PASSWORD
		passlabel = new JLabel("Password");
		passlabel.setBounds(505,500,200,30);
		passlabel.setForeground(new Color(211,211,211));
		passlabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//PASSWORD FIELD
		passf = new JPasswordField();
		passf.setBounds(505,530,300,35);
		passf.setForeground(new Color(0,0,0));
		passf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		
		//CONTINUE BUTTON
		continuebtn = new JButton("Continue");
		continuebtn.setBounds(505,625,300,40);
		continuebtn.setForeground(new Color(255,255,255));
		continuebtn.setBackground(new Color(0,90,156));
		continuebtn.setFont(new Font("serif",Font.PLAIN,20));
		continuebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		continuebtn.setFocusPainted(false);
		continuebtn.addActionListener(this);
		
		
		
		//BACK BUTTON
		backbtn2 = new JButton("Back");
		backbtn2.setBounds(03,700,100,30);
		backbtn2.setForeground(new Color(255,255,255));
		backbtn2.setBackground(new Color(0,0,0));
		backbtn2.setFocusPainted(false);
		backbtn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		backbtn2.addActionListener(this);
		
		
		
		//EXIT BUTTON
		exit2 = new JButton("Exit");
		exit2.setBounds(1250,700,100,30);
		exit2.setForeground(new Color(255,255,255));
		exit2.setBackground(new Color(0,0,0));
		exit2.setFocusPainted(false);
		exit2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit2.addActionListener(this);
		
		
		
		//PANEL
		sgnuppanel  = new JPanel();
        sgnuppanel.setBounds(430,80,450,620);
        sgnuppanel.setBackground(new Color(37,37,37,210));
		//PANEL 3
		panel3 = new JPanel();
        panel3.setBounds(0,0,1366,70);
        panel3.setBackground(new Color(37,37,37,210));
        
		
		
		
		//BACKGROUND
		bg2 = new ImageIcon("images/userbg.jpg");
		background2 = new JLabel();
		background2.setIcon(bg2);
		background2.setBounds(0,0,1366,768);
		
		
		//ADDING COMPONENTS
		Frame2.add(pageName2);
		Frame2.add(adminlbl);
		Frame2.add(sgnuplabel);
		Frame2.add(fstnamelabel);
		Frame2.add(fstnametf);
		Frame2.add(unamelabel);
		Frame2.add(unametf);
		Frame2.add(maillabel);
		Frame2.add(mailtf);
		Frame2.add(genderlabel);
		Frame2.add(male);
		Frame2.add(female);
		Frame2.add(other);
		Frame2.add(passlabel);
		Frame2.add(passf);
		Frame2.add(continuebtn);
		Frame2.add(backbtn2);
		Frame2.add(exit2);
		Frame2.add(sgnuppanel);
		Frame2.add(panel3);
		Frame2.add(background2);
		
		
		Frame2.setSize(1366,768);
		Frame2.setLayout(null);
		Frame2.setLocationRelativeTo(null);
		Frame2.setDefaultCloseOperation(Frame2.EXIT_ON_CLOSE);
		Frame2.setResizable(false);
		Frame2.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
		String name = fstnametf.getText();
		String username = unametf.getText().toLowerCase();
		String mail = mailtf.getText().toLowerCase();
		String pass = passf.getText();
		
		
		if(e.getSource()==continuebtn)
		{
			if(name.isEmpty()==true || username.isEmpty()==true || mail.isEmpty()==true || pass.isEmpty()==true)
			{
				showMessageDialog(null, "Please fill in all of the fields and try again.", "Error!", JOptionPane.WARNING_MESSAGE);
			}
			
			else{
				
				int flag = 1;
				
				try{
					
					String usernames = "Username: "+username;
					String mails = "Email: "+mail;
					
					BufferedReader br = new BufferedReader(new FileReader("data\\user\\user_login.txt"));
					
					
					int totallines = 0;
					while(br.readLine()!=null)
					{
						totallines++;
					}
					br.close();
					
					for(int i = 0; i < totallines; i++)
					{
						String line = Files.readAllLines(Paths.get("data\\user\\user_login.txt")).get(i);
						
						if(line.equals(usernames) || line.equals(mails))
						{
							
							flag = 0;
							
						}
					}
					
					
				}
				
				catch(IOException iox){
					iox.printStackTrace();
				}
				
				if(flag==1){
				
				try{
					
					File ufile = new File("data\\user\\user_login.txt");
					
					if(!ufile.exists())
					{
						ufile.createNewFile();
					}
					
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(ufile, true)));
					
					pw.println("Username: "+username);
					pw.println("Password: "+pass);
					pw.println("Name: "+name);
					pw.println("Email: "+mail);
					if(male.isSelected())
					{
						pw.println("Gender: Male");
					}
					else if(female.isSelected())
					{
						pw.println("Gender: Female");
					}
					else if(other.isSelected())
					{
						pw.println("Gender: Other");
					}
					
					pw.println("================================");
					
					pw.close();
					
					
				}
				catch(IOException iox){
					iox.printStackTrace();
				}
				
				showMessageDialog(null, "User added successfully", "Success!", 1);
				Frame2.setVisible(false);
				new Adduser();

				
				}
				
				else{
					showMessageDialog(null, "Username or Email not available, try again with a new username.", "Not available!", 1);
				}
				
				}
			
			
		}
		
		
		else if(e.getSource()==backbtn2)
		{
			new Admindashboard();
			Frame2.setVisible(false);
		}
		else if(e.getSource()==exit2)
		{
			System.exit(0);
		}
		
	}
	
	
}