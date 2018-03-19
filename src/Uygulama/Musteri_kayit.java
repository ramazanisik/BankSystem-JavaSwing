package Uygulama;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;


public class Musteri_kayit extends javax.swing.JFrame {
   DB db=new DB("bankasistemi","root","");
   String musteri_id;
    ButtonGroup brg=new ButtonGroup();
    
    public Musteri_kayit() {
        initComponents();
      
        brg.add(jRadioButton1);
        brg.add(jRadioButton2);
        brg.add(jRadioButton3);
        brg.add(jRadioButton4);
        brg.add(jRadioButton5);
        jRadioButton1.setSelected(true);
    }
    public Musteri_kayit(int a){
     initComponents();
       
        brg.add(jRadioButton1);
        brg.add(jRadioButton2);
        brg.add(jRadioButton3);
        brg.add(jRadioButton4);
        brg.add(jRadioButton5);
        jRadioButton1.setSelected(true);
  
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        msid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        soyad = new javax.swing.JTextField();
        dtarih = new javax.swing.JTextField();
        dyer = new javax.swing.JTextField();
        adres = new javax.swing.JTextField();
        telefon = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        tc = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        gelir = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Sorgulama"));

        jButton1.setText("Sorgula ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("TC NO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri bilgileri"));

        jLabel1.setText("Müşteri ID");

        jLabel2.setText("TC.No ");

        jLabel3.setText("Adı");

        jLabel4.setText("Soyadı");

        jLabel5.setText("Adres");

        jLabel7.setText("Doğum Tarih");

        jLabel8.setText("Doğum Yeri");

        jLabel6.setText("Telefon");

        jButton2.setText("Kaydet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Yenile");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Gelir");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(msid, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(ad)
                            .addComponent(soyad)
                            .addComponent(dtarih)
                            .addComponent(dyer)
                            .addComponent(adres)
                            .addComponent(telefon)
                            .addComponent(tc)
                            .addComponent(gelir))))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(msid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dtarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dyer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(gelir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri İş Durumu"));

        jRadioButton1.setText("Çalışan");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Öğrenci");

        jRadioButton3.setText("Emekli");

        jRadioButton4.setText("Çalışmıyor");

        jRadioButton5.setText("Diğer");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Validator vld=new Validator();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(jTextField1.getText().trim().equals(""))  
    JOptionPane.showMessageDialog(rootPane, "TC Numaraası Giriniz");
else{
     
        String q="call musteriara(?)";
        PreparedStatement pr=db.preBaglan(q);
       try {
           pr.setString(1, jTextField1.getText().trim());
           ResultSet rs=pr.executeQuery();
          if(rs.next())
          {
           jButton2.setText("Güncelle");
           msid.setText(rs.getString(9));
           msid.setEditable(false);
           tc.setText(rs.getString(2));
           ad.setText(rs.getString(3));
           soyad.setText(rs.getString(4));
           dtarih.setText(rs.getString(5));
           dyer.setText(rs.getString(6));
           adres.setText(rs.getString(7));
           telefon.setText(rs.getString(8));
           int dd=Integer.valueOf(rs.getString(11));
          if(dd==1)
              jRadioButton1.setSelected(true);
          else if(dd==2)
              jRadioButton2.setSelected(true);
          else if(dd==3)
              jRadioButton3.setSelected(true);
          else if(dd==4)
              jRadioButton4.setSelected(true);
          else if(dd==5)
              jRadioButton5.setSelected(true);
           
           gelir.setText(rs.getString(12));
           
           tc.setEditable(false);
           dtarih.setEditable(false);
           dyer.setEditable(false);
           
           
           
          }
          else
          {
          final int bankid=10;
          String yil=new SimpleDateFormat("yy").format(new Date());
          String ay=new SimpleDateFormat("MM").format(new Date());
          String gun=new SimpleDateFormat("dd").format(new Date());
          String saat=new SimpleDateFormat("hh").format(new Date());
          String dakika =new SimpleDateFormat("mm").format(new Date());
         musteri_id=bankid+yil+ay+gun+saat+dakika;
         msid.setText(musteri_id);
         msid.setEditable(false);
        tc.setEditable(true);
       tc.setText(jTextField1.getText().trim());
       tc.setEditable(false);
       ad.setText("");
       soyad.setText("");
       dyer.setEditable(true);
       dtarih.setEditable(true);
       dyer.setText("");
       dtarih.setText("");
       adres.setText("");
       telefon.setText("");
       gelir.setText("");
          
           jButton2.setText("Kaydet");
          
          
          
          
          }
           
           
          
         
       } catch (SQLException ex) {
           System.out.println("müşteri arama hatası");
       }
       finally{db.kapat();}
}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        if(jButton2.getText().equals("Güncelle"))
        {
        
        String ww="call m_guncelle(?,?,?,?,?,?,?)";
        PreparedStatement prr=db.preBaglan(ww);
            try {
                prr.setString(1, tc.getText().trim());
                prr.setString(2, telefon.getText().trim());
                prr.setString(3, adres.getText().trim());
                prr.setString(4, ad.getText().trim());
                prr.setString(5, soyad.getText().trim());
                int x=0;
                if (jRadioButton1.isSelected()) {
                    x = 1;
                }
                else if (jRadioButton2.isSelected()) {
                    x = 2;
                }
                else if (jRadioButton3.isSelected()) {
                    x = 3;
                }
                else if (jRadioButton4.isSelected()) {
                    x = 4;
                }
                else  if (jRadioButton5.isSelected()) {
                    x = 5;
                }
                
                
                
                
                prr.setString(6, ""+x);
                prr.setString(7,gelir.getText().trim());
                prr.execute();
                JOptionPane.showMessageDialog(rootPane, "Kayıt Başarılı Güncellendi");
                dispose();
                
            } catch (SQLException ex) {
                System.out.println("müşteri güncelleme hatası "+ex);
            }
            
            
        }
        else 
        {   String qq="call musteriara(?)";
        PreparedStatement prr=db.preBaglan(qq);
       try {
           prr.setString(1, tc.getText().trim());
           ResultSet rs=prr.executeQuery();
           if(rs.next()){
               JOptionPane.showMessageDialog(rootPane, "Daha önce müşteri kaydı bulunmaktadır.");
               System.out.println(rs.getString(2));
           }
           else {
     
               if(!(vld.tckontrol(tc.getText().trim())))
               JOptionPane.showMessageDialog(rootPane, "TC'yi uygun formatta giriniz !");
               else if(!(vld.harfkontrol(ad.getText().trim())))
                   JOptionPane.showMessageDialog(rootPane, "Ad sadece harflerden oluşmalı");
               else if(!(vld.harfkontrol(soyad.getText().trim())))
                   JOptionPane.showConfirmDialog(rootPane, "soyadı sadece harflerden oluşmalı:");
               else if(!(vld.rakamkontrol(telefon.getText().trim())))
                   JOptionPane.showMessageDialog(rootPane, "Telefon sadece rakamlardan oluşmalı");
               else{  
                   if(tc.getText().trim().equals(""))
                       JOptionPane.showMessageDialog(rootPane, "TC Giriniz");
                   else if(ad.getText().trim().equals(""))
                       JOptionPane.showMessageDialog(rootPane, "Adı Giriniz");
                   else if(soyad.getText().trim().equals(""))
                       JOptionPane.showMessageDialog(rootPane, "Soyadı Giriniz");
                   else if(dtarih.getText().trim().equals(""))
                       JOptionPane.showMessageDialog(rootPane, "Doğum Tarihini Giriniz");
                   else if(dyer.getText().trim().equals(""))
                       JOptionPane.showMessageDialog(rootPane, "Doğum Yerini Giriniz");
                   else if(adres.getText().trim().equals(""))
                       JOptionPane.showMessageDialog(rootPane, "Adresi Giriniz");
                   else if(telefon.getText().trim().equals(""))
                       JOptionPane.showMessageDialog(rootPane, "Telefonu Giriniz");
                   else
                   {
                String aax="";
                if (jRadioButton1.isSelected()) {
                    aax = "1";
                }
                else if (jRadioButton2.isSelected()) {
                    aax = "2";
                }
                else if (jRadioButton3.isSelected()) {
                    aax = "3";
                }
                else if (jRadioButton4.isSelected()) {
                    aax = "4";
                }
                else  if (jRadioButton5.isSelected()) {
                    aax = "5";
                }
               
            String q="call m_kaydet(?,?,?,?,?,?,?,?,?,?)";
         PreparedStatement pr=db.preBaglan(q);
            
                pr.setString(1, msid.getText().trim());
                pr.setString(2,tc.getText());
                pr.setString(3, ad.getText().trim());
                pr.setString(4, soyad.getText().trim());
                pr.setString(5, dtarih.getText().trim());
                pr.setString(6, dyer.getText().trim());
                pr.setString(7, telefon.getText().trim());
                pr.setString(8, adres.getText().trim());
         
     
                
                pr.setString(9, aax);
                pr.setString(10,gelir.getText().trim());
                
           pr.execute();
                
                JOptionPane.showMessageDialog(rootPane, "Kayıt Başarılı");
                dispose();
           } 
           }
           }
            } catch (SQLException ex) {
                System.out.println("müşteri kayıt hatası !"+ex);
            }
            finally{db.kapat();}
       
        } 
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       msid.setEditable(true);
       msid.setText("");
       tc.setEditable(true);
       tc.setText("");
       ad.setText("");
       soyad.setText("");
       dyer.setEditable(true);
       dtarih.setEditable(true);
       dyer.setText("");
       dtarih.setText("");
       adres.setText("");
       telefon.setText("");
       gelir.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Musteri_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Musteri_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Musteri_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Musteri_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Musteri_kayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JTextField adres;
    private javax.swing.JTextField dtarih;
    private javax.swing.JTextField dyer;
    private javax.swing.JTextField gelir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField msid;
    private javax.swing.JTextField soyad;
    private javax.swing.JTextField tc;
    private javax.swing.JTextField telefon;
    // End of variables declaration//GEN-END:variables

}
