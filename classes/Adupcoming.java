package classes;

import movieclasses.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.nio.file.*;

public class Adupcoming implements ActionListener{
	
	JFrame Frame;
	
	private JTextField atf,apf,ryf;
	private JLabel alabel, aplabel,background,pageName,adminlbl,lbl,rylabel;
	private JButton ad, backbtn, exitbtn;
	private ImageIcon Homeicon, bg;
	private JPanel panel1,panel2;
	
	public Adupcoming()
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
		lbl = new JLabel("UPCOMMINGS");
		lbl.setBounds(540,160,500,40);
		lbl.setForeground(new Color(255,255,255));
		lbl.setFont(new Font("serif",Font.PLAIN,35));
		
		//username label
		alabel = new JLabel("Movie Name");
		alabel.setBounds(520, 240, 250, 35);
		alabel.setForeground(new Color(211,211,211));
		alabel.setFont(new Font("serif",Font.PLAIN,25));
		
		//Username Textfield
		atf = new JTextField();
		atf.setBounds(520, 280, 300, 35);
		atf.setForeground(new Color(0,0,0));
		atf.setFont(new Font("serif",Font.PLAIN,20));

		
		//pass label
		aplabel = new JLabel("Genre");
		aplabel.setBounds(520,330,250,35);
		aplabel.setForeground(new Color(211,211,211));
		aplabel.setFont(new Font("serif",Font.PLAIN,25));
		
		
		//text field
		apf = new JTextField();
		apf.setBounds(520, 370,300,35);
		apf.setForeground(new Color(0,0,0));
		apf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		//release year label
		rylabel = new JLabel("Realese year");
		rylabel.setBounds(520,420,250,35);
		rylabel.setForeground(new Color(211,211,211));
		rylabel.setFont(new Font("serif",Font.PLAIN,25));
		
		
		//text field
		ryf = new JTextField();
		ryf.setBounds(520, 460,300,35);
		ryf.setForeground(new Color(0,0,0));
		ryf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		ad = new JButton("Submit");
		ad.setBounds(520, 540, 300, 35);
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
		Frame.add(rylabel);
		Frame.add(ryf);
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
		
		String mname = atf.getText();
		String mgenre = apf.getText();
		String myear = ryf.getText();
		
		
		if(e.getSource()==ad)
		{
			
			if(mname.isEmpty()==true || mgenre.isEmpty()==true || myear.isEmpty()==true)
			{
				showMessageDialog(null, "Please fill in all of the fields and try again.", "Error!", JOptionPane.WARNING_MESSAGE);
			}
			
			else{
				
				try{
					
					File ufile = new File("data\\user\\upcoming_movies.txt");
					
					if(!ufile.exists())
					{
						ufile.createNewFile();
					}
					
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(ufile, true)));
					
					pw.println("Movie Name: "+mname);
					pw.println("Genre: "+mgenre);
					pw.println("Release year: "+myear);
					pw.println("================================");
					pw.close();
					
					}
				
				
				catch(IOException iox){
					iox.printStackTrace();
				}
				
				
				showMessageDialog(null, "Movie added to the upcoming section.", "added!", 1);
				Frame.setVisible(false);
				new Adupcoming();
				
				
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