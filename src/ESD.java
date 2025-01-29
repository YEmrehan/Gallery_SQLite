import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ESD {

    public void arabaEkle(JTable jTable1, JTextField tf_id, JTextField tf_sasi_no, JTextField tf_marka,
            JTextField tf_model, JSpinner spn_yil, JSpinner spn_km,
            JComboBox<String> cmb_yakit, JComboBox<String> cmb_vites, JTextField tf_hasar) {
        baglan baglan = new baglan();
        Connection baglanti = baglan.baglan();
        tablo tablo = new tablo();
        tablo.tablo(jTable1, 1);
        try {
            try (Statement sorgu = baglanti.createStatement()) {
                String id = tf_id.getText();
                String sasi_numarasi = tf_sasi_no.getText();
                String marka = tf_marka.getText();
                String model = tf_model.getText();
                String yil = spn_yil.getValue().toString();
                String kilometre = spn_km.getValue().toString();
                String yakit_tipi = cmb_yakit.getSelectedItem().toString();
                String vites_tipi = cmb_vites.getSelectedItem().toString();
                String hasar_kaydi = tf_hasar.getText();

                sorgu.executeUpdate(
                        "INSERT INTO arabalar(id,sasi_numarasi,marka,model,yil,kilometre,yakit_tipi,vites_tipi,hasar_kaydi)"
                        + "VALUES('" + id + "','" + sasi_numarasi + "','" + marka + "','" + model + "','" + yil + "','" + kilometre + "','" + yakit_tipi + "','" + vites_tipi + "','" + hasar_kaydi + "')"
                );
            }
            baglanti.close();
            JOptionPane.showMessageDialog(null, "Kayıt Eklendi.");
            tablo.tablo(jTable1, 1);
        } catch (SQLException mySQLException) {
            JOptionPane.showMessageDialog(null, "Kayıt Eklenemedi.");
        }
    }

    public void calisanEkle(JTable jTable1, JTextField tf_id, JTextField tf_isim, JTextField tf_soyisim,
            JTextField tf_pozisyon, JTextField tf_telefon, JTextArea ta_adres) {
        baglan baglan = new baglan();
        Connection baglanti = baglan.baglan();
        tablo tablo = new tablo();
        tablo.tablo(jTable1, 2);
        try {
            try (Statement sorgu = baglanti.createStatement()) {
                String id = tf_id.getText();
                String isim = tf_isim.getText();
                String soyisim = tf_soyisim.getText();
                String pozisyon = tf_pozisyon.getText();
                String telefon = tf_telefon.getText();
                String adres = ta_adres.getText();

                sorgu.executeUpdate(
                        "INSERT INTO arabalar(id,isim,soyisim,pozisyon,telefon,adres)"
                        + "VALUES('" + id + "','" + isim + "','" + soyisim + "','" + pozisyon + "','" + telefon + "','" + adres + "')"
                );
            }
            baglanti.close();
            JOptionPane.showMessageDialog(null, "Kayıt Eklendi.");
            tablo.tablo(jTable1, 2);
        } catch (SQLException mySQLException) {
            JOptionPane.showMessageDialog(null, "Kayıt Eklenemedi.");
        }
    }

    public void musteriEkle(JTable jTable1, JTextField tf_id, JTextField tf_isim, JTextField tf_soyisim, JTextField tf_telefon, JTextArea ta_adres) {
        baglan baglan = new baglan();
        Connection baglanti = baglan.baglan();
        tablo tablo = new tablo();
        tablo.tablo(jTable1, 3);
        try {
            try (Statement sorgu = baglanti.createStatement()) {
                String id = tf_id.getText();
                String isim = tf_isim.getText();
                String soyisim = tf_soyisim.getText();
                String telefon = tf_telefon.getText();
                String adres = ta_adres.getText();

                sorgu.executeUpdate(
                        "INSERT INTO arabalar(id,isim,soyisim,telefon,adres)"
                        + "VALUES('" + id + "','" + isim + "','" + soyisim + "','" + telefon + "','" + adres + "')"
                );
            }
            baglanti.close();
            JOptionPane.showMessageDialog(null, "Kayıt Eklendi.");
            tablo.tablo(jTable1, 2);
        } catch (SQLException mySQLException) {
            JOptionPane.showMessageDialog(null, "Kayıt Eklenemedi.");
        }
    }

    public void satisEkle(JTable jTable1, JTextField tf_id, JTextField tf_araba_id, JTextField tf_musteri_id, JTextField tf_calisan_id,
            JTextField tf_satis_tarihi, JTextField tf_satis_fiyati) {
        baglan baglan = new baglan();
        Connection baglanti = baglan.baglan();
        tablo tablo = new tablo();
        tablo.tablo(jTable1, 4);
        try {
            try (Statement sorgu = baglanti.createStatement()) {
                String id = tf_id.getText();
                String araba_id = tf_araba_id.getText();
                String musteri_id = tf_musteri_id.getText();
                String calisan_id = tf_calisan_id.getText();
                String tarih = tf_satis_tarihi.getText();
                String fiyat = tf_satis_fiyati.getText();

                sorgu.executeUpdate(
                        "INSERT INTO arabalar(id, araba_id, musteri_id, calisan_id, tarih, fiyat)"
                        + "VALUES('" + id + "','" + araba_id + "','" + musteri_id + "','" + calisan_id + "','" + tarih + "','" + fiyat + "')"
                );
            }
            baglanti.close();
            JOptionPane.showMessageDialog(null, "Kayıt Eklendi.");
            tablo.tablo(jTable1, 2);
        } catch (SQLException mySQLException) {
            JOptionPane.showMessageDialog(null, "Kayıt Eklenemedi.");
        }
    }

    public void sil(JTable jTable1) {
        baglan baglan = new baglan();
        Connection baglanti = baglan.baglan();
        tablo tablo = new tablo();
        try {
            if (jTable1.getSelectedRowCount() > 0) {
                if (JOptionPane.showConfirmDialog(null, "Silmek İstiyor musunuz", "Silme İşlemi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    int satirNumarasi = jTable1.getSelectedRow();
                    System.out.println("Secilen Satir: " + satirNumarasi);
                    String id = jTable1.getValueAt(satirNumarasi, 0).toString();
                    System.out.println("id: " + id);
                    try (Statement sorgu = baglanti.createStatement()) {
                        sorgu.executeUpdate("DELETE FROM arabalar WHERE id='" + id + "'");
                    }
                    baglanti.close();
                    JOptionPane.showMessageDialog(null, "Seçili Kayıt Silindi.");
                    tablo.tablo(jTable1, 1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Lütfen Silmek İstediğiniz Kaydı Tablodan Seçiniz.");
            }
        } catch (SQLException mySQLExp) {
            JOptionPane.showMessageDialog(null, "Kayıt Silinemedi.");
        }
    }

    public void arabaDuzenle(JTable jTable1, JTextField tf_id, JTextField tf_sasi_no, JTextField tf_marka,
            JTextField tf_model, JSpinner spn_yil, JSpinner spn_km,
            JComboBox<String> cmb_yakit, JComboBox<String> cmb_vites, JTextField tf_hasar) {
        baglan baglan = new baglan();
        Connection baglanti = baglan.baglan();
        tablo tablo = new tablo();

        try {
            // Eğer tablodan bir satır seçilmişse
            if (jTable1.getSelectedRowCount() > 0) {
                // Seçilen satırın indeksini al
                int satirNumarasi = jTable1.getSelectedRow();
                // Seçilen satırdaki ID değerini al (ilk kolon)
                String id = jTable1.getValueAt(satirNumarasi, 0).toString();

                // Kullanıcının düzenlediği yeni verileri al
                String sasi_numarasi = tf_sasi_no.getText();
                String marka = tf_marka.getText();
                String model = tf_model.getText();
                String yil = spn_yil.getValue().toString();
                String kilometre = spn_km.getValue().toString();
                String yakit_tipi = cmb_yakit.getSelectedItem().toString();
                String vites_tipi = cmb_vites.getSelectedItem().toString();
                String hasar_kaydi = tf_hasar.getText();

                // SQL UPDATE sorgusu
                StringBuilder sqlUpdate = new StringBuilder("UPDATE arabalar SET ");
                List<String> updates = new ArrayList<>();

                // Alanlar boş değilse, sadece güncellenmesi gereken alanları ESD
                if (!sasi_numarasi.isEmpty()) {
                    updates.add("sasi_numarasi = ?");
                }
                if (!marka.isEmpty()) {
                    updates.add("marka = ?");
                }
                if (!model.isEmpty()) {
                    updates.add("model = ?");
                }
                if (!yil.isEmpty()) {
                    updates.add("yil = ?");
                }
                if (!kilometre.isEmpty()) {
                    updates.add("kilometre = ?");
                }
                if (!yakit_tipi.isEmpty()) {
                    updates.add("yakit_tipi = ?");
                }
                if (!vites_tipi.isEmpty()) {
                    updates.add("vites_tipi = ?");
                }
                if (!hasar_kaydi.isEmpty()) {
                    updates.add("hasar_kaydi = ?");
                }

                // Güncelleme kısmını oluştur
                sqlUpdate.append(String.join(", ", updates));
                sqlUpdate.append(" WHERE id = ?");

                // Parametreleri sırasıyla yerleştir
                try ( // Sorguyu hazırlama
                        PreparedStatement preparedStatement = baglanti.prepareStatement(sqlUpdate.toString())) {
                    // Parametreleri sırasıyla yerleştir
                    int index = 1;
                    if (!sasi_numarasi.isEmpty()) {
                        preparedStatement.setString(index++, sasi_numarasi);
                    }
                    if (!marka.isEmpty()) {
                        preparedStatement.setString(index++, marka);
                    }
                    if (!model.isEmpty()) {
                        preparedStatement.setString(index++, model);
                    }
                    if (!yil.isEmpty()) {
                        preparedStatement.setString(index++, yil);
                    }
                    if (!kilometre.isEmpty()) {
                        preparedStatement.setString(index++, kilometre);
                    }
                    if (!yakit_tipi.isEmpty()) {
                        preparedStatement.setString(index++, yakit_tipi);
                    }
                    if (!vites_tipi.isEmpty()) {
                        preparedStatement.setString(index++, vites_tipi);
                    }
                    if (!hasar_kaydi.isEmpty()) {
                        preparedStatement.setString(index++, hasar_kaydi);
                    }
                    preparedStatement.setString(index, id);
                    // SQL sorgusunu çalıştır
                    preparedStatement.executeUpdate();
                    // Bağlantıyı kapat
                }
                baglanti.close();

                // Kullanıcıya bilgi ver
                JOptionPane.showMessageDialog(null, "Kayıt Güncellendi.");
                // Tabloyu güncelle
                tablo.tablo(jTable1, 1);
            } else {
                // Eğer kullanıcı herhangi bir satır seçmediyse
                JOptionPane.showMessageDialog(null, "Lütfen Güncellemek İstediğiniz Kaydı Tablodan Seçiniz.");
            }
        } catch (SQLException mySQLExp) {
            // Hata durumunda kullanıcıya bilgi ver
            JOptionPane.showMessageDialog(null, "Kayıt Güncellenemedi.");
        }
    }

    public void calisanDuzenle(JTable jTable1, JTextField tf_id, JTextField tf_isim, JTextField tf_soyisim, JTextField tf_pozisyon, JTextField tf_telefon, JTextArea ta_adres) {
        baglan baglan = new baglan();
        Connection baglanti = baglan.baglan();
        tablo tablo = new tablo();

        try {
            // Eğer tablodan bir satır seçilmişse
            if (jTable1.getSelectedRowCount() > 0) {
                // Seçilen satırın indeksini al
                int satirNumarasi = jTable1.getSelectedRow();
                // Seçilen satırdaki ID değerini al (ilk kolon)
                String id = jTable1.getValueAt(satirNumarasi, 0).toString();

                // Kullanıcının düzenlediği yeni verileri al
                String isim = tf_isim.getText();
                String soyisim = tf_soyisim.getText();
                String pozisyon = tf_pozisyon.getText();
                String telefon = tf_telefon.getText();
                String adres = ta_adres.getText();
                // SQL UPDATE sorgusu
                StringBuilder sqlUpdate = new StringBuilder("UPDATE arabalar SET ");
                List<String> updates = new ArrayList<>();

                // Alanlar boş değilse, sadece güncellenmesi gereken alanları ekle
                if (!isim.isEmpty()) {
                    updates.add("isim = ?");
                }
                if (!soyisim.isEmpty()) {
                    updates.add("soyisim = ?");
                }
                if (!pozisyon.isEmpty()) {
                    updates.add("pozisyon = ?");
                }
                if (!telefon.isEmpty()) {
                    updates.add("telefon = ?");
                }
                if (!adres.isEmpty()) {
                    updates.add("adres = ?");
                }

                // Güncelleme kısmını oluştur
                sqlUpdate.append(String.join(", ", updates));
                sqlUpdate.append(" WHERE id = ?");

                // Parametreleri sırasıyla yerleştir
                try ( // Sorguyu hazırlama
                        PreparedStatement preparedStatement = baglanti.prepareStatement(sqlUpdate.toString())) {
                    // Parametreleri sırasıyla yerleştir
                    int index = 1;
                    if (!isim.isEmpty()) {
                        preparedStatement.setString(index++, isim);
                    }
                    if (!soyisim.isEmpty()) {
                        preparedStatement.setString(index++, soyisim);
                    }
                    if (!pozisyon.isEmpty()) {
                        preparedStatement.setString(index++, pozisyon);
                    }
                    if (!telefon.isEmpty()) {
                        preparedStatement.setString(index++, telefon);
                    }
                    if (!adres.isEmpty()) {
                        preparedStatement.setString(index++, adres);
                    }

                    preparedStatement.setString(index, id);
                    // SQL sorgusunu çalıştır
                    preparedStatement.executeUpdate();
                    // Bağlantıyı kapat
                }
                baglanti.close();

                // Kullanıcıya bilgi ver
                JOptionPane.showMessageDialog(null, "Kayıt Güncellendi.");
                // Tabloyu güncelle
                tablo.tablo(jTable1, 2);
            } else {
                // Eğer kullanıcı herhangi bir satır seçmediyse
                JOptionPane.showMessageDialog(null, "Lütfen Güncellemek İstediğiniz Kaydı Tablodan Seçiniz.");
            }
        } catch (SQLException mySQLExp) {
            // Hata durumunda kullanıcıya bilgi ver
            JOptionPane.showMessageDialog(null, "Kayıt Güncellenemedi.");
        }
    }

    public void musteriDuzenle(JTable jTable1, JTextField tf_id, JTextField tf_isim, JTextField tf_soyisim, JTextField tf_telefon, JTextArea ta_adres) {
        baglan baglan = new baglan();
        Connection baglanti = baglan.baglan();
        tablo tablo = new tablo();

        try {
            // Eğer tablodan bir satır seçilmişse
            if (jTable1.getSelectedRowCount() > 0) {
                // Seçilen satırın indeksini al
                int satirNumarasi = jTable1.getSelectedRow();
                // Seçilen satırdaki ID değerini al (ilk kolon)
                String id = jTable1.getValueAt(satirNumarasi, 0).toString();

                // Kullanıcının düzenlediği yeni verileri al
                String isim = tf_isim.getText();
                String soyisim = tf_soyisim.getText();
                String telefon = tf_telefon.getText();
                String adres = ta_adres.getText();
                // SQL UPDATE sorgusu
                StringBuilder sqlUpdate = new StringBuilder("UPDATE arabalar SET ");
                List<String> updates = new ArrayList<>();

                // Alanlar boş değilse, sadece güncellenmesi gereken alanları ekle
                if (!isim.isEmpty()) {
                    updates.add("isim = ?");
                }
                if (!soyisim.isEmpty()) {
                    updates.add("soyisim = ?");
                }
                if (!telefon.isEmpty()) {
                    updates.add("telefon = ?");
                }
                if (!adres.isEmpty()) {
                    updates.add("adres = ?");
                }

                // Güncelleme kısmını oluştur
                sqlUpdate.append(String.join(", ", updates));
                sqlUpdate.append(" WHERE id = ?");

                // Parametreleri sırasıyla yerleştir
                try ( // Sorguyu hazırlama
                        PreparedStatement preparedStatement = baglanti.prepareStatement(sqlUpdate.toString())) {
                    // Parametreleri sırasıyla yerleştir
                    int index = 1;
                    if (!isim.isEmpty()) {
                        preparedStatement.setString(index++, isim);
                    }
                    if (!soyisim.isEmpty()) {
                        preparedStatement.setString(index++, soyisim);
                    }
                    if (!telefon.isEmpty()) {
                        preparedStatement.setString(index++, telefon);
                    }
                    if (!adres.isEmpty()) {
                        preparedStatement.setString(index++, adres);
                    }

                    preparedStatement.setString(index, id);
                    // SQL sorgusunu çalıştır
                    preparedStatement.executeUpdate();
                    // Bağlantıyı kapat
                }
                baglanti.close();

                // Kullanıcıya bilgi ver
                JOptionPane.showMessageDialog(null, "Kayıt Güncellendi.");
                // Tabloyu güncelle
                tablo.tablo(jTable1, 2);
            } else {
                // Eğer kullanıcı herhangi bir satır seçmediyse
                JOptionPane.showMessageDialog(null, "Lütfen Güncellemek İstediğiniz Kaydı Tablodan Seçiniz.");
            }
        } catch (SQLException mySQLExp) {
            // Hata durumunda kullanıcıya bilgi ver
            JOptionPane.showMessageDialog(null, "Kayıt Güncellenemedi.");
        }
    }

    public void satisDuzanle(JTable jTable1, JTextField tf_araba_id, JTextField tf_musteri_id, JTextField tf_calisan_id, JTextField tf_tarih, JTextField tf_fiyat) {
        baglan baglan = new baglan();
        Connection baglanti = baglan.baglan();
        tablo tablo = new tablo();
        
        try {
            // Eğer tablodan bir satır seçilmişse
            if (jTable1.getSelectedRowCount() > 0) {
                // Seçilen satırın indeksini al
                int satirNumarasi = jTable1.getSelectedRow();

                // Seçilen satırdaki ID değerini al (ilk kolon)
                String id = jTable1.getValueAt(satirNumarasi, 0).toString();

                // Kullanıcının düzenlediği yeni verileri al
                String araba_id = tf_araba_id.getText();
                String musteri_id = tf_musteri_id.getText();
                String calisan_id = tf_calisan_id.getText();
                String tarih = tf_tarih.getText();
                String fiyat = tf_fiyat.getText();

                // SQL UPDATE sorgusu
                StringBuilder sqlUpdate = new StringBuilder("UPDATE arabalar SET ");
                List<String> updates = new ArrayList<>();

                // Alanlar boş değilse, sadece güncellenmesi gereken alanları ESD
                if (!araba_id.isEmpty()) {
                    updates.add("araba_id = ?");
                }
                if (!musteri_id.isEmpty()) {
                    updates.add("musteri_id = ?");
                }
                if (!calisan_id.isEmpty()) {
                    updates.add("calisan_id = ?");
                }
                if (!tarih.isEmpty()) {
                    updates.add("tarih = ?");
                }
                if (!fiyat.isEmpty()) {
                    updates.add("fiyat = ?");
                }  

                // Güncelleme kısmını oluştur
                sqlUpdate.append(String.join(", ", updates));
                sqlUpdate.append(" WHERE id = ?");

                // Parametreleri sırasıyla yerleştir
                try ( // Sorguyu hazırlama
                        PreparedStatement preparedStatement = baglanti.prepareStatement(sqlUpdate.toString())) {
                    // Parametreleri sırasıyla yerleştir
                    int index = 1;
                    if (!araba_id.isEmpty()) {
                        preparedStatement.setString(index++, araba_id);
                    }
                    if (!musteri_id.isEmpty()) {
                        preparedStatement.setString(index++, musteri_id);
                    }
                    if (!calisan_id.isEmpty()) {
                        preparedStatement.setString(index++, calisan_id);
                    }
                    if (!tarih.isEmpty()) {
                        preparedStatement.setString(index++, tarih);
                    }
                    if (!fiyat.isEmpty()) {
                        preparedStatement.setString(index++, fiyat);
                    }
                   
                    preparedStatement.setString(index, id);
                    // SQL sorgusunu çalıştır
                    preparedStatement.executeUpdate();
                    // Bağlantıyı kapat
                }
                baglanti.close();

                // Kullanıcıya bilgi ver
                JOptionPane.showMessageDialog(null, "Kayıt Güncellendi.");
                // Tabloyu güncelle
                tablo.tablo(jTable1, 1);
            } else {
                // Eğer kullanıcı herhangi bir satır seçmediyse
                JOptionPane.showMessageDialog(null, "Lütfen Güncellemek İstediğiniz Kaydı Tablodan Seçiniz.");
            }
        } catch (SQLException mySQLExp) {
            // Hata durumunda kullanıcıya bilgi ver
            JOptionPane.showMessageDialog(null, "Kayıt Güncellenemedi.");
        }
    }
}
