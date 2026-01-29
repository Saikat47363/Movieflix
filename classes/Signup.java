package classes;

import movieclasses.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.nio.file.*;

public class Signup implements ActionListener{
	JFrame Frame2;
	private JLabel pageName2,wlc,to, movieflix, sgnuplabel, fstnamelabel, unamelabel, maillabel,genderlabel,passlabel, background2;
	private JPanel sgnuppanel;
	private JTextField fstnametf, unametf, mailtf;
	private JRadioButton male,female, other;
	private JPasswordField passf;
	private JCheckBox tearms, notification;
	private ImageIcon bg2,Homeicon2;
	private JButton continuebtn,backbtn2,exit2;
	private ButtonGroup gen;
	private File userfile;
	
	public Signup()
	{
		Frame2 = new JFrame("MOVIEFLIX");
		
		//LOGO
		Homeicon2 = new ImageIcon("images/logo.png");
		Frame2.setIconImage(Homeicon2.getImage());
		
		
		
		//PROJECT NAME
		pageName2 = new JLabel("MOVIEFLIX");
		pageName2.setBounds(40,30,400,30);
		pageName2.setForeground(new Color(255,0,0));
		pageName2.setFont(new Font("serif",Font.PLAIN,35));
		
		
		
		//WELCOME
		wlc = new JLabel("WELCOME");
		wlc.setBounds(130,235,500,90);
		wlc.setForeground(new Color(165,0,0));
		wlc.setFont(new Font("serif",Font.PLAIN,85));
		
		
		
		//TO
		to = new JLabel("TO");
		to.setBounds(280,335,500,90);
		to.setForeground(new Color(165,0,0));
		to.setFont(new Font("serif",Font.PLAIN,85));
		
		
		
		//MOVIEFLIX
		movieflix = new JLabel("MOVIEFLIX");
		movieflix.setBounds(122,435,500,90);
		movieflix.setForeground(new Color(165,0,0));
		movieflix.setFont(new Font("serif",Font.PLAIN,85));
		
		
		
		//SIGN IN 
		sgnuplabel = new JLabel("Crate Account");
		sgnuplabel.setBounds(843,50,300,45);
		sgnuplabel.setForeground(new Color(255,255,255));
		sgnuplabel.setFont(new Font("serif",Font.PLAIN,40));
		
		
		
		//NAME
		fstnamelabel = new JLabel("Name");
		fstnamelabel.setBounds(825,140,200,30);
		fstnamelabel.setForeground(new Color(211,211,211));
		fstnamelabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//NAME TEXT FIELD
		fstnametf = new JTextField();
		fstnametf.setBounds(825,170,300,40);
		fstnametf.setForeground(new Color(0,0,0));
		fstnametf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//USER NAME
		unamelabel = new JLabel("Username");
		unamelabel.setBounds(825,230,200,30);
		unamelabel.setForeground(new Color(211,211,211));
		unamelabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//USER NAME TEXT FIELD
		unametf = new JTextField();
		unametf.setBounds(825,260,300,40);
		unametf.setForeground(new Color(0,0,0));
		unametf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//MAIL
		maillabel = new JLabel("Email Address");
		maillabel.setBounds(825,320,200,30);
		maillabel.setForeground(new Color(211,211,211));
		maillabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//MAIL TEXT FIELD
		mailtf = new JTextField();
		mailtf.setBounds(825,350,300,40);
		mailtf.setForeground(new Color(0,0,0));
		mailtf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//GENDER LABEL
		genderlabel = new JLabel("Gender");
		genderlabel.setBounds(825,410,200,30);
		genderlabel.setForeground(new Color(211,211,211));
		genderlabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		gen = new ButtonGroup();
		
		//MALE
		male = new JRadioButton("Male");
		male.setBounds(825,450,80,22);
		male.setForeground(new Color(211,211,211));
		male.setFont(new Font("serif",Font.PLAIN,17));
		male.setFocusPainted(false);//FOCUS THAKE NA CLICK KORLE
        male.setBorderPainted(false);
        male.setContentAreaFilled(false);
		gen.add(male);
		
		
		
		//FEMALE
		female = new JRadioButton("Female");
		female.setBounds(905,450,100,22);
		female.setForeground(new Color(211,211,211));
		female.setFont(new Font("serif",Font.PLAIN,17));
		female.setFocusPainted(false);//FOCUS THAKE NA CLICK KORLE
        female.setBorderPainted(false);
        female.setContentAreaFilled(false);
		gen.add(female);
		
		
		
		//OTHER
		other = new JRadioButton("Other");
		other.setBounds(1005,450,100,22);
		other.setForeground(new Color(211,211,211));
		other.setFont(new Font("serif",Font.PLAIN,17));
		other.setFocusPainted(false);//FOCUS THAKE NA CLICK KORLE
        other.setBorderPainted(false);
        other.setContentAreaFilled(false);
		gen.add(other);
		
		
		
		//PASSWORD
		passlabel = new JLabel("Password");
		passlabel.setBounds(825,490,200,30);
		passlabel.setForeground(new Color(211,211,211));
		passlabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//PASSWORD FIELD
		passf = new JPasswordField();
		passf.setBounds(825,520,300,40);
		passf.setForeground(new Color(0,0,0));
		passf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//CHECK BOX
		tearms = new JCheckBox("I have read & agree to the terms");
		tearms.setBounds(825,575,300,22);
		tearms.setForeground(new Color(255,255,255));
		tearms.setFont(new Font("serif",Font.PLAIN,18));
		tearms.setFocusPainted(false);
		tearms.setContentAreaFilled(false);
		tearms.setBorder(BorderFactory.createEmptyBorder());
		tearms.addActionListener(this);
		
		
		
		//CONTINUE BUTTON
		continuebtn = new JButton("Continue");
		continuebtn.setBounds(825,625,300,40);
		continuebtn.setForeground(new Color(255,255,255));
		continuebtn.setBackground(new Color(0,90,156));
		continuebtn.setFont(new Font("serif",Font.PLAIN,20));
		continuebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		continuebtn.setFocusPainted(false);
		continuebtn.setEnabled(false);
		continuebtn.addActionListener(this);
		
		
		
		//BACK BUTTON
		backbtn2 = new JButton("Back");
		backbtn2.setBounds(1250,5,100,30);
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
        sgnuppanel.setBounds(750,30,450,690);
        sgnuppanel.setBackground(new Color(0,0,0,170));
        
		
		
		
		//BACKGROUND
		bg2 = new ImageIcon("images/signupBG.jpg");
		background2 = new JLabel();
		background2.setIcon(bg2);
		background2.setBounds(0,0,1366,768);
		
		
		//ADDING COMPONENTS
		Frame2.add(pageName2);
		Frame2.add(wlc);
		Frame2.add(to);
		Frame2.add(movieflix);
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
		Frame2.add(tearms);
		Frame2.add(continuebtn);
		Frame2.add(backbtn2);
		Frame2.add(exit2);
		Frame2.add(sgnuppanel);
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
				
				showMessageDialog(null, "Registration Successfull, Go to Login.", "Success!", 1);
				new Login();
				Frame2.setVisible(false);
				}
				
				else{
					showMessageDialog(null, "Username or Email not available, try again with a new username.", "Not available!", 2);
				}
				
				}
			
			
		}
		
		
		else if(e.getSource()==backbtn2)
		{
			new Login();
			Frame2.setVisible(false);
		}
		else if(e.getSource()==exit2)
		{
			System.exit(0);
		}
		else if(e.getSource()==tearms)
		{
			if(tearms.isSelected())
			{
			continuebtn.setEnabled(true);
			}
			else{
				continuebtn.setEnabled(false);
			}
		}
		
	}
	
	
}