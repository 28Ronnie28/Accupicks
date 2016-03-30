/*
 * Sport score preditcion software
 * by Ronnie Muller & Stephan Malan
 */
package com.accupicks.client;

import javax.swing.ImageIcon;
import com.shared.Client;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class CreateTournament extends javax.swing.JFrame {
JLabel backgroundLbl = new JLabel();    
private final Client CLIENT;

    public CreateTournament(Client client) {
        CLIENT = client;
        initComponents();
        setLocationRelativeTo(null);
        OptimizedForCmb.setSelectedIndex(0);
        AccountNameLbl.setText(CLIENT.getName());
        
        setLayout(new BorderLayout());
        add(backgroundLbl);
        backgroundLbl.setIcon(new ImageIcon(new ImageIcon(AdminHome.class.getResource("/resources/SoccerBackground.jpg")).getImage().getScaledInstance(1366, 768, java.awt.Image.SCALE_SMOOTH)));
    }

    public void setBackground(String imageName) {
            backgroundLbl.setIcon(new ImageIcon(new ImageIcon(CreateTournament.class.getResource("/resources/" + imageName)).getImage().getScaledInstance(1366, 768, java.awt.Image.SCALE_SMOOTH)));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        CreateTournamentHeaderLbl = new javax.swing.JLabel();
        AccountNameLbl = new javax.swing.JLabel();
        CreateTournamentBtn = new javax.swing.JButton();
        OptimizedForCmb = new javax.swing.JComboBox();
        OptimizedForHeaderLbl = new javax.swing.JLabel();
        AccuPicksHeaderLbl = new javax.swing.JLabel();
        TournamentHeaderLbl = new javax.swing.JLabel();
        TournamentNameTxf = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(51, 51, 51));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        MainPanel.setOpaque(false);
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateTournamentHeaderLbl.setBackground(new java.awt.Color(51, 51, 51));
        CreateTournamentHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        CreateTournamentHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        CreateTournamentHeaderLbl.setText("Create Tournament");
        MainPanel.add(CreateTournamentHeaderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 114, -1, -1));

        AccountNameLbl.setBackground(new java.awt.Color(51, 51, 51));
        AccountNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        AccountNameLbl.setText("AccountName");
        MainPanel.add(AccountNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 184, -1, -1));

        CreateTournamentBtn.setBackground(new java.awt.Color(51, 51, 51));
        CreateTournamentBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreateTournamentBtn.setText("Create Tournament");
        CreateTournamentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateTournamentBtnActionPerformed(evt);
            }
        });
        MainPanel.add(CreateTournamentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 445, 350, 40));

        OptimizedForCmb.setBackground(new java.awt.Color(51, 51, 51));
        OptimizedForCmb.setForeground(new java.awt.Color(255, 255, 255));
        OptimizedForCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soccer", "Cricket", "Rugby", "Netball", "Hockey", "Counter-Strike: Global Offensive", "League of Legends", "Dota 2" }));
        OptimizedForCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptimizedForCmbActionPerformed(evt);
            }
        });
        MainPanel.add(OptimizedForCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 377, 350, 40));

        OptimizedForHeaderLbl.setBackground(new java.awt.Color(51, 51, 51));
        OptimizedForHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        OptimizedForHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        OptimizedForHeaderLbl.setText("Optimized For:");
        MainPanel.add(OptimizedForHeaderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 376, -1, 40));

        AccuPicksHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        AccuPicksHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        AccuPicksHeaderLbl.setText("AccuPicks");
        MainPanel.add(AccuPicksHeaderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 28, -1, -1));

        TournamentHeaderLbl.setBackground(new java.awt.Color(51, 51, 51));
        TournamentHeaderLbl.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        TournamentHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        TournamentHeaderLbl.setText("Tournament Name:");
        MainPanel.add(TournamentHeaderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 317, -1, 40));

        TournamentNameTxf.setBackground(new java.awt.Color(51, 51, 51));
        TournamentNameTxf.setForeground(new java.awt.Color(255, 255, 255));
        MainPanel.add(TournamentNameTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 318, 350, 40));

        BackBtn.setBackground(new java.awt.Color(51, 51, 51));
        BackBtn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        MainPanel.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 690, 390, -1));

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

    private void CreateTournamentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateTournamentBtnActionPerformed
        /*String TournamentName = TournamentNameTxf.getText();
        String Sport = (String) OptimizedForCmb.getSelectedItem();

        Boolean success = (new File("C:\\Program Files\\AccuPicks\\Tournaments\\"+Sport+"\\")).mkdirs();*/
    }//GEN-LAST:event_CreateTournamentBtnActionPerformed

    private void OptimizedForCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptimizedForCmbActionPerformed
        if(OptimizedForCmb.getSelectedItem().toString().equals("Cricket")){
            setBackground("CricketBackground.jpg");
        } else if(OptimizedForCmb.getSelectedItem().toString().equals("Soccer")){
            setBackground("SoccerBackground.jpg");
        } else if(OptimizedForCmb.getSelectedItem().toString().equals("Rugby")){
            setBackground("RugbyBackground.png");
        } else if(OptimizedForCmb.getSelectedItem().toString().equals("Netball")){
            setBackground("NetballBackground.gif");
        } else if(OptimizedForCmb.getSelectedItem().toString().equals("Hockey")){
            setBackground("HockeyBackground.jpg");
        } else if(OptimizedForCmb.getSelectedItem().toString().equals("Counter-Strike: Global Offensive")){
            setBackground("CSGOBackground.jpg");
        } else if(OptimizedForCmb.getSelectedItem().toString().equals("League of Legends")){
            setBackground("LeagueOfLegendsBackground.jpg");
        } else if(OptimizedForCmb.getSelectedItem().toString().equals("Dota 2")){
            setBackground("Dota2Background.jpg");
        }
    }//GEN-LAST:event_OptimizedForCmbActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        new AdminHome(CLIENT).setVisible(true);
        dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    public static void main(String[] args) {
        //new CreateTournament().setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountNameLbl;
    private javax.swing.JLabel AccuPicksHeaderLbl;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CreateTournamentBtn;
    private javax.swing.JLabel CreateTournamentHeaderLbl;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JComboBox OptimizedForCmb;
    private javax.swing.JLabel OptimizedForHeaderLbl;
    private javax.swing.JLabel TournamentHeaderLbl;
    private javax.swing.JTextField TournamentNameTxf;
    // End of variables declaration//GEN-END:variables
}
