package Bank.Manager.System;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class Transaction extends JFrame {
	Transaction(){
		setLayout(null);
		ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/atm1.jpg"));
		Image i2=i.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 800, 800);
		add(image);
		
		
		JLabel text =new JLabel("Please select Your Trancastion");
		text.setBounds(210, 300, 700, 35);
		text.setForeground(Color.DARK_GRAY);
		text.setFont(new Font("System",Font.BOLD,18));
		image.add(text);
		
		JButton depos=new JButton("Deposite");
		depos.setBounds(170, 415, 150, 30);
		image.add(depos);
		
		JButton withdraw=new JButton("Cash Withdraw");
		withdraw.setBounds(355, 415, 150, 30);
		image.add(withdraw);
		
		JButton fastcash=new JButton("Fast Cash ");
		fastcash.setBounds(170, 450, 150, 30);
		//fastcash.setBackground(Color.WHITE);
		//fastcash.setForeground(Color.BLACK);
		image.add(fastcash);
		
		JButton minis=new JButton("Mini Statement");
		minis.setBounds(355, 450, 150, 30);
		image.add(minis);
		

		JButton pinchange=new JButton("Change Pin");
		pinchange.setBounds(170, 485, 150, 30);
		image.add(pinchange);
		

		JButton balanceiq=new JButton("Balance  Enquiry");
		balanceiq.setBounds(355, 485, 150, 30);
		image.add(balanceiq);
		
		JButton exit=new JButton("Exit");
		exit.setBounds(260, 540, 150, 30);
		image.add(exit);
		
		setSize(800,800);
		setLocation(300,0);
		//setUndecorated(true);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Transaction();

	}

}
