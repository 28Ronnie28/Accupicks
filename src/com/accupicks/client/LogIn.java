/*
 * Sport score preditcion software
 * by Ronnie Muller & Stephan Malan
 */
package com.accupicks.client;

import com.shared.Client;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    private ClientConenctionHandler cch;
    private Client client;

    public LogIn() {
        initComponents();
        setLocationRelativeTo(null);
        backgroundLbl.setIcon(new ImageIcon(new ImageIcon(LogIn.class.getResource("/resources/HomeBackground1.jpg")).getImage().getScaledInstance(1366, 768, java.awt.Image.SCALE_SMOOTH)));
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

        backgroundPnl = new javax.swing.JPanel();
        passwordLbl = new javax.swing.JLabel();
        AccountNametxf = new javax.swing.JTextField();
        LogInBtn = new javax.swing.JButton();
        Passwordtxf = new javax.swing.JPasswordField();
        accountLbl = new javax.swing.JLabel();
        accupicksLbl = new javax.swing.JLabel();
        forgetPasswordLbl = new javax.swing.JLabel();
        RegisterBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        backgroundPnl.setBackground(new java.awt.Color(51, 51, 51));
        backgroundPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        backgroundPnl.setOpaque(false);
        backgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordLbl.setText("Password:");
        backgroundPnl.add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 309, 153, 40));

        AccountNametxf.setBackground(new java.awt.Color(51, 51, 51));
        AccountNametxf.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AccountNametxf.setForeground(new java.awt.Color(255, 255, 255));
        AccountNametxf.setText("admin");
        backgroundPnl.add(AccountNametxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 251, 250, 40));

        LogInBtn.setBackground(new java.awt.Color(51, 51, 51));
        LogInBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LogInBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogInBtn.setText("Log In");
        LogInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInBtnActionPerformed(evt);
            }
        });
        backgroundPnl.add(LogInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 380, 250, 40));

        Passwordtxf.setBackground(new java.awt.Color(51, 51, 51));
        Passwordtxf.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Passwordtxf.setForeground(new java.awt.Color(255, 255, 255));
        Passwordtxf.setText("admin");
        backgroundPnl.add(Passwordtxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 310, 250, 40));

        accountLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        accountLbl.setForeground(new java.awt.Color(255, 255, 255));
        accountLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        accountLbl.setText("Account Name:");
        backgroundPnl.add(accountLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, 40));

        accupicksLbl.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        accupicksLbl.setForeground(new java.awt.Color(255, 255, 255));
        accupicksLbl.setText("AccuPicks");
        backgroundPnl.add(accupicksLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 37, -1, -1));

        forgetPasswordLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        forgetPasswordLbl.setForeground(new java.awt.Color(255, 255, 255));
        forgetPasswordLbl.setText("Forgot Password?");
        forgetPasswordLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetPasswordLblMouseClicked(evt);
            }
        });
        backgroundPnl.add(forgetPasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 309, 230, 40));

        RegisterBtn.setBackground(new java.awt.Color(51, 51, 51));
        RegisterBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        RegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegisterBtn.setText("Register For AccuPicks");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });
        backgroundPnl.add(RegisterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 380, -1, 40));
        backgroundPnl.add(backgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 1340, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInBtnActionPerformed
        if (cch.authorise(AccountNametxf.getText(), String.valueOf(Passwordtxf.getPassword()))) {
            System.out.println("Client> Authorised");
            client = cch.getClient();
            System.out.println("Client> Welcome " + client.getName());
            new AdminHome(client).setVisible(true);
            dispose();
        } else {
            System.out.println("Client> Incorrect username or password");
        }
    }//GEN-LAST:event_LogInBtnActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed

    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void forgetPasswordLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetPasswordLblMouseClicked
        // TODO forgot password
        String username;
        while ((username = JOptionPane.showInputDialog("Enter username")) == null && username.length() < 4);
    }//GEN-LAST:event_forgetPasswordLblMouseClicked

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
    private javax.swing.JTextField AccountNametxf;
    private javax.swing.JButton LogInBtn;
    private javax.swing.JPasswordField Passwordtxf;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JLabel accountLbl;
    private javax.swing.JLabel accupicksLbl;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JPanel backgroundPnl;
    private javax.swing.JLabel forgetPasswordLbl;
    private javax.swing.JLabel passwordLbl;
    // End of variables declaration//GEN-END:variables
}
