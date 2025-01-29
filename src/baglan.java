import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class baglan {

    public Connection baglan() {
        String yol = "jdbc:sqlite:gallery.db"; // SQLite dosya yolu
        Connection conn = null;
        try {
            // Veritabanı bağlantısını kuruyoruz
            conn = DriverManager.getConnection(yol);
            if (conn != null) {
                System.out.println("SQLite veritabanı bağlantısı başarılı.");
            }
        } catch (SQLException e) {
            // Hata durumunda kullanıcıya mesaj gösteriyoruz
            JOptionPane.showMessageDialog(null, "Veritabanı Bağlantısı Sırasında Bir Hata Oluştu: " + e.getMessage());
        }
        return conn;
    }
}
