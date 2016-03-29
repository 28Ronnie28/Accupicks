/*
 * Sport score preditcion software
 * by Ronnie Muller & Stephan Malan
 */
package com.accupicks.client;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Ronnie
 */
public class CricketLiveScoreKeepingInfo extends javax.swing.JFrame {
JLabel background = new JLabel();
    /**
     * Creates new form CricketLiveScoreKeepingInfo
     */
    public CricketLiveScoreKeepingInfo() {
        initComponents();
        
        setLayout(new BorderLayout());
	JLabel background=new JLabel(new ImageIcon("../AccuPicks/src/resources/CricketBackground.jpg"));
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
        CricketHeaderLbl = new javax.swing.JLabel();
        AccountNameLbl = new javax.swing.JLabel();
        GoToMatchBtn = new javax.swing.JButton();
        BowlFirstLbl = new javax.swing.JLabel();
        BatFirstCmb = new javax.swing.JComboBox();
        BowlFirstCmb = new javax.swing.JComboBox();
        OversPlayCmb = new javax.swing.JComboBox();
        LiveScoreKeepingInfoHeaderLbl = new javax.swing.JLabel();
        BatFirstLbl = new javax.swing.JLabel();
        AccuPicksHeaderLbl = new javax.swing.JLabel();
        OversPlayLbl = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(51, 51, 51));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        MainPanel.setOpaque(false);

        CricketHeaderLbl.setBackground(new java.awt.Color(51, 51, 51));
        CricketHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        CricketHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        CricketHeaderLbl.setText("Cricket");

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

        BowlFirstLbl.setBackground(new java.awt.Color(51, 51, 51));
        BowlFirstLbl.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        BowlFirstLbl.setForeground(new java.awt.Color(255, 255, 255));
        BowlFirstLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BowlFirstLbl.setText("Which Player Will Bowl First:");

        BatFirstCmb.setBackground(new java.awt.Color(51, 51, 51));
        BatFirstCmb.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        BatFirstCmb.setForeground(new java.awt.Color(255, 255, 255));
        BatFirstCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BowlFirstCmb.setBackground(new java.awt.Color(51, 51, 51));
        BowlFirstCmb.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        BowlFirstCmb.setForeground(new java.awt.Color(255, 255, 255));
        BowlFirstCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        OversPlayCmb.setBackground(new java.awt.Color(51, 51, 51));
        OversPlayCmb.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        OversPlayCmb.setForeground(new java.awt.Color(255, 255, 255));
        OversPlayCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LiveScoreKeepingInfoHeaderLbl.setBackground(new java.awt.Color(51, 51, 51));
        LiveScoreKeepingInfoHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        LiveScoreKeepingInfoHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        LiveScoreKeepingInfoHeaderLbl.setText("Live Score Keeping Info");

        BatFirstLbl.setBackground(new java.awt.Color(51, 51, 51));
        BatFirstLbl.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        BatFirstLbl.setForeground(new java.awt.Color(255, 255, 255));
        BatFirstLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BatFirstLbl.setText("Which Team Will Bat First:");

        AccuPicksHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        AccuPicksHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        AccuPicksHeaderLbl.setText("AccuPicks");

        OversPlayLbl.setBackground(new java.awt.Color(51, 51, 51));
        OversPlayLbl.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        OversPlayLbl.setForeground(new java.awt.Color(255, 255, 255));
        OversPlayLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        OversPlayLbl.setText("How Many Overs will be played:");

        BackBtn.setBackground(new java.awt.Color(51, 51, 51));
        BackBtn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BowlFirstLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BatFirstLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OversPlayLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BatFirstCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BowlFirstCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OversPlayCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GoToMatchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(515, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccuPicksHeaderLbl)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CricketHeaderLbl)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                                        .addComponent(LiveScoreKeepingInfoHeaderLbl)
                                        .addGap(8, 8, 8)))))
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
                .addComponent(CricketHeaderLbl)
                .addGap(18, 18, 18)
                .addComponent(LiveScoreKeepingInfoHeaderLbl)
                .addGap(18, 18, 18)
                .addComponent(AccountNameLbl)
                .addGap(55, 55, 55)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BatFirstCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BatFirstLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BowlFirstCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BowlFirstLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OversPlayCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OversPlayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(GoToMatchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(CricketLiveScoreKeepingInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CricketLiveScoreKeepingInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CricketLiveScoreKeepingInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CricketLiveScoreKeepingInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CricketLiveScoreKeepingInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountNameLbl;
    private javax.swing.JLabel AccuPicksHeaderLbl;
    private javax.swing.JButton BackBtn;
    private javax.swing.JComboBox BatFirstCmb;
    private javax.swing.JLabel BatFirstLbl;
    private javax.swing.JComboBox BowlFirstCmb;
    private javax.swing.JLabel BowlFirstLbl;
    private javax.swing.JLabel CricketHeaderLbl;
    private javax.swing.JButton GoToMatchBtn;
    private javax.swing.JLabel LiveScoreKeepingInfoHeaderLbl;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JComboBox OversPlayCmb;
    private javax.swing.JLabel OversPlayLbl;
    // End of variables declaration//GEN-END:variables
}