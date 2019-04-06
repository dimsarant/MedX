package MedX;

    // <editor-fold defaultstate="collapsed" desc="Imports">
import static MedX.Manager.conn;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JToggleButton;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
// </editor-fold>

public class Doctor extends javax.swing.JFrame {
    
    // <editor-fold defaultstate="collapsed" desc="Doctor Constructor">
    public Doctor(String name,Connection condb) {
        initComponents();
        conn=condb;
        user=name;
        this.setLocationRelativeTo(null);
        BackgroundImage.requestFocus();
        Button4.setVisible(false);  
        this.setTitle("MedX - Καλώς ήρθες γιατρέ - "+user);
        AutoCompleteDecorator.decorate(Examine_Patient_Box);
        AutoCompleteDecorator.decorate(Rec_Name_Box);
        AutoCompleteDecorator.decorate(Patient_Surgery_List);
        AutoCompleteDecorator.decorate(Doctor_Surgery_List);
        AutoCompleteDecorator.decorate(Medicine_Box_List);
        AutoCompleteDecorator.decorate(Patient_Name_History_Box);
    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Panel0 = new javax.swing.JPanel();
        Main_Schedule_Panel = new javax.swing.JPanel();
        Schedule_List_Scroll = new javax.swing.JScrollPane();
        Schedule_List = new javax.swing.JList<>();
        Schedule_Label = new javax.swing.JLabel();
        Schedule_Expanded_Panel = new javax.swing.JPanel();
        Return_Button_Schedule = new javax.swing.JButton();
        Schedule_Expanded_Scroll = new javax.swing.JScrollPane();
        Schedule_Expanded_List = new javax.swing.JList<>();
        Panel1 = new javax.swing.JPanel();
        Main_Patient = new javax.swing.JPanel();
        CheckOut_Euro_Label = new javax.swing.JLabel();
        Check_Out = new javax.swing.JCheckBox();
        Select_Patient = new javax.swing.JLabel();
        Examine_Patient_Box = new javax.swing.JComboBox<>();
        Insert = new javax.swing.JButton();
        Description_Scroll = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        Patient_Card_Button = new javax.swing.JButton();
        Patient_Cost = new javax.swing.JTextField();
        Patient_Cost_Label = new javax.swing.JLabel();
        Medicine_Label = new javax.swing.JLabel();
        Medicine_Box_List = new javax.swing.JComboBox<>();
        Medicine_Scroll = new javax.swing.JScrollPane();
        Medicine_List = new javax.swing.JList<>();
        Doctor_Comments_Label = new javax.swing.JLabel();
        Add_Medicine_Button = new javax.swing.JButton();
        Remove_Medicine_Button = new javax.swing.JButton();
        Patient_Card = new javax.swing.JPanel();
        Return_Button_Card = new javax.swing.JButton();
        Patient_Name = new javax.swing.JTextField();
        Patient_LastName = new javax.swing.JTextField();
        Patient_Telephone = new javax.swing.JTextField();
        Patient_Gender = new javax.swing.JTextField();
        Patient_Room = new javax.swing.JTextField();
        Patient_Age = new javax.swing.JTextField();
        Patient_Description_Scroll = new javax.swing.JScrollPane();
        Patient_Description = new javax.swing.JTextArea();
        Patient_Name_Label = new javax.swing.JLabel();
        Patient_LastName_Label = new javax.swing.JLabel();
        Patient_Telephone_Label = new javax.swing.JLabel();
        Patient_Gender_Label = new javax.swing.JLabel();
        Patient_Room_Label = new javax.swing.JLabel();
        Patient_Age_Label = new javax.swing.JLabel();
        Patient_Description_Label = new javax.swing.JLabel();
        Patient_History_Button = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        Patient_Surgery_List = new javax.swing.JComboBox<>();
        Enter_Patient_Surgery = new javax.swing.JLabel();
        Doctor_Surgery_List = new javax.swing.JComboBox<>();
        Enter_Doctor_Surgery = new javax.swing.JLabel();
        Surgery_Year_List = new javax.swing.JComboBox<>();
        Surgery_Month_List = new javax.swing.JComboBox<>();
        Surgery_Day_List = new javax.swing.JComboBox<>();
        Surgery_Hour_List = new javax.swing.JComboBox<>();
        Surgery_Minute_List = new javax.swing.JComboBox<>();
        Surgery_Year_Label = new javax.swing.JLabel();
        Surgery_Hour_Label = new javax.swing.JLabel();
        Surgery_Description_Scroll = new javax.swing.JScrollPane();
        Surgery_Description = new javax.swing.JTextArea();
        Insert_Surgery_Button = new javax.swing.JButton();
        Surgery_Cost_Label = new javax.swing.JLabel();
        Surgery_Cost = new javax.swing.JTextField();
        CheckOut_Euro_Label1 = new javax.swing.JLabel();
        Doctor_Surgery_Comments_Label = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        Patient_Name_History_Label = new javax.swing.JLabel();
        Patient_Name_History_Box = new javax.swing.JComboBox<>();
        Patient_Date_History_Label = new javax.swing.JLabel();
        Patient_Date_History_Box = new javax.swing.JComboBox<>();
        Patient_History_Name_Label = new javax.swing.JLabel();
        Patient_History_LastName_Label = new javax.swing.JLabel();
        Patient_History_Telephone_Label = new javax.swing.JLabel();
        Patient_History_AMKA_Label = new javax.swing.JLabel();
        Patient_History_ID_Label = new javax.swing.JLabel();
        Patient_History_AFM_Label = new javax.swing.JLabel();
        Patient_History_Gender_Label = new javax.swing.JLabel();
        Patient_History_Age_Label = new javax.swing.JLabel();
        Patient_History_Cost_Label = new javax.swing.JLabel();
        Patient_History_Description_Label = new javax.swing.JLabel();
        Patient_History_Name = new javax.swing.JTextField();
        Patient_History_LastName = new javax.swing.JTextField();
        Patient_History_Telephone = new javax.swing.JTextField();
        Patient_History_AMKA = new javax.swing.JTextField();
        Patient_History_ID = new javax.swing.JTextField();
        Patient_History_AFM = new javax.swing.JTextField();
        Patient_History_Gender = new javax.swing.JTextField();
        Patient_History_Age = new javax.swing.JTextField();
        Patient_History_Cost = new javax.swing.JTextField();
        Patient_History_Description_Scroll = new javax.swing.JScrollPane();
        Patient_History_Description = new javax.swing.JTextArea();
        Patient_History_Medicine_Label = new javax.swing.JLabel();
        Patient_History_Medicine_Scroll = new javax.swing.JScrollPane();
        Patient_Medicine_List = new javax.swing.JList<>();
        Panel4 = new javax.swing.JPanel();
        Panel5 = new javax.swing.JPanel();
        Main_Messages = new javax.swing.JPanel();
        New_Message_Button = new javax.swing.JButton();
        Refresh_Button = new javax.swing.JButton();
        Message_Box = new javax.swing.JTabbedPane();
        Incoming_Panel = new javax.swing.JPanel();
        Incoming_Scroll = new javax.swing.JScrollPane();
        Incoming_List = new javax.swing.JList<>();
        Outgoing_Panel = new javax.swing.JPanel();
        Outgoing_Scroll = new javax.swing.JScrollPane();
        Outgoing_List = new javax.swing.JList<>();
        New_Message = new javax.swing.JPanel();
        Recepient = new javax.swing.JLabel();
        Rec_Type_Box = new javax.swing.JComboBox<>();
        Rec_Name_Box = new javax.swing.JComboBox<>();
        Message_Area_Scroll = new javax.swing.JScrollPane();
        Message_Text = new javax.swing.JTextArea();
        Send_Button = new javax.swing.JButton();
        Cancel_Button = new javax.swing.JButton();
        Message_Expanded = new javax.swing.JPanel();
        Return_Button_Message_Expanded = new javax.swing.JButton();
        Message_Expanded_Scroll = new javax.swing.JScrollPane();
        Message_Expanded_Text = new javax.swing.JTextArea();
        Message_Expanded_SR = new javax.swing.JTextField();
        Message_Expanded_DateTime = new javax.swing.JTextField();
        Message_Expanded_SR_Label = new javax.swing.JLabel();
        Message_Expanded_DateTime_Label = new javax.swing.JLabel();
        Message_Delete_Button = new javax.swing.JButton();
        Panel6 = new javax.swing.JPanel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        Birth_Date = new javax.swing.JTextField();
        Tel_0 = new javax.swing.JTextField();
        Tel_1 = new javax.swing.JTextField();
        Adress = new javax.swing.JTextField();
        Start_Date = new javax.swing.JTextField();
        Account_Update_Button = new javax.swing.JButton();
        Edit_Information_Label = new javax.swing.JLabel();
        Username_Label = new javax.swing.JLabel();
        Password_Label = new javax.swing.JLabel();
        Email_Label = new javax.swing.JLabel();
        Name_Label = new javax.swing.JLabel();
        LastName_Label = new javax.swing.JLabel();
        Birth_Date_Label = new javax.swing.JLabel();
        Tel_Label = new javax.swing.JLabel();
        Adress_Label = new javax.swing.JLabel();
        Start_Date_Label = new javax.swing.JLabel();
        Button0 = new javax.swing.JToggleButton();
        Button1 = new javax.swing.JToggleButton();
        Button2 = new javax.swing.JToggleButton();
        Button3 = new javax.swing.JToggleButton();
        Button4 = new javax.swing.JToggleButton();
        Button5 = new javax.swing.JToggleButton();
        Button6 = new javax.swing.JToggleButton();
        Logout_Button = new javax.swing.JButton();
        SeparatorHorTop = new javax.swing.JSeparator();
        SeperatorHorBot = new javax.swing.JSeparator();
        SeperatorVerLef = new javax.swing.JSeparator();
        SeperatorVerRig = new javax.swing.JSeparator();
        BackgroundMedX = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/windowicon.png")).getImage());
        setMaximumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        MainPanel.setVisible(false);
        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MainPanel.setPreferredSize(new java.awt.Dimension(410, 340));
        MainPanel.setLayout(new java.awt.CardLayout());

        Panel0.setLayout(new java.awt.CardLayout());

        Main_Schedule_Panel.setLayout(null);

        Schedule_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Schedule_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "00:00-00:59 | ", "01:00-01:59 | ", "02:00-02:59 | ", "03:00-03:59 | ", "04:00-04:59 | ", "05:00-05:59 | ", "06:00-06:59 | ", "07:00-07:59 | ", "08:00-08:59 | ", "09:00-09:59 | ", "10:00-10:59 | ", "11:00-11:59 | ", "12:00-12:59 | ", "13:00-13:59 | ", "14:00-14:59 | ", "15:00-15:59 | ", "16:00-16:59 | ", "17:00-17:59 | ", "18:00-18:59 | ", "19:00-19:59 | ", "20:00-20:59 | ", "21:00-21:59 | ", "22:00-22:59 | ", "23:00-23:59 | " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Schedule_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Schedule_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Schedule_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Schedule_ListMouseReleased(evt);
            }
        });
        Schedule_List_Scroll.setViewportView(Schedule_List);

        Main_Schedule_Panel.add(Schedule_List_Scroll);
        Schedule_List_Scroll.setBounds(20, 60, 480, 360);

        Schedule_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Schedule_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Schedule_Label.setText("ΠΡΟΓΡΑΜΜΑ ΗΜΕΡΑΣ : YYYY/MM/DD");
        Main_Schedule_Panel.add(Schedule_Label);
        Schedule_Label.setBounds(20, 20, 480, 22);

        Panel0.add(Main_Schedule_Panel, "Main_Schedule_Panel");

        Schedule_Expanded_Panel.setLayout(null);

        Return_Button_Schedule.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Return_Button_Schedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Back_Arrow.png"))); // NOI18N
        Return_Button_Schedule.setText("ΕΠΙΣΤΡΟΦΗ");
        Return_Button_Schedule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Return_Button_Schedule.setFocusPainted(false);
        Return_Button_Schedule.setFocusable(false);
        Return_Button_Schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_Button_ScheduleActionPerformed(evt);
            }
        });
        Schedule_Expanded_Panel.add(Return_Button_Schedule);
        Return_Button_Schedule.setBounds(369, 389, 130, 30);

        Schedule_Expanded_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Schedule_Expanded_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Όνoμα Ασθενή 1", "Όνoμα Ασθενή 2", "Όνoμα Ασθενή 3", "Όνoμα Ασθενή 4", "Όνoμα Ασθενή 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Schedule_Expanded_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Schedule_Expanded_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Schedule_Expanded_ListMouseReleased(evt);
            }
        });
        Schedule_Expanded_Scroll.setViewportView(Schedule_Expanded_List);

        Schedule_Expanded_Panel.add(Schedule_Expanded_Scroll);
        Schedule_Expanded_Scroll.setBounds(20, 20, 480, 400);

        Panel0.add(Schedule_Expanded_Panel, "Schedule_Expanded_Panel");

        MainPanel.add(Panel0, "Panel0");

        Panel1.setLayout(new java.awt.CardLayout());

        Main_Patient.setLayout(null);

        CheckOut_Euro_Label.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        CheckOut_Euro_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CheckOut_Euro_Label.setText("€");
        Main_Patient.add(CheckOut_Euro_Label);
        CheckOut_Euro_Label.setBounds(210, 380, 20, 40);

        Check_Out.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Check_Out.setText("CHECK-OUT");
        Check_Out.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Check_Out.setFocusPainted(false);
        Main_Patient.add(Check_Out);
        Check_Out.setBounds(400, 380, 100, 40);

        Select_Patient.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Select_Patient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Select_Patient.setText("Επιλογή Ασθενή :");
        Main_Patient.add(Select_Patient);
        Select_Patient.setBounds(10, 20, 90, 30);

        Examine_Patient_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Examine_Patient_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Examine_Patient_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Main_Patient.add(Examine_Patient_Box);
        Examine_Patient_Box.setBounds(100, 15, 230, 40);

        Insert.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Insert.setText("ΕΙΣΑΓΩΓΗ");
        Insert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Insert.setEnabled(false);
        Insert.setFocusPainted(false);
        Insert.setFocusable(false);
        Insert.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Main_Patient.add(Insert);
        Insert.setBounds(250, 380, 130, 40);

        Description.setColumns(20);
        Description.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Description.setLineWrap(true);
        Description.setRows(5);
        Description.setWrapStyleWord(true);
        Description_Scroll.setViewportView(Description);

        Main_Patient.add(Description_Scroll);
        Description_Scroll.setBounds(20, 90, 310, 270);

        Patient_Card_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Card_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Card_Icon.png"))); // NOI18N
        Patient_Card_Button.setText("ΚΑΡΤΕΛΑ ΑΣΘΕΝΗ");
        Patient_Card_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Patient_Card_Button.setFocusPainted(false);
        Patient_Card_Button.setFocusable(false);
        Patient_Card_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Patient_Card_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Patient_Card_ButtonActionPerformed(evt);
            }
        });
        Main_Patient.add(Patient_Card_Button);
        Patient_Card_Button.setBounds(340, 15, 160, 40);

        Patient_Cost.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Patient_Cost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_Cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Patient_CostKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Patient_CostKeyTyped(evt);
            }
        });
        Main_Patient.add(Patient_Cost);
        Patient_Cost.setBounds(140, 380, 70, 40);

        Patient_Cost_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Cost_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Cost_Label.setText("Κόστος Εξέτασης :");
        Main_Patient.add(Patient_Cost_Label);
        Patient_Cost_Label.setBounds(20, 380, 120, 40);

        Medicine_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Medicine_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Medicine_Label.setText("Φάρμακα :");
        Main_Patient.add(Medicine_Label);
        Medicine_Label.setBounds(340, 70, 70, 30);

        Medicine_Box_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Medicine_Box_List.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Medicine_Box_ListPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Main_Patient.add(Medicine_Box_List);
        Medicine_Box_List.setBounds(350, 109, 150, 30);

        Medicine_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Medicine_List.setToolTipText("");
        Medicine_List.setFocusable(false);
        Medicine_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Medicine_ListMouseReleased(evt);
            }
        });
        Medicine_Scroll.setViewportView(Medicine_List);

        Main_Patient.add(Medicine_Scroll);
        Medicine_Scroll.setBounds(350, 150, 150, 210);

        Doctor_Comments_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Doctor_Comments_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Doctor_Comments_Label.setText("Γνωμάτευση Γιατρού :");
        Main_Patient.add(Doctor_Comments_Label);
        Doctor_Comments_Label.setBounds(20, 70, 310, 20);

        Add_Medicine_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Plus_Icon.png"))); // NOI18N
        Add_Medicine_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_Medicine_Button.setEnabled(false);
        Add_Medicine_Button.setFocusable(false);
        Add_Medicine_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Medicine_ButtonActionPerformed(evt);
            }
        });
        Main_Patient.add(Add_Medicine_Button);
        Add_Medicine_Button.setBounds(410, 70, 40, 30);

        Remove_Medicine_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Delete_Icon.png"))); // NOI18N
        Remove_Medicine_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Remove_Medicine_Button.setEnabled(false);
        Remove_Medicine_Button.setFocusable(false);
        Remove_Medicine_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_Medicine_ButtonActionPerformed(evt);
            }
        });
        Main_Patient.add(Remove_Medicine_Button);
        Remove_Medicine_Button.setBounds(460, 70, 40, 30);

        Panel1.add(Main_Patient, "Main_Patient");

        Patient_Card.setLayout(null);

        Return_Button_Card.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Return_Button_Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Back_Arrow.png"))); // NOI18N
        Return_Button_Card.setText("ΕΠΙΣΤΡΟΦΗ");
        Return_Button_Card.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Return_Button_Card.setFocusPainted(false);
        Return_Button_Card.setFocusable(false);
        Return_Button_Card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_Button_CardActionPerformed(evt);
            }
        });
        Patient_Card.add(Return_Button_Card);
        Return_Button_Card.setBounds(369, 389, 130, 30);

        Patient_Name.setEditable(false);
        Patient_Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_Name.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_Name.setFocusable(false);
        Patient_Card.add(Patient_Name);
        Patient_Name.setBounds(15, 30, 150, 40);

        Patient_LastName.setEditable(false);
        Patient_LastName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_LastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_LastName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_LastName.setFocusable(false);
        Patient_Card.add(Patient_LastName);
        Patient_LastName.setBounds(182, 30, 150, 40);

        Patient_Telephone.setEditable(false);
        Patient_Telephone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Telephone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_Telephone.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_Telephone.setFocusable(false);
        Patient_Card.add(Patient_Telephone);
        Patient_Telephone.setBounds(350, 30, 150, 40);

        Patient_Gender.setEditable(false);
        Patient_Gender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Gender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_Gender.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_Gender.setFocusable(false);
        Patient_Card.add(Patient_Gender);
        Patient_Gender.setBounds(15, 100, 150, 40);

        Patient_Room.setEditable(false);
        Patient_Room.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Room.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_Room.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_Room.setFocusable(false);
        Patient_Card.add(Patient_Room);
        Patient_Room.setBounds(350, 100, 150, 40);

        Patient_Age.setEditable(false);
        Patient_Age.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_Age.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_Age.setFocusable(false);
        Patient_Card.add(Patient_Age);
        Patient_Age.setBounds(180, 100, 150, 40);

        Patient_Description.setColumns(20);
        Patient_Description.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Description.setLineWrap(true);
        Patient_Description.setRows(5);
        Patient_Description.setWrapStyleWord(true);
        Patient_Description.setFocusable(false);
        Patient_Description_Scroll.setViewportView(Patient_Description);

        Patient_Card.add(Patient_Description_Scroll);
        Patient_Description_Scroll.setBounds(16, 180, 482, 190);

        Patient_Name_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Name_Label.setText("ΟΝΟΜΑ");
        Patient_Name_Label.setFocusable(false);
        Patient_Card.add(Patient_Name_Label);
        Patient_Name_Label.setBounds(20, 10, 140, 20);

        Patient_LastName_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_LastName_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_LastName_Label.setText("ΕΠΩΝΥΜΟ");
        Patient_LastName_Label.setFocusable(false);
        Patient_Card.add(Patient_LastName_Label);
        Patient_LastName_Label.setBounds(180, 10, 150, 20);

        Patient_Telephone_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Telephone_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Telephone_Label.setText("ΤΗΛΕΦΩΝΟ");
        Patient_Telephone_Label.setFocusable(false);
        Patient_Card.add(Patient_Telephone_Label);
        Patient_Telephone_Label.setBounds(350, 10, 150, 20);

        Patient_Gender_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Gender_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Gender_Label.setText("ΦΥΛΟ");
        Patient_Gender_Label.setFocusable(false);
        Patient_Card.add(Patient_Gender_Label);
        Patient_Gender_Label.setBounds(20, 80, 140, 20);

        Patient_Room_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Room_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Room_Label.setText("ΔΩΜΑΤΙΟ");
        Patient_Room_Label.setFocusable(false);
        Patient_Card.add(Patient_Room_Label);
        Patient_Room_Label.setBounds(350, 80, 150, 20);

        Patient_Age_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Age_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Age_Label.setText("ΗΛΙΚΙΑ");
        Patient_Age_Label.setFocusable(false);
        Patient_Card.add(Patient_Age_Label);
        Patient_Age_Label.setBounds(180, 80, 150, 20);

        Patient_Description_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Description_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Description_Label.setText("ΛΟΓΟΣ ΕΙΣΑΓΩΓΗΣ ΑΣΘΕΝΗ");
        Patient_Description_Label.setFocusable(false);
        Patient_Card.add(Patient_Description_Label);
        Patient_Description_Label.setBounds(130, 160, 240, 20);

        Patient_History_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/History_Icon.png"))); // NOI18N
        Patient_History_Button.setText("ΙΣΤΟΡΙΚΟ");
        Patient_History_Button.setFocusable(false);
        Patient_History_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Patient_History_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Patient_History_ButtonActionPerformed(evt);
            }
        });
        Patient_Card.add(Patient_History_Button);
        Patient_History_Button.setBounds(16, 389, 130, 30);

        Panel1.add(Patient_Card, "Patient_Card");

        MainPanel.add(Panel1, "Panel1");

        Panel2.setLayout(null);

        Patient_Surgery_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Surgery_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel2.add(Patient_Surgery_List);
        Patient_Surgery_List.setBounds(90, 20, 160, 40);

        Enter_Patient_Surgery.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Enter_Patient_Surgery.setText("Ασθενής :");
        Enter_Patient_Surgery.setFocusable(false);
        Panel2.add(Enter_Patient_Surgery);
        Enter_Patient_Surgery.setBounds(20, 20, 70, 40);

        Doctor_Surgery_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Doctor_Surgery_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel2.add(Doctor_Surgery_List);
        Doctor_Surgery_List.setBounds(320, 20, 160, 40);

        Enter_Doctor_Surgery.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Enter_Doctor_Surgery.setText("Γιατρός :");
        Enter_Doctor_Surgery.setFocusable(false);
        Panel2.add(Enter_Doctor_Surgery);
        Enter_Doctor_Surgery.setBounds(260, 20, 60, 40);

        Surgery_Year_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Surgery_Year_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        Surgery_Year_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Surgery_Year_List.setFocusable(false);
        Panel2.add(Surgery_Year_List);
        Surgery_Year_List.setBounds(60, 100, 80, 30);

        Surgery_Month_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Surgery_Month_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Surgery_Month_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Surgery_Month_List.setFocusable(false);
        Panel2.add(Surgery_Month_List);
        Surgery_Month_List.setBounds(139, 100, 60, 30);

        Surgery_Day_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Surgery_Day_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        Surgery_Day_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Surgery_Day_List.setFocusable(false);
        Panel2.add(Surgery_Day_List);
        Surgery_Day_List.setBounds(198, 100, 60, 30);

        Surgery_Hour_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Surgery_Hour_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        Surgery_Hour_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Surgery_Hour_List.setFocusable(false);
        Panel2.add(Surgery_Hour_List);
        Surgery_Hour_List.setBounds(320, 100, 60, 30);

        Surgery_Minute_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Surgery_Minute_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "46", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        Surgery_Minute_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Surgery_Minute_List.setFocusable(false);
        Panel2.add(Surgery_Minute_List);
        Surgery_Minute_List.setBounds(379, 100, 60, 30);

        Surgery_Year_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Surgery_Year_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Surgery_Year_Label.setText("Ημερομηνία");
        Surgery_Year_Label.setFocusable(false);
        Panel2.add(Surgery_Year_Label);
        Surgery_Year_Label.setBounds(60, 80, 200, 20);

        Surgery_Hour_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Surgery_Hour_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Surgery_Hour_Label.setText("Ώρα");
        Surgery_Hour_Label.setFocusable(false);
        Panel2.add(Surgery_Hour_Label);
        Surgery_Hour_Label.setBounds(320, 80, 120, 20);

        Surgery_Description.setColumns(20);
        Surgery_Description.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Surgery_Description.setLineWrap(true);
        Surgery_Description.setRows(5);
        Surgery_Description.setWrapStyleWord(true);
        Surgery_Description_Scroll.setViewportView(Surgery_Description);

        Panel2.add(Surgery_Description_Scroll);
        Surgery_Description_Scroll.setBounds(30, 170, 455, 200);

        Insert_Surgery_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Surgery_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Insert_Surgery_Button.setText("Εισαγωγή");
        Insert_Surgery_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Insert_Surgery_Button.setEnabled(false);
        Insert_Surgery_Button.setFocusable(false);
        Insert_Surgery_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Panel2.add(Insert_Surgery_Button);
        Insert_Surgery_Button.setBounds(310, 385, 150, 40);

        Surgery_Cost_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Surgery_Cost_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Surgery_Cost_Label.setText("Κόστος Χειρουργείου :");
        Panel2.add(Surgery_Cost_Label);
        Surgery_Cost_Label.setBounds(30, 390, 150, 30);

        Surgery_Cost.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Surgery_Cost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Surgery_Cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Surgery_CostKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Surgery_CostKeyTyped(evt);
            }
        });
        Panel2.add(Surgery_Cost);
        Surgery_Cost.setBounds(180, 390, 90, 30);

        CheckOut_Euro_Label1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        CheckOut_Euro_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CheckOut_Euro_Label1.setText("€");
        Panel2.add(CheckOut_Euro_Label1);
        CheckOut_Euro_Label1.setBounds(270, 390, 20, 30);

        Doctor_Surgery_Comments_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Doctor_Surgery_Comments_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Doctor_Surgery_Comments_Label.setText("Γνωμάτευση Γιατρού :");
        Panel2.add(Doctor_Surgery_Comments_Label);
        Doctor_Surgery_Comments_Label.setBounds(30, 150, 450, 20);

        MainPanel.add(Panel2, "Panel2");

        Panel3.setLayout(null);

        Patient_Name_History_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Name_History_Label.setText("ΑΣΘΕΝΗΣ :");
        Panel3.add(Patient_Name_History_Label);
        Patient_Name_History_Label.setBounds(10, 20, 70, 30);

        Patient_Name_History_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Name_History_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel3.add(Patient_Name_History_Box);
        Patient_Name_History_Box.setBounds(80, 15, 170, 40);

        Patient_Date_History_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Date_History_Label.setText("ΗΜ/ΝΙΑ :");
        Panel3.add(Patient_Date_History_Label);
        Patient_Date_History_Label.setBounds(270, 20, 50, 30);

        Patient_Date_History_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Date_History_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Patient_Date_History_Box.setFocusable(false);
        Panel3.add(Patient_Date_History_Box);
        Patient_Date_History_Box.setBounds(320, 15, 170, 40);

        Patient_History_Name_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_History_Name_Label.setText("ΟΝΟΜΑ");
        Patient_History_Name_Label.setFocusable(false);
        Panel3.add(Patient_History_Name_Label);
        Patient_History_Name_Label.setBounds(20, 60, 140, 20);

        Patient_History_LastName_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_LastName_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_History_LastName_Label.setText("ΕΠΩΝΥΜΟ");
        Patient_History_LastName_Label.setFocusable(false);
        Panel3.add(Patient_History_LastName_Label);
        Patient_History_LastName_Label.setBounds(180, 60, 150, 20);

        Patient_History_Telephone_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_Telephone_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_History_Telephone_Label.setText("ΤΗΛΕΦΩΝΟ");
        Patient_History_Telephone_Label.setFocusable(false);
        Panel3.add(Patient_History_Telephone_Label);
        Patient_History_Telephone_Label.setBounds(350, 60, 150, 20);

        Patient_History_AMKA_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_AMKA_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_History_AMKA_Label.setText("Α.Μ.Κ.Α.");
        Patient_History_AMKA_Label.setFocusable(false);
        Panel3.add(Patient_History_AMKA_Label);
        Patient_History_AMKA_Label.setBounds(350, 130, 150, 20);

        Patient_History_ID_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_ID_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_History_ID_Label.setText("ΑΡ. ΤΑΥΤΟΤΗΤΑΣ");
        Patient_History_ID_Label.setFocusable(false);
        Panel3.add(Patient_History_ID_Label);
        Patient_History_ID_Label.setBounds(182, 130, 150, 20);

        Patient_History_AFM_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_AFM_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_History_AFM_Label.setText("Α.Φ.Μ.");
        Patient_History_AFM_Label.setFocusable(false);
        Panel3.add(Patient_History_AFM_Label);
        Patient_History_AFM_Label.setBounds(20, 130, 140, 20);

        Patient_History_Gender_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_Gender_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_History_Gender_Label.setText("ΦΥΛΟ");
        Patient_History_Gender_Label.setFocusable(false);
        Panel3.add(Patient_History_Gender_Label);
        Patient_History_Gender_Label.setBounds(20, 200, 140, 20);

        Patient_History_Age_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_Age_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_History_Age_Label.setText("ΗΛΙΚΙΑ");
        Patient_History_Age_Label.setFocusable(false);
        Panel3.add(Patient_History_Age_Label);
        Patient_History_Age_Label.setBounds(182, 200, 150, 20);

        Patient_History_Cost_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_Cost_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_History_Cost_Label.setText("ΚΟΣΤΟΣ ΠΕΡΙΘΑΛΨΗΣ");
        Patient_History_Cost_Label.setFocusable(false);
        Panel3.add(Patient_History_Cost_Label);
        Patient_History_Cost_Label.setBounds(350, 200, 150, 20);

        Patient_History_Description_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_Description_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_History_Description_Label.setText("ΛΟΓΟΣ ΕΙΣΑΓΩΓΗΣ ΑΣΘΕΝΗ");
        Patient_History_Description_Label.setFocusable(false);
        Panel3.add(Patient_History_Description_Label);
        Patient_History_Description_Label.setBounds(20, 270, 310, 20);

        Patient_History_Name.setEditable(false);
        Patient_History_Name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_History_Name.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Patient_History_Name);
        Patient_History_Name.setBounds(15, 80, 150, 40);

        Patient_History_LastName.setEditable(false);
        Patient_History_LastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_LastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_History_LastName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Patient_History_LastName);
        Patient_History_LastName.setBounds(182, 80, 150, 40);

        Patient_History_Telephone.setEditable(false);
        Patient_History_Telephone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_Telephone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_History_Telephone.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Patient_History_Telephone);
        Patient_History_Telephone.setBounds(350, 80, 150, 40);

        Patient_History_AMKA.setEditable(false);
        Patient_History_AMKA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_AMKA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_History_AMKA.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Patient_History_AMKA);
        Patient_History_AMKA.setBounds(350, 150, 150, 40);

        Patient_History_ID.setEditable(false);
        Patient_History_ID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_History_ID.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Patient_History_ID);
        Patient_History_ID.setBounds(182, 150, 150, 40);

        Patient_History_AFM.setEditable(false);
        Patient_History_AFM.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_AFM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_History_AFM.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Patient_History_AFM);
        Patient_History_AFM.setBounds(15, 150, 150, 40);

        Patient_History_Gender.setEditable(false);
        Patient_History_Gender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_Gender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_History_Gender.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Patient_History_Gender);
        Patient_History_Gender.setBounds(15, 220, 150, 40);

        Patient_History_Age.setEditable(false);
        Patient_History_Age.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_Age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_History_Age.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Patient_History_Age);
        Patient_History_Age.setBounds(182, 220, 150, 40);

        Patient_History_Cost.setEditable(false);
        Patient_History_Cost.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_Cost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_History_Cost.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Patient_History_Cost);
        Patient_History_Cost.setBounds(350, 220, 150, 40);

        Patient_History_Description.setEditable(false);
        Patient_History_Description.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
        Patient_History_Description.setColumns(20);
        Patient_History_Description.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_History_Description.setLineWrap(true);
        Patient_History_Description.setRows(5);
        Patient_History_Description.setWrapStyleWord(true);
        Patient_History_Description_Scroll.setViewportView(Patient_History_Description);

        Panel3.add(Patient_History_Description_Scroll);
        Patient_History_Description_Scroll.setBounds(20, 290, 310, 130);

        Patient_History_Medicine_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_History_Medicine_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_History_Medicine_Label.setText("ΦΑΡΜΑΚΑ");
        Patient_History_Medicine_Label.setFocusable(false);
        Panel3.add(Patient_History_Medicine_Label);
        Patient_History_Medicine_Label.setBounds(350, 270, 150, 20);

        Patient_Medicine_List.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
        Patient_Medicine_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Medicine_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Patient_Medicine_List.setEnabled(false);
        Patient_Medicine_List.setFocusable(false);
        Patient_History_Medicine_Scroll.setViewportView(Patient_Medicine_List);

        Panel3.add(Patient_History_Medicine_Scroll);
        Patient_History_Medicine_Scroll.setBounds(350, 290, 150, 130);

        MainPanel.add(Panel3, "Panel3");

        Panel4.setLayout(null);
        MainPanel.add(Panel4, "Panel4");

        Panel5.setLayout(new java.awt.CardLayout());

        Main_Messages.setLayout(null);

        New_Message_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Message_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/New_Message_Icon.png"))); // NOI18N
        New_Message_Button.setText("ΝΕΟ ΜΗΝΥΜΑ");
        New_Message_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        New_Message_Button.setFocusPainted(false);
        New_Message_Button.setFocusable(false);
        New_Message_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_Message_ButtonActionPerformed(evt);
            }
        });
        Main_Messages.add(New_Message_Button);
        New_Message_Button.setBounds(325, 0, 140, 28);

        Refresh_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/refresh-icon.png"))); // NOI18N
        Refresh_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Refresh_Button.setFocusPainted(false);
        Refresh_Button.setFocusable(false);
        Refresh_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_ButtonActionPerformed(evt);
            }
        });
        Main_Messages.add(Refresh_Button);
        Refresh_Button.setBounds(465, 0, 50, 28);

        Message_Box.setToolTipText("");
        Message_Box.setFocusable(false);
        Message_Box.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        Incoming_Panel.setLayout(null);

        Incoming_Scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Incoming_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Incoming_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Εισερχόμενα 1", "Εισερχόμενα 2", "Εισερχόμενα 3", "Εισερχόμενα 4", "Εισερχόμενα 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Incoming_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Incoming_List.setToolTipText("");
        Incoming_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Incoming_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Incoming_ListMouseReleased(evt);
            }
        });
        Incoming_Scroll.setViewportView(Incoming_List);

        Incoming_Panel.add(Incoming_Scroll);
        Incoming_Scroll.setBounds(10, 10, 490, 380);

        Message_Box.addTab("ΕΙΣΕΡΧΟΜΕΝΑ ", new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Incoming_Mail_Icon.png")), Incoming_Panel); // NOI18N

        Outgoing_Panel.setLayout(null);

        Outgoing_Scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Outgoing_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Outgoing_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Απεσταλμένα 1", "Απεσταλμένα 2", "Απεσταλμένα 3", "Απεσταλμένα 4", "Απεσταλμένα 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Outgoing_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Outgoing_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Outgoing_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Outgoing_ListMouseReleased(evt);
            }
        });
        Outgoing_Scroll.setViewportView(Outgoing_List);

        Outgoing_Panel.add(Outgoing_Scroll);
        Outgoing_Scroll.setBounds(10, 10, 490, 380);

        Message_Box.addTab("ΑΠΕΣΤΑΛΜΕΝΑ ", new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Outgoing_Mail_Icon.png")), Outgoing_Panel); // NOI18N

        Main_Messages.add(Message_Box);
        Message_Box.setBounds(0, 0, 530, 440);

        Panel5.add(Main_Messages, "Main_Messages");

        New_Message.setMinimumSize(new java.awt.Dimension(400, 350));
        New_Message.setLayout(null);

        Recepient.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Recepient.setText("ΠΑΡΑΛΗΠΤΗΣ:");
        Recepient.setFocusable(false);
        New_Message.add(Recepient);
        Recepient.setBounds(20, 10, 82, 40);

        Rec_Type_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Rec_Type_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Γιατρός", "Νοσοκόμος", "Γραμματέας", "Διευθυντής" }));
        Rec_Type_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rec_Type_Box.setFocusable(false);
        Rec_Type_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Rec_Type_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        New_Message.add(Rec_Type_Box);
        Rec_Type_Box.setBounds(110, 10, 110, 40);

        Rec_Name_Box.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
        Rec_Name_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Rec_Name_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Rec_Name_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        New_Message.add(Rec_Name_Box);
        Rec_Name_Box.setBounds(230, 10, 270, 40);

        Message_Text.setColumns(20);
        Message_Text.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Text.setLineWrap(true);
        Message_Text.setRows(5);
        Message_Text.setWrapStyleWord(true);
        Message_Text.setEnabled(false);
        Message_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Message_TextKeyReleased(evt);
            }
        });
        Message_Area_Scroll.setViewportView(Message_Text);

        New_Message.add(Message_Area_Scroll);
        Message_Area_Scroll.setBounds(20, 70, 480, 300);

        Send_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Send_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Send_Button.setText("ΑΠΟΣΤΟΛΗ");
        Send_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Send_Button.setEnabled(false);
        Send_Button.setFocusable(false);
        Send_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Send_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Send_ButtonActionPerformed(evt);
            }
        });
        New_Message.add(Send_Button);
        Send_Button.setBounds(110, 390, 130, 30);

        Cancel_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cancel_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Cancel_Icon.png"))); // NOI18N
        Cancel_Button.setText("ΑΚΥΡΩΣΗ");
        Cancel_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel_Button.setFocusable(false);
        Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ButtonActionPerformed(evt);
            }
        });
        New_Message.add(Cancel_Button);
        Cancel_Button.setBounds(260, 390, 130, 30);

        Panel5.add(New_Message, "New_Message");

        Message_Expanded.setLayout(null);

        Return_Button_Message_Expanded.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Return_Button_Message_Expanded.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Back_Arrow.png"))); // NOI18N
        Return_Button_Message_Expanded.setText("ΕΠΙΣΤΡΟΦΗ");
        Return_Button_Message_Expanded.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Return_Button_Message_Expanded.setFocusPainted(false);
        Return_Button_Message_Expanded.setFocusable(false);
        Return_Button_Message_Expanded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_Button_Message_ExpandedActionPerformed(evt);
            }
        });
        Message_Expanded.add(Return_Button_Message_Expanded);
        Return_Button_Message_Expanded.setBounds(360, 390, 130, 30);

        Message_Expanded_Text.setEditable(false);
        Message_Expanded_Text.setColumns(20);
        Message_Expanded_Text.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Expanded_Text.setLineWrap(true);
        Message_Expanded_Text.setRows(5);
        Message_Expanded_Text.setWrapStyleWord(true);
        Message_Expanded_Text.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Message_Expanded_Scroll.setViewportView(Message_Expanded_Text);

        Message_Expanded.add(Message_Expanded_Scroll);
        Message_Expanded_Scroll.setBounds(18, 90, 480, 280);

        Message_Expanded_SR.setEditable(false);
        Message_Expanded_SR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Expanded_SR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Message_Expanded.add(Message_Expanded_SR);
        Message_Expanded_SR.setBounds(20, 30, 210, 40);

        Message_Expanded_DateTime.setEditable(false);
        Message_Expanded_DateTime.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Expanded_DateTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Message_Expanded.add(Message_Expanded_DateTime);
        Message_Expanded_DateTime.setBounds(288, 30, 210, 40);

        Message_Expanded_SR_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Expanded_SR_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Message_Expanded_SR_Label.setText("ΑΠΟΣΤΟΛΕΑΣ/ΠΑΡΑΛΗΠΤΗΣ");
        Message_Expanded.add(Message_Expanded_SR_Label);
        Message_Expanded_SR_Label.setBounds(20, 0, 210, 30);

        Message_Expanded_DateTime_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Expanded_DateTime_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Message_Expanded_DateTime_Label.setText("ΗΜΕΡΟΜΗΝΙΑ / ΩΡΑ");
        Message_Expanded.add(Message_Expanded_DateTime_Label);
        Message_Expanded_DateTime_Label.setBounds(288, 0, 210, 30);

        Message_Delete_Button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Message_Delete_Button.setForeground(new java.awt.Color(255, 51, 51));
        Message_Delete_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Delete_Icon.png"))); // NOI18N
        Message_Delete_Button.setText("ΔΙΑΓΡΑΦΗ ΜΗΝΥΜΑΤΟΣ");
        Message_Delete_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Message_Delete_Button.setFocusable(false);
        Message_Delete_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Message_Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Message_Delete_ButtonActionPerformed(evt);
            }
        });
        Message_Expanded.add(Message_Delete_Button);
        Message_Delete_Button.setBounds(20, 390, 200, 30);

        Panel5.add(Message_Expanded, "Message_Expanded");

        MainPanel.add(Panel5, "Panel5");

        Panel6.setLayout(null);

        Username.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Username);
        Username.setBounds(20, 80, 150, 40);

        Password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Password);
        Password.setBounds(185, 80, 150, 40);

        Email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Email);
        Email.setBounds(350, 80, 150, 40);

        Name.setEditable(false);
        Name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Name);
        Name.setBounds(20, 180, 150, 40);

        LastName.setEditable(false);
        LastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(LastName);
        LastName.setBounds(185, 180, 150, 40);

        Birth_Date.setEditable(false);
        Birth_Date.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Birth_Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Birth_Date);
        Birth_Date.setBounds(350, 180, 150, 40);

        Tel_0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Tel_0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Tel_0);
        Tel_0.setBounds(20, 280, 150, 20);

        Tel_1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Tel_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Tel_1);
        Tel_1.setBounds(20, 300, 150, 20);

        Adress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Adress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Adress);
        Adress.setBounds(185, 280, 150, 40);

        Start_Date.setEditable(false);
        Start_Date.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start_Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Start_Date);
        Start_Date.setBounds(350, 280, 150, 40);

        Account_Update_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Account_Update_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Account_Update_Button.setText("ΕΝΗΜΕΡΩΣΗ");
        Account_Update_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Account_Update_Button.setFocusable(false);
        Account_Update_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Account_Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Account_Update_ButtonActionPerformed(evt);
            }
        });
        Panel6.add(Account_Update_Button);
        Account_Update_Button.setBounds(185, 360, 150, 40);

        Edit_Information_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Edit_Information_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit_Information_Label.setText("ΕΠΕΞΕΡΓΑΣΙΑ ΣΤΟΙΧΕΙΩΝ ΛΟΓΑΡΙΑΣΜΟΥ");
        Panel6.add(Edit_Information_Label);
        Edit_Information_Label.setBounds(60, 10, 390, 30);

        Username_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Username_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username_Label.setText("ΟΝΟΜΑ ΧΡΗΣΤΗ");
        Panel6.add(Username_Label);
        Username_Label.setBounds(20, 60, 150, 20);

        Password_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Password_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password_Label.setText("ΚΩΔΙΚΟΣ ΧΡΗΣΤΗ");
        Panel6.add(Password_Label);
        Password_Label.setBounds(185, 60, 150, 20);

        Email_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Email_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email_Label.setText("E-Mail");
        Panel6.add(Email_Label);
        Email_Label.setBounds(350, 60, 150, 20);

        Name_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_Label.setText("ΟΝΟΜΑ");
        Panel6.add(Name_Label);
        Name_Label.setBounds(20, 160, 150, 20);

        LastName_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LastName_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LastName_Label.setText("ΕΠΩΝΥΜΟ");
        Panel6.add(LastName_Label);
        LastName_Label.setBounds(185, 160, 150, 20);

        Birth_Date_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Birth_Date_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Birth_Date_Label.setText("ΗΜ/ΝΙΑ ΓΕΝΝΗΣΗΣ");
        Panel6.add(Birth_Date_Label);
        Birth_Date_Label.setBounds(350, 160, 150, 20);

        Tel_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Tel_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tel_Label.setText("ΤΗΛΕΦΩΝΑ");
        Panel6.add(Tel_Label);
        Tel_Label.setBounds(20, 260, 150, 20);

        Adress_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Adress_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Adress_Label.setText("ΔΙΕΥΘΥΝΣΗ");
        Panel6.add(Adress_Label);
        Adress_Label.setBounds(185, 260, 150, 20);

        Start_Date_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start_Date_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Start_Date_Label.setText("ΕΝΑΡΞΗ ΕΡΓΑΣΙΑΣ");
        Panel6.add(Start_Date_Label);
        Start_Date_Label.setBounds(350, 260, 150, 20);

        MainPanel.add(Panel6, "Panel6");

        getContentPane().add(MainPanel);
        MainPanel.setBounds(258, 15, 520, 440);

        Button0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Calendar_Icon.png"))); // NOI18N
        Button0.setText("Πρόγραμμα Ημέρας");
        Button0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button0.setFocusPainted(false);
        Button0.setFocusable(false);
        Button0.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });
        getContentPane().add(Button0);
        Button0.setBounds(28, 30, 200, 50);

        Button1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Examine_Icon.png"))); // NOI18N
        Button1.setText("Εξέταση Ασθενή");
        Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button1.setFocusPainted(false);
        Button1.setFocusable(false);
        Button1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        getContentPane().add(Button1);
        Button1.setBounds(28, 90, 200, 50);

        Button2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Surgery_Icon.png"))); // NOI18N
        Button2.setText("Χειρουργείο");
        Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button2.setFocusPainted(false);
        Button2.setFocusable(false);
        Button2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        getContentPane().add(Button2);
        Button2.setBounds(28, 150, 200, 50);

        Button3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/History_Icon.png"))); // NOI18N
        Button3.setText("Ιστορικό Ασθενών");
        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button3.setFocusPainted(false);
        Button3.setFocusable(false);
        Button3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        getContentPane().add(Button3);
        Button3.setBounds(28, 210, 200, 50);

        Button4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button4.setText("Button 4");
        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button4.setFocusPainted(false);
        Button4.setFocusable(false);
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        getContentPane().add(Button4);
        Button4.setBounds(28, 270, 200, 50);

        Button5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Message_Icon.png"))); // NOI18N
        Button5.setText("Μηνύματα");
        Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button5.setFocusPainted(false);
        Button5.setFocusable(false);
        Button5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        getContentPane().add(Button5);
        Button5.setBounds(28, 330, 200, 50);

        Button6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Card_Icon.png"))); // NOI18N
        Button6.setText("Ο Λογαριασμός μου");
        Button6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button6.setFocusPainted(false);
        Button6.setFocusable(false);
        Button6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        getContentPane().add(Button6);
        Button6.setBounds(28, 390, 200, 50);

        Logout_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Logout_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Logout_Icon.png"))); // NOI18N
        Logout_Button.setText("ΑΠΟΣΥΝΔΕΣΗ");
        Logout_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout_Button.setFocusPainted(false);
        Logout_Button.setFocusable(false);
        Logout_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Logout_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Logout_Button);
        Logout_Button.setBounds(610, 400, 150, 40);
        getContentPane().add(SeparatorHorTop);
        SeparatorHorTop.setBounds(18, 16, 220, 10);
        getContentPane().add(SeperatorHorBot);
        SeperatorHorBot.setBounds(18, 453, 220, 10);

        SeperatorVerLef.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(SeperatorVerLef);
        SeperatorVerLef.setBounds(17, 16, 10, 438);

        SeperatorVerRig.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(SeperatorVerRig);
        SeperatorVerRig.setBounds(238, 16, 10, 438);

        BackgroundMedX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/title.png"))); // NOI18N
        getContentPane().add(BackgroundMedX);
        BackgroundMedX.setBounds(598, 300, 180, 90);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/background.jpg"))); // NOI18N
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 800, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Variables declaration">
    static Connection conn=null;
    String user=null;
    String Patient_Selected=null;
    String chosen_receiver=null;
    ArrayList Medicine_Total = new ArrayList();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Account_Update_Button;
    private javax.swing.JButton Add_Medicine_Button;
    private javax.swing.JTextField Adress;
    private javax.swing.JLabel Adress_Label;
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel BackgroundMedX;
    private javax.swing.JTextField Birth_Date;
    private javax.swing.JLabel Birth_Date_Label;
    private javax.swing.JToggleButton Button0;
    private javax.swing.JToggleButton Button1;
    private javax.swing.JToggleButton Button2;
    private javax.swing.JToggleButton Button3;
    private javax.swing.JToggleButton Button4;
    private javax.swing.JToggleButton Button5;
    private javax.swing.JToggleButton Button6;
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JLabel CheckOut_Euro_Label;
    private javax.swing.JLabel CheckOut_Euro_Label1;
    private javax.swing.JCheckBox Check_Out;
    private javax.swing.JTextArea Description;
    private javax.swing.JScrollPane Description_Scroll;
    private javax.swing.JLabel Doctor_Comments_Label;
    private javax.swing.JLabel Doctor_Surgery_Comments_Label;
    private javax.swing.JComboBox<String> Doctor_Surgery_List;
    private javax.swing.JLabel Edit_Information_Label;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Email_Label;
    private javax.swing.JLabel Enter_Doctor_Surgery;
    private javax.swing.JLabel Enter_Patient_Surgery;
    private javax.swing.JComboBox<String> Examine_Patient_Box;
    private javax.swing.JList<String> Incoming_List;
    private javax.swing.JPanel Incoming_Panel;
    private javax.swing.JScrollPane Incoming_Scroll;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Insert_Surgery_Button;
    private javax.swing.JTextField LastName;
    private javax.swing.JLabel LastName_Label;
    private javax.swing.JButton Logout_Button;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Main_Messages;
    private javax.swing.JPanel Main_Patient;
    private javax.swing.JPanel Main_Schedule_Panel;
    private javax.swing.JComboBox<String> Medicine_Box_List;
    private javax.swing.JLabel Medicine_Label;
    private javax.swing.JList<String> Medicine_List;
    private javax.swing.JScrollPane Medicine_Scroll;
    private javax.swing.JScrollPane Message_Area_Scroll;
    private javax.swing.JTabbedPane Message_Box;
    private javax.swing.JButton Message_Delete_Button;
    private javax.swing.JPanel Message_Expanded;
    private javax.swing.JTextField Message_Expanded_DateTime;
    private javax.swing.JLabel Message_Expanded_DateTime_Label;
    private javax.swing.JTextField Message_Expanded_SR;
    private javax.swing.JLabel Message_Expanded_SR_Label;
    private javax.swing.JScrollPane Message_Expanded_Scroll;
    private javax.swing.JTextArea Message_Expanded_Text;
    private javax.swing.JTextArea Message_Text;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JPanel New_Message;
    private javax.swing.JButton New_Message_Button;
    private javax.swing.JList<String> Outgoing_List;
    private javax.swing.JPanel Outgoing_Panel;
    private javax.swing.JScrollPane Outgoing_Scroll;
    private javax.swing.JPanel Panel0;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JTextField Password;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JTextField Patient_Age;
    private javax.swing.JLabel Patient_Age_Label;
    private javax.swing.JPanel Patient_Card;
    private javax.swing.JButton Patient_Card_Button;
    private javax.swing.JTextField Patient_Cost;
    private javax.swing.JLabel Patient_Cost_Label;
    private javax.swing.JComboBox<String> Patient_Date_History_Box;
    private javax.swing.JLabel Patient_Date_History_Label;
    private javax.swing.JTextArea Patient_Description;
    private javax.swing.JLabel Patient_Description_Label;
    private javax.swing.JScrollPane Patient_Description_Scroll;
    private javax.swing.JTextField Patient_Gender;
    private javax.swing.JLabel Patient_Gender_Label;
    private javax.swing.JTextField Patient_History_AFM;
    private javax.swing.JLabel Patient_History_AFM_Label;
    private javax.swing.JTextField Patient_History_AMKA;
    private javax.swing.JLabel Patient_History_AMKA_Label;
    private javax.swing.JTextField Patient_History_Age;
    private javax.swing.JLabel Patient_History_Age_Label;
    private javax.swing.JButton Patient_History_Button;
    private javax.swing.JTextField Patient_History_Cost;
    private javax.swing.JLabel Patient_History_Cost_Label;
    private javax.swing.JTextArea Patient_History_Description;
    private javax.swing.JLabel Patient_History_Description_Label;
    private javax.swing.JScrollPane Patient_History_Description_Scroll;
    private javax.swing.JTextField Patient_History_Gender;
    private javax.swing.JLabel Patient_History_Gender_Label;
    private javax.swing.JTextField Patient_History_ID;
    private javax.swing.JLabel Patient_History_ID_Label;
    private javax.swing.JTextField Patient_History_LastName;
    private javax.swing.JLabel Patient_History_LastName_Label;
    private javax.swing.JLabel Patient_History_Medicine_Label;
    private javax.swing.JScrollPane Patient_History_Medicine_Scroll;
    private javax.swing.JTextField Patient_History_Name;
    private javax.swing.JLabel Patient_History_Name_Label;
    private javax.swing.JTextField Patient_History_Telephone;
    private javax.swing.JLabel Patient_History_Telephone_Label;
    private javax.swing.JTextField Patient_LastName;
    private javax.swing.JLabel Patient_LastName_Label;
    private javax.swing.JList<String> Patient_Medicine_List;
    private javax.swing.JTextField Patient_Name;
    private javax.swing.JComboBox<String> Patient_Name_History_Box;
    private javax.swing.JLabel Patient_Name_History_Label;
    private javax.swing.JLabel Patient_Name_Label;
    private javax.swing.JTextField Patient_Room;
    private javax.swing.JLabel Patient_Room_Label;
    private javax.swing.JComboBox<String> Patient_Surgery_List;
    private javax.swing.JTextField Patient_Telephone;
    private javax.swing.JLabel Patient_Telephone_Label;
    private javax.swing.JComboBox<String> Rec_Name_Box;
    private javax.swing.JComboBox<String> Rec_Type_Box;
    private javax.swing.JLabel Recepient;
    private javax.swing.JButton Refresh_Button;
    private javax.swing.JButton Remove_Medicine_Button;
    private javax.swing.JButton Return_Button_Card;
    private javax.swing.JButton Return_Button_Message_Expanded;
    private javax.swing.JButton Return_Button_Schedule;
    private javax.swing.JList<String> Schedule_Expanded_List;
    private javax.swing.JPanel Schedule_Expanded_Panel;
    private javax.swing.JScrollPane Schedule_Expanded_Scroll;
    private javax.swing.JLabel Schedule_Label;
    private javax.swing.JList<String> Schedule_List;
    private javax.swing.JScrollPane Schedule_List_Scroll;
    private javax.swing.JLabel Select_Patient;
    private javax.swing.JButton Send_Button;
    private javax.swing.JSeparator SeparatorHorTop;
    private javax.swing.JSeparator SeperatorHorBot;
    private javax.swing.JSeparator SeperatorVerLef;
    private javax.swing.JSeparator SeperatorVerRig;
    private javax.swing.JTextField Start_Date;
    private javax.swing.JLabel Start_Date_Label;
    private javax.swing.JTextField Surgery_Cost;
    private javax.swing.JLabel Surgery_Cost_Label;
    private javax.swing.JComboBox<String> Surgery_Day_List;
    private javax.swing.JTextArea Surgery_Description;
    private javax.swing.JScrollPane Surgery_Description_Scroll;
    private javax.swing.JLabel Surgery_Hour_Label;
    private javax.swing.JComboBox<String> Surgery_Hour_List;
    private javax.swing.JComboBox<String> Surgery_Minute_List;
    private javax.swing.JComboBox<String> Surgery_Month_List;
    private javax.swing.JLabel Surgery_Year_Label;
    private javax.swing.JComboBox<String> Surgery_Year_List;
    private javax.swing.JTextField Tel_0;
    private javax.swing.JTextField Tel_1;
    private javax.swing.JLabel Tel_Label;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel Username_Label;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
    
    //                                                                                      <editor-fold defaultstate="collapsed" desc="Home Page">
    public void Check_Button(JToggleButton button_clicked){
        CardLayout card = (CardLayout)MainPanel.getLayout();
        JToggleButton[] Button = new JToggleButton[7];
        Button[0]=Button0;
        Button[1]=Button1;
        Button[2]=Button2;
        Button[3]=Button3;
        Button[4]=Button4;
        Button[5]=Button5;
        Button[6]=Button6;
        String[] Panel = new String[7];
        Panel[0]="Panel0";
        Panel[1]="Panel1";
        Panel[2]="Panel2";
        Panel[3]="Panel3";
        Panel[4]="Panel4";
        Panel[5]="Panel5";
        Panel[6]="Panel6";
        if(button_clicked.isSelected()){
            MainPanel.setVisible(true);
            Logout_Button.setVisible(false);
            for(int i=0;i<=6;i++){
                if(button_clicked!=Button[i]){
                    Button[i].setEnabled(false);
                }
                else{
                    card.show(MainPanel, Panel[i]);
                }
            }
        }
        else{
            MainPanel.setVisible(false);
            Logout_Button.setVisible(true);
            for(int i=0;i<=6;i++){
                Button[i].setEnabled(true);
            }
        }
    }
    
    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        Check_Button(Button0);
        Load_Schedule();
    }//GEN-LAST:event_Button0ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        Check_Button(Button1);
        Load_Patient_Box();
        Load_Medicine();
        Check_Patient_Selected();
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        Check_Button(Button2);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        Check_Button(Button3);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        Check_Button(Button4);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        Load_Incoming_Messages();
        Load_Outgoing_Messages();
        Check_Button(Button5);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        Load_Account();
        Check_Button(Button6);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Logout_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_ButtonActionPerformed
        LoginScreen l = new LoginScreen(conn);
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Logout_ButtonActionPerformed
    // </editor-fold>
    
    //                                                                                      <editor-fold defaultstate="collapsed" desc="Panel0">
    private void Load_Schedule(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate localDate = LocalDate.now();
        Schedule_Label.setText("ΠΡΟΓΡΑΜΜΑ ΗΜΕΡΑΣ : "+dtf.format(localDate));
        DefaultListModel model = new DefaultListModel();
        ArrayList hours = new ArrayList();
        hours.clear();
        for(int i=0;i<24;i++) {
            if(i<10) hours.add("0"+i+":00-0"+i+":59 | ");
            else hours.add(i+":00-"+i+":59 | ");
        }
        for(int i=0;i<hours.size();i++) {
            model.addElement(hours.get(i));
        }
        Schedule_List.setModel(model);
    }
    
    private void Load_Schedule_Expanded() {
        ArrayList Patients = new ArrayList();
        Patients.clear();
        Patients.add("Ασθενής 1 : 1234");
        Patients.add("Ασθενής 2 : 5468");
        Patients.add("Ασθενής 3 : 6984");
        Patients.add("Ασθενής 4 : 6785");
        Schedule_Expanded_List.setModel(new DefaultComboBoxModel(Patients.toArray()));
    }
    
    private void Return_Button_ScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_Button_ScheduleActionPerformed
        CardLayout card = (CardLayout)Panel0.getLayout();
        card.show(Panel0, "Main_Schedule_Panel");
    }//GEN-LAST:event_Return_Button_ScheduleActionPerformed
    
    private void Schedule_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schedule_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2) {
            CardLayout card = (CardLayout)Panel0.getLayout();
            card.show(Panel0, "Schedule_Expanded_Panel");
            Load_Schedule_Expanded();
        }
    }//GEN-LAST:event_Schedule_ListMouseReleased

    private void Schedule_Expanded_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schedule_Expanded_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2) {
            CardLayout card = (CardLayout)Panel1.getLayout();
            card.show(Panel1, "Patient_Card");
            Button1.setSelected(true);
            Button1.setEnabled(true);
            Button0.setSelected(false);
            Button0.setEnabled(false);
            Check_Button(Button1);
            Patient_Selected=Schedule_Expanded_List.getSelectedValue();
            Load_Patient_Card();
        }
    }//GEN-LAST:event_Schedule_Expanded_ListMouseReleased
    // </editor-fold>
    
    //                                                                                      <editor-fold defaultstate="collapsed" desc="Panel1">
    private void Load_Patient_Box() {
        ArrayList Patients = new ArrayList();
        Patients.clear();
        Patients.add(null);
        Patients.add("Ασθενής 1 : 1234");
        Patients.add("Ασθενής 2 : 5468");
        Patients.add("Ασθενής 3 : 6984");
        Patients.add("Ασθενής 4 : 6785");
        Examine_Patient_Box.setModel(new DefaultComboBoxModel(Patients.toArray()));
        if(!Patients.contains(Patient_Selected)) Patient_Selected=null;
        Examine_Patient_Box.setSelectedItem(Patient_Selected);
    }
    
    private void Load_Medicine() {
        ArrayList Medicines = new ArrayList();
        Medicines.clear();
        Medicines.add(null);
        Medicines.add("Xanax");
        Medicines.add("Lexapro");
        Medicines.add("Celexa");
        Medicines.add("Ativan");
        Medicines.add("Effexor");
        Medicines.add("Elavil");
        Medicine_Box_List.setModel(new DefaultComboBoxModel(Medicines.toArray()));
    }
    
    private void Check_Patient_Selected(){
        if(Examine_Patient_Box.getSelectedItem()==null) {
            Description.setEnabled(false);
            Medicine_Box_List.setEnabled(false);
            Patient_Cost.setEnabled(false);
            Patient_Card_Button.setEnabled(false);
            Check_Out.setEnabled(false);
            Description.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
            Description.setEnabled(false);
            Medicine_List.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
            Medicine_List.setEnabled(false);
        }else{
            Description.setEnabled(true);
            Medicine_Box_List.setEnabled(true);
            Patient_Cost.setEnabled(true);
            Patient_Card_Button.setEnabled(true);
            Check_Out.setEnabled(true);
            Description.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.background"));
            Description.setEnabled(true);
            Medicine_List.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.background"));
            Medicine_List.setEnabled(true);
        }
    }
    
    private void Load_Patient_Card() {
        Patient_Name.setText(Patient_Selected);
    }
    
    public void Int_Typed(KeyEvent e) {
      char c = e.getKeyChar();
      if (!( ((c >= '0') && (c <= '9')) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        e.consume();
      }
    }
    
    private void Patient_Card_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Patient_Card_ButtonActionPerformed
        CardLayout card = (CardLayout)Panel1.getLayout();
        card.show(Panel1, "Patient_Card");
        Load_Patient_Card();
    }//GEN-LAST:event_Patient_Card_ButtonActionPerformed
    
    private void Examine_Patient_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Examine_Patient_BoxPopupMenuWillBecomeInvisible
        Patient_Selected=(String)Examine_Patient_Box.getSelectedItem();
        Check_Patient_Selected();
        Patient_Cost.setText(null);
        Insert.setEnabled(false);
    }//GEN-LAST:event_Examine_Patient_BoxPopupMenuWillBecomeInvisible
    
    private void Add_Medicine_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Medicine_ButtonActionPerformed
        if(Medicine_Box_List.getSelectedItem() == null) {}
        else{
            DefaultListModel model = new DefaultListModel();
            Medicine_Total.add( Medicine_Box_List.getSelectedItem() );
            for(int i=0;i<Medicine_Total.size();i++) {
                model.addElement(Medicine_Total.get(i));
            }
            Medicine_List.setModel(model);
        }
    }//GEN-LAST:event_Add_Medicine_ButtonActionPerformed

    private void Remove_Medicine_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_Medicine_ButtonActionPerformed
        if(Medicine_List.getSelectedIndex() != -1) {
            DefaultListModel model = new DefaultListModel();
            int[] index = Medicine_List.getSelectedIndices();
            for(int i=Medicine_Total.size()-1;i>=0;i--) {
                for (int j=0;j<index.length;j++) {
                    if(i==index[j]) Medicine_Total.remove(i);
                }
            }
            for(int j=0;j<Medicine_Total.size();j++) {
                model.addElement(Medicine_Total.get(j));
            }
            Medicine_List.setModel(model);
            Remove_Medicine_Button.setEnabled(false);
        }
    }//GEN-LAST:event_Remove_Medicine_ButtonActionPerformed

    private void Medicine_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Medicine_ListMouseReleased
        if(Medicine_List.getSelectedIndex() != -1) Remove_Medicine_Button.setEnabled(true);
    }//GEN-LAST:event_Medicine_ListMouseReleased

    private void Medicine_Box_ListPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Medicine_Box_ListPopupMenuWillBecomeInvisible
        if(Medicine_Box_List.getSelectedItem() == null) Add_Medicine_Button.setEnabled(false);
        else Add_Medicine_Button.setEnabled(true);
    }//GEN-LAST:event_Medicine_Box_ListPopupMenuWillBecomeInvisible

    private void Patient_CostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Patient_CostKeyTyped
        Int_Typed(evt);
    }//GEN-LAST:event_Patient_CostKeyTyped

    private void Patient_CostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Patient_CostKeyReleased
        if(Patient_Cost.getText().equals("")) Insert.setEnabled(false);
        else Insert.setEnabled(true);
    }//GEN-LAST:event_Patient_CostKeyReleased

    private void Return_Button_CardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_Button_CardActionPerformed
        CardLayout card = (CardLayout)Panel1.getLayout();
        card.show(Panel1, "Main_Patient");
        Load_Patient_Box();
        Load_Medicine();
        Check_Patient_Selected();
    }//GEN-LAST:event_Return_Button_CardActionPerformed

    private void Patient_History_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Patient_History_ButtonActionPerformed
        CardLayout card = (CardLayout)MainPanel.getLayout();
        card.show(MainPanel, "Panel3");
        Button3.setSelected(true);
        Button3.setEnabled(true);
        Button1.setSelected(false);
        Button1.setEnabled(false);
        Check_Button(Button3);
    }//GEN-LAST:event_Patient_History_ButtonActionPerformed
    // </editor-fold>
    
    //                                                                                      <editor-fold defaultstate="collapsed" desc="Panel2">
    private void Surgery_CostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Surgery_CostKeyTyped
        Int_Typed(evt);
    }//GEN-LAST:event_Surgery_CostKeyTyped

    private void Surgery_CostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Surgery_CostKeyReleased
        if(Surgery_Cost.getText().equals("")) Insert_Surgery_Button.setEnabled(false);
        else Insert_Surgery_Button.setEnabled(true);
    }//GEN-LAST:event_Surgery_CostKeyReleased
    // </editor-fold>
    
    //                                                                                      <editor-fold defaultstate="collapsed" desc="Panel5">
    private void Load_Incoming_Messages(){
        ArrayList messages = new ArrayList();
        messages.clear();
        try{
            String query = "select* from messages where owner='"+user+"' and receiver='"+user+"' order by date_time DESC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                messages.add(rs.getString("date_time")+" | Από: "+rs.getString("sender")+" | "+rs.getString("message"));
            }
            rs.close();
            stmt.close();
            }catch(Exception e){};
        Incoming_List.setModel(new DefaultComboBoxModel(messages.toArray()));
    }
    
    private void Load_Outgoing_Messages(){
        ArrayList messages = new ArrayList();
        messages.clear();
        try{
            String query = "select* from messages where owner='"+user+"' and sender='"+user+"' order by date_time DESC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                messages.add(rs.getString("date_time")+" | Προς: "+rs.getString("receiver")+" | "+rs.getString("message"));
            }
            rs.close();
            stmt.close();
            }catch(Exception e){};
        Outgoing_List.setModel(new DefaultComboBoxModel(messages.toArray()));
    }
    
    private void Load_Rec_Type_List(){
        ArrayList jobs = new ArrayList();
        jobs.add(null);
        jobs.add("Γιατρός");
        jobs.add("Νοσηλευτής");
        jobs.add("Γραμματέας");
        jobs.add("Αποθηκάριος");
        jobs.add("Διευθυντής");
        Rec_Type_Box.setModel(new DefaultComboBoxModel(jobs.toArray()));
    }
    
    private void Load_Rec_Name_Box(String job){
        ArrayList names = new ArrayList();
        names.add(null);
        try{
            String query = "select username,name,lastname from users where job='"+job+"' and username!='"+user+"' order by name ASC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                names.add(rs.getString("name")+" "+rs.getString("lastname")+" | "+rs.getString("username"));
            }
            rs.close();
            stmt.close();
        }catch(Exception e){};
        Rec_Name_Box.setModel(new DefaultComboBoxModel(names.toArray()));
    }
    
    private void Load_Message_Expanded(String temp){
        String[] message=temp.split(" \\| |: ");
        Message_Expanded_DateTime.setText(message[0]);
        Message_Expanded_SR.setText(message[2]);
        Message_Expanded_Text.setText(message[3]);
    }
    
    private void New_Message_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_Message_ButtonActionPerformed
        Load_Rec_Type_List();
        Rec_Name_Box.setEnabled(false);
        Send_Button.setEnabled(false);
        Rec_Name_Box.setSelectedItem(null);
        Message_Text.setText(null);
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "New_Message");
    }//GEN-LAST:event_New_Message_ButtonActionPerformed

    private void Refresh_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_ButtonActionPerformed
        Load_Incoming_Messages();
        Load_Outgoing_Messages();
    }//GEN-LAST:event_Refresh_ButtonActionPerformed

    private void Incoming_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Incoming_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2 && Incoming_List.getSelectedIndex() != -1) {
            CardLayout card = (CardLayout)Panel5.getLayout();
            card.show(Panel5, "Message_Expanded");
            Message_Expanded_SR_Label.setText("ΑΠΟΣΤΟΛΕΑΣ");
            String temp=Incoming_List.getSelectedValue();
            Load_Message_Expanded(temp);

        }
    }//GEN-LAST:event_Incoming_ListMouseReleased

    private void Outgoing_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Outgoing_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2 && Outgoing_List.getSelectedIndex() != -1) {
            CardLayout card = (CardLayout)Panel5.getLayout();
            card.show(Panel5, "Message_Expanded");
            Message_Expanded_SR_Label.setText("ΠΑΡΑΛΗΠΤΗΣ");
            String temp=Outgoing_List.getSelectedValue();
            Load_Message_Expanded(temp);
        }
    }//GEN-LAST:event_Outgoing_ListMouseReleased

    private void Rec_Type_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Rec_Type_BoxPopupMenuWillBecomeInvisible
        Send_Button.setEnabled(false);
        Message_Text.setEnabled(false);
        Message_Text.setText("");
        if(Rec_Type_Box.getSelectedItem() == null) {
            Rec_Name_Box.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
            Rec_Name_Box.setEnabled(false);
            Rec_Name_Box.setSelectedItem(null);
        }
        else {
            Rec_Name_Box.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.background"));
            Rec_Name_Box.setEnabled(true);
            Load_Rec_Name_Box(String.valueOf(Rec_Type_Box.getSelectedItem()));
        }
    }//GEN-LAST:event_Rec_Type_BoxPopupMenuWillBecomeInvisible

    private void Rec_Name_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Rec_Name_BoxPopupMenuWillBecomeInvisible
        Send_Button.setEnabled(false);
        Message_Text.setText("");
        if(Rec_Name_Box.getSelectedItem() == null) Message_Text.setEnabled(false);
        else {
            String temp=String.valueOf(Rec_Name_Box.getSelectedItem());
            String[] receiver=temp.split(" \\| ");
            chosen_receiver=receiver[1];
            Message_Text.setEnabled(true);
        }
    }//GEN-LAST:event_Rec_Name_BoxPopupMenuWillBecomeInvisible

    private void Message_TextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Message_TextKeyReleased
        if(Message_Text.getText().equals("")) Send_Button.setEnabled(false);
        else Send_Button.setEnabled(true);
    }//GEN-LAST:event_Message_TextKeyReleased

    private void Send_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Send_ButtonActionPerformed
        try{  //insert stoixeia
            String query = "insert into messages (sender,receiver,owner,message) values (?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,user);
            pstmt.setString(2,chosen_receiver);
            pstmt.setString(3,user);
            pstmt.setString(4,Message_Text.getText());
            pstmt.executeUpdate();
            pstmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        try{  //insert stoixeia
            String query = "insert into messages (sender,receiver,owner,message) values (?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,user);
            pstmt.setString(2,chosen_receiver);
            pstmt.setString(3,chosen_receiver);
            pstmt.setString(4,Message_Text.getText());
            pstmt.executeUpdate();
            pstmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "Main_Messages");
        Load_Incoming_Messages();
        Load_Outgoing_Messages();
    }//GEN-LAST:event_Send_ButtonActionPerformed

    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "Main_Messages");
    }//GEN-LAST:event_Cancel_ButtonActionPerformed

    private void Return_Button_Message_ExpandedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_Button_Message_ExpandedActionPerformed
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "Main_Messages");
    }//GEN-LAST:event_Return_Button_Message_ExpandedActionPerformed

    private void Message_Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Message_Delete_ButtonActionPerformed
        try{  //insert stoixeia
            String query = "delete from messages where owner='"+user+"' and date_time='"+Message_Expanded_DateTime.getText()+"'";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            pstmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "Main_Messages");
        Load_Incoming_Messages();
        Load_Outgoing_Messages();
    }//GEN-LAST:event_Message_Delete_ButtonActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel6">
    private void Load_Account(){
        try{
            String query = "select* from users where username='"+user+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Username.setText(rs.getString("username"));
                Password.setText(rs.getString("password"));
                Email.setText(rs.getString("email"));
                Name.setText(rs.getString("name"));
                LastName.setText(rs.getString("lastname"));
                Birth_Date.setText(rs.getString("birth_date"));
                Tel_0.setText(rs.getString("tel_0"));
                Tel_1.setText(rs.getString("tel_1"));
                Adress.setText(rs.getString("address"));
                Start_Date.setText(rs.getString("start_date"));
            }
            rs.close();
            stmt.close();
            }catch(Exception e){System.out.println(e.getMessage());};
    }

    private void Account_Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Account_Update_ButtonActionPerformed
        try{
            String query = "update users set username=?,password=?,email=?,tel_0=?,tel_1=?,address=? where username='"+user+"'";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,Username.getText());
            pstmt.setString(2,Password.getText());
            pstmt.setString(3,Email.getText());
            pstmt.setString(4,Tel_0.getText());
            pstmt.setString(5,Tel_1.getText());
            pstmt.setString(6,Adress.getText());
            pstmt.executeUpdate();
            pstmt.close();
            user=Username.getText();
            this.setTitle("MedX - Καλώς ήρθες διευθυντή - "+user);
        }catch(Exception e){System.out.println(e.getMessage());};
        Load_Account();
    }//GEN-LAST:event_Account_Update_ButtonActionPerformed
    // </editor-fold>
    
}
