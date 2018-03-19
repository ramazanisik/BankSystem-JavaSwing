package Uygulama;

import static Uygulama.Login.k_adi;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.ir.LiteralNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

public class Veznedar extends javax.swing.JFrame {

    String filename = null;
    String musteri_id;
    ButtonGroup brg = new ButtonGroup();

    public Veznedar() {
        initComponents();
        kurGetir();
        File f = new File("dolar.png");
        filename = f.getAbsolutePath();
        ImageIcon imicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(dolar.getWidth(), dolar.getHeight(), Image.SCALE_SMOOTH));
        dolar.setIcon(imicon);

        File f1 = new File("euro.png");
        filename = f1.getAbsolutePath();
        imicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(euro.getWidth(), euro.getHeight(), Image.SCALE_SMOOTH));
        euro.setIcon(imicon);

        File f2 = new File("sterlin.png");
        filename = f2.getAbsolutePath();
        imicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(sterlin.getWidth(), sterlin.getHeight(), Image.SCALE_SMOOTH));
        sterlin.setIcon(imicon);

        File f3 = new File("dolar1.png");
        filename = f3.getAbsolutePath();
        imicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(dolar.getWidth(), dolar.getHeight(), Image.SCALE_SMOOTH));
        dolar1.setIcon(imicon);

        File f4 = new File("euro1.png");
        filename = f4.getAbsolutePath();
        imicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(euro.getWidth(), euro.getHeight(), Image.SCALE_SMOOTH));
        euro1.setIcon(imicon);

        File f5 = new File("sterlin1.png");
        filename = f5.getAbsolutePath();
        imicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(sterlin.getWidth(), sterlin.getHeight(), Image.SCALE_SMOOTH));
        sterlin1.setIcon(imicon);

        jTextField3.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jPanel28.setVisible(false);
        jTextField13.setEditable(false);
        jTextField15.setEditable(false);
        jTextField16.setEditable(false);
        jPanel30.setVisible(false);
        jTextField20.setEditable(false);
        jTextField20.setVisible(false);
        jLabel26.setVisible(false);
        jTextField18.setEditable(false);
        jLabel31.setVisible(false);
        jTextField25.setVisible(false);
        jTextField25.setEditable(false);
        jTextField26.setEditable(false);
        jTextField27.setEditable(false);
        jTextField22.setEditable(false);
        jTextField23.setVisible(false);
        jTextField23.setEditable(false);
        jPanel40.setVisible(false);
        jPanel43.setVisible(false);
        jPanel44.setVisible(false);
        jTextField35.setEditable(false);
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
        bg.add(jRadioButton4);
        jRadioButton1.setSelected(true);

    }

    public Veznedar(String ad) {
        initComponents();
        kurGetir();
        File f = new File("dolar.png");
        filename = f.getAbsolutePath();
        ImageIcon imicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(dolar.getWidth(), dolar.getHeight(), Image.SCALE_SMOOTH));
        dolar.setIcon(imicon);
        File f1 = new File("euro.png");
        filename = f1.getAbsolutePath();
        imicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(euro.getWidth(), euro.getHeight(), Image.SCALE_SMOOTH));
        euro.setIcon(imicon);
        File f2 = new File("sterlin.png");
        filename = f2.getAbsolutePath();
        imicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(sterlin.getWidth(), sterlin.getHeight(), Image.SCALE_SMOOTH));
        sterlin.setIcon(imicon);
        jLabel1.setText(ad);

        File f3 = new File("dolar1.png");
        filename = f3.getAbsolutePath();
        imicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(dolar.getWidth(), dolar.getHeight(), Image.SCALE_SMOOTH));
        dolar1.setIcon(imicon);

        File f4 = new File("euro1.png");
        filename = f4.getAbsolutePath();
        imicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(euro.getWidth(), euro.getHeight(), Image.SCALE_SMOOTH));
        euro1.setIcon(imicon);

        File f5 = new File("sterlin1.png");
        filename = f5.getAbsolutePath();
        imicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(sterlin.getWidth(), sterlin.getHeight(), Image.SCALE_SMOOTH));
        sterlin1.setIcon(imicon);

        SimpleDateFormat bicim = new SimpleDateFormat("dd.MM.yyyy");
        Date tr = new Date();
        jLabel2.setText(bicim.format(tr).toString());
        jTextField3.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jPanel28.setVisible(false);
        jTextField10.setEditable(false);
        jTextField11.setEditable(false);
        jTextField13.setEditable(false);
        jTextField15.setEditable(false);
        jTextField16.setEditable(false);
        jPanel30.setVisible(false);
        jTextField20.setEditable(false);
        jTextField20.setVisible(false);
        jLabel26.setVisible(false);
        jTextField18.setEditable(false);
        jLabel31.setVisible(false);
        jTextField25.setVisible(false);
        jTextField25.setEditable(false);
        jTextField26.setEditable(false);
        jTextField27.setEditable(false);
        jTextField22.setEditable(false);
        jTextField23.setVisible(false);
        jTextField23.setEditable(false);
        jTextField30.setEditable(false);
        jTextField31.setEditable(false);
        jTextField33.setEditable(false);
        jPanel40.setVisible(false);
        jPanel43.setVisible(false);
        jPanel44.setVisible(false);
        jTextField35.setEditable(false);
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
        bg.add(jRadioButton4);
        jRadioButton1.setSelected(true);
        abone.removeAll(abone);
        String q = "call kurumgetir(?)";
        jComboBox3.removeAllItems();
        PreparedStatement pr = db.preBaglan(q);
        try {
            pr.setString(1, "elk");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {

                jComboBox3.addItem(rs.getString(2));
                abone.add(rs.getString(1));
                kurum_hesap.add(rs.getString(3));
            }

        } catch (SQLException ex) {
            System.out.println("kurum getirme hatası :" + ex);
        } finally {
            db.kapat();
        }
        ButtonGroup btt = new ButtonGroup();
        btt.add(jRadioButton5);
        btt.add(jRadioButton6);
        jRadioButton5.setSelected(true);
        jPanel51.setVisible(false);
        jPanel54.setVisible(false);

        ButtonGroup gb = new ButtonGroup();
        gb.add(jRadioButton7);
        gb.add(jRadioButton8);
        jRadioButton7.setSelected(true);
        bmm.add(cKredi);
        bmm.add(cKrediKarti);
        bmm.add(paraCikis);
        bmm.add(paraGiris);
        bmm.add(cMusteri);
        jPanel61.setVisible(false);
        brg.add(jRadioButton9);
        brg.add(jRadioButton10);
        brg.add(jRadioButton11);
        brg.add(jRadioButton12);
        brg.add(jRadioButton13);
        jRadioButton9.setSelected(true);
        jButton1.setVisible(false);

    }

    public void kurGetir() {

        try {
            String url = "http://www.tcmb.gov.tr/kurlar/today.xml";
            String data = Jsoup.connect(url).timeout(30000).execute().body();
            Document doc = Jsoup.parse(data, "", Parser.xmlParser());

            Elements elems = doc.select("Currency");
            for (Element item : elems) {
                String isim = item.getElementsByTag("Isim").text();
                String CurrencyName = item.getElementsByTag("CurrencyName").text();

                if (CurrencyName.equals("US DOLLAR")) {

                    String BanknoteBuying = item.getElementsByTag("BanknoteBuying").text();
                    String BanknoteSelling = item.getElementsByTag("BanknoteSelling").text();
                    a1.setText(BanknoteBuying);
                    a2.setText(BanknoteSelling);
                    a7.setText(BanknoteBuying);
                    a10.setText(BanknoteSelling);

                } else if (CurrencyName.equals("EURO")) {

                    String BanknoteBuying = item.getElementsByTag("BanknoteBuying").text();
                    String BanknoteSelling = item.getElementsByTag("BanknoteSelling").text();
                    a3.setText(BanknoteBuying);
                    a4.setText(BanknoteSelling);
                    a8.setText(BanknoteBuying);
                    a12.setText(BanknoteSelling);

                } else if (CurrencyName.equals("POUND STERLING")) {

                    String BanknoteBuying = item.getElementsByTag("BanknoteBuying").text();
                    String BanknoteSelling = item.getElementsByTag("BanknoteSelling").text();
                    a5.setText(BanknoteBuying);
                    a6.setText(BanknoteSelling);
                    a9.setText(BanknoteBuying);
                    a11.setText(BanknoteSelling);
                }

            }

        } catch (Exception e) {
            System.err.println("Kur Getirme Hatası : " + e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel24 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        dolar = new javax.swing.JLabel();
        euro = new javax.swing.JLabel();
        sterlin = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel64 = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        jTextField37 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jPanel66 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        soyad = new javax.swing.JTextField();
        dtarih = new javax.swing.JTextField();
        dyer = new javax.swing.JTextField();
        adres = new javax.swing.JTextField();
        telefon = new javax.swing.JTextField();
        jButton31 = new javax.swing.JButton();
        tc = new javax.swing.JTextField();
        jButton32 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        gelir = new javax.swing.JTextField();
        ramazan1 = new javax.swing.JTextField();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        a9 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        a10 = new javax.swing.JLabel();
        a11 = new javax.swing.JLabel();
        a12 = new javax.swing.JLabel();
        dolar1 = new javax.swing.JLabel();
        euro1 = new javax.swing.JLabel();
        sterlin1 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel62 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel63 = new javax.swing.JPanel();
        jTextField18 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel68 = new javax.swing.JPanel();
        jTextField23 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jTextField32 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel41 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        jTextField35 = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jPanel49 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel50 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel51 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jPanel52 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();
        jPanel59 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel53 = new javax.swing.JPanel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jPanel54 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jPanel57 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jButton29 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jPanel55 = new javax.swing.JPanel();
        cKredi = new javax.swing.JRadioButton();
        cKrediKarti = new javax.swing.JRadioButton();
        paraGiris = new javax.swing.JRadioButton();
        paraCikis = new javax.swing.JRadioButton();
        cMusteri = new javax.swing.JRadioButton();
        jPanel61 = new javax.swing.JPanel();
        txtMusteri = new javax.swing.JTextField();
        date1 = new com.toedter.calendar.JDateChooser();
        date2 = new com.toedter.calendar.JDateChooser();
        jButton27 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        pswEskiSifre = new javax.swing.JPasswordField();
        pswYeniSifre = new javax.swing.JPasswordField();
        sifreonay = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HESAP İŞLEMLERİ");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Güncel Kur Bilgisi"));

        jLabel7.setText("Alış Fiyatı");

        a1.setText("jLabel3");

        a3.setText("jLabel4");

        a5.setText("jLabel6");

        jLabel8.setText("Satış Fiyatı");

        a2.setText("jLabel9");

        a6.setText("jLabel11");

        a4.setText("jLabel10");

        euro.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dolar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sterlin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(a3)
                        .addComponent(a1)
                        .addComponent(a5))
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a4)
                    .addComponent(a2)
                    .addComponent(jLabel8)
                    .addComponent(a6))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dolar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(a2)
                        .addComponent(a1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(a3)
                        .addComponent(a4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sterlin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(a5)
                        .addComponent(a6)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jButton1.setText("Müşteri İşlemleri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel64.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Sorgulama"));

        jButton30.setText("Sorgula ");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jLabel45.setText("TC NO");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton30)
                .addGap(23, 23, 23))
        );

        jPanel65.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri İş Durumu"));

        jRadioButton9.setText("Çalışan");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jRadioButton10.setText("Öğrenci");

        jRadioButton11.setText("Emekli");

        jRadioButton12.setText("Çalışmıyor");

        jRadioButton13.setText("Diğer");

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12)
                    .addComponent(jRadioButton13))
                .addGap(0, 180, Short.MAX_VALUE))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jRadioButton9)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton10)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton11)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton12)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel66.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri bilgileri"));

        jLabel52.setText("Müşteri ID");

        jLabel53.setText("TC.No ");

        jLabel54.setText("Adı");

        jLabel55.setText("Soyadı");

        jLabel56.setText("Adres");

        jLabel57.setText("Doğum Tarih");

        jLabel58.setText("Doğum Yeri");

        jLabel59.setText("Telefon");

        jButton31.setText("Kaydet");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText("Yenile");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jLabel60.setText("Gelir");

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58)
                            .addComponent(jLabel56)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ad, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(soyad)
                            .addComponent(dtarih)
                            .addComponent(dyer)
                            .addComponent(adres)
                            .addComponent(telefon)
                            .addComponent(tc)
                            .addComponent(gelir)
                            .addComponent(ramazan1))))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(ramazan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(dtarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(dyer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(gelir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton31)
                    .addComponent(jButton32))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Müşteri Yönetimi", jPanel24);

        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder("Güncel Kur Bilgisi"));

        jLabel34.setText("Alış Fiyatı");

        a7.setText("jLabel3");

        a8.setText("jLabel4");

        a9.setText("jLabel6");

        jLabel35.setText("Satış Fiyatı");

        a10.setText("jLabel9");

        a11.setText("jLabel11");

        a12.setText("jLabel10");

        euro1.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euro1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dolar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sterlin1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(a8)
                        .addComponent(a7)
                        .addComponent(a9))
                    .addComponent(jLabel34))
                .addGap(23, 23, 23)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a12)
                    .addComponent(a10)
                    .addComponent(jLabel35)
                    .addComponent(a11))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dolar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(a10)
                        .addComponent(a7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euro1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(a8)
                        .addComponent(a12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sterlin1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(a9)
                        .addComponent(a11)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel67.setBorder(javax.swing.BorderFactory.createTitledBorder("Hesap İşlemleri"));

        jButton3.setText("Hesap Oluştur");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Hesap Sil");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setText("Hesap Güncelle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(310, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Hesap Yönetimi", jPanel35);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hesap Yönetimi", jPanel1);

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel58.setBorder(javax.swing.BorderFactory.createTitledBorder("Para Yatırma İşlemleri"));
        jPanel58.setPreferredSize(new java.awt.Dimension(620, 469));

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri sorgulama"));

        jLabel3.setText("TC");

        jButton2.setText("Sorgula");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Hesapları"));
        jPanel16.setPreferredSize(new java.awt.Dimension(262, 400));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hesap ID", "Hesap Türü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Para Yatırma"));

        jButton5.setText("Kaydet");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Kur Karşılığı");

        jLabel5.setText("Yatırılacak Tutar ");

        jLabel4.setText("Döviz Tipi");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel58, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Para Yatırma", jPanel9);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Para Çekme İşlemleri"));
        jPanel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel18.setPreferredSize(new java.awt.Dimension(620, 460));

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri sorgulama"));

        jLabel9.setText("TC");

        jButton7.setText("Sorgula");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Hesapları"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hesap ID", "Hesap Türü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTable2VetoableChange(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Para Çekme"));

        jButton8.setText("Kaydet");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel12.setText("Kur Karşılığı");

        jLabel11.setText("Çekilecek Tutar ");

        jLabel13.setText("Hesap Bakiyesi");

        jLabel10.setText("Döviz Tipi");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 262, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Para Çekme", jPanel10);

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Havale İşlemleri"));
        jPanel22.setToolTipText("");

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Hesapları"));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hesap ID", "Hesap Türü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jTable5.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTable5VetoableChange(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jPanel62.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel19.setText("Bakiye ");

        jLabel31.setText("Döviz Tipi");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, 72, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri sorgulama"));

        jLabel14.setText("TC");

        jButton9.setText("Sorgula");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder("Gönderilen Bilgileri"));

        jLabel15.setText("Hesap No / IBAN");

        jLabel16.setText("Adı ");

        jButton10.setText("Sorgula");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel17.setText("Soyadı");

        jButton11.setText("Devam");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton12.setText("Onayla");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel18.setText("Yatırılacak Tutar");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addGap(4, 4, 4))
        );

        jLabel32.setText("Hesap Türü");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addGap(67, 67, 67)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField10))))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel16))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel32))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Havale", jPanel11);

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("EFT İşlemleri"));

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder("Gönderilen Bilgileri"));

        jLabel20.setText("Hesap Numarası / IBAN");

        jLabel21.setText("Adı ");

        jButton13.setText("Sorgula");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel22.setText("Soyadı");

        jButton14.setText("Devam");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton15.setText("Onayla");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel23.setText("Yatırılacak Tutar");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addContainerGap())
        );

        jLabel33.setText("Hesap Türü");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel33))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField14)
                            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField16)
                            .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField27))))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addGap(26, 26, 26)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jButton14)
                .addGap(18, 18, 18)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Hesapları"));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hesap ID", "Hesap Türü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jTable6.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTable6VetoableChange(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jPanel63.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel63.setPreferredSize(new java.awt.Dimension(169, 72));

        jLabel26.setText("Döviz Tipi");

        jLabel24.setText("Bakiye ");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jTextField20))
                .addContainerGap())
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri sorgulama"));

        jLabel25.setText("TC");

        jButton16.setText("Sorgula");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton16)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 324, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("EFT", jPanel12);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Hesaplar Arası Para Aktarma"));

        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri sorgulama"));

        jLabel27.setText("TC");

        jButton19.setText("Sorgula");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton19)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Hesapları"));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hesap ID", "Hesap Türü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jTable7.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTable7VetoableChange(evt);
            }
        });
        jScrollPane7.setViewportView(jTable7);

        jPanel68.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel28.setText("Bakiye ");

        jLabel29.setText("Döviz Tipi");

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel68Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder("Gönderilen Bilgileri"));

        jLabel30.setText("Hesap Numarası / IBAN");

        jLabel38.setText("Adı ");

        jButton20.setText("Sorgula");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel39.setText("Soyadı");

        jButton21.setText("Devam");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jPanel40.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton22.setText("Onayla");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jLabel40.setText("Yatırılacak Tutar");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jTextField32))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton22)
                .addContainerGap())
        );

        jLabel41.setText("Hesap Türü");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jTextField31)
                            .addComponent(jTextField30, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField33, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton20)
                .addGap(26, 26, 26)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jButton21)
                .addGap(18, 18, 18)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Hesaplar Arası Para Aktarma", jPanel13);

        jPanel60.setBorder(javax.swing.BorderFactory.createTitledBorder("Ödemeler"));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Ödeme Türü"));

        jRadioButton1.setText("Elektrik");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Su");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Doğalgaz");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Mobil Fatura");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel41.setBorder(javax.swing.BorderFactory.createTitledBorder("Ödeme Bilgileri"));

        jLabel42.setText("Kurum Türü");

        jLabel43.setText("Abone Numarası");

        jButton23.setText("Sorgula");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jPanel43.setBorder(javax.swing.BorderFactory.createTitledBorder("Hesaplar"));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hesap Adı", "Bakiye"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton17.setText("Öde");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel44.setBorder(javax.swing.BorderFactory.createTitledBorder("Güncel Borç Bilgisi"));

        jButton24.setText("Devam");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField35)
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton24)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox3, 0, 131, Short.MAX_VALUE)
                                    .addComponent(jTextField34))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addComponent(jButton23)
                .addGap(18, 18, 18)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ödemeler", jPanel14);

        jPanel47.setBorder(javax.swing.BorderFactory.createTitledBorder("Kredi Kartı Ödeme"));

        jPanel48.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri sorgulama"));

        jLabel37.setText("TC");

        jButton25.setText("Sorgula");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField29, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel49.setBorder(javax.swing.BorderFactory.createTitledBorder("Kredi Kartı Hesabı"));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hesap ID", "Hesap Türü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable8MouseClicked(evt);
            }
        });
        jTable8.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTable8VetoableChange(evt);
            }
        });
        jScrollPane8.setViewportView(jTable8);

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel50.setBorder(javax.swing.BorderFactory.createTitledBorder("Ödeme Tipi"));

        jRadioButton5.setText("Nakit");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("Hesaptan");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addGap(0, 94, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel51.setBorder(javax.swing.BorderFactory.createTitledBorder("Ödeme Hesapları"));

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hesap ID", "Hesap Türü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable9MouseClicked(evt);
            }
        });
        jTable9.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTable9VetoableChange(evt);
            }
        });
        jScrollPane9.setViewportView(jTable9);

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );

        jPanel52.setBorder(javax.swing.BorderFactory.createTitledBorder("Tutar Bilgisi"));

        jLabel44.setText("Tutar");

        jButton26.setText("Tamamla");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addGap(18, 18, 18)
                .addComponent(jButton26)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 96, Short.MAX_VALUE))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 31, Short.MAX_VALUE)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel59.setToolTipText("");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Kredi Kartı Ödeme", jPanel37);

        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder("Kredi Ödeme Bilgileri"));

        jPanel45.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri sorgulama"));

        jLabel36.setText("TC");

        jButton18.setText("Sorgula");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel46.setBorder(javax.swing.BorderFactory.createTitledBorder("Kredi Hesapları"));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hesap ID", "Hesap Türü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jTable4.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTable4VetoableChange(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel53.setBorder(javax.swing.BorderFactory.createTitledBorder("Ödeme Tipi"));

        jRadioButton7.setText("Nakit");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setText("Hesaptan");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8))
                .addGap(0, 85, Short.MAX_VALUE))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel54.setBorder(javax.swing.BorderFactory.createTitledBorder("Ödeme Hesapları"));

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hesap ID", "Hesap Türü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable10MouseClicked(evt);
            }
        });
        jTable10.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTable10VetoableChange(evt);
            }
        });
        jScrollPane10.setViewportView(jTable10);

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel57.setBorder(javax.swing.BorderFactory.createTitledBorder("Tutar Bilgisi"));

        jLabel47.setText("Tutar");

        jButton29.setText("Tamamla");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(jTextField39))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton29)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Kredi Ödeme", jPanel38);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 949, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Parasal İşlemler", jPanel3);

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Müşteri Adı", "Hesap Türü", "Bakiye", "Tarih"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jTable11);

        jPanel55.setBorder(javax.swing.BorderFactory.createTitledBorder("Raporlar"));

        cKredi.setText("Kredi Bazlı");
        cKredi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cKrediActionPerformed(evt);
            }
        });

        cKrediKarti.setText("Kredi Kartı Bazlı");
        cKrediKarti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cKrediKartiActionPerformed(evt);
            }
        });

        paraGiris.setText("Para Giriş");
        paraGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraGirisActionPerformed(evt);
            }
        });

        paraCikis.setText("Para Çıkış");
        paraCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraCikisActionPerformed(evt);
            }
        });

        cMusteri.setText("Müşteri Bazlı");
        cMusteri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMusteriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMusteri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtMusteri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        date1.setDateFormatString("yyyy-MM-dd"); // NOI18N

        date2.setDateFormatString("yyyy-MM-dd");

        jButton27.setText("Rapor Al");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jLabel50.setText("Başlangıç Tarihi");

        jLabel51.setText("Bitiş Tarihi");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paraGiris)
                            .addComponent(cKrediKarti)
                            .addComponent(cKredi)
                            .addComponent(paraCikis)
                            .addGroup(jPanel55Layout.createSequentialGroup()
                                .addComponent(cMusteri)
                                .addGap(31, 31, 31)
                                .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addComponent(cKredi)
                        .addGap(18, 18, 18)
                        .addComponent(cKrediKarti)
                        .addGap(18, 18, 18)
                        .addComponent(paraGiris)
                        .addGap(18, 18, 18)
                        .addComponent(paraCikis)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cMusteri)
                            .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel50))
                .addGap(20, 20, 20)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51)
                    .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton27)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Raporlar", jPanel4);

        jPanel56.setBorder(javax.swing.BorderFactory.createTitledBorder("Şifre İşlemleri"));

        jLabel46.setText("Eski Sifre");

        jLabel48.setText("Yeni Sifre");

        jLabel49.setText("Yeni Sifre Onay");

        jButton28.setText("Değiştir");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pswEskiSifre, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(pswYeniSifre)
                            .addComponent(sifreonay))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(pswEskiSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(pswYeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(sifreonay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton28)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Personel Hesabı", jPanel2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 959, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Çıkış", jPanel5);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Hesapsil hsp = new Hesapsil();
        hsp.setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x = 2027010001;
        Musteri_kayit mskyt = new Musteri_kayit(x);
        mskyt.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        HesapOlustur hsp = new HesapOlustur();
        hsp.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

        int x = jTabbedPane1.getSelectedIndex();
        if (x == 4) {
            int y = JOptionPane.showConfirmDialog(rootPane, "Çıkmak İstediğinizden Emin misiniz?");
            if (y == 0) {
                dispose();
            }

        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked
    DB db = new DB("bankasistemi", "root", "");
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dvzz.removeAll(dvzz);
        if (jTextField1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "TC Giriniz");
        } else {
            String q = "call musteri_hesap_ara(?)";
            PreparedStatement pr = db.preBaglan(q);

            try {
                pr.setString(1, jTextField1.getText().trim());
                ResultSet rs = pr.executeQuery();
                DefaultTableModel dtm = new DefaultTableModel();

                dtm.addColumn("Hesap ID");
                dtm.addColumn("Hesap Türü");

                while (rs.next()) {
                    dtm.addRow(new String[]{rs.getString(1), rs.getString(2)});
                    dvzz.add(rs.getString(4));

                }
                jTable1.setModel(dtm);
            } catch (SQLException ex) {
                Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                db.kapat();
            }
            jComboBox1.removeAllItems();

        }
    }//GEN-LAST:event_jButton2ActionPerformed
    ArrayList<String> dvzz = new ArrayList<String>();

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked


    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int x = jTable1.getSelectedRow();
        int y = jComboBox1.getSelectedIndex();
        if (x < 0) {
            JOptionPane.showMessageDialog(rootPane, "Hesap ID Seçiniz");
        } else if (jTextField2.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Tutarı Giriniz");
        } else {
            String q = "call hesap_detay_kaydet(?,?,?,?)";
            PreparedStatement pr = db.preBaglan(q);

            try {
                pr.setString(1, jTable1.getValueAt(x, 0).toString());
                pr.setDouble(2, Double.valueOf(jTextField2.getText().trim()));
                pr.setString(3, "1");
                pr.setString(4, dvzz.get(x));
                pr.execute();

                JOptionPane.showMessageDialog(rootPane, "Para Yatrıma İşlemi Başarılı ");

            } catch (SQLException ex) {
                System.out.println("hesap_detay_kaydet hatası :" + ex);
            } finally {
                db.kapat();
            }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int x = jTable1.getSelectedRow();

        if (jTable1.getValueAt(x, 1).toString().equals("Doviz")) {
            jComboBox1.removeAllItems();
            String qq = "call doviz_getir_y(?)";

            try {
                PreparedStatement pr = db.preBaglan(qq);
                pr.setString(1, dvzz.get(x));

                ResultSet rs = pr.executeQuery();
                if (rs.next()) {
                    jComboBox1.addItem(rs.getString(2));

                }

            } catch (SQLException ex) {
                System.out.println("Döviz getirme hatası :" + ex);
            } finally {
                db.kapat();
            }
        } else {
            jComboBox1.removeAllItems();
            jComboBox1.addItem("TL");
            dvzz.add("1");

        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed

    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        if (!(jTextField2.getText().trim().equals(""))) {
            int y = jComboBox1.getSelectedIndex();
            if (y > -1) {
                jTextField3.setText("");
                int x = jTable1.getSelectedRow();
                if (jTable1.getValueAt(x, 1).toString().equals("Doviz")) {
                    if (jComboBox1.getSelectedItem().equals("DOLAR")) {
                        jTextField3.setText("" + Double.valueOf(a2.getText().trim()) * (Integer.valueOf(jTextField2.getText().trim())));
                    }
                    if (jComboBox1.getSelectedItem().equals("EURO")) {
                        jTextField3.setText("" + Double.valueOf(a4.getText().trim()) * (Integer.valueOf(jTextField2.getText().trim())));
                    }
                    if (jComboBox1.getSelectedItem().equals("STERLIN")) {
                        jTextField3.setText("" + Double.valueOf(a6.getText().trim()) * (Integer.valueOf(jTextField2.getText().trim())));
                    }
                    jTextField3.setEditable(false);

                }

            }
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dvtip.removeAll(dvtip);
        if (jTextField4.getText().trim().equals(""))
            JOptionPane.showMessageDialog(rootPane, "TC Giriniz");
        else {
            String q = "call musteri_hesap_ara(?)";
            PreparedStatement pr = db.preBaglan(q);

            try {
                pr.setString(1, jTextField4.getText().trim());
                ResultSet rs = pr.executeQuery();
                DefaultTableModel dtm = new DefaultTableModel();

                dtm.addColumn("Hesap ID");
                dtm.addColumn("Hesap Türü");
                while (rs.next()) {
                    dtm.addRow(new String[]{rs.getString(1), rs.getString(2)});
                    dvtip.add(rs.getString(4));
                }
                jTable2.setModel(dtm);
            } catch (SQLException ex) {
                Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                db.kapat();
            }
            jComboBox2.removeAllItems();


    }//GEN-LAST:event_jButton7ActionPerformed
    }
    ArrayList<String> dv = new ArrayList<String>();
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int x = jTable2.getSelectedRow();
        dv.removeAll(dv);
        if (jTable2.getValueAt(x, 1).toString().equals("Doviz")) {
            jComboBox2.removeAllItems();
            String qq = "call doviz_getir_y(?)";

            try {
                PreparedStatement pr = db.preBaglan(qq);
                pr.setString(1, dvtip.get(x));
                dv.add(dvtip.get(x));
                ResultSet rs = pr.executeQuery();
                if (rs.next()) {
                    jComboBox2.addItem(rs.getString(2));

                }

            } catch (SQLException ex) {
                System.out.println("Döviz getirme hatası :" + ex);
            } finally {
                db.kapat();
            }
        } else {
            jComboBox2.removeAllItems();
            jComboBox2.addItem("TL");
            dv.add("1");
        }
        if (x > -1) {
            jTextField7.setText("");
            String d = "call bakiye_getir(?)";
            try {
                PreparedStatement pr = db.preBaglan(d);
                pr.setString(1, jTable2.getValueAt(x, 0).toString());
                ResultSet rs = pr.executeQuery();

                if (rs.next()) {
                    jTextField7.setText(rs.getString(1));
                }

            } catch (SQLException ex) {
                System.out.println("Döviz getirme hatası :" + ex);
            } finally {
                db.kapat();
            }

        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        if (!(jTextField5.getText().trim().equals(""))) {
            int y = jComboBox2.getSelectedIndex();
            if (y > -1) {
                jTextField6.setText("");
                int x = jTable2.getSelectedRow();
                if (jTable2.getValueAt(x, 1).toString().equals("Doviz")) {
                    if (jComboBox2.getSelectedItem().equals("DOLAR")) {
                        jTextField6.setText("" + Double.valueOf(a2.getText().trim()) * (Integer.valueOf(jTextField5.getText().trim())));
                    }
                    if (jComboBox2.getSelectedItem().equals("EURO")) {
                        jTextField6.setText("" + Double.valueOf(a4.getText().trim()) * (Integer.valueOf(jTextField5.getText().trim())));
                    }
                    if (jComboBox2.getSelectedItem().equals("STERLIN")) {
                        jTextField6.setText("" + Double.valueOf(a6.getText().trim()) * (Integer.valueOf(jTextField5.getText().trim())));
                    }
                    jTextField6.setEditable(false);

                }

            }
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int x = jTable2.getSelectedRow();
        int y = jComboBox2.getSelectedIndex();
        if (x < 0) {
            JOptionPane.showMessageDialog(rootPane, "Hesap ID Seçiniz");
        } else if (jTextField5.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Tutarı Giriniz");
        } else {
            if ((Integer.valueOf(jTextField5.getText().trim()) > (Integer.valueOf(jTextField7.getText().trim())))) {
                JOptionPane.showMessageDialog(rootPane, "Yeterli Bakiyeniz Bulunmamaktadır.");
            } else {
                String q = "call hesap_detay_kaydet(?,?,?,?)";
                PreparedStatement pr = db.preBaglan(q);

                try {
                    pr.setString(1, jTable2.getValueAt(x, 0).toString());
                    pr.setDouble(2, Double.valueOf(jTextField5.getText().trim()));
                    pr.setString(3, "2");
                    pr.setString(4, dv.get(y));
                    pr.execute();

                    JOptionPane.showMessageDialog(rootPane, "Para Çekme İşlemi Başarılı ");

                } catch (SQLException ex) {
                    System.out.println("hesap_detay_kaydet hatası :" + ex);
                } finally {
                    db.kapat();
                }
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable2VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTable2VetoableChange


    }//GEN-LAST:event_jTable2VetoableChange

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        int x = jTable5.getSelectedRow();
        dv.removeAll(dv);
        if (x > -1) {
            jTextField13.setText("");
            String d = "call bakiye_getir(?)";
            try {
                PreparedStatement pr = db.preBaglan(d);
                pr.setString(1, jTable5.getValueAt(x, 0).toString());
                ResultSet rs = pr.executeQuery();

                if (rs.next()) {
                    jTextField13.setText(rs.getString(1));
                    dvz_tip = rs.getString(2);
                }
                if (jTable5.getValueAt(jTable5.getSelectedRow(), 1).toString().equals("Doviz")) {
                    jLabel31.setVisible(true);
                    jTextField25.setVisible(true);
                    if (dvz_tip.equals("1")) {
                        jTextField25.setText("TL");
                    }
                    if (dvz_tip.equals("2")) {
                        jTextField25.setText("DOLAR");
                    }
                    if (dvz_tip.equals("3")) {
                        jTextField25.setText("EURO");
                    }
                    if (dvz_tip.equals("4")) {
                        jTextField25.setText("STERLIN");
                    }

                } else {
                    jLabel31.setVisible(false);
                    jTextField25.setVisible(false);

                }

            } catch (SQLException ex) {
                System.out.println("bakiye getirme hatası :" + ex);
            } finally {
                db.kapat();
            }

        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void jTable5VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTable5VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable5VetoableChange
    ArrayList<String> hesaptr = new ArrayList<>();
    ArrayList<String> dvtip = new ArrayList<>();
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        if (jTextField8.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "TC Giriniz");
        } else {
            hesaptr.removeAll(hesaptr);
            dvtip.removeAll(dvtip);

            String q = "call musteri_hesap_ara(?)";
            PreparedStatement pr = db.preBaglan(q);

            try {
                pr.setString(1, jTextField8.getText().trim());
                ResultSet rs = pr.executeQuery();
                DefaultTableModel dtm = new DefaultTableModel();

                dtm.addColumn("Hesap ID");
                dtm.addColumn("Hesap Türü");
                while (rs.next()) {
                    dtm.addRow(new String[]{rs.getString(1), rs.getString(2)});
                    hesaptr.add(rs.getString(3));
                    dvtip.add(rs.getString(4));

                }
                jTable5.setModel(dtm);
            } catch (SQLException ex) {
                Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                db.kapat();
            }

        }


    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        if (!(jTextField10.getText().trim().equals(""))) {
            jPanel28.setVisible(true);
        }
    }//GEN-LAST:event_jButton11ActionPerformed
    String havalehesap = "";
    String hstr = "";
    String dvtr = "";
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
   
        if (Integer.valueOf(jTable5.getValueAt(jTable5.getSelectedRow(), 0).toString()).equals(Integer.valueOf(jTextField9.getText().trim()))) {
            JOptionPane.showMessageDialog(rootPane, "Aynı hesap seçtiniz");
        } else {

            String q = "call hesap_ara_havale(?)";
            jTextField10.setText("");
            jTextField11.setText("");
            jTextField26.setText("");
            if (jTextField9.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Hesap no veya IBAN giriniz");
            } else {
                PreparedStatement pr = db.preBaglan(q);

                try {
                    pr.setString(1, jTextField9.getText().trim());
                    ResultSet rs = pr.executeQuery();

                    if (rs.next()) {

                        jTextField10.setText(rs.getString(1).substring(0, 2) + "**");
                        jTextField11.setText(rs.getString(2).substring(0, 2) + "**");
                        havalehesap = rs.getString(3);
                        dvtr = rs.getString(4);
                        hstr = rs.getString(5);
                        jTextField26.setText(rs.getString(6));

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Hesap Bulunamadı");
                        jPanel28.setVisible(false);

                    }

                } catch (SQLException ex) {
                    System.out.println("müşteri hesap sorgulama hatası :" + ex);
                } finally {
                    db.kapat();
                }
            } 
        }
    }//GEN-LAST:event_jButton10ActionPerformed
    Validator vld = new Validator();
    Transaction tr = new Transaction("bankasistemi", "root", "");
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        if (Integer.valueOf(jTable5.getValueAt(jTable5.getSelectedRow(), 0).toString()).equals(Integer.valueOf(jTextField9.getText().trim())))
            JOptionPane.showMessageDialog(rootPane, "Aynı hesap seçtiniz");
        else {

            if (jTextField12.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Tutar Giriniz !");
            } else if (!(vld.rakamkontrol(jTextField12.getText().trim()))) {
                JOptionPane.showMessageDialog(rootPane, "Tutar Sadece rakamlardan oluşmalı ve Pozitif Olmalı");
            } else {
                if (jTable5.getValueAt(jTable5.getSelectedRow(), 1).toString().equals("Doviz")) {

                    int x = jTable5.getSelectedRow();

                    if (!(hesaptr.get(x).equals(hstr))) {
                        JOptionPane.showMessageDialog(rootPane, "Hesap Türleri Uyuşmamaktadır");
                    } else if (!(dvtip.get(x).equals(dvtr))) {
                        JOptionPane.showMessageDialog(rootPane, "Döviz Tipleri Uyuşmamaktadır");
                    } else {

                        if ((Integer.valueOf(jTextField12.getText().trim()) > (Integer.valueOf(jTextField13.getText().trim())))) {
                            JOptionPane.showMessageDialog(rootPane, "Yeterli Bakiyeniz Bulunmamaktadır");
                        } else {
                            String q = "call hesap_detay_kaydet(?,?,?,?)";
                            int y = jTable5.getSelectedRow();

                            PreparedStatement pr = tr.preBaglan(q);
                            try {
                                pr.setString(1, jTable5.getValueAt(y, 0).toString());
                                pr.setString(2, jTextField12.getText().trim());
                                pr.setString(3, "2");
                                pr.setString(4, dvz_tip);
                                int yaz = pr.executeUpdate();
                                tr.conn.commit();
                                if (yaz > 0) {

                                    pr = tr.preBaglan(q);
                                    pr.setString(1, havalehesap);
                                    pr.setString(2, jTextField12.getText().trim());
                                    pr.setString(3, "1");
                                    pr.setString(4, dvz_tip);
                                    pr.execute();

                                    JOptionPane.showMessageDialog(rootPane, "Havale İşlemi Başarılı");
                                    tr.conn.commit();
                                }

                            } catch (SQLException ex) {
                                try {
                                    System.out.println("havale hatası :" + ex);
                                    tr.conn.rollback();
                                } catch (SQLException ex1) {
                                    System.out.println("hata :" + ex);
                                }
                            } finally {
                                tr.kapat();
                            }

                        }

                    }

                } else {
                    if ((hstr.equals("5"))) {
                        JOptionPane.showMessageDialog(rootPane, "Hesap Türleri Uyuşmamaktadır");
                    } else {
                        if ((Integer.valueOf(jTextField12.getText().trim()) > (Integer.valueOf(jTextField13.getText().trim())))) {
                            JOptionPane.showMessageDialog(rootPane, "Yeterli Bakiyeniz Bulunmamaktadır");
                        } else {
                            String q = "call hesap_detay_kaydet(?,?,?,?)";
                            int x = jTable5.getSelectedRow();

                            PreparedStatement pr = tr.preBaglan(q);
                            try {
                                pr.setString(1, jTable5.getValueAt(x, 0).toString());
                                pr.setString(2, jTextField12.getText().trim());
                                pr.setString(3, "2");
                                pr.setString(4, dvz_tip);
                                int yaz = pr.executeUpdate();
                                tr.conn.commit();
                                if (yaz > 0) {

                                    pr = tr.preBaglan(q);
                                    pr.setString(1, havalehesap);
                                    pr.setString(2, jTextField12.getText().trim());
                                    pr.setString(3, "1");
                                    pr.setString(4, dvz_tip);
                                    pr.execute();

                                    JOptionPane.showMessageDialog(rootPane, "Havale İşlemi Başarılı");
                                    tr.conn.commit();
                                }

                            } catch (SQLException ex) {
                                try {
                                    System.out.println("havale hatası :" + ex);
                                    tr.conn.rollback();
                                } catch (SQLException ex1) {
                                    Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex1);
                                }
                            } finally {
                                tr.kapat();
                            }

                        }

                    }
                }
            }
    }//GEN-LAST:event_jButton12ActionPerformed
    }
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (Integer.valueOf(jTable6.getValueAt(jTable6.getSelectedRow(), 0).toString()).equals(Integer.valueOf(jTextField14.getText().trim()))) {
            JOptionPane.showMessageDialog(rootPane, "Aynı hesap seçtiniz");
        } else {

            String q = "call hesap_ara_havale(?)";
            jTextField15.setText("");
            jTextField16.setText("");
            if (jTextField14.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Hesap no veya IBAN giriniz");
            } else {
                PreparedStatement pr = db.preBaglan(q);
                jTextField27.setText("");

                try {
                    pr.setString(1, jTextField14.getText().trim());
                    ResultSet rs = pr.executeQuery();

                    if (rs.next()) {

                        jTextField15.setText(rs.getString(1).substring(0, 2) + "**");
                        jTextField16.setText(rs.getString(2).substring(0, 2) + "**");
                        havalehesap = rs.getString(3);
                        dvtr = rs.getString(4);
                        hstr = rs.getString(5);
                        jTextField27.setText(rs.getString(6));

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Hesap Bulunamadı");
                        jPanel30.setVisible(false);

                    }

                } catch (SQLException ex) {
                    System.out.println("müşteri hesap sorgulama hatası :" + ex);
                } finally {
                    db.kapat();
                }
            }
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        if (!(jTextField15.getText().trim().equals(""))) {
            jPanel30.setVisible(true);
        }

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        if (Integer.valueOf(jTable6.getValueAt(jTable6.getSelectedRow(), 0).toString()).equals(Integer.valueOf(jTextField14.getText().trim()))) {
            JOptionPane.showMessageDialog(rootPane, "Aynı hesap seçtiniz");
        } else {
            if (jTextField17.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Tutar Giriniz !");
            } else if (!(vld.rakamkontrol(jTextField17.getText().trim()))) {
                JOptionPane.showMessageDialog(rootPane, "Tutar Sadece rakamlardan oluşmalı ve Pozitif Olmalı");
            } else {
                if (jTable6.getValueAt(jTable6.getSelectedRow(), 1).toString().equals("Doviz")) {

                    int y = jTable6.getSelectedRow();

                    if (!(hesaptr.get(y).equals(hstr))) {
                        JOptionPane.showMessageDialog(rootPane, "Hesap Türleri Uyuşmamaktadır");
                    } else if (!(dvtip.get(y).equals(dvtr))) {
                        JOptionPane.showMessageDialog(rootPane, "Döviz Tipleri Uyuşmamaktadır");
                    } else {

                        if ((Integer.valueOf(jTextField17.getText().trim()) > (Integer.valueOf(jTextField18.getText().trim())))) {
                            JOptionPane.showMessageDialog(rootPane, "Yeterli Bakiyeniz Bulunmamaktadır");
                        } else {
                            String q = "call hesap_detay_kaydet(?,?,?,?)";
                            int x = jTable6.getSelectedRow();

                            PreparedStatement pr = tr.preBaglan(q);
                            try {
                                pr.setString(1, jTable6.getValueAt(x, 0).toString());
                                pr.setString(2, jTextField17.getText().trim());
                                pr.setString(3, "2");
                                pr.setString(4, dvz_tip);
                                int yaz = pr.executeUpdate();
                                tr.conn.commit();
                                if (yaz > 0) {

                                    pr = tr.preBaglan(q);
                                    pr.setString(1, havalehesap);
                                    pr.setString(2, jTextField17.getText().trim());
                                    pr.setString(3, "1");
                                    pr.setString(4, "1");
                                    pr.execute();

                                    JOptionPane.showMessageDialog(rootPane, "Havale İşlemi Başarılı");
                                    tr.conn.commit();
                                }

                            } catch (SQLException ex) {
                                try {
                                    System.out.println("havale hatası :" + ex);
                                    tr.conn.rollback();
                                } catch (SQLException ex1) {
                                    Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex1);
                                }
                            } finally {
                                tr.kapat();
                            }

                        }
                    }
                } else {

                    if (hstr.equals("5")) {
                        JOptionPane.showMessageDialog(rootPane, "Hesap Türleri Uyuşmamaktadır");
                    } else {

                        if ((Integer.valueOf(jTextField17.getText().trim()) > (Integer.valueOf(jTextField18.getText().trim())))) {
                            JOptionPane.showMessageDialog(rootPane, "Yeterli Bakiyeniz Bulunmamaktadır");
                        } else {
                            String q = "call hesap_detay_kaydet(?,?,?,?)";
                            int x = jTable6.getSelectedRow();

                            PreparedStatement pr = tr.preBaglan(q);
                            try {
                                pr.setString(1, jTable6.getValueAt(x, 0).toString());
                                pr.setString(2, jTextField17.getText().trim());
                                pr.setString(3, "2");
                                pr.setString(4, dvz_tip);
                                int yaz = pr.executeUpdate();
                                tr.conn.commit();
                                if (yaz > 0) {

                                    pr = tr.preBaglan(q);
                                    pr.setString(1, havalehesap);
                                    pr.setString(2, jTextField17.getText().trim());
                                    pr.setString(3, "1");
                                    pr.setString(4, "1");
                                    pr.execute();

                                    JOptionPane.showMessageDialog(rootPane, "Havale İşlemi Başarılı");
                                    tr.conn.commit();
                                }

                            } catch (SQLException ex) {
                                try {
                                    System.out.println("havale hatası :" + ex);
                                    tr.conn.rollback();
                                } catch (SQLException ex1) {
                                    Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex1);
                                }
                            } finally {
                                tr.kapat();
                            }

                        }

                    }
                }

            }
        }

    }//GEN-LAST:event_jButton15ActionPerformed
    String dvz_tip = "";
    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        int x = jTable6.getSelectedRow();
        dv.removeAll(dv);
        if (x > -1) {
            jTextField18.setText("");
            String d = "call bakiye_getir(?)";
            try {
                PreparedStatement pr = db.preBaglan(d);
                pr.setString(1, jTable6.getValueAt(x, 0).toString());
                ResultSet rs = pr.executeQuery();

                if (rs.next()) {
                    jTextField18.setText(rs.getString(1));
                    dvz_tip = rs.getString(2);
                }
                if (jTable6.getValueAt(jTable6.getSelectedRow(), 1).toString().equals("Doviz")) {
                    jLabel26.setVisible(true);
                    jTextField20.setVisible(true);
                    if (dvz_tip.equals("1")) {
                        jTextField20.setText("TL");
                    }
                    if (dvz_tip.equals("2")) {
                        jTextField20.setText("DOLAR");
                    }
                    if (dvz_tip.equals("3")) {
                        jTextField20.setText("EURO");
                    }
                    if (dvz_tip.equals("4")) {
                        jTextField20.setText("STERLIN");
                    }

                } else {
                    jLabel26.setVisible(false);
                    jTextField20.setVisible(false);

                }

            } catch (SQLException ex) {
                System.out.println("bakiye getirme hatası :" + ex);
            } finally {
                db.kapat();
            }

        }


    }//GEN-LAST:event_jTable6MouseClicked

    private void jTable6VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTable6VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable6VetoableChange

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        if (jTextField19.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "TC Giriniz");
        } else {
            String q = "call musteri_hesap_ara(?)";
            PreparedStatement pr = db.preBaglan(q);
            hesaptr.removeAll(hesaptr);
            dvtip.removeAll(dvtip);
            try {
                pr.setString(1, jTextField19.getText().trim());
                ResultSet rs = pr.executeQuery();
                DefaultTableModel dtm = new DefaultTableModel();

                dtm.addColumn("Hesap ID");
                dtm.addColumn("Hesap Türü");
                while (rs.next()) {
                    dtm.addRow(new String[]{rs.getString(1), rs.getString(2)});
                    hesaptr.add(rs.getString(3));
                    dvtip.add(rs.getString(4));

                }
                jTable6.setModel(dtm);
            } catch (SQLException ex) {
                Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                db.kapat();
            }

        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

        if (jTextField21.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "TC Giriniz");
        } else {
            String q = "call musteri_hesap_ara(?)";
            PreparedStatement pr = db.preBaglan(q);
            hesaptr.removeAll(hesaptr);
            dvtip.removeAll(dvtip);
            try {
                pr.setString(1, jTextField21.getText().trim());
                ResultSet rs = pr.executeQuery();
                DefaultTableModel dtm = new DefaultTableModel();

                dtm.addColumn("Hesap ID");
                dtm.addColumn("Hesap Türü");
                while (rs.next()) {
                    dtm.addRow(new String[]{rs.getString(1), rs.getString(2)});
                    hesaptr.add(rs.getString(3));
                    dvtip.add(rs.getString(4));

                }
                jTable7.setModel(dtm);
            } catch (SQLException ex) {
                Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                db.kapat();
            }

        }


    }//GEN-LAST:event_jButton19ActionPerformed
    String iss = "1";
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed

        if (Integer.valueOf(jTable7.getValueAt(jTable7.getSelectedRow(), 0).toString()).equals(Integer.valueOf(jTextField24.getText().trim()))) {
            JOptionPane.showMessageDialog(rootPane, "Aynı hesap seçtiniz");
        } else {

            String q = "call hesap_ara_havale(?)";
            jTextField30.setText("");
            jTextField31.setText("");
            jTextField33.setText("");
            if (jTextField24.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Hesap no veya IBAN giriniz");
            } else {
                PreparedStatement pr = db.preBaglan(q);

                try {
                    pr.setString(1, jTextField24.getText().trim());
                    ResultSet rs = pr.executeQuery();

                    if (rs.next()) {

                        jTextField30.setText(rs.getString(1).substring(0, 2) + "**");
                        jTextField31.setText(rs.getString(2).substring(0, 2) + "**");
                        havalehesap = rs.getString(3);
                        dvtr = rs.getString(4);
                        hstr = rs.getString(5);
                        jTextField33.setText(rs.getString(6));

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Hesap Bulunamadı");
                        jPanel28.setVisible(false);

                    }

                } catch (SQLException ex) {
                    System.out.println("müşteri hesap sorgulama hatası :" + ex);
                } finally {
                    db.kapat();
                }
            }
        }


    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

        if (!(jTextField30.getText().trim().equals(""))) {
            jPanel40.setVisible(true);
        }


    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed

        if (Integer.valueOf(jTable7.getValueAt(jTable7.getSelectedRow(), 0).toString()).equals(Integer.valueOf(jTextField24.getText().trim()))) {
            JOptionPane.showMessageDialog(rootPane, "Aynı hesap seçtiniz");
        } else {
            String qq = "call h_arasi_havale(?,?)";

            PreparedStatement prr = db.preBaglan(qq);
            String d_tip = "";
            String h_tur = "";
            try {
                prr.setString(1, jTable7.getValueAt(jTable7.getSelectedRow(), 0).toString());
                prr.setString(2, jTextField24.getText().trim());
                ResultSet rss = prr.executeQuery();

                if (rss.next()) {

                    if (jTextField32.getText().trim().equals("")) {
                        JOptionPane.showMessageDialog(rootPane, "Tutar Giriniz !");
                    } else if (!(vld.rakamkontrol(jTextField32.getText().trim()))) {
                        JOptionPane.showMessageDialog(rootPane, "Tutar Sadece rakamlardan oluşmalı ve Pozitif Olmalı");
                    } else {
                        if (jTable7.getValueAt(jTable7.getSelectedRow(), 1).toString().equals("Doviz")) {

                            int y = jTable7.getSelectedRow();

                            if (!(hesaptr.get(y).equals(hstr))) {
                                JOptionPane.showMessageDialog(rootPane, "Hesap Türleri Uyuşmamaktadır");
                            } else if (!(dvtip.get(y).equals(dvtr))) {
                                JOptionPane.showMessageDialog(rootPane, "Döviz Tipleri Uyuşmamaktadır");
                            } else {

                                if ((Integer.valueOf(jTextField32.getText().trim()) > (Integer.valueOf(jTextField22.getText().trim())))) {
                                    JOptionPane.showMessageDialog(rootPane, "Yeterli Bakiyeniz Bulunmamaktadır");
                                } else {
                                    String q = "call hesap_detay_kaydet(?,?,?,?)";
                                    int x = jTable7.getSelectedRow();

                                    PreparedStatement pr = tr.preBaglan(q);
                                    try {
                                        pr.setString(1, jTable7.getValueAt(x, 0).toString());
                                        pr.setString(2, jTextField32.getText().trim());
                                        pr.setString(3, "2");
                                        pr.setString(4, dvz_tip);
                                        int yaz = pr.executeUpdate();
                                        tr.conn.commit();
                                        if (yaz > 0) {

                                            pr = tr.preBaglan(q);
                                            pr.setString(1, havalehesap);
                                            pr.setString(2, jTextField32.getText().trim());
                                            pr.setString(3, "1");
                                            pr.setString(4, "1");
                                            pr.execute();

                                            JOptionPane.showMessageDialog(rootPane, "Havale İşlemi Başarılı");
                                            tr.conn.commit();
                                        }

                                    } catch (SQLException ex) {
                                        try {
                                            System.out.println("havale hatası :" + ex);
                                            tr.conn.rollback();
                                        } catch (SQLException ex1) {
                                            Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex1);
                                        }
                                    } finally {
                                        tr.kapat();
                                    }

                                }
                            }
                        } else {

                            if (hstr.equals("5")) {
                                JOptionPane.showMessageDialog(rootPane, "Hesap Türleri Uyuşmamaktadır");
                            } else {

                                if ((Integer.valueOf(jTextField32.getText().trim()) > (Integer.valueOf(jTextField22.getText().trim())))) {
                                    JOptionPane.showMessageDialog(rootPane, "Yeterli Bakiyeniz Bulunmamaktadır");
                                } else {
                                    String q = "call hesap_detay_kaydet(?,?,?,?)";
                                    int x = jTable7.getSelectedRow();

                                    PreparedStatement pr = tr.preBaglan(q);
                                    try {
                                        pr.setString(1, jTable7.getValueAt(x, 0).toString());
                                        pr.setString(2, jTextField32.getText().trim());
                                        pr.setString(3, "2");
                                        pr.setString(4, dvz_tip);
                                        int yaz = pr.executeUpdate();
                                        tr.conn.commit();
                                        if (yaz > 0) {

                                            pr = tr.preBaglan(q);
                                            pr.setString(1, havalehesap);
                                            pr.setString(2, jTextField32.getText().trim());
                                            pr.setString(3, "1");
                                            pr.setString(4, "1");
                                            pr.execute();

                                            JOptionPane.showMessageDialog(rootPane, "Havale İşlemi Başarılı");
                                            tr.conn.commit();
                                        }

                                    } catch (SQLException ex) {
                                        try {
                                            System.out.println("havale hatası :" + ex);
                                            tr.conn.rollback();
                                        } catch (SQLException ex1) {
                                            Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex1);
                                        }
                                    } finally {
                                        tr.kapat();
                                    }

                                }

                            }
                        }

                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Müşteri veya Hesap Türleri Uyuşmamaktadır.");
                }

            } catch (SQLException ex) {
                System.out.println(" hata :" + ex);
            } finally {
                db.kapat();
            }

        }


    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTable7VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTable7VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable7VetoableChange

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        int x = jTable7.getSelectedRow();
        dv.removeAll(dv);
        if (x > -1) {
            jTextField22.setText("");
            String d = "call bakiye_getir(?)";
            try {
                PreparedStatement pr = db.preBaglan(d);
                pr.setString(1, jTable7.getValueAt(x, 0).toString());
                ResultSet rs = pr.executeQuery();

                if (rs.next()) {
                    jTextField22.setText(rs.getString(1));
                    iss = rs.getString(2);
                }
                if (jTable7.getValueAt(jTable7.getSelectedRow(), 1).toString().equals("Doviz")) {
                    jLabel29.setVisible(true);
                    jTextField23.setVisible(true);
                    if (iss.equals("1")) {
                        jTextField23.setText("TL");
                    } else if (iss.equals("2")) {
                        jTextField23.setText("DOLAR");
                    } else if (iss.equals("3")) {
                        jTextField23.setText("EURO");
                    } else if (iss.equals("4")) {
                        jTextField23.setText("STERLIN");
                    }

                } else {
                    jLabel29.setVisible(false);
                    jTextField23.setVisible(false);

                }

            } catch (SQLException ex) {
                System.out.println("bakiye getirme hatası :" + ex);
            } finally {
                db.kapat();
            }

        }
    }//GEN-LAST:event_jTable7MouseClicked

    ArrayList<String> abone = new ArrayList<>();
    ArrayList<String> kurum_hesap = new ArrayList<>();
    String ramazan = "";
    private void jTable10VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTable10VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable10VetoableChange

    private void jTable10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable10MouseClicked

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        String qq = "call hesap_ara(?)";
        String aa = ramazan;
        PreparedStatement prr = db.preBaglan(qq);

        try {
            prr.setString(1, aa);

            ResultSet tr = prr.executeQuery();
            DefaultTableModel dtm = new DefaultTableModel();

            dtm.addColumn("Hesap ID");
            dtm.addColumn("Hesap Türü");
            dtm.addColumn("Bakiye");

            while (tr.next()) {

                if (tr.getString(2).equals("Vadesiz Mevduat")) {
                    dtm.addRow(new String[]{tr.getString(1), tr.getString(2), tr.getString(4)});
                }

            }

            jPanel54.setVisible(true);
            jTable10.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        jPanel54.setVisible(false);

    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jTable4VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTable4VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4VetoableChange

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        if (jTextField28.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "TC Giriniz");
        } else {
            String q = "call musteri_kredi_ara(?)";
            PreparedStatement pr = db.preBaglan(q);

            try {
                pr.setString(1, jTextField28.getText().trim());
                ResultSet rs = pr.executeQuery();
                DefaultTableModel dtm = new DefaultTableModel();

                dtm.addColumn("Hesap ID");
                dtm.addColumn("Hesap Türü");
                dtm.addColumn("Taksit Miktarı");
                dtm.addColumn("Toplam Borç");

                while (rs.next()) {
                    dtm.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(5)});
                    ramazan = rs.getString(6);
                }
                jTable4.setModel(dtm);
            } catch (SQLException ex) {
                Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                db.kapat();
            }

        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        int x = jTable4.getSelectedRow();
        if (jRadioButton8.isSelected()) {
            if (jTextField39.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Tutar Giriniz");
            } else {

                if (x < 0) {
                    JOptionPane.showMessageDialog(rootPane, "Kredi Kartı hesabı seçiniz");
                } else {
                    if (Integer.valueOf(jTable10.getValueAt(jTable10.getSelectedRow(), 2).toString()) < (Integer.valueOf(jTextField39.getText().trim()))) {
                        JOptionPane.showMessageDialog(rootPane, "Yeterli Bakiyeniz Bulunmamaktadır");
                    } else {
                        int aaa = Integer.valueOf(jTable4.getValueAt(jTable4.getSelectedRow(), 2).toString());
                        int bbb = Integer.valueOf(jTextField39.getText().trim());

                        if (aaa != bbb) {
                            JOptionPane.showMessageDialog(rootPane, "Taksit Tutarı ile aynı miktarda yatırmalısınız");
                        } else {
                            String q = "call hesap_detay_kaydet(?,?,?,?)";
                            PreparedStatement prr = db.preBaglan(q);

                            try {
                                prr.setString(1, jTable10.getValueAt(jTable10.getSelectedRow(), 0).toString());
                                prr.setDouble(2, Double.valueOf(jTextField39.getText().trim()));
                                prr.setString(3, "2");
                                prr.setString(4, "1");
                                prr.execute();
                                String dd = "call kredi_odee(?,?)";
                                PreparedStatement pr = db.preBaglan(dd);
                                pr.setString(1, jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString());
                                pr.setInt(2, Integer.valueOf(jTextField39.getText().trim()));
                                pr.execute();
                                JOptionPane.showMessageDialog(rootPane, "Ödeme başarılı");
                                jTextField39.setText("");
                                jButton18ActionPerformed(null);
                                jRadioButton8ActionPerformed(null);

                            } catch (SQLException ex) {
                                System.out.println("hesap_detay_kaydet hatası :" + ex);
                            } finally {
                                db.kapat();
                            }

                        }
                    }
                }
            }
        } else {
            if (jTextField39.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Tutar Giriniz");
            } else {
                if (x < 0) {
                    JOptionPane.showMessageDialog(rootPane, "Kredi Kartı hesabı seçiniz");
                } else {
                    int aaa = Integer.valueOf(jTable4.getValueAt(jTable4.getSelectedRow(), 2).toString());
                    int bbb = Integer.valueOf(jTextField39.getText().trim());

                    if (aaa != bbb) {
                        JOptionPane.showMessageDialog(rootPane, "Taksit Tutarı ile aynı miktarda yatırmalısınız");
                    } else {
                        try {
                            String dd = "call kredi_odee(?,?)";
                            PreparedStatement pr = db.preBaglan(dd);
                            pr.setString(1, jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString());
                            pr.setInt(2, Integer.valueOf(jTextField39.getText().trim()));
                            pr.execute();
                            JOptionPane.showMessageDialog(rootPane, "Ödeme başarılı");
                            jTextField39.setText("");

                        } catch (SQLException ex) {
                            System.out.println("hesap_detay_kaydet hatası :" + ex);
                        } finally {
                            db.kapat();
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Hesapguncelle hsg = new Hesapguncelle();
        hsg.setVisible(true);


    }//GEN-LAST:event_jButton4ActionPerformed
    ButtonGroup bmm = new ButtonGroup();

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed

        if (cKredi.isSelected()) {
            try {
                String q = "call krediKartiRapor()";
                ResultSet rss = db.baglan().executeQuery(q);
                DefaultTableModel dtm = new DefaultTableModel();

                dtm.addColumn("Adi");
                dtm.addColumn("Soyadi");
                dtm.addColumn("Kredi  Miktari");
                dtm.addColumn("Gelir Durumu");
                dtm.addColumn("Durum");

                while (rss.next()) {
                    String gecici = rss.getString(5).toString().trim();
                    if (gecici.equals("2")) {
                        gecici = "Onaylandi";
                    }
                    dtm.addRow(new String[]{rss.getString(1), rss.getString(2), rss.getString(3), rss.getString(4), gecici});

                }
                jTable11.setModel(dtm);
            } catch (Exception e) {
                System.out.println("Data Getirme Hatası " + e);
            } finally {
                db.kapat();
            }
        } else if (cKrediKarti.isSelected()) {
            try {
                String q = "call krediRapor()";
                ResultSet rss = db.baglan().executeQuery(q);
                DefaultTableModel dtm = new DefaultTableModel();

                dtm.addColumn("Adi");
                dtm.addColumn("Soyadi");
                dtm.addColumn("Kredi Karti  Miktari");
                dtm.addColumn("Gelir Durumu");
                dtm.addColumn("Durum");

                while (rss.next()) {
                    String gecici = rss.getString(5).toString().trim();
                    if (gecici.equals("2")) {
                        gecici = "Onaylandi";
                    }
                    dtm.addRow(new String[]{rss.getString(1), rss.getString(2), rss.getString(3), rss.getString(4), gecici});

                }
                jTable11.setModel(dtm);
            } catch (Exception e) {
                System.out.println("Data Getirme Hatası " + e);
            } finally {
                db.kapat();
            }

        } else if (cMusteri.isSelected()) {

            if (!txtMusteri.getText().equals("")) {
                try {
                    String q = "call musteriRapor('" + txtMusteri.getText() + "')";
                    ResultSet rss = db.baglan().executeQuery(q);
                    DefaultTableModel dtm = new DefaultTableModel();

                    dtm.addColumn("Adi");
                    dtm.addColumn("Soyadi");
                    dtm.addColumn("Bakiye");
                    dtm.addColumn("Doviz Tipi");

                    while (rss.next()) {
                        String gecici = rss.getString(4).toString().trim();
                        if (gecici.equals("1")) {
                            gecici = "TL";
                        } else if (gecici.equals("2")) {
                            gecici = "Dolar";
                        } else if (gecici.equals("3")) {
                            gecici = "Euro";
                        } else if (gecici.equals("4")) {
                            gecici = "Sterlin";
                        }
                        dtm.addRow(new String[]{rss.getString(1), rss.getString(2), rss.getString(3), gecici});

                    }
                    jTable11.setModel(dtm);
                } catch (Exception e) {
                    System.out.println("Data Getirme Hatası " + e);
                } finally {
                    db.kapat();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Musteri adi giriniz");
            }

        } else if (paraGiris.isSelected()) {
            try {
                String q = "call hesapGiris()";
                ResultSet rss = db.baglan().executeQuery(q);
                DefaultTableModel dtm = new DefaultTableModel();

                dtm.addColumn("Adi");
                dtm.addColumn("Soyadi");
                dtm.addColumn("Bakiye");
                dtm.addColumn("Doviz Tipi");
                dtm.addColumn("Islem Turu");

                while (rss.next()) {
                    String gecici2 = rss.getString(5).toString().trim();
                    String gecici = rss.getString(4).toString().trim();
                    if (gecici.equals("1")) {
                        gecici = "TL";
                    } else if (gecici.equals("2")) {
                        gecici = "Dolar";
                    } else if (gecici.equals("3")) {
                        gecici = "Euro";
                    } else if (gecici.equals("4")) {
                        gecici = "Sterlin";
                    }
                    if (gecici2.equals("1")) {
                        gecici2 = "Giris";
                    }
                    dtm.addRow(new String[]{rss.getString(1), rss.getString(2), rss.getString(3), gecici, gecici2});

                }
                jTable11.setModel(dtm);
            } catch (Exception e) {
                System.out.println("Data Getirme Hatası " + e);
            } finally {
                db.kapat();
            }

        } else if (paraCikis.isSelected()) {
            try {
                String q = "call hesapCikis()";
                ResultSet rss = db.baglan().executeQuery(q);
                DefaultTableModel dtm = new DefaultTableModel();

                dtm.addColumn("Adi");
                dtm.addColumn("Soyadi");
                dtm.addColumn("Bakiye");
                dtm.addColumn("Doviz Tipi");
                dtm.addColumn("Islem Turu");

                while (rss.next()) {
                    String gecici2 = rss.getString(5).toString().trim();
                    String gecici = rss.getString(4).toString().trim();
                    if (gecici.equals("1")) {
                        gecici = "TL";
                    } else if (gecici.equals("2")) {
                        gecici = "Dolar";
                    } else if (gecici.equals("3")) {
                        gecici = "Euro";
                    } else if (gecici.equals("4")) {
                        gecici = "Sterlin";
                    }
                    if (gecici2.equals("2")) {
                        gecici2 = "Cikis";
                    }
                    dtm.addRow(new String[]{rss.getString(1), rss.getString(2), rss.getString(3), gecici, gecici2});

                }
                jTable11.setModel(dtm);
            } catch (Exception e) {
                System.out.println("Data Getirme Hatası " + e);
            } finally {
                db.kapat();
            }

        } else {
            try {

                Date d1 = date1.getDate();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                System.out.println(df.format(d1));
                Date d2 = date2.getDate();

                System.out.println(df.format(d2));

                String q = "call dateRapor('" + df.format(d1) + "','" + df.format(d2) + "')";
                ResultSet rss = db.baglan().executeQuery(q);
                DefaultTableModel dtm = new DefaultTableModel();

                dtm.addColumn("Adi");
                dtm.addColumn("Soyadi");
                dtm.addColumn("Bakiye");
                dtm.addColumn("Doviz Tipi");
                dtm.addColumn("Islem Turu");
                dtm.addColumn("Islem Tarihi");

                while (rss.next()) {
                    String gecici2 = rss.getString(5).toString().trim();
                    String gecici = rss.getString(4).trim();
                    if (gecici.equals("1")) {
                        gecici = "TL";
                    } else if (gecici.equals("2")) {
                        gecici = "Dolar";
                    } else if (gecici.equals("3")) {
                        gecici = "Euro";
                    } else if (gecici.equals("4")) {
                        gecici = "Sterlin";
                    }
                    if (gecici2.equals("2")) {
                        gecici2 = "Cikis";
                    } else if (gecici2.equals("1")) {
                        gecici2 = "Giris";
                    }
                    dtm.addRow(new String[]{rss.getString(1), rss.getString(2), rss.getString(3), gecici, gecici2, rss.getString(6)});

                }
                jTable11.setModel(dtm);
            } catch (Exception e) {
                System.out.println("Data Getirme Hatası " + e);
            } finally {
                db.kapat();
            }

        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed

        try {

            String q = "call p_Sifre('" + k_adi + "')";
            ResultSet rss = db.baglan().executeQuery(q);
            String Sifre = null;
            while (rss.next()) {
                Sifre = rss.getString(1);
                System.out.println(Sifre);
            }
            String yenisifre = pswYeniSifre.getText();
            String onay = sifreonay.getText();
            String eskiSifre = pswEskiSifre.getText();
            if (Sifre.equalsIgnoreCase("") || yenisifre.equalsIgnoreCase("") || onay.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Sifre alanlari bos  olamaz! ");
            } else if (!eskiSifre.equalsIgnoreCase(Sifre)) {
                JOptionPane.showMessageDialog(rootPane, "Gerekli alanlar bos eksik ya da hatali");
                pswYeniSifre.setText("");
                sifreonay.setText("");
                pswEskiSifre.setText("");
            } else if (!yenisifre.equalsIgnoreCase(onay)) {
                JOptionPane.showMessageDialog(rootPane, "onay sifreleri uyumsuz");
                pswYeniSifre.setText("");
                sifreonay.setText("");
                pswEskiSifre.setText("");
            } else {

                String updateQuery = "call sifre_Islemleri('" + yenisifre + "','" + k_adi + "')";
                int yazSonuc = db.baglan().executeUpdate(updateQuery);
                if (yazSonuc > 0) {

                    JOptionPane.showMessageDialog(rootPane, "Update işlemi başarılı");
                    Login lgn = new Login();
                    lgn.setVisible(true);
                    dispose();
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        if (jRadioButton6.isSelected()) {
            if (jTextField36.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Tutar Giriniz");
            } else {
                int x = jTable8.getSelectedRow();
                if (x < 0) {
                    JOptionPane.showMessageDialog(rootPane, "Kredi Kartı hesabı seçiniz");
                } else {
                    if (Integer.valueOf(jTable9.getValueAt(jTable9.getSelectedRow(), 2).toString()) < (Integer.valueOf(jTextField36.getText().trim()))) {
                        JOptionPane.showMessageDialog(rootPane, "Yeterli Bakiyeniz Bulunmamaktadır");
                    } else {

                        String q = "call hesap_detay_kaydet(?,?,?,?)";
                        PreparedStatement prr = db.preBaglan(q);

                        try {
                            prr.setString(1, jTable9.getValueAt(jTable9.getSelectedRow(), 0).toString());
                            prr.setDouble(2, Double.valueOf(jTextField36.getText().trim()));
                            prr.setString(3, "2");
                            prr.setString(4, "1");
                            prr.execute();
                            String dd = "call kredi_ode(?,?)";
                            PreparedStatement pr = db.preBaglan(dd);
                            pr.setString(1, jTable8.getValueAt(jTable8.getSelectedRow(), 0).toString());
                            pr.setInt(2, Integer.valueOf(jTextField36.getText().trim()));
                            pr.execute();
                            JOptionPane.showMessageDialog(rootPane, "Ödeme başarılı");
                            jTextField36.setText("");
                            jButton25ActionPerformed(null);
                            jRadioButton6ActionPerformed(null);

                        } catch (SQLException ex) {
                            System.out.println("hesap_detay_kaydet hatası :" + ex);
                        } finally {
                            db.kapat();
                        }

                    }

                }
            }
        } else {
            if (jTextField36.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Tutar Giriniz");
            } else {
                try {
                    String dd = "call kredi_ode(?,?)";
                    PreparedStatement pr = db.preBaglan(dd);
                    pr.setString(1, jTable8.getValueAt(jTable8.getSelectedRow(), 0).toString());
                    pr.setInt(2, Integer.valueOf(jTextField36.getText().trim()));
                    pr.execute();
                    JOptionPane.showMessageDialog(rootPane, "Ödeme başarılı");
                    jTextField36.setText("");
                    jButton25ActionPerformed(null);

                } catch (SQLException ex) {
                    System.out.println("hesap_detay_kaydet hatası :" + ex);
                } finally {
                    db.kapat();
                }

            }

        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jTable9VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTable9VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable9VetoableChange

    private void jTable9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable9MouseClicked

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        String qq = "call hesap_ara(?)";
        String aa = ramazan;
        PreparedStatement prr = db.preBaglan(qq);

        try {
            prr.setString(1, aa);

            ResultSet tr = prr.executeQuery();
            DefaultTableModel dtm = new DefaultTableModel();

            dtm.addColumn("Hesap ID");
            dtm.addColumn("Hesap Türü");
            dtm.addColumn("Bakiye");

            while (tr.next()) {

                if (tr.getString(2).equals("Vadesiz Mevduat")) {
                    dtm.addRow(new String[]{tr.getString(1), tr.getString(2), tr.getString(4)});
                }

            }

            jPanel51.setVisible(true);
            jTable9.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed

        jPanel51.setVisible(false);
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jTable8VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTable8VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable8VetoableChange

    private void jTable8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable8MouseClicked

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        if (jTextField29.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "TC Giriniz");
        } else {
            String q = "call musteri_kredi_karti_ara(?)";
            PreparedStatement pr = db.preBaglan(q);

            try {
                pr.setString(1, jTextField29.getText().trim());
                ResultSet rs = pr.executeQuery();
                DefaultTableModel dtm = new DefaultTableModel();

                dtm.addColumn("Hesap ID");
                dtm.addColumn("Hesap Türü");
                dtm.addColumn("Borç Tutarı");

                while (rs.next()) {
                    dtm.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(4)});
                    ramazan = rs.getString(5);
                }
                jTable8.setModel(dtm);
            } catch (SQLException ex) {
                Logger.getLogger(Veznedar.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                db.kapat();
            }

        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jPanel43.setVisible(true);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        int x = jTable3.getSelectedRow();
        if (!(x == -1)) {
            if (Integer.valueOf(jTable3.getValueAt(x, 2).toString()) > Integer.valueOf(jTextField35.getText().trim())) {

                String q = "call hesap_detay_kaydet(?,?,?,?)";
                PreparedStatement pr = db.preBaglan(q);

                try {
                    pr.setString(1, jTable3.getValueAt(x, 0).toString());
                    pr.setDouble(2, Double.valueOf(jTextField35.getText().trim()));
                    pr.setString(3, "2");
                    pr.setString(4, "1");
                    pr.execute();

                    pr.setString(1, kurum_hesap.get(x));
                    pr.setDouble(2, Double.valueOf(jTextField35.getText().trim()));
                    pr.setString(3, "1");
                    pr.setString(4, "1");
                    pr.execute();

                    JOptionPane.showMessageDialog(rootPane, "Borç Ödeme İşlemi Başarılı ");

                } catch (SQLException ex) {
                    System.out.println("hesap_detay_kaydet hatası :" + ex);
                } finally {
                    db.kapat();
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Hesap Seçiniz");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        if (jTextField34.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Abone Numarası Giriniz");
        } else {
            jTextField35.setText("");
            jPanel44.setVisible(false);
            jPanel43.setVisible(false);
            String q = "call abonegetir(?,?)";

            PreparedStatement pr = db.preBaglan(q);

            try {
                pr.setString(1, jTextField34.getText().trim());
                pr.setString(2, abone.get(jComboBox3.getSelectedIndex()));
                ResultSet rs = pr.executeQuery();
                if (rs.next()) {
                    String qq = "call hesap_ara(?)";
                    String aa = rs.getString(1);
                    db.kapat();
                    PreparedStatement prr = db.preBaglan(qq);

                    prr.setString(1, aa);

                    ResultSet tr = prr.executeQuery();
                    DefaultTableModel dtm = new DefaultTableModel();

                    dtm.addColumn("Hesap ID");
                    dtm.addColumn("Hesap Türü");
                    dtm.addColumn("Bakiye");

                    while (tr.next()) {

                        if (tr.getString(2).equals("Vadesiz Mevduat")) {
                            dtm.addRow(new String[]{tr.getString(1), tr.getString(2), tr.getString(4)});
                        }

                    }
                    Random rn = new Random();
                    int borc = 20 + rn.nextInt(80);

                    jTextField35.setText(borc + "");
                    jPanel44.setVisible(true);
                    jTable3.setModel(dtm);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Abone Bulunamadı");
                    jTextField35.setText("");
                    jPanel44.setVisible(false);
                }
            } catch (SQLException ex) {
                System.out.println(" hata :" + ex);
            }

        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        jPanel43.setVisible(false);
        jPanel44.setVisible(false);
        jTextField34.setText("");
        abone.removeAll(abone);
        kurum_hesap.removeAll(kurum_hesap);
        String q = "call kurumgetir(?)";
        jComboBox3.removeAllItems();
        PreparedStatement pr = db.preBaglan(q);
        try {
            pr.setString(1, "tlf");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {

                jComboBox3.addItem(rs.getString(2));
                abone.add(rs.getString(1));
                kurum_hesap.add(rs.getString(3));
            }

        } catch (SQLException ex) {
            System.out.println("kurum getirme hatası :" + ex);
        } finally {
            db.kapat();
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jPanel43.setVisible(false);
        jPanel44.setVisible(false);
        jTextField34.setText("");
        abone.removeAll(abone);
        kurum_hesap.removeAll(kurum_hesap);
        String q = "call kurumgetir(?)";
        jComboBox3.removeAllItems();
        PreparedStatement pr = db.preBaglan(q);
        try {
            pr.setString(1, "dgz");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {

                jComboBox3.addItem(rs.getString(2));
                abone.add(rs.getString(1));
                kurum_hesap.add(rs.getString(3));
            }

        } catch (SQLException ex) {
            System.out.println("kurum getirme hatası :" + ex);
        } finally {
            db.kapat();
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jPanel43.setVisible(false);
        jPanel44.setVisible(false);
        jTextField34.setText("");
        kurum_hesap.removeAll(kurum_hesap);

        abone.removeAll(abone);
        String q = "call kurumgetir(?)";
        jComboBox3.removeAllItems();
        PreparedStatement pr = db.preBaglan(q);
        try {
            pr.setString(1, "su");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {

                jComboBox3.addItem(rs.getString(2));
                abone.add(rs.getString(1));
                kurum_hesap.add(rs.getString(3));

            }

        } catch (SQLException ex) {
            System.out.println("kurum getirme hatası :" + ex);
        } finally {
            db.kapat();
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        abone.removeAll(abone);
        kurum_hesap.removeAll(kurum_hesap);
        String q = "call kurumgetir(?)";
        jComboBox3.removeAllItems();
        jPanel43.setVisible(false);
        jPanel44.setVisible(false);
        jTextField34.setText("");
        PreparedStatement pr = db.preBaglan(q);
        try {
            pr.setString(1, "elk");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {

                jComboBox3.addItem(rs.getString(2));
                abone.add(rs.getString(1));
                kurum_hesap.add(rs.getString(3));

            }

        } catch (SQLException ex) {
            System.out.println("kurum getirme hatası :" + ex);
        } finally {
            db.kapat();
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void cMusteriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMusteriActionPerformed
        jPanel61.setVisible(true);
    }//GEN-LAST:event_cMusteriActionPerformed

    private void cKrediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cKrediActionPerformed
        jPanel61.setVisible(false);
    }//GEN-LAST:event_cKrediActionPerformed

    private void cKrediKartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cKrediKartiActionPerformed
        jPanel61.setVisible(false);
    }//GEN-LAST:event_cKrediKartiActionPerformed

    private void paraGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraGirisActionPerformed
        jPanel61.setVisible(false);
    }//GEN-LAST:event_paraGirisActionPerformed

    private void paraCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraCikisActionPerformed
        jPanel61.setVisible(false);
    }//GEN-LAST:event_paraCikisActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed

        if (jTextField37.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "TC Numaraası Giriniz");
        } else {
            if (!(vld.tckontrol(jTextField37.getText().trim()))) {
                JOptionPane.showMessageDialog(rootPane, "TC'yi Uygun Formatta Giriniz");
            } else {
                String q = "call musteriara(?)";
                PreparedStatement pr = db.preBaglan(q);
                try {
                    pr.setString(1, jTextField37.getText().trim());
                    ResultSet rs = pr.executeQuery();
                    if (rs.next()) {
                        jButton31.setText("Güncelle");
                        ramazan1.setText(rs.getString(9));
                        ramazan1.setEditable(false);
                        tc.setText(rs.getString(2));
                        ad.setText(rs.getString(3));
                        soyad.setText(rs.getString(4));
                        dtarih.setText(rs.getString(5));
                        dyer.setText(rs.getString(6));
                        adres.setText(rs.getString(7));
                        telefon.setText(rs.getString(8));
                        int dd = Integer.valueOf(rs.getString(11));
                        if (dd == 1) {
                            jRadioButton9.setSelected(true);
                        } else if (dd == 2) {
                            jRadioButton10.setSelected(true);
                        } else if (dd == 3) {
                            jRadioButton11.setSelected(true);
                        } else if (dd == 4) {
                            jRadioButton12.setSelected(true);
                        } else if (dd == 5) {
                            jRadioButton13.setSelected(true);
                        }

                        gelir.setText(rs.getString(12));

                        tc.setEditable(false);
                        dtarih.setEditable(false);
                        dyer.setEditable(false);

                    } else {
                        final int bankid = 10;
                        String yil = new SimpleDateFormat("yy").format(new Date());
                        String ay = new SimpleDateFormat("MM").format(new Date());
                        String gun = new SimpleDateFormat("dd").format(new Date());
                        String saat = new SimpleDateFormat("hh").format(new Date());
                        String dakika = new SimpleDateFormat("mm").format(new Date());
                        musteri_id = bankid + yil + ay + gun + saat + dakika;
                        ramazan1.setText(musteri_id);
                        ramazan1.setEditable(false);
                        tc.setEditable(true);
                        tc.setText(jTextField37.getText().trim());
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

                        jButton31.setText("Kaydet");

                    }

                } catch (SQLException ex) {
                    System.out.println("müşteri arama hatası");
                } finally {
                    db.kapat();
                }
            }
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed

        if (jButton31.getText().equals("Güncelle")) {

            String ww = "call m_guncelle(?,?,?,?,?,?,?)";
            PreparedStatement prr = db.preBaglan(ww);
            try {
                prr.setString(1, tc.getText().trim());
                prr.setString(2, telefon.getText().trim());
                prr.setString(3, adres.getText().trim());
                prr.setString(4, ad.getText().trim());
                prr.setString(5, soyad.getText().trim());
                int x = 0;
                if (jRadioButton9.isSelected()) {
                    x = 1;
                } else if (jRadioButton10.isSelected()) {
                    x = 2;
                } else if (jRadioButton11.isSelected()) {
                    x = 3;
                } else if (jRadioButton12.isSelected()) {
                    x = 4;
                } else if (jRadioButton13.isSelected()) {
                    x = 5;
                }

                prr.setString(6, "" + x);
                prr.setString(7, gelir.getText().trim());
                prr.execute();
                JOptionPane.showMessageDialog(rootPane, "Kayıt Başarılı Güncellendi");

            } catch (SQLException ex) {
                System.out.println("müşteri güncelleme hatası " + ex);
            }

        } else {
            String qq = "call musteriara(?)";
            PreparedStatement prr = db.preBaglan(qq);
            try {
                prr.setString(1, tc.getText().trim());
                ResultSet rs = prr.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(rootPane, "Daha önce müşteri kaydı bulunmaktadır.");
                    System.out.println(rs.getString(2));
                } else {

                    if (!(vld.tckontrol(tc.getText().trim()))) {
                        JOptionPane.showMessageDialog(rootPane, "TC'yi uygun formatta giriniz !");
                    } else if (!(vld.harfkontrol(ad.getText().trim()))) {
                        JOptionPane.showMessageDialog(rootPane, "Ad sadece harflerden oluşmalı");
                    } else if (!(vld.harfkontrol(soyad.getText().trim()))) {
                        JOptionPane.showConfirmDialog(rootPane, "soyadı sadece harflerden oluşmalı:");
                    } else if (!(vld.rakamkontrol(telefon.getText().trim()))) {
                        JOptionPane.showMessageDialog(rootPane, "Telefon sadece rakamlardan oluşmalı");
                    } else {
                        if (tc.getText().trim().equals("")) {
                            JOptionPane.showMessageDialog(rootPane, "TC Giriniz");
                        } else if (ad.getText().trim().equals("")) {
                            JOptionPane.showMessageDialog(rootPane, "Adı Giriniz");
                        } else if (soyad.getText().trim().equals("")) {
                            JOptionPane.showMessageDialog(rootPane, "Soyadı Giriniz");
                        } else if (dtarih.getText().trim().equals("")) {
                            JOptionPane.showMessageDialog(rootPane, "Doğum Tarihini Giriniz");
                        } else if (dyer.getText().trim().equals("")) {
                            JOptionPane.showMessageDialog(rootPane, "Doğum Yerini Giriniz");
                        } else if (adres.getText().trim().equals("")) {
                            JOptionPane.showMessageDialog(rootPane, "Adresi Giriniz");
                        } else if (telefon.getText().trim().equals("")) {
                            JOptionPane.showMessageDialog(rootPane, "Telefonu Giriniz");
                        } else {
                            String aax = "";
                            if (jRadioButton9.isSelected()) {
                                aax = "1";
                            } else if (jRadioButton10.isSelected()) {
                                aax = "2";
                            } else if (jRadioButton11.isSelected()) {
                                aax = "3";
                            } else if (jRadioButton12.isSelected()) {
                                aax = "4";
                            } else if (jRadioButton13.isSelected()) {
                                aax = "5";
                            }

                            String q = "call m_kaydet(?,?,?,?,?,?,?,?,?,?)";
                            PreparedStatement pr = db.preBaglan(q);

                            pr.setString(1, ramazan1.getText().trim());
                            pr.setString(2, tc.getText());
                            pr.setString(3, ad.getText().trim());
                            pr.setString(4, soyad.getText().trim());
                            pr.setString(5, dtarih.getText().trim());
                            pr.setString(6, dyer.getText().trim());
                            pr.setString(7, telefon.getText().trim());
                            pr.setString(8, adres.getText().trim());

                            pr.setString(9, aax);
                            pr.setString(10, gelir.getText().trim());

                            pr.execute();

                            JOptionPane.showMessageDialog(rootPane, "Kayıt Başarılı");

                        }
                    }
                }
            } catch (SQLException ex) {
                System.out.println("müşteri kayıt hatası !" + ex);
            } finally {
                db.kapat();
            }

        }

    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        ramazan1.setEditable(true);
        ramazan1.setText("");
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
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Veznedar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Veznedar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Veznedar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Veznedar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Veznedar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a10;
    private javax.swing.JLabel a11;
    private javax.swing.JLabel a12;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JLabel a9;
    private javax.swing.JTextField ad;
    private javax.swing.JTextField adres;
    private javax.swing.JRadioButton cKredi;
    private javax.swing.JRadioButton cKrediKarti;
    private javax.swing.JRadioButton cMusteri;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JLabel dolar;
    private javax.swing.JLabel dolar1;
    private javax.swing.JTextField dtarih;
    private javax.swing.JTextField dyer;
    private javax.swing.JLabel euro;
    private javax.swing.JLabel euro1;
    private javax.swing.JTextField gelir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JRadioButton paraCikis;
    private javax.swing.JRadioButton paraGiris;
    private javax.swing.JPasswordField pswEskiSifre;
    private javax.swing.JPasswordField pswYeniSifre;
    private javax.swing.JTextField ramazan1;
    private javax.swing.JPasswordField sifreonay;
    private javax.swing.JTextField soyad;
    private javax.swing.JLabel sterlin;
    private javax.swing.JLabel sterlin1;
    private javax.swing.JTextField tc;
    private javax.swing.JTextField telefon;
    private javax.swing.JTextField txtMusteri;
    // End of variables declaration//GEN-END:variables
}
