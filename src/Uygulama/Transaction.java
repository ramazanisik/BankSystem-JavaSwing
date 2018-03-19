package Uygulama;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {
    
    final private String driver="com.mysql.jdbc.Driver";
    final private String url="jdbc:mysql://localhost/";
    final private String encode="?useUnicode=true&characterEncoding=utf-8";
    
    private String dbName="sakila";
    private String dbUser="root";
    private String dbPass="";
    
   public Connection conn=null;
   private Statement st=null;
   private PreparedStatement preSt=null;
   
   
   public Transaction(String dbName,String dbUser,String dbPass)
   {
   this.dbName=dbName;
   this.dbUser=dbUser;
   this.dbPass=dbPass;
 }
    public PreparedStatement preBaglan(String query)
   {
         if(preSt!=null)
           {
               kapat();
           }
       try {
             Class.forName(driver);
           conn=DriverManager.getConnection(url+dbName+encode, dbUser, dbPass);
           conn.setAutoCommit(false);
           preSt=conn.prepareStatement(query);
           System.out.println("bağlantı başarılı");
           
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("bağlantı hatası :"+e);
       }
   
   return preSt;
   }
   public void kapat()
   {
       try {
           if(preSt!=null)
           {
           preSt.close();
           preSt=null;
           System.out.println("preSt kapatildi");
              }
           if(st!=null)
           {
           st.close();
           st=null;
           System.out.println("st kapatildi");
           
        }
           if(conn!=null)
           {
           conn.close();
           conn=null;
           System.out.println("conn kapatildi");
           
           }
       } catch (Exception e) {
           System.out.println("kapatma hatası :"+e);
       }
   
   
   }

}
