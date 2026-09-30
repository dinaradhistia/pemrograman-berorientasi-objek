package Tugas;

import java.util.Scanner;

public class Pertemuan02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Latihan 1
        System.out.println("Latihan 1");
        System.out.print("Masukan Tahun (1909 - 2024) : ");
        int tahun = scanner.nextInt();

        if ((tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0)) {
            System.out.println(tahun + " adalah tahun kabisat");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }
       
        //Latihan 2 - Flowchart 1
        System.out.println("\nLatihan 2 - Flowchart 1");
        float panjang = 2;
        float lebar = 5;
        float luas;

        luas = panjang * lebar;

        System.out.println("Luas: " + luas);
        
        //Latihan 2 - Flowchart 2
        System.out.println("\nLatihan 2 - Flowchart 2"); 
        float r, k, l;
        float Pi = 3.14f;

        System.out.print("Masukkan jari-jari: ");
        r = scanner.nextFloat();

        l = Pi * r * r;
        k = 2 * Pi* r;

        System.out.println("Luas: " + l);
        System.out.println("Keliling: " + k);
        
        //Latihan 2 - Flowchart 3
        System.out.println("\nLatihan 2 - Flowchart 3");
        int jam, menit, detik, totdet;

        System.out.print("Masukkan jam: ");
        jam = scanner.nextInt();

        System.out.print("Masukkan menit: ");
        menit = scanner.nextInt();

        System.out.print("Masukkan detik: ");
        detik = scanner.nextInt();

        totdet = jam * 3600 + menit * 60 + detik;

        System.out.println("Total Detik: " + totdet);
        
        scanner.close();
    }
}