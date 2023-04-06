package Bank.Manager.System;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.*;
public class Sign_Up extends JFrame implements ActionListener {
	
	 long rno;
	 JTextField nametf,fnametf,Lnametf,statetf,pintf,emailtf,addresstf;
	 JTextField citytf;
	 JRadioButton male,female,married,unmarried,other;
	 JDateChooser datechoose;
	 JButton next;
	Sign_Up()
{ 
		setLayout(null);
		
	Random ran=new Random();
     rno=Math.abs(ran.nextLong()%9000L+1000L);
		
		
	JLabel form_num=new JLabel("APPILICATION FORM NUMBER:"+rno);
	form_num.setFont(new Font("Raleway",Font.BOLD,28));
	form_num.setBounds(140, 20, 600, 40);
	add(form_num);
	
	JLabel personal_details=new JLabel("Page 1:Personal Details");
	personal_details.setFont(new Font("Raleway",Font.BOLD,22));
	personal_details.setBounds(290, 80, 400, 30);
	add(personal_details);
	
    JLabel name=new JLabel("Name:");
    name.setFont(new Font("Raleway",Font.BOLD,20));
    name.setBounds(100, 140, 100, 30);
	add(name);
	
	nametf=new JTextField();
	nametf.setFont(new Font("Raleeay",Font.BOLD,14));
	nametf.setBounds(300, 140, 400, 30);
	add(nametf);
	
	JLabel fname=new JLabel("Father's Name:");
	fname.setFont(new Font("Raleway",Font.BOLD,20));
    fname.setBounds(100, 190, 200, 30);
	add(fname);
	
    fnametf=new JTextField();
	fnametf.setFont(new Font("Raleeay",Font.BOLD,14));
	fnametf.setBounds(300, 190, 400, 30);
	add(fnametf);
	
	JLabel Lname=new JLabel("Last Name:");
	Lname.setFont(new Font("Raleway",Font.BOLD,20));
    Lname.setBounds(100, 240, 200, 30);
	add(Lname);
	
	Lnametf=new JTextField();
	Lnametf.setFont(new Font("Raleeay",Font.BOLD,14));
	Lnametf.setBounds(300, 240, 400, 30);
	add(Lnametf);
	
	JLabel dob=new JLabel("Date Of Birth:");
	dob.setFont(new Font("Raleway",Font.BOLD,20));
	dob.setBounds(100, 290, 200, 30);
	add(dob);
	
    datechoose=new JDateChooser();
	datechoose.setBounds(300, 290, 200, 30);
	datechoose.setForeground(Color.BLACK);
	add(datechoose);
	
	JLabel gender=new JLabel("Gender:");
	gender.setFont(new Font("Raleway",Font.BOLD,20));
	gender.setBounds(100, 340, 200, 30);
	add(gender);
	
    male=new JRadioButton("Male");
	male.setBounds(300, 340, 60, 30);
	male.setBackground(Color.WHITE);
	add(male);
	
	
	female=new JRadioButton("Female");
	female.setBounds(450, 340, 100, 30);
    female.setBackground(Color.WHITE);
	add(female);
	
	ButtonGroup gend_g=new ButtonGroup();
	gend_g.add(male);
	gend_g.add(female);
	
	JLabel email=new JLabel("Email ID:");
	email.setFont(new Font("Raleway",Font.BOLD,20));
	email.setBounds(100, 390, 200, 30);
	add(email);
	
    emailtf=new JTextField();
	emailtf.setFont(new Font("Raleeay",Font.BOLD,14));
	emailtf.setBounds(300, 390, 400, 30);
	add(emailtf);
	
	JLabel marital=new JLabel(" Marital Status:");
	 marital.setFont(new Font("Raleway",Font.BOLD,20));
	 marital.setBounds(95, 440, 200, 30);
	 add( marital);
	
	    married=new JRadioButton(" Married");
	    married.setBounds(300, 440, 100, 30);
		married.setBackground(Color.WHITE);
	    add(married);
		
		
		unmarried=new JRadioButton(" Unmarried");
		unmarried.setBounds(450, 440, 100, 30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);
		
		other=new JRadioButton(" Other");
		other.setBounds(630, 440, 100, 30);
		other.setBackground(Color.WHITE);
		add(other);
		
		ButtonGroup married_group=new ButtonGroup();
		married_group.add(married);
		married_group.add(unmarried);
		married_group.add(other);
	 
	 
	 JLabel address=new JLabel(" Address:");
	 address.setFont(new Font("Raleway",Font.BOLD,20));
	 address.setBounds(95, 490, 200, 30);
	 add( address);
	 
	    addresstf=new JTextField();
	    addresstf.setFont(new Font("Raleeay",Font.BOLD,14));
	    addresstf.setBounds(300, 490, 400, 30);
		add(addresstf);

	 JLabel city=new JLabel("City:");
	 city.setFont(new Font("Raleway",Font.BOLD,20));
	 city.setBounds(100, 540, 200, 30);
	 add(city);
	 
	 citytf=new JTextField();
	 citytf.setFont(new Font("Raleeay",Font.BOLD,14));
	 citytf.setBounds(300, 540, 400, 30);
   	 add(citytf);
	 
	 JLabel state=new JLabel("State:");
	 state.setFont(new Font("Raleway",Font.BOLD,20));
	 state.setBounds(100, 590, 200, 30);
	 add(state);
	 
	 statetf=new JTextField();
	 statetf.setFont(new Font("Raleeay",Font.BOLD,14));
	 statetf.setBounds(300, 590, 400, 30);
   	 add(statetf);
	 
	 
	 
	 JLabel pinc=new JLabel("Pin Code:");
	 pinc.setFont(new Font("Raleway",Font.BOLD,20));
	 pinc.setBounds(100, 640, 200, 30);
	 add(pinc);
	 
	 pintf=new JTextField();
	 pintf.setFont(new Font("Raleeay",Font.BOLD,14));
     pintf.setBounds(300, 640, 400, 30);
   	 add(pintf);
	 
   	 
   	 next=new JButton("Next");
   	 next.setBackground(Color.BLACK);
   	 next.setForeground(Color.WHITE);
   	 next.setFont(new Font("Raleway",Font.BOLD,14));
   	 next.setBounds(620, 700, 80, 30);
   	 next.addActionListener(this);
   	 add(next);
   	 
	getContentPane().setBackground(Color.WHITE);
	
	setSize(850,800);	
	setLocation(350,10);
	setVisible(true);
}
   public void actionPerformed(ActionEvent ae) {
	   String formno1=""+rno;
	   String name1=nametf.getText();//get values from textfield
	   String f_name1=fnametf.getText();
	   String l_name1=Lnametf.getText();
	   String dob1=((JTextField)datechoose.getDateEditor().getUiComponent()).getText();
	   String gender1=null;
	   if(male.isSelected()) {
		   gender1="Male";
	   }
	   else if(female.isSelected()) {
		   gender1="Female";
	   }
	   
	   String email_add=emailtf.getText();
	   String maritals=null;
	   if(married.isSelected())
	   {
		   maritals="Married";
	   }
	   
	   else if(unmarried.isSelected()) {
		   maritals="Unmarried";
	   }
	   else if(other.isSelected())
	   {
		   maritals="Other";
	   }
	   
	   String addreess1=addresstf.getText();
	   String city1=citytf.getText();
	   String state1=statetf.getText();
	   String pin1=pintf.getText();
	   
	   try {
		   if(name1.equals("")) {
			   JOptionPane.showMessageDialog(null, "Name is Required");
		   }
		   
		   else if(f_name1.equals("")) {
			   JOptionPane.showMessageDialog(null, "Father name is required");
		   }
		   
		   else if(l_name1.equals("")) {
			   JOptionPane.showMessageDialog(null, "Last name is required");
		   }
		   else if(dob1.equals("")) {
			   JOptionPane.showMessageDialog(null, "Date of Birth is required");
		   }
		   
		   else if(gender1.equals("")) {
			   JOptionPane.showMessageDialog(null, "Gender is required");
		   }
		   
		   else if(email_add.equals("")) {
			   JOptionPane.showMessageDialog(null, "Email Address is required");
		   }
		   
		   else if(maritals.equals("")) {
			   JOptionPane.showMessageDialog(null, "Marital status is required");
		   }
		   
		 
		   
		   else {
			   Conne con1=new Conne();
			  String query="insert into Signup values('"+formno1+"','"+name1+"','"+f_name1+"','"+l_name1+"','"+dob1+"','"+gender1+"','"+email_add+"','"+maritals+"','"+addreess1+"','"+city1+"','"+state1+"','"+pin1+"')";
			 int i= con1.st.executeUpdate(query);
			/* if(i==1) 
				 System.out.println("\n\n\t Inserted Succesfull");
			 else
				 System.out.println("Fail");*/
			 setVisible(false);
			new SignupTwo(formno1).setVisible(true);
			 
		   }
	   }
	   catch(Exception e) {
		   System.out.println(e);
		   
	   }
	   
   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sign_Up sn=new Sign_Up();

	}

}
