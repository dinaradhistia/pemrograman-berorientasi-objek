package pertemuan05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("----- Tugas 1 -----");
        Buku buku1 = new Buku();
        Buku buku2 = new Buku("Sang Alekmis", "Paulo Coelho", 1988);
        Buku buku3 = new Buku("Maktub", 1994, "Paulo Coelho");
        Buku buku4 = new Buku(1997, "Kitab Suci Kesatria Cahaya", "Paulo Coelho");
        Buku buku5 = new Buku("Laut Bercerita", "Leila S. Chudori");
        Buku buku6 = new Buku("1984", 1949);
        Buku buku7 = new Buku(2016, "Tere Liye");
        Buku buku8 = new Buku("Fihi Ma Fihi");
        Buku buku9 = new Buku(1980);

        buku1.tampilInfo();
        buku2.tampilInfo();
        buku3.tampilInfo();
        buku4.tampilInfo();
        buku5.tampilInfo();
        buku6.tampilInfo();
        buku7.tampilInfo();
        buku8.tampilInfo();
        buku9.tampilInfo();

        System.out.println("----- Tugas 2 -----");
        Mobil mobil1 = new Mobil("Honda", "Civic");   //tahun default 2025
        Mobil mobil2 = new Mobil("Toyota", "Camry", 2022);

        mobil1.cetakData();
        mobil2.cetakData();

        System.out.println("----- Tugas 3 -----");
        System.out.print("Masukkan nilai jari-jari: ");
        double inputJari = input.nextDouble();

        Lingkaran lingkaran = new Lingkaran(inputJari);

        lingkaran.cetakInfo();

        input.close();
    }
}