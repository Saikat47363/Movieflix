package classes;

import movieclasses.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Resetpass implements ActionListener{
	JFrame Frame5;

	private ImageIcon Homeicon5, bg5;
	private JPanel forgetpanel;
	private JLabel pageName5, resetlabel, newpasslabel, conpasslabel, background5;
	private JTextField newpasstf, conpasstf;
	private JButton confirmbtn, registerbckbtn, exit5;
	

	public Resetpass()
	{
		Frame5 = new JFrame("MOVIEFLIX");
		
		
		
		//LOGO
		Homeicon5 = new ImageIcon("images/logo.png");
		
		
		//PROJECT NAME
		pageName5 = new JLabel("MOVIEFLIX");
		pageName5.setBounds(40,30,400,30);
		pageName5.setForeground(new Color(255,0,0));
		pageName5.setFont(new Font("serif",Font.PLAIN,35));
		
		
		
		
		//SIGN IN 
		resetlabel = new JLabel("Reset Password");
		resetlabel.setBounds(580,170,280,37);
		resetlabel.setForeground(new Color(255,255,255));
		resetlabel.setFont(new Font("serif",Font.PLAIN,30));
		
		
		
		//USER NAME
		newpasslabel = new JLabel("New Password");
		newpasslabel.setBounds(530,255,400,30);
		newpasslabel.setForeground(new Color(211,211,211));
		newpasslabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//USER TEXT FIELD
		newpasstf = new JTextField();
		newpasstf.setBounds(530,295,300,40);
		newpasstf.setForeground(new Color(0,0,0));
		newpasstf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//PASSWORD
		conpasslabel = new JLabel("Confirm Password");
		conpasslabel.setBounds(530,345,200,25);
		conpasslabel.setForeground(new Color(211,211,211));
		conpasslabel.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//PASS FIELD
		conpasstf = new JTextField();
		conpasstf.setBounds(530,385,300,40);
		conpasstf.setForeground(new Color(0,0,0));
		conpasstf.setFont(new Font("serif",Font.PLAIN,20));
		
		
		
		//SIGN IN BUTTON
		confirmbtn = new JButton("Confirm");
		confirmbtn.setBounds(530,490,300,40);
		confirmbtn.setForeground(new Color(255,255,255));
		confirmbtn.setBackground(new Color(0,90,156));
		confirmbtn.setFont(new Font("serif",Font.PLAIN,20));
		confirmbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		confirmbtn.setFocusPainted(false);
		confirmbtn.addActionListener(this);
		
		
		
		
		
		//BACK BUTTON
		registerbckbtn = new JButton("BACK");
		registerbckbtn.setBounds(1250,5,100,30);
		registerbckbtn.setForeground(new Color(255,255,255));
		registerbckbtn.setBackground(new Color(0,0,0));
		registerbckbtn.setFocusPainted(false);
		registerbckbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		registerbckbtn.addActionListener(this);
		
		
		//EXIT BUTTON
		exit5 = new JButton("EXIT");
		exit5.setBounds(1250,700,100,30);
		exit5.setForeground(new Color(255,255,255));
		exit5.setBackground(new Color(0,0,0));
		exit5.setFocusPainted(false);
		exit5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit5.addActionListener(this);
		
		
		
		
		//PANEL
		forgetpanel  = new JPanel();
        forgetpanel.setBounds(480,120,400,500);
        forgetpanel.setBackground(new Color(37,37,37,210));
        
		
		
		
		//BACKGROUND IMAGE
		bg5 = new ImageIcon("images/reset.jpg");
		background5 = new JLabel();
		background5.setIcon(bg5);
		background5.setBounds(0,0,1366,768);
		
	
		
		
		//ADDING COMPONENTS 
		Frame5.add(pageName5);
		Frame5.add(resetlabel);
		Frame5.add(newpasslabel);
		Frame5.add(newpasstf);
		Frame5.add(conpasslabel);
		Frame5.add(conpasstf);
		Frame5.add(confirmbtn);
		Frame5.add(registerbckbtn);
		Frame5.add(exit5);
		Frame5.add(forgetpanel);
		Frame5.add(background5);
		
		
		
		
		
		
		Frame5.setIconImage(Homeicon5.getImage());
		Frame5.setSize(1366,768);
		Frame5.setLayout(null);
		Frame5.setLocationRelativeTo(null);
		Frame5.setResizable(false);
		Frame5.setDefaultCloseOperation(Frame5.EXIT_ON_CLOSE);
		Frame5.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		String np = newpasstf.getText();
		String cnf = conpasstf.getText();
		String em = Forget.mail;
		
		
		
		String newpass = "Password: "+np;
		
		
		if(e.getSource()==confirmbtn)
		{
			if(np.isEmpty()==true || cnf.isEmpty()==true)
			{
				showMessageDialog(null, "Please fill in all of the fields and try again.", "Error!", JOptionPane.WARNING_MESSAGE);
			}
			
			else{
			
			if(np.equals(cnf))
			{
			
			try{
				
				BufferedReader br = new BufferedReader(new FileReader("data\\user\\user_login.txt"));
				StringBuffer sb = new StringBuffer();
				
				int totallines = 0;
				String temp;
				
					while((temp=br.readLine())!=null)
					{
						sb.append(temp);
						sb.append('\n');
						totallines++;
					}
					br.close();
					
					String updatedata = sb.toString();
					
					
					for(int i = 0; i < totallines; i++)
					{
						String line = Files.readAllLines(Paths.get("data\\user\\user_login.txt")).get(i);
						if(line.equals(em))
						{
							String line1 = Files.readAllLines(Paths.get("data\\user\\user_login.txt")).get((i -2));
							
							if(!line1.equals(newpass))
							{
								updatedata = updatedata.replaceAll(line1,newpass);
								
								FileWriter writer = new FileWriter("data\\user\\user_login.txt");
								writer.append(updatedata);
								writer.flush();
								showMessageDialog(null, "Password has been changed, Go back to login.", "Password Changed!", 1);
								new Login();
								Frame5.setVisible(false);
								
							}
							else{
								showMessageDialog(null, "You've used this password, Enter a new password", "Warning!", 2);
							}
						}
						
					}
				
			
			}
			
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			}
			
			else{
				showMessageDialog(null, "Password didn't match try again.", "Not matched!", 2);
			}
		}
		}
		
		else if(e.getSource()==registerbckbtn)
		{
			new Forget();
			Frame5.setVisible(false);
		}
		else if(e.getSource()==exit5)
		{
			System.exit(0);
		}
	}
}