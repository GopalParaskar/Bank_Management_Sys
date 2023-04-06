package Bank.Manager.System;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;

import javax.swing.*;

public class SignUp3 extends JFrame implements ActionListener {
	
	JRadioButton save,current,fixdepo,recur;
	JButton submit,cancel;
	JCheckBox atm,ibank,mbank,salert,cbook,estate,ihd;
	String formno;
	
	 SignUp3(String formno){
		 this.formno=formno;
		 setLayout(null);
		 JLabel page3=new JLabel("Page 3:Account Details");
		 page3.setFont(new Font("Raleway",Font.BOLD,22));
		 page3.setBounds(280, 40, 400, 40);
		 add(page3);
		 
		 
		 JLabel type=new JLabel("Account Type");
		 type.setFont(new Font("Raleway",Font.BOLD,22));
		 type.setBounds(100, 140, 200, 30);
		 add(type);
		 
		 save=new JRadioButton("Saving Account");
		 save.setFont(new Font("Raleawy",Font.BOLD,16));
		 save.setBackground(Color.WHITE);
		 save.setBounds(100, 180, 150, 20);
		 add(save);
		 
		 current=new JRadioButton("Current Account");
		 current.setFont(new Font("Raleawy",Font.BOLD,16));
		 current.setBackground(Color.WHITE);
		 current.setBounds(350, 180, 200, 20);
		 add(current);
		 
		 
		 fixdepo=new JRadioButton("Fixed Deposit Account");
		 fixdepo.setFont(new Font("Raleawy",Font.BOLD,16));
		 fixdepo.setBackground(Color.WHITE);
		 fixdepo.setBounds(100, 220, 200, 20);
		 add(fixdepo);
		 
		 recur=new JRadioButton("Recurr Deposit Account");
		 recur.setFont(new Font("Raleawy",Font.BOLD,16));
		 recur.setBackground(Color.WHITE);
		 recur.setBounds(350, 220, 200, 20);
		 add(recur);
		 
		 ButtonGroup accoutbg=new ButtonGroup();
		 accoutbg.add(save);
		 accoutbg.add(current);
		 accoutbg.add(fixdepo);
		 accoutbg.add(recur);
		 
		 JLabel cardNo=new JLabel("Card Number");
		 cardNo.setFont(new Font("Raleway",Font.BOLD,22));
		 cardNo.setBounds(100, 290, 200, 30);
		 add(cardNo);
		 
		 JLabel number=new JLabel("XXXX-XXXX-XXXX-4432");
		 number.setFont(new Font("Raleway",Font.BOLD,22));
		 number.setBounds(330, 290, 300, 30);
		 add(number);
		 

		 JLabel carddtail=new JLabel("This is Your 16 digit cardno");
		 carddtail.setFont(new Font("Raleway",Font.BOLD,12));
		 carddtail.setBounds(100, 330, 300, 20);
		 add(carddtail);
		 
		 JLabel pin=new JLabel("PIN");
		 pin.setFont(new Font("Raleway",Font.BOLD,22));
		 pin.setBounds(100, 370, 100, 30);
		 add(pin);
		 
		 JLabel pininfo=new JLabel("Your 4-digit password");
		 pininfo.setFont(new Font("Raleway",Font.BOLD,12));
		 pininfo.setBounds(100, 400, 300, 20);
		 add(pininfo);

		 JLabel pnumber=new JLabel("XXXX");
		 pnumber.setFont(new Font("Raleway",Font.BOLD,22));
		 pnumber.setBounds(330, 370, 100, 30);
		 add(pnumber);
		 
		
		 JLabel service=new JLabel("Services Required");
		 service.setFont(new Font("Raleway",Font.BOLD,22));
		 service.setBounds(100, 450, 200, 30);
		 add(service);
		 
		 atm=new JCheckBox("ATM CARD");
		 atm.setBackground(Color.WHITE);
		 atm.setFont(new Font("Raleway",Font.BOLD,11));
		 atm.setBounds(100, 500, 150, 30);
		 add(atm);
		 
		 ibank=new JCheckBox("Internet Banking");
		 ibank.setBackground(Color.WHITE);
		 ibank.setFont(new Font("Raleway",Font.BOLD,11));
		 ibank.setBounds(300, 500, 150, 30);
		 add(ibank);
		 
		 mbank=new JCheckBox("Mobile Banking");
		 mbank.setBackground(Color.WHITE);
		 mbank.setFont(new Font("Raleway",Font.BOLD,11));
		 mbank.setBounds(100, 550, 150, 30);
		 add(mbank);
		 
		 salert=new JCheckBox("Email& SMS Alert");
		 salert.setBackground(Color.WHITE);
		 salert.setFont(new Font("Raleway",Font.BOLD,11));
		 salert.setBounds(300, 550, 150, 30);
		 add(salert);
		 
		 cbook=new JCheckBox("Cheque Book");
		 cbook.setBackground(Color.WHITE);
		 cbook.setFont(new Font("Raleway",Font.BOLD,11));
		 cbook.setBounds(100, 600, 150, 30);
		 add(cbook);
		 
		 estate=new JCheckBox("E-Statement");
		 estate.setBackground(Color.WHITE);
		 estate.setFont(new Font("Raleway",Font.BOLD,11));
		 estate.setBounds(300, 600, 150, 30);
		 add(estate);
		 
		 ihd=new JCheckBox("I hereby declares that the above entered details are correct to the best of my Knowledge. ");
		// ihd.setBackground(Color.WHITE);
		 ihd.setFont(new Font("Raleway",Font.BOLD,11));
		 ihd.setBounds(100, 640, 600, 30);
		 add(ihd);
		 
		 submit=new JButton("SUBMIT");
		 submit.setBackground(Color.BLACK);
		 submit.setForeground(Color.WHITE);
		 submit.setFont(new Font("Raleway",Font.BOLD,14));
		 submit.setBounds(200, 680, 100, 30);
		 submit.addActionListener(this);
		 add(submit);
		 
		 
		 cancel=new JButton("CANCEL");
		 cancel.setBackground(Color.BLACK);
		 cancel.setForeground(Color.WHITE);
		 cancel.setFont(new Font("Raleway",Font.BOLD,14));
		 cancel.setBounds(420, 680, 100, 30);
		 cancel.addActionListener(this);
		 add(cancel);
		 
		 getContentPane().setBackground(Color.WHITE);
		 
         setSize(800,800);
		 setLocation(350,0);
		 setVisible(true);
		 
	 }
	 
