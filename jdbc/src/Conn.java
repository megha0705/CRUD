import java.sql.Connection;
import java.sql.DriverManager;

public class Conn{
    public static Connection connect(){
        Connection con = null;
        try{
            String url = "jdbc:mysql://localhost:3306/db";
            String user = "root";
            String password = "Megha05711@%";
             con = DriverManager.getConnection(url, user, password);
        }catch(Exception e){
            e.getStackTrace();
        }
        return con;

    }
}
