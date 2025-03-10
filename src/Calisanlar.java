
import java.io.PrintStream;
import java.nio.charset.Charset;

public class Calisanlar extends javax.swing.JFrame {

    public Calisanlar() {
        System.setOut(new PrintStream(System.out, true, Charset.forName("UTF-8")));
        System.out.println("Türkçe karakterler: ç, ğ, ü, ö, ş, ı");
        initComponents();

        // Sayfa açıldığında TextField'lara verileri ekleyelim
        if (Veriler.calisan_id != null) {
            tf_id.setText(Veriler.calisan_id);
        }
        if (Veriler.calisan_isim != null) {
            tf_isim.setText(Veriler.calisan_isim);
        }
        if (Veriler.calisan_soyisim != null) {
            tf_soyisim.setText(Veriler.calisan_soyisim);
        }
        if (Veriler.calisan_pozisyon != null) {
            tf_pozisyon.setText(Veriler.calisan_pozisyon);
        }
        if (Veriler.calisan_telefon != null) {
            tf_telefon.setText(Veriler.calisan_telefon);
        }
        if (Veriler.calisan_adres != null) {
            ta_adres.setText(Veriler.calisan_adres);
        }

        Tablo tablo = new Tablo();
        tablo.tablo(jTable1, 2);
    }

    public void veriTut(int x) {
        // Çalışanlar sayfasındaki verileri Veriler sınıfına kaydediyoruz
        Veriler.calisan_id = tf_id.getText();
        Veriler.calisan_isim = tf_isim.getText();
        Veriler.calisan_soyisim = tf_soyisim.getText();
        Veriler.calisan_pozisyon = tf_pozisyon.getText();
        Veriler.calisan_telefon = tf_telefon.getText();
        Veriler.calisan_adres = ta_adres.getText();

        if (x == 1) {
            Arabalar arabalarPage = new Arabalar();
            arabalarPage.setVisible(true);
        }
        if (x == 2) {
            Satislar satislarPage = new Satislar();
            satislarPage.setVisible(true);
        }
        if (x == 3) {
            Musteriler musterilerPage = new Musteriler();
            musterilerPage.setVisible(true);
        }
        if (x == 4) {
            Calisanlar calisanlarPage = new Calisanlar();
            calisanlarPage.setVisible(true);
        }
        this.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_id = new javax.swing.JLabel();
        lbl_isim = new javax.swing.JLabel();
        lbl_soyisim = new javax.swing.JLabel();
        lbl_pozisyon = new javax.swing.JLabel();
        lbl_telefon = new javax.swing.JLabel();
        lbl_adres = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_isim = new javax.swing.JTextField();
        tf_soyisim = new javax.swing.JTextField();
        tf_pozisyon = new javax.swing.JTextField();
        tf_telefon = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_adres = new javax.swing.JTextArea();
        btn_ekle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_duzenle = new javax.swing.JButton();
        btn_arabalar = new javax.swing.JButton();
        btn_satislar = new javax.swing.JButton();
        btn_musteriler = new javax.swing.JButton();
        btn_calisanlar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_temizle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Çalışanlar");
        setAutoRequestFocus(false);

        lbl_id.setText("ID");

        lbl_isim.setText("İsim");

        lbl_soyisim.setText("Soyisim");

        lbl_pozisyon.setText("Pozisyon");

        lbl_telefon.setText("Telefon");

        lbl_adres.setText("Adres");

        ta_adres.setColumns(20);
        ta_adres.setRows(5);
        jScrollPane2.setViewportView(ta_adres);

        btn_ekle.setText("Ekle");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });

        btn_sil.setText("Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        btn_duzenle.setText("Düzenle");
        btn_duzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_duzenleActionPerformed(evt);
            }
        });

        btn_arabalar.setText("Arabalar");
        btn_arabalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_arabalarActionPerformed(evt);
            }
        });

        btn_satislar.setText("Satışlar");
        btn_satislar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_satislarActionPerformed(evt);
            }
        });

        btn_musteriler.setText("Müşteriler");
        btn_musteriler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_musterilerActionPerformed(evt);
            }
        });

        btn_calisanlar.setText("Çalışanlar");
        btn_calisanlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calisanlarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "İsim", "Soyisim", "Pozisyon", "Telefon", "Adres"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_temizle.setText("Temizle");
        btn_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temizleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_adres, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pozisyon, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_soyisim, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_pozisyon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_soyisim)
                            .addComponent(tf_isim, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_id, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addComponent(tf_telefon))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btn_sil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_duzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_arabalar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_satislar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_musteriler, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(btn_calisanlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_arabalar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_satislar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_musteriler)
                        .addGap(18, 18, 18)
                        .addComponent(btn_calisanlar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_id)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ekle))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_isim)
                            .addComponent(tf_isim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sil))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_soyisim)
                            .addComponent(tf_soyisim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_duzenle))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_pozisyon)
                            .addComponent(tf_pozisyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_temizle))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_telefon)
                            .addComponent(tf_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_adres)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
        ESD ekle = new ESD();
        ekle.calisanEkle(jTable1, tf_id, tf_isim, tf_soyisim, tf_pozisyon, tf_telefon, ta_adres);
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        ESD sil = new ESD();
        sil.sil(jTable1, 2);
    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_duzenleActionPerformed
        ESD duzenle = new ESD();
        duzenle.calisanDuzenle(jTable1, tf_id, tf_isim, tf_soyisim, tf_pozisyon, tf_telefon, ta_adres);
    }//GEN-LAST:event_btn_duzenleActionPerformed

    private void btn_arabalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_arabalarActionPerformed
        veriTut(1);
    }//GEN-LAST:event_btn_arabalarActionPerformed

    private void btn_satislarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_satislarActionPerformed
        veriTut(2);
    }//GEN-LAST:event_btn_satislarActionPerformed

    private void btn_musterilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_musterilerActionPerformed
        veriTut(3);
    }//GEN-LAST:event_btn_musterilerActionPerformed

    private void btn_calisanlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calisanlarActionPerformed
        veriTut(4);
    }//GEN-LAST:event_btn_calisanlarActionPerformed

    private void btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temizleActionPerformed
        tf_id.setText("");
        tf_isim.setText("");
        tf_soyisim.setText("");
        tf_pozisyon.setText("");
        tf_telefon.setText("");
        ta_adres.setText("");  // JTextArea için
    }//GEN-LAST:event_btn_temizleActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calisanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Calisanlar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_arabalar;
    private javax.swing.JButton btn_calisanlar;
    private javax.swing.JButton btn_duzenle;
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_musteriler;
    private javax.swing.JButton btn_satislar;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_temizle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_adres;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_isim;
    private javax.swing.JLabel lbl_pozisyon;
    private javax.swing.JLabel lbl_soyisim;
    private javax.swing.JLabel lbl_telefon;
    private javax.swing.JTextArea ta_adres;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_isim;
    private javax.swing.JTextField tf_pozisyon;
    private javax.swing.JTextField tf_soyisim;
    private javax.swing.JTextField tf_telefon;
    // End of variables declaration//GEN-END:variables
}
