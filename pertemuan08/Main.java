package pertemuan08;

public class Main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        bd.getLuas();
        bd.getKeliling();
        
        Persegi p = new Persegi();
        System.out.println("Persegi:");
        p.setSisi(4);
        System.out.println("Sisi = " + p.getSisi());
        p.getLuas();
        p.keliling();
        
        Lingkaran l = new Lingkaran();
        System.out.println("\nLingkaran:");
        l.setJari(7);
        System.out.println("Jari-jari = " + l.getJari());
        l.getLuas();
        l.getKeliling();
        
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("\nPersegi Panjang:");
        pp.setPanjang(5);
        pp.setLebar(10);
        System.out.println("Panjang = " + pp.getPanjang());
        System.out.println("Lebar = " + pp.getLebar());
        pp.getLuas();
        pp.getKeliling();
        
        Segitiga s = new Segitiga();
        System.out.println("\nSegitiga:");
        s.setAlas(8);
        s.setTinggi(12);
        System.out.println("Alas = " + s.getAlas());
        System.out.println("Tinggi = " + s.getTinggi());
        s.getLuas();
        s.getKeliling();
    }
}