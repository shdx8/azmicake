package main;

import sub.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author shdx*/
public class dashboard extends javax.swing.JFrame {

    int mX;
    int mY;
    public dashboard() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        Seticon();
        
        mini.setEnabled(false);
        mini.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new javax.swing.JLabel();
        b_laporan = new javax.swing.JLabel();
        b_trx = new javax.swing.JLabel();
        b_tambahdata = new javax.swing.JLabel();
        b_about = new javax.swing.JLabel();
        b_help = new javax.swing.JLabel();
        b_contact = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        o_xampp = new javax.swing.JLabel();
        dragmouse = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        azmi = new javax.swing.JLabel();
        cake = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        logoAZMI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1110, 720));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 120, 30));

        b_laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_laporanMouseClicked(evt);
            }
        });
        getContentPane().add(b_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 235, 230, 250));

        b_trx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_trxMouseClicked(evt);
            }
        });
        getContentPane().add(b_trx, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 235, 230, 250));

        b_tambahdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_tambahdataMouseClicked(evt);
            }
        });
        getContentPane().add(b_tambahdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 235, 230, 250));

        b_about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_aboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_aboutMouseEntered(evt);
            }
        });
        getContentPane().add(b_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 55, 180, 36));

        b_help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_helpMouseClicked(evt);
            }
        });
        getContentPane().add(b_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 87, 180, 36));

        b_contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_contactMouseClicked(evt);
            }
        });
        getContentPane().add(b_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 120, 180, 36));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1055, 9, 40, 30));

        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, 180, 35));

        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mini.png"))); // NOI18N
        getContentPane().add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(929, 50, 180, 150));

        nm_user.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        getContentPane().add(nm_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 6, 110, 40));

        o_xampp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o_xamppMouseClicked(evt);
            }
        });
        getContentPane().add(o_xampp, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 645, 163, 45));

        dragmouse.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragmouseMouseDragged(evt);
            }
        });
        dragmouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dragmouseMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragmouseMousePressed(evt);
            }
        });
        getContentPane().add(dragmouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1115, 720));

        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard.png"))); // NOI18N
        getContentPane().add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1115, 720));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(24, 25, 23));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 226, 670));

        jPanel3.setBackground(new java.awt.Color(234, 233, 232));
        jPanel3.setPreferredSize(new java.awt.Dimension(880, 669));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 889, 670));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 226, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 889, 50));

        azmi.setBackground(new java.awt.Color(255, 255, 255));
        azmi.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        azmi.setForeground(new java.awt.Color(255, 255, 255));
        azmi.setText("AZMI");
        getContentPane().add(azmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 50));

        cake.setBackground(new java.awt.Color(255, 255, 255));
        cake.setFont(new java.awt.Font("Segoe UI Light", 1, 40)); // NOI18N
        cake.setForeground(new java.awt.Color(204, 204, 204));
        cake.setText("CAKE");
        getContentPane().add(cake, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 100, 40));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 5, 30, 40));

        logoAZMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        getContentPane().add(logoAZMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 200, 200, 210));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dragmouseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragmouseMouseDragged
        int kX=evt.getXOnScreen();
        int kY=evt.getYOnScreen();
        
        this.setLocation(kX-mX,kY-mY);
    }//GEN-LAST:event_dragmouseMouseDragged

    private void dragmouseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragmouseMousePressed
        mX=evt.getX();
        mY=evt.getY();
    }//GEN-LAST:event_dragmouseMousePressed

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        mini.setEnabled(true);
        mini.setVisible(true);
    }//GEN-LAST:event_menuMouseClicked

    private void dragmouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragmouseMouseClicked
        mini.setEnabled(false);
        mini.setVisible(false);
    }//GEN-LAST:event_dragmouseMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void o_xamppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o_xamppMouseClicked
        try{
            Desktop.getDesktop().open(new File("C:\\xampp\\xampp-control.exe"));
        } catch (IOException ex) {
            Logger.getLogger(f1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_o_xamppMouseClicked

    private void b_aboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_aboutMouseEntered
        
    }//GEN-LAST:event_b_aboutMouseEntered

    private void b_aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_aboutMouseClicked
        about abt=new about();
        abt.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_aboutMouseClicked

    private void b_helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_helpMouseClicked
        help hlp=new help();
        hlp.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_helpMouseClicked

    private void b_contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_contactMouseClicked
        contact ctc=new contact();
        ctc.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_contactMouseClicked

    private void b_tambahdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_tambahdataMouseClicked
        datakue dtk = null;
        try {
            dtk = new datakue();
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        dtk.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_tambahdataMouseClicked

    private void b_trxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_trxMouseClicked
        trx trx = null;
        try {
            trx = new trx();
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        trx.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_trxMouseClicked

    private void b_laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_laporanMouseClicked
        rep lap = null;
        try {
            lap = new rep();
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        lap.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_laporanMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        login lgn = null;
        try {
            lgn = new login();
        } catch (SQLException ex) {
            Logger.getLogger(rep.class.getName()).log(Level.SEVERE, null, ex);
        }
        lgn.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel azmi;
    private javax.swing.JLabel b_about;
    private javax.swing.JLabel b_contact;
    private javax.swing.JLabel b_help;
    private javax.swing.JLabel b_laporan;
    private javax.swing.JLabel b_tambahdata;
    private javax.swing.JLabel b_trx;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cake;
    private javax.swing.JLabel close;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel dragmouse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logoAZMI;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel mini;
    public static final javax.swing.JLabel nm_user = new javax.swing.JLabel();
    private javax.swing.JLabel o_xampp;
    // End of variables declaration//GEN-END:variables

    public void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
}
