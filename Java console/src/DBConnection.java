package bharath;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{
	public static Connection connection=null;
	public Connection getConnection()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/songdetails","root","Sbharath@01");
		return connection;
		
	}

}
