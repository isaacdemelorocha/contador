/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iJava;

import java.awt.Color;

/**
 *
 * @author Lab_ETESP
 */
public class FormsIsaac01 extends javax.swing.JFrame {

    /**
     * Creates new form FormsIsaac01
     */
    public FormsIsaac01() {
        initComponents();
        getContentPane().setBackground(new Color(50,50,50));
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Cont = new javax.swing.JLabel();
        btn_Mais = new javax.swing.JButton();
        btn_Menos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulário");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Cont.setBackground(new java.awt.Color(0, 204, 255));
        lbl_Cont.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        lbl_Cont.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Cont.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Cont.setText("0");
        lbl_Cont.setOpaque(true);
        getContentPane().add(lbl_Cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 24, 165, 106));

        btn_Mais.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_Mais.setText("+");
        btn_Mais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MaisMouseClicked(evt);
            }
        });
        btn_Mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MaisActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Mais, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 197, 81, 42));

        btn_Menos.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_Menos.setText("-");
        btn_Menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenosMouseClicked(evt);
            }
        });
        btn_Menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 197, 78, 42));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("0");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 292, 165, -1));

        setSize(new java.awt.Dimension(280, 390));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MaisActionPerformed

    private void btn_MaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MaisMouseClicked
    x ++;
    lbl_Cont.setText(x+"");
    }//GEN-LAST:event_btn_MaisMouseClicked

    private void btn_MenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenosActionPerformed
    
    }//GEN-LAST:event_btn_MenosActionPerformed

    private void btn_MenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenosMouseClicked
    if ( x >0){
            x --;
    lbl_Cont.setText(x+"");}
    }//GEN-LAST:event_btn_MenosMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    x=0;
    lbl_Cont.setText(x+"");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FormsIsaac01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormsIsaac01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormsIsaac01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormsIsaac01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormsIsaac01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Mais;
    private javax.swing.JButton btn_Menos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_Cont;
    // End of variables declaration//GEN-END:variables
int x=0;
}
