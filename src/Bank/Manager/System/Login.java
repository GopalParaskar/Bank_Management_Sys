package Bank.Manager.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
	JButton login,signup,clear;
	JTextField ctf;
	JPasswordField pinTextfd;
	Login()
	{
		setTitle("Welcome To ATM");
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image im=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i2=new ImageIcon(im);
		JLabel label= new JLabel(i2);
		label.setBounds(70, 10, 100,100);
		add(label);
		
		
		JLabel text=new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward",Font.BOLD,30));
		text.setBounds(200, 40, 400, 40);
		add(text);
		
		
		JLabel cardno=new JLabel("Card No:");
		cardno.setFont(new Font("Raleway",Font.BOLD,28));
		cardno.setBounds(120, 150, 400, 40);
		add(cardno);
		
		ctf=new JTextField();
		ctf.setBounds(300, 150,250,30);
		ctf.setFont(new Font("Arial",Font.BOLD,14));
		add(ctf);
		
		JLabel pin=new JLabel("Pin:");
		pin.setFont(new Font("Raleway",Font.BOLD,28));
		pin.setBounds(120, 220, 250, 30);
		add(pin);
		
		pinTextfd=new JPasswordField();
		pinTextfd.setBounds(300, 220,250,30);
		pinTextfd.setFont(new Font("Arial",Font.BOLD,14));
		add(pinTextfd);
		
		login=new JButton("SIGN IN");
		login.setBounds(300, 300, 100, 30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		
		clear=new JButton("CLEAR");
		clear.setBounds(430, 300, 100,30);
		clear.setBackground(Color.darkGray);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);
		
		signup=new JButton("SIGN UP");
		signup.setBounds(300, 350, 230, 30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		add(signup);
		
		
	    getContentPane().setBackground(Color.WHITE);
		setSize(800,400);
		setVisible(true);
		setLocation(350,200);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==clear)
		{
			ctf.setText("");
			pinTextfd.setText("");
		}
		else if(ae.getSource()==login)
		{
			
		}
		else if(ae.getSource()==signup)
		{
			setVisible(false);
			new Sign_Up().setVisible(true);
		}
	}
	public static void main(String args[])
	{
		new Login();
		
	}

}
