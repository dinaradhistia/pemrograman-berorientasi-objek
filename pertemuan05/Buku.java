package pertemuan05;

public class Buku {
    String pengarang;
    String judul;
    int tahunTerbit;

    // Constructor tanpa parameter
    public Buku(){
        this.judul = null;
        this.pengarang = null;
        this.tahunTerbit = 0;
    }

    //Constructor dengan parameter lengkap
    public Buku(String judul, String pengarang, int tahunTerbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
        public Buku(String judul, int tahunTerbit, String pengarang){
            this.judul = judul;
            this.pengarang = pengarang;
            this.tahunTerbit = tahunTerbit;
        }
        
        public Buku(int tahunTerbit, String judul, String pengarang){
            this.judul = judul;
            this.pengarang = pengarang;
            this.tahunTerbit = tahunTerbit;
        }
    
    // Constructor dengan parameter judul dan pengarang saja
    public Buku(String judul, String pengarang){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = 0;
    }
    
    //Constructor dengan parameter judul dan tahun terbit saja
    public Buku(String judul, int tahunTerbit){
        this.judul = judul;
        this.pengarang = null;
        this.tahunTerbit = tahunTerbit;
    }
    
    //Constructor dengan parameter tahun terbit dan pengarang saja (tipe data dibalik, jadi int lebih dulu)
    public Buku(int tahunTerbit, String pengarang){
        this.judul = null;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
    //Constructor dengan 1 parameter judul saja
    public Buku(String judul){
        this.judul = judul;
        this.pengarang = null;
        this.tahunTerbit = 0;
    }
    
    //Constructor dengan 1 parameter tahun terbit
    public Buku(int tahunTerbit){
        this.judul = null;
        this.pengarang = null;
        this.tahunTerbit = tahunTerbit;
    }

    // Menampilkan informasi buku
    public void tampilInfo(){
        System.out.println("Judul        : " + judul);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Tahun Terbit : " + (tahunTerbit == 0 ? "-" : tahunTerbit) + "\n");
    }
}