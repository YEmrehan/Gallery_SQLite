import java.io.PrintStream;
import java.nio.charset.Charset;

public class satislar extends javax.swing.JFrame {

    public satislar() {
        System.setOut(new PrintStream(System.out, true, Charset.forName("UTF-8")));
        System.out.println("Türkçe karakterler: ç, ğ, ü, ö, ş, ı");
        initComponents();
        tablo tablo = new tablo();
        tablo.tablo(jTable1, 4);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_id = new javax.swing.JLabel();
        lbl_araba_id = new javax.swing.JLabel();
        lbl_musteri_id = new javax.swing.JLabel();
        lbl_calisan_id = new javax.swing.JLabel();
        lbl_satis_tarihi = new javax.swing.JLabel();
        lbl_satis_fiyati = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_araba_id = new javax.swing.JTextField();
        tf_musteri_id = new javax.swing.JTextField();
        tf_calisan_id = new javax.swing.JTextField();
        tf_satis_tarihi = new javax.swing.JTextField();
        tf_satis_fiyati = new javax.swing.JTextField();
        btn_ekle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_duzenle = new javax.swing.JButton();
        btn_arabalar = new javax.swing.JButton();
        btn_satislar = new javax.swing.JButton();
        btn_musteriler = new javax.swing.JButton();
        btn_calisanlar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Satışlar");
        setPreferredSize(new java.awt.Dimension(850, 700));

        lbl_id.setText("ID");

        lbl_araba_id.setText("Araba ID");

        lbl_musteri_id.setText("Müşteri ID");

        lbl_calisan_id.setText("Çalışan ID");

        lbl_satis_tarihi.setText("Satış Tarihi");

        lbl_satis_fiyati.setText("Satış Fiyatı");

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
                "ID", "Araba ID", "Müşteri ID", "Çalışan ID", "Satış Tarihi", "Satış Fiyatı"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_satis_fiyati, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_calisan_id, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_satis_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_calisan_id, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(tf_satis_tarihi)
                                    .addComponent(tf_satis_fiyati)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_musteri_id, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_araba_id, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_musteri_id)
                                    .addComponent(tf_araba_id, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_id, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_duzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btn_sil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_arabalar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_satislar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_musteriler, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(btn_calisanlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
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
                            .addComponent(lbl_araba_id)
                            .addComponent(tf_araba_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sil))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_musteri_id)
                            .addComponent(tf_musteri_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_duzenle))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_calisan_id)
                            .addComponent(tf_calisan_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_satis_tarihi)
                            .addComponent(tf_satis_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_satis_fiyati)
                    .addComponent(tf_satis_fiyati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_satislarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_satislarActionPerformed
        satislar satislarPage = new satislar();
        satislarPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_satislarActionPerformed

    private void btn_musterilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_musterilerActionPerformed
        musteriler musterilerPage = new musteriler();
        musterilerPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_musterilerActionPerformed

    private void btn_calisanlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calisanlarActionPerformed
        calisanlar calisanlarPage = new calisanlar();
        calisanlarPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_calisanlarActionPerformed

    private void btn_duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_duzenleActionPerformed
        ESD duzenle = new ESD();
        duzenle.satisDuzanle(jTable1, tf_araba_id, tf_musteri_id, tf_calisan_id, tf_satis_tarihi, tf_satis_fiyati);
    }//GEN-LAST:event_btn_duzenleActionPerformed

    private void btn_arabalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_arabalarActionPerformed
        arabalar arabalarPage = new arabalar();
        arabalarPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_arabalarActionPerformed

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
        ESD ekle = new ESD();
        ekle.satisEkle(jTable1, tf_id, tf_araba_id, tf_musteri_id, tf_calisan_id, tf_satis_tarihi, tf_satis_fiyati);
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        ESD sil = new ESD();
        sil.sil(jTable1);
    }//GEN-LAST:event_btn_silActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(satislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new satislar().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_araba_id;
    private javax.swing.JLabel lbl_calisan_id;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_musteri_id;
    private javax.swing.JLabel lbl_satis_fiyati;
    private javax.swing.JLabel lbl_satis_tarihi;
    private javax.swing.JTextField tf_araba_id;
    private javax.swing.JTextField tf_calisan_id;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_musteri_id;
    private javax.swing.JTextField tf_satis_fiyati;
    private javax.swing.JTextField tf_satis_tarihi;
    // End of variables declaration//GEN-END:variables
}
