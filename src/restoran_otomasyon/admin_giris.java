/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran_otomasyon;

import static restoran_otomasyon.satis_panel.con;
import static restoran_otomasyon.satis_panel.fullurl;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Samet
 */
public class admin_giris extends javax.swing.JFrame {

    String butonKontrol = null;

    public admin_giris() {
        initComponents();
    }

    /*Buton kontrol metodunu giriş panelinde kullanıcının 
    hangi butona tıkladığını kontrol etmek ve seçilen paneli açmak için kullandık.
    Kullanıcı bir butona tıkladığında butonKontrol stringinin değerleri değişecek
    ve giriş kontrol metodu çalışacak. Giriş Kontrol metodundaki işlemler başarılı olursa
    butonKontrol stringinden gelen değere göre tıklanan buton çalışmış olacak.*/
    public void butonKontrol() throws SQLException {
        if ("giriş".equals(butonKontrol)) {
            satis_panel urunGoster = new satis_panel();
            urunGoster.show();
            urunGoster.setVisible(true);
        } else if ("yönetici paneli".equals(butonKontrol)) {
            admin_panel adminPanel = new admin_panel();
            adminPanel.show();
            adminPanel.setVisible(true);
        }
    }

    /*Kullanıcı adı ve şifre burada alınır.
    varsayılan kullanıcı adı ve şifreyi kolaylık olması açısından root root olarak atadık.
    Diğer kullanıcı bilgileri sql üzerinden burada kontrol edilecek.*/
    public void girisKontrol() throws SQLException {
        //kullanıcı adı ve şifreyi textfield'lardan burada alındı.
        String admin_kullanici_adi = kullanici_adi_girilen.getText();
        String admin_sifre = sifre_girilen.getText();
        if ("root".equals(admin_kullanici_adi) && "root".equals(admin_sifre)) {
            //varsayılan kullanıcı bilgileri girildiyse butonkontrol metodu çalışacak.
            JOptionPane.showMessageDialog(null, "Giriş Başarılı! " + admin_kullanici_adi + " Sisteme giriş yaptı.");
            butonKontrol();
        }
        try {
            //sql bağlantısı ve kullanıcı bilgileri eşleşmesi burada kontrol edildi.
            con = DriverManager.getConnection(fullurl);
            PreparedStatement st = (PreparedStatement) con.prepareStatement(
                    "Select admin_kullanici_adi, admin_sifre from adminler where admin_kullanici_adi=? and admin_sifre=?");
            System.out.println("bağlantı kuruldu");
            st.setString(1, admin_kullanici_adi);
            st.setString(2, admin_sifre);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Giriş Başarılı! " + admin_kullanici_adi + " Sisteme giriş yaptı.");
                butonKontrol();
            } else {
                kullanici_adi_girilen.setText("");
                sifre_girilen.setText("");
                if (!"root".equals(admin_kullanici_adi) && !"root".equals(admin_sifre)) {
                    JOptionPane.showMessageDialog(null, "Kullanıcı adı veya şifre hatalı.");
                }

            }
        } catch (SQLException sqlException) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpass = new javax.swing.JCheckBox();
        yoneticiPanelGirisButon = new javax.swing.JButton();
        girisYapButon = new javax.swing.JButton();
        kullanici_adi_girilen = new javax.swing.JTextField();
        sifre_girilen = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jpass.setBackground(new java.awt.Color(51, 51, 51));
        jpass.setForeground(new java.awt.Color(204, 204, 204));
        jpass.setText("Şifre Göster");
        jpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassActionPerformed(evt);
            }
        });

        yoneticiPanelGirisButon.setBackground(new java.awt.Color(51, 51, 51));
        yoneticiPanelGirisButon.setForeground(new java.awt.Color(204, 204, 204));
        yoneticiPanelGirisButon.setText("Yönetici Paneli");
        yoneticiPanelGirisButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yoneticiPanelGirisButonMouseClicked(evt);
            }
        });

        girisYapButon.setBackground(new java.awt.Color(51, 51, 51));
        girisYapButon.setForeground(new java.awt.Color(204, 204, 204));
        girisYapButon.setText("Giriş Yap");
        girisYapButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girisYapButonMouseClicked(evt);
            }
        });
        girisYapButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYapButonActionPerformed(evt);
            }
        });

        kullanici_adi_girilen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_adi_girilenActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Şifre:");

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Kullanıcı Adı:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(girisYapButon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yoneticiPanelGirisButon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sifre_girilen, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(kullanici_adi_girilen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpass)
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kullanici_adi_girilen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sifre_girilen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpass))
                .addGap(11, 11, 11)
                .addComponent(girisYapButon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yoneticiPanelGirisButon)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullanici_adi_girilenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_adi_girilenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullanici_adi_girilenActionPerformed

    private void girisYapButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisYapButonMouseClicked
        try {
            butonKontrol = "giriş";
            girisKontrol();
        } catch (SQLException ex) {
            Logger.getLogger(admin_giris.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_girisYapButonMouseClicked

    private void girisYapButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisYapButonActionPerformed

    }//GEN-LAST:event_girisYapButonActionPerformed

    private void jpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassActionPerformed
        //Şifreyi göster ve gizle butonu kodları.
        if (jpass.isSelected()) {
            sifre_girilen.setEchoChar((char) 0);
        } else {
            sifre_girilen.setEchoChar('•');
        }
    }//GEN-LAST:event_jpassActionPerformed

    private void yoneticiPanelGirisButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yoneticiPanelGirisButonMouseClicked
        try {
            butonKontrol = "yönetici paneli";
            girisKontrol();
        } catch (SQLException ex) {
            Logger.getLogger(admin_giris.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_yoneticiPanelGirisButonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new admin_giris().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton girisYapButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jpass;
    private javax.swing.JTextField kullanici_adi_girilen;
    private javax.swing.JPasswordField sifre_girilen;
    private javax.swing.JButton yoneticiPanelGirisButon;
    // End of variables declaration//GEN-END:variables
}
