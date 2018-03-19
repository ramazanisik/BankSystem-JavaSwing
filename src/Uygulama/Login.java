
package Uygulama;

import java.awt.Image;
import java.io.File;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
       String filename=null;
    DB db=new DB("bankasistemi","root","");
    static String k_adi;
    public Login() {
        initComponents();
    File f = new File("ana.png");
        filename = f.getAbsolutePath();
        ImageIcon imicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(rsm.getWidth(), rsm.getHeight(), Image.SCALE_SMOOTH));
        rsm.setIcon(imicon);
     
        kontrol();
    }
    StringBuilder sb = new StringBuilder();
    InetAddress ip;
   
   public void kontrol()
    {    
  
      try {
         ip = InetAddress.getLocalHost();
         NetworkInterface network = NetworkInterface.getByInetAddress(ip);
         byte[] mac = network.getHardwareAddress();
         
         for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
         }
//         System.out.println("MAC address : "+sb.toString());
 
      } catch (Exception e) {
          System.out.println("hata mac adresi");
      } 
      String sorgu="select*from sifre_hatirla where mac='"+sb.toString()+"'";
         
        try {
            ResultSet tr=db.baglan().executeQuery(sorgu);
            if(tr.next())
            {
            if(Integer.valueOf(tr.getString("flag"))==1)
            {
              String getir="select*from login where kadi='"+tr.getString("kullanici_adi")+"'";
              db.kapat();
              ResultSet rs=db.baglan().executeQuery(getir);
              if(rs.next())
              {
              adi.setText(rs.getString("kadi"));
              sifre.setText(rs.getString("ksifre"));
              hatirla.setText("Beni Unut");
              
              }
            
            
            }
          }
        } catch (SQLException ex) {
            System.out.println("beni hatırla sorgusu hatası :"+ex);
        }
        finally{db.kapat();}
    
    }
   String add="";
   public String kontrol2(String adii) 
   { String sonuc="";
   if(hatirla.getText().equals("Beni Hatırla"))
   { sb.setLength(0);
         try {
         ip = InetAddress.getLocalHost();
         NetworkInterface network = NetworkInterface.getByInetAddress(ip);
         byte[] mac = network.getHardwareAddress();
         
         for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
         }
//         System.out.println("MAC address : "+sb.toString());
 
      } catch (Exception e) {
             System.out.println("kontrol 2 hatası :"+e);
      } 
    String flagyaz="insert into sifre_hatirla values(null,'"+adii+"','"+sb.toString()+"','1')";
//       System.out.println(flagyaz);
       sonuc=flagyaz;
       
      
   }
   else
   {
   
   sonuc="delete from sifre_hatirla where mac='"+sb.toString()+"'";
  }
   
   return sonuc;
   
   
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rsm = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        hatirla = new javax.swing.JCheckBox();
        sifre = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rsm, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rsm, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Kullanıcı Adı");

        jLabel3.setText("Şifre");

        jButton1.setText("Giriş");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hatirla.setText("Beni Hatırla");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(hatirla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adi, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(sifre))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(hatirla))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 String degerler="";
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if(adi.getText().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Kullanıcı Adı Giriniz");
        else if(sifre.getText().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Şifreyi Giriniz");
        else{
            
        char[] cdizi = sifre.getPassword();
        String login="select *from login where kadi = '"+adi.getText().trim()+"' and ksifre = '"+String.valueOf(cdizi)+"'";
      
         boolean kontrol=false;
         
            try {
                ResultSet rs=db.baglan().executeQuery(login);
               if (rs.next()) {
                   if (rs.getString("rol") != null) {
                         add=rs.getString("kadi");
                    String tt=rs.getString("kadi");
                    String sorgu="select *from roller where ad='"+rs.getString("rol")+"'";
                    db.kapat();
                    ResultSet tr=db.baglan().executeQuery(sorgu);
                    
                    if(tr.next())
                    {
                     degerler=tr.getString("seviye");
                    kontrol=true;
                        }
                     if(hatirla.isSelected()&&kontrol==true)
                        {
                       db.kapat();
                       db.baglan().executeUpdate(kontrol2(tt));
                     
                  
                 
                        }
                    
                    }
               }else {
                   JOptionPane.showMessageDialog(rootPane, "Kullanıcı Bilgileri Yanlış");
                     sifre.setText("");
               }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Login Olma Hatası : "+ex);
            }
        finally{db.kapat();}
            
         if(kontrol)
         {
             if(degerler.equals("1"))
             {
             Veznedar vzn=new Veznedar(add);
             k_adi=adi.getText().trim();
             vzn.setVisible(true);
             dispose();
               }
             else if(degerler.equals("2"))
           {
            Mudur mdr=new Mudur();
                 k_adi=adi.getText().trim();
            mdr.setVisible(true);
            dispose();
           }
             else if(degerler.equals("3"))
           {
            Direktorluk dtr=new Direktorluk();
                 k_adi=adi.getText().trim();
            dtr.setVisible(true);
            dispose();
           
           }
              else
               JOptionPane.showMessageDialog(rootPane, "Rollerde hata var");
            
         }
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adi;
    private javax.swing.JCheckBox hatirla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel rsm;
    private javax.swing.JPasswordField sifre;
    // End of variables declaration//GEN-END:variables
}
