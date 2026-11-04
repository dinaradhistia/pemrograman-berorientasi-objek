package pertemuan03;

import java.util.Scanner;

public class Kuis1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
            //Kuis Pengolahan Nilai Mahasiswa
            System.out.println("=======================================");
            System.out.println("SISTEM PEBGOLAHAN NILAI MAHASISWA");
            System.out.println("=======================================");
            System.out.print("Masukkan jumlah mahasiswa: ");
            int jumlah = input.nextInt();
            input.nextLine();
            
            String[] npm = new String[jumlah];
            String[] nama = new String[jumlah];
            double[] nilaiTugas = new double[jumlah];
            double[] nilaiUTS = new double[jumlah];
            double[] nilaiUAS = new double[jumlah];
            double[] nilaiAkhir = new double[jumlah];
            char[] nilaiHuruf = new char[jumlah];
            String[] status = new String[jumlah];
            
            for(int i = 0; i < jumlah; i++){
                System.out.println("\nData Mahasiswa ke-" + (i + 1));
                System.out.println("-------------------------------------------");
                System.out.print("Nama         : ");
                nama[i] = input.nextLine();
                System.out.print("NPM          : ");
                npm[i] = input.nextLine();
                
                nilaiTugas[i] = InputNilaiValid(input, "Nilai Tugas     : ");
                nilaiUTS[i] = InputNilaiValid(input, "Nilai UTS       : ");
                nilaiUAS[i] = InputNilaiValid(input, "Nilai UAS       : ");
                input.nextLine();
                
                nilaiAkhir[i] = HitungNilaiAkhir(nilaiTugas[i], nilaiUTS[i], nilaiUAS[i]);
                
                if(nilaiAkhir[i] >= 80){
                    nilaiHuruf[i] = 'A';
                    status[i] = "Lulus";
                } else if(nilaiAkhir[i] >= 70){
                    nilaiHuruf[i] = 'B';
                    status[i] = "Lulus";
                } else if(nilaiAkhir[i] >= 60){
                    nilaiHuruf[i] = 'C';
                    status[i] = "Lulus";
                } else if(nilaiAkhir[i] >= 50){
                    nilaiHuruf[i] = 'D';
                    status[i] = "Tidak Lulus";
                } else{
                nilaiHuruf[i] = 'E';
                status[i] = "Tidak Lulus";
                }
            }
            
            int jumlahLulus = 0;
            int jumlahTidakLulus = 0;
            double nilaiTertinggi = nilaiAkhir[0];
            double nilaiTerendah = nilaiAkhir[0];
            double totalNilaiKelas = 0;
            
            for(int i = 0; i < jumlah; i++){
                totalNilaiKelas += nilaiAkhir[i];
                
                if(status[i].equals("Lulus")){
                    jumlahLulus++;
                } else{
                    jumlahTidakLulus++;
                }
                
                if(nilaiAkhir[i] > nilaiTertinggi){
                    nilaiTertinggi = nilaiAkhir[i];
                }
                
                if(nilaiAkhir[i] < nilaiTerendah){
                    nilaiTerendah = nilaiAkhir[i];
                }
            }
            
            double rataKelas = totalNilaiKelas / jumlah;

                System.out.println("\n=========================================================================");
                System.out.println("                        DAFTAR NILAI MAHASISWA                           ");
                System.out.println("=========================================================================");
                System.out.println("No\tNPM\t\tNama\tTugas\tUTS\tUAS\tAkhir\tHuruf\tStatus");
                System.out.println("-------------------------------------------------------------------------");

                for (int i = 0; i < jumlah; i++) {
                    System.out.println((i + 1) + "\t" + 
                                       npm[i] + "\t" + 
                                       nama[i] + "\t" + 
                                       nilaiTugas[i] + "\t" + 
                                       nilaiUTS[i] + "\t" + 
                                       nilaiUAS[i] + "\t" + 
                                       nilaiAkhir[i] + "\t" + 
                                       nilaiHuruf[i] + "\t" + 
                                       status[i]);
                }
                System.out.println("=========================================================================");

                System.out.println("\nSTATISTIK NILAI");
                System.out.println("-----------------------------------------");
                System.out.println("Jumlah Mahasiswa       : " + jumlah);
                System.out.println("Jumlah Mahasiswa Lulus : " + jumlahLulus);
                System.out.println("Jumlah Tidak Lulus     : " + jumlahTidakLulus);
                System.out.println("Nilai Tertinggi        : " + nilaiTertinggi);
                System.out.println("Nilai Terendah         : " + nilaiTerendah);
                System.out.println("Rata-rata Kelas        : " + rataKelas);
                System.out.println("=========================================");

            input.close();
        }
        
        static double HitungNilaiAkhir(double tugas, double uts, double uas){
            return (0.30 * tugas) + (0.30 * uts) + (0.40 * uas);
        }
        
        static double InputNilaiValid(Scanner input, String pesan){
            double nilai;
            while(true){
                System.out.print(pesan);
                nilai = input.nextDouble();
                if(nilai >= 0 && nilai <= 100){
                    break;
                }
                System.out.println(" Nilai tidak valid! Masukkan nilai antara 0-100.");
            }
            return nilai;
    }
}