package sub;
/* @author shdx*/
import main.*;
import main.koneksi;
import sub.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.dashboard;
import main.f1;

public class trx_subs_bk extends javax.swing.JFrame {

    int mX;
    int mY;
    
    
    
    
    public trx_subs_bk() throws SQLException {
        initComponents();
        
        setBackground(new Color(0,0,0,0));
        tabtrx.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,12));
        tabtrx.getTableHeader().setOpaque(false);
        tabtrx.getTableHeader().setBackground(new Color(32,136,203));
        tabtrx.getTableHeader().setForeground(new Color(255,255,255));
        tabtrx.setRowHeight(25);
        
        
        table_trx();
        tampil_combo();
        cancel();
    }

    public void table_trx() throws SQLException{
         DefaultTableModel tx =new DefaultTableModel();
         tx.addColumn("ID Transaksi");
         tx.addColumn("ID Kue");
         tx.addColumn("Nama Kue");
         tx.addColumn("Harga");
         tx.addColumn("Jumlah");
         tx.addColumn("Total");
         
         try{
         String sql = "select * from trx";
         java.sql.Connection conn=(Connection)koneksi.configDB();
         java.sql.Statement stm=conn.createStatement();
         java.sql.ResultSet res=stm.executeQuery(sql);
         while(res.next()){
                tx.addRow(new Object[]{
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6),});
            }
         tabtrx.setModel(tx);
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "gagal menampilkan data"+e.getMessage());
         }
    }
    
    private void cancel(){
        tx_bayar.setText(null);
        tx_harga.setText(null);
        tx_jumlah.setText(null);
        tx_kembali.setText(null);
        tx_nmkue.setText(null);
        txt_id.setText(null);
        tot.setText(null);
        cmb_idkue.setSelectedItem(this);
    }
    
    public void tampil_combo()
    {
        try {
        Connection con = koneksi.configDB();
        Statement stt = con.createStatement();
        String sql = "select id_kue from kue order by id_kue asc";      // disini saya menampilkan NIM, anda dapat menampilkan
        ResultSet res = stt.executeQuery(sql);                                // yang anda ingin kan
        
        while(res.next()){
            Object[] ob = new Object[3];
            ob[0] = res.getString(1);
            
            cmb_idkue.addItem((String) ob[0]);                                      // fungsi ini bertugas menampung isi dari database
        }
        res.close(); stt.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
     public void tampil()
    {
        try {
        Connection con = koneksi.configDB();
        Statement stt = con.createStatement();
        String sql = "select nama_kue, harga from kue where id_kue='"+cmb_idkue.getSelectedItem()+"'";  
        ResultSet res = stt.executeQuery(sql);
        
        while(res.next()){
            Object[] ob = new Object[3];
            ob[0]=  res.getString(1);
            ob[1]= res.getString(2);
            
            tx_nmkue.setText((String) ob[0]);
            tx_harga.setText((String) ob[1]);
        }
        res.close(); stt.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }              
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancel = new javax.swing.JLabel();
        del_trx = new javax.swing.JLabel();
        save_trx = new javax.swing.JLabel();
        hitung = new javax.swing.JLabel();
        trx_baru = new javax.swing.JLabel();
        rp = new javax.swing.JLabel();
        tot = new javax.swing.JTextField();
        tx_bayar = new javax.swing.JTextField();
        tx_kembali = new javax.swing.JTextField();
        tx_jumlah = new javax.swing.JTextField();
        tx_harga = new javax.swing.JTextField();
        tx_nmkue = new javax.swing.JTextField();
        cmb_idkue = new javax.swing.JComboBox<>();
        txt_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabtrx = new javax.swing.JTable();
        close = new javax.swing.JLabel();
        o_xampp = new javax.swing.JLabel();
        dragmouse = new javax.swing.JLabel();
        trx = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cancel.setForeground(new java.awt.Color(102, 102, 102));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 605, 145, 41));

        del_trx.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        del_trx.setForeground(new java.awt.Color(102, 102, 102));
        del_trx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                del_trxMouseClicked(evt);
            }
        });
        getContentPane().add(del_trx, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 605, 145, 41));

        save_trx.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        save_trx.setForeground(new java.awt.Color(102, 102, 102));
        save_trx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_trxMouseClicked(evt);
            }
        });
        getContentPane().add(save_trx, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 605, 145, 41));

        hitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hitungMouseClicked(evt);
            }
        });
        getContentPane().add(hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 295, 100, 42));

        trx_baru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trx_baruMouseClicked(evt);
            }
        });
        getContentPane().add(trx_baru, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 295, 155, 41));

        rp.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rp.setForeground(new java.awt.Color(102, 102, 102));
        rp.setText("Rp.");
        getContentPane().add(rp, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 155, 30, 30));

        tot.setEditable(false);
        tot.setBackground(new java.awt.Color(255, 255, 255));
        tot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tot.setText("...");
        tot.setBorder(null);
        tot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totActionPerformed(evt);
            }
        });
        getContentPane().add(tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 155, 170, 30));

        tx_bayar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(tx_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 170, 30));

        tx_kembali.setEditable(false);
        tx_kembali.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(tx_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 235, 170, 30));

        tx_jumlah.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(tx_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 170, 30));

        tx_harga.setEditable(false);
        tx_harga.setBackground(new java.awt.Color(255, 255, 255));
        tx_harga.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tx_harga.setBorder(null);
        getContentPane().add(tx_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 170, 30));

        tx_nmkue.setEditable(false);
        tx_nmkue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(tx_nmkue, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 170, 30));

        cmb_idkue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_idkue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih-" }));
        cmb_idkue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_idkueActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_idkue, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 170, 30));

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 165, 170, 30));

        tabtrx.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabtrx.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4", "5", "6"
            }
        ));
        tabtrx.setFocusable(false);
        tabtrx.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabtrx.setRowHeight(25);
        tabtrx.setSelectionBackground(new java.awt.Color(59, 170, 121));
        tabtrx.setShowVerticalLines(false);
        tabtrx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabtrxMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabtrx);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 383, 730, 180));

        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1074, 11, 26, 28));

        o_xampp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o_xamppMouseClicked(evt);
            }
        });
        getContentPane().add(o_xampp, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 645, 163, 45));

        dragmouse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        getContentPane().add(dragmouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1120, 720));

        trx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trx.png"))); // NOI18N
        getContentPane().add(trx, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1115, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dashboard dsh=new dashboard();
        dsh.setVisible(true);
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void dragmouseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragmouseMouseDragged
        int kX=evt.getXOnScreen();
        int kY=evt.getYOnScreen();

        this.setLocation(kX-mX,kY-mY);
    }//GEN-LAST:event_dragmouseMouseDragged

    private void dragmouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragmouseMouseClicked

    }//GEN-LAST:event_dragmouseMouseClicked

    private void dragmouseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragmouseMousePressed
        mX=evt.getX();
        mY=evt.getY();
    }//GEN-LAST:event_dragmouseMousePressed

    private void o_xamppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o_xamppMouseClicked
        try{
            Desktop.getDesktop().open(new File("C:\\xampp\\xampp-control.exe"));
        } catch (IOException ex) {
            Logger.getLogger(f1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_o_xamppMouseClicked

    private void save_trxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_trxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_save_trxMouseClicked

    private void del_trxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_del_trxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_del_trxMouseClicked

    private void tabtrxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabtrxMouseClicked
        //int baris = tabtrx.rowAtPoint(evt.getPoint());
        //String harga = tabtrx.getValueAt(baris,2).toString();
        //tx_harga.setText(harga);
    }//GEN-LAST:event_tabtrxMouseClicked

    private void trx_baruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trx_baruMouseClicked
        int total,bayar,kembali;
        
        bayar=Integer.parseInt(this.tx_bayar.getText());
        total=Integer.parseInt(this.tot.getText());
        
        kembali = bayar-total;
        
        this.tx_kembali.setText(""+kembali);
    }//GEN-LAST:event_trx_baruMouseClicked

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void totActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totActionPerformed

    private void cmb_idkueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_idkueActionPerformed
        tampil();
    }//GEN-LAST:event_cmb_idkueActionPerformed

    private void hitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hitungMouseClicked
         int jumlah , harga , total;
        
        jumlah=Integer.parseInt(this.tx_jumlah.getText());
        harga=Integer.parseInt(this.tx_harga.getText());
        
        total = jumlah * harga;
        
        this.tot.setText(""+total);
    }//GEN-LAST:event_hitungMouseClicked
    
    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        cancel();
    }//GEN-LAST:event_cancelMouseClicked

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
            java.util.logging.Logger.getLogger(trx_subs_bk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trx_subs_bk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trx_subs_bk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trx_subs_bk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new trx_subs_bk().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(trx_subs_bk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel close;
    private javax.swing.JComboBox<String> cmb_idkue;
    private javax.swing.JLabel del_trx;
    private javax.swing.JLabel dragmouse;
    private javax.swing.JLabel hitung;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel o_xampp;
    private javax.swing.JLabel rp;
    private javax.swing.JLabel save_trx;
    private javax.swing.JTable tabtrx;
    private javax.swing.JTextField tot;
    private javax.swing.JLabel trx;
    private javax.swing.JLabel trx_baru;
    private javax.swing.JTextField tx_bayar;
    private javax.swing.JTextField tx_harga;
    private javax.swing.JTextField tx_jumlah;
    private javax.swing.JTextField tx_kembali;
    private javax.swing.JTextField tx_nmkue;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
