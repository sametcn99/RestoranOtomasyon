/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran_otomasyon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samet
 */
public class satis_panel extends javax.swing.JFrame {

    static Connection con;
    static String fullurl = "jdbc:sqlserver://localhost:1433;databasename=gorsel3;user=sa;password=1";
    static String uid = "";
    static String uadi = "";
    static String ufiyati = "";
    static String secilenMasa;
    static Date currentDate = new Date();
    static String tutar;
    static int toplamtutar = 0;
    static String siparisID;
    static String MasaDoluBos = "";

    satis_panel() {
        initComponents();
        try {
            urunGoster();
            display_masalar();
        } catch (SQLException ex) {
            Logger.getLogger(satis_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display_urunler = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eklenen_urunler = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        siparis_tamamla_button = new javax.swing.JButton();
        combobox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        masalar_bos = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        masalar_dolu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        display_urunler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "ad", "fiyat"
            }
        ));
        display_urunler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                display_urunlerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(display_urunler);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Ürünler");

        eklenen_urunler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "ad", "fiyat"
            }
        ));
        eklenen_urunler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eklenen_urunlerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(eklenen_urunler);

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Eklenen Ürünler");

        siparis_tamamla_button.setText("Siparişi Tamamla");
        siparis_tamamla_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siparis_tamamla_buttonMouseClicked(evt);
            }
        });

        combobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboboxMouseClicked(evt);
            }
        });
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(siparis_tamamla_button, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siparis_tamamla_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Siparis ID", "Tarih", "Toplam Fiyat", "Masa"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Tamamlanan Siparişler");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        masalar_bos.setBackground(java.awt.Color.green);
        masalar_bos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Boş Masalar"
            }
        ));
        masalar_bos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masalar_bosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(masalar_bos);

        masalar_dolu.setBackground(java.awt.Color.red);
        masalar_dolu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dolu Masalar"
            }
        ));
        masalar_dolu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masalar_doluMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(masalar_dolu);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void display_urunlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_display_urunlerMouseClicked
        DefaultTableModel urunGosterModel = (DefaultTableModel) display_urunler.getModel();
        DefaultTableModel eklenenGosterModel = (DefaultTableModel) eklenen_urunler.getModel();
        int selectedRow = display_urunler.getSelectedRow();
        uid = (String) urunGosterModel.getValueAt(selectedRow, 0);
        uadi = (String) urunGosterModel.getValueAt(selectedRow, 1);
        ufiyati = (String) urunGosterModel.getValueAt(selectedRow, 2);
        eklenenGosterModel.addRow(new Object[]{uid, uadi, ufiyati});
    }//GEN-LAST:event_display_urunlerMouseClicked

    private void comboboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboboxMouseClicked

    }//GEN-LAST:event_comboboxMouseClicked

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxActionPerformed

    private void siparis_tamamla_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siparis_tamamla_buttonMouseClicked
        try {
            siparisTamamla();
        } catch (SQLException ex) {
            Logger.getLogger(satis_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_siparis_tamamla_buttonMouseClicked

    private void eklenen_urunlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eklenen_urunlerMouseClicked
        DefaultTableModel model2 = (DefaultTableModel) eklenen_urunler.getModel();
        model2.removeRow(eklenen_urunler.getSelectedRow());
    }//GEN-LAST:event_eklenen_urunlerMouseClicked

    private void masalar_bosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masalar_bosMouseClicked
        DefaultTableModel bosMasaModel = (DefaultTableModel) masalar_bos.getModel();
        DefaultTableModel doluMasaModel = (DefaultTableModel) masalar_dolu.getModel();
        DefaultComboBoxModel comboboxModel = (DefaultComboBoxModel) combobox.getModel();
        MasaDoluBos = (String) bosMasaModel.getValueAt(masalar_bos.getSelectedRow(), 0);
        System.out.println("masa seçilen: " + MasaDoluBos);
        doluMasaModel.addRow(new Object[]{MasaDoluBos});
        bosMasaModel.removeRow(masalar_bos.getSelectedRow());
        comboboxModel.removeElement(MasaDoluBos);
    }//GEN-LAST:event_masalar_bosMouseClicked

    private void masalar_doluMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masalar_doluMouseClicked
        DefaultTableModel bosMasaModel = (DefaultTableModel) masalar_bos.getModel();
        DefaultTableModel doluMasaModel = (DefaultTableModel) masalar_dolu.getModel();
        DefaultComboBoxModel comboboxModel = (DefaultComboBoxModel) combobox.getModel();
        MasaDoluBos = (String) doluMasaModel.getValueAt(masalar_dolu.getSelectedRow(), 0);
        System.out.println("masa seçilen: " + MasaDoluBos);
        bosMasaModel.addRow(new Object[]{MasaDoluBos});
        doluMasaModel.removeRow(masalar_dolu.getSelectedRow());
        comboboxModel.addElement(MasaDoluBos);
    }//GEN-LAST:event_masalar_doluMouseClicked

    public static void urunGoster() throws SQLException {
        final String QUERY = "Select urun_id, urun_adi, urun_fiyati from urunler";
        con = DriverManager.getConnection(fullurl);
        System.out.println("Bağlantı Kuruldu");
        java.sql.Statement stmt = con.createStatement();
        DefaultTableModel model = (DefaultTableModel) display_urunler.getModel();
        ResultSet rs = stmt.executeQuery(QUERY);
        int i = 0;
        while (rs.next()) {
            uid = rs.getString("urun_id");
            uadi = rs.getString("urun_adi");
            ufiyati = rs.getString("urun_fiyati");
            model.addRow(new Object[]{uid, uadi, ufiyati});
            i++;
        }
    }

    public static void siparisTamamla() throws SQLException {
        DefaultTableModel model2 = (DefaultTableModel) eklenen_urunler.getModel();
        DefaultTableModel model3 = (DefaultTableModel) jTable1.getModel();
        DefaultComboBoxModel comboboxModel = (DefaultComboBoxModel) combobox.getModel();
        siparisID = UUID.randomUUID().toString();
        secilenMasa = (String) comboboxModel.getSelectedItem();
        int rows = eklenen_urunler.getRowCount();
        int i = 0;
        while (i != rows) {
            tutar = (String) model2.getValueAt(i, 2);
            toplamtutar = Integer.parseInt(tutar) + toplamtutar;
            System.out.println("tutar:  " + tutar);
            i = i + 1;
        }
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-mm-dd");//dd/MM/yyyy dd.MM.yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        model3.addRow(new Object[]{siparisID, strDate, toplamtutar, secilenMasa});
        model2.setRowCount(0);
        tamamlananSiparisKaydi();
    }

    public static void tamamlananSiparisKaydi() throws SQLException {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-mm-dd");//dd/MM/yyyy dd.MM.yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        String query = "insert into dbo.siparisler (siparis_ID, Tarih, Toplam_fiyat, Masa) values('" + siparisID + "', '" + strDate + "', '" + toplamtutar + "', '" + secilenMasa + "')";
        con = DriverManager.getConnection(fullurl);
        System.out.println("Sipariş query: " + query);
        ((Connection) con).createStatement().execute(query);
    }

    public static void display_masalar() throws SQLException {
        final String QUERY = "Select * from masa";
        con = DriverManager.getConnection(fullurl);
        java.sql.Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        DefaultComboBoxModel comboboxModel = (DefaultComboBoxModel) combobox.getModel();
        DefaultTableModel bosMasaModel = (DefaultTableModel) masalar_bos.getModel();
        String masalar = null;
        while (rs.next()) {
            masalar = rs.getString("masa");
            String o = masalar;
            comboboxModel.addElement(o);
            bosMasaModel.addRow(new Object[]{masalar});
        }
    }

    public static void main(String args[]) throws SQLException {
        new satis_panel().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> combobox;
    private static javax.swing.JTable display_urunler;
    private static javax.swing.JTable eklenen_urunler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private static javax.swing.JTable jTable1;
    public static javax.swing.JTable masalar_bos;
    public static javax.swing.JTable masalar_dolu;
    private javax.swing.JButton siparis_tamamla_button;
    // End of variables declaration//GEN-END:variables
}
