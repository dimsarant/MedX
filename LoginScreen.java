package MedX;

    //<editor-fold defaultstate="collapsed" desc="Imports">
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.Collections;
import javax.swing.BorderFactory;
import java.sql.*;
//</editor-fold>

public class LoginScreen extends javax.swing.JFrame {
    
    //<editor-fold defaultstate="collapsed" desc="LoginScreen Constructor">
    public LoginScreen(Connection condb) {
        initComponents();
        conn=condb;
        this.setLocationRelativeTo(null);
        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.emptySet());
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        CloseButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        UsernameLabel.setVisible(true);
        PasswordLabel.setVisible(true);
        LoginScreen.requestFocus();
    }
    //</editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginScreen = new javax.swing.JPanel();
        Doctor_Login = new javax.swing.JButton();
        Nurse_Login = new javax.swing.JButton();
        Secretary_Login = new javax.swing.JButton();
        Manager_Login = new javax.swing.JButton();
        StoreKeeper_Login = new javax.swing.JButton();
        AutoLogin = new javax.swing.JCheckBox();
        RememberMe = new javax.swing.JCheckBox();
        Loading = new javax.swing.JLabel();
        EnterData = new javax.swing.JLabel();
        MissingAccount = new javax.swing.JLabel();
        MissingAccountCountDown = new javax.swing.JLabel();
        RegisteredElse = new javax.swing.JLabel();
        NotMatchingPasswords = new javax.swing.JLabel();
        Warning = new javax.swing.JLabel();
        WarningCountdown = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        Title = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MedX");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/windowicon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(470, 350));
        setName("LoginPage"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        LoginScreen.setMinimumSize(new java.awt.Dimension(475, 350));
        LoginScreen.setPreferredSize(new java.awt.Dimension(475, 350));
        LoginScreen.setLayout(null);

        Doctor_Login.setText("Γιατρός");
        Doctor_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Doctor_Login.setFocusPainted(false);
        Doctor_Login.setFocusable(false);
        Doctor_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Doctor_LoginActionPerformed(evt);
            }
        });
        LoginScreen.add(Doctor_Login);
        Doctor_Login.setBounds(340, 130, 100, 22);

        Nurse_Login.setText("Νοσηλευτής");
        Nurse_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nurse_Login.setFocusPainted(false);
        Nurse_Login.setFocusable(false);
        Nurse_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nurse_LoginActionPerformed(evt);
            }
        });
        LoginScreen.add(Nurse_Login);
        Nurse_Login.setBounds(340, 160, 100, 22);

        Secretary_Login.setText("Γραμματέας");
        Secretary_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Secretary_Login.setFocusPainted(false);
        Secretary_Login.setFocusable(false);
        Secretary_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Secretary_LoginActionPerformed(evt);
            }
        });
        LoginScreen.add(Secretary_Login);
        Secretary_Login.setBounds(340, 190, 100, 22);

        Manager_Login.setText("Διευθυντής");
        Manager_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Manager_Login.setFocusPainted(false);
        Manager_Login.setFocusable(false);
        Manager_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Manager_LoginActionPerformed(evt);
            }
        });
        LoginScreen.add(Manager_Login);
        Manager_Login.setBounds(340, 220, 100, 22);

        StoreKeeper_Login.setText("Αποθηκάριος");
        StoreKeeper_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StoreKeeper_Login.setFocusPainted(false);
        StoreKeeper_Login.setFocusable(false);
        StoreKeeper_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoreKeeper_LoginActionPerformed(evt);
            }
        });
        LoginScreen.add(StoreKeeper_Login);
        StoreKeeper_Login.setBounds(340, 250, 100, 22);

        AutoLogin.setBackground(new java.awt.Color(255, 255, 255));
        AutoLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AutoLogin.setForeground(new java.awt.Color(81, 81, 81));
        AutoLogin.setText("Συνδέσου αυτόματα");
        AutoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AutoLogin.setFocusable(false);
        AutoLogin.setOpaque(false);
        AutoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoLoginActionPerformed(evt);
            }
        });
        LoginScreen.add(AutoLogin);
        AutoLogin.setBounds(300, 320, 150, 13);

        RememberMe.setBackground(new java.awt.Color(255, 255, 255));
        RememberMe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RememberMe.setForeground(new java.awt.Color(81, 81, 81));
        RememberMe.setText("Θυμήσου με");
        RememberMe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RememberMe.setFocusable(false);
        RememberMe.setOpaque(false);
        RememberMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RememberMeActionPerformed(evt);
            }
        });
        LoginScreen.add(RememberMe);
        RememberMe.setBounds(300, 300, 100, 13);

        Loading.setVisible(false);
        Loading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Loading.gif"))); // NOI18N
        LoginScreen.add(Loading);
        Loading.setBounds(200, 190, 70, 60);

        EnterData.setVisible(false);
        EnterData.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        EnterData.setForeground(new java.awt.Color(255, 51, 51));
        EnterData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterData.setText("Εισάγετε Στοιχεία");
        LoginScreen.add(EnterData);
        EnterData.setBounds(130, 270, 220, 30);

        MissingAccount.setVisible(false);
        MissingAccount.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        MissingAccount.setForeground(new java.awt.Color(255, 51, 51));
        MissingAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MissingAccount.setText("Ο ΛΟΓΑΡΙΑΣΜΟΣ ΔΕΝ ΥΠΑΡΧΕΙ");
        LoginScreen.add(MissingAccount);
        MissingAccount.setBounds(60, 270, 350, 30);

        MissingAccountCountDown.setVisible(false);
        MissingAccountCountDown.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        MissingAccountCountDown.setForeground(new java.awt.Color(255, 51, 51));
        MissingAccountCountDown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MissingAccountCountDown.setText("(5)");
        LoginScreen.add(MissingAccountCountDown);
        MissingAccountCountDown.setBounds(400, 270, 40, 30);

        RegisteredElse.setVisible(false);
        RegisteredElse.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        RegisteredElse.setForeground(new java.awt.Color(255, 51, 51));
        RegisteredElse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisteredElse.setText("Ο ΛΟΓΑΡΙΑΣΜΟΣ ΔΕΝ ΣΑΣ ΑΝΗΚΕΙ");
        LoginScreen.add(RegisteredElse);
        RegisteredElse.setBounds(40, 270, 410, 30);

        NotMatchingPasswords.setVisible(false);
        NotMatchingPasswords.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        NotMatchingPasswords.setForeground(new java.awt.Color(255, 51, 51));
        NotMatchingPasswords.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NotMatchingPasswords.setText("ΔΙΑΦΟΡΕΤΙΚΟΙ ΚΩΔΙΚΟΙ");
        LoginScreen.add(NotMatchingPasswords);
        NotMatchingPasswords.setBounds(100, 270, 270, 30);

        Warning.setVisible(false);
        Warning.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Warning.setForeground(new java.awt.Color(255, 51, 51));
        Warning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Warning.setText("Λάθος Στοιχεία");
        Warning.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginScreen.add(Warning);
        Warning.setBounds(140, 270, 150, 30);

        WarningCountdown.setVisible(false);
        WarningCountdown.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        WarningCountdown.setForeground(new java.awt.Color(255, 51, 51));
        WarningCountdown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WarningCountdown.setText("(5)");
        LoginScreen.add(WarningCountdown);
        WarningCountdown.setBounds(290, 270, 40, 30);

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/aboutimg.png"))); // NOI18N
        LoginScreen.add(Image);
        Image.setBounds(180, 70, 110, 110);

        UsernameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(204, 204, 204));
        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameLabel.setText("ΟΝΟΜΑ");
        UsernameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginScreen.add(UsernameLabel);
        UsernameLabel.setBounds(150, 180, 170, 40);

        UsernameField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        UsernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UsernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsernameFieldMousePressed(evt);
            }
        });
        UsernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsernameFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UsernameFieldKeyTyped(evt);
            }
        });
        LoginScreen.add(UsernameField);
        UsernameField.setBounds(150, 180, 170, 40);

        PasswordLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(204, 204, 204));
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setText("ΚΩΔΙΚΟΣ");
        PasswordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PasswordLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginScreen.add(PasswordLabel);
        PasswordLabel.setBounds(150, 230, 170, 40);

        PasswordField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        PasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PasswordFieldMousePressed(evt);
            }
        });
        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyTyped(evt);
            }
        });
        LoginScreen.add(PasswordField);
        PasswordField.setBounds(150, 230, 170, 40);

        Title.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/title.png"))); // NOI18N
        LoginScreen.add(Title);
        Title.setBounds(70, 0, 330, 80);

        CloseButton.setBackground(new java.awt.Color(0, 0, 0));
        CloseButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/close.png"))); // NOI18N
        CloseButton.setBorder(null);
        CloseButton.setContentAreaFilled(false);
        CloseButton.setFocusable(false);
        CloseButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CloseButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/close_clicked.png"))); // NOI18N
        CloseButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/close_mouse_over.png"))); // NOI18N
        CloseButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/close_clicked.png"))); // NOI18N
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        LoginScreen.add(CloseButton);
        CloseButton.setBounds(430, -1, 45, 30);

        LoginButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LoginButton.setText("ΕΙΣΟΔΟΣ");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.setFocusPainted(false);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        LoginScreen.add(LoginButton);
        LoginButton.setBounds(180, 302, 100, 30);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/login.jpeg"))); // NOI18N
        BackgroundImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BackgroundImage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundImageMouseDragged(evt);
            }
        });
        BackgroundImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackgroundImageMousePressed(evt);
            }
        });
        LoginScreen.add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 475, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // <editor-fold defaultstate="collapsed" desc="Variables declaration">
    static Connection conn=null;
    int xMouse;
    int yMouse;
    int triesremaining=5;
    String empty = "";
    String username=null;
    String password=null;
    String usertype="";
    String manager="manager";
    String doctor="doctor";
    String nurse="nurse";
    String secretary="secretary";
    String storekeeper="storekeeper";
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AutoLogin;
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton Doctor_Login;
    private javax.swing.JLabel EnterData;
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Loading;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginScreen;
    private javax.swing.JButton Manager_Login;
    private javax.swing.JLabel MissingAccount;
    private javax.swing.JLabel MissingAccountCountDown;
    private javax.swing.JLabel NotMatchingPasswords;
    private javax.swing.JButton Nurse_Login;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel RegisteredElse;
    private javax.swing.JCheckBox RememberMe;
    private javax.swing.JButton Secretary_Login;
    private javax.swing.JButton StoreKeeper_Login;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel Warning;
    private javax.swing.JLabel WarningCountdown;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Class Methods">
    
    private void checkdb() {
        String UsernameInput=UsernameField.getText();
        String PasswordInput=String.valueOf(PasswordField.getPassword());
        String username;
        String password;
        boolean UserFound=false;
        try{  //check an xrhsths uparxei se database
            String query = "select username,password from users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                username = rs.getString("username");
                password = rs.getString("password");
                if(UsernameInput.equals(username) && PasswordInput.equals(password)) {
                    UserFound=true;
                }
            }
            rs.close();
            stmt.close();
            }catch(Exception e){};
        if(UserFound) {
            try{
            String query = "select username from doctor";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                username = rs.getString("username");
                if(UsernameInput.equals(username)) {
                    accessgranted(username,"doctor");
                    rs.close();
                    stmt.close();
                    return;
                }
            }    
            rs.close();
            stmt.close();
            }catch(Exception e){};

            try{
            String query = "select username from nurse";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                username = rs.getString("username");
                if(UsernameInput.equals(username)) {
                    accessgranted(username,"nurse");
                    rs.close();
                    stmt.close();
                    return;
                }
            }    
            rs.close();
            stmt.close();
            }catch(Exception e){};
        }
        else accessdenied();
    }
    
    
    
    private void accessgranted(String user,String user_type){
        Loading.setVisible(false);        
        try{
        if(user_type.equals(doctor)){
            conn.close();
            Doctor a = new Doctor(user,conn);
            a.setVisible(true);
            this.dispose();
        }
        else if(user_type.equals(nurse)){
            Nurse a = new Nurse(user,conn);
            a.setVisible(true);
            this.dispose();
        }
        else if(user_type.equals(secretary)){
            Secretary a = new Secretary(user,conn);
            a.setVisible(true);
            this.dispose();
        }
        else if(user_type.equals(manager)){
            Manager a = new Manager(user,conn);
            a.setVisible(true);
            this.dispose();
        }
        }catch(Exception e){};
    }
    
    
    private void accessdenied(){
        Loading.setVisible(false);
        if(RegisteredElse.isVisible()){
            username = UsernameField.getText();
        }
        else{
            Warning.setVisible(true);
            WarningCountdown.setVisible(true);
            WarningCountdown.setText("("+triesremaining+")");
            if(triesremaining==0) {
                RegisteredElse.setVisible(true);
                Warning.setVisible(false);
                WarningCountdown.setVisible(false);
                triesremaining=5;
                System.exit(0);
                return;
            }
        triesremaining--;
        Loading.setVisible(false);
        }
    }
    
    private void PassCheck() {
        Loading.setVisible(true);
        EnterData.setVisible(false);
        Warning.setVisible(false);
        WarningCountdown.setVisible(false);
        RegisteredElse.setVisible(false);
        checkdb();
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Login Screen">
    
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        LoginButton.requestFocus();
        if(UsernameField.getText().equals(empty) || String.valueOf(PasswordField.getPassword()).equals(empty)){
            EnterData.setVisible(true);
            Warning.setVisible(false);
            WarningCountdown.setVisible(false);
            if(UsernameField.getText().equals(empty)){
                UsernameLabel.setVisible(true);
            }
            if(String.valueOf(PasswordField.getPassword()).equals(empty)){
                PasswordLabel.setVisible(true);
                
            }
        }else {
            NotMatchingPasswords.setVisible(false);
            PassCheck();
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void UsernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameFieldKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            if( UsernameField.getText().equals(empty) || String.valueOf(PasswordField.getPassword()).equals(empty) ) {
                EnterData.setVisible(true);
                Warning.setVisible(false);
                WarningCountdown.setVisible(false);
                if(String.valueOf(PasswordField.getPassword()).equals(empty)) PasswordLabel.setVisible(true);
            }else {
                NotMatchingPasswords.setVisible(false);
                PassCheck();
            }
        }
        }//GEN-LAST:event_UsernameFieldKeyPressed

    private void PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
        if( UsernameField.getText().equals(empty) || String.valueOf(PasswordField.getPassword()).equals(empty) ) {
            EnterData.setVisible(true);
            Warning.setVisible(false);
            WarningCountdown.setVisible(false);
            if(UsernameField.getText().equals(empty)) UsernameLabel.setVisible(true);
        }else {
            NotMatchingPasswords.setVisible(false);
            PassCheck();
        }
    }
    }//GEN-LAST:event_PasswordFieldKeyPressed

    private void UsernameFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameFieldMousePressed
        UsernameLabel.setVisible(false);
        NotMatchingPasswords.setVisible(false);
        if(String.valueOf(PasswordField.getPassword()).equals(empty)) PasswordLabel.setVisible(true);
    }//GEN-LAST:event_UsernameFieldMousePressed

    private void PasswordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldMousePressed
        PasswordLabel.setVisible(false);
        NotMatchingPasswords.setVisible(false);
        if(UsernameField.getText().equals(empty)) UsernameLabel.setVisible(true);
    }//GEN-LAST:event_PasswordFieldMousePressed

    private void UsernameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameFieldKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_SPACE){
            evt.consume();
            }
            if(evt.getKeyChar()==KeyEvent.VK_TAB){
                PasswordField.requestFocus();
                if(String.valueOf(PasswordField.getPassword()).equals(empty)) PasswordLabel.setVisible(false);
                if(UsernameField.getText().equals(empty)) UsernameLabel.setVisible(true);
                else UsernameLabel.setVisible(false);
            }
        }//GEN-LAST:event_UsernameFieldKeyTyped
    
    private void PasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_SPACE){
            evt.consume();
        }
        if(evt.getKeyChar()==KeyEvent.VK_TAB){
            UsernameField.requestFocus();
            if(UsernameField.getText().equals(empty)) UsernameLabel.setVisible(false);
            if(String.valueOf(PasswordField.getPassword()).equals(empty)) PasswordLabel.setVisible(true);
            else PasswordLabel.setVisible(false);
        }
    }//GEN-LAST:event_PasswordFieldKeyTyped

    private void BackgroundImageMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundImageMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_BackgroundImageMouseDragged

    private void BackgroundImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundImageMousePressed
        this.requestFocusInWindow();
        if(UsernameField.getText().equals(empty)) UsernameLabel.setVisible(true);
        if(String.valueOf(PasswordField.getPassword()).equals(empty)) PasswordLabel.setVisible(true);
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BackgroundImageMousePressed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void RememberMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RememberMeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RememberMeActionPerformed

    private void AutoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutoLoginActionPerformed

    private void Doctor_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Doctor_LoginActionPerformed
        Doctor d = new Doctor("\"Όνομα Χρήστη\"",conn);
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Doctor_LoginActionPerformed

    private void Nurse_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nurse_LoginActionPerformed
        Nurse d = new Nurse("\"Όνομα Χρήστη\"",conn);
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Nurse_LoginActionPerformed

    private void Secretary_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Secretary_LoginActionPerformed
        Secretary d = new Secretary("\"Όνομα Χρήστη\"",conn);
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Secretary_LoginActionPerformed

    private void Manager_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Manager_LoginActionPerformed
        Manager d = new Manager("\"Όνομα Χρήστη\"",conn);
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Manager_LoginActionPerformed

    private void StoreKeeper_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StoreKeeper_LoginActionPerformed
        StoreKeeper d = new StoreKeeper("\"Όνομα Χρήστη\"",conn);
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StoreKeeper_LoginActionPerformed

    // </editor-fold>
    
}
