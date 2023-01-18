package uyeprojesi;

public class uye {

    private int id;
    private String kullanici_adi;
    private String şifre;

    public uye(int id, String kullanici_adi, String şifre) {
        this.id = id;                                          //constructor
        this.kullanici_adi = kullanici_adi;
        this.şifre = şifre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }

}
