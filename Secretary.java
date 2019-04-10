package MedX;

    // <editor-fold defaultstate="collapsed" desc="Imports">
import static MedX.Doctor.conn;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JToggleButton;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
    // </editor-fold>

public class Secretary extends javax.swing.JFrame {
    
    // <editor-fold defaultstate="collapsed" desc="Secretary Constructor">
    public Secretary(String name,Connection condb) {
        initComponents();
        conn=condb;
        user=name;
        this.setLocationRelativeTo(null);
        BackgroundImage.requestFocus();
        Button4.setVisible(false);
        this.setTitle("MedX - Καλώς ήρθες γραμματέα - "+user);
        Load_Worker_Type_Box();
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
        Main_Patient_Panel = new javax.swing.JPanel();
        Select_Patient = new javax.swing.JLabel();
        Treat_Patient_Box = new javax.swing.JComboBox<>();
        New_Patient_Button = new javax.swing.JButton();
        Patient_Name_Label = new javax.swing.JLabel();
        Patient_LastName_Label = new javax.swing.JLabel();
        Patient_Telephone_Label = new javax.swing.JLabel();
        Patient_AFM_Label = new javax.swing.JLabel();
        Patient_ID_Label = new javax.swing.JLabel();
        Patient_AMKA_Label = new javax.swing.JLabel();
        Patient_Gender_Label = new javax.swing.JLabel();
        Patient_Age_Label = new javax.swing.JLabel();
        Patient_Room_Label = new javax.swing.JLabel();
        Patient_Description_Label = new javax.swing.JLabel();
        Patient_Name = new javax.swing.JTextField();
        Patient_LastName = new javax.swing.JTextField();
        Patient_Telephone = new javax.swing.JTextField();
        Patient_AFM = new javax.swing.JTextField();
        Patient_ID = new javax.swing.JTextField();
        Patient_AMKA = new javax.swing.JTextField();
        Patient_Gender = new javax.swing.JComboBox<>();
        Patient_Age = new javax.swing.JTextField();
        Patient_Room = new javax.swing.JTextField();
        Patient_Update_Button = new javax.swing.JButton();
        Patient_Description_Scroll = new javax.swing.JScrollPane();
        Patient_Reason = new javax.swing.JTextArea();
        Insert_Success = new javax.swing.JLabel();
        Insert_fail = new javax.swing.JLabel();
        New_Patient_Panel = new javax.swing.JPanel();
        Insert_Patient_Data_Label = new javax.swing.JLabel();
        Appointment_Check = new javax.swing.JCheckBox();
        Insert_New_Patient_Button = new javax.swing.JButton();
        Cancel_New_Patient_Button = new javax.swing.JButton();
        New_Patient_Name_Label = new javax.swing.JLabel();
        New_Patient_LastName_Label = new javax.swing.JLabel();
        New_Patient_Telephone_Label = new javax.swing.JLabel();
        New_Patient_AFM_Label = new javax.swing.JLabel();
        New_Patient_ID_Label = new javax.swing.JLabel();
        New_Patient_AMKA_Label = new javax.swing.JLabel();
        New_Patient_Gender_Label = new javax.swing.JLabel();
        New_Patient_Age_Label = new javax.swing.JLabel();
        New_Patient_RoomDoctor_Label = new javax.swing.JLabel();
        New_Patient_Description_Label = new javax.swing.JLabel();
        New_Patient_Name = new javax.swing.JTextField();
        New_Patient_LastName = new javax.swing.JTextField();
        New_Patient_Telephone = new javax.swing.JTextField();
        New_Patient_AFM = new javax.swing.JTextField();
        New_Patient_ID = new javax.swing.JTextField();
        New_Patient_AMKA = new javax.swing.JTextField();
        New_Patient_Gender = new javax.swing.JComboBox<>();
        New_Patient_Age = new javax.swing.JTextField();
        New_Patient_Room = new javax.swing.JTextField();
        New_Patient_Description_Scroll = new javax.swing.JScrollPane();
        New_Patient_Reason = new javax.swing.JTextArea();
        Apointment_Doctor_Box = new javax.swing.JComboBox<>();
        Appointment_Year_Label = new javax.swing.JLabel();
        Appointment_Hour_Label = new javax.swing.JLabel();
        Appointment_Year_List = new javax.swing.JComboBox<>();
        Appointment_Month_List = new javax.swing.JComboBox<>();
        Appointment_Day_List = new javax.swing.JComboBox<>();
        Appointment_Hour_List = new javax.swing.JComboBox<>();
        Appointment_Minute_List = new javax.swing.JComboBox<>();
        New_Insert_fail = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        Select_CheckOut_Patient_Label = new javax.swing.JLabel();
        CheckOut_Patient_Box = new javax.swing.JComboBox<>();
        Confirm_CheckOut_Button = new javax.swing.JButton();
        Patient_Cost_Label = new javax.swing.JLabel();
        Patient_Cost = new javax.swing.JTextField();
        Cost_Euro_Label = new javax.swing.JLabel();
        Patient_Payment_Method_Label = new javax.swing.JLabel();
        Payment_Type_Box = new javax.swing.JComboBox<>();
        Medicine_Cost = new javax.swing.JTextField();
        Medicine_Cost_Label = new javax.swing.JLabel();
        Medicine_Cost_Euro_Label = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        Worker_Label = new javax.swing.JLabel();
        Reset_Worker_Password = new javax.swing.JCheckBox();
        Worker_Type_Box = new javax.swing.JComboBox<>();
        Worker_Name_Box = new javax.swing.JComboBox<>();
        Worker_Username = new javax.swing.JTextField();
        Worker_Password = new javax.swing.JPasswordField();
        Worker_Email = new javax.swing.JTextField();
        Worker_Name = new javax.swing.JTextField();
        Worker_Lastname = new javax.swing.JTextField();
        Worker_Birth_Year = new javax.swing.JComboBox<>();
        Worker_Birth_Month = new javax.swing.JComboBox<>();
        Worker_Birth_Day = new javax.swing.JComboBox<>();
        Worker_Username_Label = new javax.swing.JLabel();
        Worker_Password_Label = new javax.swing.JLabel();
        Worker_Email_Label = new javax.swing.JLabel();
        Worker_Name_Label = new javax.swing.JLabel();
        Worker_LastName_Label = new javax.swing.JLabel();
        Worker_Birthday_Label = new javax.swing.JLabel();
        Worker_Update_Button = new javax.swing.JButton();
        Worker_Delete_Button = new javax.swing.JButton();
        Worker_Success = new javax.swing.JLabel();
        Worker_Fail = new javax.swing.JLabel();
        Delete_Success = new javax.swing.JLabel();
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
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        MainPanel.setVisible(false);
        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MainPanel.setPreferredSize(new java.awt.Dimension(410, 340));
        MainPanel.setLayout(new java.awt.CardLayout());

        Panel0.setLayout(new java.awt.CardLayout());

        Main_Schedule_Panel.setLayout(null);

        Schedule_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Schedule_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
        Return_Button_Schedule.setFocusPainted(false);
        Return_Button_Schedule.setFocusable(false);
        Return_Button_Schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_Button_ScheduleActionPerformed(evt);
            }
        });
        Schedule_Expanded_Panel.add(Return_Button_Schedule);
        Return_Button_Schedule.setBounds(369, 389, 130, 30);

        Schedule_Expanded_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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

        Main_Patient_Panel.setLayout(null);

        Select_Patient.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Select_Patient.setText("Επιλογή Ασθενή :");
        Main_Patient_Panel.add(Select_Patient);
        Select_Patient.setBounds(20, 20, 90, 30);

        AutoCompleteDecorator.decorate(Treat_Patient_Box);
        Treat_Patient_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Treat_Patient_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Treat_Patient_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Main_Patient_Panel.add(Treat_Patient_Box);
        Treat_Patient_Box.setBounds(112, 15, 220, 40);

        New_Patient_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/New_Message_Icon.png"))); // NOI18N
        New_Patient_Button.setText("ΝΕΟΣ ΑΣΘΕΝΗΣ");
        New_Patient_Button.setFocusable(false);
        New_Patient_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_Patient_ButtonActionPerformed(evt);
            }
        });
        Main_Patient_Panel.add(New_Patient_Button);
        New_Patient_Button.setBounds(350, 15, 150, 40);

        Patient_Name_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Name_Label.setText("ΟΝΟΜΑ");
        Patient_Name_Label.setFocusable(false);
        Main_Patient_Panel.add(Patient_Name_Label);
        Patient_Name_Label.setBounds(20, 60, 140, 20);

        Patient_LastName_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_LastName_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_LastName_Label.setText("ΕΠΩΝΥΜΟ");
        Patient_LastName_Label.setFocusable(false);
        Main_Patient_Panel.add(Patient_LastName_Label);
        Patient_LastName_Label.setBounds(180, 60, 150, 20);

        Patient_Telephone_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Telephone_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Telephone_Label.setText("ΤΗΛΕΦΩΝΟ");
        Patient_Telephone_Label.setFocusable(false);
        Main_Patient_Panel.add(Patient_Telephone_Label);
        Patient_Telephone_Label.setBounds(350, 60, 150, 20);

        Patient_AFM_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_AFM_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_AFM_Label.setText("Α.Φ.Μ.");
        Patient_AFM_Label.setFocusable(false);
        Main_Patient_Panel.add(Patient_AFM_Label);
        Patient_AFM_Label.setBounds(20, 130, 140, 20);

        Patient_ID_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_ID_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_ID_Label.setText("ΑΡ. ΤΑΥΤΟΤΗΤΑΣ");
        Patient_ID_Label.setFocusable(false);
        Main_Patient_Panel.add(Patient_ID_Label);
        Patient_ID_Label.setBounds(182, 130, 150, 20);

        Patient_AMKA_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_AMKA_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_AMKA_Label.setText("Α.Μ.Κ.Α.");
        Patient_AMKA_Label.setFocusable(false);
        Main_Patient_Panel.add(Patient_AMKA_Label);
        Patient_AMKA_Label.setBounds(350, 130, 150, 20);

        Patient_Gender_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Gender_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Gender_Label.setText("ΦΥΛΟ");
        Patient_Gender_Label.setFocusable(false);
        Main_Patient_Panel.add(Patient_Gender_Label);
        Patient_Gender_Label.setBounds(20, 200, 140, 20);

        Patient_Age_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Age_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Age_Label.setText("ΗΛΙΚΙΑ");
        Patient_Age_Label.setFocusable(false);
        Main_Patient_Panel.add(Patient_Age_Label);
        Patient_Age_Label.setBounds(182, 200, 150, 20);

        Patient_Room_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Room_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Room_Label.setText("ΔΩΜΑΤΙΟ");
        Patient_Room_Label.setFocusable(false);
        Main_Patient_Panel.add(Patient_Room_Label);
        Patient_Room_Label.setBounds(350, 200, 150, 20);

        Patient_Description_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Description_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Description_Label.setText("ΛΟΓΟΣ ΕΙΣΑΓΩΓΗΣ ΑΣΘΕΝΗ");
        Patient_Description_Label.setFocusable(false);
        Main_Patient_Panel.add(Patient_Description_Label);
        Patient_Description_Label.setBounds(160, 270, 190, 20);

        Patient_Name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_Name.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_Name.setEnabled(false);
        Main_Patient_Panel.add(Patient_Name);
        Patient_Name.setBounds(15, 80, 150, 40);

        Patient_LastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_LastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_LastName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_LastName.setEnabled(false);
        Main_Patient_Panel.add(Patient_LastName);
        Patient_LastName.setBounds(182, 80, 150, 40);

        Patient_Telephone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Telephone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_Telephone.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_Telephone.setEnabled(false);
        Main_Patient_Panel.add(Patient_Telephone);
        Patient_Telephone.setBounds(350, 80, 150, 40);

        Patient_AFM.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_AFM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_AFM.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_AFM.setEnabled(false);
        Main_Patient_Panel.add(Patient_AFM);
        Patient_AFM.setBounds(15, 150, 150, 40);

        Patient_ID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_ID.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_ID.setEnabled(false);
        Main_Patient_Panel.add(Patient_ID);
        Patient_ID.setBounds(182, 150, 150, 40);

        Patient_AMKA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_AMKA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_AMKA.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_AMKA.setEnabled(false);
        Main_Patient_Panel.add(Patient_AMKA);
        Patient_AMKA.setBounds(350, 150, 150, 40);

        Patient_Gender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Άνδρας", "Γυναίκα" }));
        Patient_Gender.setSelectedIndex(-1);
        Patient_Gender.setSelectedItem(null);
        Patient_Gender.setEnabled(false);
        Patient_Gender.setFocusable(false);
        Main_Patient_Panel.add(Patient_Gender);
        Patient_Gender.setBounds(15, 220, 150, 40);

        Patient_Age.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_Age.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_Age.setEnabled(false);
        Main_Patient_Panel.add(Patient_Age);
        Patient_Age.setBounds(182, 220, 150, 40);

        Patient_Room.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patient_Room.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_Room.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_Room.setEnabled(false);
        Main_Patient_Panel.add(Patient_Room);
        Patient_Room.setBounds(350, 220, 150, 40);

        Patient_Update_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Update_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Patient_Update_Button.setText("ΕΝΗΜΕΡΩΣΗ");
        Patient_Update_Button.setEnabled(false);
        Patient_Update_Button.setFocusable(false);
        Patient_Update_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Patient_Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Patient_Update_ButtonActionPerformed(evt);
            }
        });
        Main_Patient_Panel.add(Patient_Update_Button);
        Patient_Update_Button.setBounds(180, 380, 150, 40);

        Patient_Reason.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
        Patient_Reason.setColumns(20);
        Patient_Reason.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Reason.setLineWrap(true);
        Patient_Reason.setRows(5);
        Patient_Reason.setWrapStyleWord(true);
        Patient_Reason.setEnabled(false);
        Patient_Description_Scroll.setViewportView(Patient_Reason);

        Main_Patient_Panel.add(Patient_Description_Scroll);
        Patient_Description_Scroll.setBounds(20, 290, 470, 80);

        Insert_Success.setVisible(false);
        Insert_Success.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        Insert_Success.setForeground(new java.awt.Color(51, 204, 0));
        Insert_Success.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_Success.setText("ΕΠΙΤΥΧΗΣ ΕΙΣΑΓΩΓΗ");
        Main_Patient_Panel.add(Insert_Success);
        Insert_Success.setBounds(20, 380, 150, 40);

        Insert_fail.setVisible(false);
        Insert_fail.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        Insert_fail.setForeground(new java.awt.Color(255, 0, 0));
        Insert_fail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_fail.setText("ΑΝΕΠΙΤΥΧΗΣ ΕΙΣΑΓΩΓΗ");
        Main_Patient_Panel.add(Insert_fail);
        Insert_fail.setBounds(20, 380, 150, 40);

        Panel1.add(Main_Patient_Panel, "Main_Patient_Panel");

        New_Patient_Panel.setLayout(null);

        Insert_Patient_Data_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Insert_Patient_Data_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_Patient_Data_Label.setText("ΕΙΣΑΓΕΤΕ ΤΑ ΣΤΟΙΧΕΙΑ ΤΟΥ ΑΣΘΕΝΗ");
        New_Patient_Panel.add(Insert_Patient_Data_Label);
        Insert_Patient_Data_Label.setBounds(80, 10, 350, 40);

        Appointment_Check.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Appointment_Check.setText("ΡΑΝΤΕΒΟΥ");
        Appointment_Check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Appointment_Check.setFocusable(false);
        Appointment_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Appointment_CheckActionPerformed(evt);
            }
        });
        New_Patient_Panel.add(Appointment_Check);
        Appointment_Check.setBounds(370, 260, 110, 20);

        Insert_New_Patient_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_New_Patient_Button.setForeground(new java.awt.Color(0, 204, 51));
        Insert_New_Patient_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Insert_New_Patient_Button.setText("ΕΙΣΑΓΩΓΗ");
        Insert_New_Patient_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Insert_New_Patient_Button.setFocusPainted(false);
        Insert_New_Patient_Button.setFocusable(false);
        Insert_New_Patient_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Insert_New_Patient_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_New_Patient_ButtonActionPerformed(evt);
            }
        });
        New_Patient_Panel.add(Insert_New_Patient_Button);
        Insert_New_Patient_Button.setBounds(13, 385, 120, 40);

        Cancel_New_Patient_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cancel_New_Patient_Button.setForeground(new java.awt.Color(255, 51, 51));
        Cancel_New_Patient_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Cancel_Icon.png"))); // NOI18N
        Cancel_New_Patient_Button.setText("ΑΚΥΡΩΣΗ");
        Cancel_New_Patient_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel_New_Patient_Button.setFocusPainted(false);
        Cancel_New_Patient_Button.setFocusable(false);
        Cancel_New_Patient_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_New_Patient_ButtonActionPerformed(evt);
            }
        });
        New_Patient_Panel.add(Cancel_New_Patient_Button);
        Cancel_New_Patient_Button.setBounds(175, 385, 120, 40);

        New_Patient_Name_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Patient_Name_Label.setText("ΟΝΟΜΑ");
        New_Patient_Name_Label.setFocusable(false);
        New_Patient_Panel.add(New_Patient_Name_Label);
        New_Patient_Name_Label.setBounds(20, 60, 140, 20);

        New_Patient_LastName_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_LastName_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Patient_LastName_Label.setText("ΕΠΩΝΥΜΟ");
        New_Patient_LastName_Label.setFocusable(false);
        New_Patient_Panel.add(New_Patient_LastName_Label);
        New_Patient_LastName_Label.setBounds(180, 60, 150, 20);

        New_Patient_Telephone_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_Telephone_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Patient_Telephone_Label.setText("ΤΗΛΕΦΩΝΟ");
        New_Patient_Telephone_Label.setFocusable(false);
        New_Patient_Panel.add(New_Patient_Telephone_Label);
        New_Patient_Telephone_Label.setBounds(350, 60, 150, 20);

        New_Patient_AFM_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_AFM_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Patient_AFM_Label.setText("Α.Φ.Μ.");
        New_Patient_AFM_Label.setFocusable(false);
        New_Patient_Panel.add(New_Patient_AFM_Label);
        New_Patient_AFM_Label.setBounds(20, 130, 140, 20);

        New_Patient_ID_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_ID_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Patient_ID_Label.setText("ΑΡ. ΤΑΥΤΟΤΗΤΑΣ");
        New_Patient_ID_Label.setFocusable(false);
        New_Patient_Panel.add(New_Patient_ID_Label);
        New_Patient_ID_Label.setBounds(182, 130, 150, 20);

        New_Patient_AMKA_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_AMKA_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Patient_AMKA_Label.setText("Α.Μ.Κ.Α.");
        New_Patient_AMKA_Label.setFocusable(false);
        New_Patient_Panel.add(New_Patient_AMKA_Label);
        New_Patient_AMKA_Label.setBounds(350, 130, 150, 20);

        New_Patient_Gender_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_Gender_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Patient_Gender_Label.setText("ΦΥΛΟ");
        New_Patient_Gender_Label.setFocusable(false);
        New_Patient_Panel.add(New_Patient_Gender_Label);
        New_Patient_Gender_Label.setBounds(20, 200, 140, 20);

        New_Patient_Age_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_Age_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Patient_Age_Label.setText("ΗΛΙΚΙΑ");
        New_Patient_Age_Label.setFocusable(false);
        New_Patient_Panel.add(New_Patient_Age_Label);
        New_Patient_Age_Label.setBounds(182, 200, 150, 20);

        New_Patient_RoomDoctor_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_RoomDoctor_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Patient_RoomDoctor_Label.setText("ΔΩΜΑΤΙΟ");
        New_Patient_RoomDoctor_Label.setFocusable(false);
        New_Patient_Panel.add(New_Patient_RoomDoctor_Label);
        New_Patient_RoomDoctor_Label.setBounds(350, 200, 150, 20);

        New_Patient_Description_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_Description_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Patient_Description_Label.setText("ΛΟΓΟΣ ΕΙΣΑΓΩΓΗΣ ΑΣΘΕΝΗ");
        New_Patient_Description_Label.setFocusable(false);
        New_Patient_Panel.add(New_Patient_Description_Label);
        New_Patient_Description_Label.setBounds(20, 270, 270, 20);

        New_Patient_Name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Patient_Name.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        New_Patient_Panel.add(New_Patient_Name);
        New_Patient_Name.setBounds(15, 80, 150, 40);

        New_Patient_LastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_LastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Patient_LastName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        New_Patient_Panel.add(New_Patient_LastName);
        New_Patient_LastName.setBounds(182, 80, 150, 40);

        New_Patient_Telephone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_Telephone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Patient_Telephone.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        New_Patient_Panel.add(New_Patient_Telephone);
        New_Patient_Telephone.setBounds(350, 80, 150, 40);

        New_Patient_AFM.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_AFM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Patient_AFM.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        New_Patient_Panel.add(New_Patient_AFM);
        New_Patient_AFM.setBounds(15, 150, 150, 40);

        New_Patient_ID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Patient_ID.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        New_Patient_Panel.add(New_Patient_ID);
        New_Patient_ID.setBounds(182, 150, 150, 40);

        New_Patient_AMKA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_AMKA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Patient_AMKA.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        New_Patient_Panel.add(New_Patient_AMKA);
        New_Patient_AMKA.setBounds(350, 150, 150, 40);

        New_Patient_Gender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Άνδρας", "Γυναίκα" }));
        New_Patient_Gender.setSelectedIndex(-1);
        New_Patient_Gender.setSelectedItem(null);
        New_Patient_Gender.setFocusable(false);
        New_Patient_Panel.add(New_Patient_Gender);
        New_Patient_Gender.setBounds(15, 220, 150, 40);

        New_Patient_Age.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_Age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Patient_Age.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        New_Patient_Panel.add(New_Patient_Age);
        New_Patient_Age.setBounds(182, 220, 150, 40);

        New_Patient_Room.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Patient_Room.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Patient_Room.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        New_Patient_Panel.add(New_Patient_Room);
        New_Patient_Room.setBounds(350, 220, 150, 40);

        New_Patient_Reason.setColumns(20);
        New_Patient_Reason.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        New_Patient_Reason.setLineWrap(true);
        New_Patient_Reason.setRows(5);
        New_Patient_Reason.setWrapStyleWord(true);
        New_Patient_Description_Scroll.setViewportView(New_Patient_Reason);

        New_Patient_Panel.add(New_Patient_Description_Scroll);
        New_Patient_Description_Scroll.setBounds(14, 290, 280, 80);

        AutoCompleteDecorator.decorate(Apointment_Doctor_Box);
        Apointment_Doctor_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Apointment_Doctor_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        New_Patient_Panel.add(Apointment_Doctor_Box);
        Apointment_Doctor_Box.setBounds(350, 220, 150, 40);

        Appointment_Year_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Appointment_Year_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Appointment_Year_Label.setText("Ημερομηνία");
        Appointment_Year_Label.setFocusable(false);
        New_Patient_Panel.add(Appointment_Year_Label);
        Appointment_Year_Label.setBounds(300, 290, 200, 20);

        Appointment_Hour_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Appointment_Hour_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Appointment_Hour_Label.setText("Ώρα");
        Appointment_Hour_Label.setFocusable(false);
        New_Patient_Panel.add(Appointment_Hour_Label);
        Appointment_Hour_Label.setBounds(365, 350, 100, 20);

        Appointment_Year_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Appointment_Year_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Appointment_Year_List.setFocusable(false);
        Appointment_Year_List.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Appointment_Year_ListPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        New_Patient_Panel.add(Appointment_Year_List);
        Appointment_Year_List.setBounds(322, 310, 70, 30);

        Appointment_Month_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Appointment_Month_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Appointment_Month_List.setFocusable(false);
        Appointment_Month_List.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Appointment_Month_ListPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        New_Patient_Panel.add(Appointment_Month_List);
        Appointment_Month_List.setBounds(390, 310, 50, 30);

        Appointment_Day_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Appointment_Day_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Appointment_Day_List.setFocusable(false);
        Appointment_Day_List.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Appointment_Day_ListPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        New_Patient_Panel.add(Appointment_Day_List);
        Appointment_Day_List.setBounds(439, 310, 50, 30);

        Appointment_Hour_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Appointment_Hour_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Appointment_Hour_List.setFocusable(false);
        New_Patient_Panel.add(Appointment_Hour_List);
        Appointment_Hour_List.setBounds(366, 370, 50, 30);

        Appointment_Minute_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Appointment_Minute_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Appointment_Minute_List.setFocusable(false);
        New_Patient_Panel.add(Appointment_Minute_List);
        Appointment_Minute_List.setBounds(415, 370, 50, 30);

        New_Insert_fail.setVisible(false);
        New_Insert_fail.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        New_Insert_fail.setForeground(new java.awt.Color(255, 0, 0));
        New_Insert_fail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Insert_fail.setText("ΑΝΕΠΙΤΥΧΗΣ ΕΙΣΑΓΩΓΗ");
        New_Patient_Panel.add(New_Insert_fail);
        New_Insert_fail.setBounds(330, 408, 160, 20);

        Panel1.add(New_Patient_Panel, "New_Patient_Panel");

        MainPanel.add(Panel1, "Panel1");

        Panel2.setLayout(null);

        Select_CheckOut_Patient_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Select_CheckOut_Patient_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Select_CheckOut_Patient_Label.setText("ΕΠΕΛΕΞΕ ΑΣΘΕΝΗ ΓΙΑ ΕΞΙΤΗΡΙΟ");
        Panel2.add(Select_CheckOut_Patient_Label);
        Select_CheckOut_Patient_Label.setBounds(110, 60, 290, 40);

        CheckOut_Patient_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CheckOut_Patient_Box.setFocusable(false);
        CheckOut_Patient_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                CheckOut_Patient_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Panel2.add(CheckOut_Patient_Box);
        CheckOut_Patient_Box.setBounds(110, 100, 290, 40);

        Confirm_CheckOut_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Confirm_CheckOut_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Confirm_CheckOut_Button.setText("ΕΠΙΒΕΒΑΙΩΣΗ");
        Confirm_CheckOut_Button.setEnabled(false);
        Confirm_CheckOut_Button.setFocusPainted(false);
        Confirm_CheckOut_Button.setFocusable(false);
        Confirm_CheckOut_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Confirm_CheckOut_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_CheckOut_ButtonActionPerformed(evt);
            }
        });
        Panel2.add(Confirm_CheckOut_Button);
        Confirm_CheckOut_Button.setBounds(190, 330, 140, 40);

        Patient_Cost_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Cost_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Cost_Label.setText("Κόστος Περίθαλψης:");
        Patient_Cost_Label.setFocusable(false);
        Panel2.add(Patient_Cost_Label);
        Patient_Cost_Label.setBounds(100, 170, 140, 20);

        Patient_Cost.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
        Patient_Cost.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Cost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patient_Cost.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Patient_Cost.setFocusable(false);
        Panel2.add(Patient_Cost);
        Patient_Cost.setBounds(100, 190, 140, 30);

        Cost_Euro_Label.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Cost_Euro_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cost_Euro_Label.setText("€");
        Cost_Euro_Label.setFocusable(false);
        Panel2.add(Cost_Euro_Label);
        Cost_Euro_Label.setBounds(240, 190, 20, 30);

        Patient_Payment_Method_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Patient_Payment_Method_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patient_Payment_Method_Label.setText("Τρόπος Πληρωμής:");
        Patient_Payment_Method_Label.setFocusable(false);
        Panel2.add(Patient_Payment_Method_Label);
        Patient_Payment_Method_Label.setBounds(280, 200, 140, 20);

        Payment_Type_Box.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Payment_Type_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Μετρητά", "Πιστωτική Κάρτα", "Τραπεζική Μεταφορά" }));
        Payment_Type_Box.setSelectedIndex(-1);
        Payment_Type_Box.setSelectedItem(null);
        Payment_Type_Box.setEnabled(false);
        Payment_Type_Box.setFocusable(false);
        Payment_Type_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Payment_Type_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Panel2.add(Payment_Type_Box);
        Payment_Type_Box.setBounds(280, 220, 140, 30);

        Medicine_Cost.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
        Medicine_Cost.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Medicine_Cost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Medicine_Cost.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Medicine_Cost.setFocusable(false);
        Panel2.add(Medicine_Cost);
        Medicine_Cost.setBounds(100, 250, 140, 30);

        Medicine_Cost_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Medicine_Cost_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Medicine_Cost_Label.setText("Κόστος Φαρμάκων:");
        Medicine_Cost_Label.setFocusable(false);
        Panel2.add(Medicine_Cost_Label);
        Medicine_Cost_Label.setBounds(100, 230, 140, 20);

        Medicine_Cost_Euro_Label.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Medicine_Cost_Euro_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Medicine_Cost_Euro_Label.setText("€");
        Medicine_Cost_Euro_Label.setFocusable(false);
        Panel2.add(Medicine_Cost_Euro_Label);
        Medicine_Cost_Euro_Label.setBounds(240, 250, 20, 30);

        MainPanel.add(Panel2, "Panel2");

        Panel3.setLayout(null);

        Worker_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Label.setText("Εργαζόμενος :");
        Worker_Label.setFocusable(false);
        Panel3.add(Worker_Label);
        Worker_Label.setBounds(15, 30, 100, 40);

        Reset_Worker_Password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Reset_Worker_Password.setText("ΕΠΑΝΑΦΟΡΑ");
        Reset_Worker_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reset_Worker_Password.setEnabled(false);
        Reset_Worker_Password.setFocusPainted(false);
        Reset_Worker_Password.setFocusable(false);
        Panel3.add(Reset_Worker_Password);
        Reset_Worker_Password.setBounds(210, 180, 100, 23);

        Worker_Type_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Type_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Type_Box.setFocusable(false);
        Worker_Type_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Worker_Type_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Panel3.add(Worker_Type_Box);
        Worker_Type_Box.setBounds(110, 30, 110, 40);

        AutoCompleteDecorator.decorate(Worker_Name_Box);
        Worker_Name_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Name_Box.setEnabled(false);
        Worker_Name_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Worker_Name_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Panel3.add(Worker_Name_Box);
        Worker_Name_Box.setBounds(230, 30, 270, 40);

        Worker_Username.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Worker_Username.setEnabled(false);
        Panel3.add(Worker_Username);
        Worker_Username.setBounds(20, 140, 150, 40);

        Worker_Password.setEditable(false);
        Worker_Password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel3.add(Worker_Password);
        Worker_Password.setBounds(185, 140, 150, 40);

        Worker_Email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Worker_Email.setEnabled(false);
        Panel3.add(Worker_Email);
        Worker_Email.setBounds(350, 140, 150, 40);

        Worker_Name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Worker_Name.setEnabled(false);
        Panel3.add(Worker_Name);
        Worker_Name.setBounds(20, 240, 150, 40);

        Worker_Lastname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Worker_Lastname.setEnabled(false);
        Panel3.add(Worker_Lastname);
        Worker_Lastname.setBounds(185, 240, 150, 40);

        Worker_Birth_Year.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Birth_Year.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Birth_Year.setEnabled(false);
        Worker_Birth_Year.setFocusable(false);
        Worker_Birth_Year.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Worker_Birth_YearPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Panel3.add(Worker_Birth_Year);
        Worker_Birth_Year.setBounds(350, 240, 60, 40);

        Worker_Birth_Month.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Birth_Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Worker_Birth_Month.setSelectedItem(null);
        Worker_Birth_Month.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Birth_Month.setEnabled(false);
        Worker_Birth_Month.setFocusable(false);
        Worker_Birth_Month.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Worker_Birth_MonthPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Panel3.add(Worker_Birth_Month);
        Worker_Birth_Month.setBounds(409, 240, 45, 40);

        Worker_Birth_Day.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Birth_Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Worker_Birth_Day.setSelectedItem(null);
        Worker_Birth_Day.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Birth_Day.setEnabled(false);
        Worker_Birth_Day.setFocusable(false);
        Panel3.add(Worker_Birth_Day);
        Worker_Birth_Day.setBounds(453, 240, 45, 40);

        Worker_Username_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Username_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Username_Label.setText("ΟΝΟΜΑ ΧΡΗΣΤΗ");
        Worker_Username_Label.setFocusable(false);
        Panel3.add(Worker_Username_Label);
        Worker_Username_Label.setBounds(20, 120, 150, 20);

        Worker_Password_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Password_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Password_Label.setText("ΚΩΔΙΚΟΣ ΧΡΗΣΤΗ");
        Worker_Password_Label.setFocusable(false);
        Panel3.add(Worker_Password_Label);
        Worker_Password_Label.setBounds(185, 120, 150, 20);

        Worker_Email_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Email_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Email_Label.setText("E-Mail");
        Worker_Email_Label.setFocusable(false);
        Panel3.add(Worker_Email_Label);
        Worker_Email_Label.setBounds(350, 120, 150, 20);

        Worker_Name_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Name_Label.setText("ΟΝΟΜΑ");
        Worker_Name_Label.setFocusable(false);
        Panel3.add(Worker_Name_Label);
        Worker_Name_Label.setBounds(20, 220, 150, 20);

        Worker_LastName_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_LastName_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_LastName_Label.setText("ΕΠΩΝΥΜΟ");
        Worker_LastName_Label.setFocusable(false);
        Panel3.add(Worker_LastName_Label);
        Worker_LastName_Label.setBounds(185, 220, 150, 20);

        Worker_Birthday_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Birthday_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Birthday_Label.setText("ΗΜ/ΝΙΑ ΓΕΝΝΗΣΗΣ");
        Worker_Birthday_Label.setFocusable(false);
        Panel3.add(Worker_Birthday_Label);
        Worker_Birthday_Label.setBounds(350, 220, 150, 20);

        Worker_Update_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Update_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Worker_Update_Button.setText("ΕΝΗΜΕΡΩΣΗ");
        Worker_Update_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Update_Button.setEnabled(false);
        Worker_Update_Button.setFocusPainted(false);
        Worker_Update_Button.setFocusable(false);
        Worker_Update_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Worker_Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Worker_Update_ButtonActionPerformed(evt);
            }
        });
        Panel3.add(Worker_Update_Button);
        Worker_Update_Button.setBounds(100, 360, 150, 40);

        Worker_Delete_Button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Worker_Delete_Button.setForeground(new java.awt.Color(255, 51, 51));
        Worker_Delete_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Delete_Icon.png"))); // NOI18N
        Worker_Delete_Button.setText("ΔΙΑΓΡΑΦΗ ");
        Worker_Delete_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Delete_Button.setEnabled(false);
        Worker_Delete_Button.setFocusPainted(false);
        Worker_Delete_Button.setFocusable(false);
        Worker_Delete_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Worker_Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Worker_Delete_ButtonActionPerformed(evt);
            }
        });
        Panel3.add(Worker_Delete_Button);
        Worker_Delete_Button.setBounds(370, 370, 120, 30);

        Worker_Success.setVisible(false);
        Worker_Success.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Worker_Success.setForeground(new java.awt.Color(0, 204, 0));
        Worker_Success.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Success.setText("ΕΠΙΤΥΧΗΣ ΕΝΗΜΕΡΩΣΗ");
        Worker_Success.setFocusable(false);
        Panel3.add(Worker_Success);
        Worker_Success.setBounds(80, 320, 190, 30);

        Worker_Fail.setVisible(false);
        Worker_Fail.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Worker_Fail.setForeground(new java.awt.Color(255, 0, 51));
        Worker_Fail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Fail.setText("ΕΛΕΓΞΤΕ ΤΑ ΣΤΟΙΧΕΙΑ");
        Worker_Fail.setFocusable(false);
        Panel3.add(Worker_Fail);
        Worker_Fail.setBounds(80, 320, 190, 30);

        Delete_Success.setVisible(false);
        Delete_Success.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Delete_Success.setForeground(new java.awt.Color(0, 204, 0));
        Delete_Success.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Delete_Success.setText("ΕΠΙΤΥΧΗΣ ΔΙΑΓΡΑΦΗ");
        Delete_Success.setFocusable(false);
        Panel3.add(Delete_Success);
        Delete_Success.setBounds(350, 340, 160, 30);

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

        AutoCompleteDecorator.decorate(Rec_Name_Box);
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

        Message_Text.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
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
        Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Patient_Icon.png"))); // NOI18N
        Button1.setText("Στοιχεία Ασθενών");
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
        Button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Check-Out_Icon.png"))); // NOI18N
        Button2.setText("Εξιτήρια Ασθενών");
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
        Button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Worker_Icon.png"))); // NOI18N
        Button3.setText("Στοιχεία Εργαζόμενων");
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
        Button4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
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
    int hour_selected=0;
    String chosen_receiver=null;
    String chosen_patient_amka=null;
    String chosen_worker=null;
    String checkout_patient=null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Account_Update_Button;
    private javax.swing.JTextField Adress;
    private javax.swing.JLabel Adress_Label;
    private javax.swing.JComboBox<String> Apointment_Doctor_Box;
    private javax.swing.JCheckBox Appointment_Check;
    private javax.swing.JComboBox<String> Appointment_Day_List;
    private javax.swing.JLabel Appointment_Hour_Label;
    private javax.swing.JComboBox<String> Appointment_Hour_List;
    private javax.swing.JComboBox<String> Appointment_Minute_List;
    private javax.swing.JComboBox<String> Appointment_Month_List;
    private javax.swing.JLabel Appointment_Year_Label;
    private javax.swing.JComboBox<String> Appointment_Year_List;
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
    private javax.swing.JButton Cancel_New_Patient_Button;
    private javax.swing.JComboBox<String> CheckOut_Patient_Box;
    private javax.swing.JButton Confirm_CheckOut_Button;
    private javax.swing.JLabel Cost_Euro_Label;
    private javax.swing.JLabel Delete_Success;
    private javax.swing.JLabel Edit_Information_Label;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Email_Label;
    private javax.swing.JList<String> Incoming_List;
    private javax.swing.JPanel Incoming_Panel;
    private javax.swing.JScrollPane Incoming_Scroll;
    private javax.swing.JButton Insert_New_Patient_Button;
    private javax.swing.JLabel Insert_Patient_Data_Label;
    private javax.swing.JLabel Insert_Success;
    private javax.swing.JLabel Insert_fail;
    private javax.swing.JTextField LastName;
    private javax.swing.JLabel LastName_Label;
    private javax.swing.JButton Logout_Button;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Main_Messages;
    private javax.swing.JPanel Main_Patient_Panel;
    private javax.swing.JPanel Main_Schedule_Panel;
    private javax.swing.JTextField Medicine_Cost;
    private javax.swing.JLabel Medicine_Cost_Euro_Label;
    private javax.swing.JLabel Medicine_Cost_Label;
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
    private javax.swing.JLabel New_Insert_fail;
    private javax.swing.JPanel New_Message;
    private javax.swing.JButton New_Message_Button;
    private javax.swing.JTextField New_Patient_AFM;
    private javax.swing.JLabel New_Patient_AFM_Label;
    private javax.swing.JTextField New_Patient_AMKA;
    private javax.swing.JLabel New_Patient_AMKA_Label;
    private javax.swing.JTextField New_Patient_Age;
    private javax.swing.JLabel New_Patient_Age_Label;
    private javax.swing.JButton New_Patient_Button;
    private javax.swing.JLabel New_Patient_Description_Label;
    private javax.swing.JScrollPane New_Patient_Description_Scroll;
    private javax.swing.JComboBox<String> New_Patient_Gender;
    private javax.swing.JLabel New_Patient_Gender_Label;
    private javax.swing.JTextField New_Patient_ID;
    private javax.swing.JLabel New_Patient_ID_Label;
    private javax.swing.JTextField New_Patient_LastName;
    private javax.swing.JLabel New_Patient_LastName_Label;
    private javax.swing.JTextField New_Patient_Name;
    private javax.swing.JLabel New_Patient_Name_Label;
    private javax.swing.JPanel New_Patient_Panel;
    private javax.swing.JTextArea New_Patient_Reason;
    private javax.swing.JTextField New_Patient_Room;
    private javax.swing.JLabel New_Patient_RoomDoctor_Label;
    private javax.swing.JTextField New_Patient_Telephone;
    private javax.swing.JLabel New_Patient_Telephone_Label;
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
    private javax.swing.JTextField Patient_AFM;
    private javax.swing.JLabel Patient_AFM_Label;
    private javax.swing.JTextField Patient_AMKA;
    private javax.swing.JLabel Patient_AMKA_Label;
    private javax.swing.JTextField Patient_Age;
    private javax.swing.JLabel Patient_Age_Label;
    private javax.swing.JTextField Patient_Cost;
    private javax.swing.JLabel Patient_Cost_Label;
    private javax.swing.JLabel Patient_Description_Label;
    private javax.swing.JScrollPane Patient_Description_Scroll;
    private javax.swing.JComboBox<String> Patient_Gender;
    private javax.swing.JLabel Patient_Gender_Label;
    private javax.swing.JTextField Patient_ID;
    private javax.swing.JLabel Patient_ID_Label;
    private javax.swing.JTextField Patient_LastName;
    private javax.swing.JLabel Patient_LastName_Label;
    private javax.swing.JTextField Patient_Name;
    private javax.swing.JLabel Patient_Name_Label;
    private javax.swing.JLabel Patient_Payment_Method_Label;
    private javax.swing.JTextArea Patient_Reason;
    private javax.swing.JTextField Patient_Room;
    private javax.swing.JLabel Patient_Room_Label;
    private javax.swing.JTextField Patient_Telephone;
    private javax.swing.JLabel Patient_Telephone_Label;
    private javax.swing.JButton Patient_Update_Button;
    private javax.swing.JComboBox<String> Payment_Type_Box;
    private javax.swing.JComboBox<String> Rec_Name_Box;
    private javax.swing.JComboBox<String> Rec_Type_Box;
    private javax.swing.JLabel Recepient;
    private javax.swing.JButton Refresh_Button;
    private javax.swing.JCheckBox Reset_Worker_Password;
    private javax.swing.JButton Return_Button_Message_Expanded;
    private javax.swing.JButton Return_Button_Schedule;
    private javax.swing.JList<String> Schedule_Expanded_List;
    private javax.swing.JPanel Schedule_Expanded_Panel;
    private javax.swing.JScrollPane Schedule_Expanded_Scroll;
    private javax.swing.JLabel Schedule_Label;
    private javax.swing.JList<String> Schedule_List;
    private javax.swing.JScrollPane Schedule_List_Scroll;
    private javax.swing.JLabel Select_CheckOut_Patient_Label;
    private javax.swing.JLabel Select_Patient;
    private javax.swing.JButton Send_Button;
    private javax.swing.JSeparator SeparatorHorTop;
    private javax.swing.JSeparator SeperatorHorBot;
    private javax.swing.JSeparator SeperatorVerLef;
    private javax.swing.JSeparator SeperatorVerRig;
    private javax.swing.JTextField Start_Date;
    private javax.swing.JLabel Start_Date_Label;
    private javax.swing.JTextField Tel_0;
    private javax.swing.JTextField Tel_1;
    private javax.swing.JLabel Tel_Label;
    private javax.swing.JComboBox<String> Treat_Patient_Box;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel Username_Label;
    private javax.swing.JComboBox<String> Worker_Birth_Day;
    private javax.swing.JComboBox<String> Worker_Birth_Month;
    private javax.swing.JComboBox<String> Worker_Birth_Year;
    private javax.swing.JLabel Worker_Birthday_Label;
    private javax.swing.JButton Worker_Delete_Button;
    private javax.swing.JTextField Worker_Email;
    private javax.swing.JLabel Worker_Email_Label;
    private javax.swing.JLabel Worker_Fail;
    private javax.swing.JLabel Worker_Label;
    private javax.swing.JLabel Worker_LastName_Label;
    private javax.swing.JTextField Worker_Lastname;
    private javax.swing.JTextField Worker_Name;
    private javax.swing.JComboBox<String> Worker_Name_Box;
    private javax.swing.JLabel Worker_Name_Label;
    private javax.swing.JPasswordField Worker_Password;
    private javax.swing.JLabel Worker_Password_Label;
    private javax.swing.JLabel Worker_Success;
    private javax.swing.JComboBox<String> Worker_Type_Box;
    private javax.swing.JButton Worker_Update_Button;
    private javax.swing.JTextField Worker_Username;
    private javax.swing.JLabel Worker_Username_Label;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Home Page">
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
        if(Button0.isSelected()) Load_Schedule();
        Check_Button(Button0);
    }//GEN-LAST:event_Button0ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        if(Button1.isSelected()) Load_Treat_Patient_Box();
        Check_Button(Button1);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        if(Button2.isSelected()) Load_CheckOut_Patient_Box();
        Check_Button(Button2);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        Check_Button(Button3);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        Check_Button(Button4);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        if(Button5.isSelected()) {
            Load_Incoming_Messages();
            Load_Outgoing_Messages();
        }
        Check_Button(Button5);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        if(Button6.isSelected()) Load_Account();
        Check_Button(Button6);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Logout_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_ButtonActionPerformed
        LoginScreen l = new LoginScreen(conn);
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Logout_ButtonActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel0">
    private void Load_Schedule(){
        Calendar cal = Calendar.getInstance();
        java.util.Date today = new java.util.Date();
        cal.setTime(today);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour=0;
        Schedule_Label.setText("ΠΡΟΓΡΑΜΜΑ ΗΜΕΡΑΣ : "+year+"-"+month+"-"+day);
        DefaultListModel model = new DefaultListModel();
        ArrayList schedule = new ArrayList();
        try{
            String query = "select count(AMKA) as count,check_time from patient_treatment where check_out='1' and treated='1'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                String[] time=rs.getString("check_time").split(":");
                hour=Integer.parseInt(time[0]);
                for(int i=0;i<24;i++) {
                    if(i==hour && rs.getInt("count")==1) schedule.add("Στις "+i+":00-"+(i+1)+":00 ζητήθηκε "+rs.getString("count")+" εξιτήριο.");
                    else if(i==hour) schedule.add("Στις "+i+":00-"+(i+1)+":00 ζητήθηκαν "+rs.getString("count")+" εξιτήρια.");
                }
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        for(int i=0;i<schedule.size();i++) {
            
            model.addElement(schedule.get(i));
        }
        Schedule_List.setModel(model);
    }
    
    private void Load_Schedule_Expanded() {
        ArrayList patients = new ArrayList();
        try{
            String query = "select patient_name,patient_lastname,patient.AMKA,check_time from patient inner join patient_treatment on patient.AMKA=patient_treatment.AMKA where check_out='1' and treated='1'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                String[] time=rs.getString("check_time").split(":");
                int hour=Integer.parseInt(time[0]);
                if(hour==hour_selected) patients.add(rs.getString("patient_name")+" "+rs.getString("patient_lastname")+" | "+rs.getString("patient.AMKA")+" | στις: "+rs.getString("check_time"));
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        Schedule_Expanded_List.setModel(new DefaultComboBoxModel(patients.toArray()));
    }
    
    private void Schedule_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schedule_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2 && Schedule_List.getSelectedIndex() != -1) {
            CardLayout card = (CardLayout)Panel0.getLayout();
            card.show(Panel0, "Schedule_Expanded_Panel");
            String[] time=Schedule_List.getSelectedValue().split(" |:");
            hour_selected=Integer.parseInt(time[1]);
            Load_Schedule_Expanded();
        }
    }//GEN-LAST:event_Schedule_ListMouseReleased

    
    private void Return_Button_ScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_Button_ScheduleActionPerformed
        CardLayout card = (CardLayout)Panel0.getLayout();
        card.show(Panel0, "Main_Schedule_Panel");
    }//GEN-LAST:event_Return_Button_ScheduleActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel1">
    private void Load_Treat_Patient_Box(){
        String[] patient=new String[2];
        ArrayList patients = new ArrayList();
        patients.add(null);
        try{
            String query = "select patient_name,patient_lastname,AMKA from patient order by patient_name ASC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                patients.add(rs.getString("patient_name")+" "+rs.getString("patient_lastname")+" | "+rs.getString("AMKA"));
                if(chosen_patient_amka!=null && chosen_patient_amka.equals(rs.getString("AMKA"))) {
                    patient[0]=rs.getString("patient_name")+" "+rs.getString("patient_lastname");
                    patient[1]=chosen_patient_amka;
                }
            }
            rs.close();
            stmt.close();
            }catch(Exception e){System.out.println(e.getMessage());};
        Treat_Patient_Box.setModel(new DefaultComboBoxModel(patients.toArray()));
        if(chosen_patient_amka!=null) Treat_Patient_Box.setSelectedItem(patient[0]+" | "+patient[1]);
        
    }
    
    private void Load_Patient() {
        try{
            String query = "select* from patient where AMKA='"+chosen_patient_amka+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Patient_Name.setText(rs.getString("patient_name"));
                Patient_LastName.setText(rs.getString("patient_lastname"));
                Patient_Telephone.setText(rs.getString("tel"));
                Patient_AFM.setText(rs.getString("AFM"));
                Patient_ID.setText(rs.getString("ID_NUM"));
                Patient_AMKA.setText(rs.getString("AMKA"));
                Patient_Gender.setSelectedItem(rs.getString("gender"));
                Patient_Age.setText(rs.getString("age"));
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        try{
            String query = "select room from patient_room where AMKA='"+chosen_patient_amka+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()==false) Patient_Room.setText(null);
            else Patient_Room.setText(rs.getString("room"));
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        try{
            String query = "select reason from patient_treatment where AMKA='"+chosen_patient_amka+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()==false) Patient_Reason.setText(null);
            else Patient_Reason.setText(rs.getString("reason"));
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
    }
    
    private void Treat_Patient_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Treat_Patient_BoxPopupMenuWillBecomeInvisible
        Insert_Success.setVisible(false);
        Insert_fail.setVisible(false);
        if(Treat_Patient_Box.getSelectedItem()==null){
            Patient_Name.setEnabled(false);
            Patient_LastName.setEnabled(false);
            Patient_Telephone.setEnabled(false);
            Patient_AFM.setEnabled(false);
            Patient_ID.setEnabled(false);
            Patient_AMKA.setEnabled(false);
            Patient_Gender.setEnabled(false);
            Patient_Age.setEnabled(false);
            Patient_Room.setEnabled(false);
            Patient_Reason.setEnabled(false);
            Patient_Name.setText(null);
            Patient_LastName.setText(null);
            Patient_Telephone.setText(null);
            Patient_AFM.setText(null);
            Patient_ID.setText(null);
            Patient_AMKA.setText(null);
            Patient_Gender.setSelectedItem(null);
            Patient_Gender.setSelectedIndex(-1);
            Patient_Age.setText(null);
            Patient_Room.setText(null);
            Patient_Reason.setText(null);
            Patient_Reason.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
            Patient_Update_Button.setEnabled(false);
            chosen_patient_amka=null;
        }
        else{
            Patient_Name.setEnabled(true);
            Patient_LastName.setEnabled(true);
            Patient_Telephone.setEnabled(true);
            Patient_AFM.setEnabled(true);
            Patient_ID.setEnabled(true);
            Patient_AMKA.setEnabled(true);
            Patient_Gender.setEnabled(true);
            Patient_Age.setEnabled(true);
            Patient_Room.setEnabled(true);
            Patient_Reason.setEnabled(true);
            Patient_Name.setText(null);
            Patient_LastName.setText(null);
            Patient_Telephone.setText(null);
            Patient_AFM.setText(null);
            Patient_ID.setText(null);
            Patient_AMKA.setText(null);
            Patient_Gender.setSelectedItem(null);
            Patient_Gender.setSelectedIndex(-1);
            Patient_Age.setText(null);
            Patient_Room.setText(null);
            Patient_Reason.setText(null);
            Patient_Reason.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.background"));
            Patient_Update_Button.setEnabled(true);
            String[] patient_selected = (String.valueOf(Treat_Patient_Box.getSelectedItem())).split(" \\| ");
            chosen_patient_amka=patient_selected[1];
            Load_Patient();
        }
    }//GEN-LAST:event_Treat_Patient_BoxPopupMenuWillBecomeInvisible

    private void Patient_Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Patient_Update_ButtonActionPerformed
        Insert_Success.setVisible(false);
        Insert_fail.setVisible(false);
        try{
            String query = "update patient set patient_name=?,patient_lastname=?,tel=?,AFM=?,ID_NUM=?,AMKA=?,gender=?,age=? where AMKA='"+chosen_patient_amka+"'";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,Patient_Name.getText());
            pstmt.setString(2,Patient_LastName.getText());
            pstmt.setString(3,Patient_Telephone.getText());
            pstmt.setString(4,Patient_AFM.getText());
            pstmt.setString(5,Patient_ID.getText());
            pstmt.setString(6,Patient_AMKA.getText());
            pstmt.setString(7,(String)Patient_Gender.getSelectedItem());
            pstmt.setString(8,Patient_Age.getText());
            pstmt.executeUpdate();
            pstmt.close();
            Load_Treat_Patient_Box();
            chosen_patient_amka=Patient_AMKA.getText();
            Load_Patient();
            Insert_Success.setVisible(true);
        }catch(Exception e){Insert_fail.setVisible(true); System.out.println(e.getMessage());};
    }//GEN-LAST:event_Patient_Update_ButtonActionPerformed
    
    private void Cancel_New_Patient_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_New_Patient_ButtonActionPerformed
        CardLayout card = (CardLayout)Panel1.getLayout();
        card.show(Panel1, "Main_Patient_Panel");
    }//GEN-LAST:event_Cancel_New_Patient_ButtonActionPerformed

    private void New_Patient_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_Patient_ButtonActionPerformed
        Insert_Success.setVisible(false);
        Insert_fail.setVisible(false);
        New_Insert_fail.setVisible(false);
        New_Patient_Name.setText(null);
        New_Patient_LastName.setText(null);
        New_Patient_Telephone.setText(null);
        New_Patient_AFM.setText(null);
        New_Patient_ID.setText(null);
        New_Patient_AMKA.setText(null);
        New_Patient_Gender.setSelectedItem(null);
        New_Patient_Gender.setSelectedIndex(-1);
        New_Patient_Age.setText(null);
        New_Patient_Room.setText(null);
        New_Patient_Reason.setText(null);
        CardLayout card = (CardLayout)Panel1.getLayout();
        card.show(Panel1, "New_Patient_Panel");
        Appointment_Check.setSelected(false);
        New_Patient_Room.setVisible(true);
        New_Patient_RoomDoctor_Label.setText("ΔΩΜΑΤΙΟ");
        Apointment_Doctor_Box.setVisible(false);
        Appointment_Year_List.setEnabled(false);
        Appointment_Month_List.setEnabled(false);
        Appointment_Day_List.setEnabled(false);
        Appointment_Hour_List.setEnabled(false);
        Appointment_Minute_List.setEnabled(false);
    }//GEN-LAST:event_New_Patient_ButtonActionPerformed

    private void Insert_New_Patient_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_New_Patient_ButtonActionPerformed
        New_Insert_fail.setVisible(false);
        try{  //insert stoixeia
            String query = "insert into patient (patient_name,patient_lastname,tel,AFM,ID_NUM,AMKA,gender,age) values (?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,New_Patient_Name.getText());
            pstmt.setString(2,New_Patient_LastName.getText());
            pstmt.setString(3,New_Patient_Telephone.getText());
            pstmt.setString(4,New_Patient_AFM.getText());
            pstmt.setString(5,New_Patient_ID.getText());
            pstmt.setString(6,New_Patient_AMKA.getText());
            pstmt.setString(7,(String)New_Patient_Gender.getSelectedItem());
            pstmt.setString(8,New_Patient_Age.getText());
            pstmt.executeUpdate();
            pstmt.close();
            query = "insert into patient_treatment (AMKA,reason) values (?,?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1,New_Patient_AMKA.getText());
            pstmt.setString(2,New_Patient_Reason.getText());
            pstmt.executeUpdate();
            pstmt.close();
        if(!Appointment_Check.isSelected()){
            query = "insert into patient_room (AMKA,room) values (?,?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1,New_Patient_AMKA.getText());
            pstmt.setString(2,New_Patient_Room.getText());
            pstmt.executeUpdate();
            pstmt.close();
        }else{
            query = "insert into patient_appointment (AMKA,doc_user,date,time) values (?,?,?,?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1,New_Patient_AMKA.getText());
            if(Apointment_Doctor_Box.getSelectedItem()!=null){
                String[] doc=String.valueOf(Apointment_Doctor_Box.getSelectedItem()).split(" \\| ");
                pstmt.setString(2,doc[1]);
            }
            String date=String.valueOf(Appointment_Year_List.getSelectedItem())+"-"+String.valueOf(Appointment_Month_List.getSelectedItem())+"-"+String.valueOf(Appointment_Day_List.getSelectedItem());
            String time=String.valueOf(Appointment_Hour_List.getSelectedItem())+":"+String.valueOf(Appointment_Minute_List.getSelectedItem())+":00";
            pstmt.setString(3,date);
            pstmt.setString(4,time);
            pstmt.executeUpdate();
            pstmt.close();
            query = "insert into worker_schedule (username,date,time) values (?,?,?)";
            pstmt = conn.prepareStatement(query);
            String[] doc=String.valueOf(Apointment_Doctor_Box.getSelectedItem()).split(" \\| ");
            pstmt.setString(1,doc[1]);
            pstmt.setString(2,date);
            pstmt.setString(3,time);
            pstmt.executeUpdate();
            pstmt.close();
        }
        Insert_Success.setVisible(true);
        chosen_patient_amka=New_Patient_AMKA.getText();
        Treat_Patient_Box.setSelectedItem(New_Patient_Name.getText()+" "+New_Patient_LastName.getText()+" | "+chosen_patient_amka);
        Patient_Name.setEnabled(true);
        Patient_LastName.setEnabled(true);
        Patient_Telephone.setEnabled(true);
        Patient_AFM.setEnabled(true);
        Patient_ID.setEnabled(true);
        Patient_AMKA.setEnabled(true);
        Patient_Gender.setEnabled(true);
        Patient_Age.setEnabled(true);
        Patient_Room.setEnabled(true);
        Patient_Reason.setEnabled(true);
        Patient_Reason.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.background"));
        Load_Patient();
        Load_Treat_Patient_Box();
        CardLayout card = (CardLayout)Panel1.getLayout();
        card.show(Panel1, "Main_Patient_Panel");
        }catch(SQLException e){ try{
                                System.out.println(e.getMessage());
                                New_Insert_fail.setVisible(true);
                                String query = "delete from patient where AMKA='"+New_Patient_AMKA.getText()+"'";
                                PreparedStatement pstmt = conn.prepareStatement(query);
                                pstmt.executeUpdate();
                                pstmt.close();
                             }catch(Exception e2){System.out.println(e2.getMessage());};
                             }
