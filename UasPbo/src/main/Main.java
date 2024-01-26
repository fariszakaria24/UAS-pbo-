package main;

import model.Kambing;

public class Main {
    public static void main(String[] args) {
        // Membuat objek kambing
        Kambing kambing1 = new Kambing("Kambing A", 20, 50, 70);

        // Menampilkan data awal kambing
        System.out.println("Data awal kambing:");
        displayGoatInfo(kambing1);

        // Simulasi perkembangan kambing setiap bulan
        for (int i = 1; i <= 6; i++) {
            // Simulasi pertambahan berat, tinggi, dan panjang kambing setiap bulan
            double weightIncrease = 2;
            double heightIncrease = 3;
            double lengthIncrease = 4;

            // Memanggil method grow untuk mengupdate perkembangan kambing
            kambing1.berkembang(weightIncrease, heightIncrease, lengthIncrease);

            // Menampilkan perkembangan kambing setelah bulan tertentu
            System.out.println("\nData kambing setelah " + i + " bulan:");
            displayGoatInfo(kambing1);
        }
    }

    // Method untuk menampilkan informasi kambing
    private static void displayGoatInfo(Kambing kambing) {
        System.out.println("Nama: " + kambing.getName());
        System.out.println("Berat: " + kambing.getBerat() + " kg");
        System.out.println("Tinggi: " + kambing.getTinggi() + " cm");
        System.out.println("Panjang: " + kambing.getPanjang() + " cm");
    }
}
