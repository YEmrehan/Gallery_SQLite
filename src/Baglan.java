import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Baglan {

    public Connection baglan() {
        String yol = "jdbc:sqlite:gallery.db"; // SQLite dosya yolu
        Connection conn = null;
        try {
            // Veritabanı bağlantısını kuruyoruz
            conn = DriverManager.getConnection(yol);
            if (conn != null) {
                System.out.println("SQLite veritabanı bağlantısı başarılı.");

                // FOREIGN KEY kısıtlamalarını açıyoruz
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute("PRAGMA foreign_keys = ON;");
                } catch (SQLException e) {
                    System.err.println("Foreign key ayarı başarısız: " + e.getMessage());
                }
            }
        } catch (SQLException e) {
            // Hata durumunda kullanıcıya mesaj gösteriyoruz
            JOptionPane.showMessageDialog(null, "Veritabanı Bağlantısı Sırasında Bir Hata Oluştu: " + e.getMessage());
        }
        return conn;
    }
}
