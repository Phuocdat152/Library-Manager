/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poli.com.gui;

import poli.com.gui.LOADFRAME;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Duong
 */
public class LOADFRAME extends javax.swing.JFrame {

    /**
     * Creates new form LOAD
     */
    public LOADFRAME() {
        initComponents();
        this.setTitle("Loading...");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnLoad = new javax.swing.JPanel();
        jpbLoad = new javax.swing.JProgressBar();
        jlbTieuDeLoad = new javax.swing.JLabel();
        jlbLoading = new javax.swing.JLabel();
        jlbSoLoad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbAnh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnLoad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpbLoad.setBackground(new java.awt.Color(255, 255, 255));
        jpbLoad.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jpbLoad.setForeground(new java.awt.Color(255, 51, 51));
        jpnLoad.add(jpbLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 750, 30));

        jlbTieuDeLoad.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 48)); // NOI18N
        jlbTieuDeLoad.setForeground(new java.awt.Color(255, 255, 255));
        jlbTieuDeLoad.setText("QUẢN LÝ THƯ VIỆN");
        jpnLoad.add(jlbTieuDeLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 500, -1));

        jlbLoading.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jlbLoading.setForeground(new java.awt.Color(255, 255, 255));
        jlbLoading.setText("Loading...");
        jpnLoad.add(jlbLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 290, -1));

        jlbSoLoad.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jlbSoLoad.setForeground(new java.awt.Color(255, 255, 255));
        jlbSoLoad.setText("0%");
        jpnLoad.add(jlbSoLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 570, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nhóm 1");
        jpnLoad.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 100, -1));

        jlbAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/background(load).jpg"))); // NOI18N
        jpnLoad.add(jlbAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LOADFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOADFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOADFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOADFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        DangNhap dn = new DangNhap();
        LOADFRAME load = new LOADFRAME();
        load.setVisible(true);
        
        for (int i = 0; i <= 100; i++)
        {
            try {
                Thread.sleep(100);
                load.jlbSoLoad.setText(i + "%");
                
                if (i == 10)
                {
                    load.jlbLoading.setText("Turning On Modules...");
                }
                if (i == 20)
                {
                    load.jlbLoading.setText("Loading Modules...");
                }
                if (i == 50)
                {
                    load.jlbLoading.setText("Connecting To Database...");
                }
                if (i == 70)
                {
                    load.jlbLoading.setText("Connection Successful !");
                }               
                if (i == 80)
                {
                    load.jlbLoading.setText("Launching Application...");
                }
                if (i == 100)
                {
                    load.setVisible(false);
                    dn.setVisible(true);
                }
                load.jpbLoad.setValue(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(LOADFRAME.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlbAnh;
    public static javax.swing.JLabel jlbLoading;
    private javax.swing.JLabel jlbSoLoad;
    private javax.swing.JLabel jlbTieuDeLoad;
    public static javax.swing.JProgressBar jpbLoad;
    private javax.swing.JPanel jpnLoad;
    // End of variables declaration//GEN-END:variables
}