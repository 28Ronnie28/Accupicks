/*
 * Sport score preditcion software
 * by Ronnie Muller & Stephan Malan
 */
package com.accupicks.client;

import javax.swing.ImageIcon;

public class CreateTournament extends javax.swing.JFrame {

    public CreateTournament() {
        initComponents();
        setLocationRelativeTo(null);
        OptimizedForCmb.setSelectedIndex(0);
    }

    public void setBackground(String imageName) {
            backgroundLbl.setIcon(new ImageIcon(new ImageIcon(CreateTournament.class.getResource("/resources/" + imageName)).getImage().getScaledInstance(1366, 768, java.awt.Image.SCALE_SMOOTH)));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CreateTournament = new javax.swing.JButton();
        OptimizedForCmb = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TournamentNameTxf = new javax.swing.JTextField();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Create Tournament");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 114, -1, -1));

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AccountName");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 184, -1, -1));

        CreateTournament.setBackground(new java.awt.Color(51, 51, 51));
        CreateTournament.setForeground(new java.awt.Color(255, 255, 255));
        CreateTournament.setText("Create Tournament");
        CreateTournament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateTournamentActionPerformed(evt);
            }
        });
        jPanel1.add(CreateTournament, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 445, 350, 40));

        OptimizedForCmb.setBackground(new java.awt.Color(51, 51, 51));
        OptimizedForCmb.setForeground(new java.awt.Color(255, 255, 255));
        OptimizedForCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soccer", "Cricket", "Rugby", "Netball", "Hockey", "Counter-Strike: Global Offensive", "League of Legends", "Dota 2" }));
        OptimizedForCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptimizedForCmbActionPerformed(evt);
            }
        });
        jPanel1.add(OptimizedForCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 377, 350, 40));

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Optimized For:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 376, -1, 40));

        jLabel19.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("AccuPicks");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 28, -1, -1));

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tournament Name:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 317, -1, 40));

        TournamentNameTxf.setBackground(new java.awt.Color(51, 51, 51));
        TournamentNameTxf.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TournamentNameTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 318, 350, 40));
        jPanel1.add(backgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 1340, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateTournamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateTournamentActionPerformed
        /*String TournamentName = TournamentNameTxf.getText();
        String Sport = (String) OptimizedForCmb.getSelectedItem();

        Boolean success = (new File("C:\\Program Files\\AccuPicks\\Tournaments\\"+Sport+"\\")).mkdirs();*/
    }//GEN-LAST:event_CreateTournamentActionPerformed

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

    public static void main(String[] args) {
        new CreateTournament().setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateTournament;
    private javax.swing.JComboBox OptimizedForCmb;
    private javax.swing.JTextField TournamentNameTxf;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
