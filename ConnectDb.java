package MedX;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectDb {  
    public static Connection ConnectDb() { 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/medx?characterEncoding=utf8", "medx", "70567914");
            return conn;
        }catch(Exception e){JOptionPane.showMessageDialog(null,e);
                            return null;
        }
    }
}
