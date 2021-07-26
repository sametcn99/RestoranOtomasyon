/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran_otomasyon;

import java.sql.Connection;

/**
 *
 * @author Samet
 */
public class restoran_otomasyon_main {

    static Connection con;
    static String fullurl = "jdbc:sqlserver://localhost:1433;databasename=gorsel3;user=sa;password=1";

    class urun {

        String urunYazdirKontrol;

        urun(String name) {
            this.urunYazdirKontrol = name;
        }

        public String getName() {
            return this.urunYazdirKontrol;
        }
    }

    public static void main(String[] args) {
        admin_giris adminGiris = new admin_giris();
        adminGiris.show();
    }
}
