import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class tablo {

    public void tablo(JTable table, int x) {
        baglan baglan = new baglan();
        Connection baglanti = baglan.baglan();

        // Kolonlar'ı burada belirliyoruz, x değerine göre.
        String[] kolonlar = new String[0];
        String sorguMetni = "";
        
        switch (x) {
            case 1 -> {
                kolonlar = new String[]{"id", "sasi_numarasi", "marka", "model", "yil", "kilometre", "yakit_tipi", "vites_tipi", "hasar_kaydi"};
                sorguMetni = "SELECT * FROM arabalar";
            }
            case 2 -> {
                kolonlar = new String[]{"id", "isim", "soyisim", "pozisyon", "telefon", "adres"};
                sorguMetni = "SELECT * FROM calisanlar";
            }
            case 3 -> {
                kolonlar = new String[]{"id", "isim", "soyisim", "telefon", "adres"};
                sorguMetni = "SELECT * FROM musteriler";
            }
            case 4 -> {
                kolonlar = new String[]{"id", "araba_id", "musteri_id", "calisan_id", "tarih", "fiyat"};
                sorguMetni = "SELECT * FROM satislar";
            }
            default -> {
            }
        }
        // Diğer x değerlerine göre kolonlar eklenebilir.
        
        try {
            try (Statement sorgu = baglanti.createStatement()) {
                ResultSet sonucKumesi = sorgu.executeQuery(sorguMetni);
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0); // Mevcut satırları temizle

                while (sonucKumesi.next()) {
                    String[] satir = new String[kolonlar.length];
                    for (int i = 0; i < kolonlar.length; i++) {
                        satir[i] = sonucKumesi.getString(kolonlar[i]);
                    }
                    model.addRow(satir);
                }
                table.setModel(model);
            }
            baglanti.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Kayıtlar Listelenemedi.");
        }
    }
}