;
    }//GEN-LAST:event_Insert_New_Patient_ButtonActionPerformed
    
    private void Load_Apointment_Doctor_Box(){
        ArrayList doctors = new ArrayList();
        doctors.add(null);
        try{
            String query = "select username,name,lastname from users where job='Γιατρός' order by name ASC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                doctors.add(rs.getString("name")+" "+rs.getString("lastname")+" | "+rs.getString("username"));
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        Apointment_Doctor_Box.setModel(new DefaultComboBoxModel(doctors.toArray()));
    }
    
    private void Load_Appointment_Year_Month_Hours(){
        LocalDate localDate = LocalDate.now();
        ArrayList temp = new ArrayList();
        temp.add(null);
        for(int i=localDate.getYear();i<=localDate.getYear()+10;i++) temp.add(i);
        Appointment_Year_List.setModel(new DefaultComboBoxModel(temp.toArray()));
        temp.clear();
        temp.add(null);
        for(int i=1;i<=12;i++) temp.add(i);
        Appointment_Month_List.setModel(new DefaultComboBoxModel(temp.toArray()));
        temp.clear();
        temp.add(null);
        for(int i=1;i<=23;i++) temp.add(i);
        Appointment_Hour_List.setModel(new DefaultComboBoxModel(temp.toArray()));
        temp.clear();
        temp.add(null);
        for(int i=1;i<=59;i++) temp.add(i);
        Appointment_Minute_List.setModel(new DefaultComboBoxModel(temp.toArray()));
    }
    
    private void Appointment_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Appointment_CheckActionPerformed
        if(Appointment_Check.isSelected()){
            New_Patient_Room.setVisible(false);
            New_Patient_RoomDoctor_Label.setText("ΓΙΑΤΡΟΣ");
            Apointment_Doctor_Box.setVisible(true);
            Appointment_Year_List.setEnabled(true);
            Load_Apointment_Doctor_Box();
            Load_Appointment_Year_Month_Hours();
        }
        else{
            New_Patient_Room.setVisible(true);
            New_Patient_RoomDoctor_Label.setText("ΔΩΜΑΤΙΟ");
            Apointment_Doctor_Box.setVisible(false);
            Appointment_Year_List.setEnabled(false);
            Appointment_Month_List.setEnabled(false);
            Appointment_Day_List.setEnabled(false);
            Appointment_Hour_List.setEnabled(false);
            Appointment_Minute_List.setEnabled(false);
        }
        Appointment_Year_List.setSelectedItem(null);
        Appointment_Month_List.setSelectedItem(null);
        Appointment_Day_List.setSelectedItem(null);
        Appointment_Hour_List.setSelectedItem(null);
        Appointment_Minute_List.setSelectedItem(null);
    }//GEN-LAST:event_Appointment_CheckActionPerformed

    private void Appointment_Year_ListPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Appointment_Year_ListPopupMenuWillBecomeInvisible
        if(Appointment_Year_List.getSelectedItem()==null){
            Appointment_Month_List.setEnabled(false);
            Appointment_Day_List.setEnabled(false);
            Appointment_Hour_List.setEnabled(false);
            Appointment_Minute_List.setEnabled(false);
            Appointment_Month_List.setSelectedItem(null);
            Appointment_Day_List.setSelectedItem(null);
            Appointment_Hour_List.setSelectedItem(null);
            Appointment_Minute_List.setSelectedItem(null);
        }else Appointment_Month_List.setEnabled(true);
    }//GEN-LAST:event_Appointment_Year_ListPopupMenuWillBecomeInvisible

    private void Appointment_Month_ListPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Appointment_Month_ListPopupMenuWillBecomeInvisible
        if(Appointment_Month_List.getSelectedItem()==null){
            Appointment_Day_List.setEnabled(false);
            Appointment_Hour_List.setEnabled(false);
            Appointment_Minute_List.setEnabled(false);
            Appointment_Day_List.setSelectedItem(null);
            Appointment_Hour_List.setSelectedItem(null);
            Appointment_Minute_List.setSelectedItem(null);
        }else{
            ArrayList day = new ArrayList();
            day.add(null);
            Appointment_Day_List.setEnabled(true);
            int i=Integer.valueOf(String.valueOf(Appointment_Month_List.getSelectedItem()));
            int last_day=0;
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) last_day=31;
            if(i==4 || i==6 || i==9 || i==11) last_day=30;
            if(i==2) last_day=28;
            for(int j=1;j<=last_day;j++) day.add(j);
            Appointment_Day_List.setModel(new DefaultComboBoxModel(day.toArray()));
        }
    }//GEN-LAST:event_Appointment_Month_ListPopupMenuWillBecomeInvisible

    private void Appointment_Day_ListPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Appointment_Day_ListPopupMenuWillBecomeInvisible
        if(Appointment_Day_List.getSelectedItem()==null){
            Appointment_Hour_List.setEnabled(false);
            Appointment_Minute_List.setEnabled(false);
            Appointment_Hour_List.setSelectedItem(null);
            Appointment_Minute_List.setSelectedItem(null);
        }else{
            Appointment_Hour_List.setEnabled(true);
            Appointment_Minute_List.setEnabled(true);
            Appointment_Hour_List.setSelectedItem(null);
            Appointment_Minute_List.setSelectedItem(null);
        }
    }//GEN-LAST:event_Appointment_Day_ListPopupMenuWillBecomeInvisible
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel2">
    private void Schedule_Expanded_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schedule_Expanded_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2) {
            CardLayout card = (CardLayout)MainPanel.getLayout();
            card.show(MainPanel, "Panel2");
            Button2.setSelected(true);
            Button2.setEnabled(true);
            Button0.setSelected(false);
            Button0.setEnabled(false);
            Check_Button(Button2);
            String[] patient=Schedule_Expanded_List.getSelectedValue().split(" \\| ");
            checkout_patient=patient[1];
            Load_CheckOut_Patient_Box();
            Calculate_Patient_CheckOut_Cost();
        }
    }//GEN-LAST:event_Schedule_Expanded_ListMouseReleased
    
    private void Load_CheckOut_Patient_Box(){
        String[] patient=new String[2];
        ArrayList patients = new ArrayList();
        patients.add(null);
        try{
            String query = "select patient_name,patient_lastname,patient.AMKA from patient inner join patient_treatment on patient.AMKA=patient_treatment.AMKA where check_out='1' and treated='1'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                    patients.add(rs.getString("patient_name")+" "+rs.getString("patient_lastname")+" | "+rs.getString("AMKA"));
                    if(checkout_patient!=null && checkout_patient.equals(rs.getString("AMKA"))) {
                    patient[0]=rs.getString("patient_name")+" "+rs.getString("patient_lastname");
                    patient[1]=checkout_patient;
                }
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        CheckOut_Patient_Box.setModel(new DefaultComboBoxModel(patients.toArray()));
        if(checkout_patient!=null) CheckOut_Patient_Box.setSelectedItem(patient[0]+" | "+patient[1]);
    }
    
    private void Calculate_Patient_CheckOut_Cost(){
        Payment_Type_Box.setEnabled(true);
        try{
            String query = "select patient_name,patient_lastname,patient.AMKA,cost,medicine_cost from patient inner join patient_treatment on patient.AMKA=patient_treatment.AMKA where patient.AMKA='"+checkout_patient+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                    Patient_Cost.setText(rs.getString("cost"));
                    Medicine_Cost.setText(rs.getString("medicine_cost"));
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
    }

    private void CheckOut_Patient_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_CheckOut_Patient_BoxPopupMenuWillBecomeInvisible
        Payment_Type_Box.setSelectedItem(null);
        Payment_Type_Box.setSelectedIndex(-1);
        Patient_Cost.setText(null);
        Medicine_Cost.setText(null);
        Confirm_CheckOut_Button.setEnabled(false);
        if(CheckOut_Patient_Box.getSelectedItem()==null){
            Payment_Type_Box.setEnabled(false);
            checkout_patient=null;
        }else{
            String[] temp=((String)CheckOut_Patient_Box.getSelectedItem()).split(" \\| ");
            checkout_patient=temp[1];
            Calculate_Patient_CheckOut_Cost();
        }
    }//GEN-LAST:event_CheckOut_Patient_BoxPopupMenuWillBecomeInvisible

    private void Payment_Type_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Payment_Type_BoxPopupMenuWillBecomeInvisible
        if(CheckOut_Patient_Box.getSelectedIndex()==0){
            Confirm_CheckOut_Button.setEnabled(false);
        }else{
            Confirm_CheckOut_Button.setEnabled(true);
        }
    }//GEN-LAST:event_Payment_Type_BoxPopupMenuWillBecomeInvisible

    private void Confirm_CheckOut_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_CheckOut_ButtonActionPerformed
        Integer cost=0;
        Integer medicine_cost=0;
        Integer patients_income=0;
        Integer medicine_income=0;
        Integer year=Calendar.getInstance().get(Calendar.YEAR);
        Integer month=Calendar.getInstance().get(Calendar.MONTH)+1;
        try{
            String query = "insert into income (year,month) values (?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1,year);
            pstmt.setInt(2,month);
        }catch(Exception e){System.out.println(e.getMessage());};
        try{
            String query = "select patients_income,medicine_income from income where year="+year+" and month="+month;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                patients_income+=rs.getInt("patients_income");
                medicine_income+=rs.getInt("medicine_income");
            }
            rs.close();
            stmt.close();
            query = "select cost,medicine_cost from patient_treatment where AMKA='"+checkout_patient+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while(rs.next()){
                cost+=rs.getInt("cost");
                medicine_cost+=rs.getInt("medicine_cost");
            }
            rs.close();
            stmt.close();
            
        }catch(Exception e){System.out.println(e.getMessage());};
        try{
            String query = "update income set patients_income=?,medicine_income=? where year="+year+" and month="+month;
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1,patients_income+cost);
            pstmt.setInt(2,medicine_income+medicine_cost);
            pstmt.executeUpdate();
            pstmt.close();
            query = "delete from patient where AMKA='"+checkout_patient+"'";
            pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            pstmt.close();
            checkout_patient=null;
            Load_CheckOut_Patient_Box();
            Payment_Type_Box.setSelectedItem(null);
            Payment_Type_Box.setSelectedIndex(-1);
            Patient_Cost.setText(null);
            Medicine_Cost.setText(null);
            Confirm_CheckOut_Button.setEnabled(false);
       }catch(Exception e){System.out.println(e.getMessage());};
    }//GEN-LAST:event_Confirm_CheckOut_ButtonActionPerformed
    // </editor-fold>
    
    //                                                                                              <editor-fold defaultstate="collapsed" desc="Panel3">
    private void Load_Worker_Type_Box(){
        ArrayList jobs = new ArrayList();
        jobs.add(null);
        jobs.add("Γιατρός");
        jobs.add("Νοσηλευτής");
        jobs.add("Γραμματέας");
        jobs.add("Αποθηκάριος");
        jobs.add("Διευθυντής");
        Worker_Type_Box.setModel(new DefaultComboBoxModel(jobs.toArray()));
    }

    private void Load_Worker_Name_Box() {
        ArrayList workers = new ArrayList();
        workers.add(null);
        try{
            String query = "select username,name,lastname from users where job='"+String.valueOf(Worker_Type_Box.getSelectedItem())+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                workers.add(rs.getString("name")+" "+rs.getString("lastname")+" | "+rs.getString("username"));
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        Worker_Name_Box.setModel(new DefaultComboBoxModel(workers.toArray()));
        if(chosen_worker!=null) Worker_Name_Box.setSelectedItem(Worker_Name.getText()+" "+Worker_Lastname.getText()+" | "+Worker_Username.getText());
    }
    
    private void Load_Worker_Info(){
        LocalDate localDate = LocalDate.now();
        ArrayList temp = new ArrayList();
        for(int i=localDate.getYear()-80;i<=localDate.getYear();i++) temp.add(String.valueOf(i));
        Worker_Birth_Year.setModel(new DefaultComboBoxModel(temp.toArray()));
        try{
            String query = "select username,password,email,name,lastname,birth_date from users where username='"+chosen_worker+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Worker_Username.setText(rs.getString("username"));
                Worker_Password.setText(rs.getString("password"));
                Worker_Email.setText(rs.getString("email"));
                Worker_Name.setText(rs.getString("name"));
                Worker_Lastname.setText(rs.getString("lastname"));
                String[] date= (rs.getString("birth_date")).split("-");
                Worker_Birth_Year.setSelectedItem(date[0]);
                Worker_Birth_Month.setSelectedItem(date[1]);
                Worker_Birth_Day.setSelectedItem(date[2]);
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
    }
    private void Reset_Boxes(){
        Worker_Username.setEnabled(false);
        Reset_Worker_Password.setEnabled(false);
        Worker_Email.setEnabled(false);
        Worker_Name.setEnabled(false);
        Worker_Lastname.setEnabled(false);
        Worker_Birth_Year.setEnabled(false);
        Worker_Birth_Month.setEnabled(false);
        Worker_Birth_Day.setEnabled(false);
        Worker_Update_Button.setEnabled(false);
        Worker_Delete_Button.setEnabled(false);
        Worker_Name_Box.setSelectedItem(null);
        Worker_Username.setText(null);
        Worker_Password.setText(null);
        Worker_Email.setText(null);
        Worker_Name.setText(null);
        Worker_Lastname.setText(null);
        Worker_Birth_Year.setSelectedItem(null);
        Worker_Birth_Month.setSelectedItem(null);
        Worker_Birth_Day.setSelectedItem(null);
        Worker_Success.setVisible(false);
        Worker_Fail.setVisible(false);
        Delete_Success.setVisible(false);
    }
    private void Worker_Type_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Worker_Type_BoxPopupMenuWillBecomeInvisible
        Reset_Boxes();
        chosen_worker=null;
        if(Worker_Type_Box.getSelectedItem()==null) Worker_Name_Box.setEnabled(false);
        else{
            Worker_Name_Box.setEnabled(true);
            Load_Worker_Name_Box();
        }
    }//GEN-LAST:event_Worker_Type_BoxPopupMenuWillBecomeInvisible

    private void Worker_Name_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Worker_Name_BoxPopupMenuWillBecomeInvisible
        if(Worker_Name_Box.getSelectedItem()==null){
            Reset_Boxes();
        }else{
            Worker_Birth_Month.setEnabled(false);
            Worker_Birth_Day.setEnabled(false);
            Worker_Username.setEnabled(true);
            Reset_Worker_Password.setEnabled(true);
            Worker_Email.setEnabled(true);
            Worker_Name.setEnabled(true);
            Worker_Lastname.setEnabled(true);
            Worker_Birth_Year.setEnabled(true);
            Worker_Update_Button.setEnabled(true);
            Worker_Delete_Button.setEnabled(true);
            String[] worker = (String.valueOf(Worker_Name_Box.getSelectedItem())).split(" \\| ");
            chosen_worker=worker[1];
            Load_Worker_Info();
        }
    }//GEN-LAST:event_Worker_Name_BoxPopupMenuWillBecomeInvisible

    private void Worker_Birth_YearPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Worker_Birth_YearPopupMenuWillBecomeInvisible
        Worker_Birth_Month.setEnabled(true);
    }//GEN-LAST:event_Worker_Birth_YearPopupMenuWillBecomeInvisible

    private void Worker_Birth_MonthPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Worker_Birth_MonthPopupMenuWillBecomeInvisible
        String birth_day=String.valueOf(Worker_Birth_Day.getSelectedItem());
        Worker_Birth_Day.setEnabled(true);
        ArrayList day = new ArrayList();
        int i=Integer.valueOf(String.valueOf(Worker_Birth_Month.getSelectedItem()));
        int last_day=0;
        if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) last_day=31;
        if(i==4 || i==6 || i==9 || i==11) last_day=30;
        if(i==2) last_day=28;
        for(int j=1;j<=last_day;j++) {
            if(j<10) day.add("0"+String.valueOf(j));
            else day.add(String.valueOf(j));
        }
        Worker_Birth_Day.setModel(new DefaultComboBoxModel(day.toArray()));
        Worker_Birth_Day.setSelectedItem(birth_day);
    }//GEN-LAST:event_Worker_Birth_MonthPopupMenuWillBecomeInvisible

    private void Worker_Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Worker_Update_ButtonActionPerformed
        Worker_Success.setVisible(false);
        Worker_Fail.setVisible(false);
        try{
            String query = "update users set username=?,email=?,name=?,lastname=?,birth_date=? where username='"+chosen_worker+"'";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,Worker_Username.getText());
            pstmt.setString(2,Worker_Email.getText());
            pstmt.setString(3,Worker_Name.getText());
            pstmt.setString(4,Worker_Lastname.getText());
            String birth_date=String.valueOf(Worker_Birth_Year.getSelectedItem())+"-"+String.valueOf(Worker_Birth_Month.getSelectedItem())+"-"+String.valueOf(Worker_Birth_Day.getSelectedItem());
            pstmt.setDate(5,Date.valueOf(birth_date)); 
            pstmt.executeUpdate();
            pstmt.close();
            if(Reset_Worker_Password.isSelected()){
                query = "update users set password=? where username='"+chosen_worker+"'";
                pstmt = conn.prepareStatement(query);
                pstmt.setString(1,"0000");
                pstmt.executeUpdate();
                pstmt.close();
            }
            Load_Worker_Info();
            Worker_Success.setVisible(true);
        }catch(Exception e){Worker_Fail.setVisible(true);System.out.println(e.getMessage());};
    }//GEN-LAST:event_Worker_Update_ButtonActionPerformed

    private void Worker_Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Worker_Delete_ButtonActionPerformed
        try{
            String query = "delete from users where username='"+chosen_worker+"'";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            pstmt.close();
            Reset_Boxes();
            chosen_worker=null;
            Load_Worker_Name_Box();
            Delete_Success.setVisible(true);
        }catch(Exception e){System.out.println(e.getMessage());};
    }//GEN-LAST:event_Worker_Delete_ButtonActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel4">
    
    // </editor-fold>
    
    //                                                  						<editor-fold defaultstate="collapsed" desc="Panel5">
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
        Message_Text.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
        Message_Text.setText("");
        if(Rec_Type_Box.getSelectedItem() == null) {
            Rec_Name_Box.setEnabled(false);
            Rec_Name_Box.setSelectedItem(null);
        }
        else {
            Rec_Name_Box.setEnabled(true);
            Load_Rec_Name_Box(String.valueOf(Rec_Type_Box.getSelectedItem()));
        }
    }//GEN-LAST:event_Rec_Type_BoxPopupMenuWillBecomeInvisible

    private void Rec_Name_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Rec_Name_BoxPopupMenuWillBecomeInvisible
        Send_Button.setEnabled(false);
        Message_Text.setText("");
        if(Rec_Name_Box.getSelectedItem() == null) {
            Message_Text.setEnabled(false);
            Message_Text.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
        }
        else {
            String temp=String.valueOf(Rec_Name_Box.getSelectedItem());
            String[] receiver=temp.split(" \\| ");
            chosen_receiver=receiver[1];
            Message_Text.setEnabled(true);
            Message_Text.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.background"));
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
            this.setTitle("MedX - Καλώς ήρθες γραμματέα - "+user);
        }catch(Exception e){System.out.println(e.getMessage());};
        Load_Account();
    }//GEN-LAST:event_Account_Update_ButtonActionPerformed
    // </editor-fold>
    
}
