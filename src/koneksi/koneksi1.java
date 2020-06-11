package koneksi;
import java.sql.*;
/**
 *
 * @author FANI-IMUT
 */
public class koneksi1 {
    public Connection cc;
    public Statement ss;
    public ResultSet rr;

public void Class () {
    try {
            Class.forName("com.mysql.jdbc.Driver");
            cc=DriverManager.getConnection("Jdbc:mysql://localhost/login","root","");
            System.out.println("koneksi sukses");
            
    }
    catch (Exception e) {
        System.out.println (e);
    }
    }
}
