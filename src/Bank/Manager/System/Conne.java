package Bank.Manager.System;
import java.sql.*;
public class Conne {
   Connection con=null;
   Statement st;
	public Conne() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/BankManagerSysm";
			String user="root";
			String pass="password";
			con=(Connection)DriverManager.getConnection(url,user,pass);
			st=con.createStatement();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
