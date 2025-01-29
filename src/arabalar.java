import java.io.PrintStream;
import java.nio.charset.Charset;

public class arabalar extends javax.swing.JFrame {

    public arabalar() {
        System.setOut(new PrintStream(System.out, true, Charset.forName("UTF-8")));
        System.out.println("Türkçe karakterler: ç, ğ, ü, ö, ş, ı");
        initComponents();
        tablo tablo = new tablo();
        tablo.tablo(jTable1,1);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_id = new javax.swing.JLabel();
        lbl_sasi_no = new javax.swing.JLabel();
        lbl_marka = new javax.swing.JLabel();
        lbl_model = new javax.swing.JLabel();
        lbl_yil = new javax.swing.JLabel();
        lbl_km = new javax.swing.JLabel();
        lbl_yakit = new javax.swing.JLabel();
        lbl_vites = new javax.swing.JLabel();
        lbl_hasar = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_sasi_no = new javax.swing.JTextField();
        tf_marka = new javax.swing.JTextField();
        tf_model = new javax.swing.JTextField();
        spn_yil = new javax.swing.JSpinner();
        spn_km = new javax.swing.JSpinner();
        cmb_yakit = new javax.swing.JComboBox<>();
        cmb_vites = new javax.swing.JComboBox<>();
        tf_hasar = new javax.swing.JTextField();
        btn_ekle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_duzenle = new javax.swing.JButton();
        btn_arabalar = new javax.swing.JButton();
        btn_satislar = new javax.swing.JButton();
        btn_musteriler = new javax.swing.JButton();
        btn_calisanlar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arabalar");
        setPreferredSize(new java.awt.Dimension(850, 700));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Şasi Numarası", "Marka", "Model", "Yıl", "Kilometre", "Yakıt Tipi", "Viteas Tipi", "Hasar Kaydı"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lbl_id.setText("ID");

        lbl_sasi_no.setText("Şasi Numarası");

        lbl_marka.setText("Marka");

        lbl_model.setText("Model");

        lbl_yil.setText("Yıl");

        lbl_km.setText("Kilometre");

        lbl_yakit.setText("Yakıt Tipi");

        lbl_vites.setText("Vites Tİpi");

        lbl_hasar.setText("Hasar Kaydı");

        cmb_yakit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Benzin", "Dizel", "Benzin ve LPG", "Elektrik" }));

        cmb_vites.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manuel", "Otomatik" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_model, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_km, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_vites, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_hasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_sasi_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_marka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbl_yakit, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_yil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_vites, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_yakit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spn_km)
                            .addComponent(tf_model, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_marka)
                            .addComponent(tf_sasi_no, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spn_yil)
                            .addComponent(tf_hasar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_duzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btn_sil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_id)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ekle))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_sasi_no)
                            .addComponent(tf_sasi_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sil))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_marka)
                            .addComponent(tf_marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_duzenle))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_model)
                            .addComponent(tf_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_yil)
                            .addComponent(spn_yil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_km)
                            .addComponent(spn_km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_yakit)
                            .addComponent(cmb_yakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_vites)
                            .addComponent(cmb_vites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_hasar)
                            .addComponent(tf_hasar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_arabalar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_satislar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_musteriler)
                        .addGap(18, 18, 18)
                        .addComponent(btn_calisanlar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
        ESD ekle = new ESD();
        ekle.arabaEkle(jTable1, tf_id, tf_sasi_no, tf_marka, tf_model, spn_yil, spn_km, cmb_yakit, cmb_vites, tf_hasar);
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        ESD sil = new ESD();
        sil.sil(jTable1);
    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_duzenleActionPerformed
       ESD duzenle = new ESD();
       duzenle.arabaDuzenle(jTable1, tf_id, tf_sasi_no, tf_marka, tf_model, spn_yil, spn_km, cmb_yakit, cmb_vites, tf_hasar);
    }//GEN-LAST:event_btn_duzenleActionPerformed

    private void btn_arabalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_arabalarActionPerformed
        arabalar arabalarPage = new arabalar();
        arabalarPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_arabalarActionPerformed

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

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arabalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new arabalar().setVisible(true);
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
    private javax.swing.JComboBox<String> cmb_vites;
    private javax.swing.JComboBox<String> cmb_yakit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_hasar;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_km;
    private javax.swing.JLabel lbl_marka;
    private javax.swing.JLabel lbl_model;
    private javax.swing.JLabel lbl_sasi_no;
    private javax.swing.JLabel lbl_vites;
    private javax.swing.JLabel lbl_yakit;
    private javax.swing.JLabel lbl_yil;
    private javax.swing.JSpinner spn_km;
    private javax.swing.JSpinner spn_yil;
    private javax.swing.JTextField tf_hasar;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_marka;
    private javax.swing.JTextField tf_model;
    private javax.swing.JTextField tf_sasi_no;
    // End of variables declaration//GEN-END:variables
}
