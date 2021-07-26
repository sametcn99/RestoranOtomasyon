/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran_otomasyon;

import java.awt.Component;
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
    static String secilenMasa = "";
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
        hizliSatisPaneli = new javax.swing.JPanel();
        UrunlerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display_urunler = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eklenen_urunler = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        siparis_tamamla_button = new javax.swing.JButton();
        combobox = new javax.swing.JComboBox<>();
        RezervasyonPaneli = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        rezervasyonEkleAdSoyad = new javax.swing.JTextPane();
        rezervasyonMasa = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        rezervasyonEkleButon = new javax.swing.JButton();
        yilSecBasRezervasyon = new javax.swing.JComboBox<>();
        aySecBasRezervasyon = new javax.swing.JComboBox<>();
        gunSecBasRezervasyon = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        rezervasyonTablo = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        rezervasyonCikarAdSoyad = new javax.swing.JTextPane();
        rezervasyonCikar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        AdisyonPaneli = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        adisyonBosMasalar = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        adisyonDoluMasalar = new javax.swing.JTable();
        adisyonCombobox = new javax.swing.JComboBox<>();
        UrunlerPanel1 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        display_urunler1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        eklenen_urunler1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        siparis_tamamla_button1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        TamamlananSiparislerPaneli = new javax.swing.JPanel();
        tamamlananSiparisPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        hizliSatisPaneli.setBackground(new java.awt.Color(51, 51, 51));

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
                .addGroup(UrunlerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                    .addGroup(UrunlerPanelLayout.createSequentialGroup()
                        .addGroup(UrunlerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(UrunlerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(siparis_tamamla_button, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

        javax.swing.GroupLayout hizliSatisPaneliLayout = new javax.swing.GroupLayout(hizliSatisPaneli);
        hizliSatisPaneli.setLayout(hizliSatisPaneliLayout);
        hizliSatisPaneliLayout.setHorizontalGroup(
            hizliSatisPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hizliSatisPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UrunlerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        hizliSatisPaneliLayout.setVerticalGroup(
            hizliSatisPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hizliSatisPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UrunlerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hızlı Satış", hizliSatisPaneli);

        RezervasyonPaneli.setBackground(new java.awt.Color(51, 51, 51));
        RezervasyonPaneli.setForeground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Rezervasyon Ekle");

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Ad Soyad:");

        jScrollPane6.setViewportView(rezervasyonEkleAdSoyad);

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Masa:");

        rezervasyonEkleButon.setText("Rezervasyon Ekle");
        rezervasyonEkleButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rezervasyonEkleButonMouseClicked(evt);
            }
        });

        yilSecBasRezervasyon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018", "2017" }));
        yilSecBasRezervasyon.setPreferredSize(new java.awt.Dimension(70, 20));

        aySecBasRezervasyon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        aySecBasRezervasyon.setPreferredSize(new java.awt.Dimension(50, 10));

        gunSecBasRezervasyon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        gunSecBasRezervasyon.setPreferredSize(new java.awt.Dimension(50, 10));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(gunSecBasRezervasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)
                                    .addComponent(aySecBasRezervasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(yilSecBasRezervasyon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rezervasyonMasa, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rezervasyonEkleButon)))))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rezervasyonMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(gunSecBasRezervasyon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aySecBasRezervasyon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yilSecBasRezervasyon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(rezervasyonEkleButon)
                .addContainerGap())
        );

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

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Ad Soyad:");

        jScrollPane7.setViewportView(rezervasyonCikarAdSoyad);

        rezervasyonCikar.setText("Rezervasyon Çıkar");
        rezervasyonCikar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rezervasyonCikarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Rezervasyon Sil");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(rezervasyonCikar)))
                        .addGap(18, 18, 18))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(rezervasyonCikar))
        );

        javax.swing.GroupLayout RezervasyonPaneliLayout = new javax.swing.GroupLayout(RezervasyonPaneli);
        RezervasyonPaneli.setLayout(RezervasyonPaneliLayout);
        RezervasyonPaneliLayout.setHorizontalGroup(
            RezervasyonPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RezervasyonPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RezervasyonPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(RezervasyonPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        RezervasyonPaneliLayout.setVerticalGroup(
            RezervasyonPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RezervasyonPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RezervasyonPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RezervasyonPaneliLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RezervasyonPaneliLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rezervasyon Panel", RezervasyonPaneli);

        AdisyonPaneli.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        adisyonBosMasalar.setBackground(java.awt.Color.green);
        adisyonBosMasalar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Boş Masalar"
            }
        ));
        adisyonBosMasalar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adisyonBosMasalarMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(adisyonBosMasalar);

        adisyonDoluMasalar.setBackground(java.awt.Color.red);
        adisyonDoluMasalar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dolu Masalar"
            }
        ));
        adisyonDoluMasalar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adisyonDoluMasalarMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(adisyonDoluMasalar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        adisyonCombobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adisyonComboboxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adisyonComboboxMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                adisyonComboboxMouseReleased(evt);
            }
        });
        adisyonCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adisyonComboboxActionPerformed(evt);
            }
        });

        UrunlerPanel1.setBackground(new java.awt.Color(51, 51, 51));
        UrunlerPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        display_urunler1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "ad", "fiyat"
            }
        ));
        display_urunler1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                display_urunler1MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(display_urunler1);

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Ürünler");

        eklenen_urunler1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "urun_id", "ad", "fiyat"
            }
        ));
        eklenen_urunler1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eklenen_urunler1MouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(eklenen_urunler1);

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Eklenen Ürünler");

        siparis_tamamla_button1.setText("Siparişi Tamamla");
        siparis_tamamla_button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siparis_tamamla_button1MouseClicked(evt);
            }
        });

        jButton1.setText("Temizle");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UrunlerPanel1Layout = new javax.swing.GroupLayout(UrunlerPanel1);
        UrunlerPanel1.setLayout(UrunlerPanel1Layout);
        UrunlerPanel1Layout.setHorizontalGroup(
            UrunlerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UrunlerPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UrunlerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addGroup(UrunlerPanel1Layout.createSequentialGroup()
                        .addGroup(UrunlerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane12)
                    .addGroup(UrunlerPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(siparis_tamamla_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        UrunlerPanel1Layout.setVerticalGroup(
            UrunlerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UrunlerPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UrunlerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siparis_tamamla_button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Seçilen Masa");

        javax.swing.GroupLayout AdisyonPaneliLayout = new javax.swing.GroupLayout(AdisyonPaneli);
        AdisyonPaneli.setLayout(AdisyonPaneliLayout);
        AdisyonPaneliLayout.setHorizontalGroup(
            AdisyonPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdisyonPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AdisyonPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdisyonPaneliLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(adisyonCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdisyonPaneliLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UrunlerPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        AdisyonPaneliLayout.setVerticalGroup(
            AdisyonPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdisyonPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AdisyonPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdisyonPaneliLayout.createSequentialGroup()
                        .addComponent(UrunlerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(AdisyonPaneliLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adisyonCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Adisyon Paneli", AdisyonPaneli);

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
                    .addGroup(tamamlananSiparisPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE))
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

        javax.swing.GroupLayout TamamlananSiparislerPaneliLayout = new javax.swing.GroupLayout(TamamlananSiparislerPaneli);
        TamamlananSiparislerPaneli.setLayout(TamamlananSiparislerPaneliLayout);
        TamamlananSiparislerPaneliLayout.setHorizontalGroup(
            TamamlananSiparislerPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
            .addGroup(TamamlananSiparislerPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tamamlananSiparisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TamamlananSiparislerPaneliLayout.setVerticalGroup(
            TamamlananSiparislerPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
            .addGroup(TamamlananSiparislerPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TamamlananSiparislerPaneliLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(tamamlananSiparisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(9, 9, 9)))
        );

        jTabbedPane1.addTab("Tamamlanan Siparişler", TamamlananSiparislerPaneli);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
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
            rezervasyonEkleAdSoyad.setText("");
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
            rezervasyonCikarAdSoyad.setText("");
            rezervasyonGoster();
        } catch (SQLException ex) {
            Logger.getLogger(satis_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rezervasyonCikarMouseClicked

    private void adisyonBosMasalarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adisyonBosMasalarMouseClicked
        DefaultTableModel bosMasaModel = (DefaultTableModel) adisyonBosMasalar.getModel();
        DefaultTableModel doluMasaModel = (DefaultTableModel) adisyonDoluMasalar.getModel();
        DefaultComboBoxModel comboboxModel = (DefaultComboBoxModel) adisyonCombobox.getModel();
        MasaDoluBos = (String) bosMasaModel.getValueAt(adisyonBosMasalar.getSelectedRow(), 0);
        System.out.println("masa seçilen: " + MasaDoluBos);
        doluMasaModel.addRow(new Object[]{MasaDoluBos});
        bosMasaModel.removeRow(adisyonBosMasalar.getSelectedRow());
        comboboxModel.removeElement(MasaDoluBos);
    }//GEN-LAST:event_adisyonBosMasalarMouseClicked

    private void adisyonDoluMasalarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adisyonDoluMasalarMouseClicked
        DefaultTableModel bosMasaModel = (DefaultTableModel) adisyonBosMasalar.getModel();
        DefaultTableModel doluMasaModel = (DefaultTableModel) adisyonDoluMasalar.getModel();
        DefaultComboBoxModel comboboxModel = (DefaultComboBoxModel) adisyonCombobox.getModel();
        MasaDoluBos = (String) doluMasaModel.getValueAt(adisyonDoluMasalar.getSelectedRow(), 0);
        System.out.println("masa seçilen: " + MasaDoluBos);
        bosMasaModel.addRow(new Object[]{MasaDoluBos});
        doluMasaModel.removeRow(adisyonDoluMasalar.getSelectedRow());
        comboboxModel.addElement(MasaDoluBos);
    }//GEN-LAST:event_adisyonDoluMasalarMouseClicked

    private void display_urunler1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_display_urunler1MouseClicked
        DefaultTableModel urunGosterModel = (DefaultTableModel) display_urunler1.getModel();
        DefaultTableModel eklenenGosterModel = (DefaultTableModel) eklenen_urunler1.getModel();
        int selectedRow = display_urunler1.getSelectedRow();
        uid = (String) urunGosterModel.getValueAt(selectedRow, 0);
        uadi = (String) urunGosterModel.getValueAt(selectedRow, 1);
        ufiyati = (String) urunGosterModel.getValueAt(selectedRow, 2);
        eklenenGosterModel.addRow(new Object[]{uid, uadi, ufiyati});
        System.out.println("restoran_otomasyon.satis_panel.display_urunler1MouseClicked()");
        try {
            adisyonAc();
        } catch (SQLException ex) {
            Logger.getLogger(satis_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_display_urunler1MouseClicked

    private void eklenen_urunler1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eklenen_urunler1MouseClicked
        DefaultTableModel model2 = (DefaultTableModel) eklenen_urunler1.getModel();
        model2.removeRow(eklenen_urunler1.getSelectedRow());
    }//GEN-LAST:event_eklenen_urunler1MouseClicked

    private void siparis_tamamla_button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siparis_tamamla_button1MouseClicked
        try {
            adisyonKapat();
        } catch (SQLException ex) {
            Logger.getLogger(satis_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_siparis_tamamla_button1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        DefaultTableModel model2 = (DefaultTableModel) eklenen_urunler1.getModel();
        model2.setRowCount(0);
        eklenen_urunler1.updateUI();
    }//GEN-LAST:event_jButton1MouseClicked

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxActionPerformed

    private void comboboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboboxMouseClicked

    }//GEN-LAST:event_comboboxMouseClicked

    private void adisyonComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adisyonComboboxActionPerformed
        try {
            adisyonGuncelle();
        } catch (SQLException ex) {
            Logger.getLogger(satis_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adisyonComboboxActionPerformed

    private void adisyonComboboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adisyonComboboxMouseClicked

    }//GEN-LAST:event_adisyonComboboxMouseClicked

    private void adisyonComboboxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adisyonComboboxMouseReleased

    }//GEN-LAST:event_adisyonComboboxMouseReleased

    private void adisyonComboboxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adisyonComboboxMouseEntered

    }//GEN-LAST:event_adisyonComboboxMouseEntered

    void rezervasyonGoster() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) rezervasyonTablo.getModel();
        String query = "select * from dbo.rezervasyon";
        java.sql.Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        model.setRowCount(0);
        while (rs.next()) {
            String adSoyad = rs.getString("adSoyad");
            String Tarih = rs.getString("Tarih");
            String Masa = rs.getString("Masa");
            model.addRow(new Object[]{adSoyad, Tarih, Masa});
        }
    }

    void urunGoster() throws SQLException {
        final String QUERY = "Select urun_id, urun_adi, urun_fiyati from urunler";
        con = DriverManager.getConnection(fullurl);
        System.out.println("Bağlantı Kuruldu");
        java.sql.Statement stmt = con.createStatement();
        DefaultTableModel model = (DefaultTableModel) display_urunler.getModel();
        DefaultTableModel model2 = (DefaultTableModel) display_urunler1.getModel();
        ResultSet rs = stmt.executeQuery(QUERY);
        while (rs.next()) {
            uid = rs.getString("urun_id");
            uadi = rs.getString("urun_adi");
            ufiyati = rs.getString("urun_fiyati");
            model.addRow(new Object[]{uid, uadi, ufiyati});
            model2.addRow(new Object[]{uid, uadi, ufiyati});
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

    void adisyonAc() throws SQLException {
        DefaultTableModel model2 = (DefaultTableModel) display_urunler1.getModel();
        int rows = eklenen_urunler1.getRowCount();
        secilenMasa = (String) adisyonCombobox.getSelectedItem();
        int i = 0;
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");//dd/MM/yyyy dd.MM.yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        int selectedRow = display_urunler1.getSelectedRow();
        tutar = (String) model2.getValueAt(i, 2);
        System.out.println(selectedRow);
        String query = "insert into dbo.adisyon (masa, urun_id, urun_fiyati, Tarih, urun_adi, toplam) "
                + "values('" + secilenMasa + "', '" + display_urunler1.getValueAt(selectedRow, 0) + "', '" + display_urunler1.getValueAt(selectedRow, 2) + "', '" + strDate + "', '" + display_urunler1.getValueAt(selectedRow, 1) + "', '" + toplamtutar + "')";
        con = DriverManager.getConnection(fullurl);
        System.out.println("Adisyon query: " + query);
        ((Connection) con).createStatement().execute(query);
    }

    void adisyonKapat() throws SQLException {
        DefaultTableModel model2 = (DefaultTableModel) eklenen_urunler1.getModel();
        DefaultTableModel model3 = (DefaultTableModel) jTable1.getModel();
        DefaultComboBoxModel comboboxModel = (DefaultComboBoxModel) adisyonCombobox.getModel();
        int rows = eklenen_urunler1.getRowCount();
        int i = 0;
        while (i != rows) {
            tutar = (String) model2.getValueAt(i, 2);
            toplamtutar = Integer.parseInt(tutar) + toplamtutar;
            System.out.println("tutar:  " + tutar);
            i = i + 1;
        }
        siparisID = UUID.randomUUID().toString();
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");//dd/MM/yyyy dd.MM.yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        secilenMasa = (String) comboboxModel.getSelectedItem().toString();
        model3.addRow(new Object[]{siparisID, strDate, toplamtutar, secilenMasa});
        model2.setRowCount(0);
        tamamlananSiparisKaydi();
        String query = "delete from dbo.adisyon where masa = '" + secilenMasa + "'";
        ((Connection) con).createStatement().execute(query);
    }

    void adisyonGuncelle() throws SQLException {
        DefaultComboBoxModel comboboxModel = (DefaultComboBoxModel) adisyonCombobox.getModel();
        DefaultTableModel model2 = (DefaultTableModel) eklenen_urunler1.getModel();
        model2.setRowCount(0);
        //secilenMasa = (String) comboboxModel.getSelectedItem();
        String query = "select * from dbo.adisyon where masa = '" + comboboxModel.getSelectedItem().toString() + "'";
        java.sql.Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            uid = rs.getString("urun_id");
            uadi = rs.getString("urun_adi");
            ufiyati = rs.getString("urun_fiyati");
            model2.addRow(new Object[]{uid, uadi, ufiyati});
        }
        System.out.println("restoran_otomasyon.satis_panel.adisyonGuncelle()");
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
        DefaultComboBoxModel adisyonComboboxModel = (DefaultComboBoxModel) adisyonCombobox.getModel();
        DefaultComboBoxModel rezervasyonMasaModel = (DefaultComboBoxModel) rezervasyonMasa.getModel();
        DefaultTableModel adisyonbosMasaModel = (DefaultTableModel) adisyonBosMasalar.getModel();
        String masalar = null;
        while (rs.next()) {
            masalar = rs.getString("masa");
            String o = masalar;
            comboboxModel.addElement(o);
            rezervasyonMasaModel.addElement(o);
            adisyonComboboxModel.addElement(o);
            adisyonbosMasaModel.addRow(new Object[]{masalar});
        }
    }

    public static void main(String args[]) throws SQLException {
        new satis_panel().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdisyonPaneli;
    private javax.swing.JPanel RezervasyonPaneli;
    private javax.swing.JPanel TamamlananSiparislerPaneli;
    private static javax.swing.JPanel UrunlerPanel;
    private static javax.swing.JPanel UrunlerPanel1;
    public static javax.swing.JTable adisyonBosMasalar;
    private javax.swing.JComboBox<String> adisyonCombobox;
    public static javax.swing.JTable adisyonDoluMasalar;
    private static javax.swing.JComboBox<String> aySecBasRezervasyon;
    private javax.swing.JComboBox<String> combobox;
    private static javax.swing.JTable display_urunler;
    private static javax.swing.JTable display_urunler1;
    private static javax.swing.JTable eklenen_urunler;
    private static javax.swing.JTable eklenen_urunler1;
    private static javax.swing.JComboBox<String> gunSecBasRezervasyon;
    private javax.swing.JPanel hizliSatisPaneli;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JButton rezervasyonCikar;
    private javax.swing.JTextPane rezervasyonCikarAdSoyad;
    private javax.swing.JTextPane rezervasyonEkleAdSoyad;
    private javax.swing.JButton rezervasyonEkleButon;
    private static javax.swing.JComboBox<String> rezervasyonMasa;
    private static javax.swing.JTable rezervasyonTablo;
    private javax.swing.JButton siparis_tamamla_button;
    private javax.swing.JButton siparis_tamamla_button1;
    private javax.swing.JPanel tamamlananSiparisPanel;
    private static javax.swing.JComboBox<String> yilSecBasRezervasyon;
    // End of variables declaration//GEN-END:variables
}
