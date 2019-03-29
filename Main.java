package MedX;

public class Main {
    
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
        
        LoginScreen l = new LoginScreen();
        l.setVisible(true);
    }        
}

//D:\wamp64\bin\mysql\mysql5.7.23\bin\mysql.exe -u root -p --default-character-set=greek