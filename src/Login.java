/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NS
 */
public class Login extends JFrame {

    /**
     * Creates new form ATMmain
     */
    String appTitle = "Fingerprint Authentication";
    String key = "";

    Connection conn;

    boolean fingerprintAuthenticated = false;

    String filePath = "";

    Thread trd;

    private JPanel Authentication;
    private JLabel Heading;
    private JPanel Signup;
    private JButton addFingerprint;
    private JButton backBtnAuth;
    private JButton createAcccountBtn;
    private JPanel fingerPrintCheckPanel;
    private JLabel hiddenField;
    private JPanel home;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JTable lastTransactionTable;
    private JPanel lastTransactions;
    private JTextField loginName;
    private JButton logoutBtn;
    private JLayeredPane mainPanel;
    private JPanel moneyTransferPanel;
    private JButton navToHome;
    private JButton navToHome1;
    private JButton navToHome2;
    private JLabel navToLogin;
    private JLabel navToSignup;
    private JLabel navToSignup1;
    private JLabel navToSignup2;
    private JButton nextBtn;
    private JTextField transferAccountName;
    private JTextField transferAmount;
    private JButton transferBtn;
    private JButton transferConformedBtn;
    private JTextField userNameSignup;
    private JButton viewBalanceBtn;
    private JButton viewTransactionBtn;
    private JLabel welcomeText;
    private JPanel withDrawalPanel;
    private JTextField withdrawAmount;
    private JButton withdrawConformedBtn;
    private JButton withdrawalBtn;
    // End of variables declaration//GEN-END:variables

