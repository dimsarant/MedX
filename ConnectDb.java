package MedX;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectDb {
    Connection conn=null;   
    public static Connection ConnectDb() { 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/medx", "medx", "");
            return conn;
           }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Database connection not established\n"+e);
            return null;}
    }
    
}
