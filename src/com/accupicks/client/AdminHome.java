/*
 * Sport score preditcion software
 * by Ronnie Muller & Stephan Malan
 */
package com.accupicks.client;

import com.shared.Client;
import javax.swing.ImageIcon;

public class AdminHome extends javax.swing.JFrame {

    private final Client CLIENT;
    
    public AdminHome(Client client) {
        CLIENT = client;
        initComponents();
        setLocationRelativeTo(null);
        accountNameLbl.setText(CLIENT.getName());
        backgroundLbl.setIcon(new ImageIcon(new ImageIcon(AdminHome.class.getResource("/resources/HomeBackground1.jpg")).getImage().getScaledInstance(1366, 768, java.awt.Image.SCALE_SMOOTH)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPnl = new javax.swing.JPanel();
        HomeLbl = new javax.swing.JLabel();
        accountNameLbl = new javax.swing.JLabel();
        CreateTournamentBtn = new javax.swing.JButton();
        administratorLbl = new javax.swing.JLabel();
        AddMatchToTournamentBtn = new javax.swing.JButton();
        EnterResultBtn = new javax.swing.JButton();
        KeepLiveScoreBtn = new javax.swing.JButton();
        AddRemoveEditPlayerBtn = new javax.swing.JButton();
        HelpBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        accupicksLbl = new javax.swing.JLabel();
        RegisterOrRemoveATeamOrPlayerBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));

        backgroundPnl.setBackground(new java.awt.Color(51, 51, 51));
        backgroundPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        backgroundPnl.setOpaque(false);
        backgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeLbl.setBackground(new java.awt.Color(51, 51, 51));
        HomeLbl.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        HomeLbl.setForeground(new java.awt.Color(255, 255, 255));
        HomeLbl.setText("Home");
        backgroundPnl.add(HomeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 115, -1, -1));

        accountNameLbl.setBackground(new java.awt.Color(51, 51, 51));
        accountNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        accountNameLbl.setText("AccountName");
        backgroundPnl.add(accountNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 215, -1, -1));

        CreateTournamentBtn.setBackground(new java.awt.Color(51, 51, 51));
        CreateTournamentBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreateTournamentBtn.setText("Create Tournament");
        CreateTournamentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateTournamentBtnActionPerformed(evt);
            }
        });
        backgroundPnl.add(CreateTournamentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 266, 250, 40));

        administratorLbl.setBackground(new java.awt.Color(51, 51, 51));
        administratorLbl.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        administratorLbl.setForeground(new java.awt.Color(255, 255, 255));
        administratorLbl.setText("Adminastrator");
        backgroundPnl.add(administratorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 185, 137, -1));

        AddMatchToTournamentBtn.setBackground(new java.awt.Color(51, 51, 51));
        AddMatchToTournamentBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddMatchToTournamentBtn.setText("Add Match to Tournament");
        AddMatchToTournamentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMatchToTournamentBtnActionPerformed(evt);
            }
        });
        backgroundPnl.add(AddMatchToTournamentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 346, 250, 40));

        EnterResultBtn.setBackground(new java.awt.Color(51, 51, 51));
        EnterResultBtn.setForeground(new java.awt.Color(255, 255, 255));
        EnterResultBtn.setText("Enter Result");
        backgroundPnl.add(EnterResultBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 346, 250, 40));

        KeepLiveScoreBtn.setBackground(new java.awt.Color(51, 51, 51));
        KeepLiveScoreBtn.setForeground(new java.awt.Color(255, 255, 255));
        KeepLiveScoreBtn.setText("Keep Live Score");
        KeepLiveScoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeepLiveScoreBtnActionPerformed(evt);
            }
        });
        backgroundPnl.add(KeepLiveScoreBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 266, 250, 40));

        AddRemoveEditPlayerBtn.setBackground(new java.awt.Color(51, 51, 51));
        AddRemoveEditPlayerBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddRemoveEditPlayerBtn.setText("Add/Remove/Edit User");
        backgroundPnl.add(AddRemoveEditPlayerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 266, 250, 40));

        HelpBtn.setBackground(new java.awt.Color(51, 51, 51));
        HelpBtn.setForeground(new java.awt.Color(255, 255, 255));
        HelpBtn.setText("Help");
        backgroundPnl.add(HelpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 346, 250, 40));

        LogOutBtn.setBackground(new java.awt.Color(51, 51, 51));
        LogOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setText("Log Out");
        backgroundPnl.add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 652, 250, 40));

        accupicksLbl.setBackground(new java.awt.Color(51, 51, 51));
        accupicksLbl.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        accupicksLbl.setForeground(new java.awt.Color(255, 255, 255));
        accupicksLbl.setText("AccuPicks");
        backgroundPnl.add(accupicksLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 29, -1, -1));

        RegisterOrRemoveATeamOrPlayerBtn.setBackground(new java.awt.Color(51, 51, 51));
        RegisterOrRemoveATeamOrPlayerBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegisterOrRemoveATeamOrPlayerBtn.setText("Register or Remove a Team or Player");
        RegisterOrRemoveATeamOrPlayerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterOrRemoveATeamOrPlayerBtnActionPerformed(evt);
            }
        });
        backgroundPnl.add(RegisterOrRemoveATeamOrPlayerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 427, 250, 40));
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
                .addComponent(backgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateTournamentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateTournamentBtnActionPerformed
        new CreateTournament().setVisible(true);
        dispose();
    }//GEN-LAST:event_CreateTournamentBtnActionPerformed

    private void AddMatchToTournamentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMatchToTournamentBtnActionPerformed

    }//GEN-LAST:event_AddMatchToTournamentBtnActionPerformed

    private void KeepLiveScoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeepLiveScoreBtnActionPerformed

    }//GEN-LAST:event_KeepLiveScoreBtnActionPerformed

    private void RegisterOrRemoveATeamOrPlayerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterOrRemoveATeamOrPlayerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterOrRemoveATeamOrPlayerBtnActionPerformed

    public static void main(String[] args) {
        new AdminHome(new Client(0, "admin", "admin", "temp")).setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMatchToTournamentBtn;
    private javax.swing.JButton AddRemoveEditPlayerBtn;
    private javax.swing.JButton CreateTournamentBtn;
    private javax.swing.JButton EnterResultBtn;
    private javax.swing.JButton HelpBtn;
    private javax.swing.JLabel HomeLbl;
    private javax.swing.JButton KeepLiveScoreBtn;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton RegisterOrRemoveATeamOrPlayerBtn;
    private javax.swing.JLabel accountNameLbl;
    private javax.swing.JLabel accupicksLbl;
    private javax.swing.JLabel administratorLbl;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JPanel backgroundPnl;
    // End of variables declaration//GEN-END:variables
}
