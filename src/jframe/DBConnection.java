package jframe;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {
    
    public static Connection connect()
    {
       
        Connection con = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtualwarehouse?","root","");
            //JOptionPane.showMessageDialog(null,"Connection success");
        }catch(Exception e){
            
        }
        return con;
    }
}
