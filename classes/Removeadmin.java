package classes;
import movieclasses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.*;
import java.nio.file.*;
import java.io.*;

public class Removeadmin implements ActionListener{
	
	JFrame Frame;
	
	private JLabel background,pageName,adminlbl,lbl;
	private JButton ad, backbtn, exitbtn;
	private ImageIcon Homeicon, bg;
	private JPanel panel1,panel2;
	
	
	private DefaultTableModel model;
	private JTable table;
	private JScrollPane scroll;
	private String[] column = { "User Name", "Password"};
    private String[] rows = new String[3];
	
	
	public Removeadmin()
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
		lbl = new JLabel("REMOVE ADMIN");
		lbl.setBounds(520,160,500,40);
		lbl.setForeground(new Color(255,255,255));
		lbl.setFont(new Font("serif",Font.PLAIN,35));
		
		
		table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setBackground(new Color(255,255,255));
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(340);
        table.getColumnModel().getColumn(1).setPreferredWidth(340);
        scroll = new JScrollPane(table);
        scroll.setBounds(320, 150, 680, 450);
        Frame.add(scroll);

        String file = "data\\admin\\admin_login.txt";

        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
			{
                totalLines++;
			}
            reader.close();

            for (int i = 0; i < totalLines; i++)
			{
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("User"))
				{
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(10); // Username 
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(10); // Password
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
			ex.printStackTrace();
        }
		
		
		ad = new JButton("Remove Admin");
		ad.setBounds(525,630,250,35);
		ad.setForeground(new Color(255,255,255));
		ad.setBackground(new Color(0,90,156));
		ad.setFont(new Font("serif",Font.PLAIN,25));
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
        panel2.setBounds(145,80,1060,620);
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
		
		
		if(e.getSource()==ad)
		{
			
			String file1 = "data\\admin\\admin_login.txt";
			String temp = "data\\admin\\admin_login_temp.txt";
			
			
			
			if (table.getSelectionModel().isSelectionEmpty())
			{
				
				JOptionPane.showMessageDialog(null, "Please select a user to remove.", "Warning!",JOptionPane.WARNING_MESSAGE);
				
			}
			
			else{
				
				String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();
				
				File oldFile = new File(file1);
                File newFile = new File(temp);
				
				int c = 0;
				
				try{
					
					BufferedReader br = new BufferedReader(new FileReader(file1));
					int totalLines = 0;
					while (br.readLine() != null)
					{
                        totalLines++;
					}
                    br.close();
					
					for (int i = 0; i < totalLines; i++)
					{
						
						String line = Files.readAllLines(Paths.get(file1)).get(i);
						String x = line.substring(0, 4);
						
						if (x.equals("User"))
						{
                            String userName = Files.readAllLines(Paths.get(file1)).get(i);
							
                            if(userName.substring(10).equals(removeUser))
							{
                                c = i;
                            }
                        }
						
					}
				}
					
					catch(IOException iox)
					{
						iox.printStackTrace();
					}
					
					try{
						
						//FileWriter fw = new FileWriter(temp, true);
						PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(temp, true)));
						BufferedReader br = new BufferedReader(new FileReader(file1));
						
						BufferedReader br1 = new BufferedReader(new FileReader(file1));
						int totalLines = 0;
                        while (br1.readLine() != null)
						{
                           totalLines++;
						}
                        br1.close();
						
						for (int j = 0; j < totalLines; j++)
						{
							
							String line = Files.readAllLines(Paths.get(file1)).get(j);
                            String x = line.substring(0, 4);
							
							//System.out.println("Worked!!");
							
							if (c != 0 && (j == c || j == (c + 1)))
							{
								//System.out.println("Worked!!");
								String userName = Files.readAllLines(Paths.get(file1)).get(j);
								pw.println("#Removed! " + userName);
								
								
								
							}
							
							else{
								
								String userName = Files.readAllLines(Paths.get(file1)).get(j);
                                pw.println(userName);
								
								
							}
							
						}
						
						pw.flush();
                        pw.close();
                        br.close();
                        br1.close();
						
						}
						
					catch (IOException iox){
                        iox.printStackTrace();
                    }
					
					oldFile.delete();
					File dump = new File(file1);
					newFile.renameTo(dump);
					
					Frame.setVisible(false);
					new Removeadmin();
					
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