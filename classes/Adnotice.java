package classes;

import movieclasses.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.*;
import java.nio.file.*;

public class Adnotice implements ActionListener{
	
	JFrame Frame;
	
	private JTextArea n;
	private JLabel background,pageName,adminlbl,lbl,lbl1;
	private JButton ad, backbtn, exitbtn;
	private ImageIcon Homeicon, bg;
	private JPanel panel1,panel2;
	
	public Adnotice()
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
		lbl = new JLabel("MOVIEFLIX NOTICE");
		lbl.setBounds(510,160,500,40);
		lbl.setForeground(new Color(255,255,255));
		lbl.setFont(new Font("serif",Font.PLAIN,35));

		
		//ADD ADMIN LABEL
		lbl1 = new JLabel("Notice for MovieFlix User");
		lbl1.setBounds(555,270,500,25);
		lbl1.setForeground(new Color(255,255,255));
		lbl1.setFont(new Font("serif",Font.PLAIN,22));
		
		
		n = new JTextArea();
		n.setBounds(450,330,450,200);
		n.setLineWrap(true);
		n.setFont(new Font("serif",Font.PLAIN,25));
		
		
		

		
		ad = new JButton("Submit");
		ad.setBounds(520, 560, 300, 35);
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
		Frame.add(lbl1);
		Frame.add(n);
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
		
		String note = n.getText();
		
		if(e.getSource()==ad)
		{
			
			if(note.isEmpty()==true)
			{
				showMessageDialog(null, "Please fill in all of the fields and try again.", "Error!", JOptionPane.WARNING_MESSAGE);
			}
			
			else{
				
				try{
					
					File nfile = new File("data\\user\\user_notice.txt");
					
					if(!nfile.exists())
					{
						nfile.createNewFile();
					}
					
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(nfile, true)));
					pw.println("Notice: "+note);
					pw.println("================================");
					pw.close();
					
					}
					
				catch(IOException iox){
					iox.printStackTrace();
				}
				
				
				showMessageDialog(null, "Notice added for Users.", "added!", 1);
				Frame.setVisible(false);
				new Adnotice();
				
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