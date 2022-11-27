
 * @author Elvis
 */
public class landingPage extends javax.swing.JFrame {

    public landingPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        landingPageFrame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        landingPageSignIn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Slint Bank");
        setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(511, 532));
        setResizable(false);

        landingPageFrame.setBackground(new java.awt.Color(0, 0, 51));
        landingPageFrame.setForeground(new java.awt.Color(255, 255, 255));
        landingPageFrame.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SLINT BANK");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        landingPageSignIn.setBackground(new java.awt.Color(255, 255, 255));
        landingPageSignIn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        landingPageSignIn.setForeground(new java.awt.Color(0, 0, 51));
        landingPageSignIn.setText("SIGN IN");
        landingPageSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                landingPageSignInActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.setText("SIGN UP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Existing User?");

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("New User");

        javax.swing.GroupLayout landingPageFrameLayout = new javax.swing.GroupLayout(landingPageFrame);
        landingPageFrame.setLayout(landingPageFrameLayout);
        landingPageFrameLayout.setHorizontalGroup(
            landingPageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landingPageFrameLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(landingPageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, landingPageFrameLayout.createSequentialGroup()
                        .addGroup(landingPageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(landingPageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(landingPageSignIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, landingPageFrameLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, landingPageFrameLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(209, 209, 209))))
        );
        landingPageFrameLayout.setVerticalGroup(
            landingPageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landingPageFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(landingPageSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(83, 83, 83)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(189, 189, 189))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(landingPageFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(landingPageFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Slint Bank");

        pack();
    }

    private void landingPageSignInActionPerformed(java.awt.event.ActionEvent evt) {
        signIn signInForm = new signIn();
        signInForm.setVisible(true);
        landingPageFrame.setVisible(false);

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        signUp signUpForm = new signUp();
        signUpForm.setVisible(true);
        landingPageFrame.setVisible(false);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(landingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(landingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(landingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(landingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new landingPage().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel landingPageFrame;
    private javax.swing.JButton landingPageSignIn;
}
