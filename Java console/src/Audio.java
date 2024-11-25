package bharath;
import java.util.*;

public class Audio
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[])
	{
		Player click=new Player();
		click.Play();
		DBConnection dbconnection=new DBConnection();
		try {
		dbconnection.getConnection();
		}catch(Exception e) {
			System.out.println("SqlException");
		}
	}
}
