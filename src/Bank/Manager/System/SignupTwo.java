package Bank.Manager.System;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.*;
public class SignupTwo extends JFrame implements ActionListener {
	
	
	JComboBox religion,catgr,incom,edu,occupation;
	 JTextField aadhar,pan;
	 JRadioButton syes,sno,Eyes,Eno;
	 JButton next;
	 String formn;
	SignupTwo(String formn)
{      
		this.formn=formn;
		setLayout(null);
		
	setTitle("NEW ACCOUNT APPLICATION-PAGE2");
		
		
	
	JLabel additionaldetails=new JLabel("Page 2:Additional Details");
	additionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
	additionaldetails.setBounds(290, 80, 400, 30);
	add(additionaldetails);
	
	
	
    JLabel rel=new JLabel("Religion:");
    rel.setFont(new Font("Raleway",Font.BOLD,20));
    rel.setBounds(100, 140, 100, 30);
	add(rel);
	
	String valrel[]= {"Select","Hindu","Muslim","Sikh","Christian","Other"};
	religion=new JComboBox(valrel);
	religion.setBounds(300, 140, 400, 30);
	religion.setBackground(Color.WHITE);
	add(religion);
	
	
	
	JLabel cat=new JLabel("Category");
	cat.setFont(new Font("Raleway",Font.BOLD,20));
    cat.setBounds(100, 190, 200, 30);
	add(cat);
	
	String valcat[]= {"Select","OPEN","OBC","General","SC","ST","OTHER"};
	catgr=new JComboBox(valcat);
	catgr.setBounds(300, 190, 400, 30);
	catgr.setBackground(Color.WHITE);
	add(catgr);
	
	
	
	JLabel dob=new JLabel("Income:");
	dob.setFont(new Font("Raleway",Font.BOLD,20));
	dob.setBounds(100, 240, 200, 30);
	add(dob);
	
	String valIncom[]= {"Select","NULL","<1,50,000","<2,50,000","5,00,000","Up to 10 Lakh"};
	incom=new JComboBox(valIncom);
	incom.setBounds(300, 240, 200, 30);
	incom.setBackground(Color.WHITE);
	incom.setForeground(Color.BLACK);
	add(incom);
	
	
    
	
	JLabel gender=new JLabel("Education:");
	gender.setFont(new Font("Raleway",Font.BOLD,20));
	gender.setBounds(100, 290, 200, 30);
	add(gender);
	
   
	
	JLabel email=new JLabel("Qualification:");
	email.setFont(new Font("Raleway",Font.BOLD,20));
	email.setBounds(100, 315, 200, 30);
	add(email);
	
	String eduVal[]= {"Select","NOn-Graduation","Graduate","Post-Gaduation","Doctorat","Other"};
    edu=new JComboBox(eduVal);
	edu.setBounds(300, 315, 400, 30);
	edu.setBackground(Color.WHITE);
	add(edu);
	
	
  
	
	JLabel marital=new JLabel(" Occupation:");
	 marital.setFont(new Font("Raleway",Font.BOLD,20));
	 marital.setBounds(95, 390, 200, 30);
	 add( marital);
	 
	 
	 String occuVal[]= {"Select","Salarried","Self-Employed","Businessman","Student","Farmer","Others"};
		occupation=new JComboBox(occuVal);
		occupation.setBounds(300, 390, 400, 30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
	
	 
	 JLabel panno=new JLabel(" PAN NUMBER:");
	 panno.setFont(new Font("Raleway",Font.BOLD,20));
	 panno.setBounds(95, 440, 200, 30);
	 add( panno);
	 
	    pan=new JTextField();
	    pan.setFont(new Font("Raleeay",Font.BOLD,14));
	    pan.setBounds(300, 440, 400, 30);
		add(pan);

	 JLabel aadharno=new JLabel("Adhar Number:");
	 aadharno.setFont(new Font("Raleway",Font.BOLD,20));
	 aadharno.setBounds(100, 490, 200, 30);
	 add(aadharno);
	 
	 aadhar=new JTextField();
	 aadhar.setFont(new Font("Raleeay",Font.BOLD,14));
	 aadhar.setBounds(300, 490, 400, 30);
   	 add(aadhar);
	 
	 JLabel senior=new JLabel("Senior Citizen:");
	 senior.setFont(new Font("Raleway",Font.BOLD,20));
	 senior.setBounds(100, 540, 200, 30);
	 add(senior);
	
	 
	 syes=new JRadioButton("Yes");
	 syes.setBounds(300, 540, 100, 30);
	 syes.setBackground(Color.WHITE);
	 add(syes);
	 
	 
	 sno=new JRadioButton("No");
	 sno.setBounds(450, 540, 150, 30);
	 sno.setBackground(Color.WHITE);
	 add(sno);
	 
	 ButtonGroup seniorbg=new ButtonGroup();
	 seniorbg.add(syes);
	 seniorbg.add(sno);
	 
	 
	 
	 JLabel pinc=new JLabel("Existing Account:");
	 pinc.setFont(new Font("Raleway",Font.BOLD,20));
	 pinc.setBounds(100, 590, 200, 30);
	 add(pinc);
	 
	 
	 Eyes=new JRadioButton("Yes");
	 Eyes.setBounds(300, 590, 100, 30);
	 Eyes.setBackground(Color.WHITE);
	 add(Eyes);
	 
	 
	 Eno=new JRadioButton("No");
	 Eno.setBounds(450, 590, 200, 30);
	 Eno.setBackground(Color.WHITE);
	 add(Eno);
	 
	 ButtonGroup eaaccbg=new ButtonGroup();
	 eaaccbg.add(Eyes);
	 eaaccbg.add(Eno);
	 

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
	
	   String religion1=(String)religion.getSelectedItem();//get values from textfield
	   String categaory1=(String)catgr.getSelectedItem();
	   String income1=(String)incom.getSelectedItem();
	   String education1=(String)edu.getSelectedItem();
	   String occupation1=(String)occupation.getSelectedItem();
	   String senior1=null;
	   if(syes.isSelected()) {
		   senior1="Yes";
	   }
	   else if(sno.isSelected()) {
		   senior1="No";
	   }
	   
	  
	   String account=null;
	   if(Eyes.isSelected())
	   {
		   account="Yes";
	   }
	   
	   else if(Eno.isSelected()) {
		   account="No";
	   }
	 
	   
	   String pancard=pan.getText();
	   String aadharcard=aadhar.getText();
	
	   try {
		  
			   Conne con1=new Conne();
			  String query="insert into SignupTwo values('"+formn+"','"+religion1+"','"+categaory1+"','"+income1+"','"+education1+"','"+occupation1+"','"+senior1+"','"+account+"','"+pancard+"','"+aadharcard+"')";
			 int i= con1.st.executeUpdate(query);
			 if(i==1) 
				 System.out.println("\n\n\t Inserted Succesfull");
			 else
				 System.out.println("Fail");
			 
		   //For sugnup three
			 setVisible(false);
			 new SignUp3(formn).setVisible(true);
			 
	   }
	   catch(Exception e) {
		   System.out.println(e);
		   
	   }
	   
   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignupTwo sn=new SignupTwo("");

	}

}
