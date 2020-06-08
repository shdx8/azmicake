package main;
/* @author shdx*/
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
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class trx extends javax.swing.JFrame {
    
    int mX;
    int mY;
    
    Connection con;
    Statement stm;
    ResultSet res;
    PreparedStatement ps;
    String sql;
    
    Connection conn=null;
    public trx() throws SQLException {
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
        conn=koneksi.configDB();
        Seticon();
        autoID();
    }
    
    String date = new SimpleDateFormat("ddMMyy",   Locale.getDefault()).format(new Date());
    public void autoID(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/azmicake","root","");
            Statement s=con.createStatement();
            
            ResultSet res=s.executeQuery("select Max(id_trx) from trx");
            res.next();
            res.getString("Max(id_trx)");
            
            if(res.getString("Max(id_trx)")==null){
                txt_id.setText("AC0001");
            }else{
                Long id=Long.parseLong(res.getString("Max(id_trx)").substring(2,res.getString("Max(id_trx)").length()));
                id++;
                
                txt_id.setText("AC" + String.format ("%03d",id));
            }
                    
            
        }catch(ClassNotFoundException ex){
            Logger.getLogger(trx.class.getName()).log(Level.SEVERE,null,ex);
        } catch (SQLException ex) {
            Logger.getLogger(trx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo.png")));
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
        cmb_nmkue.setSelectedItem(this);
        tx_bayar.setText(null);
        tx_harga.setText(null);
        tx_jumlah.setText(null);
        tx_kembali.setText(null);
        tx_idkue.setText(null);
        txt_id.setText(null);
        tot.setText(null);
        
            autoID();
    }
    
    public void tampil_combo(){
        try {
        String sql = "select nama_kue from kue order by nama_kue asc";
        java.sql.Connection conn=(Connection)koneksi.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        cmb_nmkue.addItem("-Pilih Kue-");
        while(res.next()){
            cmb_nmkue.addItem(res.getString("nama_kue"));
            }
            
            res.last();
            int jumlahdata = res.getRow();
            res.first();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void tampil(){
        try {
            Connection con = koneksi.configDB();
            Statement stt = con.createStatement();
            String sql = "select id_kue, harga from kue where nama_kue='"+cmb_nmkue.getSelectedItem()+"'";
            ResultSet res = stt.executeQuery(sql);
            
            while(res.next()){
                Object[] ob = new Object[3];
                ob[0]=  res.getString(1);
                ob[1]= res.getString(2);
                
                tx_idkue.setText((String) ob[0]);
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

        logout = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        del_trx = new javax.swing.JLabel();
        save_trx = new javax.swing.JLabel();
        trx_baru = new javax.swing.JLabel();
        rp = new javax.swing.JLabel();
        tot = new javax.swing.JTextField();
        tx_bayar = new javax.swing.JTextField();
        tx_kembali = new javax.swing.JTextField();
        tx_jumlah = new javax.swing.JTextField();
        cmb_nmkue = new javax.swing.JComboBox<>();
        tx_harga = new javax.swing.JTextField();
        tx_idkue = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabtrx = new javax.swing.JTable();
        close = new javax.swing.JLabel();
        o_xampp = new javax.swing.JLabel();
        dragmouse = new javax.swing.JLabel();
        hitung = new javax.swing.JLabel();
        trx = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 120, 30));

        cancel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cancel.setForeground(new java.awt.Color(102, 102, 102));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 605, 145, 41));

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
        tot.setText("0");
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
        tx_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_jumlahKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_jumlahKeyTyped(evt);
            }
        });
        getContentPane().add(tx_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 170, 30));

        cmb_nmkue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_nmkue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_nmkueActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_nmkue, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 170, 30));

        tx_harga.setEditable(false);
        tx_harga.setBackground(new java.awt.Color(255, 255, 255));
        tx_harga.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tx_harga.setBorder(null);
        getContentPane().add(tx_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 170, 30));

        tx_idkue.setEditable(false);
        tx_idkue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(tx_idkue, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 170, 30));

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 168, 170, 30));

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

        hitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hitungMouseClicked(evt);
            }
        });
        getContentPane().add(hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 295, 100, 42));

        trx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trxs.png"))); // NOI18N
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
    
    private int cekStok() {
        int stok = 0;
        String total = "SELECT stok from kue where id_kue ='" + tx_idkue.getText() + "'";
        try {
            stm = koneksi.configDB().createStatement();
            res = stm.executeQuery(total);

            while (res.next()) {
                stok = Integer.parseInt(res.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("" + e.getMessage());
        }
        return stok;
    }


    
    private void save_trxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_trxMouseClicked
        if(cekStok()>0){
            try {
                
                String sql = "INSERT INTO trx VALUES ('"
                        +txt_id.getText()+"','"
                        +tx_idkue.getText()+"','"
                        +cmb_nmkue.getSelectedItem()+"','"
                        +tx_harga.getText()+"','"
                        +tx_jumlah.getText()+"','"
                        +tot.getText()+"')";
                java.sql.Connection conn=(Connection)koneksi.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
                cancel();
                table_trx();
                autoID();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null,"stok tidak cukup");
            
        }
    }//GEN-LAST:event_save_trxMouseClicked
    
    private void del_trxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_del_trxMouseClicked
        try {
            String sql ="delete from trx where id_trx='"+txt_id.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        try {
            table_trx();
        } catch (SQLException ex) {
            Logger.getLogger(trx.class.getName()).log(Level.SEVERE, null, ex);
        }
        cancel();
    }//GEN-LAST:event_del_trxMouseClicked
    
    private void tabtrxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabtrxMouseClicked
        int baris = tabtrx.rowAtPoint(evt.getPoint());
        String id_trx = tabtrx.getValueAt(baris,0).toString();
        txt_id.setText(id_trx);
        String id_kue = tabtrx.getValueAt(baris,1).toString();
        tx_idkue.setText(id_kue);
        String nama_kue = tabtrx.getValueAt(baris,2).toString();
        cmb_nmkue.setSelectedItem(nama_kue);
        String harga = tabtrx.getValueAt(baris,3).toString();
        tx_harga.setText(harga);
        String jumlah = tabtrx.getValueAt(baris,4).toString();
        tx_jumlah.setText(jumlah);
        String total = tabtrx.getValueAt(baris,5).toString();
        tot.setText(total);
    }//GEN-LAST:event_tabtrxMouseClicked
    
    private void trx_baruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trx_baruMouseClicked
        int jumlah , harga , total,bayar,kembali;
        
        jumlah=Integer.parseInt(this.tx_jumlah.getText());
        harga=Integer.parseInt(this.tx_harga.getText());
        
        total = jumlah * harga;
        
        this.tot.setText(""+total);
        
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
    
    private void cmb_nmkueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_nmkueActionPerformed
        tampil();
    }//GEN-LAST:event_cmb_nmkueActionPerformed
    
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

    private void tx_jumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_jumlahKeyTyped
        
    }//GEN-LAST:event_tx_jumlahKeyTyped

    private void tx_jumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_jumlahKeyPressed
        int jumlah , harga , total;
        
        jumlah=Integer.parseInt(this.tx_jumlah.getText());
        harga=Integer.parseInt(this.tx_harga.getText());
        
        total = jumlah * harga;
        
        this.tot.setText(""+total);
    }//GEN-LAST:event_tx_jumlahKeyPressed
    
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
            java.util.logging.Logger.getLogger(trx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new trx().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(trx.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel close;
    private javax.swing.JComboBox<String> cmb_nmkue;
    private javax.swing.JLabel del_trx;
    private javax.swing.JLabel dragmouse;
    private javax.swing.JLabel hitung;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel o_xampp;
    private javax.swing.JLabel rp;
    private javax.swing.JLabel save_trx;
    private javax.swing.JTable tabtrx;
    private javax.swing.JTextField tot;
    private javax.swing.JLabel trx;
    private javax.swing.JLabel trx_baru;
    private javax.swing.JTextField tx_bayar;
    private javax.swing.JTextField tx_harga;
    private javax.swing.JTextField tx_idkue;
    private javax.swing.JTextField tx_jumlah;
    private javax.swing.JTextField tx_kembali;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
