import java.sql.*;
public class company {

	String dbUrl = "jdbc:postgresql://localhost:5432/Company";
	String user = "postgres";
	String pass = "cat";
	
	public void connect() {
		
		try(Connection myConn = DriverManager.getConnection(dbUrl, user, pass);) {
			if(myConn != null) { 
				System.out.println("Connected to the PostgreSQL server successfully.");
			}
		 	else {
				System.out.println("Failed to connect.");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		company connect = new company();
		connect.connect();
		/*Statement myStmt = myConn.createStatement();
		
		ResultSet myRs = myStmt.executeQuery("select first_name, last_name from employees");
		
		while(myRs.next()) {
			System.out.println(myRs.getString("first_name"));
			System.out.println(myRs.getString("last_name")); 
		} */

	}

}