    public Login() throws ClassNotFoundException, SQLException {
        initComponents();
        filePath = System.getProperty("user.dir");
        filePath += "\\AnsiTemplate.ansi";

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Heading = new JLabel();
        mainPanel = new JLayeredPane();
        Authentication = new JPanel();
        loginName = new JTextField();
        jLabel2 = new JLabel();
        nextBtn = new JButton();
        jLabel3 = new JLabel();
        navToSignup = new JLabel();
        Signup = new JPanel();
        userNameSignup = new JTextField();
        addFingerprint = new JButton();
        jLabel5 = new JLabel();
        createAcccountBtn = new JButton();
        jLabel6 = new JLabel();
        navToLogin = new JLabel();
        home = new JPanel();
        welcomeText = new JLabel();
        jLabel4 = new JLabel();
        withdrawalBtn = new JButton();
        viewBalanceBtn = new JButton();
        viewTransactionBtn = new JButton();
        transferBtn = new JButton();
        logoutBtn = new JButton();
        withDrawalPanel = new JPanel();
        withdrawAmount = new JTextField();
        navToHome = new JButton();
        jLabel7 = new JLabel();
        withdrawConformedBtn = new JButton();
        jLabel8 = new JLabel();
        navToSignup1 = new JLabel();
        moneyTransferPanel = new JPanel();
        transferAccountName = new JTextField();
        navToHome1 = new JButton();
        jLabel9 = new JLabel();
        transferConformedBtn = new JButton();
        jLabel10 = new JLabel();
        navToSignup2 = new JLabel();
        jLabel11 = new JLabel();
        transferAmount = new JTextField();
        lastTransactions = new JPanel();
        navToHome2 = new JButton();
        jLabel12 = new JLabel();
        jScrollPane1 = new JScrollPane();
        lastTransactionTable = new JTable();
        fingerPrintCheckPanel = new JPanel();
        jLabel13 = new JLabel();
        jLabel15 = new JLabel();
        jLabel14 = new JLabel();
        backBtnAuth = new JButton();
        jSeparator1 = new JSeparator();
        hiddenField = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Heading.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Heading.setHorizontalAlignment(SwingConstants.CENTER);
        Heading.setText("Fingerprint Authentication - ATM");

        mainPanel.setLayout(new java.awt.CardLayout());

        loginName.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        loginName.setHorizontalAlignment(JTextField.CENTER);
        loginName.setToolTipText("Username");
        loginName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //loginNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Login");

        nextBtn.setBackground(new java.awt.Color(0, 204, 0));
        nextBtn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        nextBtn.setText("Next >");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // nextBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(143, 143, 152));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setLabelFor(home);
        jLabel3.setText("Enter your username");
        jLabel3.setToolTipText("");

        navToSignup.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        navToSignup.setForeground(new java.awt.Color(77, 77, 223));
        navToSignup.setHorizontalAlignment(SwingConstants.CENTER);
        navToSignup.setLabelFor(home);
        navToSignup.setText("Click here to create a new account");
        navToSignup.setToolTipText("");
        navToSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navToSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                 navToSignupMouseClicked(evt);
            }
        });

        GroupLayout AuthenticationLayout = new GroupLayout(Authentication);
        Authentication.setLayout(AuthenticationLayout);
        AuthenticationLayout.setHorizontalGroup(
                AuthenticationLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(AuthenticationLayout.createSequentialGroup()
                                .addContainerGap(386, Short.MAX_VALUE)
                                .addGroup(AuthenticationLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, AuthenticationLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(loginName, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3)
                                                .addGroup(AuthenticationLayout.createSequentialGroup()
                                                        .addGap(48, 48, 48)
                                                        .addGroup(AuthenticationLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(GroupLayout.Alignment.TRAILING, AuthenticationLayout.createSequentialGroup()
                                                                        .addComponent(jLabel2)
                                                                        .addGap(487, 487, 487))
                                                                .addGroup(GroupLayout.Alignment.TRAILING, AuthenticationLayout.createSequentialGroup()
                                                                        .addComponent(navToSignup)
                                                                        .addGap(400, 400, 400)))))
                                        .addGroup(GroupLayout.Alignment.TRAILING, AuthenticationLayout.createSequentialGroup()
                                                .addComponent(nextBtn, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                                .addGap(438, 438, 438))))
        );
        AuthenticationLayout.setVerticalGroup(
                AuthenticationLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(AuthenticationLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel2)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(loginName, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(nextBtn, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(navToSignup, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(39, Short.MAX_VALUE))
        );


        mainPanel.add(Authentication, "card2");



        userNameSignup.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        userNameSignup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameSignup.setToolTipText("Username");
        userNameSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //userNameSignupActionPerformed(evt);
            }
        });

        addFingerprint.setBackground(new java.awt.Color(255, 255, 255));
        addFingerprint.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        addFingerprint.setText("Add Fingerprint");
        addFingerprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //addFingerprintActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Create an Account");

        createAcccountBtn.setBackground(new java.awt.Color(0, 255, 0));
        createAcccountBtn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        createAcccountBtn.setText("Create Account");
        createAcccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //createAcccountBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(143, 143, 152));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setLabelFor(home);
        jLabel6.setText("Place your fingerand press add fingerprint button");
        jLabel6.setToolTipText("");

        navToLogin.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        navToLogin.setForeground(new java.awt.Color(77, 77, 223));
        navToLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navToLogin.setLabelFor(home);
        navToLogin.setText("Click here to login");
        navToLogin.setToolTipText("");
        navToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //navToLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SignupLayout = new javax.swing.GroupLayout(Signup);
        Signup.setLayout(SignupLayout);
        SignupLayout.setHorizontalGroup(
                SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SignupLayout.createSequentialGroup()
                                .addContainerGap(378, Short.MAX_VALUE)
                                .addGroup(SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignupLayout.createSequentialGroup()
                                                .addGroup(SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(addFingerprint, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userNameSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))
                                                .addGap(364, 364, 364))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignupLayout.createSequentialGroup()
                                                .addGroup(SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(createAcccountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                        .addComponent(navToLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(441, 441, 441))))
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SignupLayout.setVerticalGroup(
                SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SignupLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel5)
                                .addGap(75, 75, 75)
                                .addComponent(userNameSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(addFingerprint, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(53, 53, 53)
                                .addComponent(createAcccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(navToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(46, Short.MAX_VALUE))
        );

        mainPanel.add(Signup, "card2");

        welcomeText.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        welcomeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeText.setText("Welcome, ");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel4.setText("What would you like to do?");

        withdrawalBtn.setBackground(new java.awt.Color(255, 255, 255));
        withdrawalBtn.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        withdrawalBtn.setText("Withdrawal");
        withdrawalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //withdrawalBtnActionPerformed(evt);
            }
        });

        viewBalanceBtn.setBackground(new java.awt.Color(255, 255, 255));
        viewBalanceBtn.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        viewBalanceBtn.setText("View Balance");
        viewBalanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //viewBalanceBtnActionPerformed(evt);
            }
        });

        viewTransactionBtn.setBackground(new java.awt.Color(255, 255, 255));
        viewTransactionBtn.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        viewTransactionBtn.setText("View Transactions");
        viewTransactionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // viewTransactionBtnActionPerformed(evt);
            }
        });

        transferBtn.setBackground(new java.awt.Color(255, 255, 255));
        transferBtn.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        transferBtn.setText("Money Transfer");
        transferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // transferBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(255, 0, 0));
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
                homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(welcomeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(homeLayout.createSequentialGroup()
                                                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(viewTransactionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(withdrawalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(199, 199, 199)
                                                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(viewBalanceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(transferBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(homeLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(63, 63, 63)
                                                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(265, 265, 265))
        );
        homeLayout.setVerticalGroup(
                homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(welcomeText)
                                .addGap(31, 31, 31)
                                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(withdrawalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewBalanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(114, 114, 114)
                                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(viewTransactionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(transferBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(home, "card4");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(mainPanel)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(hiddenField)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Heading, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(Heading, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(hiddenField, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, 489, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }

   private boolean navToPanel(JPanel jpanel) {

        this.mainPanel.removeAll();
        this.mainPanel.add(jpanel);
        this.mainPanel.repaint();
        this.mainPanel.revalidate();

        return true;
    }

          private void navToSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navToSignupMouseClicked
           // TODO add your handling code here:
                 navToPanel(this.Signup);
            }//GEN-LAST:event_navToSignupMouseClicked
        public static void main (String args[]){
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
             */
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        new Login().setVisible(true);
                    } catch (ClassNotFoundException ex) {

                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        }
    }


