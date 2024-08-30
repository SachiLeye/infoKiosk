package infoKioskSystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class db_connect {
                                                       //db name
	private String url ="jdbc:mysql://localhost:3306/infokiosk_db";
	private String username = "root";
	private String password = "";
	
	public Connection con;
	
	public void connect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			con = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connected Succesfully");
		}catch(Exception e) {
			System.err.println("Failed to Connect");
			e.printStackTrace();
		}
	}
}
