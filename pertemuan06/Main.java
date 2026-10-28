package pertemuan06;

public class Main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        bd.luas();
        bd.keliling();
        
        Persegi p = new Persegi();
        p.sisi = 4;
        p.luas();
        p.keliling();
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 12;
        pp.lebar = 8;
        pp.luas();
        pp.keliling();
        
        Lingkaran l = new Lingkaran();
        l.r = 7;
        l.luas();
        l.keliling();
        
        Segitiga s = new Segitiga();
        s.alas = 5;
        s.tinggi = 10;
        s.luas();
        s.keliling();
    }
}