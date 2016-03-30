/*
 * Sport score preditcion software
 * by Ronnie Muller & Stephan Malan
 */
package com.accupicks.client;

import com.shared.Client;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class AdminHome extends javax.swing.JFrame {

    private final Client CLIENT;
    JLabel backgroundLbl2 = new JLabel();
    
    public AdminHome(Client client) {
        CLIENT = client;
        initComponents();
        setLocationRelativeTo(null);
        AccountNameLbl.setText(CLIENT.getName());
        
        setLayout(new BorderLayout());
        add(backgroundLbl2);
        backgroundLbl2.setIcon(new ImageIcon(new ImageIcon(AdminHome.class.getResource("/resources/HomeBackground1.jpg")).getImage().getScaledInstance(1366, 768, java.awt.Image.SCALE_SMOOTH)));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        HomeHeaderLbl = new javax.swing.JLabel();
        AccountNameLbl = new javax.swing.JLabel();
        CreateTournamentBtn = new javax.swing.JButton();
        AdministratorHeaderLbl = new javax.swing.JLabel();
        AddMatchToTournamentBtn = new javax.swing.JButton();
        EnterResultBtn = new javax.swing.JButton();
        KeepLiveScoreBtn = new javax.swing.JButton();
        AddRemoveEditPlayerBtn = new javax.swing.JButton();
        HelpBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        AccuPicksHeaderLbl = new javax.swing.JLabel();
        RegisterOrRemoveATeamOrPlayerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));

        MainPanel.setBackground(new java.awt.Color(51, 51, 51));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        MainPanel.setOpaque(false);
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeHeaderLbl.setBackground(new java.awt.Color(51, 51, 51));
        HomeHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        HomeHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        HomeHeaderLbl.setText("Home");
        MainPanel.add(HomeHeaderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 115, -1, -1));

        AccountNameLbl.setBackground(new java.awt.Color(51, 51, 51));
        AccountNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        AccountNameLbl.setText("AccountName");
        MainPanel.add(AccountNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 215, -1, -1));

        CreateTournamentBtn.setBackground(new java.awt.Color(51, 51, 51));
        CreateTournamentBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreateTournamentBtn.setText("Create Tournament");
        CreateTournamentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateTournamentBtnActionPerformed(evt);
            }
        });
        MainPanel.add(CreateTournamentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 266, 250, 40));

        AdministratorHeaderLbl.setBackground(new java.awt.Color(51, 51, 51));
        AdministratorHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        AdministratorHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        AdministratorHeaderLbl.setText("Adminastrator");
        MainPanel.add(AdministratorHeaderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 185, 137, -1));

        AddMatchToTournamentBtn.setBackground(new java.awt.Color(51, 51, 51));
        AddMatchToTournamentBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddMatchToTournamentBtn.setText("Add Match to Tournament");
        AddMatchToTournamentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMatchToTournamentBtnActionPerformed(evt);
            }
        });
        MainPanel.add(AddMatchToTournamentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 346, 250, 40));

        EnterResultBtn.setBackground(new java.awt.Color(51, 51, 51));
        EnterResultBtn.setForeground(new java.awt.Color(255, 255, 255));
        EnterResultBtn.setText("Enter Result");
        MainPanel.add(EnterResultBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 346, 250, 40));

        KeepLiveScoreBtn.setBackground(new java.awt.Color(51, 51, 51));
        KeepLiveScoreBtn.setForeground(new java.awt.Color(255, 255, 255));
        KeepLiveScoreBtn.setText("Keep Live Score");
        KeepLiveScoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeepLiveScoreBtnActionPerformed(evt);
            }
        });
        MainPanel.add(KeepLiveScoreBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 266, 250, 40));

        AddRemoveEditPlayerBtn.setBackground(new java.awt.Color(51, 51, 51));
        AddRemoveEditPlayerBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddRemoveEditPlayerBtn.setText("Add/Remove/Edit User");
        MainPanel.add(AddRemoveEditPlayerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 266, 250, 40));

        HelpBtn.setBackground(new java.awt.Color(51, 51, 51));
        HelpBtn.setForeground(new java.awt.Color(255, 255, 255));
        HelpBtn.setText("Help");
        MainPanel.add(HelpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 346, 250, 40));

        LogOutBtn.setBackground(new java.awt.Color(51, 51, 51));
        LogOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setText("Log Out");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        MainPanel.add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 652, 250, 40));

        AccuPicksHeaderLbl.setBackground(new java.awt.Color(51, 51, 51));
        AccuPicksHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        AccuPicksHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        AccuPicksHeaderLbl.setText("AccuPicks");
        MainPanel.add(AccuPicksHeaderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 29, -1, -1));

        RegisterOrRemoveATeamOrPlayerBtn.setBackground(new java.awt.Color(51, 51, 51));
        RegisterOrRemoveATeamOrPlayerBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegisterOrRemoveATeamOrPlayerBtn.setText("Register or Remove a Team or Player");
        RegisterOrRemoveATeamOrPlayerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterOrRemoveATeamOrPlayerBtnActionPerformed(evt);
            }
        });
        MainPanel.add(RegisterOrRemoveATeamOrPlayerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 427, 250, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateTournamentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateTournamentBtnActionPerformed
        new CreateTournament(CLIENT).setVisible(true);
        dispose();
    }//GEN-LAST:event_CreateTournamentBtnActionPerformed

    private void AddMatchToTournamentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMatchToTournamentBtnActionPerformed
        
    }//GEN-LAST:event_AddMatchToTournamentBtnActionPerformed

    private void KeepLiveScoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeepLiveScoreBtnActionPerformed
        new LiveScoreKeepingHome(CLIENT).setVisible(true);
        dispose();
    }//GEN-LAST:event_KeepLiveScoreBtnActionPerformed

    private void RegisterOrRemoveATeamOrPlayerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterOrRemoveATeamOrPlayerBtnActionPerformed
        new RegRemTeamPlayer(CLIENT).setVisible(true);
        dispose();
    }//GEN-LAST:event_RegisterOrRemoveATeamOrPlayerBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        new LogIn().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogOutBtnActionPerformed

    public static void main(String[] args) {
        new AdminHome(new Client(0, "admin", "admin", "temp")).setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountNameLbl;
    private javax.swing.JLabel AccuPicksHeaderLbl;
    private javax.swing.JButton AddMatchToTournamentBtn;
    private javax.swing.JButton AddRemoveEditPlayerBtn;
    private javax.swing.JLabel AdministratorHeaderLbl;
    private javax.swing.JButton CreateTournamentBtn;
    private javax.swing.JButton EnterResultBtn;
    private javax.swing.JButton HelpBtn;
    private javax.swing.JLabel HomeHeaderLbl;
    private javax.swing.JButton KeepLiveScoreBtn;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton RegisterOrRemoveATeamOrPlayerBtn;
    // End of variables declaration//GEN-END:variables
}
