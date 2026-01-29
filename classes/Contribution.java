package classes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Contribution implements ActionListener {
   JFrame frame = new JFrame("MOVIEFLIX");
   JLabel background;
   JLabel pageName;
   JLabel lbl;
   JLabel lbl1;
   JLabel lbl2;
   JLabel lbl3;
   JLabel lbl4;
   JLabel lbl5;
   JButton back;
   JButton exit;
   JPanel panel;
   ImageIcon bg = new ImageIcon("images/welcomeBG.jpg");
   ImageIcon homeIcon = new ImageIcon("images/logo.png");

   public Contribution() {
      this.frame.setLayout((LayoutManager)null);
      this.background = new JLabel(this.bg);
      this.background.setBounds(0, 0, 1366, 768);
      this.frame.add(this.background);
      this.panel = new JPanel();
      this.panel.setBounds(440, 50, 480, 630);
      this.panel.setBackground(new Color(0, 0, 0, 170));
      this.panel.setLayout((LayoutManager)null);
      this.background.add(this.panel);
      this.pageName = new JLabel("MOVIEFLIX");
      this.pageName.setBounds(40, 30, 400, 30);
      this.pageName.setForeground(Color.RED);
      this.pageName.setFont(new Font("Serif", 1, 35));
      this.background.add(this.pageName);
      this.lbl = new JLabel("MD.FIROZ MAHMUD SAIKAT");
      this.lbl.setBounds(452, 160, 500, 30);
      this.styleLabel(this.lbl);
      this.lbl1 = new JLabel("22-47363-2");
      this.lbl1.setBounds(585, 210, 400, 30);
      this.styleLabel(this.lbl1);
      
      
      this.lbl2 = new JLabel("");
      this.lbl2.setBounds(490, 310, 500, 30);
      this.styleLabel(this.lbl2);
      
      this.lbl3 = new JLabel("");
      this.lbl3.setBounds(585, 360, 400, 30);
      this.styleLabel(this.lbl3);
      
      this.lbl4 = new JLabel("MST SHOUMUN LINNAS JIM");
      this.lbl4.setBounds(452, 420, 500, 30);
      this.styleLabel(this.lbl4);
      this.lbl5 = new JLabel("22-47506-2");
      this.lbl5.setBounds(585, 470, 400, 30);
      this.styleLabel(this.lbl5);
      this.background.add(this.lbl);
      this.background.add(this.lbl1);
      this.background.add(this.lbl2);
      this.background.add(this.lbl3);
      this.background.add(this.lbl4);
      this.background.add(this.lbl5);
      this.back = new JButton("BACK");
      this.back.setBounds(3, 700, 100, 30);
      this.styleButton(this.back);
      this.background.add(this.back);
      this.exit = new JButton("EXIT");
      this.exit.setBounds(1250, 700, 100, 30);
      this.styleButton(this.exit);
      this.background.add(this.exit);
      this.frame.setIconImage(this.homeIcon.getImage());
      this.frame.setSize(1366, 768);
      this.frame.setLocationRelativeTo((Component)null);
      this.frame.setResizable(false);
      this.frame.setDefaultCloseOperation(3);
      this.frame.setVisible(true);
   }

   private void styleLabel(JLabel var1) {
      var1.setForeground(Color.WHITE);
      var1.setFont(new Font("Serif", 0, 35));
   }

   private void styleButton(JButton var1) {
      var1.setForeground(Color.WHITE);
      var1.setBackground(Color.BLACK);
      var1.setFocusPainted(false);
      var1.setCursor(new Cursor(12));
      var1.addActionListener(this);
   }

   public void actionPerformed(ActionEvent var1) {
      if (var1.getSource() == this.back) {
         new Welcome();
         this.frame.dispose();
      } else if (var1.getSource() == this.exit) {
         System.exit(0);
      }

   }
}