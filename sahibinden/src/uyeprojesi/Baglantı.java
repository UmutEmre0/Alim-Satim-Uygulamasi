package uyeprojesi;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class Baglantı {

    private String kullanıcı_adı = "root";
    private String şifre = "";

    private String db_ismi = "demo";

    private String host = "localhost";
    private int port = 3306;

    private Connection con = null;
    private Statement statement = null;

    public void uye_ekle() {

        try {
            statement = con.createStatement();
            String kullanıcı_adı = "semih";
            String şifre = "12345";
            String sorgu = "INSERT INTO çalışanlar (kullanıcı_adı,şifre) VALUES (" + "'" + kullanıcı_adı + "'," + "'" + şifre + "')";

            statement.executeLargeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglantı.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eset() {

        String sorgu = "Select * From eset";

        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String kullanıcı_adı = rs.getString("kullanıcı_adı");
                String şifre = rs.getString("şifre");
                System.out.println("id : " + id + "kullanıcı_adı: " + kullanıcı_adı + " şifre: " + şifre);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglantı.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Baglantı() {

        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException ex) {

            System.out.println("Driver Bulunamadı...");
        }
        try {
            con = DriverManager.getConnection(url, kullanıcı_adı, şifre);
            System.out.println("Baglanti Basarili...");
        } catch (SQLException ex) {
            System.out.println("Baglanti Basarisiz...");
            ex.printStackTrace();

        }

    }

    public static void main(String[] args) {
        Baglantı baglantı = new Baglantı();
        baglantı.eset();
    }

}
