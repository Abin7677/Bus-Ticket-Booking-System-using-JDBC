package Bus_Ticket;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Scanner;



public class Bus_ticket {
private static Connection NULL;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Bus_ticket b=new Bus_ticket();
        b.choice();
        Connection4 c4=new Connection4();
		c4.getConnection();

	}
   
	void choice() throws ClassNotFoundException, SQLException 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Choose Option\n1)Admin login\n2)User Login\n3)Exit");
		System.out.println("Enter the choice");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			Admin ad=new Admin();
			ad.adminlogin();
			break;
		case 2:
			user u=new user();
			u.userlogin();
			break;
		case 3:
			System.out.println("Successfully logout");
			return;
		}
	}
	
}