	 public void actionPerformed(ActionEvent ae){
		 if(ae.getSource()==submit) {
			 String accountType=null;
			 if(save.isSelected())
			 {
				 accountType="Saving Account";
			 }
			 else if(current.isSelected()) {
				 accountType="Current Account";
			 }
			 else if(fixdepo.isSelected()) {
				 accountType="Fixed Deposite Account";
			 }
			 
			 else if(recur.isSelected()) {
				 accountType="Reccuring Account";
			 }
			 
			 Random random= new Random();
			 String cardnum=" "+Math.abs((random.nextLong()%90000000)+504093600000000L);
			 String pinnum=" "+Math.abs(random.nextLong()%9000L+1000L);
			 
			 String facility="";
			// atm,ibank,mbank,salert,cbook,estate,ihd;
			 if(atm.isSelected()) {
				
				 facility=facility +"ATM CARD";
				 
			 }
			 else if(ibank.isSelected()) {
				 facility=facility+"Internet Banking";
			 }
             else if(mbank.isSelected()) {
				
            	 facility=facility+"Mobile Banking"; 
			 }
             
             else if(salert.isSelected()) {
            	 facility=facility+"SMS Alert Message";
			 }
             else if(cbook.isSelected()) {
            	 facility=facility+"Check Book";
			 }
			 
            else if(estate.isSelected()) {
            	facility=facility+"E-Statement";
			 }
			 try {
				 if(accountType.equals("")) {
					 JOptionPane.showMessageDialog(null, "Account Type is required");
				 }
				 else {
					 Conne conn=new Conne();
					 String query1="insert into signthree values('"+formno+"','"+accountType+"','"+cardnum+"','"+pinnum+"','"+facility+"')";
					 String query2="insert into login values('"+formno+"','"+cardnum+"','"+pinnum+"')";
			         conn.st.executeUpdate(query1);	
			         conn.st.executeUpdate(query2);
			         
			         JOptionPane.showMessageDialog(null, "Card Number:"+cardnum +"\n Pin:"+pinnum);
					 
				 }
				 
			 } catch(Exception e) {
				 System.out.println(e);
			 }
		
		 }
		 else if(ae.getSource()==cancel)
		 {
			 
		 }
		
	 }
	 public static void main(String args[]) {
		 new  SignUp3("");
	 }

}
