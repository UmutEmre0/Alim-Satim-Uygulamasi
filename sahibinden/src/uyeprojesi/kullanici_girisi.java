package uyeprojesi;

public class kullanici_girisi extends javax.swing.JFrame {

    uyeislemleri islemler = new uyeislemleri();
   
      static String x;
      static String y;

    
    
    public kullanici_girisi() {
        initComponents();
        


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kg_panel3 = new javax.swing.JPanel();
        kg_eposta_lbl3 = new javax.swing.JLabel();
        kg_sifre_lbl3 = new javax.swing.JLabel();
        kg_sifre_fld = new javax.swing.JPasswordField();
        kg_kadi_fld = new javax.swing.JTextField();
        kg_giris_but = new javax.swing.JButton();
        kg_sifre_goster = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SAHİBİNDEN");
        setLocation(new java.awt.Point(400, 225));

        kg_panel3.setBackground(new java.awt.Color(255, 255, 255));
        kg_panel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KULLANICI GİRİŞİ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N
        kg_panel3.setForeground(new java.awt.Color(204, 204, 204));

        kg_eposta_lbl3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kg_eposta_lbl3.setForeground(new java.awt.Color(0, 0, 0));
        kg_eposta_lbl3.setText("Kullanıcı Adı:");

        kg_sifre_lbl3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kg_sifre_lbl3.setForeground(new java.awt.Color(0, 0, 0));
        kg_sifre_lbl3.setText("Şifre:");

        kg_sifre_fld.setBackground(new java.awt.Color(204, 204, 204));
        kg_sifre_fld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kg_sifre_fldActionPerformed(evt);
            }
        });

        kg_kadi_fld.setBackground(new java.awt.Color(204, 204, 204));
        kg_kadi_fld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kg_eposta_fldActionPerformed(evt);
            }
        });

        kg_giris_but.setBackground(new java.awt.Color(153, 153, 153));
        kg_giris_but.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        kg_giris_but.setForeground(new java.awt.Color(0, 0, 0));
        kg_giris_but.setText("GİRİŞ");
        kg_giris_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kg_giris_butActionPerformed(evt);
            }
        });

        kg_sifre_goster.setForeground(new java.awt.Color(0, 0, 0));
        kg_sifre_goster.setText("Şifreyi göster");
        kg_sifre_goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kg_sifre_gosterActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\90537\\OneDrive\\Masaüstü\\boyutlananlar\\geri ikonu.jpg")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        mesaj_yazisi.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(0, 204, 51));
        mesaj_yazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout kg_panel3Layout = new javax.swing.GroupLayout(kg_panel3);
        kg_panel3.setLayout(kg_panel3Layout);
        kg_panel3Layout.setHorizontalGroup(
            kg_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(kg_panel3Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(kg_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kg_panel3Layout.createSequentialGroup()
                        .addGroup(kg_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kg_sifre_lbl3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kg_eposta_lbl3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(37, 37, 37)
                        .addGroup(kg_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kg_kadi_fld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kg_sifre_fld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kg_panel3Layout.createSequentialGroup()
                        .addComponent(kg_giris_but)
                        .addGap(43, 43, 43)))
                .addGroup(kg_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kg_panel3Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jButton5))
                    .addGroup(kg_panel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kg_sifre_goster))))
            .addGroup(kg_panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kg_panel3Layout.setVerticalGroup(
            kg_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kg_panel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(kg_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kg_eposta_lbl3)
                    .addComponent(kg_kadi_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(kg_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kg_sifre_lbl3)
                    .addComponent(kg_sifre_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kg_sifre_goster))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(kg_giris_but, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kg_panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\90537\\OneDrive\\Masaüstü\\boyutlananlar\\kullanıcı giriş ikonu.jpg")); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\90537\\OneDrive\\Masaüstü\\butonlar\\araba.jpg")); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\90537\\OneDrive\\Masaüstü\\butonlar\\yad.jpg")); // NOI18N

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\90537\\OneDrive\\Masaüstü\\butonlar\\pati.jpg")); // NOI18N

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\90537\\OneDrive\\Masaüstü\\butonlar\\ev.jpg")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ASU");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kg_panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kg_panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kg_eposta_fldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kg_eposta_fldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kg_eposta_fldActionPerformed

    private void kg_sifre_fldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kg_sifre_fldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kg_sifre_fldActionPerformed

    private void kg_sifre_gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kg_sifre_gosterActionPerformed
        if (kg_sifre_goster.isSelected()) {
            kg_sifre_fld.setEchoChar((char) 0);
        } else {
            kg_sifre_fld.setEchoChar('*');
        }
    }//GEN-LAST:event_kg_sifre_gosterActionPerformed


    private void kg_giris_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kg_giris_butActionPerformed
        x = kg_kadi_fld.getText();
        y =new String (kg_sifre_fld.getPassword());
        
        
        mesaj_yazisi.setText("");
        String kullanici_adi = kg_kadi_fld.getText();
        String şifre = new String(kg_sifre_fld.getPassword());                    //1
        boolean girisbasarili = islemler.girisyap(kullanici_adi, şifre);
        if (girisbasarili) {

            mesaj_yazisi.setText("GİRİŞ BAŞARILI...");
            uyg_anaekran ua = new uyg_anaekran();
            ua.show();
            dispose();
            

        } else {

            mesaj_yazisi.setForeground(new java.awt.Color(225, 0, 0));
            mesaj_yazisi.setText("GİRİŞ BAŞARISIZ LÜTFEN TEKRAR DENEYİN...");
        }

    }//GEN-LAST:event_kg_giris_butActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ilk_ekran ie = new ilk_ekran();
        ie.show();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kullanici_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kullanici_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kullanici_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kullanici_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanici_girisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel kg_eposta_lbl3;
    private javax.swing.JButton kg_giris_but;
    private javax.swing.JTextField kg_kadi_fld;
    private javax.swing.JPanel kg_panel3;
    private javax.swing.JPasswordField kg_sifre_fld;
    private javax.swing.JCheckBox kg_sifre_goster;
    private javax.swing.JLabel kg_sifre_lbl3;
    private javax.swing.JLabel mesaj_yazisi;
    // End of variables declaration//GEN-END:variables
}
