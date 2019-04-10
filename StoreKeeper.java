package MedX;

    // <editor-fold defaultstate="collapsed" desc="Imports">
import static MedX.Doctor.conn;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JToggleButton;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
    // </editor-fold>

public class StoreKeeper extends javax.swing.JFrame {
    
    // <editor-fold defaultstate="collapsed" desc="StoreKeeper Constructor">
    public StoreKeeper(String name,Connection condb) {
        initComponents();
        conn=condb;
        user=name;
        this.setLocationRelativeTo(null);
        BackgroundImage.requestFocus();
        Button2.setVisible(false);
        Button3.setVisible(false);
        Button4.setVisible(false);  
        this.setTitle("MedX - Καλώς ήρθες αποθηκάριε - "+user);
        ArrayList items = new ArrayList();
        items.add(null);
        items.add("Φάρμακα");
        items.add("Διάφορα");
        Order_Item_Box.setModel(new DefaultComboBoxModel(items.toArray()));
        Order_Name_Box.setEnabled(false);
        Order_Quantity.setEnabled(false);
        Add_Order_Button.setEnabled(false);
    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Panel0 = new javax.swing.JPanel();
        Hospital_Storage_Label = new javax.swing.JLabel();
        Medicine_Label = new javax.swing.JLabel();
        Medicine_List_Scroll = new javax.swing.JScrollPane();
        Medicine_List = new javax.swing.JList<>();
        Misc_Label = new javax.swing.JLabel();
        Misc_List_Scroll = new javax.swing.JScrollPane();
        Misc_List = new javax.swing.JList<>();
        Remove_Misc_Button = new javax.swing.JButton();
        Medicine_Warning = new javax.swing.JLabel();
        Misc_Warning = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        New_Order_Label = new javax.swing.JLabel();
        Order_Type_Label = new javax.swing.JLabel();
        Order_Name_Label = new javax.swing.JLabel();
        Order_Quantity_Label = new javax.swing.JLabel();
        Order_List_Scroll = new javax.swing.JScrollPane();
        Order_List = new javax.swing.JList<>();
        Remove_Order_Button = new javax.swing.JButton();
        Order_Item_Box = new javax.swing.JComboBox<>();
        Order_Name_Box = new javax.swing.JComboBox<>();
        Order_Quantity = new javax.swing.JTextField();
        Add_Order_Button = new javax.swing.JButton();
        Confirm_Order_Button = new javax.swing.JButton();
        Order_Total = new javax.swing.JLabel();
        Order_Type_Label1 = new javax.swing.JLabel();
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
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        MainPanel.setVisible(false);
        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MainPanel.setPreferredSize(new java.awt.Dimension(410, 340));
        MainPanel.setLayout(new java.awt.CardLayout());

        Panel0.setLayout(null);

        Hospital_Storage_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Hospital_Storage_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hospital_Storage_Label.setText("ΑΠΟΘΗΚΗ ΝΟΣΟΚΟΜΕΙΟΥ");
        Hospital_Storage_Label.setFocusable(false);
        Panel0.add(Hospital_Storage_Label);
        Hospital_Storage_Label.setBounds(50, 20, 430, 30);

        Medicine_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Medicine_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Medicine_Label.setText("ΦΑΡΜΑΚΑ");
        Medicine_Label.setFocusable(false);
        Panel0.add(Medicine_Label);
        Medicine_Label.setBounds(20, 50, 230, 30);

        Medicine_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Medicine_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Medicine_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Medicine_List.setFocusable(false);
        Medicine_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Medicine_ListMouseReleased(evt);
            }
        });
        Medicine_List_Scroll.setViewportView(Medicine_List);

        Panel0.add(Medicine_List_Scroll);
        Medicine_List_Scroll.setBounds(20, 80, 230, 300);

        Misc_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Misc_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Misc_Label.setText("ΔΙΑΦΟΡΑ");
        Misc_Label.setFocusable(false);
        Panel0.add(Misc_Label);
        Misc_Label.setBounds(330, 50, 120, 30);

        Misc_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Misc_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Misc_List.setFocusable(false);
        Misc_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Misc_ListMouseReleased(evt);
            }
        });
        Misc_List_Scroll.setViewportView(Misc_List);

        Panel0.add(Misc_List_Scroll);
        Misc_List_Scroll.setBounds(270, 80, 230, 300);

        Remove_Misc_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Delete_Icon.png"))); // NOI18N
        Remove_Misc_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Remove_Misc_Button.setEnabled(false);
        Remove_Misc_Button.setFocusable(false);
        Remove_Misc_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_Misc_ButtonActionPerformed(evt);
            }
        });
        Panel0.add(Remove_Misc_Button);
        Remove_Misc_Button.setBounds(460, 50, 40, 30);

        Medicine_Warning.setVisible(false);
        Medicine_Warning.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Medicine_Warning.setForeground(new java.awt.Color(255, 0, 0));
        Medicine_Warning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Medicine_Warning.setText("ΕΛΛΕΙΜΜΑ ΑΠΟΘΕΜΑΤΩΝ !");
        Medicine_Warning.setFocusable(false);
        Panel0.add(Medicine_Warning);
        Medicine_Warning.setBounds(20, 380, 230, 30);

        Misc_Warning.setVisible(false);
        Misc_Warning.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Misc_Warning.setForeground(new java.awt.Color(255, 0, 0));
        Misc_Warning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Misc_Warning.setText("ΕΛΛΕΙΜΜΑ ΑΠΟΘΕΜΑΤΩΝ !");
        Misc_Warning.setFocusable(false);
        Panel0.add(Misc_Warning);
        Misc_Warning.setBounds(270, 380, 230, 30);

        MainPanel.add(Panel0, "Panel0");

        Panel1.setLayout(null);

        New_Order_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        New_Order_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Order_Label.setText("ΝΕΑ ΠΑΡΑΓΓΕΛΙΑ");
        Panel1.add(New_Order_Label);
        New_Order_Label.setBounds(50, 20, 430, 30);

        Order_Type_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Order_Type_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Order_Type_Label.setText("ΠροΪόν :");
        Order_Type_Label.setFocusable(false);
        Panel1.add(Order_Type_Label);
        Order_Type_Label.setBounds(30, 120, 60, 40);

        Order_Name_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Order_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Order_Name_Label.setText("Όνομα :");
        Order_Name_Label.setFocusable(false);
        Panel1.add(Order_Name_Label);
        Order_Name_Label.setBounds(30, 180, 60, 40);

        Order_Quantity_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Order_Quantity_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Order_Quantity_Label.setText("Ποσότητα :");
        Order_Quantity_Label.setFocusable(false);
        Panel1.add(Order_Quantity_Label);
        Order_Quantity_Label.setBounds(50, 240, 70, 30);

        Order_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Order_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Order_List.setFocusable(false);
        Order_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Order_ListMouseReleased(evt);
            }
        });
        Order_List_Scroll.setViewportView(Order_List);

        Panel1.add(Order_List_Scroll);
        Order_List_Scroll.setBounds(290, 100, 190, 270);

        Remove_Order_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Delete_Icon.png"))); // NOI18N
        Remove_Order_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Remove_Order_Button.setEnabled(false);
        Remove_Order_Button.setFocusable(false);
        Remove_Order_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_Order_ButtonActionPerformed(evt);
            }
        });
        Panel1.add(Remove_Order_Button);
        Remove_Order_Button.setBounds(440, 70, 40, 30);

        Order_Item_Box.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Order_Item_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Order_Item_Box.setFocusable(false);
        Order_Item_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Order_Item_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Panel1.add(Order_Item_Box);
        Order_Item_Box.setBounds(90, 120, 170, 40);

        AutoCompleteDecorator.decorate(Order_Name_Box);
        Order_Name_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Order_Name_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Order_Name_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Panel1.add(Order_Name_Box);
        Order_Name_Box.setBounds(90, 180, 170, 40);

        Order_Quantity.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Order_Quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Order_Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Order_QuantityKeyReleased(evt);
            }
        });
        Panel1.add(Order_Quantity);
        Order_Quantity.setBounds(130, 240, 80, 30);

        Add_Order_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Plus_Icon.png"))); // NOI18N
        Add_Order_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_Order_Button.setFocusable(false);
        Add_Order_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Order_ButtonActionPerformed(evt);
            }
        });
        Panel1.add(Add_Order_Button);
        Add_Order_Button.setBounds(220, 240, 40, 30);

        Confirm_Order_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Confirm_Order_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Check_Icon.png"))); // NOI18N
        Confirm_Order_Button.setText("ΕΠΙΒΕΒΑΙΩΣΗ");
        Confirm_Order_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Confirm_Order_Button.setEnabled(false);
        Confirm_Order_Button.setFocusable(false);
        Confirm_Order_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Confirm_Order_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_Order_ButtonActionPerformed(evt);
            }
        });
        Panel1.add(Confirm_Order_Button);
        Confirm_Order_Button.setBounds(80, 330, 150, 40);

        Order_Total.setVisible(false);
        Order_Total.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Order_Total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Order_Total.setText("Συνολικό Κόστος :");
        Order_Total.setFocusable(false);
        Panel1.add(Order_Total);
        Order_Total.setBounds(270, 380, 230, 30);

        Order_Type_Label1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Order_Type_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Order_Type_Label1.setText("Προϊόντα");
        Order_Type_Label1.setFocusable(false);
        Panel1.add(Order_Type_Label1);
        Order_Type_Label1.setBounds(330, 70, 100, 30);

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
        Button0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Box_Icon.png"))); // NOI18N
        Button0.setText("Αποθήκη");
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
        Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Order_Icon.png"))); // NOI18N
        Button1.setText("Παραγγελία");
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
    static Connection conn=null;
    String user=null;
    String chosen_receiver=null;
    ArrayList order = new ArrayList();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Account_Update_Button;
    private javax.swing.JButton Add_Order_Button;
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
    private javax.swing.JButton Confirm_Order_Button;
    private javax.swing.JLabel Edit_Information_Label;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Email_Label;
    private javax.swing.JLabel Hospital_Storage_Label;
    private javax.swing.JList<String> Incoming_List;
    private javax.swing.JPanel Incoming_Panel;
    private javax.swing.JScrollPane Incoming_Scroll;
    private javax.swing.JTextField LastName;
    private javax.swing.JLabel LastName_Label;
    private javax.swing.JButton Logout_Button;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Main_Messages;
    private javax.swing.JLabel Medicine_Label;
    private javax.swing.JList<String> Medicine_List;
    private javax.swing.JScrollPane Medicine_List_Scroll;
    private javax.swing.JLabel Medicine_Warning;
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
    private javax.swing.JLabel Misc_Label;
    private javax.swing.JList<String> Misc_List;
    private javax.swing.JScrollPane Misc_List_Scroll;
    private javax.swing.JLabel Misc_Warning;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JPanel New_Message;
    private javax.swing.JButton New_Message_Button;
    private javax.swing.JLabel New_Order_Label;
    private javax.swing.JComboBox<String> Order_Item_Box;
    private javax.swing.JList<String> Order_List;
    private javax.swing.JScrollPane Order_List_Scroll;
    private javax.swing.JComboBox<String> Order_Name_Box;
    private javax.swing.JLabel Order_Name_Label;
    private javax.swing.JTextField Order_Quantity;
    private javax.swing.JLabel Order_Quantity_Label;
    private javax.swing.JLabel Order_Total;
    private javax.swing.JLabel Order_Type_Label;
    private javax.swing.JLabel Order_Type_Label1;
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
    private javax.swing.JComboBox<String> Rec_Name_Box;
    private javax.swing.JComboBox<String> Rec_Type_Box;
    private javax.swing.JLabel Recepient;
    private javax.swing.JButton Refresh_Button;
    private javax.swing.JButton Remove_Misc_Button;
    private javax.swing.JButton Remove_Order_Button;
    private javax.swing.JButton Return_Button_Message_Expanded;
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
    private javax.swing.JTextField Username;
    private javax.swing.JLabel Username_Label;
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
        if(Button0.isSelected()) {
            Load_Medicine();
            Load_Misc();
        }
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
    
    //                                                                                                              <editor-fold defaultstate="collapsed" desc="Panel0">
    private void Load_Medicine(){
        Medicine_Warning.setVisible(false);
        ArrayList medicine = new ArrayList();
        try{
            String query = "select name,quantity from medicine";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                medicine.add(rs.getString("name")+" - Απόθεμα : "+rs.getString("quantity"));
                if(rs.getInt("quantity")<10) Medicine_Warning.setVisible(true);
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        Medicine_List.setModel(new DefaultComboBoxModel(medicine.toArray()));
    }
    
    private void Load_Misc(){
        Misc_Warning.setVisible(false);
        ArrayList misc = new ArrayList();
        try{
            String query = "select name,quantity from misc";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                misc.add(rs.getString("name")+" - Απόθεμα : "+rs.getString("quantity"));
                if(rs.getInt("quantity")<10) Misc_Warning.setVisible(true);
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        Misc_List.setModel(new DefaultComboBoxModel(misc.toArray()));
    }
    
    private void Load_Order_Name_Box(String type){
        ArrayList Names = new ArrayList();
        Names.clear();
        Names.add(null);
        if(type.equals("Φάρμακα")){
            try{
                String query = "select name,buy_price from medicine";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()){
                    Names.add(rs.getString("name")+" : "+rs.getString("buy_price")+"€");
                }
                rs.close();
                stmt.close();
            }catch(Exception e){System.out.println(e.getMessage());};
        }
        else if(type.equals("Διάφορα")){
            try{
                String query = "select name,buy_price from misc";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()){
                    Names.add(rs.getString("name")+" : "+rs.getString("buy_price")+"€");
                }
                rs.close();
                stmt.close();
            }catch(Exception e){System.out.println(e.getMessage());};
        }
        Order_Name_Box.setModel(new DefaultComboBoxModel(Names.toArray()));
    }
        
    private void Order_Item(String type,String name,Integer price) {
        
        Load_Order_Name_Box(type);
        Order_Name_Box.setEnabled(true);
        Order_Name_Box.setSelectedItem(name+" : "+price+"€");
        Order_Quantity.setEnabled(true);
        Order_Quantity.setText(null);
        Order_Quantity.requestFocus();
    }
    
    private void Medicine_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Medicine_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2) {
            CardLayout card = (CardLayout)MainPanel.getLayout();
            card.show(MainPanel, "Panel1");
            Button1.setSelected(true);
            Button1.setEnabled(true);
            Button0.setSelected(false);
            Button0.setEnabled(false);
            Check_Button(Button1);
            String temp=Medicine_List.getSelectedValue();
            String[] name=temp.split(" - | : ");
            Integer price=0;
            try{
                String query = "select buy_price from medicine where name='"+name[0]+"'";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()){
                    price = rs.getInt("buy_price");
                }
                rs.close();
                stmt.close();
            }catch(Exception e){System.out.println(e.getMessage());};
            Order_Item_Box.setSelectedItem("Φάρμακα");
            Order_Item("Φάρμακα",name[0],price);
        }
    }//GEN-LAST:event_Medicine_ListMouseReleased

    private void Misc_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Misc_ListMouseReleased
        if(Misc_List.getSelectedIndex() != -1) Remove_Misc_Button.setEnabled(true);
        else Remove_Misc_Button.setEnabled(false);
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2) {
            CardLayout card = (CardLayout)MainPanel.getLayout();
            card.show(MainPanel, "Panel1");
            Button1.setSelected(true);
            Button1.setEnabled(true);
            Button0.setSelected(false);
            Button0.setEnabled(false);
            Check_Button(Button1);
            String temp=Misc_List.getSelectedValue();
            String[] name=temp.split(" - | : ");
            Integer price=0;
            try{
                String query = "select buy_price from misc where name='"+name[0]+"'";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()){
                    price = rs.getInt("buy_price");
                }
                rs.close();
                stmt.close();
            }catch(Exception e){System.out.println(e.getMessage());};
            Order_Item_Box.setSelectedItem("Διάφορα");
            Order_Item("Διάφορα",name[0],price);
        }
    }//GEN-LAST:event_Misc_ListMouseReleased

    private void Remove_Misc_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_Misc_ButtonActionPerformed
        Remove_Misc_Button.setEnabled(false);
        ArrayList misc = new ArrayList(Misc_List.getModel().getSize());
        for (int i = 0; i < Misc_List.getModel().getSize(); i++) {
            misc.add(Misc_List.getModel().getElementAt(i));
            String temp=(String)misc.get(i);
            String[] tempsplit=temp.split(" - | : ");
            int quantity=Integer.parseInt(tempsplit[2]);
            for(int j=0;j<Misc_List.getSelectedIndices().length;j++) {
                if(Misc_List.getSelectedIndices()[j]==i){
                    if(quantity>=5) quantity-=5;
                    else quantity-=quantity;
                    try{
                        String query = "update misc set quantity=? where name='"+tempsplit[0]+"'";
                        PreparedStatement pstmt = conn.prepareStatement(query);
                        pstmt.setInt(1,quantity);
                        pstmt.executeUpdate();
                        pstmt.close();
                    }catch(Exception e){System.out.println(e.getMessage());};
                }
            }
        }
        Load_Misc();
    }//GEN-LAST:event_Remove_Misc_ButtonActionPerformed
    // </editor-fold>
    
    //                                                                                                      <editor-fold defaultstate="collapsed" desc="Panel1">
    private void Order_Item_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Order_Item_BoxPopupMenuWillBecomeInvisible
        if(Order_Item_Box.getSelectedIndex()<=0) {
            Order_Name_Box.setEnabled(false);
            Order_Quantity.setEnabled(false);
            Order_Quantity.setEnabled(false);
            Add_Order_Button.setEnabled(false);
            Order_Name_Box.setSelectedItem(null);
            Order_Quantity.setText(null);
        }
        else {
            Order_Name_Box.setEnabled(true);
            Load_Order_Name_Box((String)Order_Item_Box.getSelectedItem());
        }
    }//GEN-LAST:event_Order_Item_BoxPopupMenuWillBecomeInvisible

    private void Order_Name_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Order_Name_BoxPopupMenuWillBecomeInvisible
        if(Order_Name_Box.getSelectedIndex()<=0) {Order_Quantity.setEnabled(false);}
        else Order_Quantity.setEnabled(true);
    }//GEN-LAST:event_Order_Name_BoxPopupMenuWillBecomeInvisible

    private void Order_QuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Order_QuantityKeyReleased
        if(Order_Quantity.getText() == null) Add_Order_Button.setEnabled(false);
        else Add_Order_Button.setEnabled(true);
    }//GEN-LAST:event_Order_QuantityKeyReleased
    
    private void Order_Cost(){
        int totalcost=0;
        for(int i=0;i<order.size();i++){
            String temp=(String)order.get(i);
            String[] tempsplit=temp.split(" : |€|#");
            int price=Integer.parseInt(tempsplit[3]);
            totalcost+=price;
        }
        if(order.isEmpty()){
            Confirm_Order_Button.setEnabled(false);
            Order_Total.setVisible(false);
        }
        else {
            Order_Total.setText("Συνολικό Κόστος : "+totalcost+"€");
            Order_Total.setVisible(true);
            Confirm_Order_Button.setEnabled(true);
        }
    }
    
    private void Add_Order_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Order_ButtonActionPerformed
        DefaultListModel model = new DefaultListModel();
        String temp=(String)Order_Name_Box.getSelectedItem();
        String[] tempsplit=temp.split(" : |€");
        String name=tempsplit[0];
        int price=Integer.parseInt(tempsplit[1]);
        int quantity=Integer.parseInt(Order_Quantity.getText());
        price=price*quantity;
        order.add("#"+quantity+" : "+name+" : "+price+"€");
        for(int i=0;i<order.size();i++) {
            model.addElement(order.get(i));
        }
        Order_List.setModel(model);
        Order_Quantity.setText(null);
        Add_Order_Button.setEnabled(false);
        Panel1.requestFocus();
        Order_Cost();
    }//GEN-LAST:event_Add_Order_ButtonActionPerformed

    private void Remove_Order_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_Order_ButtonActionPerformed
        if(Order_List.getSelectedIndex() != -1) {
            DefaultListModel model = new DefaultListModel();
            int[] index = Order_List.getSelectedIndices();
            for(int i=order.size()-1;i>=0;i--) {
                for (int j=0;j<index.length;j++) {
                    if(i==index[j]) order.remove(i);
                }
            }
            for(int j=0;j<order.size();j++) {
                model.addElement(order.get(j));
            }
            Order_List.setModel(model);
            Order_Cost();
            Remove_Order_Button.setEnabled(false);
        }
    }//GEN-LAST:event_Remove_Order_ButtonActionPerformed

    private void Order_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Order_ListMouseReleased
        if(Order_List.getSelectedIndex() != -1) Remove_Order_Button.setEnabled(true);
    }//GEN-LAST:event_Order_ListMouseReleased

    private void Confirm_Order_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_Order_ButtonActionPerformed
        int medicine_costs=0;
        int hospital_costs=0;
        ArrayList medicine_names = new ArrayList();
        ArrayList medicine_quantity = new ArrayList();
        ArrayList misc_names = new ArrayList();
        ArrayList misc_quantity = new ArrayList();
        try{
            String query = "select name,quantity from medicine";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                medicine_names.add(rs.getString("name"));
                medicine_quantity.add(rs.getInt("quantity"));
            }
            rs.close();
            stmt.close();
            query = "select name,quantity from misc";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while(rs.next()){
                misc_names.add(rs.getString("name"));
                misc_quantity.add(rs.getInt("quantity"));
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        for (int i = 0; i < order.size(); i++) {
            String temp=(String)order.get(i);
            String[] tempsplit=temp.split("#| : |€");
            for(int j=0;j<medicine_names.size();j++){
                if(medicine_names.get(j).equals(tempsplit[2])){
                    int quantity=(Integer)medicine_quantity.get(j)+Integer.parseInt(tempsplit[1]);
                    medicine_costs+=Integer.parseInt(tempsplit[3]);
                    try{
                        String query = "update medicine set quantity=? where name='"+tempsplit[2]+"'";
                        PreparedStatement pstmt = conn.prepareStatement(query);
                        pstmt.setInt(1,quantity);
                        pstmt.executeUpdate();
                        pstmt.close();
                    }catch(Exception e){System.out.println(e.getMessage());};
                }
            }
            for(int j=0;j<misc_names.size();j++){
                if(misc_names.get(j).equals(tempsplit[2])){
                    int quantity=(Integer)misc_quantity.get(j)+Integer.parseInt(tempsplit[1]);
                    hospital_costs+=Integer.parseInt(tempsplit[3]);
                    try{
                        String query = "update misc set quantity=? where name='"+tempsplit[2]+"'";
                        PreparedStatement pstmt = conn.prepareStatement(query);
                        pstmt.setInt(1,quantity);
                        pstmt.executeUpdate();
                        pstmt.close();
                    }catch(Exception e){System.out.println(e.getMessage());};
                }
            }
        }
        Integer year=Calendar.getInstance().get(Calendar.YEAR);
        Integer month=Calendar.getInstance().get(Calendar.MONTH)+1;
        try{
            String query = "insert into outcome (year,month) values (?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1,year);
            pstmt.setInt(2,month);
        }catch(Exception e){System.out.println(e.getMessage());};
        try{
            String query = "select medicine_costs,hospital_costs from outcome where year="+year+" and month="+month;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                medicine_costs+=rs.getInt("medicine_costs");
                hospital_costs+=rs.getInt("hospital_costs");
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        try{
            String query = "update outcome set medicine_costs=?,hospital_costs=? where year="+year+" and month="+month;
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1,medicine_costs);
            pstmt.setInt(2,hospital_costs);
            pstmt.executeUpdate();
            pstmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        Confirm_Order_Button.setEnabled(false);
        order.clear();
        DefaultListModel model = (DefaultListModel) Order_List.getModel();
        model.removeAllElements();
        Order_Cost();
    }//GEN-LAST:event_Confirm_Order_ButtonActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel2">
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel3">
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel4">
    
    // </editor-fold>
    
    //                                                                                                      <editor-fold defaultstate="collapsed" desc="Panel5">
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
            this.setTitle("MedX - Καλώς ήρθες αποθηκάριε - "+user);
        }catch(Exception e){System.out.println(e.getMessage());};
        Load_Account();
    }//GEN-LAST:event_Account_Update_ButtonActionPerformed
    // </editor-fold>
    
}
