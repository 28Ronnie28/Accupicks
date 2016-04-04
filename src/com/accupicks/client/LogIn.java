/*
 * Sport score preditcion software
 * by Ronnie Muller & Stephan Malan
 */
package com.accupicks.client;

import com.shared.Client;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {
JLabel backgroundLbl = new JLabel();

private ClientConenctionHandler cch;
private Client client;

    public LogIn() {
        initComponents();
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        add(backgroundLbl);
        backgroundLbl.setIcon(new ImageIcon(new ImageIcon(AdminHome.class.getResource("/resources/HomeBackground1.jpg")).getImage().getScaledInstance(1366, 768, java.awt.Image.SCALE_SMOOTH)));
        cch = new ClientConenctionHandler();
        connect();
    }

    public void connect() {
          int count = 1;
        while (!cch.connect() && count < 10) {
            System.out.println("Client> Trying to connect to server... " + ++count);
        }
        if (count == 11) {
            System.out.println("Client> Could not contact server, please try again later");
            System.exit(0);
        } else {
            System.out.println("Client> Connection with server established");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        PasswordHeaderLbl = new javax.swing.JLabel();
        AccountNameTxf = new javax.swing.JTextField();
        LogInBtn = new javax.swing.JButton();
        PasswordTxf = new javax.swing.JPasswordField();
        AccountNameHeaderLbl = new javax.swing.JLabel();
        AccupicksHeaderLbl = new javax.swing.JLabel();
        ForgotPasswordLbl = new javax.swing.JLabel();
        RegisterBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(51, 51, 51));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        MainPanel.setOpaque(false);
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PasswordHeaderLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        PasswordHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        PasswordHeaderLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PasswordHeaderLbl.setText("Password:");
        MainPanel.add(PasswordHeaderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 309, 153, 40));

        AccountNameTxf.setBackground(new java.awt.Color(51, 51, 51));
        AccountNameTxf.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AccountNameTxf.setForeground(new java.awt.Color(255, 255, 255));
        AccountNameTxf.setText("admin");
        MainPanel.add(AccountNameTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 251, 250, 40));

        LogInBtn.setBackground(new java.awt.Color(51, 51, 51));
        LogInBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LogInBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogInBtn.setText("Log In");
        LogInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInBtnActionPerformed(evt);
            }
        });
        MainPanel.add(LogInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 380, 250, 40));

        PasswordTxf.setBackground(new java.awt.Color(51, 51, 51));
        PasswordTxf.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        PasswordTxf.setForeground(new java.awt.Color(255, 255, 255));
        PasswordTxf.setText("admin");
        MainPanel.add(PasswordTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 310, 250, 40));

        AccountNameHeaderLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AccountNameHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        AccountNameHeaderLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AccountNameHeaderLbl.setText("Account Name:");
        MainPanel.add(AccountNameHeaderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, 40));

        AccupicksHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        AccupicksHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        AccupicksHeaderLbl.setText("AccuPicks");
        MainPanel.add(AccupicksHeaderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 37, -1, -1));

        ForgotPasswordLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ForgotPasswordLbl.setForeground(new java.awt.Color(255, 255, 255));
        ForgotPasswordLbl.setText("Forgot Password?");
        ForgotPasswordLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotPasswordLblMouseClicked(evt);
            }
        });
        MainPanel.add(ForgotPasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 309, 230, 40));

        RegisterBtn.setBackground(new java.awt.Color(51, 51, 51));
        RegisterBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        RegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegisterBtn.setText("Register For AccuPicks");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });
        MainPanel.add(RegisterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 380, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1342, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInBtnActionPerformed
        int reply = cch.authorise(AccountNameTxf.getText(), String.valueOf(PasswordTxf.getPassword()));
    switch (reply) {
        case 1:
            System.out.println("Client> Authorised Admin");
            client = cch.getClient();
            new AdminHome(client).setVisible(true);
            dispose();
            break;
        case 0:
            System.out.println("Client> Authorised Client");
            client = cch.getClient();
            //TODO send to client home
            break;
        default:
            System.out.println("Client> Incorrect username or password");
            break;
    }
    }//GEN-LAST:event_LogInBtnActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed

    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void ForgotPasswordLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordLblMouseClicked
        // TODO forgot password
        String username;
        while ((username = JOptionPane.showInputDialog("Enter username to send email with password")) != null && username.equals("") && username.length() < 4);
        if (username != null) {
            cch.forgotPassword(username);
        }
    }//GEN-LAST:event_ForgotPasswordLblMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountNameHeaderLbl;
    private javax.swing.JTextField AccountNameTxf;
    private javax.swing.JLabel AccupicksHeaderLbl;
    private javax.swing.JLabel ForgotPasswordLbl;
    private javax.swing.JButton LogInBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel PasswordHeaderLbl;
    private javax.swing.JPasswordField PasswordTxf;
    private javax.swing.JButton RegisterBtn;
    // End of variables declaration//GEN-END:variables
}
