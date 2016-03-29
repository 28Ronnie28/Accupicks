/*
 * Sport score preditcion software
 * by Ronnie Muller & Stephan Malan
 */
package com.accupicks.client;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Ronnie
 */
public class RugbyLiveScoreKeepingInfo extends javax.swing.JFrame {

    /**
     * Creates new form RugbyLiveScoreKeepingInfo
     */
    public RugbyLiveScoreKeepingInfo() {
        initComponents();
        
        setLayout(new BorderLayout());
	JLabel background=new JLabel(new ImageIcon("../AccuPicks/src/resources/RugbyBackground.png"));
	add(background);
	background.setLayout(new FlowLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        RugbyHeaderLbl = new javax.swing.JLabel();
        AccountNameLbl = new javax.swing.JLabel();
        GoToMatchBtn = new javax.swing.JButton();
        SevensOrFullHeaderLbl = new javax.swing.JLabel();
        HalfLengthCmb = new javax.swing.JComboBox();
        SevensFullCmb = new javax.swing.JComboBox();
        LiveScoreKeepingInfoHeaderLbl = new javax.swing.JLabel();
        HalfLengthHeaderLbl = new javax.swing.JLabel();
        AccuPicksHeaderLbl = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        SetPlayerPositionsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(51, 51, 51));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        MainPanel.setOpaque(false);

        RugbyHeaderLbl.setBackground(new java.awt.Color(51, 51, 51));
        RugbyHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        RugbyHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        RugbyHeaderLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RugbyHeaderLbl.setText("Rugby");

        AccountNameLbl.setBackground(new java.awt.Color(51, 51, 51));
        AccountNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        AccountNameLbl.setText("AccountName");

        GoToMatchBtn.setBackground(new java.awt.Color(51, 51, 51));
        GoToMatchBtn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        GoToMatchBtn.setForeground(new java.awt.Color(255, 255, 255));
        GoToMatchBtn.setText("GO TO Match");
        GoToMatchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToMatchBtnActionPerformed(evt);
            }
        });

        SevensOrFullHeaderLbl.setBackground(new java.awt.Color(51, 51, 51));
        SevensOrFullHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        SevensOrFullHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        SevensOrFullHeaderLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SevensOrFullHeaderLbl.setText("7's or Full 15:");

        HalfLengthCmb.setBackground(new java.awt.Color(51, 51, 51));
        HalfLengthCmb.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        HalfLengthCmb.setForeground(new java.awt.Color(255, 255, 255));
        HalfLengthCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Minute", "2 Minutes", "3 Minutes", "4 Minutes", "5 Minutes", "6 Minutes", "7 Minutes", "8 Minutes", "9 Minutes", "10 Minutes", "11 Minutes", "12 Minutes", "13 Minutes", "14 Minutes", "15 Minutes", "16 Minutes", "17 Minutes", "18 Minutes", "19 Minutes", "20 Minutes", "21 Minutes", "22 Minutes", "23 Minutes", "24 Minutes", "25 Minutes", "26 Minutes", "27 Minutes", "28 Minutes", "29 Minutes", "30 Minutes", "31 Minutes", "32 Minutes", "33 Minutes", "34 Minutes", "35 Minutes", "36 Minutes", "37 Minutes", "38 Minutes", "39 Minutes", "40 Minutes" }));

        SevensFullCmb.setBackground(new java.awt.Color(51, 51, 51));
        SevensFullCmb.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        SevensFullCmb.setForeground(new java.awt.Color(255, 255, 255));
        SevensFullCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7'S", "Full 15" }));

        LiveScoreKeepingInfoHeaderLbl.setBackground(new java.awt.Color(51, 51, 51));
        LiveScoreKeepingInfoHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        LiveScoreKeepingInfoHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        LiveScoreKeepingInfoHeaderLbl.setText("Live Score Keeping Info");

        HalfLengthHeaderLbl.setBackground(new java.awt.Color(51, 51, 51));
        HalfLengthHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        HalfLengthHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        HalfLengthHeaderLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HalfLengthHeaderLbl.setText("How Long will a half be:");

        AccuPicksHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        AccuPicksHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        AccuPicksHeaderLbl.setText("AccuPicks");

        BackBtn.setBackground(new java.awt.Color(51, 51, 51));
        BackBtn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        SetPlayerPositionsBtn.setBackground(new java.awt.Color(51, 51, 51));
        SetPlayerPositionsBtn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        SetPlayerPositionsBtn.setForeground(new java.awt.Color(255, 255, 255));
        SetPlayerPositionsBtn.setText("Set Player Positions");
        SetPlayerPositionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetPlayerPositionsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SevensOrFullHeaderLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HalfLengthHeaderLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HalfLengthCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SevensFullCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GoToMatchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(SetPlayerPositionsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(515, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccuPicksHeaderLbl)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RugbyHeaderLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LiveScoreKeepingInfoHeaderLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(481, 481, 481))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(AccountNameLbl)
                        .addGap(614, 614, 614))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(AccuPicksHeaderLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RugbyHeaderLbl)
                .addGap(18, 18, 18)
                .addComponent(LiveScoreKeepingInfoHeaderLbl)
                .addGap(18, 18, 18)
                .addComponent(AccountNameLbl)
                .addGap(55, 55, 55)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HalfLengthCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HalfLengthHeaderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SevensFullCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SevensOrFullHeaderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SetPlayerPositionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(GoToMatchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoToMatchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToMatchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GoToMatchBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        new LiveScoreKeepingHome().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SetPlayerPositionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetPlayerPositionsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetPlayerPositionsBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(RugbyLiveScoreKeepingInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RugbyLiveScoreKeepingInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RugbyLiveScoreKeepingInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RugbyLiveScoreKeepingInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RugbyLiveScoreKeepingInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountNameLbl;
    private javax.swing.JLabel AccuPicksHeaderLbl;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton GoToMatchBtn;
    private javax.swing.JComboBox HalfLengthCmb;
    private javax.swing.JLabel HalfLengthHeaderLbl;
    private javax.swing.JLabel LiveScoreKeepingInfoHeaderLbl;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel RugbyHeaderLbl;
    private javax.swing.JButton SetPlayerPositionsBtn;
    private javax.swing.JComboBox SevensFullCmb;
    private javax.swing.JLabel SevensOrFullHeaderLbl;
    // End of variables declaration//GEN-END:variables
}