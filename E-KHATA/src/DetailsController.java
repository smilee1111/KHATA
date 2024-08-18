/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import database.mysqlconnector;

import Dao.Userdao;

import Model.Deposit;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
//import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
/**
 *
 * @author Dell
 */
public class DetailsController extends javax.swing.JFrame {

    /**
     * Creates new form DetailsController
     */
    private JTree infoTree;
    public DetailsController() {
        

         JFrame frame = new JFrame("Tree View Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        infoTree = new JTree();
        JScrollPane treeView = new JScrollPane(infoTree);
        frame.add(treeView);

        frame.setVisible(true);
        loadTableData();
   }

private void loadTableData() {
Connection conn = null;
        try {
            String CS = "jdbc:mysql://localhost:3306/khata"; // Replace with your DB URL
            String user = "root"; // Replace with your DB username
            String password = "plmokn@12"; // Replace with your DB password
            conn = DriverManager.getConnection(CS, user, password);
            String prepSqlStatement = "SELECT * FROM deposit"; // Adjust as needed

            PreparedStatement stat = conn.prepareStatement(prepSqlStatement);
            ResultSet rs = stat.executeQuery();

            // Create the root node
            DefaultMutableTreeNode root = new DefaultMutableTreeNode("deposit");
            DefaultTreeModel treeModel = new DefaultTreeModel(root);

            while (rs.next()) {
                
                String amount = rs.getString("amount");
                String dateOfDeposit = rs.getString("date_of_deposit");
                String dateOfWithdrawal = rs.getString("date_of_withdrawal");
                String method = rs.getString("method");

                // Create a node for the album and its details
                DefaultMutableTreeNode albumNode = new DefaultMutableTreeNode(folderName);
                root.add(albumNode);

                // Add details as child nodes
                albumNode.add(new DefaultMutableTreeNode("Amount: " + amount));
                albumNode.add(new DefaultMutableTreeNode("Date of Deposit: " + dateOfDeposit));
                albumNode.add(new DefaultMutableTreeNode("Date of Withdrawal: " + dateOfWithdrawal));
                albumNode.add(new DefaultMutableTreeNode("Method: " + method));
            }

            infoTree.setModel(treeModel);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                
            System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoadTableData::new);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(762, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(401, 439, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new DashboardController().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DetailsController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailsController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailsController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailsController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailsController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
