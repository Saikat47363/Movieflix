package classes;

import movieclasses.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class Receivedreq implements ActionListener{
	
	JFrame Frame;
	
	private JLabel  background,pageName,adminlbl,lbl;
	private JButton backbtn, exitbtn;
	private ImageIcon Homeicon, bg;
	private JPanel panel1,panel2;
	
	
	private DefaultTableModel model;
	private JTable table;
	private JScrollPane scroll;
	private String[] column = {"User Name", "Movie Name", "Genre", "Release Year"};
    private String[] rows = new String[5];
	
	public Receivedreq()
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
		
		
		//PROJECT NAME
		lbl = new JLabel("RECEIVED REQUEST");
		lbl.setBounds(520,90,400,40);
		lbl.setForeground(new Color(255,255,255));
		lbl.setFont(new Font("serif",Font.PLAIN,28));
		
		
		table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setBackground(new Color(220,220,220));
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setEnabled(false);
        table.getColumnModel().getColumn(0).setPreferredWidth(150);
        table.getColumnModel().getColumn(1).setPreferredWidth(300);
        table.getColumnModel().getColumn(2).setPreferredWidth(300);
		table.getColumnModel().getColumn(3).setPreferredWidth(250);


        scroll = new JScrollPane(table);
        scroll.setBounds(320, 150, 680, 450);
		scroll.getViewport().setBackground(new Color(195,195,195));
        Frame.add(scroll);
		
		
		String file = "data\\admin\\requested_movies.txt";

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
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(12); // Movie Name
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(7); // genre
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(14); // release year
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
			ex.printStackTrace();
        }
		
		

		
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
		//PANEL
		panel2 = new JPanel();
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
		
		if(e.getSource()==backbtn)
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