package Bus_Ticket;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class user {

	public void userlogin() throws ClassNotFoundException, SQLException {
		
		Scanner s=new Scanner(System.in);
		Connection4 c4=new Connection4();
		c4.getConnection();
		int op1;
		
		System.out.println("enter username");
		String user=s.next();
	    System.out.println("enter password");
		String pass=s.next();
	       
	        boolean cu = false;
	        String query = "SELECT * FROM userlogin WHERE username =?";
	            PreparedStatement    ps = (PreparedStatement) c4.getConnection().prepareStatement(query);
	            ps.setString(1,user);
	            
	            ResultSet   rs = ps.executeQuery();
	            
	            if(rs.next())
	            {
	                cu = true;
	            }
	        
	         if(cu==true) {
	        	 System.out.println("Successfully logged in");
	              UserDetail user1=new UserDetail();
	              user1.deatils();}
	         else
	        	 System.out.println("User name or password does't exist");
	         Bus_ticket b=new Bus_ticket();
	         b.choice();
		
	}

}
