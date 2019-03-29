package MedX;

import static MedX.ConnectDb.ConnectDb;
import java.sql.Connection;

public class Main {
    static Connection conn=null;
    
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
        LoginScreen l = new LoginScreen(conn);
        l.setVisible(true);
    }        
}