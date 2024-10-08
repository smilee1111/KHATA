/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class DashboardController extends javax.swing.JFrame {

    /**
     * Creates new form DashboardController
     */
    public DashboardController() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        detailsButtonField = new javax.swing.JButton();
        depositButtonField = new javax.swing.JButton();
        withdrawButtonField = new javax.swing.JButton();
        transerButtonField = new javax.swing.JButton();
        myinfoButtonField = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 102));

        jPanel1.setBackground(new java.awt.Color(140, 82, 255));

        detailsButtonField.setBackground(new java.awt.Color(153, 153, 255));
        detailsButtonField.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        detailsButtonField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details.png"))); // NOI18N
        detailsButtonField.setText("Details");
        detailsButtonField.setBorder(null);
        detailsButtonField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsButtonFieldActionPerformed(evt);
            }
        });

        depositButtonField.setBackground(new java.awt.Color(153, 153, 255));
        depositButtonField.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        depositButtonField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deposit.png"))); // NOI18N
        depositButtonField.setText("Deposit");
        depositButtonField.setBorder(null);
        depositButtonField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonFieldActionPerformed(evt);
            }
        });

        withdrawButtonField.setBackground(new java.awt.Color(153, 153, 255));
        withdrawButtonField.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        withdrawButtonField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/withdraw.png"))); // NOI18N
        withdrawButtonField.setText("Withdraw");
        withdrawButtonField.setBorder(null);
        withdrawButtonField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonFieldActionPerformed(evt);
            }
        });

        transerButtonField.setBackground(new java.awt.Color(153, 153, 255));
        transerButtonField.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        transerButtonField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transfermoney.png"))); // NOI18N
        transerButtonField.setText("Transer Money");
        transerButtonField.setBorder(null);
        transerButtonField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transerButtonFieldActionPerformed(evt);
            }
        });

        myinfoButtonField.setBackground(new java.awt.Color(153, 153, 255));
        myinfoButtonField.setFont(new java.awt.Font("Lucida Sans", 2, 14)); // NOI18N
        myinfoButtonField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myinfo.png"))); // NOI18N
        myinfoButtonField.setText("My info");
        myinfoButtonField.setBorder(null);
        myinfoButtonField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myinfoButtonFieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 2, 24)); // NOI18N
        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainlogo 1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(transerButtonField)
                            .addComponent(detailsButtonField))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(depositButtonField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(withdrawButtonField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(myinfoButtonField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(376, 376, 376))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(depositButtonField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(withdrawButtonField)
                            .addComponent(detailsButtonField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(transerButtonField)
                            .addComponent(myinfoButtonField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myinfoButtonFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myinfoButtonFieldActionPerformed
        // TODO add your handling code here:
        new InformationController().setVisible(true);
    }//GEN-LAST:event_myinfoButtonFieldActionPerformed

    private void detailsButtonFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsButtonFieldActionPerformed
        // TODO add your handling code here:
        new DetailsController().setVisible(true);
    }//GEN-LAST:event_detailsButtonFieldActionPerformed

    private void depositButtonFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonFieldActionPerformed
        // TODO add your handling code here:
        new DepositController().setVisible(true);
    }//GEN-LAST:event_depositButtonFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new LoginController().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void withdrawButtonFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonFieldActionPerformed
        // TODO add your handling code here:
        new WithDrawlController().setVisible(true);
        
        
    }//GEN-LAST:event_withdrawButtonFieldActionPerformed

    private void transerButtonFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transerButtonFieldActionPerformed
        // TODO add your handling code here:
        new TansferController().setVisible(true);
        
    }//GEN-LAST:event_transerButtonFieldActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositButtonField;
    private javax.swing.JButton detailsButtonField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton myinfoButtonField;
    private javax.swing.JButton transerButtonField;
    private javax.swing.JButton withdrawButtonField;
    // End of variables declaration//GEN-END:variables

   
}
