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
import static restoran_otomasyon.admin_panel.con;
import static restoran_otomasyon.admin_panel.fullurl;
import static restoran_otomasyon.admin_panel.k_adi;
import static restoran_otomasyon.admin_panel.k_sifre;
import static restoran_otomasyon.admin_panel.queryHasilat;

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
            rezervasyonGoster();
        } catch (SQLException ex) {
            Logger.getLogger(satis_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        siparisEkranPanel = new javax.swing.JPanel();
        UrunlerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display_urunler = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eklenen_urunler = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        siparis_tamamla_button = new javax.swing.JButton();
        combobox = new javax.swing.JComboBox<>();
        tamamlananSiparisPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        masalarPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        masalar_bos = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        masalar_dolu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        rezervasyonEkleAdSoyad = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        rezervasyonMasa = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        gunSecBasRezervasyon = new javax.swing.JComboBox<>();
        aySecBasRezervasyon = new javax.swing.JComboBox<>();
        yilSecBasRezervasyon = new javax.swing.JComboBox<>();
        rezervasyonEkleButon = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        rezervasyonCikarAdSoyad = new javax.swing.JTextPane();
        rezervasyonCikar = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        rezervasyonTablo = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        siparisEkranPanel.setBackground(new java.awt.Color(51, 51, 51));

        UrunlerPanel.setBackground(new java.awt.Color(51, 51, 51));
        UrunlerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        javax.swing.GroupLayout UrunlerPanelLayout = new javax.swing.GroupLayout(UrunlerPanel);
        UrunlerPanel.setLayout(UrunlerPanelLayout);
        UrunlerPanelLayout.setHorizontalGroup(
            UrunlerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UrunlerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UrunlerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(UrunlerPanelLayout.createSequentialGroup()
                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(siparis_tamamla_button, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UrunlerPanelLayout.setVerticalGroup(
            UrunlerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UrunlerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UrunlerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siparis_tamamla_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tamamlananSiparisPanel.setBackground(new java.awt.Color(51, 51, 51));
        tamamlananSiparisPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        javax.swing.GroupLayout tamamlananSiparisPanelLayout = new javax.swing.GroupLayout(tamamlananSiparisPanel);
        tamamlananSiparisPanel.setLayout(tamamlananSiparisPanelLayout);
        tamamlananSiparisPanelLayout.setHorizontalGroup(
            tamamlananSiparisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tamamlananSiparisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tamamlananSiparisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        tamamlananSiparisPanelLayout.setVerticalGroup(
            tamamlananSiparisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tamamlananSiparisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        masalarPanel.setBackground(new java.awt.Color(51, 51, 51));
        masalarPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        javax.swing.GroupLayout masalarPanelLayout = new javax.swing.GroupLayout(masalarPanel);
        masalarPanel.setLayout(masalarPanelLayout);
        masalarPanelLayout.setHorizontalGroup(
            masalarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masalarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(masalarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        masalarPanelLayout.setVerticalGroup(
            masalarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masalarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout siparisEkranPanelLayout = new javax.swing.GroupLayout(siparisEkranPanel);
        siparisEkranPanel.setLayout(siparisEkranPanelLayout);
        siparisEkranPanelLayout.setHorizontalGroup(
            siparisEkranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siparisEkranPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masalarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UrunlerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(tamamlananSiparisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        siparisEkranPanelLayout.setVerticalGroup(
            siparisEkranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siparisEkranPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(siparisEkranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(siparisEkranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tamamlananSiparisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UrunlerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(masalarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sipariş Ekranı", siparisEkranPanel);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Rezervasyon Ekle");

        jScrollPane6.setViewportView(rezervasyonEkleAdSoyad);

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Ad Soyad:");

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Masa:");

        gunSecBasRezervasyon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        gunSecBasRezervasyon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gunSecBasRezervasyonMouseClicked(evt);
            }
        });
        gunSecBasRezervasyon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gunSecBasRezervasyonActionPerformed(evt);
            }
        });

        aySecBasRezervasyon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        yilSecBasRezervasyon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018", "2017" }));

        rezervasyonEkleButon.setText("Rezervasyon Ekle");
        rezervasyonEkleButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rezervasyonEkleButonMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Rezervasyon Sil");

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Ad Soyad:");

        jScrollPane7.setViewportView(rezervasyonCikarAdSoyad);

        rezervasyonCikar.setText("Rezervasyon Çıkar");
        rezervasyonCikar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rezervasyonCikarMouseClicked(evt);
            }
        });

        rezervasyonTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ad Soyad", "Tarih", "Masa"
            }
        ));
        jScrollPane8.setViewportView(rezervasyonTablo);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Rezervasyon Tablo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rezervasyonCikar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rezervasyonEkleButon)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(gunSecBasRezervasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(aySecBasRezervasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(yilSecBasRezervasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(rezervasyonMasa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rezervasyonMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gunSecBasRezervasyon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(aySecBasRezervasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yilSecBasRezervasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(rezervasyonEkleButon)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rezervasyonCikar))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rezervasyon Ekle", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gunSecBasRezervasyonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gunSecBasRezervasyonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gunSecBasRezervasyonActionPerformed

    private void gunSecBasRezervasyonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gunSecBasRezervasyonMouseClicked

    }//GEN-LAST:event_gunSecBasRezervasyonMouseClicked

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

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxActionPerformed

    private void comboboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboboxMouseClicked

    }//GEN-LAST:event_comboboxMouseClicked

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

    private void display_urunlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_display_urunlerMouseClicked
        DefaultTableModel urunGosterModel = (DefaultTableModel) display_urunler.getModel();
        DefaultTableModel eklenenGosterModel = (DefaultTableModel) eklenen_urunler.getModel();
        int selectedRow = display_urunler.getSelectedRow();
        uid = (String) urunGosterModel.getValueAt(selectedRow, 0);
        uadi = (String) urunGosterModel.getValueAt(selectedRow, 1);
        ufiyati = (String) urunGosterModel.getValueAt(selectedRow, 2);
        eklenenGosterModel.addRow(new Object[]{uid, uadi, ufiyati});
    }//GEN-LAST:event_display_urunlerMouseClicked

    private void rezervasyonEkleButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rezervasyonEkleButonMouseClicked
        try {
            DefaultTableModel model = (DefaultTableModel) rezervasyonTablo.getModel();
            DefaultComboBoxModel rezervasyonMasaModel = (DefaultComboBoxModel) rezervasyonMasa.getModel();
            con = DriverManager.getConnection(fullurl);
            rezervasyonEkleAdSoyad.getText();
            secilenMasa = (String) rezervasyonMasaModel.getSelectedItem();
            gunSecBasRezervasyon.getSelectedItem();
            aySecBasRezervasyon.getSelectedItem();
            yilSecBasRezervasyon.getSelectedItem();
            String rezervasyonTarihi = "" + yilSecBasRezervasyon.getSelectedItem() + "-" + aySecBasRezervasyon.getSelectedItem() + "-" + gunSecBasRezervasyon.getSelectedItem();
            String queryRezervasyon = "insert into dbo.rezervasyon (adSoyad, Tarih, Masa) values('" + rezervasyonEkleAdSoyad.getText() + "', '" + rezervasyonTarihi + "', " + "'" + secilenMasa.trim() + "')";
            System.out.println(queryRezervasyon);
            ((Connection) con).createStatement().execute(queryRezervasyon);
            model.addRow(new Object[]{rezervasyonEkleAdSoyad.getText(), rezervasyonTarihi, secilenMasa});
        } catch (SQLException ex) {
            Logger.getLogger(satis_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rezervasyonEkleButonMouseClicked

    private void rezervasyonCikarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rezervasyonCikarMouseClicked
        try {
            DefaultTableModel model = (DefaultTableModel) rezervasyonTablo.getModel();
            String query = "delete from dbo.rezervasyon where adSoyad='" + rezervasyonCikarAdSoyad.getText().trim() + "'";
            ((Connection) con).createStatement().execute(query);
            model.setRowCount(0);
            rezervasyonGoster();
        } catch (SQLException ex) {
            Logger.getLogger(satis_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rezervasyonCikarMouseClicked

    void rezervasyonGoster() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) rezervasyonTablo.getModel();
        String query = "select * from dbo.rezervasyon";
        java.sql.Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        model.setRowCount(0);
        int i = 0;
        while (rs.next()) {
            String adSoyad = rs.getString("adSoyad");
            String Tarih = rs.getString("Tarih");
            String Masa = rs.getString("Masa");
            model.addRow(new Object[]{adSoyad, Tarih, Masa});
            i++;
        }
    }

    void urunGoster() throws SQLException {
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

    void siparisTamamla() throws SQLException {
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
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");//dd/MM/yyyy dd.MM.yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        model3.addRow(new Object[]{siparisID, strDate, toplamtutar, secilenMasa});
        model2.setRowCount(0);
        tamamlananSiparisKaydi();
    }

    public static void tamamlananSiparisKaydi() throws SQLException {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");//dd/MM/yyyy dd.MM.yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        String query = "insert into dbo.siparisler (siparis_ID, Tarih, Toplam_fiyat, Masa) values('" + siparisID + "', '" + strDate + "', '" + toplamtutar + "', '" + secilenMasa + "')";
        con = DriverManager.getConnection(fullurl);
        System.out.println("Sipariş query: " + query);
        ((Connection) con).createStatement().execute(query);
    }

    void display_masalar() throws SQLException {
        final String QUERY = "Select * from masa";
        con = DriverManager.getConnection(fullurl);
        java.sql.Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        DefaultComboBoxModel comboboxModel = (DefaultComboBoxModel) combobox.getModel();
        DefaultComboBoxModel rezervasyonMasaModel = (DefaultComboBoxModel) rezervasyonMasa.getModel();
        DefaultTableModel bosMasaModel = (DefaultTableModel) masalar_bos.getModel();
        String masalar = null;
        while (rs.next()) {
            masalar = rs.getString("masa");
            String o = masalar;
            comboboxModel.addElement(o);
            rezervasyonMasaModel.addElement(o);
            bosMasaModel.addRow(new Object[]{masalar});
        }
    }

    public static void main(String args[]) throws SQLException {
        new satis_panel().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel UrunlerPanel;
    private javax.swing.JComboBox<String> aySecBasRezervasyon;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JTable display_urunler;
    private javax.swing.JTable eklenen_urunler;
    private javax.swing.JComboBox<String> gunSecBasRezervasyon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel masalarPanel;
    private javax.swing.JTable masalar_bos;
    private javax.swing.JTable masalar_dolu;
    private javax.swing.JButton rezervasyonCikar;
    private javax.swing.JTextPane rezervasyonCikarAdSoyad;
    private javax.swing.JTextPane rezervasyonEkleAdSoyad;
    private javax.swing.JButton rezervasyonEkleButon;
    private javax.swing.JComboBox<String> rezervasyonMasa;
    private javax.swing.JTable rezervasyonTablo;
    private javax.swing.JPanel siparisEkranPanel;
    private javax.swing.JButton siparis_tamamla_button;
    private javax.swing.JPanel tamamlananSiparisPanel;
    private javax.swing.JComboBox<String> yilSecBasRezervasyon;
    // End of variables declaration//GEN-END:variables
}
