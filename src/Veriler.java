
public class Veriler {

    // Arabalar Verileri
    public static String araba_id;
    public static String araba_sasiNo;
    public static String araba_marka;
    public static String araba_model;
    public static String araba_yil;
    public static String araba_km;
    public static String araba_yakit;
    public static String araba_vites;
    public static String araba_hasar;

    // Çalışanlar verileri
    public static String calisan_id;
    public static String calisan_isim;
    public static String calisan_soyisim;
    public static String calisan_pozisyon;
    public static String calisan_telefon;
    public static String calisan_adres;

    // Musteriler verileri
    public static String musteri_id;
    public static String musteri_isim;
    public static String musteri_soyisim;
    public static String musteri_telefon;
    public static String musteri_adres;

    // Satislar verileri
    public static String satis_id;
    public static String satis_araba_id;
    public static String satis_calisan_id;
    public static String satis_musteri_id;
    public static String satis_tarihi;
    public static String satis_fiyati;

    public static void temizle() {
        // Arabalar verileri
        araba_id = "";
        araba_sasiNo = "";
        araba_marka = "";
        araba_model = "";
        araba_yil = "";
        araba_km = "";
        araba_yakit = "";
        araba_vites = "";
        araba_hasar = "";

        // Çalışanlar verileri
        calisan_id = "";
        calisan_isim = "";
        calisan_soyisim = "";
        calisan_pozisyon = "";
        calisan_telefon = "";
        calisan_adres = "";

        // Musteriler verileri
        musteri_id = "";
        musteri_isim = "";
        musteri_soyisim = "";
        musteri_telefon = "";
        musteri_adres = "";

        // Satislar verileri
        satis_id = "";
        satis_araba_id = "";
        satis_calisan_id = "";
        satis_musteri_id = "";
        satis_tarihi = "";
        satis_fiyati = "";
    }
}
