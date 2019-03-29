package MedX;

    // <editor-fold defaultstate="collapsed" desc="Imports">
import java.awt.CardLayout;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JToggleButton;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
    // </editor-fold>

public class Nurse extends javax.swing.JFrame {
    
    // <editor-fold defaultstate="collapsed" desc="Nurse Constructor">
    public Nurse(String user,Connection conn) {
        initComponents();
        this.setLocationRelativeTo(null);
        BackgroundImage.requestFocus();
        Button2.setVisible(false);
        Button3.setVisible(false);
        Button4.setVisible(false);  
        this.setTitle("MedX - Καλώς ήρθες νοσηλευτή - "+user);
        AutoCompleteDecorator.decorate(Rec_Name_List);
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
        Schedule = new javax.swing.JLabel();
        Schedule_Expanded_Panel = new javax.swing.JPanel();
        Return_Button_Schedule = new javax.swing.JButton();
        Schedule_Expanded_Scroll = new javax.swing.JScrollPane();
        Schedule_Expanded = new javax.swing.JList<>();
        Panel1 = new javax.swing.JPanel();
        Select_Patient = new javax.swing.JLabel();
        Treat_Patient_List = new javax.swing.JComboBox<>();
        Doctor_Comments_Label = new javax.swing.JLabel();
        Description_Scroll = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        Medicine_Label = new javax.swing.JLabel();
        Medicine_Scroll = new javax.swing.JScrollPane();
        Medicine_List = new javax.swing.JList<>();
        Give_Medicine_Button = new javax.swing.JButton();
        Complete = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        Panel3 = new javax.swing.JPanel();
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
        Rec_Type_List = new javax.swing.JComboBox<>();
        Rec_Name_List = new javax.swing.JComboBox<>();
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
        Nurse_Username = new javax.swing.JTextField();
        Nurse_Password = new javax.swing.JTextField();
        Nurse_Name = new javax.swing.JTextField();
        Nurse_LastName = new javax.swing.JTextField();
        Nurse_Telephone0 = new javax.swing.JTextField();
        Nurse_Telephone1 = new javax.swing.JTextField();
        Nurse_Adress = new javax.swing.JTextField();
        Nurse_Start_Work = new javax.swing.JTextField();
        Nurse_Email = new javax.swing.JTextField();
        Nurse_Birthday = new javax.swing.JTextField();
        Nurse_Update_Button = new javax.swing.JButton();
        Edit_Information_Label = new javax.swing.JLabel();
        Nurse_Name_Label = new javax.swing.JLabel();
        Nurse_LastName_Label = new javax.swing.JLabel();
        Nurse_Birthday_Label = new javax.swing.JLabel();
        Nurse_Telephone_Label = new javax.swing.JLabel();
        Nurse_Adress_Label = new javax.swing.JLabel();
        Nurse_Start_Work_Label = new javax.swing.JLabel();
        Nurse_Email_Label = new javax.swing.JLabel();
        Nurse_Username_Label = new javax.swing.JLabel();
        Nurse_Password_Label = new javax.swing.JLabel();
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

        Schedule.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Schedule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Schedule.setText("ΠΡΟΓΡΑΜΜΑ ΗΜΕΡΑΣ : YYYY/MM/DD");
        Main_Schedule_Panel.add(Schedule);
        Schedule.setBounds(20, 20, 480, 22);

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

        Schedule_Expanded.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Schedule_Expanded.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Schedule_Expanded.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Schedule_Expanded.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Schedule_ExpandedMouseReleased(evt);
            }
        });
        Schedule_Expanded_Scroll.setViewportView(Schedule_Expanded);

        Schedule_Expanded_Panel.add(Schedule_Expanded_Scroll);
        Schedule_Expanded_Scroll.setBounds(20, 20, 480, 400);

        Panel0.add(Schedule_Expanded_Panel, "Schedule_Expanded_Panel");

        MainPanel.add(Panel0, "Panel0");

        Panel1.setLayout(null);

        Select_Patient.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Select_Patient.setText("Επιλογή Ασθενή :");
        Panel1.add(Select_Patient);
        Select_Patient.setBounds(80, 17, 120, 40);

        Treat_Patient_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Treat_Patient_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Treat_Patient_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Treat_Patient_List.setFocusable(false);
        Panel1.add(Treat_Patient_List);
        Treat_Patient_List.setBounds(195, 15, 200, 40);

        Doctor_Comments_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Doctor_Comments_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Doctor_Comments_Label.setText("Γνωμάτευση Γιατρού :");
        Panel1.add(Doctor_Comments_Label);
        Doctor_Comments_Label.setBounds(20, 70, 310, 20);

        Description.setEditable(false);
        Description.setColumns(20);
        Description.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Description.setLineWrap(true);
        Description.setRows(5);
        Description.setWrapStyleWord(true);
        Description.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Description_Scroll.setViewportView(Description);

        Panel1.add(Description_Scroll);
        Description_Scroll.setBounds(20, 90, 310, 270);

        Medicine_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Medicine_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Medicine_Label.setText("Χορήγηση Φαρμάκων :");
        Panel1.add(Medicine_Label);
        Medicine_Label.setBounds(350, 70, 150, 20);

        Medicine_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Medicine_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Φάρμακο 1", "Φάρμακο 2", "Φάρμακο 3", "Φάρμακο 4", "Φάρμακο 5", "Φάρμακο 6", "Φάρμακο 7" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Medicine_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Medicine_List.setFocusable(false);
        Medicine_Scroll.setViewportView(Medicine_List);

        Panel1.add(Medicine_Scroll);
        Medicine_Scroll.setBounds(350, 90, 150, 220);

        Give_Medicine_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Give_Medicine_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Check_Icon.png"))); // NOI18N
        Give_Medicine_Button.setText("Επιβεβαίωση");
        Give_Medicine_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Give_Medicine_Button.setFocusable(false);
        Give_Medicine_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Give_Medicine_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Give_Medicine_ButtonActionPerformed(evt);
            }
        });
        Panel1.add(Give_Medicine_Button);
        Give_Medicine_Button.setBounds(355, 330, 140, 30);

        Complete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Complete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Complete.setText("Ολοκλήρωση");
        Complete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Complete.setEnabled(false);
        Complete.setFocusPainted(false);
        Complete.setFocusable(false);
        Complete.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Panel1.add(Complete);
        Complete.setBounds(180, 380, 150, 40);

        MainPanel.add(Panel1, "Panel1");

        Panel2.setLayout(null);
        MainPanel.add(Panel2, "Panel2");

        Panel3.setLayout(null);
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
        New_Message.setPreferredSize(new java.awt.Dimension(400, 350));
        New_Message.setLayout(null);

        Recepient.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Recepient.setText("ΠΑΡΑΛΗΠΤΗΣ:");
        Recepient.setFocusable(false);
        New_Message.add(Recepient);
        Recepient.setBounds(20, 10, 100, 40);

        Rec_Type_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Rec_Type_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Γιατρός", "Νοσοκόμος", "Γραμματέας", "Διευθυντής" }));
        Rec_Type_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rec_Type_List.setFocusable(false);
        New_Message.add(Rec_Type_List);
        Rec_Type_List.setBounds(120, 10, 100, 40);

        Rec_Name_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Rec_Name_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        New_Message.add(Rec_Name_List);
        Rec_Name_List.setBounds(230, 10, 270, 40);

        Message_Text.setColumns(20);
        Message_Text.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Text.setLineWrap(true);
        Message_Text.setRows(5);
        Message_Text.setWrapStyleWord(true);
        Message_Area_Scroll.setViewportView(Message_Text);

        New_Message.add(Message_Area_Scroll);
        Message_Area_Scroll.setBounds(20, 60, 480, 310);

        Send_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Send_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Send_Button.setText("ΑΠΟΣΤΟΛΗ");
        Send_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Send_Button.setFocusable(false);
        Send_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
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
        Message_Expanded.add(Message_Delete_Button);
        Message_Delete_Button.setBounds(20, 390, 200, 30);

        Panel5.add(Message_Expanded, "Message_Expanded");

        MainPanel.add(Panel5, "Panel5");

        Panel6.setLayout(null);

        Nurse_Username.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Nurse_Username);
        Nurse_Username.setBounds(20, 80, 150, 40);

        Nurse_Password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Nurse_Password);
        Nurse_Password.setBounds(185, 80, 150, 40);

        Nurse_Name.setEditable(false);
        Nurse_Name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Nurse_Name);
        Nurse_Name.setBounds(20, 180, 150, 40);

        Nurse_LastName.setEditable(false);
        Nurse_LastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_LastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Nurse_LastName);
        Nurse_LastName.setBounds(185, 180, 150, 40);

        Nurse_Telephone0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Telephone0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Nurse_Telephone0);
        Nurse_Telephone0.setBounds(20, 280, 150, 20);

        Nurse_Telephone1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Telephone1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Nurse_Telephone1);
        Nurse_Telephone1.setBounds(20, 300, 150, 20);

        Nurse_Adress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Adress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Nurse_Adress);
        Nurse_Adress.setBounds(185, 280, 150, 40);

        Nurse_Start_Work.setEditable(false);
        Nurse_Start_Work.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Start_Work.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Nurse_Start_Work);
        Nurse_Start_Work.setBounds(350, 280, 150, 40);

        Nurse_Email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Nurse_Email);
        Nurse_Email.setBounds(350, 80, 150, 40);

        Nurse_Birthday.setEditable(false);
        Nurse_Birthday.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Birthday.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Nurse_Birthday);
        Nurse_Birthday.setBounds(350, 180, 150, 40);

        Nurse_Update_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Nurse_Update_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Nurse_Update_Button.setText("ΕΝΗΜΕΡΩΣΗ");
        Nurse_Update_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nurse_Update_Button.setFocusable(false);
        Nurse_Update_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Panel6.add(Nurse_Update_Button);
        Nurse_Update_Button.setBounds(185, 360, 150, 40);

        Edit_Information_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Edit_Information_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit_Information_Label.setText("ΕΠΕΞΕΡΓΑΣΙΑ ΣΤΟΙΧΕΙΩΝ ΛΟΓΑΡΙΑΣΜΟΥ");
        Panel6.add(Edit_Information_Label);
        Edit_Information_Label.setBounds(60, 10, 390, 30);

        Nurse_Name_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nurse_Name_Label.setText("ΟΝΟΜΑ");
        Panel6.add(Nurse_Name_Label);
        Nurse_Name_Label.setBounds(20, 160, 150, 20);

        Nurse_LastName_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_LastName_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nurse_LastName_Label.setText("ΕΠΩΝΥΜΟ");
        Panel6.add(Nurse_LastName_Label);
        Nurse_LastName_Label.setBounds(185, 160, 150, 20);

        Nurse_Birthday_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Birthday_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nurse_Birthday_Label.setText("ΗΜ/ΝΙΑ ΓΕΝΝΗΣΗΣ");
        Panel6.add(Nurse_Birthday_Label);
        Nurse_Birthday_Label.setBounds(350, 160, 150, 20);

        Nurse_Telephone_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Telephone_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nurse_Telephone_Label.setText("ΤΗΛΕΦΩΝΑ");
        Panel6.add(Nurse_Telephone_Label);
        Nurse_Telephone_Label.setBounds(20, 260, 150, 20);

        Nurse_Adress_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Adress_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nurse_Adress_Label.setText("ΔΙΕΥΘΥΝΣΗ");
        Panel6.add(Nurse_Adress_Label);
        Nurse_Adress_Label.setBounds(185, 260, 150, 20);

        Nurse_Start_Work_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Start_Work_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nurse_Start_Work_Label.setText("ΕΝΑΡΞΗ ΕΡΓΑΣΙΑΣ");
        Panel6.add(Nurse_Start_Work_Label);
        Nurse_Start_Work_Label.setBounds(350, 260, 150, 20);

        Nurse_Email_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Email_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nurse_Email_Label.setText("E-Mail");
        Panel6.add(Nurse_Email_Label);
        Nurse_Email_Label.setBounds(350, 60, 150, 20);

        Nurse_Username_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Username_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nurse_Username_Label.setText("ΟΝΟΜΑ ΧΡΗΣΤΗ");
        Panel6.add(Nurse_Username_Label);
        Nurse_Username_Label.setBounds(20, 60, 150, 20);

        Nurse_Password_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nurse_Password_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nurse_Password_Label.setText("ΚΩΔΙΚΟΣ ΧΡΗΣΤΗ");
        Panel6.add(Nurse_Password_Label);
        Nurse_Password_Label.setBounds(185, 60, 150, 20);

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
        Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Treatment_Icon.png"))); // NOI18N
        Button1.setText("Περίθαλψη Ασθενή");
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
        Button2.setText("Button 2");
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
        Button3.setText("Button 3");
        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button3.setFocusPainted(false);
        Button3.setFocusable(false);
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
    String Medicine_Selected;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel BackgroundMedX;
    private javax.swing.JToggleButton Button0;
    private javax.swing.JToggleButton Button1;
    private javax.swing.JToggleButton Button2;
    private javax.swing.JToggleButton Button3;
    private javax.swing.JToggleButton Button4;
    private javax.swing.JToggleButton Button5;
    private javax.swing.JToggleButton Button6;
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JButton Complete;
    private javax.swing.JTextArea Description;
    private javax.swing.JScrollPane Description_Scroll;
    private javax.swing.JLabel Doctor_Comments_Label;
    private javax.swing.JLabel Edit_Information_Label;
    private javax.swing.JButton Give_Medicine_Button;
    private javax.swing.JList<String> Incoming_List;
    private javax.swing.JPanel Incoming_Panel;
    private javax.swing.JScrollPane Incoming_Scroll;
    private javax.swing.JButton Logout_Button;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Main_Messages;
    private javax.swing.JPanel Main_Schedule_Panel;
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
    private javax.swing.JPanel New_Message;
    private javax.swing.JButton New_Message_Button;
    private javax.swing.JTextField Nurse_Adress;
    private javax.swing.JLabel Nurse_Adress_Label;
    private javax.swing.JTextField Nurse_Birthday;
    private javax.swing.JLabel Nurse_Birthday_Label;
    private javax.swing.JTextField Nurse_Email;
    private javax.swing.JLabel Nurse_Email_Label;
    private javax.swing.JTextField Nurse_LastName;
    private javax.swing.JLabel Nurse_LastName_Label;
    private javax.swing.JTextField Nurse_Name;
    private javax.swing.JLabel Nurse_Name_Label;
    private javax.swing.JTextField Nurse_Password;
    private javax.swing.JLabel Nurse_Password_Label;
    private javax.swing.JTextField Nurse_Start_Work;
    private javax.swing.JLabel Nurse_Start_Work_Label;
    private javax.swing.JTextField Nurse_Telephone0;
    private javax.swing.JTextField Nurse_Telephone1;
    private javax.swing.JLabel Nurse_Telephone_Label;
    private javax.swing.JButton Nurse_Update_Button;
    private javax.swing.JTextField Nurse_Username;
    private javax.swing.JLabel Nurse_Username_Label;
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
    private javax.swing.JComboBox<String> Rec_Name_List;
    private javax.swing.JComboBox<String> Rec_Type_List;
    private javax.swing.JLabel Recepient;
    private javax.swing.JButton Refresh_Button;
    private javax.swing.JButton Return_Button_Message_Expanded;
    private javax.swing.JButton Return_Button_Schedule;
    private javax.swing.JLabel Schedule;
    private javax.swing.JList<String> Schedule_Expanded;
    private javax.swing.JPanel Schedule_Expanded_Panel;
    private javax.swing.JScrollPane Schedule_Expanded_Scroll;
    private javax.swing.JList<String> Schedule_List;
    private javax.swing.JScrollPane Schedule_List_Scroll;
    private javax.swing.JLabel Select_Patient;
    private javax.swing.JButton Send_Button;
    private javax.swing.JSeparator SeparatorHorTop;
    private javax.swing.JSeparator SeperatorHorBot;
    private javax.swing.JSeparator SeperatorVerLef;
    private javax.swing.JSeparator SeperatorVerRig;
    private javax.swing.JComboBox<String> Treat_Patient_List;
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
        Check_Button(Button0);
    }//GEN-LAST:event_Button0ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        Check_Button(Button1);
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
        Check_Button(Button5);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        Check_Button(Button6);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Logout_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_ButtonActionPerformed
        LoginScreen l = new LoginScreen();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Logout_ButtonActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel0">
    private void Schedule_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schedule_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2) {
            CardLayout card = (CardLayout)Panel0.getLayout();
            card.show(Panel0, "Schedule_Expanded_Panel");
        }
    }//GEN-LAST:event_Schedule_ListMouseReleased
    
    private void Return_Button_ScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_Button_ScheduleActionPerformed
        CardLayout card = (CardLayout)Panel0.getLayout();
        card.show(Panel0, "Main_Schedule_Panel");
    }//GEN-LAST:event_Return_Button_ScheduleActionPerformed

    private void Schedule_ExpandedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schedule_ExpandedMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2) {
            CardLayout card = (CardLayout)MainPanel.getLayout();
            card.show(MainPanel, "Panel1");
            Button1.setSelected(true);
            Button1.setEnabled(true);
            Button0.setSelected(false);
            Button0.setEnabled(false);
            Check_Button(Button1);
        }
    }//GEN-LAST:event_Schedule_ExpandedMouseReleased
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel1">
    private void Give_Medicine_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Give_Medicine_ButtonActionPerformed
        ArrayList Medicine_Total = new ArrayList();
        if(Medicine_List.getSelectedIndex() != -1) {
            DefaultListModel model = new DefaultListModel();
            int[] index = Medicine_List.getSelectedIndices();
            for(int i=0;i<Medicine_List.getModel().getSize();i++){
                Medicine_Total.add(String.valueOf( Medicine_List.getModel().getElementAt(i)));
            }
            for(int i=Medicine_Total.size()-1;i>=0;i--) {
                for (int j=0;j<index.length;j++) {
                    if(i==index[j]) Medicine_Total.remove(i);
                }
            }
            for(int j=0;j<Medicine_Total.size();j++) {
                model.addElement(Medicine_Total.get(j));
            }
            Medicine_List.setModel(model);
        }
        if(Medicine_List.getModel().getSize()==0) Complete.setEnabled(true);
        else Complete.setEnabled(false);
    }//GEN-LAST:event_Give_Medicine_ButtonActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel2">
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel3">
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel5">
    private void Return_Button_Message_ExpandedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_Button_Message_ExpandedActionPerformed
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "Main_Messages");
    }//GEN-LAST:event_Return_Button_Message_ExpandedActionPerformed

    private void Incoming_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Incoming_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2) {
            CardLayout card = (CardLayout)Panel5.getLayout();
            card.show(Panel5, "Message_Expanded");
            Message_Expanded_SR_Label.setText("ΑΠΟΣΤΟΛΕΑΣ");
            Message_Expanded_Text.setText(Incoming_List.getSelectedValue());
        }
    }//GEN-LAST:event_Incoming_ListMouseReleased

    private void Outgoing_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Outgoing_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2) {
            CardLayout card = (CardLayout)Panel5.getLayout();
            card.show(Panel5, "Message_Expanded");
            Message_Expanded_SR_Label.setText("ΠΑΡΑΛΗΠΤΗΣ");
            Message_Expanded_Text.setText(Outgoing_List.getSelectedValue());
        }
    }//GEN-LAST:event_Outgoing_ListMouseReleased

    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "Main_Messages");
    }//GEN-LAST:event_Cancel_ButtonActionPerformed

    private void New_Message_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_Message_ButtonActionPerformed
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "New_Message");
    }//GEN-LAST:event_New_Message_ButtonActionPerformed

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel6">
    
    // </editor-fold>
    
}
