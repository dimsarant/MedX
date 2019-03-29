package MedX;

import java.sql.*;

public class CheckConnection {
    Connection conn=null;   
    public static Connection ConnectDb() { 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/erecruit", "root", "db password");
            return conn;
           }
        catch(Exception e){return null;}
    }
    
}
