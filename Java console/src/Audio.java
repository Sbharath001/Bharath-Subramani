package bharath;
import java.util.*;

public class Audio {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Player click = new Player();
        click.play(); 
        DBConnection db_connection = new DBConnection();  
        try {
            db_connection.get_connection();  
        } catch (Exception e) {
            System.out.println("SqlException");
        }
    }
}
