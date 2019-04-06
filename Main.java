package MedX;

import static MedX.ConnectDb.ConnectDb;
import static MedX.SystemID.getSystemMotherBoard_SerialNumber;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    static Connection conn=null;
    static String username=null;
    static String system_id=getSystemMotherBoard_SerialNumber();
    
    public static void main(String[] args) {
        
        //<editor-fold defaultstate="collapsed" desc="Look and feel setting code">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
          catch (InstantiationException ex) {java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
          catch (IllegalAccessException ex) {java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
          catch (javax.swing.UnsupportedLookAndFeelException ex) {java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
        //</editor-fold>
        
        conn=ConnectDb();
        Check_Auto_Login();
    }
    
    private static void Check_Auto_Login(){
        String auto_login="0";
        String job=null;
        try{
            String query = "select username,auto_login from temp_users where system_id='"+system_id+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                username=rs.getString("username");
                auto_login=rs.getString("auto_login");
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        if(auto_login.equals("1")){
            try{
                String query = "select job from users where username='"+username+"'";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()){
                    job=rs.getString("job");
                }
                rs.close();
                stmt.close();
            }catch(Exception e){System.out.println(e.getMessage());};
            if(job.equals("Γιατρός")){
            Doctor d = new Doctor(username,conn);
            d.setVisible(true);
            }
            else if(job.equals("Νοσηλευτής")){
                Nurse n = new Nurse(username,conn);
                n.setVisible(true);
            }
            else if(job.equals("Γραμματέας")){
                Secretary s = new Secretary(username,conn);
                s.setVisible(true);
            }
            else if(job.equals("Αποθηκάριος")){
                StoreKeeper s = new StoreKeeper(username,conn);
                s.setVisible(true);
            }
            else if(job.equals("Διευθυντής")){
                Manager m = new Manager(username,conn);
                m.setVisible(true);
            }
        }
        else {
            LoginScreen l = new LoginScreen(conn);
            l.setVisible(true);
        }
    }
}