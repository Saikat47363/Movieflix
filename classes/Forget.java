package classes;

import movieclasses.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.nio.file.*;
import java.io.*;


public class Forget implements ActionListener{
	JFrame Frame4;
	
	private ImageIcon Homeicon4, bg4;
	private JPanel forgetpanel;
	private JLabel pageName4, forgetlabel, fulabel, rmlabel, fmaillabel, background4;
	private JTextField futf, fmailtf;
	private JButton proceedbtn, forgetbckbtn, exit4, lgnbtn;
	protected static String mail;
	

	public Forget()
	{
		Frame4 = new JFrame("MOVIEFLIX");
		
		
		
		//LOGO
		Homeicon4 = new ImageIcon("images/logo.png");
		
		
		//PROJECT NAME
		pageName4 = new JLabel("MOVIEFLIX");
		pageName4.setBounds(40,30,400,30);
		pageName4.setForeground(new Color(255,0,0));
		pageName4.setFont(new Font("serif",Font.PLAIN,35));
		
		
		
		
		//FORGET YOUR PASSWORD
		forgetlabel = new JLabel("Forget your password?");
		forgetlabel.setBounds(545,170,280,37);
		forgetlabel.setForeground(new Color(255,255,255));
		forgetlabel.setFont(new Font("serif",Font.PLAIN,30));
		
		
		
		//UPPER LABEL
		fulabel = new JLabel("Enter your registered E-mail");
		fulabel.setBounds(530,255,450,30);
		fulabel.setForeground(new Color(211,211,211));
		fulabel.setFont(new Font("serif",Font.PLAIN,18));
		
		
		
		
		//E-MAIL OR USERNAME
		fmaillabel = new JLabel("E-mail");
		fmaillabel.setBounds(530,325,200,25);
		fmaillabel.setForeground(new Color(211,211,211));
		fmaillabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//E-MAIL OR USERNAME TEXT FIELD
		fmailtf = new JTextField();
		fmailtf.setBounds(530,365,300,40);
		fmailtf.setForeground(new Color(0,0,0));
		fmailtf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//PROCEED BUTTON
		proceedbtn = new JButton("Proceed");
		proceedbtn.setBounds(530,470,300,40);
		proceedbtn.setForeground(new Color(255,255,255));
		proceedbtn.setBackground(new Color(0,90,156));
		proceedbtn.setFont(new Font("serif",Font.PLAIN,20));
		proceedbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		proceedbtn.setFocusPainted(false);
		proceedbtn.addActionListener(this);
		
		
		
		//LAST LABEL
		rmlabel = new JLabel("Remember your password?");
		rmlabel.setBounds(530,540,210,25);
		rmlabel.setForeground(new Color(211,211,211));
		rmlabel.setFont(new Font("serif",Font.PLAIN,18));
		
		
		
		//LOG IN BUTTON
		lgnbtn = new JButton("Log in");
		lgnbtn.setBounds(712,540,105,25);
		lgnbtn.setForeground(new Color(255,255,255));
		lgnbtn.setFont(new Font("serif",Font.PLAIN,20));
		lgnbtn.setFocusPainted(false);
		lgnbtn.setContentAreaFilled(false);
		lgnbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lgnbtn.setBorder(BorderFactory.createEmptyBorder());
		lgnbtn.addActionListener(this);
		
		
		
		
		//BACK BUTTON
		forgetbckbtn = new JButton("BACK");
		forgetbckbtn.setBounds(1250,5,100,30);
		forgetbckbtn.setForeground(new Color(255,255,255));
		forgetbckbtn.setBackground(new Color(0,0,0));
		forgetbckbtn.setFocusPainted(false);
		forgetbckbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		forgetbckbtn.addActionListener(this);
		
		
		//EXIT BUTTON
		exit4 = new JButton("EXIT");
		exit4.setBounds(1250,700,100,30);
		exit4.setForeground(new Color(255,255,255));
		exit4.setBackground(new Color(0,0,0));
		exit4.setFocusPainted(false);
		exit4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit4.addActionListener(this);
		
		
		
		
		//PANEL
		forgetpanel  = new JPanel();
        forgetpanel.setBounds(480,120,400,500);
        forgetpanel.setBackground(new Color(37,37,37,170));
        
		
		
		
		//BACKGROUND IMAGE
		bg4 = new ImageIcon("images/Forget.jpg");
		background4 = new JLabel();
		background4.setIcon(bg4);
		background4.setBounds(0,0,1366,768);
		
	
		
		
		//ADDING COMPONENTS 
		Frame4.add(pageName4);
		Frame4.add(forgetlabel);
		Frame4.add(fulabel);
		Frame4.add(fmaillabel);
		Frame4.add(fmailtf);
		Frame4.add(proceedbtn);
		Frame4.add(rmlabel);
		Frame4.add(lgnbtn);
		Frame4.add(forgetbckbtn);
		Frame4.add(exit4);
		Frame4.add(forgetpanel);
		Frame4.add(background4);
		
		
		
		
		
		
		Frame4.setIconImage(Homeicon4.getImage());
		Frame4.setSize(1366,768);
		Frame4.setLayout(null);
		Frame4.setLocationRelativeTo(null);
		Frame4.setResizable(false);
		Frame4.setDefaultCloseOperation(Frame4.EXIT_ON_CLOSE);
		Frame4.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		String ue = fmailtf.getText().toLowerCase();
		int flag = 0;
		
		
		if(e.getSource()==proceedbtn)
		{
			if(ue.isEmpty()==true)
			{
				showMessageDialog(null, "Please enter your Email.", "Error!", JOptionPane.WARNING_MESSAGE);
			}
			
			else{
			
			try{
				
					//int flag = 0;
					
					mail = "Email: "+ue;
					
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
						if(line.equals(mail))
						{
							flag = 1;
							break;
						}
					}
					
					if(flag==1)
					{
						new Resetpass();
						Frame4.setVisible(false);
					}
					
					else{
						
						showMessageDialog(null, "Email not found", "Not found!", JOptionPane.WARNING_MESSAGE);
					}
			
			}
			
			catch(IOException iox){
				
				iox.printStackTrace();
				
				}
				
			
			}
		}
		
		
		else if(e.getSource()==forgetbckbtn)
		{
			new Login();
			Frame4.setVisible(false);
		}
		else if(e.getSource()==exit4)
		{
			System.exit(0);
		}
		else if(e.getSource()==lgnbtn)
		{
			new Login();
			Frame4.setVisible(false);
		}
		
	}
}