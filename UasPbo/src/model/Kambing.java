// Class Goat untuk merepresentasikan objek kambing
package model;

public class Kambing {
    private String name;
    private double berat;
    private double tinggi;
    private double panjang;

    // Constructor untuk inisialisasi objek Goat
    public Kambing(String name, double berat, double tinggi, double panjang) {
        this.name = name;
        this.berat = berat;
        this.tinggi = tinggi;
        this.panjang = panjang;
    }

    // Getter untuk mendapatkan nama kambing
    public String getName() {
        return name;
    }

    // Method untuk mengupdate perkembangan kambing setiap bulan
    public void berkembang(double beratberkembang, double tinggiberkembang, double panjangberkembang) {
        this.berat += beratberkembang;
        this.tinggi += tinggiberkembang;
        this.panjang += panjangberkembang;
    }

    // Getter untuk mendapatkan berat kambing
    public double getBerat() {
        return berat;
    }

    // Getter untuk mendapatkan tinggi kambing
    public double getTinggi() {
        return tinggi;
    }

    // Getter untuk mendapatkan panjang kambing
    public double getPanjang() {
        return panjang;
    }
}
