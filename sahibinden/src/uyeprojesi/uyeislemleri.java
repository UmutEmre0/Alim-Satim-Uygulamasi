package uyeprojesi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;



public class uyeislemleri {
    private Connection con=null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
   /* public ArrayList<uye> uyeleriGetir(){
        
        
        ArrayList<uye> cikti = new ArrayList<uye>();
        
        try {
            statement = con.createStatement();
            String sorgu = "Select * From eset";
            ResultSet rs = statement.executeQuery(sorgu);    
            
            
            while(rs.next()){
                
               int id = rs.getInt("id");
               String kullanici_adi = rs.getString("kullanıcı_adı");
               String şifre = rs.getString("şifre");
               
               cikti.add(new uye(id,kullanici_adi,şifre));
               
                
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(uyeislemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }*/
    public void UyeEkle(String kullanici_adi, String şifre){
        
        String sorgu = "Insert Into eset (kullanıcı_adı,şifre) VALUES(?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_adi);           
            preparedStatement.setString(2, şifre);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(uyeislemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean girisyap(String kullanici_adi,String şifre){
        
       String sorgu = "Select* From eset where kullanıcı_adı = ? and şifre = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_adi);    //3
            preparedStatement.setString(2, şifre);
            
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(uyeislemleri.class.getName()).log(Level.SEVERE, null, ex);
        return false;
        }
        
        
}

    public uyeislemleri() {

        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi + "?useUnicode=true&characterEncoding=utf8";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException ex) {                  //1

            System.out.println("Driver Bulunamadı...");
        }
        try {
           con = DriverManager.getConnection(url, Database.kullanıcı_adı, Database.şifre);
            System.out.println("Bağlantı Başarılı...");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            ex.printStackTrace();

        }
    }
    

    public static void main(String[] args) {
        uyeislemleri islem = new uyeislemleri();

    }

}
