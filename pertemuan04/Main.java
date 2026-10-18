package pertemuan04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Input merk sepeda
        System.out.print("Masukan Object Merk Sepeda: ");
        String merk = input.nextLine();

        Sepeda sepeda = new Sepeda(merk);
        
        int pilihan;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    sepeda.maju();
                    break;
                case 2:
                    sepeda.mundur();
                    break;
                case 3:
                    sepeda.berhenti();
                    break;
                case 0:
                    System.out.println("Keluar Program...");
                    System.out.println("Terimakasih sudah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    System.out.println("Silahkan coba lagi dan masukkan angka yang benar!");
                    break;
            }
        } while (pilihan != 0);

        input.close();
    }
}